package org.ordinai.ordinaiCore;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import org.ordinai.ordinaiCore.item.CoinItem;

public class OrdinaiCore implements ModInitializer {
    public static final String MODID = "ordinaicore"; // or "ordinaicore" if your assets folder uses that case
    public static final Item COIN = new CoinItem(new Item.Settings());
    public static final ItemStack COIN_STACK = new ItemStack(COIN);

    @Override
    public void onInitialize() {
        Registry.register(
                Registries.ITEM,
                Identifier.of(MODID, "coin"),
                COIN
        );

        // Optional: add to creative tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> entries.add(COIN));

    }

}
