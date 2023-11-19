package net.pixlies.firstplugin;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Firstplugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Este plugin começa aqui");

        getServer().getPluginManager().registerEvents(this, this);
    }
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){

        event.setJoinMessage("Boas mano");
    }
    @EventHandler
    public void onPlayerDropItem(PlayerDropItemEvent event){

        Player player = event.getPlayer();
        player.setSneaking(true);
        player.sendRawMessage("BRUHHHH");
    }


}
