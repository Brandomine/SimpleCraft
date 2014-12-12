package com.brandomine.simplecraft.proxy;

import com.brandomine.simplecraft.SimpleCraft;
import com.brandomine.simplecraft.handler.GuiHandler;

import cpw.mods.fml.common.network.NetworkRegistry;

public class ServerProxy extends CommonProxy{
	public void registerGui(){
		NetworkRegistry.INSTANCE.registerGuiHandler(SimpleCraft.modInstance, new GuiHandler());
	}
}
