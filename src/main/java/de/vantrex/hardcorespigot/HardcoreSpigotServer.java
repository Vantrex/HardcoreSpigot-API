package de.vantrex.hardcorespigot;


import de.vantrex.hardcorespigot.handler.MovementHandler;
import de.vantrex.hardcorespigot.handler.PacketHandler;
import de.vantrex.hardcorespigot.modules.knockback.KnockbackHandler;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
public class HardcoreSpigotServer {

    private static HardcoreSpigotServer server;

    private KnockbackHandler knockbackHandler;


    public HardcoreSpigotServer() {
    }

    public static HardcoreSpigotServer getServer() {
        return server;
    }

    public void addPacketHandler(PacketHandler packetHandler) {

    }

    public void addMovementHandler(MovementHandler movementHandler) {

    }

    public void removePacketHandler(PacketHandler packetHandler) {

    }

    public void removeMovementHandler(MovementHandler movementHandler) {

    }

}
