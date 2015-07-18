package com.dmnlk.doma;

import org.seasar.doma.SingletonConfig;
import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.dialect.Dialect;
import org.seasar.doma.jdbc.dialect.PostgresDialect;
import org.seasar.doma.jdbc.tx.LocalTransactionDataSource;

import javax.sql.DataSource;

/**
 * @author dmnlk
 */
@SingletonConfig
public class AppConfig implements Config {
    private static final AppConfig CONFIG = new AppConfig();
    private final Dialect dialect;
    private final DataSource dataSource;
    @Override
    public DataSource getDataSource() {
        return dataSource;
    }

    @Override
    public Dialect getDialect() {
        return dialect;
    }

    private AppConfig() {
        dialect = new PostgresDialect();
        dataSource = new LocalTransactionDataSource("jdbc:postgresql://localhost/localdb", "localuser", null);
    }

    public static AppConfig singleton() {   
        return CONFIG;
    }
}
