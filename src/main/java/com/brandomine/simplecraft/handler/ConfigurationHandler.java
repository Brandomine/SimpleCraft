package com.brandomine.simplecraft.handler;

import java.io.File;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {
	public static Configuration configuration;
	public static boolean testValue = false;
	
	public static void init(File configFile){
		if (configuration == null){
			configuration = new Configuration(configFile);
			loadConfiguration();
		}
	}

	private static void loadConfiguration() {
		testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "Are you true or false?");
		
		if (configuration.hasChanged()){
			configuration.save();
		}
	}
	
	@SubscribeEvent
	public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){
		if (event.modID.equalsIgnoreCase("simplecraft")){
			loadConfiguration();
		}
	}
}
