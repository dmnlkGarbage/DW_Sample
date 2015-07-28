package com.dmnlk.sample;

import com.dmnlk.doma.dao.TAccountDao;
import io.dropwizard.Application;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.skife.jdbi.v2.DBI;

/**
 * @author dmnlk
 */
public class SampleApplication extends Application<SampleConfiguration> {
    public static void main(String[] args) throws  Exception {
        new SampleApplication().run(args);
    }

    @Override
    public String getName() {
        return "hello";
    }

    @Override
    public void initialize(Bootstrap<SampleConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(SampleConfiguration configuration,
                    Environment environment) {
       final SampleResource resource = new SampleResource(
               configuration.getTemplate(),
               configuration.getDefaultName()
       );

        final TemplateHealthCheck healthCheck = new TemplateHealthCheck(configuration.getTemplate());
        environment.healthChecks().register("template", healthCheck);
        environment.jersey().register(resource);

        final DBIFactory dbiFactory = new DBIFactory();
        final DBI dbi = dbiFactory.build(environment, configuration.getDataSourceFactory(), "postgresql");
        TAccountDao tAccountDao = dbi.onDemand(TAccountDao.class);
    }
}
