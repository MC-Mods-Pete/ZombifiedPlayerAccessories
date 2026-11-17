package net.petemc.zombifiedplayeraccessories.util;

import net.petemc.zombifiedplayeraccessories.ZombifiedPlayerAccessories;

public class ModCompatibility {
    public static void init() {
        if (AccessoriesUtil.isAccessoriesLoaded()) {
            ZombifiedPlayerAccessories.LOGGER.info("Accessories API detected. If enabled accessory items will be transferred to the Zombified Player.");
        }
    }
}
