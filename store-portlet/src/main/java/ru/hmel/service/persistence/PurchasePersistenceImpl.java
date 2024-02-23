package ru.hmel.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import ru.hmel.NoSuchPurchaseException;

import ru.hmel.model.Purchase;
import ru.hmel.model.impl.PurchaseImpl;
import ru.hmel.model.impl.PurchaseModelImpl;

import ru.hmel.service.persistence.PurchasePersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the purchase service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Hmel Max
 * @see PurchasePersistence
 * @see PurchaseUtil
 * @generated
 */
public class PurchasePersistenceImpl extends BasePersistenceImpl<Purchase>
    implements PurchasePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link PurchaseUtil} to access the purchase persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = PurchaseImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PurchaseModelImpl.ENTITY_CACHE_ENABLED,
            PurchaseModelImpl.FINDER_CACHE_ENABLED, PurchaseImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PurchaseModelImpl.ENTITY_CACHE_ENABLED,
            PurchaseModelImpl.FINDER_CACHE_ENABLED, PurchaseImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PurchaseModelImpl.ENTITY_CACHE_ENABLED,
            PurchaseModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ELECTRONICS_ID =
        new FinderPath(PurchaseModelImpl.ENTITY_CACHE_ENABLED,
            PurchaseModelImpl.FINDER_CACHE_ENABLED, PurchaseImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByelectronics_id",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ELECTRONICS_ID =
        new FinderPath(PurchaseModelImpl.ENTITY_CACHE_ENABLED,
            PurchaseModelImpl.FINDER_CACHE_ENABLED, PurchaseImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByelectronics_id",
            new String[] { Long.class.getName() },
            PurchaseModelImpl.ELECTRO_ID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_ELECTRONICS_ID = new FinderPath(PurchaseModelImpl.ENTITY_CACHE_ENABLED,
            PurchaseModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByelectronics_id",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_ELECTRONICS_ID_ELECTRO_ID_2 = "purchase.electro_id = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_EMPLOYEE_ID =
        new FinderPath(PurchaseModelImpl.ENTITY_CACHE_ENABLED,
            PurchaseModelImpl.FINDER_CACHE_ENABLED, PurchaseImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByemployee_id",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPLOYEE_ID =
        new FinderPath(PurchaseModelImpl.ENTITY_CACHE_ENABLED,
            PurchaseModelImpl.FINDER_CACHE_ENABLED, PurchaseImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByemployee_id",
            new String[] { Long.class.getName() },
            PurchaseModelImpl.EMPLOYEE_ID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_EMPLOYEE_ID = new FinderPath(PurchaseModelImpl.ENTITY_CACHE_ENABLED,
            PurchaseModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByemployee_id",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_EMPLOYEE_ID_EMPLOYEE_ID_2 = "purchase.employee_id = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PURCHASE_TYPE_ID =
        new FinderPath(PurchaseModelImpl.ENTITY_CACHE_ENABLED,
            PurchaseModelImpl.FINDER_CACHE_ENABLED, PurchaseImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBypurchase_type_id",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PURCHASE_TYPE_ID =
        new FinderPath(PurchaseModelImpl.ENTITY_CACHE_ENABLED,
            PurchaseModelImpl.FINDER_CACHE_ENABLED, PurchaseImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findBypurchase_type_id", new String[] { Long.class.getName() },
            PurchaseModelImpl.TYPE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_PURCHASE_TYPE_ID = new FinderPath(PurchaseModelImpl.ENTITY_CACHE_ENABLED,
            PurchaseModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countBypurchase_type_id", new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_PURCHASE_TYPE_ID_TYPE_2 = "purchase.type = ?";
    private static final String _SQL_SELECT_PURCHASE = "SELECT purchase FROM Purchase purchase";
    private static final String _SQL_SELECT_PURCHASE_WHERE = "SELECT purchase FROM Purchase purchase WHERE ";
    private static final String _SQL_COUNT_PURCHASE = "SELECT COUNT(purchase) FROM Purchase purchase";
    private static final String _SQL_COUNT_PURCHASE_WHERE = "SELECT COUNT(purchase) FROM Purchase purchase WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "purchase.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Purchase exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Purchase exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(PurchasePersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "type"
            });
    private static Purchase _nullPurchase = new PurchaseImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Purchase> toCacheModel() {
                return _nullPurchaseCacheModel;
            }
        };

    private static CacheModel<Purchase> _nullPurchaseCacheModel = new CacheModel<Purchase>() {
            @Override
            public Purchase toEntityModel() {
                return _nullPurchase;
            }
        };

    public PurchasePersistenceImpl() {
        setModelClass(Purchase.class);
    }

    /**
     * Returns all the purchases where electro_id = &#63;.
     *
     * @param electro_id the electro_id
     * @return the matching purchases
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Purchase> findByelectronics_id(long electro_id)
        throws SystemException {
        return findByelectronics_id(electro_id, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the purchases where electro_id = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.PurchaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param electro_id the electro_id
     * @param start the lower bound of the range of purchases
     * @param end the upper bound of the range of purchases (not inclusive)
     * @return the range of matching purchases
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Purchase> findByelectronics_id(long electro_id, int start,
        int end) throws SystemException {
        return findByelectronics_id(electro_id, start, end, null);
    }

    /**
     * Returns an ordered range of all the purchases where electro_id = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.PurchaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param electro_id the electro_id
     * @param start the lower bound of the range of purchases
     * @param end the upper bound of the range of purchases (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching purchases
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Purchase> findByelectronics_id(long electro_id, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ELECTRONICS_ID;
            finderArgs = new Object[] { electro_id };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ELECTRONICS_ID;
            finderArgs = new Object[] { electro_id, start, end, orderByComparator };
        }

        List<Purchase> list = (List<Purchase>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Purchase purchase : list) {
                if ((electro_id != purchase.getElectro_id())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_PURCHASE_WHERE);

            query.append(_FINDER_COLUMN_ELECTRONICS_ID_ELECTRO_ID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(PurchaseModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(electro_id);

                if (!pagination) {
                    list = (List<Purchase>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Purchase>(list);
                } else {
                    list = (List<Purchase>) QueryUtil.list(q, getDialect(),
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
     * Returns the first purchase in the ordered set where electro_id = &#63;.
     *
     * @param electro_id the electro_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching purchase
     * @throws ru.hmel.NoSuchPurchaseException if a matching purchase could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Purchase findByelectronics_id_First(long electro_id,
        OrderByComparator orderByComparator)
        throws NoSuchPurchaseException, SystemException {
        Purchase purchase = fetchByelectronics_id_First(electro_id,
                orderByComparator);

        if (purchase != null) {
            return purchase;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("electro_id=");
        msg.append(electro_id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPurchaseException(msg.toString());
    }

    /**
     * Returns the first purchase in the ordered set where electro_id = &#63;.
     *
     * @param electro_id the electro_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching purchase, or <code>null</code> if a matching purchase could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Purchase fetchByelectronics_id_First(long electro_id,
        OrderByComparator orderByComparator) throws SystemException {
        List<Purchase> list = findByelectronics_id(electro_id, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last purchase in the ordered set where electro_id = &#63;.
     *
     * @param electro_id the electro_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching purchase
     * @throws ru.hmel.NoSuchPurchaseException if a matching purchase could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Purchase findByelectronics_id_Last(long electro_id,
        OrderByComparator orderByComparator)
        throws NoSuchPurchaseException, SystemException {
        Purchase purchase = fetchByelectronics_id_Last(electro_id,
                orderByComparator);

        if (purchase != null) {
            return purchase;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("electro_id=");
        msg.append(electro_id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPurchaseException(msg.toString());
    }

    /**
     * Returns the last purchase in the ordered set where electro_id = &#63;.
     *
     * @param electro_id the electro_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching purchase, or <code>null</code> if a matching purchase could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Purchase fetchByelectronics_id_Last(long electro_id,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByelectronics_id(electro_id);

        if (count == 0) {
            return null;
        }

        List<Purchase> list = findByelectronics_id(electro_id, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the purchases before and after the current purchase in the ordered set where electro_id = &#63;.
     *
     * @param purchase_id the primary key of the current purchase
     * @param electro_id the electro_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next purchase
     * @throws ru.hmel.NoSuchPurchaseException if a purchase with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Purchase[] findByelectronics_id_PrevAndNext(long purchase_id,
        long electro_id, OrderByComparator orderByComparator)
        throws NoSuchPurchaseException, SystemException {
        Purchase purchase = findByPrimaryKey(purchase_id);

        Session session = null;

        try {
            session = openSession();

            Purchase[] array = new PurchaseImpl[3];

            array[0] = getByelectronics_id_PrevAndNext(session, purchase,
                    electro_id, orderByComparator, true);

            array[1] = purchase;

            array[2] = getByelectronics_id_PrevAndNext(session, purchase,
                    electro_id, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Purchase getByelectronics_id_PrevAndNext(Session session,
        Purchase purchase, long electro_id,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_PURCHASE_WHERE);

        query.append(_FINDER_COLUMN_ELECTRONICS_ID_ELECTRO_ID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(PurchaseModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(electro_id);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(purchase);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Purchase> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the purchases where electro_id = &#63; from the database.
     *
     * @param electro_id the electro_id
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByelectronics_id(long electro_id)
        throws SystemException {
        for (Purchase purchase : findByelectronics_id(electro_id,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(purchase);
        }
    }

    /**
     * Returns the number of purchases where electro_id = &#63;.
     *
     * @param electro_id the electro_id
     * @return the number of matching purchases
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByelectronics_id(long electro_id) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_ELECTRONICS_ID;

        Object[] finderArgs = new Object[] { electro_id };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_PURCHASE_WHERE);

            query.append(_FINDER_COLUMN_ELECTRONICS_ID_ELECTRO_ID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(electro_id);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the purchases where employee_id = &#63;.
     *
     * @param employee_id the employee_id
     * @return the matching purchases
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Purchase> findByemployee_id(long employee_id)
        throws SystemException {
        return findByemployee_id(employee_id, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the purchases where employee_id = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.PurchaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param employee_id the employee_id
     * @param start the lower bound of the range of purchases
     * @param end the upper bound of the range of purchases (not inclusive)
     * @return the range of matching purchases
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Purchase> findByemployee_id(long employee_id, int start, int end)
        throws SystemException {
        return findByemployee_id(employee_id, start, end, null);
    }

    /**
     * Returns an ordered range of all the purchases where employee_id = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.PurchaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param employee_id the employee_id
     * @param start the lower bound of the range of purchases
     * @param end the upper bound of the range of purchases (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching purchases
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Purchase> findByemployee_id(long employee_id, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPLOYEE_ID;
            finderArgs = new Object[] { employee_id };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_EMPLOYEE_ID;
            finderArgs = new Object[] { employee_id, start, end, orderByComparator };
        }

        List<Purchase> list = (List<Purchase>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Purchase purchase : list) {
                if ((employee_id != purchase.getEmployee_id())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_PURCHASE_WHERE);

            query.append(_FINDER_COLUMN_EMPLOYEE_ID_EMPLOYEE_ID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(PurchaseModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(employee_id);

                if (!pagination) {
                    list = (List<Purchase>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Purchase>(list);
                } else {
                    list = (List<Purchase>) QueryUtil.list(q, getDialect(),
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
     * Returns the first purchase in the ordered set where employee_id = &#63;.
     *
     * @param employee_id the employee_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching purchase
     * @throws ru.hmel.NoSuchPurchaseException if a matching purchase could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Purchase findByemployee_id_First(long employee_id,
        OrderByComparator orderByComparator)
        throws NoSuchPurchaseException, SystemException {
        Purchase purchase = fetchByemployee_id_First(employee_id,
                orderByComparator);

        if (purchase != null) {
            return purchase;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("employee_id=");
        msg.append(employee_id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPurchaseException(msg.toString());
    }

    /**
     * Returns the first purchase in the ordered set where employee_id = &#63;.
     *
     * @param employee_id the employee_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching purchase, or <code>null</code> if a matching purchase could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Purchase fetchByemployee_id_First(long employee_id,
        OrderByComparator orderByComparator) throws SystemException {
        List<Purchase> list = findByemployee_id(employee_id, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last purchase in the ordered set where employee_id = &#63;.
     *
     * @param employee_id the employee_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching purchase
     * @throws ru.hmel.NoSuchPurchaseException if a matching purchase could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Purchase findByemployee_id_Last(long employee_id,
        OrderByComparator orderByComparator)
        throws NoSuchPurchaseException, SystemException {
        Purchase purchase = fetchByemployee_id_Last(employee_id,
                orderByComparator);

        if (purchase != null) {
            return purchase;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("employee_id=");
        msg.append(employee_id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPurchaseException(msg.toString());
    }

    /**
     * Returns the last purchase in the ordered set where employee_id = &#63;.
     *
     * @param employee_id the employee_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching purchase, or <code>null</code> if a matching purchase could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Purchase fetchByemployee_id_Last(long employee_id,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByemployee_id(employee_id);

        if (count == 0) {
            return null;
        }

        List<Purchase> list = findByemployee_id(employee_id, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the purchases before and after the current purchase in the ordered set where employee_id = &#63;.
     *
     * @param purchase_id the primary key of the current purchase
     * @param employee_id the employee_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next purchase
     * @throws ru.hmel.NoSuchPurchaseException if a purchase with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Purchase[] findByemployee_id_PrevAndNext(long purchase_id,
        long employee_id, OrderByComparator orderByComparator)
        throws NoSuchPurchaseException, SystemException {
        Purchase purchase = findByPrimaryKey(purchase_id);

        Session session = null;

        try {
            session = openSession();

            Purchase[] array = new PurchaseImpl[3];

            array[0] = getByemployee_id_PrevAndNext(session, purchase,
                    employee_id, orderByComparator, true);

            array[1] = purchase;

            array[2] = getByemployee_id_PrevAndNext(session, purchase,
                    employee_id, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Purchase getByemployee_id_PrevAndNext(Session session,
        Purchase purchase, long employee_id,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_PURCHASE_WHERE);

        query.append(_FINDER_COLUMN_EMPLOYEE_ID_EMPLOYEE_ID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(PurchaseModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(employee_id);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(purchase);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Purchase> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the purchases where employee_id = &#63; from the database.
     *
     * @param employee_id the employee_id
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByemployee_id(long employee_id) throws SystemException {
        for (Purchase purchase : findByemployee_id(employee_id,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(purchase);
        }
    }

    /**
     * Returns the number of purchases where employee_id = &#63;.
     *
     * @param employee_id the employee_id
     * @return the number of matching purchases
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByemployee_id(long employee_id) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_EMPLOYEE_ID;

        Object[] finderArgs = new Object[] { employee_id };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_PURCHASE_WHERE);

            query.append(_FINDER_COLUMN_EMPLOYEE_ID_EMPLOYEE_ID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(employee_id);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the purchases where type = &#63;.
     *
     * @param type the type
     * @return the matching purchases
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Purchase> findBypurchase_type_id(long type)
        throws SystemException {
        return findBypurchase_type_id(type, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the purchases where type = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.PurchaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param type the type
     * @param start the lower bound of the range of purchases
     * @param end the upper bound of the range of purchases (not inclusive)
     * @return the range of matching purchases
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Purchase> findBypurchase_type_id(long type, int start, int end)
        throws SystemException {
        return findBypurchase_type_id(type, start, end, null);
    }

    /**
     * Returns an ordered range of all the purchases where type = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.PurchaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param type the type
     * @param start the lower bound of the range of purchases
     * @param end the upper bound of the range of purchases (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching purchases
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Purchase> findBypurchase_type_id(long type, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PURCHASE_TYPE_ID;
            finderArgs = new Object[] { type };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PURCHASE_TYPE_ID;
            finderArgs = new Object[] { type, start, end, orderByComparator };
        }

        List<Purchase> list = (List<Purchase>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Purchase purchase : list) {
                if ((type != purchase.getType())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_PURCHASE_WHERE);

            query.append(_FINDER_COLUMN_PURCHASE_TYPE_ID_TYPE_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(PurchaseModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(type);

                if (!pagination) {
                    list = (List<Purchase>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Purchase>(list);
                } else {
                    list = (List<Purchase>) QueryUtil.list(q, getDialect(),
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
     * Returns the first purchase in the ordered set where type = &#63;.
     *
     * @param type the type
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching purchase
     * @throws ru.hmel.NoSuchPurchaseException if a matching purchase could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Purchase findBypurchase_type_id_First(long type,
        OrderByComparator orderByComparator)
        throws NoSuchPurchaseException, SystemException {
        Purchase purchase = fetchBypurchase_type_id_First(type,
                orderByComparator);

        if (purchase != null) {
            return purchase;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("type=");
        msg.append(type);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPurchaseException(msg.toString());
    }

    /**
     * Returns the first purchase in the ordered set where type = &#63;.
     *
     * @param type the type
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching purchase, or <code>null</code> if a matching purchase could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Purchase fetchBypurchase_type_id_First(long type,
        OrderByComparator orderByComparator) throws SystemException {
        List<Purchase> list = findBypurchase_type_id(type, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last purchase in the ordered set where type = &#63;.
     *
     * @param type the type
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching purchase
     * @throws ru.hmel.NoSuchPurchaseException if a matching purchase could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Purchase findBypurchase_type_id_Last(long type,
        OrderByComparator orderByComparator)
        throws NoSuchPurchaseException, SystemException {
        Purchase purchase = fetchBypurchase_type_id_Last(type, orderByComparator);

        if (purchase != null) {
            return purchase;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("type=");
        msg.append(type);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPurchaseException(msg.toString());
    }

    /**
     * Returns the last purchase in the ordered set where type = &#63;.
     *
     * @param type the type
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching purchase, or <code>null</code> if a matching purchase could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Purchase fetchBypurchase_type_id_Last(long type,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countBypurchase_type_id(type);

        if (count == 0) {
            return null;
        }

        List<Purchase> list = findBypurchase_type_id(type, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the purchases before and after the current purchase in the ordered set where type = &#63;.
     *
     * @param purchase_id the primary key of the current purchase
     * @param type the type
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next purchase
     * @throws ru.hmel.NoSuchPurchaseException if a purchase with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Purchase[] findBypurchase_type_id_PrevAndNext(long purchase_id,
        long type, OrderByComparator orderByComparator)
        throws NoSuchPurchaseException, SystemException {
        Purchase purchase = findByPrimaryKey(purchase_id);

        Session session = null;

        try {
            session = openSession();

            Purchase[] array = new PurchaseImpl[3];

            array[0] = getBypurchase_type_id_PrevAndNext(session, purchase,
                    type, orderByComparator, true);

            array[1] = purchase;

            array[2] = getBypurchase_type_id_PrevAndNext(session, purchase,
                    type, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Purchase getBypurchase_type_id_PrevAndNext(Session session,
        Purchase purchase, long type, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_PURCHASE_WHERE);

        query.append(_FINDER_COLUMN_PURCHASE_TYPE_ID_TYPE_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(PurchaseModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(type);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(purchase);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Purchase> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the purchases where type = &#63; from the database.
     *
     * @param type the type
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeBypurchase_type_id(long type) throws SystemException {
        for (Purchase purchase : findBypurchase_type_id(type,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(purchase);
        }
    }

    /**
     * Returns the number of purchases where type = &#63;.
     *
     * @param type the type
     * @return the number of matching purchases
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countBypurchase_type_id(long type) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_PURCHASE_TYPE_ID;

        Object[] finderArgs = new Object[] { type };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_PURCHASE_WHERE);

            query.append(_FINDER_COLUMN_PURCHASE_TYPE_ID_TYPE_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(type);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the purchase in the entity cache if it is enabled.
     *
     * @param purchase the purchase
     */
    @Override
    public void cacheResult(Purchase purchase) {
        EntityCacheUtil.putResult(PurchaseModelImpl.ENTITY_CACHE_ENABLED,
            PurchaseImpl.class, purchase.getPrimaryKey(), purchase);

        purchase.resetOriginalValues();
    }

    /**
     * Caches the purchases in the entity cache if it is enabled.
     *
     * @param purchases the purchases
     */
    @Override
    public void cacheResult(List<Purchase> purchases) {
        for (Purchase purchase : purchases) {
            if (EntityCacheUtil.getResult(
                        PurchaseModelImpl.ENTITY_CACHE_ENABLED,
                        PurchaseImpl.class, purchase.getPrimaryKey()) == null) {
                cacheResult(purchase);
            } else {
                purchase.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all purchases.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(PurchaseImpl.class.getName());
        }

        EntityCacheUtil.clearCache(PurchaseImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the purchase.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Purchase purchase) {
        EntityCacheUtil.removeResult(PurchaseModelImpl.ENTITY_CACHE_ENABLED,
            PurchaseImpl.class, purchase.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Purchase> purchases) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Purchase purchase : purchases) {
            EntityCacheUtil.removeResult(PurchaseModelImpl.ENTITY_CACHE_ENABLED,
                PurchaseImpl.class, purchase.getPrimaryKey());
        }
    }

    /**
     * Creates a new purchase with the primary key. Does not add the purchase to the database.
     *
     * @param purchase_id the primary key for the new purchase
     * @return the new purchase
     */
    @Override
    public Purchase create(long purchase_id) {
        Purchase purchase = new PurchaseImpl();

        purchase.setNew(true);
        purchase.setPrimaryKey(purchase_id);

        return purchase;
    }

    /**
     * Removes the purchase with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param purchase_id the primary key of the purchase
     * @return the purchase that was removed
     * @throws ru.hmel.NoSuchPurchaseException if a purchase with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Purchase remove(long purchase_id)
        throws NoSuchPurchaseException, SystemException {
        return remove((Serializable) purchase_id);
    }

    /**
     * Removes the purchase with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the purchase
     * @return the purchase that was removed
     * @throws ru.hmel.NoSuchPurchaseException if a purchase with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Purchase remove(Serializable primaryKey)
        throws NoSuchPurchaseException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Purchase purchase = (Purchase) session.get(PurchaseImpl.class,
                    primaryKey);

            if (purchase == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchPurchaseException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(purchase);
        } catch (NoSuchPurchaseException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Purchase removeImpl(Purchase purchase) throws SystemException {
        purchase = toUnwrappedModel(purchase);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(purchase)) {
                purchase = (Purchase) session.get(PurchaseImpl.class,
                        purchase.getPrimaryKeyObj());
            }

            if (purchase != null) {
                session.delete(purchase);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (purchase != null) {
            clearCache(purchase);
        }

        return purchase;
    }

    @Override
    public Purchase updateImpl(ru.hmel.model.Purchase purchase)
        throws SystemException {
        purchase = toUnwrappedModel(purchase);

        boolean isNew = purchase.isNew();

        PurchaseModelImpl purchaseModelImpl = (PurchaseModelImpl) purchase;

        Session session = null;

        try {
            session = openSession();

            if (purchase.isNew()) {
                session.save(purchase);

                purchase.setNew(false);
            } else {
                session.merge(purchase);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !PurchaseModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((purchaseModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ELECTRONICS_ID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        purchaseModelImpl.getOriginalElectro_id()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ELECTRONICS_ID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ELECTRONICS_ID,
                    args);

                args = new Object[] { purchaseModelImpl.getElectro_id() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ELECTRONICS_ID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ELECTRONICS_ID,
                    args);
            }

            if ((purchaseModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPLOYEE_ID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        purchaseModelImpl.getOriginalEmployee_id()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_EMPLOYEE_ID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPLOYEE_ID,
                    args);

                args = new Object[] { purchaseModelImpl.getEmployee_id() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_EMPLOYEE_ID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPLOYEE_ID,
                    args);
            }

            if ((purchaseModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PURCHASE_TYPE_ID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { purchaseModelImpl.getOriginalType() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PURCHASE_TYPE_ID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PURCHASE_TYPE_ID,
                    args);

                args = new Object[] { purchaseModelImpl.getType() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PURCHASE_TYPE_ID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PURCHASE_TYPE_ID,
                    args);
            }
        }

        EntityCacheUtil.putResult(PurchaseModelImpl.ENTITY_CACHE_ENABLED,
            PurchaseImpl.class, purchase.getPrimaryKey(), purchase);

        return purchase;
    }

    protected Purchase toUnwrappedModel(Purchase purchase) {
        if (purchase instanceof PurchaseImpl) {
            return purchase;
        }

        PurchaseImpl purchaseImpl = new PurchaseImpl();

        purchaseImpl.setNew(purchase.isNew());
        purchaseImpl.setPrimaryKey(purchase.getPrimaryKey());

        purchaseImpl.setPurchase_id(purchase.getPurchase_id());
        purchaseImpl.setElectro_id(purchase.getElectro_id());
        purchaseImpl.setEmployee_id(purchase.getEmployee_id());
        purchaseImpl.setPurchaseDate(purchase.getPurchaseDate());
        purchaseImpl.setType(purchase.getType());

        return purchaseImpl;
    }

    /**
     * Returns the purchase with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the purchase
     * @return the purchase
     * @throws ru.hmel.NoSuchPurchaseException if a purchase with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Purchase findByPrimaryKey(Serializable primaryKey)
        throws NoSuchPurchaseException, SystemException {
        Purchase purchase = fetchByPrimaryKey(primaryKey);

        if (purchase == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchPurchaseException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return purchase;
    }

    /**
     * Returns the purchase with the primary key or throws a {@link ru.hmel.NoSuchPurchaseException} if it could not be found.
     *
     * @param purchase_id the primary key of the purchase
     * @return the purchase
     * @throws ru.hmel.NoSuchPurchaseException if a purchase with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Purchase findByPrimaryKey(long purchase_id)
        throws NoSuchPurchaseException, SystemException {
        return findByPrimaryKey((Serializable) purchase_id);
    }

    /**
     * Returns the purchase with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the purchase
     * @return the purchase, or <code>null</code> if a purchase with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Purchase fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Purchase purchase = (Purchase) EntityCacheUtil.getResult(PurchaseModelImpl.ENTITY_CACHE_ENABLED,
                PurchaseImpl.class, primaryKey);

        if (purchase == _nullPurchase) {
            return null;
        }

        if (purchase == null) {
            Session session = null;

            try {
                session = openSession();

                purchase = (Purchase) session.get(PurchaseImpl.class, primaryKey);

                if (purchase != null) {
                    cacheResult(purchase);
                } else {
                    EntityCacheUtil.putResult(PurchaseModelImpl.ENTITY_CACHE_ENABLED,
                        PurchaseImpl.class, primaryKey, _nullPurchase);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(PurchaseModelImpl.ENTITY_CACHE_ENABLED,
                    PurchaseImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return purchase;
    }

    /**
     * Returns the purchase with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param purchase_id the primary key of the purchase
     * @return the purchase, or <code>null</code> if a purchase with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Purchase fetchByPrimaryKey(long purchase_id)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) purchase_id);
    }

    /**
     * Returns all the purchases.
     *
     * @return the purchases
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Purchase> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the purchases.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.PurchaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of purchases
     * @param end the upper bound of the range of purchases (not inclusive)
     * @return the range of purchases
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Purchase> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the purchases.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.PurchaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of purchases
     * @param end the upper bound of the range of purchases (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of purchases
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Purchase> findAll(int start, int end,
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

        List<Purchase> list = (List<Purchase>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_PURCHASE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_PURCHASE;

                if (pagination) {
                    sql = sql.concat(PurchaseModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Purchase>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Purchase>(list);
                } else {
                    list = (List<Purchase>) QueryUtil.list(q, getDialect(),
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
     * Removes all the purchases from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Purchase purchase : findAll()) {
            remove(purchase);
        }
    }

    /**
     * Returns the number of purchases.
     *
     * @return the number of purchases
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

                Query q = session.createQuery(_SQL_COUNT_PURCHASE);

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

    @Override
    protected Set<String> getBadColumnNames() {
        return _badColumnNames;
    }

    /**
     * Initializes the purchase persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.ru.hmel.model.Purchase")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Purchase>> listenersList = new ArrayList<ModelListener<Purchase>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Purchase>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(PurchaseImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
