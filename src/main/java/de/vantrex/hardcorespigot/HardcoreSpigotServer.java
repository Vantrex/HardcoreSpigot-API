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

    private Set<PacketHandler> packetHandlers = new HashSet<>();
    private Set<MovementHandler> movementHandlers = new HashSet<>();

    private KnockbackHandler knockbackHandler;


    public HardcoreSpigotServer() { }

    public static HardcoreSpigotServer getServer() {
        return server;
    }

    public void addPacketHandler(PacketHandler packetHandler) {
        this.packetHandlers.add(packetHandler);
    }

    public void addMovementHandler(MovementHandler movementHandler) {
        this.movementHandlers.add(movementHandler);
    }

    public void removePacketHandler(PacketHandler packetHandler) {
        this.packetHandlers.remove(packetHandler);
    }

    public void removeMovementHandler(MovementHandler movementHandler) {
        this.movementHandlers.remove(movementHandler);
    }




}
