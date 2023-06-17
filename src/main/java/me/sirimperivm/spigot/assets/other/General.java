package me.sirimperivm.spigot.assets.other;

import me.sirimperivm.spigot.assets.managers.ConfigManager;

@SuppressWarnings("all")
public class General {

    public static String Prefix(String id) {
        return ConfigManager.getSetting("messages.prefixes." + id);
    }
}
