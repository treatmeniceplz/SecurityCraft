package net.geforcemods.securitycraft.datagen;

import net.geforcemods.securitycraft.SCContent;
import net.geforcemods.securitycraft.SCTags;
import net.geforcemods.securitycraft.SecurityCraft;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedSlabBlock;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedStairsBlock;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedWallBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.RegistryObject;

public class BlockTagGenerator extends BlockTagsProvider {
	protected BlockTagGenerator(DataGenerator dataGenerator, ExistingFileHelper existingFileHelper) {
		super(dataGenerator, SecurityCraft.MODID, existingFileHelper);
	}

	@Override
	protected void registerTags() {
		//@formatter:off
		//securitycraft tags
		getOrCreateBuilder(SCTags.Blocks.REINFORCED_ACACIA_LOGS).add(
				SCContent.REINFORCED_ACACIA_LOG.get(),
				SCContent.REINFORCED_ACACIA_WOOD.get(),
				SCContent.REINFORCED_STRIPPED_ACACIA_LOG.get(),
				SCContent.REINFORCED_STRIPPED_ACACIA_WOOD.get());
		getOrCreateBuilder(SCTags.Blocks.REINFORCED_BIRCH_LOGS).add(
				SCContent.REINFORCED_BIRCH_LOG.get(),
				SCContent.REINFORCED_BIRCH_WOOD.get(),
				SCContent.REINFORCED_STRIPPED_BIRCH_LOG.get(),
				SCContent.REINFORCED_STRIPPED_BIRCH_WOOD.get());
		getOrCreateBuilder(SCTags.Blocks.REINFORCED_BUTTONS).add(
				SCContent.REINFORCED_STONE_BUTTON.get(),
				SCContent.REINFORCED_OAK_BUTTON.get(),
				SCContent.REINFORCED_SPRUCE_BUTTON.get(),
				SCContent.REINFORCED_BIRCH_BUTTON.get(),
				SCContent.REINFORCED_JUNGLE_BUTTON.get(),
				SCContent.REINFORCED_ACACIA_BUTTON.get(),
				SCContent.REINFORCED_DARK_OAK_BUTTON.get(),
				SCContent.REINFORCED_CRIMSON_BUTTON.get(),
				SCContent.REINFORCED_WARPED_BUTTON.get(),
				SCContent.REINFORCED_POLISHED_BLACKSTONE_BUTTON.get());
		getOrCreateBuilder(SCTags.Blocks.REINFORCED_CARPETS).add(
				SCContent.REINFORCED_WHITE_CARPET.get(),
				SCContent.REINFORCED_ORANGE_CARPET.get(),
				SCContent.REINFORCED_MAGENTA_CARPET.get(),
				SCContent.REINFORCED_LIGHT_BLUE_CARPET.get(),
				SCContent.REINFORCED_YELLOW_CARPET.get(),
				SCContent.REINFORCED_LIME_CARPET.get(),
				SCContent.REINFORCED_PINK_CARPET.get(),
				SCContent.REINFORCED_GRAY_CARPET.get(),
				SCContent.REINFORCED_LIGHT_GRAY_CARPET.get(),
				SCContent.REINFORCED_CYAN_CARPET.get(),
				SCContent.REINFORCED_PURPLE_CARPET.get(),
				SCContent.REINFORCED_BLUE_CARPET.get(),
				SCContent.REINFORCED_BROWN_CARPET.get(),
				SCContent.REINFORCED_GREEN_CARPET.get(),
				SCContent.REINFORCED_RED_CARPET.get(),
				SCContent.REINFORCED_BLACK_CARPET.get());
		getOrCreateBuilder(SCTags.Blocks.REINFORCED_COBBLESTONE).add(
				SCContent.REINFORCED_COBBLESTONE.get(),
				SCContent.REINFORCED_MOSSY_COBBLESTONE.get());
		getOrCreateBuilder(SCTags.Blocks.REINFORCED_CRIMSON_STEMS).add(
				SCContent.REINFORCED_CRIMSON_STEM.get(),
				SCContent.REINFORCED_CRIMSON_HYPHAE.get(),
				SCContent.REINFORCED_STRIPPED_CRIMSON_STEM.get(),
				SCContent.REINFORCED_STRIPPED_CRIMSON_HYPHAE.get());
		getOrCreateBuilder(SCTags.Blocks.REINFORCED_DARK_OAK_LOGS).add(
				SCContent.REINFORCED_DARK_OAK_LOG.get(),
				SCContent.REINFORCED_DARK_OAK_WOOD.get(),
				SCContent.REINFORCED_STRIPPED_DARK_OAK_LOG.get(),
				SCContent.REINFORCED_STRIPPED_DARK_OAK_WOOD.get());
		getOrCreateBuilder(SCTags.Blocks.REINFORCED_DIRT).add(
				SCContent.REINFORCED_GRASS_BLOCK.get(),
				SCContent.REINFORCED_DIRT.get(),
				SCContent.REINFORCED_COARSE_DIRT.get(),
				SCContent.REINFORCED_PODZOL.get(),
				SCContent.REINFORCED_MYCELIUM.get());
		getOrCreateBuilder(SCTags.Blocks.REINFORCED_END_STONES).add(
				SCContent.REINFORCED_END_STONE.get());
		getOrCreateBuilder(SCTags.Blocks.REINFORCED_ICE).add(
				SCContent.REINFORCED_ICE.get(),
				SCContent.REINFORCED_PACKED_ICE.get(),
				SCContent.REINFORCED_BLUE_ICE.get());
		getOrCreateBuilder(SCTags.Blocks.REINFORCED_JUNGLE_LOGS).add(
				SCContent.REINFORCED_JUNGLE_LOG.get(),
				SCContent.REINFORCED_JUNGLE_WOOD.get(),
				SCContent.REINFORCED_STRIPPED_JUNGLE_LOG.get(),
				SCContent.REINFORCED_STRIPPED_JUNGLE_WOOD.get());
		getOrCreateBuilder(SCTags.Blocks.REINFORCED_LOGS)
		.addTag(SCTags.Blocks.REINFORCED_ACACIA_LOGS)
		.addTag(SCTags.Blocks.REINFORCED_BIRCH_LOGS)
		.addTag(SCTags.Blocks.REINFORCED_CRIMSON_STEMS)
		.addTag(SCTags.Blocks.REINFORCED_DARK_OAK_LOGS)
		.addTag(SCTags.Blocks.REINFORCED_JUNGLE_LOGS)
		.addTag(SCTags.Blocks.REINFORCED_OAK_LOGS)
		.addTag(SCTags.Blocks.REINFORCED_SPRUCE_LOGS)
		.addTag(SCTags.Blocks.REINFORCED_SPRUCE_LOGS)
		.addTag(SCTags.Blocks.REINFORCED_WARPED_STEMS);
		getOrCreateBuilder(SCTags.Blocks.REINFORCED_NYLIUM).add(
				SCContent.REINFORCED_CRIMSON_NYLIUM.get(),
				SCContent.REINFORCED_WARPED_NYLIUM.get());
		getOrCreateBuilder(SCTags.Blocks.REINFORCED_OAK_LOGS).add(
				SCContent.REINFORCED_OAK_LOG.get(),
				SCContent.REINFORCED_OAK_WOOD.get(),
				SCContent.REINFORCED_STRIPPED_OAK_LOG.get(),
				SCContent.REINFORCED_STRIPPED_OAK_WOOD.get());
		getOrCreateBuilder(SCTags.Blocks.REINFORCED_PLANKS).add(
				SCContent.REINFORCED_ACACIA_PLANKS.get(),
				SCContent.REINFORCED_BIRCH_PLANKS.get(),
				SCContent.REINFORCED_CRIMSON_PLANKS.get(),
				SCContent.REINFORCED_DARK_OAK_PLANKS.get(),
				SCContent.REINFORCED_JUNGLE_PLANKS.get(),
				SCContent.REINFORCED_OAK_PLANKS.get(),
				SCContent.REINFORCED_SPRUCE_PLANKS.get(),
				SCContent.REINFORCED_WARPED_PLANKS.get());
		getOrCreateBuilder(SCTags.Blocks.REINFORCED_PRESSURE_PLATES).add(
				SCContent.REINFORCED_OAK_PRESSURE_PLATE.get(),
				SCContent.REINFORCED_SPRUCE_PRESSURE_PLATE.get(),
				SCContent.REINFORCED_BIRCH_PRESSURE_PLATE.get(),
				SCContent.REINFORCED_JUNGLE_PRESSURE_PLATE.get(),
				SCContent.REINFORCED_ACACIA_PRESSURE_PLATE.get(),
				SCContent.REINFORCED_DARK_OAK_PRESSURE_PLATE.get(),
				SCContent.REINFORCED_CRIMSON_PRESSURE_PLATE.get(),
				SCContent.REINFORCED_WARPED_PRESSURE_PLATE.get(),
				SCContent.REINFORCED_POLISHED_BLACKSTONE_PRESSURE_PLATE.get());
		getOrCreateBuilder(SCTags.Blocks.REINFORCED_SAND).add(
				SCContent.REINFORCED_RED_SAND.get(),
				SCContent.REINFORCED_SAND.get());
		getOrCreateBuilder(SCTags.Blocks.REINFORCED_SLABS).addTag(SCTags.Blocks.REINFORCED_WOODEN_SLABS);
		getOrCreateBuilder(SCTags.Blocks.REINFORCED_SPRUCE_LOGS).add(
				SCContent.REINFORCED_SPRUCE_LOG.get(),
				SCContent.REINFORCED_SPRUCE_WOOD.get(),
				SCContent.REINFORCED_STRIPPED_SPRUCE_LOG.get(),
				SCContent.REINFORCED_STRIPPED_SPRUCE_WOOD.get());
		getOrCreateBuilder(SCTags.Blocks.REINFORCED_STAIRS).addTag(SCTags.Blocks.REINFORCED_WOODEN_STAIRS);
		getOrCreateBuilder(SCTags.Blocks.REINFORCED_STONE_BRICKS).add(
				SCContent.REINFORCED_STONE_BRICKS.get(),
				SCContent.REINFORCED_MOSSY_STONE_BRICKS.get(),
				SCContent.REINFORCED_CRACKED_STONE_BRICKS.get(),
				SCContent.REINFORCED_CHISELED_STONE_BRICKS.get());
		getOrCreateBuilder(SCTags.Blocks.REINFORCED_WARPED_STEMS).add(
				SCContent.REINFORCED_WARPED_STEM.get(),
				SCContent.REINFORCED_WARPED_HYPHAE.get(),
				SCContent.REINFORCED_STRIPPED_WARPED_STEM.get(),
				SCContent.REINFORCED_STRIPPED_WARPED_HYPHAE.get());
		getOrCreateBuilder(SCTags.Blocks.REINFORCED_WOODEN_SLABS).add(
				SCContent.REINFORCED_OAK_SLAB.get(),
				SCContent.REINFORCED_SPRUCE_SLAB.get(),
				SCContent.REINFORCED_BIRCH_SLAB.get(),
				SCContent.REINFORCED_JUNGLE_SLAB.get(),
				SCContent.REINFORCED_ACACIA_SLAB.get(),
				SCContent.REINFORCED_DARK_OAK_SLAB.get(),
				SCContent.REINFORCED_CRIMSON_SLAB.get(),
				SCContent.REINFORCED_WARPED_SLAB.get());
		getOrCreateBuilder(SCTags.Blocks.REINFORCED_WOODEN_STAIRS).add(
				SCContent.REINFORCED_OAK_STAIRS.get(),
				SCContent.REINFORCED_SPRUCE_STAIRS.get(),
				SCContent.REINFORCED_BIRCH_STAIRS.get(),
				SCContent.REINFORCED_JUNGLE_STAIRS.get(),
				SCContent.REINFORCED_ACACIA_STAIRS.get(),
				SCContent.REINFORCED_DARK_OAK_STAIRS.get(),
				SCContent.REINFORCED_CRIMSON_STAIRS.get(),
				SCContent.REINFORCED_WARPED_STAIRS.get());
		getOrCreateBuilder(SCTags.Blocks.REINFORCED_WOOL).add(
				SCContent.REINFORCED_WHITE_WOOL.get(),
				SCContent.REINFORCED_ORANGE_WOOL.get(),
				SCContent.REINFORCED_MAGENTA_WOOL.get(),
				SCContent.REINFORCED_LIGHT_BLUE_WOOL.get(),
				SCContent.REINFORCED_YELLOW_WOOL.get(),
				SCContent.REINFORCED_LIME_WOOL.get(),
				SCContent.REINFORCED_PINK_WOOL.get(),
				SCContent.REINFORCED_GRAY_WOOL.get(),
				SCContent.REINFORCED_LIGHT_GRAY_WOOL.get(),
				SCContent.REINFORCED_CYAN_WOOL.get(),
				SCContent.REINFORCED_PURPLE_WOOL.get(),
				SCContent.REINFORCED_BLUE_WOOL.get(),
				SCContent.REINFORCED_BROWN_WOOL.get(),
				SCContent.REINFORCED_GREEN_WOOL.get(),
				SCContent.REINFORCED_RED_WOOL.get(),
				SCContent.REINFORCED_BLACK_WOOL.get());
		getOrCreateBuilder(SCTags.Blocks.SECRET_SIGNS).addTag(SCTags.Blocks.SECRET_STANDING_SIGNS).addTag(SCTags.Blocks.SECRET_WALL_SIGNS);
		getOrCreateBuilder(SCTags.Blocks.SECRET_STANDING_SIGNS).add(
				SCContent.SECRET_ACACIA_SIGN.get(),
				SCContent.SECRET_BIRCH_SIGN.get(),
				SCContent.SECRET_CRIMSON_SIGN.get(),
				SCContent.SECRET_DARK_OAK_SIGN.get(),
				SCContent.SECRET_JUNGLE_SIGN.get(),
				SCContent.SECRET_OAK_SIGN.get(),
				SCContent.SECRET_SPRUCE_SIGN.get(),
				SCContent.SECRET_WARPED_SIGN.get());
		getOrCreateBuilder(SCTags.Blocks.SECRET_WALL_SIGNS).add(
				SCContent.SECRET_ACACIA_WALL_SIGN.get(),
				SCContent.SECRET_BIRCH_WALL_SIGN.get(),
				SCContent.SECRET_CRIMSON_WALL_SIGN.get(),
				SCContent.SECRET_DARK_OAK_WALL_SIGN.get(),
				SCContent.SECRET_JUNGLE_WALL_SIGN.get(),
				SCContent.SECRET_OAK_WALL_SIGN.get(),
				SCContent.SECRET_SPRUCE_WALL_SIGN.get(),
				SCContent.SECRET_WARPED_WALL_SIGN.get());
		getOrCreateBuilder(SCTags.Blocks.REINFORCED_STONE).add(
				SCContent.REINFORCED_ANDESITE.get(),
				SCContent.REINFORCED_DIORITE.get(),
				SCContent.REINFORCED_GRANITE.get(),
				SCContent.REINFORCED_STONE.get(),
				SCContent.REINFORCED_POLISHED_ANDESITE.get(),
				SCContent.REINFORCED_POLISHED_DIORITE.get(),
				SCContent.REINFORCED_POLISHED_GRANITE.get());

		//forge tags
		getOrCreateBuilder(Tags.Blocks.DIRT).addTag(SCTags.Blocks.REINFORCED_DIRT);

		//minecraft tags
		getOrCreateBuilder(BlockTags.BAMBOO_PLANTABLE_ON).addTag(SCTags.Blocks.REINFORCED_SAND).add(SCContent.REINFORCED_GRAVEL.get(),
				SCContent.REINFORCED_DIRT.get(),
				SCContent.REINFORCED_GRASS_BLOCK.get(),
				SCContent.REINFORCED_PODZOL.get(),
				SCContent.REINFORCED_COARSE_DIRT.get(),
				SCContent.REINFORCED_MYCELIUM.get());
		getOrCreateBuilder(BlockTags.BEACON_BASE_BLOCKS).add(
				SCContent.REINFORCED_DIAMOND_BLOCK.get(),
				SCContent.REINFORCED_EMERALD_BLOCK.get(),
				SCContent.REINFORCED_GOLD_BLOCK.get(),
				SCContent.REINFORCED_IRON_BLOCK.get(),
				SCContent.REINFORCED_NETHERITE_BLOCK.get());
		getOrCreateBuilder(BlockTags.CARPETS).addTag(SCTags.Blocks.REINFORCED_CARPETS);
		getOrCreateBuilder(BlockTags.DOORS).add(SCContent.KEYPAD_DOOR.get(), SCContent.REINFORCED_DOOR.get(), SCContent.SCANNER_DOOR.get());
		getOrCreateBuilder(BlockTags.FENCES).add(SCContent.IRON_FENCE.get());
		getOrCreateBuilder(BlockTags.GUARDED_BY_PIGLINS).add(
				SCContent.GILDED_BLACKSTONE_MINE.get(),
				SCContent.GOLD_ORE_MINE.get(),
				SCContent.NETHER_GOLD_ORE_MINE.get(),
				SCContent.REINFORCED_GOLD_BLOCK.get());
		getOrCreateBuilder(BlockTags.IMPERMEABLE).add(
				SCContent.REINFORCED_GLASS.get(),
				SCContent.REINFORCED_WHITE_STAINED_GLASS.get(),
				SCContent.REINFORCED_ORANGE_STAINED_GLASS.get(),
				SCContent.REINFORCED_MAGENTA_STAINED_GLASS.get(),
				SCContent.REINFORCED_LIGHT_BLUE_STAINED_GLASS.get(),
				SCContent.REINFORCED_YELLOW_STAINED_GLASS.get(),
				SCContent.REINFORCED_LIME_STAINED_GLASS.get(),
				SCContent.REINFORCED_PINK_STAINED_GLASS.get(),
				SCContent.REINFORCED_GRAY_STAINED_GLASS.get(),
				SCContent.REINFORCED_LIGHT_GRAY_STAINED_GLASS.get(),
				SCContent.REINFORCED_CYAN_STAINED_GLASS.get(),
				SCContent.REINFORCED_PURPLE_STAINED_GLASS.get(),
				SCContent.REINFORCED_BLUE_STAINED_GLASS.get(),
				SCContent.REINFORCED_BROWN_STAINED_GLASS.get(),
				SCContent.REINFORCED_GREEN_STAINED_GLASS.get(),
				SCContent.REINFORCED_RED_STAINED_GLASS.get(),
				SCContent.REINFORCED_BLACK_STAINED_GLASS.get());
		getOrCreateBuilder(BlockTags.INFINIBURN_OVERWORLD).add(SCContent.REINFORCED_NETHERRACK.get());
		getOrCreateBuilder(BlockTags.MUSHROOM_GROW_BLOCK).add(
				SCContent.REINFORCED_MYCELIUM.get(),
				SCContent.REINFORCED_PODZOL.get(),
				SCContent.REINFORCED_CRIMSON_NYLIUM.get(),
				SCContent.REINFORCED_WARPED_NYLIUM.get());
		getOrCreateBuilder(BlockTags.NYLIUM).addTag(SCTags.Blocks.REINFORCED_NYLIUM);
		getOrCreateBuilder(BlockTags.PIGLIN_REPELLENTS).add(SCContent.REINFORCED_SOUL_LANTERN.get());
		getOrCreateBuilder(BlockTags.PRESSURE_PLATES).addTag(SCTags.Blocks.REINFORCED_PRESSURE_PLATES);
		getOrCreateBuilder(BlockTags.RAILS).add(SCContent.TRACK_MINE.get());
		getOrCreateBuilder(BlockTags.SLABS).addTag(SCTags.Blocks.REINFORCED_SLABS).add(SCContent.CRYSTAL_QUARTZ_SLAB.get());
		getOrCreateBuilder(BlockTags.STAIRS).addTag(SCTags.Blocks.REINFORCED_STAIRS).add(SCContent.STAIRS_CRYSTAL_QUARTZ.get());
		getOrCreateBuilder(BlockTags.STRIDER_WARM_BLOCKS).add(SCContent.FAKE_LAVA_BLOCK.get());
		getOrCreateBuilder(BlockTags.SIGNS).addTag(SCTags.Blocks.SECRET_SIGNS);
		getOrCreateBuilder(BlockTags.SOUL_FIRE_BASE_BLOCKS).add(SCContent.REINFORCED_SOUL_SOIL.get());
		getOrCreateBuilder(BlockTags.SOUL_SPEED_BLOCKS).add(SCContent.REINFORCED_SOUL_SOIL.get());
		getOrCreateBuilder(BlockTags.STANDING_SIGNS).addTag(SCTags.Blocks.SECRET_STANDING_SIGNS);
		getOrCreateBuilder(BlockTags.TRAPDOORS).add(SCContent.REINFORCED_IRON_TRAPDOOR.get());
		getOrCreateBuilder(BlockTags.WALL_SIGNS).addTag(SCTags.Blocks.SECRET_WALL_SIGNS);
		getOrCreateBuilder(BlockTags.WALLS).add(
				SCContent.REINFORCED_COBBLESTONE_WALL.get(),
				SCContent.REINFORCED_MOSSY_COBBLESTONE_WALL.get(),
				SCContent.REINFORCED_BRICK_WALL.get(),
				SCContent.REINFORCED_PRISMARINE_WALL.get(),
				SCContent.REINFORCED_RED_SANDSTONE_WALL.get(),
				SCContent.REINFORCED_MOSSY_STONE_BRICK_WALL.get(),
				SCContent.REINFORCED_GRANITE_WALL.get(),
				SCContent.REINFORCED_STONE_BRICK_WALL.get(),
				SCContent.REINFORCED_NETHER_BRICK_WALL.get(),
				SCContent.REINFORCED_ANDESITE_WALL.get(),
				SCContent.REINFORCED_RED_NETHER_BRICK_WALL.get(),
				SCContent.REINFORCED_SANDSTONE_WALL.get(),
				SCContent.REINFORCED_END_STONE_BRICK_WALL.get(),
				SCContent.REINFORCED_DIORITE_WALL.get(),
				SCContent.REINFORCED_BLACKSTONE_WALL.get(),
				SCContent.REINFORCED_POLISHED_BLACKSTONE_WALL.get(),
				SCContent.REINFORCED_POLISHED_BLACKSTONE_BRICK_WALL.get());
		getOrCreateBuilder(BlockTags.WITHER_SUMMON_BASE_BLOCKS).add(SCContent.REINFORCED_SOUL_SOIL.get());
		//@formatter:on

		//automatic
		Builder<Block> dragonImmune = getOrCreateBuilder(BlockTags.DRAGON_IMMUNE);
		Builder<Block> witherImmune = getOrCreateBuilder(BlockTags.WITHER_IMMUNE);

		for (RegistryObject<Block> ro : SCContent.BLOCKS.getEntries()) {
			Block block = ro.get();

			if (block != SCContent.CHISELED_CRYSTAL_QUARTZ.get() && block != SCContent.CRYSTAL_QUARTZ.get() && block != SCContent.CRYSTAL_QUARTZ_PILLAR.get() && block != SCContent.CRYSTAL_QUARTZ_SLAB.get() && block != SCContent.STAIRS_CRYSTAL_QUARTZ.get()) {
				dragonImmune.add(block);
				witherImmune.add(block);
			}

			//ugly way of checking if slabs/stairs are wood. they do not need to be added to the tag explicitly, as they are already present in the wooden equivalent tag
			if (block instanceof ReinforcedSlabBlock && block.getSoundType(block.getDefaultState()) != SoundType.WOOD)
				getOrCreateBuilder(SCTags.Blocks.REINFORCED_SLABS).add(block);
			else if (block instanceof ReinforcedStairsBlock && block.getSoundType(block.getDefaultState()) != SoundType.WOOD)
				getOrCreateBuilder(SCTags.Blocks.REINFORCED_STAIRS).add(block);
			else if (block instanceof ReinforcedWallBlock)
				getOrCreateBuilder(BlockTags.WALLS).add(block);
		}
	}

	@Override
	public String getName() {
		return "SecurityCraft Block Tags";
	}
}
