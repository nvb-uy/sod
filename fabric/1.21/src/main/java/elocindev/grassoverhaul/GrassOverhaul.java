package elocindev.grassoverhaul;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GrassOverhaul implements ModInitializer {
	public static final String MODID = "grassoverhaul";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		GOBlocks.init();
		
		ItemGroupEvents.modifyEntriesEvent(RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of("natural_blocks"))).register(content -> {
			content.addAfter(Items.GRASS_BLOCK, GOBlocks.GRASS_SOD_BLOCK);
			content.addAfter(GOBlocks.GRASS_SOD_BLOCK, GOBlocks.GRASS_SOD_STAIRS);
			content.addAfter(GOBlocks.GRASS_SOD_STAIRS, GOBlocks.GRASS_SOD_SLAB);
			content.addAfter(GOBlocks.GRASS_SOD_SLAB, GOBlocks.GRASS_SOD_PATCH);

			content.addAfter(Items.DIRT, GOBlocks.DIRT_SOD_STAIRS);
			content.addAfter(GOBlocks.DIRT_SOD_STAIRS, GOBlocks.DIRT_SOD_SLAB);
			content.addAfter(GOBlocks.DIRT_SOD_SLAB, GOBlocks.DIRT_SOD_PATCH);

			content.addAfter(Items.MYCELIUM, GOBlocks.MYCELIUM_SOD_BLOCK);
			content.addAfter(GOBlocks.MYCELIUM_SOD_BLOCK, GOBlocks.MYCELIUM_SOD_STAIRS);
			content.addAfter(GOBlocks.MYCELIUM_SOD_STAIRS, GOBlocks.MYCELIUM_SOD_SLAB);
			content.addAfter(GOBlocks.MYCELIUM_SOD_SLAB, GOBlocks.MYCELIUM_SOD_PATCH);

			content.addAfter(Items.PODZOL, GOBlocks.PODZOL_SOD_BLOCK);
			content.addAfter(GOBlocks.PODZOL_SOD_BLOCK, GOBlocks.PODZOL_SOD_STAIRS);
			content.addAfter(GOBlocks.PODZOL_SOD_STAIRS, GOBlocks.PODZOL_SOD_SLAB);
			content.addAfter(GOBlocks.PODZOL_SOD_SLAB, GOBlocks.PODZOL_SOD_PATCH);

			content.addAfter(Items.DIRT_PATH, GOBlocks.PATH_SOD_BLOCK);
			content.addAfter(GOBlocks.PATH_SOD_BLOCK, GOBlocks.PATH_SOD_STAIRS);
			content.addAfter(GOBlocks.PATH_SOD_STAIRS, GOBlocks.PATH_SOD_SLAB);
			content.addAfter(GOBlocks.PATH_SOD_SLAB, GOBlocks.PATH_SOD_PATCH);

			content.addAfter(Items.CRIMSON_NYLIUM, GOBlocks.CRIMSON_NYLIUM_SOD_BLOCK);
			content.addAfter(GOBlocks.CRIMSON_NYLIUM_SOD_BLOCK, GOBlocks.CRIMSON_NYLIUM_SOD_STAIRS);
			content.addAfter(GOBlocks.CRIMSON_NYLIUM_SOD_STAIRS, GOBlocks.CRIMSON_NYLIUM_SOD_SLAB);
			content.addAfter(GOBlocks.CRIMSON_NYLIUM_SOD_SLAB, GOBlocks.CRIMSON_NYLIUM_SOD_PATCH);

			content.addAfter(Items.WARPED_NYLIUM, GOBlocks.WARPED_NYLIUM_SOD_BLOCK);
			content.addAfter(GOBlocks.WARPED_NYLIUM_SOD_BLOCK, GOBlocks.WARPED_NYLIUM_SOD_STAIRS);
			content.addAfter(GOBlocks.WARPED_NYLIUM_SOD_STAIRS, GOBlocks.WARPED_NYLIUM_SOD_SLAB);
			content.addAfter(GOBlocks.WARPED_NYLIUM_SOD_SLAB, GOBlocks.WARPED_NYLIUM_SOD_PATCH);
		
		});
		
	}
}

