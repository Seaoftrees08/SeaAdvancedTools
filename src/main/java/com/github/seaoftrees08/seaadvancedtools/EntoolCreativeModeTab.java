package com.github.seaoftrees08.seaadvancedtools;

import com.github.seaoftrees08.seaadvancedtools.item.EntoolItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class EntoolCreativeModeTab {
    public static final CreativeModeTab ENTOOL_TAB = new CreativeModeTab("enhancedtoolstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(EntoolItem.ENHANCED_WOODEN_PICKAXE.get());
        }
    };

}
