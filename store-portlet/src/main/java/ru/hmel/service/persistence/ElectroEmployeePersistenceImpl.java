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
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import ru.hmel.NoSuchElectroEmployeeException;

import ru.hmel.model.ElectroEmployee;
import ru.hmel.model.impl.ElectroEmployeeImpl;
import ru.hmel.model.impl.ElectroEmployeeModelImpl;

import ru.hmel.service.persistence.ElectroEmployeePersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the electro employee service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Hmel Max
 * @see ElectroEmployeePersistence
 * @see ElectroEmployeeUtil
 * @generated
 */
public class ElectroEmployeePersistenceImpl extends BasePersistenceImpl<ElectroEmployee>
    implements ElectroEmployeePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link ElectroEmployeeUtil} to access the electro employee persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = ElectroEmployeeImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ElectroEmployeeModelImpl.ENTITY_CACHE_ENABLED,
            ElectroEmployeeModelImpl.FINDER_CACHE_ENABLED,
            ElectroEmployeeImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ElectroEmployeeModelImpl.ENTITY_CACHE_ENABLED,
            ElectroEmployeeModelImpl.FINDER_CACHE_ENABLED,
            ElectroEmployeeImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ElectroEmployeeModelImpl.ENTITY_CACHE_ENABLED,
            ElectroEmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ELECTRO_TYPE_ID =
        new FinderPath(ElectroEmployeeModelImpl.ENTITY_CACHE_ENABLED,
            ElectroEmployeeModelImpl.FINDER_CACHE_ENABLED,
            ElectroEmployeeImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByelectro_type_id",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ELECTRO_TYPE_ID =
        new FinderPath(ElectroEmployeeModelImpl.ENTITY_CACHE_ENABLED,
            ElectroEmployeeModelImpl.FINDER_CACHE_ENABLED,
            ElectroEmployeeImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByelectro_type_id",
            new String[] { Long.class.getName() },
            ElectroEmployeeModelImpl.ETYPE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_ELECTRO_TYPE_ID = new FinderPath(ElectroEmployeeModelImpl.ENTITY_CACHE_ENABLED,
            ElectroEmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByelectro_type_id", new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_ELECTRO_TYPE_ID_ETYPE_2 = "electroEmployee.id.etype = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_EMPLOYEE_ID =
        new FinderPath(ElectroEmployeeModelImpl.ENTITY_CACHE_ENABLED,
            ElectroEmployeeModelImpl.FINDER_CACHE_ENABLED,
            ElectroEmployeeImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByemployee_id",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPLOYEE_ID =
        new FinderPath(ElectroEmployeeModelImpl.ENTITY_CACHE_ENABLED,
            ElectroEmployeeModelImpl.FINDER_CACHE_ENABLED,
            ElectroEmployeeImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByemployee_id",
            new String[] { Long.class.getName() },
            ElectroEmployeeModelImpl.ELECTRO_EMPLOYEE_ID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_EMPLOYEE_ID = new FinderPath(ElectroEmployeeModelImpl.ENTITY_CACHE_ENABLED,
            ElectroEmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByemployee_id",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_EMPLOYEE_ID_ELECTRO_EMPLOYEE_ID_2 =
        "electroEmployee.id.electro_employee_id = ?";
    private static final String _SQL_SELECT_ELECTROEMPLOYEE = "SELECT electroEmployee FROM ElectroEmployee electroEmployee";
    private static final String _SQL_SELECT_ELECTROEMPLOYEE_WHERE = "SELECT electroEmployee FROM ElectroEmployee electroEmployee WHERE ";
    private static final String _SQL_COUNT_ELECTROEMPLOYEE = "SELECT COUNT(electroEmployee) FROM ElectroEmployee electroEmployee";
    private static final String _SQL_COUNT_ELECTROEMPLOYEE_WHERE = "SELECT COUNT(electroEmployee) FROM ElectroEmployee electroEmployee WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "electroEmployee.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ElectroEmployee exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ElectroEmployee exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(ElectroEmployeePersistenceImpl.class);
    private static ElectroEmployee _nullElectroEmployee = new ElectroEmployeeImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<ElectroEmployee> toCacheModel() {
                return _nullElectroEmployeeCacheModel;
            }
        };

    private static CacheModel<ElectroEmployee> _nullElectroEmployeeCacheModel = new CacheModel<ElectroEmployee>() {
            @Override
            public ElectroEmployee toEntityModel() {
                return _nullElectroEmployee;
            }
        };

    public ElectroEmployeePersistenceImpl() {
        setModelClass(ElectroEmployee.class);
    }

    /**
     * Returns all the electro employees where etype = &#63;.
     *
     * @param etype the etype
     * @return the matching electro employees
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<ElectroEmployee> findByelectro_type_id(long etype)
        throws SystemException {
        return findByelectro_type_id(etype, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the electro employees where etype = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.ElectroEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param etype the etype
     * @param start the lower bound of the range of electro employees
     * @param end the upper bound of the range of electro employees (not inclusive)
     * @return the range of matching electro employees
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<ElectroEmployee> findByelectro_type_id(long etype, int start,
        int end) throws SystemException {
        return findByelectro_type_id(etype, start, end, null);
    }

    /**
     * Returns an ordered range of all the electro employees where etype = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.ElectroEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param etype the etype
     * @param start the lower bound of the range of electro employees
     * @param end the upper bound of the range of electro employees (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching electro employees
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<ElectroEmployee> findByelectro_type_id(long etype, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ELECTRO_TYPE_ID;
            finderArgs = new Object[] { etype };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ELECTRO_TYPE_ID;
            finderArgs = new Object[] { etype, start, end, orderByComparator };
        }

        List<ElectroEmployee> list = (List<ElectroEmployee>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (ElectroEmployee electroEmployee : list) {
                if ((etype != electroEmployee.getEtype())) {
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

            query.append(_SQL_SELECT_ELECTROEMPLOYEE_WHERE);

            query.append(_FINDER_COLUMN_ELECTRO_TYPE_ID_ETYPE_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(ElectroEmployeeModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(etype);

                if (!pagination) {
                    list = (List<ElectroEmployee>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<ElectroEmployee>(list);
                } else {
                    list = (List<ElectroEmployee>) QueryUtil.list(q,
                            getDialect(), start, end);
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
     * Returns the first electro employee in the ordered set where etype = &#63;.
     *
     * @param etype the etype
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching electro employee
     * @throws ru.hmel.NoSuchElectroEmployeeException if a matching electro employee could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ElectroEmployee findByelectro_type_id_First(long etype,
        OrderByComparator orderByComparator)
        throws NoSuchElectroEmployeeException, SystemException {
        ElectroEmployee electroEmployee = fetchByelectro_type_id_First(etype,
                orderByComparator);

        if (electroEmployee != null) {
            return electroEmployee;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("etype=");
        msg.append(etype);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchElectroEmployeeException(msg.toString());
    }

    /**
     * Returns the first electro employee in the ordered set where etype = &#63;.
     *
     * @param etype the etype
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching electro employee, or <code>null</code> if a matching electro employee could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ElectroEmployee fetchByelectro_type_id_First(long etype,
        OrderByComparator orderByComparator) throws SystemException {
        List<ElectroEmployee> list = findByelectro_type_id(etype, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last electro employee in the ordered set where etype = &#63;.
     *
     * @param etype the etype
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching electro employee
     * @throws ru.hmel.NoSuchElectroEmployeeException if a matching electro employee could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ElectroEmployee findByelectro_type_id_Last(long etype,
        OrderByComparator orderByComparator)
        throws NoSuchElectroEmployeeException, SystemException {
        ElectroEmployee electroEmployee = fetchByelectro_type_id_Last(etype,
                orderByComparator);

        if (electroEmployee != null) {
            return electroEmployee;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("etype=");
        msg.append(etype);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchElectroEmployeeException(msg.toString());
    }

    /**
     * Returns the last electro employee in the ordered set where etype = &#63;.
     *
     * @param etype the etype
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching electro employee, or <code>null</code> if a matching electro employee could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ElectroEmployee fetchByelectro_type_id_Last(long etype,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByelectro_type_id(etype);

        if (count == 0) {
            return null;
        }

        List<ElectroEmployee> list = findByelectro_type_id(etype, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the electro employees before and after the current electro employee in the ordered set where etype = &#63;.
     *
     * @param electroEmployeePK the primary key of the current electro employee
     * @param etype the etype
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next electro employee
     * @throws ru.hmel.NoSuchElectroEmployeeException if a electro employee with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ElectroEmployee[] findByelectro_type_id_PrevAndNext(
        ElectroEmployeePK electroEmployeePK, long etype,
        OrderByComparator orderByComparator)
        throws NoSuchElectroEmployeeException, SystemException {
        ElectroEmployee electroEmployee = findByPrimaryKey(electroEmployeePK);

        Session session = null;

        try {
            session = openSession();

            ElectroEmployee[] array = new ElectroEmployeeImpl[3];

            array[0] = getByelectro_type_id_PrevAndNext(session,
                    electroEmployee, etype, orderByComparator, true);

            array[1] = electroEmployee;

            array[2] = getByelectro_type_id_PrevAndNext(session,
                    electroEmployee, etype, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected ElectroEmployee getByelectro_type_id_PrevAndNext(
        Session session, ElectroEmployee electroEmployee, long etype,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_ELECTROEMPLOYEE_WHERE);

        query.append(_FINDER_COLUMN_ELECTRO_TYPE_ID_ETYPE_2);

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
            query.append(ElectroEmployeeModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(etype);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(electroEmployee);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<ElectroEmployee> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the electro employees where etype = &#63; from the database.
     *
     * @param etype the etype
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByelectro_type_id(long etype) throws SystemException {
        for (ElectroEmployee electroEmployee : findByelectro_type_id(etype,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(electroEmployee);
        }
    }

    /**
     * Returns the number of electro employees where etype = &#63;.
     *
     * @param etype the etype
     * @return the number of matching electro employees
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByelectro_type_id(long etype) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_ELECTRO_TYPE_ID;

        Object[] finderArgs = new Object[] { etype };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_ELECTROEMPLOYEE_WHERE);

            query.append(_FINDER_COLUMN_ELECTRO_TYPE_ID_ETYPE_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(etype);

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
     * Returns all the electro employees where electro_employee_id = &#63;.
     *
     * @param electro_employee_id the electro_employee_id
     * @return the matching electro employees
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<ElectroEmployee> findByemployee_id(long electro_employee_id)
        throws SystemException {
        return findByemployee_id(electro_employee_id, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the electro employees where electro_employee_id = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.ElectroEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param electro_employee_id the electro_employee_id
     * @param start the lower bound of the range of electro employees
     * @param end the upper bound of the range of electro employees (not inclusive)
     * @return the range of matching electro employees
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<ElectroEmployee> findByemployee_id(long electro_employee_id,
        int start, int end) throws SystemException {
        return findByemployee_id(electro_employee_id, start, end, null);
    }

    /**
     * Returns an ordered range of all the electro employees where electro_employee_id = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.ElectroEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param electro_employee_id the electro_employee_id
     * @param start the lower bound of the range of electro employees
     * @param end the upper bound of the range of electro employees (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching electro employees
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<ElectroEmployee> findByemployee_id(long electro_employee_id,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPLOYEE_ID;
            finderArgs = new Object[] { electro_employee_id };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_EMPLOYEE_ID;
            finderArgs = new Object[] {
                    electro_employee_id,
                    
                    start, end, orderByComparator
                };
        }

        List<ElectroEmployee> list = (List<ElectroEmployee>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (ElectroEmployee electroEmployee : list) {
                if ((electro_employee_id != electroEmployee.getElectro_employee_id())) {
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

            query.append(_SQL_SELECT_ELECTROEMPLOYEE_WHERE);

            query.append(_FINDER_COLUMN_EMPLOYEE_ID_ELECTRO_EMPLOYEE_ID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(ElectroEmployeeModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(electro_employee_id);

                if (!pagination) {
                    list = (List<ElectroEmployee>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<ElectroEmployee>(list);
                } else {
                    list = (List<ElectroEmployee>) QueryUtil.list(q,
                            getDialect(), start, end);
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
     * Returns the first electro employee in the ordered set where electro_employee_id = &#63;.
     *
     * @param electro_employee_id the electro_employee_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching electro employee
     * @throws ru.hmel.NoSuchElectroEmployeeException if a matching electro employee could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ElectroEmployee findByemployee_id_First(long electro_employee_id,
        OrderByComparator orderByComparator)
        throws NoSuchElectroEmployeeException, SystemException {
        ElectroEmployee electroEmployee = fetchByemployee_id_First(electro_employee_id,
                orderByComparator);

        if (electroEmployee != null) {
            return electroEmployee;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("electro_employee_id=");
        msg.append(electro_employee_id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchElectroEmployeeException(msg.toString());
    }

    /**
     * Returns the first electro employee in the ordered set where electro_employee_id = &#63;.
     *
     * @param electro_employee_id the electro_employee_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching electro employee, or <code>null</code> if a matching electro employee could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ElectroEmployee fetchByemployee_id_First(long electro_employee_id,
        OrderByComparator orderByComparator) throws SystemException {
        List<ElectroEmployee> list = findByemployee_id(electro_employee_id, 0,
                1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last electro employee in the ordered set where electro_employee_id = &#63;.
     *
     * @param electro_employee_id the electro_employee_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching electro employee
     * @throws ru.hmel.NoSuchElectroEmployeeException if a matching electro employee could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ElectroEmployee findByemployee_id_Last(long electro_employee_id,
        OrderByComparator orderByComparator)
        throws NoSuchElectroEmployeeException, SystemException {
        ElectroEmployee electroEmployee = fetchByemployee_id_Last(electro_employee_id,
                orderByComparator);

        if (electroEmployee != null) {
            return electroEmployee;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("electro_employee_id=");
        msg.append(electro_employee_id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchElectroEmployeeException(msg.toString());
    }

    /**
     * Returns the last electro employee in the ordered set where electro_employee_id = &#63;.
     *
     * @param electro_employee_id the electro_employee_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching electro employee, or <code>null</code> if a matching electro employee could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ElectroEmployee fetchByemployee_id_Last(long electro_employee_id,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByemployee_id(electro_employee_id);

        if (count == 0) {
            return null;
        }

        List<ElectroEmployee> list = findByemployee_id(electro_employee_id,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the electro employees before and after the current electro employee in the ordered set where electro_employee_id = &#63;.
     *
     * @param electroEmployeePK the primary key of the current electro employee
     * @param electro_employee_id the electro_employee_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next electro employee
     * @throws ru.hmel.NoSuchElectroEmployeeException if a electro employee with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ElectroEmployee[] findByemployee_id_PrevAndNext(
        ElectroEmployeePK electroEmployeePK, long electro_employee_id,
        OrderByComparator orderByComparator)
        throws NoSuchElectroEmployeeException, SystemException {
        ElectroEmployee electroEmployee = findByPrimaryKey(electroEmployeePK);

        Session session = null;

        try {
            session = openSession();

            ElectroEmployee[] array = new ElectroEmployeeImpl[3];

            array[0] = getByemployee_id_PrevAndNext(session, electroEmployee,
                    electro_employee_id, orderByComparator, true);

            array[1] = electroEmployee;

            array[2] = getByemployee_id_PrevAndNext(session, electroEmployee,
                    electro_employee_id, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected ElectroEmployee getByemployee_id_PrevAndNext(Session session,
        ElectroEmployee electroEmployee, long electro_employee_id,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_ELECTROEMPLOYEE_WHERE);

        query.append(_FINDER_COLUMN_EMPLOYEE_ID_ELECTRO_EMPLOYEE_ID_2);

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
            query.append(ElectroEmployeeModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(electro_employee_id);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(electroEmployee);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<ElectroEmployee> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the electro employees where electro_employee_id = &#63; from the database.
     *
     * @param electro_employee_id the electro_employee_id
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByemployee_id(long electro_employee_id)
        throws SystemException {
        for (ElectroEmployee electroEmployee : findByemployee_id(
                electro_employee_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(electroEmployee);
        }
    }

    /**
     * Returns the number of electro employees where electro_employee_id = &#63;.
     *
     * @param electro_employee_id the electro_employee_id
     * @return the number of matching electro employees
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByemployee_id(long electro_employee_id)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_EMPLOYEE_ID;

        Object[] finderArgs = new Object[] { electro_employee_id };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_ELECTROEMPLOYEE_WHERE);

            query.append(_FINDER_COLUMN_EMPLOYEE_ID_ELECTRO_EMPLOYEE_ID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(electro_employee_id);

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
     * Caches the electro employee in the entity cache if it is enabled.
     *
     * @param electroEmployee the electro employee
     */
    @Override
    public void cacheResult(ElectroEmployee electroEmployee) {
        EntityCacheUtil.putResult(ElectroEmployeeModelImpl.ENTITY_CACHE_ENABLED,
            ElectroEmployeeImpl.class, electroEmployee.getPrimaryKey(),
            electroEmployee);

        electroEmployee.resetOriginalValues();
    }

    /**
     * Caches the electro employees in the entity cache if it is enabled.
     *
     * @param electroEmployees the electro employees
     */
    @Override
    public void cacheResult(List<ElectroEmployee> electroEmployees) {
        for (ElectroEmployee electroEmployee : electroEmployees) {
            if (EntityCacheUtil.getResult(
                        ElectroEmployeeModelImpl.ENTITY_CACHE_ENABLED,
                        ElectroEmployeeImpl.class,
                        electroEmployee.getPrimaryKey()) == null) {
                cacheResult(electroEmployee);
            } else {
                electroEmployee.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all electro employees.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(ElectroEmployeeImpl.class.getName());
        }

        EntityCacheUtil.clearCache(ElectroEmployeeImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the electro employee.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(ElectroEmployee electroEmployee) {
        EntityCacheUtil.removeResult(ElectroEmployeeModelImpl.ENTITY_CACHE_ENABLED,
            ElectroEmployeeImpl.class, electroEmployee.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<ElectroEmployee> electroEmployees) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (ElectroEmployee electroEmployee : electroEmployees) {
            EntityCacheUtil.removeResult(ElectroEmployeeModelImpl.ENTITY_CACHE_ENABLED,
                ElectroEmployeeImpl.class, electroEmployee.getPrimaryKey());
        }
    }

    /**
     * Creates a new electro employee with the primary key. Does not add the electro employee to the database.
     *
     * @param electroEmployeePK the primary key for the new electro employee
     * @return the new electro employee
     */
    @Override
    public ElectroEmployee create(ElectroEmployeePK electroEmployeePK) {
        ElectroEmployee electroEmployee = new ElectroEmployeeImpl();

        electroEmployee.setNew(true);
        electroEmployee.setPrimaryKey(electroEmployeePK);

        return electroEmployee;
    }

    /**
     * Removes the electro employee with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param electroEmployeePK the primary key of the electro employee
     * @return the electro employee that was removed
     * @throws ru.hmel.NoSuchElectroEmployeeException if a electro employee with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ElectroEmployee remove(ElectroEmployeePK electroEmployeePK)
        throws NoSuchElectroEmployeeException, SystemException {
        return remove((Serializable) electroEmployeePK);
    }

    /**
     * Removes the electro employee with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the electro employee
     * @return the electro employee that was removed
     * @throws ru.hmel.NoSuchElectroEmployeeException if a electro employee with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ElectroEmployee remove(Serializable primaryKey)
        throws NoSuchElectroEmployeeException, SystemException {
        Session session = null;

        try {
            session = openSession();

            ElectroEmployee electroEmployee = (ElectroEmployee) session.get(ElectroEmployeeImpl.class,
                    primaryKey);

            if (electroEmployee == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchElectroEmployeeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(electroEmployee);
        } catch (NoSuchElectroEmployeeException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected ElectroEmployee removeImpl(ElectroEmployee electroEmployee)
        throws SystemException {
        electroEmployee = toUnwrappedModel(electroEmployee);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(electroEmployee)) {
                electroEmployee = (ElectroEmployee) session.get(ElectroEmployeeImpl.class,
                        electroEmployee.getPrimaryKeyObj());
            }

            if (electroEmployee != null) {
                session.delete(electroEmployee);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (electroEmployee != null) {
            clearCache(electroEmployee);
        }

        return electroEmployee;
    }

    @Override
    public ElectroEmployee updateImpl(
        ru.hmel.model.ElectroEmployee electroEmployee)
        throws SystemException {
        electroEmployee = toUnwrappedModel(electroEmployee);

        boolean isNew = electroEmployee.isNew();

        ElectroEmployeeModelImpl electroEmployeeModelImpl = (ElectroEmployeeModelImpl) electroEmployee;

        Session session = null;

        try {
            session = openSession();

            if (electroEmployee.isNew()) {
                session.save(electroEmployee);

                electroEmployee.setNew(false);
            } else {
                session.merge(electroEmployee);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !ElectroEmployeeModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((electroEmployeeModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ELECTRO_TYPE_ID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        electroEmployeeModelImpl.getOriginalEtype()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ELECTRO_TYPE_ID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ELECTRO_TYPE_ID,
                    args);

                args = new Object[] { electroEmployeeModelImpl.getEtype() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ELECTRO_TYPE_ID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ELECTRO_TYPE_ID,
                    args);
            }

            if ((electroEmployeeModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPLOYEE_ID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        electroEmployeeModelImpl.getOriginalElectro_employee_id()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_EMPLOYEE_ID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPLOYEE_ID,
                    args);

                args = new Object[] {
                        electroEmployeeModelImpl.getElectro_employee_id()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_EMPLOYEE_ID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPLOYEE_ID,
                    args);
            }
        }

        EntityCacheUtil.putResult(ElectroEmployeeModelImpl.ENTITY_CACHE_ENABLED,
            ElectroEmployeeImpl.class, electroEmployee.getPrimaryKey(),
            electroEmployee);

        return electroEmployee;
    }

    protected ElectroEmployee toUnwrappedModel(ElectroEmployee electroEmployee) {
        if (electroEmployee instanceof ElectroEmployeeImpl) {
            return electroEmployee;
        }

        ElectroEmployeeImpl electroEmployeeImpl = new ElectroEmployeeImpl();

        electroEmployeeImpl.setNew(electroEmployee.isNew());
        electroEmployeeImpl.setPrimaryKey(electroEmployee.getPrimaryKey());

        electroEmployeeImpl.setElectro_employee_id(electroEmployee.getElectro_employee_id());
        electroEmployeeImpl.setEtype(electroEmployee.getEtype());

        return electroEmployeeImpl;
    }

    /**
     * Returns the electro employee with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the electro employee
     * @return the electro employee
     * @throws ru.hmel.NoSuchElectroEmployeeException if a electro employee with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ElectroEmployee findByPrimaryKey(Serializable primaryKey)
        throws NoSuchElectroEmployeeException, SystemException {
        ElectroEmployee electroEmployee = fetchByPrimaryKey(primaryKey);

        if (electroEmployee == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchElectroEmployeeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return electroEmployee;
    }

    /**
     * Returns the electro employee with the primary key or throws a {@link ru.hmel.NoSuchElectroEmployeeException} if it could not be found.
     *
     * @param electroEmployeePK the primary key of the electro employee
     * @return the electro employee
     * @throws ru.hmel.NoSuchElectroEmployeeException if a electro employee with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ElectroEmployee findByPrimaryKey(ElectroEmployeePK electroEmployeePK)
        throws NoSuchElectroEmployeeException, SystemException {
        return findByPrimaryKey((Serializable) electroEmployeePK);
    }

    /**
     * Returns the electro employee with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the electro employee
     * @return the electro employee, or <code>null</code> if a electro employee with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ElectroEmployee fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        ElectroEmployee electroEmployee = (ElectroEmployee) EntityCacheUtil.getResult(ElectroEmployeeModelImpl.ENTITY_CACHE_ENABLED,
                ElectroEmployeeImpl.class, primaryKey);

        if (electroEmployee == _nullElectroEmployee) {
            return null;
        }

        if (electroEmployee == null) {
            Session session = null;

            try {
                session = openSession();

                electroEmployee = (ElectroEmployee) session.get(ElectroEmployeeImpl.class,
                        primaryKey);

                if (electroEmployee != null) {
                    cacheResult(electroEmployee);
                } else {
                    EntityCacheUtil.putResult(ElectroEmployeeModelImpl.ENTITY_CACHE_ENABLED,
                        ElectroEmployeeImpl.class, primaryKey,
                        _nullElectroEmployee);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(ElectroEmployeeModelImpl.ENTITY_CACHE_ENABLED,
                    ElectroEmployeeImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return electroEmployee;
    }

    /**
     * Returns the electro employee with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param electroEmployeePK the primary key of the electro employee
     * @return the electro employee, or <code>null</code> if a electro employee with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ElectroEmployee fetchByPrimaryKey(
        ElectroEmployeePK electroEmployeePK) throws SystemException {
        return fetchByPrimaryKey((Serializable) electroEmployeePK);
    }

    /**
     * Returns all the electro employees.
     *
     * @return the electro employees
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<ElectroEmployee> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the electro employees.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.ElectroEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of electro employees
     * @param end the upper bound of the range of electro employees (not inclusive)
     * @return the range of electro employees
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<ElectroEmployee> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the electro employees.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.ElectroEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of electro employees
     * @param end the upper bound of the range of electro employees (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of electro employees
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<ElectroEmployee> findAll(int start, int end,
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

        List<ElectroEmployee> list = (List<ElectroEmployee>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ELECTROEMPLOYEE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ELECTROEMPLOYEE;

                if (pagination) {
                    sql = sql.concat(ElectroEmployeeModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<ElectroEmployee>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<ElectroEmployee>(list);
                } else {
                    list = (List<ElectroEmployee>) QueryUtil.list(q,
                            getDialect(), start, end);
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
     * Removes all the electro employees from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (ElectroEmployee electroEmployee : findAll()) {
            remove(electroEmployee);
        }
    }

    /**
     * Returns the number of electro employees.
     *
     * @return the number of electro employees
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

                Query q = session.createQuery(_SQL_COUNT_ELECTROEMPLOYEE);

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
     * Initializes the electro employee persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.ru.hmel.model.ElectroEmployee")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<ElectroEmployee>> listenersList = new ArrayList<ModelListener<ElectroEmployee>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<ElectroEmployee>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(ElectroEmployeeImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
