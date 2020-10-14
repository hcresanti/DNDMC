package com.hcresanti.dndmc;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class DNDMC extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "I have been enabled lol");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "Oh... okay bye :(");
    }
}

