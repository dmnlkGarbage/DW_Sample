package com.dmnlk.doma;

import org.seasar.doma.SingletonConfig;
import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.dialect.Dialect;
import org.seasar.doma.jdbc.dialect.PostgresDialect;

import javax.sql.DataSource;

/**
 * @author dmnlk
 */
@SingletonConfig
public class AppConfig implements Config {
    private static final AppConfig CONFIG = new AppConfig();
    private final Dialect dialect;
    @Override
    public DataSource getDataSource() {
        return null;
    }

    @Override
    public Dialect getDialect() {
        return dialect;
    }

    private AppConfig() {
        dialect = new PostgresDialect();
    }

    public static AppConfig singleton() {
        return CONFIG;
    }
}
