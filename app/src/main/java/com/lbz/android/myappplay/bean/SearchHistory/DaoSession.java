package com.lbz.android.myappplay.bean.SearchHistory;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.lbz.android.myappplay.bean.SearchHistory.SearchHistory;

import com.lbz.android.myappplay.bean.SearchHistory.SearchHistoryDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig searchHistoryDaoConfig;

    private final SearchHistoryDao searchHistoryDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        searchHistoryDaoConfig = daoConfigMap.get(SearchHistoryDao.class).clone();
        searchHistoryDaoConfig.initIdentityScope(type);

        searchHistoryDao = new SearchHistoryDao(searchHistoryDaoConfig, this);

        registerDao(SearchHistory.class, searchHistoryDao);
    }
    
    public void clear() {
        searchHistoryDaoConfig.getIdentityScope().clear();
    }

    public SearchHistoryDao getSearchHistoryDao() {
        return searchHistoryDao;
    }

}
