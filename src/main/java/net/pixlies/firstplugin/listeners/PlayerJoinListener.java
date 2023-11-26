package net.pixlies.firstplugin.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){

        Player player = event.getPlayer();

        event.setJoinMessage(ChatColor.BLACK + "[" + ChatColor.GREEN + "+" +ChatColor.BLACK + "] " + ChatColor.GRAY + player.getDisplayName());
    }
}
