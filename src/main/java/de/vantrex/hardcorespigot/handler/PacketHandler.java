package de.vantrex.hardcorespigot.handler;


import net.minecraft.server.v1_8_R3.Packet;
import net.minecraft.server.v1_8_R3.PlayerConnection;

public interface PacketHandler {

    void handleReceivedPacket(PlayerConnection connection, Packet packet);

    void handleSentPacket(PlayerConnection connection, Packet packet);
}
