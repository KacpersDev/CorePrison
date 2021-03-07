package me.timp.pickaxe;

import me.timp.Main;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Haste implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent e) {

        Player player = (Player) e.getWhoClicked();
        if (e.getInventory().getTitle().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', "&6&lPickaxe-Upgrader"))) {
            e.setCancelled(true);
        }
        switch (e.getCurrentItem().getType()) {
            case GLOWSTONE_DUST:
                if (Main.getEconomy().has(player, 100)) {
                    Main.getEconomy().withdrawPlayer(player, 100);
                    player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 99999, 1));
                }
        }
    }
}