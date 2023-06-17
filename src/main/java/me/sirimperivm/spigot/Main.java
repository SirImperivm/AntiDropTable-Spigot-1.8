package me.sirimperivm.spigot;

import me.sirimperivm.spigot.assets.managers.ConfigManager;
import me.sirimperivm.spigot.assets.utils.Colors;
import me.sirimperivm.spigot.modules.commands.AdminCommand;
import me.sirimperivm.spigot.modules.listeners.DropListener;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("all")
public final class Main extends JavaPlugin {

    private static Main plugin;
    private static ConfigManager conf;

    void startUp() {
        plugin = this;
        conf = new ConfigManager();
        conf.loadAll();
    }

    void endUp() {
        conf.saveAll();
    }

    @Override
    public void onEnable() {
        startUp();
        getServer().getConsoleSender().sendMessage(Colors.text("&a[AntiDropTable] Plugin attivato correttamente!"));
        getServer().getConsoleSender().sendMessage(Colors.text("&9&nPlugin sviluppato da SirImperivm_"));

        getServer().getPluginCommand("adt").setExecutor(new AdminCommand());
        getServer().getPluginManager().registerEvents(new DropListener(), this);
    }

    @Override
    public void onDisable() {
        endUp();
    }

    public static Main getPlugin() {
        return plugin;
    }

    public static ConfigManager getConf() {
        return conf;
    }
}
