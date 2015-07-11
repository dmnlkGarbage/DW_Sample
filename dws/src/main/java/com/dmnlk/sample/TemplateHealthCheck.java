package com.dmnlk.sample;

import com.codahale.metrics.health.HealthCheck;

/**
 * @author  dmnlk
 */
public class TemplateHealthCheck extends HealthCheck {
    private final String template;

    @Override
    protected Result check() throws Exception {
        return null;
    }
}
