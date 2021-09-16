package com.samith.ninercraft.item;

import com.samith.ninercraft.NinerCraft;

import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NinerCraft.MOD_ID);

    public static final RegistryObject<Item> NINER_CREST = ITEMS.register("niner_crest", () -> new Item(new Item.Properties().group(ModItemGroup.NINERCRAFT_GROUP)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
