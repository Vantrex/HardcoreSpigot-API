package de.vantrex.hardcorespigot.modules.knockback;

/**
 * @author Marinus created on 27.06.2021 inside the package - de.vantrex.hardcorespigot.profiles.knockback.module
 */

public abstract class AbstractKnockbackModule implements KnockbackModule {

    private final String moduleName;

    public AbstractKnockbackModule(String moduleName) {
        this.moduleName = moduleName;
    }

    @Override
    public String getModuleName() {
        return this.moduleName;
    }
}
