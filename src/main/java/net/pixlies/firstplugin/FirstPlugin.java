package net.pixlies.firstplugin;

import net.pixlies.firstplugin.listeners.PlayerDropItemListener;
import net.pixlies.firstplugin.listeners.PlayerJoinListener;
import net.pixlies.firstplugin.listeners.ShearSheepListener;
import net.pixlies.firstplugin.listeners.XPBottleBreakListener;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class FirstPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("The Plugin successfully started! Yuppy :D");

        getServer().getPluginManager().registerEvents(new XPBottleBreakListener(), this);
        getServer().getPluginManager().registerEvents(new ShearSheepListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerDropItemListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
    }
}
