package net.pixlies.firstplugin.listeners;

import org.bukkit.block.Block;
import org.bukkit.block.PistonMoveReaction;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPistonEvent;

public class PistonExtendListener implements Listener {

    @EventHandler
    public void onPistonExtension(BlockPistonEvent e) {

        Block block = e.getBlock();
            e.setCancelled(true);



    }


}
