package xyz.spypaste.plugin.mc_murder;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    private  static Main instance = null;
    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
        registerListener();
        registerCommand();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static Main getInstance() {
        return instance;
    }

    private void registerListener(){
        PluginManager pluginManager = getServer().getPluginManager();
    }

    private void registerCommand(){
    }
}
