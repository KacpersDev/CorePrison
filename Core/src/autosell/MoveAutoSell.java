package autosell;

import me.timp.Main;
import net.minecraft.server.v1_8_R1.Block;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;

public class MoveAutoSell implements Listener {

    @EventHandler
    public void onMove(PlayerMoveEvent e) {

        Player player = e.getPlayer();
        
        if (player.getInventory().contains(new ItemStack(Material.COBBLESTONE))) {
            player.getInventory().remove(new ItemStack(Material.COBBLESTONE));
            Main.getEconomy().depositPlayer(player, 1);
        }
        if (player.getInventory().contains(new ItemStack(Material.STONE))) {
            player.getInventory().remove(new ItemStack(Material.STONE));
            Main.getEconomy().depositPlayer(player, 1);

        }
    }
}
