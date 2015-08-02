package com.dmnlk.sample;

import com.dmnlk.doma.AppConfig;
import io.dropwizard.Configuration;
import io.dropwizard.ConfiguredBundle;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.db.DatabaseConfiguration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * @author dmnlk.
 */
public class DomaBundle<CONFIGURATION extends Configuration> implements ConfiguredBundle<CONFIGURATION>, DatabaseConfiguration<CONFIGURATION> {
    protected static final String DEFAULT_DATASOURCE_NAME = "doma";
    protected final String datasourceName;
    protected AppConfig appConfig;

    public DomaBundle() {
        this(DEFAULT_DATASOURCE_NAME);
    }

    public DomaBundle(String datasourceName) {
        this.datasourceName = datasourceName;
    }

    @Override
    public void run(CONFIGURATION configuration, Environment environment) throws Exception {

    }

    @Override
    public void initialize(Bootstrap<?> bootstrap) {

    }

    @Override
    public DataSourceFactory getDataSourceFactory(CONFIGURATION configuration) {
        return null;
    }
}
