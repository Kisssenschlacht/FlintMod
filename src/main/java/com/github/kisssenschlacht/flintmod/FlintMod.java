package com.github.kisssenschlacht.flintmod;

import com.github.kisssenschlacht.flintmod.block.ModBlocks;
import com.github.kisssenschlacht.flintmod.item.ModItemGroups;
import com.github.kisssenschlacht.flintmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlintMod implements ModInitializer {
	public static final String MOD_ID = "flintmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModItemGroups.registerItemGroups();
	}
}