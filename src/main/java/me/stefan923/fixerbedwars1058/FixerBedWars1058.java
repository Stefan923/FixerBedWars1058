package me.stefan923.fixerbedwars1058;

import me.stefan923.fixerbedwars1058.listeners.PlayerReSpawnListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class FixerBedWars1058 extends JavaPlugin {

    @Override
    public void onEnable() {
        if (Bukkit.getPluginManager().isPluginEnabled("BedWars1058")) {
            getLogger().severe("BedWars1058 was not found. Disabling...");
            setEnabled(false);
            return;
        }

        Bukkit.getPluginManager().registerEvents(new PlayerReSpawnListener(), this);
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

}
