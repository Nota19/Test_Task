package ru.hmel.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import ru.hmel.NoSuchElectroTypeException;

import ru.hmel.model.ElectroType;
import ru.hmel.model.impl.ElectroTypeImpl;
import ru.hmel.model.impl.ElectroTypeModelImpl;

import ru.hmel.service.persistence.ElectroTypePersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the electro type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Hmel Max
 * @see ElectroTypePersistence
 * @see ElectroTypeUtil
 * @generated
 */
public class ElectroTypePersistenceImpl extends BasePersistenceImpl<ElectroType>
    implements ElectroTypePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link ElectroTypeUtil} to access the electro type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = ElectroTypeImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ElectroTypeModelImpl.ENTITY_CACHE_ENABLED,
            ElectroTypeModelImpl.FINDER_CACHE_ENABLED, ElectroTypeImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ElectroTypeModelImpl.ENTITY_CACHE_ENABLED,
            ElectroTypeModelImpl.FINDER_CACHE_ENABLED, ElectroTypeImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ElectroTypeModelImpl.ENTITY_CACHE_ENABLED,
            ElectroTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_ELECTROTYPE = "SELECT electroType FROM ElectroType electroType";
    private static final String _SQL_COUNT_ELECTROTYPE = "SELECT COUNT(electroType) FROM ElectroType electroType";
    private static final String _ORDER_BY_ENTITY_ALIAS = "electroType.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ElectroType exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(ElectroTypePersistenceImpl.class);
    private static ElectroType _nullElectroType = new ElectroTypeImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<ElectroType> toCacheModel() {
                return _nullElectroTypeCacheModel;
            }
        };

    private static CacheModel<ElectroType> _nullElectroTypeCacheModel = new CacheModel<ElectroType>() {
            @Override
            public ElectroType toEntityModel() {
                return _nullElectroType;
            }
        };

    public ElectroTypePersistenceImpl() {
        setModelClass(ElectroType.class);
    }

    /**
     * Caches the electro type in the entity cache if it is enabled.
     *
     * @param electroType the electro type
     */
    @Override
    public void cacheResult(ElectroType electroType) {
        EntityCacheUtil.putResult(ElectroTypeModelImpl.ENTITY_CACHE_ENABLED,
            ElectroTypeImpl.class, electroType.getPrimaryKey(), electroType);

        electroType.resetOriginalValues();
    }

    /**
     * Caches the electro types in the entity cache if it is enabled.
     *
     * @param electroTypes the electro types
     */
    @Override
    public void cacheResult(List<ElectroType> electroTypes) {
        for (ElectroType electroType : electroTypes) {
            if (EntityCacheUtil.getResult(
                        ElectroTypeModelImpl.ENTITY_CACHE_ENABLED,
                        ElectroTypeImpl.class, electroType.getPrimaryKey()) == null) {
                cacheResult(electroType);
            } else {
                electroType.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all electro types.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(ElectroTypeImpl.class.getName());
        }

        EntityCacheUtil.clearCache(ElectroTypeImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the electro type.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(ElectroType electroType) {
        EntityCacheUtil.removeResult(ElectroTypeModelImpl.ENTITY_CACHE_ENABLED,
            ElectroTypeImpl.class, electroType.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<ElectroType> electroTypes) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (ElectroType electroType : electroTypes) {
            EntityCacheUtil.removeResult(ElectroTypeModelImpl.ENTITY_CACHE_ENABLED,
                ElectroTypeImpl.class, electroType.getPrimaryKey());
        }
    }

    /**
     * Creates a new electro type with the primary key. Does not add the electro type to the database.
     *
     * @param electro_type_id the primary key for the new electro type
     * @return the new electro type
     */
    @Override
    public ElectroType create(long electro_type_id) {
        ElectroType electroType = new ElectroTypeImpl();

        electroType.setNew(true);
        electroType.setPrimaryKey(electro_type_id);

        return electroType;
    }

    /**
     * Removes the electro type with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param electro_type_id the primary key of the electro type
     * @return the electro type that was removed
     * @throws ru.hmel.NoSuchElectroTypeException if a electro type with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ElectroType remove(long electro_type_id)
        throws NoSuchElectroTypeException, SystemException {
        return remove((Serializable) electro_type_id);
    }

    /**
     * Removes the electro type with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the electro type
     * @return the electro type that was removed
     * @throws ru.hmel.NoSuchElectroTypeException if a electro type with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ElectroType remove(Serializable primaryKey)
        throws NoSuchElectroTypeException, SystemException {
        Session session = null;

        try {
            session = openSession();

            ElectroType electroType = (ElectroType) session.get(ElectroTypeImpl.class,
                    primaryKey);

            if (electroType == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchElectroTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(electroType);
        } catch (NoSuchElectroTypeException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected ElectroType removeImpl(ElectroType electroType)
        throws SystemException {
        electroType = toUnwrappedModel(electroType);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(electroType)) {
                electroType = (ElectroType) session.get(ElectroTypeImpl.class,
                        electroType.getPrimaryKeyObj());
            }

            if (electroType != null) {
                session.delete(electroType);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (electroType != null) {
            clearCache(electroType);
        }

        return electroType;
    }

    @Override
    public ElectroType updateImpl(ru.hmel.model.ElectroType electroType)
        throws SystemException {
        electroType = toUnwrappedModel(electroType);

        boolean isNew = electroType.isNew();

        Session session = null;

        try {
            session = openSession();

            if (electroType.isNew()) {
                session.save(electroType);

                electroType.setNew(false);
            } else {
                session.merge(electroType);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(ElectroTypeModelImpl.ENTITY_CACHE_ENABLED,
            ElectroTypeImpl.class, electroType.getPrimaryKey(), electroType);

        return electroType;
    }

    protected ElectroType toUnwrappedModel(ElectroType electroType) {
        if (electroType instanceof ElectroTypeImpl) {
            return electroType;
        }

        ElectroTypeImpl electroTypeImpl = new ElectroTypeImpl();

        electroTypeImpl.setNew(electroType.isNew());
        electroTypeImpl.setPrimaryKey(electroType.getPrimaryKey());

        electroTypeImpl.setElectro_type_id(electroType.getElectro_type_id());
        electroTypeImpl.setName(electroType.getName());

        return electroTypeImpl;
    }

    /**
     * Returns the electro type with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the electro type
     * @return the electro type
     * @throws ru.hmel.NoSuchElectroTypeException if a electro type with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ElectroType findByPrimaryKey(Serializable primaryKey)
        throws NoSuchElectroTypeException, SystemException {
        ElectroType electroType = fetchByPrimaryKey(primaryKey);

        if (electroType == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchElectroTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return electroType;
    }

    /**
     * Returns the electro type with the primary key or throws a {@link ru.hmel.NoSuchElectroTypeException} if it could not be found.
     *
     * @param electro_type_id the primary key of the electro type
     * @return the electro type
     * @throws ru.hmel.NoSuchElectroTypeException if a electro type with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ElectroType findByPrimaryKey(long electro_type_id)
        throws NoSuchElectroTypeException, SystemException {
        return findByPrimaryKey((Serializable) electro_type_id);
    }

    /**
     * Returns the electro type with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the electro type
     * @return the electro type, or <code>null</code> if a electro type with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ElectroType fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        ElectroType electroType = (ElectroType) EntityCacheUtil.getResult(ElectroTypeModelImpl.ENTITY_CACHE_ENABLED,
                ElectroTypeImpl.class, primaryKey);

        if (electroType == _nullElectroType) {
            return null;
        }

        if (electroType == null) {
            Session session = null;

            try {
                session = openSession();

                electroType = (ElectroType) session.get(ElectroTypeImpl.class,
                        primaryKey);

                if (electroType != null) {
                    cacheResult(electroType);
                } else {
                    EntityCacheUtil.putResult(ElectroTypeModelImpl.ENTITY_CACHE_ENABLED,
                        ElectroTypeImpl.class, primaryKey, _nullElectroType);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(ElectroTypeModelImpl.ENTITY_CACHE_ENABLED,
                    ElectroTypeImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return electroType;
    }

    /**
     * Returns the electro type with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param electro_type_id the primary key of the electro type
     * @return the electro type, or <code>null</code> if a electro type with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ElectroType fetchByPrimaryKey(long electro_type_id)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) electro_type_id);
    }

    /**
     * Returns all the electro types.
     *
     * @return the electro types
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<ElectroType> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the electro types.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.ElectroTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of electro types
     * @param end the upper bound of the range of electro types (not inclusive)
     * @return the range of electro types
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<ElectroType> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the electro types.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.ElectroTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of electro types
     * @param end the upper bound of the range of electro types (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of electro types
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<ElectroType> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<ElectroType> list = (List<ElectroType>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ELECTROTYPE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ELECTROTYPE;

                if (pagination) {
                    sql = sql.concat(ElectroTypeModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<ElectroType>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<ElectroType>(list);
                } else {
                    list = (List<ElectroType>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the electro types from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (ElectroType electroType : findAll()) {
            remove(electroType);
        }
    }

    /**
     * Returns the number of electro types.
     *
     * @return the number of electro types
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_ELECTROTYPE);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the electro type persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.ru.hmel.model.ElectroType")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<ElectroType>> listenersList = new ArrayList<ModelListener<ElectroType>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<ElectroType>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(ElectroTypeImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
