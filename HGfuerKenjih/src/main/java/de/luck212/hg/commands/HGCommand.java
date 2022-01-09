package de.luck212.hg.commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class HGCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) return false;

        for(Player current : Bukkit.getOnlinePlayers()){
            current.getInventory().clear();
            current.setGameMode(GameMode.SURVIVAL);
            current.getInventory().setItem(0, new ItemStack(Material.IRON_SWORD));
            current.getInventory().setItem(1, new ItemStack(Material.IRON_AXE));
            current.getInventory().setItem(17, new ItemStack(Material.IRON_PICKAXE));
            current.getInventory().setItem(8, new ItemStack(Material.BIRCH_PLANKS, 32));
            current.getInventory().setItem(7, new ItemStack(Material.COBBLESTONE_WALL, 32));
            current.getInventory().setItem(13, new ItemStack(Material.BOWL, 32));
            current.getInventory().setItem(15, new ItemStack(Material.RED_MUSHROOM, 32));
            current.getInventory().setItem(14, new ItemStack(Material.BROWN_MUSHROOM, 32));
            current.getInventory().setItem(16, new ItemStack(Material.LAVA_BUCKET, 1));
            current.getInventory().setItem(4, new ItemStack(Material.LAVA_BUCKET, 1));
            current.getInventory().setItem(5, new ItemStack(Material.WATER_BUCKET, 1));
            current.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
            current.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
            current.getInventory().setHelmet(new ItemStack(Material.IRON_HELMET));
            current.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS));
            current.getInventory().setItemInOffHand(new ItemStack(Material.SHIELD));
            for(int i = 0; i <= current.getInventory().getSize(); i++){
                if(current.getInventory().getItem(i) == null){
                    if(i != 45)
                        current.getInventory().setItem(i, new ItemStack(Material.MUSHROOM_STEW));
                }

            }
        }
        return false;
    }
}