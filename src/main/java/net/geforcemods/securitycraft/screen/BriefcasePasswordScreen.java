package net.geforcemods.securitycraft.screen;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;

import net.geforcemods.securitycraft.SCContent;
import net.geforcemods.securitycraft.SecurityCraft;
import net.geforcemods.securitycraft.containers.GenericContainer;
import net.geforcemods.securitycraft.network.server.OpenBriefcaseGui;
import net.geforcemods.securitycraft.screen.components.IdButton;
import net.geforcemods.securitycraft.util.PlayerUtils;
import net.geforcemods.securitycraft.util.Utils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class BriefcasePasswordScreen extends ContainerScreen<GenericContainer> {
	public static final String UP_ARROW = "\u2191";
	public static final String DOWN_ARROW = "\u2193";
	private static final ResourceLocation TEXTURE = new ResourceLocation("securitycraft:textures/gui/container/blank.png");
	private final TranslationTextComponent enterPasscode = Utils.localize("gui.securitycraft:briefcase.enterPasscode");
	private Button[] keycodeTopButtons = new Button[4];
	private Button[] keycodeBottomButtons = new Button[4];
	private TextFieldWidget[] keycodeTextboxes = new TextFieldWidget[4];
	private IdButton continueButton;
	private int[] digits = {
			0, 0, 0, 0
	};

	public BriefcasePasswordScreen(GenericContainer container, PlayerInventory inv, ITextComponent text) {
		super(container, inv, text);
	}

	@Override
	public void init() {
		super.init();

		for (int i = 0; i < keycodeTopButtons.length; i++) {
			addButton(keycodeTopButtons[i] = new IdButton(i, width / 2 - 40 + (i * 20), height / 2 - 52, 20, 20, UP_ARROW, this::actionPerformed));
		}

		for (int i = 0; i < keycodeBottomButtons.length; i++) {
			addButton(keycodeBottomButtons[i] = new IdButton(4 + i, width / 2 - 40 + (i * 20), height / 2, 20, 20, DOWN_ARROW, this::actionPerformed));
		}

		addButton(continueButton = new IdButton(8, (width / 2 + 42), height / 2 - 26, 20, 20, ">", this::actionPerformed));

		for (int i = 0; i < keycodeTextboxes.length; i++) {
			//text boxes are not added via addButton because they should not be selectable
			keycodeTextboxes[i] = new TextFieldWidget(font, (width / 2 - 37) + (i * 20), height / 2 - 22, 14, 12, StringTextComponent.EMPTY);
			keycodeTextboxes[i].setMaxStringLength(1);
			keycodeTextboxes[i].setText("0");
		}
	}

	@Override
	public void render(MatrixStack matrix, int mouseX, int mouseY, float partialTicks) {
		super.render(matrix, mouseX, mouseY, partialTicks);
		RenderSystem.disableLighting();

		for (TextFieldWidget textfield : keycodeTextboxes) {
			textfield.render(matrix, mouseX, mouseY, partialTicks);
		}
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack matrix, int mouseX, int mouseY) {
		font.drawText(matrix, enterPasscode, xSize / 2 - font.getStringPropertyWidth(enterPasscode) / 2, 6, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack matrix, float partialTicks, int mouseX, int mouseY) {
		renderBackground(matrix);
		RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
		minecraft.getTextureManager().bindTexture(TEXTURE);
		int startX = (width - xSize) / 2;
		int startY = (height - ySize) / 2;
		this.blit(matrix, startX, startY, 0, 0, xSize, ySize);
	}

	protected void actionPerformed(IdButton button) {
		if (button.id == continueButton.id) {
			if (PlayerUtils.isHoldingItem(Minecraft.getInstance().player, SCContent.BRIEFCASE, null)) {
				CompoundNBT nbt = PlayerUtils.getSelectedItemStack(Minecraft.getInstance().player, SCContent.BRIEFCASE.get()).getTag();
				String code = digits[0] + "" + digits[1] + "" + digits[2] + "" + digits[3];

				if (nbt.getString("passcode").equals(code)) {
					if (!nbt.contains("owner")) {
						nbt.putString("owner", Minecraft.getInstance().player.getName().getString());
						nbt.putString("ownerUUID", Minecraft.getInstance().player.getUniqueID().toString());
					}

					SecurityCraft.channel.sendToServer(new OpenBriefcaseGui(SCContent.cTypeBriefcaseInventory.getRegistryName(), getTitle()));
				}
			}
		}
		else {
			int index = button.id % 4;

			//java's modulo operator % does not handle negative numbers like it should for some reason, so floorMod needs to be used
			digits[index] = Math.floorMod((button.id > 3 ? --digits[index] : ++digits[index]), 10);
			keycodeTextboxes[index].setText(String.valueOf(digits[index]));
		}
	}
}
