package me.timp.privatemine;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PrisonerMine implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.teleport(new Location(Bukkit.getWorld("World"), 100, 100, 100));
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aYou has been teleported into PRISONER rank mine"));
        }
        return false;
    }
}
