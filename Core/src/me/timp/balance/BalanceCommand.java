package me.timp.balance;

import me.timp.Main;
import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.economy.EconomyResponse;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BalanceCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("prison.command.deposit")) {
                Economy economy = Main.getEconomy();
                if (args.length == 0) {
                    //Get a balance of a player
                    player.sendMessage(ChatColor.GOLD + "Tokens: " + ChatColor.WHITE + economy.getBalance(player));
                } else if (args.length == 2 && args[0].equalsIgnoreCase("deposit")) {
                    double deposit_amount = Double.valueOf(args[1]);
                    //if the method returns an economyresponse, set the method equal to a reference for one
                    //so that you can use it for information on the transaction
                    EconomyResponse response = economy.depositPlayer(player, deposit_amount);
                    if (response.transactionSuccess()) {
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aYour tokens has been changed"));
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&lTokens &7: " + Main.getEconomy().getBalance(player)));
                    } else {
                        player.sendMessage("Failed to deposit money");
                        player.sendMessage(response.errorMessage);
                    }
                }
            }

            // economy.format(response.amount)

            return true;
        }
        return false;
    }
}
