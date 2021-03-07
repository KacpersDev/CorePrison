package me.timp;

import autosell.AutoSell;
import autosell.MoveAutoSell;
import me.timp.balance.BalanceCommand;
import me.timp.balance.BalanceWithdraw;
import me.timp.balance.BreakBlockListener;
import me.timp.food.AntiFoodListener;
import me.timp.food.heal.Heal;
import me.timp.join.JoinListener;
import me.timp.meterain.Start;
import me.timp.pickaxe.Efficiency;
import me.timp.pickaxe.Haste;
import me.timp.pickaxe.Speed;
import me.timp.pickaxe.Token1;
import me.timp.pickaxe.efficiency.*;
import me.timp.privatemine.PrisonerMine;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

import java.awt.*;

import static org.bukkit.Difficulty.PEACEFUL;

public class Main extends JavaPlugin {

    private static Economy econ = null;

    public void onEnable() {
        if (!setupEconomy()) {
            System.out.println("Disabled due to no Vault dependency found!");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }

        Bukkit.getWorld("World").setDifficulty(PEACEFUL);

        getServer().getPluginManager().registerEvents(new JoinListener(), this);
        getServer().getPluginManager().registerEvents(new AntiFoodListener(), this);
        getServer().getPluginManager().registerEvents(new Efficiency(), this);
        getServer().getPluginManager().registerEvents(new BreakBlockListener(), this);
        getServer().getPluginManager().registerEvents(new Speed(), this);
        getServer().getPluginManager().registerEvents(new Haste(), this);
        getServer().getPluginManager().registerEvents(new Token1(), this);
        getServer().getPluginManager().registerEvents(new Book1(), this);
        getServer().getPluginManager().registerEvents(new Book2(), this);
        getServer().getPluginManager().registerEvents(new Book3(), this);
        getServer().getPluginManager().registerEvents(new Book4(), this);
        getServer().getPluginManager().registerEvents(new Book5(), this);
        getServer().getPluginManager().registerEvents(new Book6(), this);
        getServer().getPluginManager().registerEvents(new Book7(), this);
        getServer().getPluginManager().registerEvents(new Book8(), this);
        getServer().getPluginManager().registerEvents(new Book9(), this);
        getServer().getPluginManager().registerEvents(new AutoSell(), this);
        getServer().getPluginManager().registerEvents(new MoveAutoSell(), this);

        getCommand("Heal").setExecutor(new Heal());
        getCommand("Tokens").setExecutor(new BalanceCommand());
        getCommand("Prison").setExecutor(new WaterMark());
        getCommand("PrisonerMine").setExecutor(new PrisonerMine());
        getCommand("Tokenswith").setExecutor(new BalanceWithdraw());
        getCommand("MeteRain").setExecutor(new Start());
    }

    private boolean setupEconomy() {
        if (getServer().getPluginManager().getPlugin("Vault") == null) {
            return false;
        }
        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp == null) {
            return false;
        }
        econ = rsp.getProvider();
        return econ != null;

    }

    public static Economy getEconomy() {
        return econ;
    }

    public void onDisable() {
    }
}
