package autosell;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class Break implements Listener {

    @EventHandler
    public void onBreak(BlockBreakEvent event) {
        ItemStack stack = new ItemStack(event.getBlock().getType(), 1, event.getBlock().getData());

        Player player = event.getPlayer();

    }
}
