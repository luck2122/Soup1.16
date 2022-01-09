package de.luck212.hg.main;

import de.luck212.hg.commands.HGCommand;
import de.luck212.hg.listener.HGListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("hg").setExecutor(new HGCommand());
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new HGListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
