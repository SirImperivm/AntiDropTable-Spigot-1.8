package me.sirimperivm.spigot.assets.utils;

import me.sirimperivm.spigot.assets.managers.ConfigManager;
import me.sirimperivm.spigot.assets.other.General;
import org.bukkit.command.CommandSender;

@SuppressWarnings("all")
public class Errors {

    private static String Prefix() {
        return General.Prefix("fail");
    }

    public static boolean noPerm(CommandSender s, String p) {
        if (s.hasPermission(p))
            return false;
        s.sendMessage(Prefix() + ConfigManager.getSetting("messages.errors.no-perm"));
        return true;
    }
}
