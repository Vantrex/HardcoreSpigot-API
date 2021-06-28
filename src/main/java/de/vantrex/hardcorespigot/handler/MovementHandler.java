package de.vantrex.hardcorespigot.handler;

import net.minecraft.server.v1_8_R3.PacketPlayInFlying;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public interface MovementHandler {

    void handleUpdateLocation(Player player, Location to, Location from, PacketPlayInFlying packet);

    void handleUpdateRotation(Player player, Location to, Location from, PacketPlayInFlying packet);
}
