package net.petemc.zombifiedplayeraccessories;

import net.fabricmc.api.ModInitializer;

import net.petemc.zombifiedplayeraccessories.util.ModCompatibility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ZombifiedPlayerAccessories implements ModInitializer {
	public static final String MOD_ID = "zombifiedplayeraccessories";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Mod for Zombified Player Accessories Compatibility");
		ModCompatibility.init();
	}
}