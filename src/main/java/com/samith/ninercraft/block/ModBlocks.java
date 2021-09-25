package com.samith.ninercraft.block;

import java.util.function.Supplier;

import com.samith.ninercraft.NinerCraft;
import com.samith.ninercraft.item.ModItemGroup;
import com.samith.ninercraft.item.ModItems;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, NinerCraft.MOD_ID);
    
    public static final RegistryObject<Block> FOOLS_GOLD_ORE = registerBlock("fools_gold_ore", 
        () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(3f)));


    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().group(ModItemGroup.NINERCRAFT_GROUP)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
