package com.dmnlk.doma;

import org.seasar.doma.SingletonConfig;
import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.dialect.Dialect;
import org.seasar.doma.jdbc.dialect.PostgresDialect;
import org.seasar.doma.jdbc.tx.LocalTransactionDataSource;
import org.seasar.doma.jdbc.tx.LocalTransactionManager;
import org.seasar.doma.jdbc.tx.TransactionManager;

import javax.sql.DataSource;

/**
 * @author dmnlk
 */
@SingletonConfig
public class AppConfig implements Config {
    private static final AppConfig CONFIG = new AppConfig();
    private final Dialect dialect;
    private final LocalTransactionDataSource dataSource;
    private final TransactionManager transactionManager;
    @Override
    public DataSource getDataSource() {
        return dataSource;
    }

    @Override
    public Dialect getDialect() {
        return dialect;
    }

    @Override
    public TransactionManager getTransactionManager() {
        return transactionManager;
    }

    private AppConfig() {
        dialect = new PostgresDialect();
        dataSource = new LocalTransactionDataSource("jdbc:postgresql://localhost/localdb", "localuser", null);
        transactionManager = new LocalTransactionManager(dataSource.getLocalTransaction(new CommonJdbcLogger()));
    }

    public static AppConfig singleton() {
        return CONFIG;
    }
}
