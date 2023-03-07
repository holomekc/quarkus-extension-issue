package de.holomekc.test.extension.test.utils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import io.quarkus.test.common.QuarkusTestResource;

@QuarkusTestResource(MyResource.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface SomeConfig {
    String[] superImportantConfig() default {};
}
