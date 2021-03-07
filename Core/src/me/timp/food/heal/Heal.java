package me.timp.food.heal;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Heal implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {
        Player player = (Player) sender;
        if (player.hasPermission("prison.command.heal")) {
            if (args.length == 0) {
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cusage /heal <player>"));
            } else {
                Player target = Bukkit.getPlayerExact(args[0]);
                if (target instanceof Player) {
                    target.setHealth(20);
                }
            }
        } else {
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cYou do not have permission to execute that command"));
        }

        return false;
    }
}
