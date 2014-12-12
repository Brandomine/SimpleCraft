package com.brandomine.simplecraft.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTab {
	public static final CreativeTabs SC_TAB = new CreativeTabs("simplecraft".toLowerCase()){
		@Override
		public Item getTabIconItem(){
			return null;
		}
	};
}
