package me.timp.meterain;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Start implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("prison.command.rain")) {

                Bukkit.getServer().broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&7⭐&b|METEORITE RAIN|&7⭐ has been started &cHURRY UP! &7HIDE"));
            }
        }
        return false;
    }
}
