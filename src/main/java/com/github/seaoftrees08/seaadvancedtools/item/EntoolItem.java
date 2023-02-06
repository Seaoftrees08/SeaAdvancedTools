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

    public static final RegistryObject<Item> TEST = ITEMS.register(
            "test",
            () -> new Item(new Item.Properties().tab(EntoolCreativeModeTab.ENTOOL_TAB))
    );

    public static final RegistryObject<Item> HIGH_ENHANCER = ITEMS.register(
            "high_enhancer",
            () -> new Item(new Item.Properties().tab(EntoolCreativeModeTab.ENTOOL_TAB))
    );

    public static final RegistryObject<Item> MIDDLE_ENHANCER = ITEMS.register(
            "middle_enhancer",
            () -> new Item(new Item.Properties().tab(EntoolCreativeModeTab.ENTOOL_TAB))
    );

    public static final RegistryObject<Item> LOW_ENHANCER = ITEMS.register(
            "low_enhancer",
            () -> new Item(new Item.Properties().tab(EntoolCreativeModeTab.ENTOOL_TAB))
    );



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
