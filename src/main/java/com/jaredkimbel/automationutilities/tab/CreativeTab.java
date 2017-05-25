package com.jaredkimbel.automationutilities.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by Jared on 5/25/2017.
 */
public class CreativeTab extends CreativeTabs
{
    public CreativeTab(int index, String label)
    {
        super(index, label);
    }

    @Override
    public Item getTabIconItem()
    {
        return Items.REDSTONE;
    }
}
