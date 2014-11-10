package com.jordanlee833.Naomi;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

	public void onEnable(){
		getLogger().info("Developed By Jordanlee833"); // Starting message
		FileConfiguration config = getConfig(); // Method which created config
		
		
		//Facts
		config.addDefault("Naomi.Local.Facts.One", "First Fact");
		config.addDefault("Naomi.Local.Facts.Two", "Second Fact");
		config.addDefault("Naomi.Local.Facts.Three", "Third Fact");
		//Chat Fun
		config.addDefault("Naomi.Local.Fun.Rainbow", true);
		config.addDefault("Naomi.Local.Fun.Dashing", true);
		//Testing
		config.addDefault("Naomi.Local.Test.String", "Testing");
		config.addDefault("Naomi.Local.Test.Int", "1");
		config.addDefault("Naomi.Local.Test.Boolean", true);
		
		config.options().copyDefaults(true);
		saveConfig();
		}
	
	@EventHandler
	
//	
//			Facts
//	
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		
		//
		//Facts
		//
		if(cmd.getName().equalsIgnoreCase("naomi")){
			sender.sendMessage(ChatColor.DARK_PURPLE + "[Naomi]" + ChatColor.GREEN + " Likes " + getConfig().getString("Naomi.Local.Facts.One"));
			sender.sendMessage(ChatColor.DARK_PURPLE + "[Naomi]" + ChatColor.GREEN + " Likes " + getConfig().getString("Naomi.Local.Facts.Two"));
			sender.sendMessage(ChatColor.DARK_PURPLE + "[Naomi]" + ChatColor.GREEN + " Likes " + getConfig().getString("Naomi.Local.Facts.Three"));
		}

//		
//			Rainbow
//
		
		if(cmd.getName().equalsIgnoreCase("rainbow") && getConfig().getBoolean("Naomi.Local.Fun.Rainbow") == true){
			sender.sendMessage(ChatColor.DARK_PURPLE + "[Naomi]" + ChatColor.RED + " R");
			sender.sendMessage(ChatColor.DARK_PURPLE + "[Naomi]" + ChatColor.GOLD + " A");
			sender.sendMessage(ChatColor.DARK_PURPLE + "[Naomi]" + ChatColor.YELLOW + " I");
			sender.sendMessage(ChatColor.DARK_PURPLE + "[Naomi]" + ChatColor.GREEN + " N");
			sender.sendMessage(ChatColor.DARK_PURPLE + "[Naomi]" + ChatColor.AQUA + " B");
			sender.sendMessage(ChatColor.DARK_PURPLE + "[Naomi]" + ChatColor.DARK_PURPLE + " O");
			sender.sendMessage(ChatColor.DARK_PURPLE + "[Naomi]" + ChatColor.RED + " W");
		}
		
		
//		
//			Dashing
//		
		
		if(cmd.getName().equalsIgnoreCase("dashing") && getConfig().getBoolean("Naomi.Local.Fun.Dashing") == true){
			sender.sendMessage(ChatColor.DARK_PURPLE + "[Naomi]" + ChatColor.RED + " D" + ChatColor.GOLD + "A" + ChatColor.YELLOW + "S" + ChatColor.GREEN + "H" + ChatColor.AQUA + "I" + ChatColor.DARK_PURPLE + "N" + ChatColor.RED + "G");
		}
		return false;
	}
	}
