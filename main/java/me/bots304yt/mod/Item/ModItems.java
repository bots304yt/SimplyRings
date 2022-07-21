package me.bots304yt.mod.Item;

import me.bots304yt.mod.Main;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);

    public static final RegistryObject<Item> ANILLO = ITEMS.register("anillo",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<Item> GOLD_ANILLO_ARMOR = ITEMS.register("gold_anillo_armor",
            () -> new ArmorItem(ModArmorMaterial.GOLD, EquipmentSlotType.CHEST, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<Item> DIAMOND_ANILLO_ARMOR = ITEMS.register("diamond_anillo_armor",
            () -> new ArmorItem(ModArmorMaterial.DIAMOND, EquipmentSlotType.CHEST, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}