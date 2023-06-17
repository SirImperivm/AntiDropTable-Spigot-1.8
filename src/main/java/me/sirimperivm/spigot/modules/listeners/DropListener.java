package me.sirimperivm.spigot.modules.listeners;

import me.sirimperivm.spigot.Main;
import me.sirimperivm.spigot.assets.managers.ConfigManager;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Collection;
import java.util.List;

@SuppressWarnings("all")
public class DropListener implements Listener {

    private static ConfigManager conf = Main.getConf();

    @EventHandler
    public void onDeath(PlayerDeathEvent e) {
        Player p = e.getEntity().getPlayer();
        Collection<ItemStack> dropTables = e.getDrops();
        List<String> dropsWhitelist = conf.getConfig().getStringList("settings.droptable-whitelist");

        for (ItemStack is : dropTables) {
            Material type = is.getType();
            String typeName = String.valueOf(is.getType());
            if (!dropsWhitelist.contains(typeName)) {
                is.setType(Material.AIR);
            }
        }
    }
}
