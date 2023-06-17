package me.sirimperivm.spigot.assets.other;

import me.sirimperivm.spigot.Main;
import org.bukkit.configuration.file.FileConfiguration;

import java.io.File;

@SuppressWarnings("all")
public enum Configs {
    config(Main.getConf().getConfig(), Main.getConf().getConfigFile());

    private FileConfiguration c;
    private File f;

    Configs(FileConfiguration c, File f) {
        this.c = c;
        this.f = f;
    }

    public FileConfiguration getC() {
        return c;
    }

    public File getF() {
        return f;
    }
}
