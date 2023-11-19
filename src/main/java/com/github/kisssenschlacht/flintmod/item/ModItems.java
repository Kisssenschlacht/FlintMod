package com.github.kisssenschlacht.flintmod.item;

import com.github.kisssenschlacht.flintmod.FlintMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item COPPER_WIRE = registerItem("copper_wire", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(FlintMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FlintMod.LOGGER.info("Registering Mod Items for " + FlintMod.MOD_ID);
    }
}
