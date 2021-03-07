package me.timp.pickaxe.efficiency;

import me.timp.Main;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.ChatColor;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class Book2 implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent e) {

        Economy economy = Main.getEconomy();

        Player player = (Player) e.getWhoClicked();

        if (e.getInventory().getTitle().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', "&eEfficiency"))) {
            e.setCancelled(true);
        }

        if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', "&eEfficiency 30"))) {
            if (Main.getEconomy().has(player, 300)) {
                Main.getEconomy().withdrawPlayer(player, 300);
                player.getItemInHand().addUnsafeEnchantment(Enchantment.DIG_SPEED, 30);
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aYour pickaxe has been upgraded"));
                return;
            } else {
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cYou need 300 tokens"));
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cYour tokens &7: " + Main.getEconomy().getBalance(player)));
            }
        }
    }
}
