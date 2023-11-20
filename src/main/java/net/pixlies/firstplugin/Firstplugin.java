package net.pixlies.firstplugin;

import net.pixlies.firstplugin.listeners.PlayerDropItemListener;
import net.pixlies.firstplugin.listeners.PlayerJoinListener;
import net.pixlies.firstplugin.listeners.ShearSheepListener;
import net.pixlies.firstplugin.listeners.XPBottleBreakListener;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Firstplugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("The Plugin successfully started! Yuppy :D");

        getServer().getPluginManager().registerEvents(new XPBottleBreakListener(), this);
        getServer().getPluginManager().registerEvents(new ShearSheepListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerDropItemListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
    }
}
