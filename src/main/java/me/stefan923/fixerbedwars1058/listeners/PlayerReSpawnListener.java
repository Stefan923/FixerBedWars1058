package me.stefan923.fixerbedwars1058.listeners;

import com.andrei1058.bedwars.api.arena.IArena;
import com.andrei1058.bedwars.api.events.player.PlayerReSpawnEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PlayerReSpawnListener implements Listener {

    @EventHandler
    public void onPlayerReSpawn(PlayerReSpawnEvent event) {
        Player player = event.getPlayer();
        IArena arena = event.getArena();

        for (Player gamePlayers : arena.getPlayers()) {
            gamePlayers.showPlayer(player);
        }

        for (Player spectator : arena.getSpectators()) {
            spectator.showPlayer(player);
        }
    }

}
