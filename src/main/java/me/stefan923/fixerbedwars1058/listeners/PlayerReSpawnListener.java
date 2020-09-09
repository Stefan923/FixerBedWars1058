package me.stefan923.fixerbedwars1058.listeners;

import com.andrei1058.bedwars.api.arena.IArena;
import com.andrei1058.bedwars.api.events.player.PlayerReSpawnEvent;
import me.stefan923.fixerbedwars1058.FixerBedWars1058;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.scheduler.BukkitRunnable;

public class PlayerReSpawnListener implements Listener {

    private final FixerBedWars1058 instance;

    public PlayerReSpawnListener(FixerBedWars1058 instance) {
        this.instance = instance;
    }

    @EventHandler
    public void onPlayerReSpawn(PlayerReSpawnEvent event) {
        Player player = event.getPlayer();
        IArena arena = event.getArena();

        Bukkit.getScheduler().scheduleAsyncDelayedTask(instance, new BukkitRunnable() {
            @Override
            public void run() {
                for (Player gamePlayers : arena.getPlayers()) {
                    gamePlayers.showPlayer(player);
                }

                for (Player spectator : arena.getSpectators()) {
                    spectator.showPlayer(player);
                }
            }
        }, 10L);
    }

}
