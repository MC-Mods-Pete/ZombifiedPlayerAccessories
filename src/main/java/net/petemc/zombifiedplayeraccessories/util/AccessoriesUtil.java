package net.petemc.zombifiedplayeraccessories.util;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.petemc.zombifiedplayeraccessories.ZombifiedPlayerAccessories;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class AccessoriesUtil {

    public static boolean isAccessoriesLoaded() {
        return FabricLoader.getInstance().isModLoaded("accessories");
    }

    /**
     * Retrieves all equipped accessory items and clears them from the player's slots.
     *
     * @param player The player whose accessories are being retrieved.
     * @return A list of copies of the items found in accessory slots.
     */
    public static List<ItemStack> getAccessoriesItemsAndClear(Player player) {
        List<ItemStack> accessoriesItems = new ArrayList<>();

        if (!isAccessoriesLoaded()) {
            return accessoriesItems;
        }

        /*
        try {
            AccessoriesCapability.getOptionally(player).ifPresent(capability -> {
                for (SlotEntryReference entry : capability.getAllEquipped()) {
                    accessoriesItems.add(entry.stack().copy());
                    entry.reference().setStack(ItemStack.EMPTY);
                }
            });
        } catch (Exception e) {
            ZombifiedPlayerAccessories.LOGGER.error("Error getting accessory items from player: " + e.getMessage());
        }
         */

        return accessoriesItems;
    }

    /**
     * Checks if a specific item is currently equipped in any accessory slot.
     *
     * @param player The player to check.
     * @param itemToCheck The item stack to look for.
     * @return true if the item is found in an accessory slot, false otherwise.
     */
    public static boolean checkForItemInAccessories(Player player, ItemStack itemToCheck) {
        AtomicBoolean foundItem = new AtomicBoolean(false);

        if (!isAccessoriesLoaded()) {
            return foundItem.get();
        }

        /*
        try {
            AccessoriesCapability.getOptionally(player).ifPresent(capability -> {
                for (SlotEntryReference entry : capability.getAllEquipped()) {
                    if (entry.stack().isOf(itemToCheck.getItem())) {
                        ZombifiedPlayerAccessories.LOGGER.info("Found " + itemToCheck + " in accessories!");
                        foundItem.set(true);
                    }
                }
            });
        } catch (Exception e) {
            ZombifiedPlayer.LOGGER.error("Error checking accessories for item: " + e.getMessage());
        }
         */
        return foundItem.get();
    }

    /**
     * Checks if a specific item (identified by its resource location string) is currently equipped in any accessory slot.
     *
     * @param player The player to check.
     * @param itemId The resource location string of the item (e.g. "chargedcharms:charged_totem_charm").
     * @return true if the item is found in an accessory slot, false otherwise.
     */
    public static boolean checkForItemInAccessories(Player player, String itemId) {
        return BuiltInRegistries.ITEM.getOptional(Identifier.parse(itemId))
                .map(item -> checkForItemInAccessories(player, item.getDefaultInstance()))
                .orElse(false);
    }
}