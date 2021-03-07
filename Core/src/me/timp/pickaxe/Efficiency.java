package me.timp.pickaxe;

import com.avaje.ebeaninternal.api.HelpScopeTrans;
import me.timp.Main;
import net.milkbowl.vault.chat.Chat;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class Efficiency implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent e) {

        Economy economy = Main.getEconomy();

        ItemStack pickaxe = new ItemStack(Material.DIAMOND_PICKAXE);

        ItemMeta pickaxe_meta = pickaxe.getItemMeta();
        pickaxe_meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6&LYour &7Pickaxe"));
        pickaxe.setItemMeta(pickaxe_meta);

        Player player = (Player) e.getWhoClicked();

        Enchantment enchantment = Enchantment.DIG_SPEED;
        int level = 1;

        Inventory effenchant = Bukkit.createInventory(player, 36, ChatColor.translateAlternateColorCodes('&', "Efficiency Enchant"));

        if (e.getInventory().getTitle().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', "&6&lPickaxe-Upgrader"))) {
            e.setCancelled(true);
        }

        Inventory efficiency = Bukkit.createInventory(player, 9, ChatColor.translateAlternateColorCodes('&', "&eEfficiency"));
        if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', "&7&lEfficiency"))) {

            ItemStack book1 = new ItemStack(Material.BOOK);
            ItemStack book2 = new ItemStack(Material.BOOK);
            ItemStack book3 = new ItemStack(Material.BOOK);
            ItemStack book4 = new ItemStack(Material.BOOK);
            ItemStack book5 = new ItemStack(Material.BOOK);
            ItemStack book6 = new ItemStack(Material.BOOK);
            ItemStack book7 = new ItemStack(Material.BOOK);
            ItemStack book8 = new ItemStack(Material.BOOK);
            ItemStack book9 = new ItemStack(Material.BOOK);

            ArrayList<String> book1lore = new ArrayList<String>();
            ArrayList<String> book2lore = new ArrayList<String>();
            ArrayList<String> book3lore = new ArrayList<String>();
            ArrayList<String> book4lore = new ArrayList<String>();
            ArrayList<String> book5lore = new ArrayList<String>();
            ArrayList<String> book6lore = new ArrayList<String>();
            ArrayList<String> book7lore = new ArrayList<String>();
            ArrayList<String> book8lore = new ArrayList<String>();
            ArrayList<String> book9lore = new ArrayList<String>();


            ItemMeta book1_meta = book1.getItemMeta();
            book1_meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&eEfficiency 20"));
            book1lore.add(ChatColor.translateAlternateColorCodes('&', "&7You need 200 tokens"));
            book1lore.add(ChatColor.translateAlternateColorCodes('&', "&7to be able to upgrade"));
            book1_meta.setLore(book1lore);
            book1.setItemMeta(book1_meta);

            ItemMeta book2_meta = book1.getItemMeta();
            book2_meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&eEfficiency 30"));
            book2lore.add(ChatColor.translateAlternateColorCodes('&', "&7You need 300 tokens"));
            book2lore.add(ChatColor.translateAlternateColorCodes('&', "&7to be able to upgrade"));
            book2_meta.setLore(book2lore);
            book2.setItemMeta(book2_meta);

            ItemMeta book3_meta = book3.getItemMeta();
            book3_meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&eEfficiency 40"));
            book3lore.add(ChatColor.translateAlternateColorCodes('&', "&7You need 400 tokens"));
            book3lore.add(ChatColor.translateAlternateColorCodes('&', "&7to be able to upgrade"));
            book3_meta.setLore(book3lore);
            book3.setItemMeta(book3_meta);

            ItemMeta book4_meta = book4.getItemMeta();
            book4_meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&eEfficiency 50"));
            book4lore.add(ChatColor.translateAlternateColorCodes('&', "&7You need 500 tokens"));
            book4lore.add(ChatColor.translateAlternateColorCodes('&', "&7to be able to upgrade"));
            book4_meta.setLore(book4lore);
            book4.setItemMeta(book4_meta);

            ItemMeta book5_meta = book5.getItemMeta();
            book5_meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&eEfficiency 60"));
            book5lore.add(ChatColor.translateAlternateColorCodes('&', "&7You need 600 tokens"));
            book5lore.add(ChatColor.translateAlternateColorCodes('&', "&7to be able to upgrade"));
            book5_meta.setLore(book5lore);
            book5.setItemMeta(book5_meta);

            ItemMeta book6_meta = book6.getItemMeta();
            book6_meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&eEfficiency 70"));
            book6lore.add(ChatColor.translateAlternateColorCodes('&', "&7You need 700 tokens"));
            book6lore.add(ChatColor.translateAlternateColorCodes('&', "&7to be able to upgrade"));
            book6_meta.setLore(book6lore);
            book6.setItemMeta(book6_meta);

            ItemMeta book7_meta = book7.getItemMeta();
            book7_meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&eEfficiency 80"));
            book7lore.add(ChatColor.translateAlternateColorCodes('&', "&7You need 800 tokens"));
            book7lore.add(ChatColor.translateAlternateColorCodes('&', "&7to be able to upgrade"));
            book7_meta.setLore(book7lore);
            book7.setItemMeta(book7_meta);

            ItemMeta book8_meta = book8.getItemMeta();
            book8_meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&eEfficiency 90"));
            book8lore.add(ChatColor.translateAlternateColorCodes('&', "&7You need 900 tokens"));
            book8lore.add(ChatColor.translateAlternateColorCodes('&', "&7to be able to upgrade"));
            book8_meta.setLore(book8lore);
            book8.setItemMeta(book8_meta);

            ItemMeta book9_meta = book9.getItemMeta();
            book9_meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&eEfficiency 100"));
            book9lore.add(ChatColor.translateAlternateColorCodes('&', "&7You need 1000 tokens"));
            book9lore.add(ChatColor.translateAlternateColorCodes('&', "&7to be able to upgrade"));
            book9_meta.setLore(book9lore);
            book9.setItemMeta(book9_meta);

            efficiency.addItem(book1);
            efficiency.addItem(book2);
            efficiency.addItem(book3);
            efficiency.addItem(book4);
            efficiency.addItem(book5);
            efficiency.addItem(book6);
            efficiency.addItem(book7);
            efficiency.addItem(book8);
            efficiency.addItem(book9);

            player.openInventory(efficiency);
        }
        switch (e.getCurrentItem().getType()) {
            case GOLD_NUGGET:
                if (Main.getEconomy().has(player, 1000)) {
                    Main.getEconomy().withdrawPlayer(player, 1000);
                    player.getItemInHand().addUnsafeEnchantment(Enchantment.WATER_WORKER, 1);
                }
        }
    }
}