package me.timp.join;

import me.timp.Main;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import net.milkbowl.vault.chat.Chat;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class JoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {


        e.setJoinMessage(null);

        Player player = e.getPlayer();

        TextComponent tc = new TextComponent();
        tc.setText("Team");
        tc.setBold(true);
        tc.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://www.skyhcf.net/team"));
        tc.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Team").create()));
        player.spigot().sendMessage(tc);

        ItemStack pickaxe = new ItemStack(Material.DIAMOND_PICKAXE);

        ItemMeta pickaxe_meta = pickaxe.getItemMeta();
        pickaxe_meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6&LYour &7Pickaxe"));
        pickaxe.setItemMeta(pickaxe_meta);
        pickaxe.addUnsafeEnchantment(Enchantment.DIG_SPEED, 10);
        pickaxe.addUnsafeEnchantment(Enchantment.DURABILITY, 999);

        Bukkit.getServer().broadcastMessage(ChatColor.GREEN + "[+] " + ChatColor.WHITE + player.getName());

        if (!player.hasPlayedBefore()) {
            player.getInventory().addItem(pickaxe);
        } else {
            player.getInventory().addItem();
        }
    }

    @EventHandler
    public void onPlayerClicks(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        Action action = event.getAction();

        Inventory pickaxe = Bukkit.createInventory(player, 36, ChatColor.translateAlternateColorCodes('&', "&6&lPickaxe-Upgrader"));
        ItemStack Eff = new ItemStack(Material.ANVIL);
        ItemStack Glass = new ItemStack(Material.STAINED_GLASS_PANE);
        ItemStack sugar = new ItemStack(Material.SUGAR);
        ItemStack glowstone = new ItemStack(Material.GLOWSTONE_DUST);
        ItemStack gem = new ItemStack(Material.GOLD_NUGGET);
        ItemStack paper = new ItemStack(Material.PAPER);
        ItemStack fly = new ItemStack(Material.FEATHER);
        ItemStack jump = new ItemStack(Material.BOOK);
        ItemStack key = new ItemStack(Material.TRIPWIRE_HOOK);

        ArrayList<String> lore = new ArrayList<String>();
        ArrayList<String> loresugar = new ArrayList<String>();
        ArrayList<String> hastelore = new ArrayList<String>();
        ArrayList<String> tokenlore = new ArrayList<String>();

        ItemMeta eff_meta = Eff.getItemMeta();
        eff_meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7&lEfficiency"));
        lore.add(ChatColor.WHITE + "----------");
        lore.add(ChatColor.translateAlternateColorCodes('&', "&6&lTokens &7: " + Main.getEconomy().getBalance(player)));
        lore.add(ChatColor.WHITE + "----------");
        lore.add("");
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7If you want to upgrade"));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7to 20 levels for example"));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7You need to have a 20 * 10 tokens"));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7It counting to every levels!!!"));
        lore.add("");
        eff_meta.setLore(lore);
        Eff.setItemMeta(eff_meta);

        ItemMeta sugar_meta = sugar.getItemMeta();
        sugar_meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&f&lSpeed"));
        loresugar.add(ChatColor.WHITE + "------");
        loresugar.add(ChatColor.translateAlternateColorCodes('&', "&6&lTokens &7: " + Main.getEconomy().getBalance(player)));
        loresugar.add(ChatColor.WHITE + "------");
        loresugar.add("");
        loresugar.add(ChatColor.translateAlternateColorCodes('&', "&7If you want to upgrade"));
        loresugar.add(ChatColor.translateAlternateColorCodes('&', "&7you need to have 100 tokens"));
        loresugar.add(ChatColor.translateAlternateColorCodes('&', "&7by clicking in sugar"));
        loresugar.add(ChatColor.translateAlternateColorCodes('&', "&7you will be get perm speed 2"));
        sugar_meta.setLore(loresugar);
        sugar.setItemMeta(sugar_meta);

        ItemMeta glowstone_meta = glowstone.getItemMeta();
        glowstone_meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&lHaste"));
        hastelore.add(ChatColor.WHITE + "------");
        hastelore.add(ChatColor.translateAlternateColorCodes('&', "&6&lTokens &7: " + Main.getEconomy().getBalance(player)));
        hastelore.add(ChatColor.WHITE + "------");
        hastelore.add("");
        hastelore.add(ChatColor.translateAlternateColorCodes('&', "&7If you want to upgrade"));
        hastelore.add(ChatColor.translateAlternateColorCodes('&', "&7you need to have 100 tokens"));
        hastelore.add(ChatColor.translateAlternateColorCodes('&', "&7by clicking in glowsotone duest"));
        hastelore.add(ChatColor.translateAlternateColorCodes('&', "&7you will be get perm haste 2"));
        glowstone_meta.setLore(hastelore);
        glowstone.setItemMeta(glowstone_meta);

        ItemMeta gem_meta = gem.getItemMeta();
        gem_meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&lToken Miner"));
        tokenlore.add(ChatColor.WHITE + "-------");
        tokenlore.add(ChatColor.translateAlternateColorCodes('&', "&6&lTokens &7: " + Main.getEconomy().getBalance(player)));
        tokenlore.add(ChatColor.WHITE + "-------");
        tokenlore.add("");
        tokenlore.add(ChatColor.translateAlternateColorCodes('&', "&7If you want to upgrade"));
        tokenlore.add(ChatColor.translateAlternateColorCodes('&', "&7to level 1 for example"));
        tokenlore.add(ChatColor.translateAlternateColorCodes('&', "&7You need to have 1 * 1000"));
        tokenlore.add(ChatColor.translateAlternateColorCodes('&', "&7It counting to every level"));
        tokenlore.add("");
        gem_meta.setLore(tokenlore);
        gem.setItemMeta(gem_meta);

        ItemMeta paper_meta = paper.getItemMeta();
        paper_meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&b&lMichasmik Credit Card"));
        paper.setItemMeta(paper_meta);

        ItemMeta fly_meta = fly.getItemMeta();
        fly_meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c&lFly"));
        fly.setItemMeta(fly_meta);

        ItemMeta jump_meta = jump.getItemMeta();
        jump_meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&d&lJump Boost"));
        jump.setItemMeta(jump_meta);

        ItemMeta key_meta = key.getItemMeta();
        key_meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&9&lKey Miner"));
        key.setItemMeta(key_meta);

        pickaxe.addItem(sugar);
        pickaxe.addItem(Eff);
        pickaxe.addItem(Glass);

        if (action.equals(Action.RIGHT_CLICK_AIR) || action.equals(Action.RIGHT_CLICK_BLOCK)) {
            if (player.getItemInHand().getType() == Material.DIAMOND_PICKAXE) {
                ItemStack[] menu_items = {Glass, Glass,Glass,Glass,Eff,Glass,Glass,Glass,Glass, Glass,Glass,sugar, glowstone, gem, paper, fly, Glass, Glass, Glass, Glass ,key ,Glass ,Glass ,Glass , jump, Glass, Glass, Glass, Glass, Glass, Glass, Glass, Glass, Glass, Glass, Glass};
                pickaxe.setContents(menu_items);
                player.openInventory(pickaxe);
            }
        }
    }
}
