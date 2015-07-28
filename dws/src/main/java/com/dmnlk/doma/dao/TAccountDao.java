package com.dmnlk.doma.dao;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;

/**
 * @author dmnlk.
 */
public interface TAccountDao {
    @SqlQuery("select account_id from t_account where account_id = :account_id")
    Integer findById(@Bind("account_id") int id);
}
