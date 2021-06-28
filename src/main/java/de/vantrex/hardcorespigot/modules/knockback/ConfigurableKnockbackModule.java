package de.vantrex.hardcorespigot.modules.knockback;

import de.vantrex.hardcorespigot.modules.config.knockback.KnockbackConfig;

/**
 * @author Marinus created on 27.06.2021 inside the package - de.vantrex.hardcorespigot.profiles.knockback.module
 */

public abstract class ConfigurableKnockbackModule<T extends KnockbackConfig> extends AbstractKnockbackModule {

    public ConfigurableKnockbackModule(String moduleName) {
        super(moduleName);
    }

    public abstract KnockbackConfig getConfig();

    public abstract void setConfig(KnockbackConfig config);

    public abstract Class<? extends KnockbackConfig> getType();

}
