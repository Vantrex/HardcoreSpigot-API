package de.vantrex.hardcorespigot.modules.config.potion;

import de.vantrex.hardcorespigot.modules.config.ConfigValueDescription;
import de.vantrex.hardcorespigot.modules.config.ConfigValueMessages;
import de.vantrex.hardcorespigot.modules.config.ConfigValue;

/**
 * @author Marinus created on 28.06.2021 inside the package - de.vantrex.hardcorespigot.profiles.module.config.potion
 */

public class PotionConfig {

    @ConfigValue(configName = "Name")
    @ConfigValueDescription(description = "The Profile Name")
    @ConfigValueMessages(onDisplay = "§7Potion Profile Name: §b%s")
    private String name;

}
