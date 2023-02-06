package com.github.seaoftrees08.seaadvancedtools.item;

import com.github.seaoftrees08.seaadvancedtools.EnhancedTools;
import com.github.seaoftrees08.seaadvancedtools.EntoolCreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntoolItem {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EnhancedTools.MOD_ID);

    public static final RegistryObject<Item> TEST = register("name");

    public static final RegistryObject<Item> HIGH_ENHANCER = register("high_enhancer");
    public static final RegistryObject<Item> MIDDLE_ENHANCER = register("middle_enhancer");
    public static final RegistryObject<Item> LOW_ENHANCER = register("low_enhancer");
    public static final RegistryObject<Item> ENHANCED_WOODEN_AXE = register("enhanced_wooden_axe");
    public static final RegistryObject<Item> ENHANCED_WOODEN_HOE = register("enhanced_wooden_hoe");
    public static final RegistryObject<Item> ENHANCED_WOODEN_PICKAXE = register("enhanced_wooden_pickaxe");
    public static final RegistryObject<Item> ENHANCED_WOODEN_SHOVEL = register("enhanced_wooden_shovel");
    public static final RegistryObject<Item> ENHANCED_IRON_AXE = register("enhanced_iron_axe");
    public static final RegistryObject<Item> ENHANCED_IRON_HOE = register("enhanced_iron_hoe");
    public static final RegistryObject<Item> ENHANCED_IRON_PICKAXE = register("enhanced_iron_pickaxe");
    public static final RegistryObject<Item> ENHANCED_IRON_SHOVEL = register("enhanced_iron_shovel");
    public static final RegistryObject<Item> ENHANCED_GOLDEN_AXE = register("enhanced_golden_axe");
    public static final RegistryObject<Item> ENHANCED_GOLDEN_HOE = register("enhanced_golden_hoe");
    public static final RegistryObject<Item> ENHANCED_GOLDEN_PICKAXE = register("enhanced_golden_pickaxe");
    public static final RegistryObject<Item> ENHANCED_GOLDEN_SHOVEL = register("enhanced_golden_shovel");
    public static final RegistryObject<Item> ENHANCED_DIAMOND_AXE = register("enhanced_diamond_axe");
    public static final RegistryObject<Item> ENHANCED_DIAMOND_HOE = register("enhanced_diamond_hoe");
    public static final RegistryObject<Item> ENHANCED_DIAMOND_PICKAXE = register("enhanced_diamond_pickaxe");
    public static final RegistryObject<Item> ENHANCED_DIAMOND_SHOVEL = register("enhanced_diamond_shovel");
    public static final RegistryObject<Item> ENHANCED_NETHERITE_AXE = register("enhanced_netherie_axe");
    public static final RegistryObject<Item> ENHANCED_NETHERITE_HOE = register("enhanced_netherie_hoe");
    public static final RegistryObject<Item> ENHANCED_NETHERITE_PICKAXE = register("enhanced_netherie_pickaxe");
    public static final RegistryObject<Item> ENHANCED_NETHERITE_SHOVEL = register("enhanced_netherie_shovel");




    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

    public static RegistryObject<Item> register(String name){
        return ITEMS.register(
                name,
                () -> new Item(new Item.Properties().tab(EntoolCreativeModeTab.ENTOOL_TAB))
        );
    }
}
