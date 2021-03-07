package me.timp.pickaxe;

import me.timp.Main;
import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.economy.EconomyResponse;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class Token1 implements Listener {


    @EventHandler
    public void onMine(BlockBreakEvent e) {
        Economy eco = Main.getEconomy();
        Player player = e.getPlayer();

        if (player.getItemInHand().containsEnchantment(Enchantment.WATER_WORKER)) {
            EconomyResponse response = eco.depositPlayer(player, 2.0);
        }
    }
}
