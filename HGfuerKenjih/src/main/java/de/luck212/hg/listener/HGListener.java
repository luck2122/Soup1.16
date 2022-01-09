package de.luck212.hg.listener;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class HGListener implements Listener {

    @EventHandler
    public void handleBlockBreak(BlockBreakEvent event){
        if(event.getBlock().getType() == Material.GLASS || event.getBlock().getType() == Material.GRASS_BLOCK)
            event.setCancelled(true);
    }

    @EventHandler
    public void handleSoupClick(PlayerInteractEvent event){
        if(event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK){
            Player player = event.getPlayer();
            event.setUseItemInHand(Event.Result.DENY);
            if(player.getInventory().getItemInMainHand().getType() == Material.MUSHROOM_STEW){
                player.setHealth(player.getHealth() + 4);
                if(player.getHealth() >= 20)
                    player.setHealth(20);
                player.getInventory().removeItem(player.getInventory().getItemInMainHand());
                player.getInventory().setItemInMainHand(new ItemStack(Material.BOWL ,1));
            }
        }
    }
}