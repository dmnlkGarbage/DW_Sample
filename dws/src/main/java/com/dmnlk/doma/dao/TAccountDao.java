package com.dmnlk.doma.dao;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;

/**
 * @author dmnlk.
 */
public interface TAccountDao {
    @SqlQuery
    Integer findById(@Bind("account_id") int id);
}
