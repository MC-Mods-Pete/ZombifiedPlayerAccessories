package net.petemc.zombifiedplayertrinkets;

import net.fabricmc.api.ModInitializer;

import net.petemc.zombifiedplayertrinkets.util.ModCompatibility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ZombifiedPlayerTrinkets implements ModInitializer {
	public static final String MOD_ID = "zombifiedplayertrinkets";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	//public static StateSaverAndLoader serverState = null;

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Zombified Player Mod");
		ModCompatibility.init();
	}
}