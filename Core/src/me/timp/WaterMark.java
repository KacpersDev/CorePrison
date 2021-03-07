package me.timp;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WaterMark implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {

        Player player = (Player) sender;
        if (sender instanceof Player) {
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&fPrison core has been made by &9Timp"));
        }

        return false;
    }
}
