package net.petemc.zombifiedplayertrinkets.util;

import net.petemc.zombifiedplayertrinkets.ZombifiedPlayerTrinkets;

public class ModCompatibility {
    public static void init() {
        if (TrinketsUtil.isTrinketsLoaded()) {
            ZombifiedPlayerTrinkets.LOGGER.info("Trinkets API detected. If enabled trinket items will be transferred to the Zombified Player.");
        }
    }
}
