package com.github.kisssenschlacht.flintmod.item;

import com.github.kisssenschlacht.flintmod.FlintMod;
import com.github.kisssenschlacht.flintmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup FLINT_GROUP =
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.flintmod"))
                    .icon(() -> new ItemStack(Items.FLINT))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.COMPRESSED_FLINT_BLOCK);
                        entries.add(ModBlocks.CASING_BLOCK);
                        entries.add(ModBlocks.FLINT_COMPRESSOR_BLOCK);

                        entries.add(ModItems.COPPER_WIRE);
                        entries.add(ModItems.BLUE_CABLE);
                        entries.add(ModItems.RED_CABLE);
                        entries.add(ModItems.COPPER_FOIL);
                        entries.add(ModItems.SUBSTRATE);
                        entries.add(ModItems.ELECTRONICS);
                        entries.add(ModItems.FLINT_PLATE);
                        entries.add(ModItems.RED_ELECTRICAL_BUTTON);
                    }).build();

    public static void registerItemGroups() {
        FlintMod.LOGGER.info("Registering Item Groups for " + FlintMod.MOD_ID);

        Registry.register(Registries.ITEM_GROUP, new Identifier(FlintMod.MOD_ID, "flint"), FLINT_GROUP);
    }
}
