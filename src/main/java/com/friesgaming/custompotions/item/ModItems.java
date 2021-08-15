package com.friesgaming.custompotions.item;

import com.friesgaming.custompotions.util.Registration;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PotionItem;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    public static final RegistryObject<Item> LAVA_POTION =
            Registration.ITEMS.register("lava_potion",
                    () -> new PotionItem(new PotionItem.Properties().group(ItemGroup.BREWING)));

    public static void register() {}
}
