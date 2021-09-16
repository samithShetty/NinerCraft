package com.samith.ninercraft.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {
    
    public static final ItemGroup NINERCRAFT_GROUP = new ItemGroup("ninerCraftTab") {
        
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.NINER_CREST.get());
        }

    };

}
