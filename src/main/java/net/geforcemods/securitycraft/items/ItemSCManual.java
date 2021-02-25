package net.geforcemods.securitycraft.items;

import java.util.ArrayList;
import java.util.List;

import net.geforcemods.securitycraft.gui.GuiSCManual;
import net.geforcemods.securitycraft.misc.SCManualPage;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class ItemSCManual extends Item {

	public static final List<SCManualPage> PAGES = new ArrayList<>();

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
		if(world.isRemote)
			FMLCommonHandler.instance().showGuiScreen(new GuiSCManual());

		return ActionResult.newResult(EnumActionResult.PASS, player.getHeldItem(hand));
	}

	@Override
	public void onUpdate(ItemStack par1ItemStack, World world, Entity entity, int slotIndex, boolean isSelected){
		if(par1ItemStack.getTagCompound() == null){
			NBTTagList bookPages = new NBTTagList();

			par1ItemStack.setTagInfo("pages", bookPages);
			par1ItemStack.setTagInfo("author", new NBTTagString("Geforce"));
			par1ItemStack.setTagInfo("title", new NBTTagString("SecurityCraft"));
		}
	}

}
