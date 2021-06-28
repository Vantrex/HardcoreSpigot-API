package de.vantrex.hardcorespigot.modules.config.knockback;

import de.vantrex.hardcorespigot.modules.config.ConfigValueDescription;
import de.vantrex.hardcorespigot.modules.config.ConfigValueMessages;
import de.vantrex.hardcorespigot.modules.config.ConfigValue;

/**
 * @author Marinus created on 27.06.2021 inside the package - de.vantrex.hardcorespigot.profiles.knockback.config
 */

public abstract class KnockbackConfig {

    @ConfigValue(configName = "name")
    @ConfigValueDescription(description = "The Profile Name")
    @ConfigValueMessages(onDisplay = "§7Knockback Profile Name: §b%s")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void createDefault();

}