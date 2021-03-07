package me.timp.pickaxe.efficiency;

import me.timp.Main;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class Book1 implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent e) {

        Economy economy = Main.getEconomy();

        Player player = (Player) e.getWhoClicked();

        if (e.getInventory().getTitle().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', "&eEfficiency"))) {
            e.setCancelled(true);
        }

        if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', "&eEfficiency 20"))) {
            if (Main.getEconomy().has(player, 200)) {
                Main.getEconomy().withdrawPlayer(player, 200);
                player.getItemInHand().addUnsafeEnchantment(Enchantment.DIG_SPEED, 20);
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aYour pickaxe has been upgraded"));
            } else {
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cYou need 200 tokens"));
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cYour tokens &7: " + Main.getEconomy().getBalance(player)));
            }
            return;
        }
    }
}
