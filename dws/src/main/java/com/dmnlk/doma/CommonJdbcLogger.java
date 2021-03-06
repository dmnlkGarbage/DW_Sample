package com.dmnlk.doma;

import org.apache.log4j.Logger;
import org.seasar.doma.jdbc.JdbcLogger;
import org.seasar.doma.jdbc.Sql;
import org.seasar.doma.jdbc.SqlExecutionSkipCause;

import java.sql.SQLException;

/**
 * @author dmnlk
 */
public class CommonJdbcLogger implements JdbcLogger {
    private final Logger logger = Logger.getLogger(getClass());

    @Override
    public void logDaoMethodEntering(String callerClassName, String callerMethodName, Object... args) {

    }

    @Override
    public void logDaoMethodExiting(String callerClassName, String callerMethodName, Object result) {

    }

    @Override
    public void logDaoMethodThrowing(String callerClassName, String callerMethodName, RuntimeException e) {

    }

    @Override
    public void logSqlExecutionSkipping(String callerClassName, String callerMethodName, SqlExecutionSkipCause cause) {

    }

    @Override
    public void logSql(String callerClassName, String callerMethodName, Sql<?> sql) {

    }

    @Override
    public void logTransactionBegun(String callerClassName, String callerMethodName, String transactionId) {

    }

    @Override
    public void logTransactionEnded(String callerClassName, String callerMethodName, String transactionId) {

    }

    @Override
    public void logTransactionCommitted(String callerClassName, String callerMethodName, String transactionId) {

    }

    @Override
    public void logTransactionSavepointCreated(String callerClassName, String callerMethodName, String transactionId, String savepointName) {

    }

    @Override
    public void logTransactionRolledback(String callerClassName, String callerMethodName, String transactionId) {

    }

    @Override
    public void logTransactionSavepointRolledback(String callerClassName, String callerMethodName, String transactionId, String savepointName) {

    }

    @Override
    public void logTransactionRollbackFailure(String callerClassName, String callerMethodName, String transactionId, SQLException e) {

    }

    @Override
    public void logAutoCommitEnablingFailure(String callerClassName, String callerMethodName, SQLException e) {

    }

    @Override
    public void logTransactionIsolationSettingFailuer(String callerClassName, String callerMethodName, int transactionIsolationLevel, SQLException e) {

    }

    @Override
    public void logConnectionClosingFailure(String callerClassName, String callerMethodName, SQLException e) {

    }

    @Override
    public void logStatementClosingFailure(String callerClassName, String callerMethodName, SQLException e) {

    }

    @Override
    public void logResultSetClosingFailure(String callerClassName, String callerMethodName, SQLException e) {

    }
}
