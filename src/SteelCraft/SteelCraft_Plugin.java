
package SteelCraft;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
//import org.bukkit.entity.Player;
//import org.bukkit.plugin.PluginDescriptionFile;
//import org.bukkit.plugin.PluginManager;

public class SteelCraft_Plugin extends JavaPlugin
{

  @Override
  public void onDisable()
  {

  }

  @Override
  public void onEnable()
  {
    //PluginManager pm = getServer().getPluginManager();
    //pm.registerEvents(playerListener, this);
    //pm.registerEvents(blockListener, this);
    getCommand("getpos").setExecutor(new SteelCraft_GetPosCommand());
  }

  @Override
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
  {
    if (command.getName().equalsIgnoreCase("test"))
    {
      sender.sendMessage("hello!");
      return true;
    }
    return false;
  }

}
