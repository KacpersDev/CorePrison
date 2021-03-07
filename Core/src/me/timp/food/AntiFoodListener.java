package me.timp.food;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public class AntiFoodListener implements Listener {

    @EventHandler
    public void onLoss(FoodLevelChangeEvent e) {

        e.setFoodLevel(20);
    }
}
