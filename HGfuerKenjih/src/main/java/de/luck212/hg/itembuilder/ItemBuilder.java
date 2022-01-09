package de.luck212.hg.itembuilder;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class ItemBuilder {

    private ItemStack item;
    private ItemMeta meta;

    public ItemBuilder(Material material){

        item = new ItemStack(material);

        meta = item.getItemMeta();


    }

    public ItemBuilder setLocalizedName(String name){

        meta.setLocalizedName(name);

        return this;
    }

    public ItemStack setup(){
        item.setItemMeta(meta);
        return item;
    }

    public ItemBuilder setName(String name){
        meta.setDisplayName(name);
        return this;
    }

    public ItemBuilder setLore(String... lore){
        meta.setLore(Arrays.asList(lore));
        return this;
    }

    public ItemBuilder setAmount(int amount){
        item.setAmount(amount);
        return this;
    }

    public ItemBuilder ench(){
        meta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        return this;
    }

    public ItemBuilder addEnch(Enchantment enchantment, int level){
        meta.addEnchant(enchantment, level, true);
        return this;
    }

    public ItemBuilder addFlag(ItemFlag flag){
        meta.addItemFlags(flag);
        return this;
    }

    public ItemBuilder removeEnch(Enchantment enchantment){
        meta.removeEnchant(enchantment);
        return this;
    }
}