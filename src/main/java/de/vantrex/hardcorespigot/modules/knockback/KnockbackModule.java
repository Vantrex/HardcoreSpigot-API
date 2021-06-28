package de.vantrex.hardcorespigot.modules.knockback;

import de.vantrex.hardcorespigot.modules.Module;
import net.minecraft.server.v1_8_R3.Entity;
import net.minecraft.server.v1_8_R3.EntityArrow;
import net.minecraft.server.v1_8_R3.EntityFishingHook;
import net.minecraft.server.v1_8_R3.EntityPlayer;


/**
 * @author Marinus created on 27.06.2021 inside the package - de.vantrex.hardcorespigot.profiles.knockback.module
 */

public interface KnockbackModule extends Module {

    void attack(EntityPlayer victim, EntityPlayer attacker, int i, double[] victimMot);

    void attackRegular(Entity victim, Entity attacker, float damage, double d0, double d1);

    void roding(EntityPlayer victim, Entity attacker, EntityFishingHook rod);

    void bow(EntityPlayer victim, Entity attacker, EntityArrow arrow);

    int getHitDelay();

    boolean isAsync();

    boolean isCustomBowKb();

    boolean isCustomRodKb();

    float getExhaustion();


}
