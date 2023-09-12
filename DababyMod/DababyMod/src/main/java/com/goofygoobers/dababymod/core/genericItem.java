package com.goofygoobers.dababymod.core;

import com.goofygoobers.dababymod.dababymod;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class genericItem {
   private genericItem() {}
   
   //Differed register
   public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, dababymod.MODID);
   
   public static final  RegistryObject<Item> DABlOON = ITEMS.register("dabloon", ()->new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).fireResistant()));
}

