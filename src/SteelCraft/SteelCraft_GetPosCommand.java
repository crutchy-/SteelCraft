
package SteelCraft;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SteelCraft_GetPosCommand implements CommandExecutor
{
  public boolean onCommand(CommandSender sender, Command command, String label, String[] split)
  {
    if (!(sender instanceof Player))
    {
      return false;
    }
    Player player = (Player) sender;
    Location location = player.getLocation();
    DecimalFormat df = new DecimalFormat("#.##");
    df.setRoundingMode(RoundingMode.CEILING);
    player.sendMessage("Current position: X=" + df.format(location.getX()) +", Y=" + df.format(location.getY()) + ", Z=" + df.format(location.getZ()));
    return true;
  }
}
