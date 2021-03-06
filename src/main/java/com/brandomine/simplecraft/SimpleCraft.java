package com.brandomine.simplecraft;

import com.brandomine.simplecraft.handler.ConfigurationHandler;
import com.brandomine.simplecraft.proxy.IProxy;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(name = "SimpleCraft", modid = "simplecraft", version = "alpha 0.0.1")

public class SimpleCraft {
	
	@Mod.Metadata
	public static ModMetadata meta;
	
	@Mod.Instance("simplecraft")
	public static SimpleCraft modInstance;
	
	@SidedProxy(clientSide = "com.brandomine.simplecraft.proxy.ClientProxy", serverSide = "com.brandomine.simplecraft.proxy.ServerProxy")
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void PreInit(FMLPreInitializationEvent event){
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
	}
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event){
		
	}
	
	@Mod.EventHandler
	public void PostInit(FMLPostInitializationEvent event){
		
	}

}
