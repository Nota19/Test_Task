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

import ru.hmel.NoSuchPurchaseTypeException;

import ru.hmel.model.PurchaseType;
import ru.hmel.model.impl.PurchaseTypeImpl;
import ru.hmel.model.impl.PurchaseTypeModelImpl;

import ru.hmel.service.persistence.PurchaseTypePersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the purchase type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Hmel Max
 * @see PurchaseTypePersistence
 * @see PurchaseTypeUtil
 * @generated
 */
public class PurchaseTypePersistenceImpl extends BasePersistenceImpl<PurchaseType>
    implements PurchaseTypePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link PurchaseTypeUtil} to access the purchase type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = PurchaseTypeImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PurchaseTypeModelImpl.ENTITY_CACHE_ENABLED,
            PurchaseTypeModelImpl.FINDER_CACHE_ENABLED, PurchaseTypeImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PurchaseTypeModelImpl.ENTITY_CACHE_ENABLED,
            PurchaseTypeModelImpl.FINDER_CACHE_ENABLED, PurchaseTypeImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PurchaseTypeModelImpl.ENTITY_CACHE_ENABLED,
            PurchaseTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_PURCHASETYPE = "SELECT purchaseType FROM PurchaseType purchaseType";
    private static final String _SQL_COUNT_PURCHASETYPE = "SELECT COUNT(purchaseType) FROM PurchaseType purchaseType";
    private static final String _ORDER_BY_ENTITY_ALIAS = "purchaseType.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PurchaseType exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(PurchaseTypePersistenceImpl.class);
    private static PurchaseType _nullPurchaseType = new PurchaseTypeImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<PurchaseType> toCacheModel() {
                return _nullPurchaseTypeCacheModel;
            }
        };

    private static CacheModel<PurchaseType> _nullPurchaseTypeCacheModel = new CacheModel<PurchaseType>() {
            @Override
            public PurchaseType toEntityModel() {
                return _nullPurchaseType;
            }
        };

    public PurchaseTypePersistenceImpl() {
        setModelClass(PurchaseType.class);
    }

    /**
     * Caches the purchase type in the entity cache if it is enabled.
     *
     * @param purchaseType the purchase type
     */
    @Override
    public void cacheResult(PurchaseType purchaseType) {
        EntityCacheUtil.putResult(PurchaseTypeModelImpl.ENTITY_CACHE_ENABLED,
            PurchaseTypeImpl.class, purchaseType.getPrimaryKey(), purchaseType);

        purchaseType.resetOriginalValues();
    }

    /**
     * Caches the purchase types in the entity cache if it is enabled.
     *
     * @param purchaseTypes the purchase types
     */
    @Override
    public void cacheResult(List<PurchaseType> purchaseTypes) {
        for (PurchaseType purchaseType : purchaseTypes) {
            if (EntityCacheUtil.getResult(
                        PurchaseTypeModelImpl.ENTITY_CACHE_ENABLED,
                        PurchaseTypeImpl.class, purchaseType.getPrimaryKey()) == null) {
                cacheResult(purchaseType);
            } else {
                purchaseType.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all purchase types.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(PurchaseTypeImpl.class.getName());
        }

        EntityCacheUtil.clearCache(PurchaseTypeImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the purchase type.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(PurchaseType purchaseType) {
        EntityCacheUtil.removeResult(PurchaseTypeModelImpl.ENTITY_CACHE_ENABLED,
            PurchaseTypeImpl.class, purchaseType.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<PurchaseType> purchaseTypes) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (PurchaseType purchaseType : purchaseTypes) {
            EntityCacheUtil.removeResult(PurchaseTypeModelImpl.ENTITY_CACHE_ENABLED,
                PurchaseTypeImpl.class, purchaseType.getPrimaryKey());
        }
    }

    /**
     * Creates a new purchase type with the primary key. Does not add the purchase type to the database.
     *
     * @param purchase_type_id the primary key for the new purchase type
     * @return the new purchase type
     */
    @Override
    public PurchaseType create(long purchase_type_id) {
        PurchaseType purchaseType = new PurchaseTypeImpl();

        purchaseType.setNew(true);
        purchaseType.setPrimaryKey(purchase_type_id);

        return purchaseType;
    }

    /**
     * Removes the purchase type with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param purchase_type_id the primary key of the purchase type
     * @return the purchase type that was removed
     * @throws ru.hmel.NoSuchPurchaseTypeException if a purchase type with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PurchaseType remove(long purchase_type_id)
        throws NoSuchPurchaseTypeException, SystemException {
        return remove((Serializable) purchase_type_id);
    }

    /**
     * Removes the purchase type with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the purchase type
     * @return the purchase type that was removed
     * @throws ru.hmel.NoSuchPurchaseTypeException if a purchase type with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PurchaseType remove(Serializable primaryKey)
        throws NoSuchPurchaseTypeException, SystemException {
        Session session = null;

        try {
            session = openSession();

            PurchaseType purchaseType = (PurchaseType) session.get(PurchaseTypeImpl.class,
                    primaryKey);

            if (purchaseType == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchPurchaseTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(purchaseType);
        } catch (NoSuchPurchaseTypeException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected PurchaseType removeImpl(PurchaseType purchaseType)
        throws SystemException {
        purchaseType = toUnwrappedModel(purchaseType);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(purchaseType)) {
                purchaseType = (PurchaseType) session.get(PurchaseTypeImpl.class,
                        purchaseType.getPrimaryKeyObj());
            }

            if (purchaseType != null) {
                session.delete(purchaseType);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (purchaseType != null) {
            clearCache(purchaseType);
        }

        return purchaseType;
    }

    @Override
    public PurchaseType updateImpl(ru.hmel.model.PurchaseType purchaseType)
        throws SystemException {
        purchaseType = toUnwrappedModel(purchaseType);

        boolean isNew = purchaseType.isNew();

        Session session = null;

        try {
            session = openSession();

            if (purchaseType.isNew()) {
                session.save(purchaseType);

                purchaseType.setNew(false);
            } else {
                session.merge(purchaseType);
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

        EntityCacheUtil.putResult(PurchaseTypeModelImpl.ENTITY_CACHE_ENABLED,
            PurchaseTypeImpl.class, purchaseType.getPrimaryKey(), purchaseType);

        return purchaseType;
    }

    protected PurchaseType toUnwrappedModel(PurchaseType purchaseType) {
        if (purchaseType instanceof PurchaseTypeImpl) {
            return purchaseType;
        }

        PurchaseTypeImpl purchaseTypeImpl = new PurchaseTypeImpl();

        purchaseTypeImpl.setNew(purchaseType.isNew());
        purchaseTypeImpl.setPrimaryKey(purchaseType.getPrimaryKey());

        purchaseTypeImpl.setPurchase_type_id(purchaseType.getPurchase_type_id());
        purchaseTypeImpl.setName(purchaseType.getName());

        return purchaseTypeImpl;
    }

    /**
     * Returns the purchase type with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the purchase type
     * @return the purchase type
     * @throws ru.hmel.NoSuchPurchaseTypeException if a purchase type with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PurchaseType findByPrimaryKey(Serializable primaryKey)
        throws NoSuchPurchaseTypeException, SystemException {
        PurchaseType purchaseType = fetchByPrimaryKey(primaryKey);

        if (purchaseType == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchPurchaseTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return purchaseType;
    }

    /**
     * Returns the purchase type with the primary key or throws a {@link ru.hmel.NoSuchPurchaseTypeException} if it could not be found.
     *
     * @param purchase_type_id the primary key of the purchase type
     * @return the purchase type
     * @throws ru.hmel.NoSuchPurchaseTypeException if a purchase type with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PurchaseType findByPrimaryKey(long purchase_type_id)
        throws NoSuchPurchaseTypeException, SystemException {
        return findByPrimaryKey((Serializable) purchase_type_id);
    }

    /**
     * Returns the purchase type with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the purchase type
     * @return the purchase type, or <code>null</code> if a purchase type with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PurchaseType fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        PurchaseType purchaseType = (PurchaseType) EntityCacheUtil.getResult(PurchaseTypeModelImpl.ENTITY_CACHE_ENABLED,
                PurchaseTypeImpl.class, primaryKey);

        if (purchaseType == _nullPurchaseType) {
            return null;
        }

        if (purchaseType == null) {
            Session session = null;

            try {
                session = openSession();

                purchaseType = (PurchaseType) session.get(PurchaseTypeImpl.class,
                        primaryKey);

                if (purchaseType != null) {
                    cacheResult(purchaseType);
                } else {
                    EntityCacheUtil.putResult(PurchaseTypeModelImpl.ENTITY_CACHE_ENABLED,
                        PurchaseTypeImpl.class, primaryKey, _nullPurchaseType);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(PurchaseTypeModelImpl.ENTITY_CACHE_ENABLED,
                    PurchaseTypeImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return purchaseType;
    }

    /**
     * Returns the purchase type with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param purchase_type_id the primary key of the purchase type
     * @return the purchase type, or <code>null</code> if a purchase type with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PurchaseType fetchByPrimaryKey(long purchase_type_id)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) purchase_type_id);
    }

    /**
     * Returns all the purchase types.
     *
     * @return the purchase types
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PurchaseType> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the purchase types.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.PurchaseTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of purchase types
     * @param end the upper bound of the range of purchase types (not inclusive)
     * @return the range of purchase types
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PurchaseType> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the purchase types.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.PurchaseTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of purchase types
     * @param end the upper bound of the range of purchase types (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of purchase types
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PurchaseType> findAll(int start, int end,
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

        List<PurchaseType> list = (List<PurchaseType>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_PURCHASETYPE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_PURCHASETYPE;

                if (pagination) {
                    sql = sql.concat(PurchaseTypeModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<PurchaseType>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<PurchaseType>(list);
                } else {
                    list = (List<PurchaseType>) QueryUtil.list(q, getDialect(),
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
     * Removes all the purchase types from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (PurchaseType purchaseType : findAll()) {
            remove(purchaseType);
        }
    }

    /**
     * Returns the number of purchase types.
     *
     * @return the number of purchase types
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

                Query q = session.createQuery(_SQL_COUNT_PURCHASETYPE);

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
     * Initializes the purchase type persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.ru.hmel.model.PurchaseType")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<PurchaseType>> listenersList = new ArrayList<ModelListener<PurchaseType>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<PurchaseType>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(PurchaseTypeImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
