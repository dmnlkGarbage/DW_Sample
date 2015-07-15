package com.dmnlk.doma;

import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.dialect.Dialect;
import org.seasar.doma.jdbc.dialect.PostgresDialect;

import javax.sql.DataSource;

/**
 * @author dmnlk
 */
public class AppConfig implements Config {
    @Override
    public DataSource getDataSource() {
        return null;
    }

    @Override
    public Dialect getDialect() {
        return new PostgresDialect();
    }

    private AppConfig() {
    }
}
