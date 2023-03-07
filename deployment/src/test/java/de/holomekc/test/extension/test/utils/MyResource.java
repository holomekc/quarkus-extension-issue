package de.holomekc.test.extension.test.utils;

import java.util.Map;

import io.quarkus.test.common.QuarkusTestResourceConfigurableLifecycleManager;

public class MyResource implements QuarkusTestResourceConfigurableLifecycleManager<SomeConfig> {

    String container;

    private SomeConfig config;

    @Override
    public void init(final SomeConfig config) {
        this.config = config;
    }

    @Override
    public Map<String, String> start() {
        container = "started";
        throw new IllegalArgumentException("sometimes I am not called");
        //return Map.of();
    }

    @Override
    public void stop() {
        container = "stopped";
    }

    @Override
    public void inject(final TestInjector testInjector) {
        throw new IllegalArgumentException("Never called");
    }
}
