package com.dmnlk.sample;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

import io.dropwizard.db.DataSourceFactory;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * @author dmnlk
 */
public class SampleConfiguration extends Configuration {
    @NotEmpty
    private String template;

    @NotEmpty
    private String defaultName = "Stranger";


    @Valid
    @NotNull
    @JsonProperty
    private DataSourceFactory dataSourceFactory;

    public DataSourceFactory getDataSourceFactory() {
        return dataSourceFactory;
    }
    
    public void setDataSourceFactory(DataSourceFactory dataSourceFactory) {
        this.dataSourceFactory = dataSourceFactory;
    }

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
