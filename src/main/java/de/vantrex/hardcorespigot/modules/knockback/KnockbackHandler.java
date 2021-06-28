package de.vantrex.hardcorespigot.modules.knockback;

import de.vantrex.hardcorespigot.modules.config.knockback.KnockbackConfig;
import de.vantrex.hardcorespigot.modules.handler.ModuleHandler;

import java.util.Optional;

/**
 * @author Marinus created on 27.06.2021 inside the package - de.vantrex.hardcorespigot.profiles.knockback
 */

public class KnockbackHandler implements ModuleHandler {

    public static KnockbackHandler INSTANCE;

    private final boolean vanillaKb;

    private KnockbackModule activeModule;
    private KnockbackConfig activeConfig;


    public KnockbackHandler(boolean vanillaKb) {
        this.vanillaKb = vanillaKb;
        INSTANCE = this;
    }

    public boolean isVanillaKb() {
        return vanillaKb;
    }

    public KnockbackModule getActiveModule() {
        return activeModule;
    }

    public KnockbackConfig getActiveConfig() {
        return activeConfig;
    }

    public void setActiveModule(KnockbackModule activeModule) {

    }

    public void setActiveConfig(KnockbackConfig config) {
    }

    public void removeConfig(String name) {
        getConfigByName(name).ifPresent(this::removeConfig);
    }

    public void addConfig(KnockbackConfig config, boolean save) {
    }

    public void removeConfig(KnockbackConfig config) {
    }

    public void removeModule(String name) {
    }

    public void addModule(KnockbackModule module) {
    }

    public void removeModule(KnockbackModule module) {
    }

    public Optional<KnockbackModule> getModuleByName(String name) {
        return Optional.empty();
    }

    public Optional<KnockbackModule> getModuleByConfig(KnockbackConfig config) {
        return Optional.empty();
    }

    public Optional<KnockbackConfig> getConfigByName(String name) {
        return Optional.empty();
    }

    @Override
    public void convert() {
    }

    @Override
    public void load() {

    }

    @Override
    public void save() {

    }
}