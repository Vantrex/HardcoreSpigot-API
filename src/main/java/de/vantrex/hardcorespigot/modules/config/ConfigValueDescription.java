package de.vantrex.hardcorespigot.modules.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Marinus created on 27.06.2021 inside the package - de.vantrex.hardcorespigot.profiles.config
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ConfigValueDescription {

    String description();

    String[] hover() default {};

}
