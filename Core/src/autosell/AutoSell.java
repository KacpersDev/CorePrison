package autosell;

import me.timp.Main;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.ItemStack;

public class AutoSell implements Listener {

    @EventHandler
    public void onPick(PlayerPickupItemEvent e) {

        ItemStack stone = new ItemStack(Material.STONE);

        Player player = e.getPlayer();

        int level = new ItemStack(stone).getAmount();
        int money = new ItemStack(stone).getAmount();

        if (player.getInventory().contains(level)) {
            Main.getEconomy().depositPlayer(player, money);
            player.getInventory().remove(level);
        }
    }
}
