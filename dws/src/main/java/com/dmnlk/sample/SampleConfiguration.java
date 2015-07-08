package com.dmnlk.sample;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author dmnlk
 */
public class SampleConfiguration extends Configuration {
    @NotEmpty
    private String template;

    @NotEmpty
    private String defaultName = "Stranger";

    @JsonProperty
    public String getDefaultName() {
        return defaultName;
    }
    @JsonProperty
    public void setDefaultName(String defaultName) {
        this.defaultName = defaultName;
    }
    @JsonProperty
    public String getTemplate() {
        return template;
    }
    @JsonProperty
    public void setTemplate(String template) {
        this.template = template;
    }
}
