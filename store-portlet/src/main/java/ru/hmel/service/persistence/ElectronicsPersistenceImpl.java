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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import ru.hmel.NoSuchElectronicsException;

import ru.hmel.model.Electronics;
import ru.hmel.model.impl.ElectronicsImpl;
import ru.hmel.model.impl.ElectronicsModelImpl;

import ru.hmel.service.persistence.ElectronicsPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the electronics service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ElectronicsPersistence
 * @see ElectronicsUtil
 * @generated
 */
public class ElectronicsPersistenceImpl extends BasePersistenceImpl<Electronics>
    implements ElectronicsPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link ElectronicsUtil} to access the electronics persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = ElectronicsImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ElectronicsModelImpl.ENTITY_CACHE_ENABLED,
            ElectronicsModelImpl.FINDER_CACHE_ENABLED, ElectronicsImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ElectronicsModelImpl.ENTITY_CACHE_ENABLED,
            ElectronicsModelImpl.FINDER_CACHE_ENABLED, ElectronicsImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ElectronicsModelImpl.ENTITY_CACHE_ENABLED,
            ElectronicsModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(ElectronicsModelImpl.ENTITY_CACHE_ENABLED,
            ElectronicsModelImpl.FINDER_CACHE_ENABLED, ElectronicsImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(ElectronicsModelImpl.ENTITY_CACHE_ENABLED,
            ElectronicsModelImpl.FINDER_CACHE_ENABLED, ElectronicsImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
            new String[] { String.class.getName() },
            ElectronicsModelImpl.UUID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(ElectronicsModelImpl.ENTITY_CACHE_ENABLED,
            ElectronicsModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_UUID_UUID_1 = "electronics.uuid IS NULL";
    private static final String _FINDER_COLUMN_UUID_UUID_2 = "electronics.uuid = ?";
    private static final String _FINDER_COLUMN_UUID_UUID_3 = "(electronics.uuid IS NULL OR electronics.uuid = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ELECTRO_TYPE_ID =
        new FinderPath(ElectronicsModelImpl.ENTITY_CACHE_ENABLED,
            ElectronicsModelImpl.FINDER_CACHE_ENABLED, ElectronicsImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByelectro_type_id",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ELECTRO_TYPE_ID =
        new FinderPath(ElectronicsModelImpl.ENTITY_CACHE_ENABLED,
            ElectronicsModelImpl.FINDER_CACHE_ENABLED, ElectronicsImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByelectro_type_id",
            new String[] { Long.class.getName() },
            ElectronicsModelImpl.ETYPE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_ELECTRO_TYPE_ID = new FinderPath(ElectronicsModelImpl.ENTITY_CACHE_ENABLED,
            ElectronicsModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByelectro_type_id", new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_ELECTRO_TYPE_ID_ETYPE_2 = "electronics.etype = ?";
    private static final String _SQL_SELECT_ELECTRONICS = "SELECT electronics FROM Electronics electronics";
    private static final String _SQL_SELECT_ELECTRONICS_WHERE = "SELECT electronics FROM Electronics electronics WHERE ";
    private static final String _SQL_COUNT_ELECTRONICS = "SELECT COUNT(electronics) FROM Electronics electronics";
    private static final String _SQL_COUNT_ELECTRONICS_WHERE = "SELECT COUNT(electronics) FROM Electronics electronics WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "electronics.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Electronics exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Electronics exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(ElectronicsPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "uuid"
            });
    private static Electronics _nullElectronics = new ElectronicsImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Electronics> toCacheModel() {
                return _nullElectronicsCacheModel;
            }
        };

    private static CacheModel<Electronics> _nullElectronicsCacheModel = new CacheModel<Electronics>() {
            @Override
            public Electronics toEntityModel() {
                return _nullElectronics;
            }
        };

    public ElectronicsPersistenceImpl() {
        setModelClass(Electronics.class);
    }

    /**
     * Returns all the electronicses where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the matching electronicses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Electronics> findByUuid(String uuid) throws SystemException {
        return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the electronicses where uuid = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.ElectronicsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid the uuid
     * @param start the lower bound of the range of electronicses
     * @param end the upper bound of the range of electronicses (not inclusive)
     * @return the range of matching electronicses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Electronics> findByUuid(String uuid, int start, int end)
        throws SystemException {
        return findByUuid(uuid, start, end, null);
    }

    /**
     * Returns an ordered range of all the electronicses where uuid = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.ElectronicsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid the uuid
     * @param start the lower bound of the range of electronicses
     * @param end the upper bound of the range of electronicses (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching electronicses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Electronics> findByUuid(String uuid, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
            finderArgs = new Object[] { uuid };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
            finderArgs = new Object[] { uuid, start, end, orderByComparator };
        }

        List<Electronics> list = (List<Electronics>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Electronics electronics : list) {
                if (!Validator.equals(uuid, electronics.getUuid())) {
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

            query.append(_SQL_SELECT_ELECTRONICS_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_UUID_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(ElectronicsModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                if (!pagination) {
                    list = (List<Electronics>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Electronics>(list);
                } else {
                    list = (List<Electronics>) QueryUtil.list(q, getDialect(),
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
     * Returns the first electronics in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching electronics
     * @throws ru.hmel.NoSuchElectronicsException if a matching electronics could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Electronics findByUuid_First(String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchElectronicsException, SystemException {
        Electronics electronics = fetchByUuid_First(uuid, orderByComparator);

        if (electronics != null) {
            return electronics;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchElectronicsException(msg.toString());
    }

    /**
     * Returns the first electronics in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching electronics, or <code>null</code> if a matching electronics could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Electronics fetchByUuid_First(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        List<Electronics> list = findByUuid(uuid, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last electronics in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching electronics
     * @throws ru.hmel.NoSuchElectronicsException if a matching electronics could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Electronics findByUuid_Last(String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchElectronicsException, SystemException {
        Electronics electronics = fetchByUuid_Last(uuid, orderByComparator);

        if (electronics != null) {
            return electronics;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchElectronicsException(msg.toString());
    }

    /**
     * Returns the last electronics in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching electronics, or <code>null</code> if a matching electronics could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Electronics fetchByUuid_Last(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUuid(uuid);

        if (count == 0) {
            return null;
        }

        List<Electronics> list = findByUuid(uuid, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the electronicses before and after the current electronics in the ordered set where uuid = &#63;.
     *
     * @param electronics_id the primary key of the current electronics
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next electronics
     * @throws ru.hmel.NoSuchElectronicsException if a electronics with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Electronics[] findByUuid_PrevAndNext(long electronics_id,
        String uuid, OrderByComparator orderByComparator)
        throws NoSuchElectronicsException, SystemException {
        Electronics electronics = findByPrimaryKey(electronics_id);

        Session session = null;

        try {
            session = openSession();

            Electronics[] array = new ElectronicsImpl[3];

            array[0] = getByUuid_PrevAndNext(session, electronics, uuid,
                    orderByComparator, true);

            array[1] = electronics;

            array[2] = getByUuid_PrevAndNext(session, electronics, uuid,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Electronics getByUuid_PrevAndNext(Session session,
        Electronics electronics, String uuid,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_ELECTRONICS_WHERE);

        boolean bindUuid = false;

        if (uuid == null) {
            query.append(_FINDER_COLUMN_UUID_UUID_1);
        } else if (uuid.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_UUID_UUID_3);
        } else {
            bindUuid = true;

            query.append(_FINDER_COLUMN_UUID_UUID_2);
        }

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
            query.append(ElectronicsModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindUuid) {
            qPos.add(uuid);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(electronics);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Electronics> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the electronicses where uuid = &#63; from the database.
     *
     * @param uuid the uuid
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUuid(String uuid) throws SystemException {
        for (Electronics electronics : findByUuid(uuid, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(electronics);
        }
    }

    /**
     * Returns the number of electronicses where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the number of matching electronicses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUuid(String uuid) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

        Object[] finderArgs = new Object[] { uuid };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_ELECTRONICS_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_UUID_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

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
     * Returns all the electronicses where etype = &#63;.
     *
     * @param etype the etype
     * @return the matching electronicses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Electronics> findByelectro_type_id(long etype)
        throws SystemException {
        return findByelectro_type_id(etype, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the electronicses where etype = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.ElectronicsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param etype the etype
     * @param start the lower bound of the range of electronicses
     * @param end the upper bound of the range of electronicses (not inclusive)
     * @return the range of matching electronicses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Electronics> findByelectro_type_id(long etype, int start,
        int end) throws SystemException {
        return findByelectro_type_id(etype, start, end, null);
    }

    /**
     * Returns an ordered range of all the electronicses where etype = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.ElectronicsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param etype the etype
     * @param start the lower bound of the range of electronicses
     * @param end the upper bound of the range of electronicses (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching electronicses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Electronics> findByelectro_type_id(long etype, int start,
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

        List<Electronics> list = (List<Electronics>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Electronics electronics : list) {
                if ((etype != electronics.getEtype())) {
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

            query.append(_SQL_SELECT_ELECTRONICS_WHERE);

            query.append(_FINDER_COLUMN_ELECTRO_TYPE_ID_ETYPE_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(ElectronicsModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(etype);

                if (!pagination) {
                    list = (List<Electronics>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Electronics>(list);
                } else {
                    list = (List<Electronics>) QueryUtil.list(q, getDialect(),
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
     * Returns the first electronics in the ordered set where etype = &#63;.
     *
     * @param etype the etype
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching electronics
     * @throws ru.hmel.NoSuchElectronicsException if a matching electronics could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Electronics findByelectro_type_id_First(long etype,
        OrderByComparator orderByComparator)
        throws NoSuchElectronicsException, SystemException {
        Electronics electronics = fetchByelectro_type_id_First(etype,
                orderByComparator);

        if (electronics != null) {
            return electronics;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("etype=");
        msg.append(etype);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchElectronicsException(msg.toString());
    }

    /**
     * Returns the first electronics in the ordered set where etype = &#63;.
     *
     * @param etype the etype
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching electronics, or <code>null</code> if a matching electronics could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Electronics fetchByelectro_type_id_First(long etype,
        OrderByComparator orderByComparator) throws SystemException {
        List<Electronics> list = findByelectro_type_id(etype, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last electronics in the ordered set where etype = &#63;.
     *
     * @param etype the etype
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching electronics
     * @throws ru.hmel.NoSuchElectronicsException if a matching electronics could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Electronics findByelectro_type_id_Last(long etype,
        OrderByComparator orderByComparator)
        throws NoSuchElectronicsException, SystemException {
        Electronics electronics = fetchByelectro_type_id_Last(etype,
                orderByComparator);

        if (electronics != null) {
            return electronics;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("etype=");
        msg.append(etype);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchElectronicsException(msg.toString());
    }

    /**
     * Returns the last electronics in the ordered set where etype = &#63;.
     *
     * @param etype the etype
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching electronics, or <code>null</code> if a matching electronics could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Electronics fetchByelectro_type_id_Last(long etype,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByelectro_type_id(etype);

        if (count == 0) {
            return null;
        }

        List<Electronics> list = findByelectro_type_id(etype, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the electronicses before and after the current electronics in the ordered set where etype = &#63;.
     *
     * @param electronics_id the primary key of the current electronics
     * @param etype the etype
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next electronics
     * @throws ru.hmel.NoSuchElectronicsException if a electronics with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Electronics[] findByelectro_type_id_PrevAndNext(
        long electronics_id, long etype, OrderByComparator orderByComparator)
        throws NoSuchElectronicsException, SystemException {
        Electronics electronics = findByPrimaryKey(electronics_id);

        Session session = null;

        try {
            session = openSession();

            Electronics[] array = new ElectronicsImpl[3];

            array[0] = getByelectro_type_id_PrevAndNext(session, electronics,
                    etype, orderByComparator, true);

            array[1] = electronics;

            array[2] = getByelectro_type_id_PrevAndNext(session, electronics,
                    etype, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Electronics getByelectro_type_id_PrevAndNext(Session session,
        Electronics electronics, long etype,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_ELECTRONICS_WHERE);

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
            query.append(ElectronicsModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(etype);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(electronics);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Electronics> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the electronicses where etype = &#63; from the database.
     *
     * @param etype the etype
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByelectro_type_id(long etype) throws SystemException {
        for (Electronics electronics : findByelectro_type_id(etype,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(electronics);
        }
    }

    /**
     * Returns the number of electronicses where etype = &#63;.
     *
     * @param etype the etype
     * @return the number of matching electronicses
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

            query.append(_SQL_COUNT_ELECTRONICS_WHERE);

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
     * Caches the electronics in the entity cache if it is enabled.
     *
     * @param electronics the electronics
     */
    @Override
    public void cacheResult(Electronics electronics) {
        EntityCacheUtil.putResult(ElectronicsModelImpl.ENTITY_CACHE_ENABLED,
            ElectronicsImpl.class, electronics.getPrimaryKey(), electronics);

        electronics.resetOriginalValues();
    }

    /**
     * Caches the electronicses in the entity cache if it is enabled.
     *
     * @param electronicses the electronicses
     */
    @Override
    public void cacheResult(List<Electronics> electronicses) {
        for (Electronics electronics : electronicses) {
            if (EntityCacheUtil.getResult(
                        ElectronicsModelImpl.ENTITY_CACHE_ENABLED,
                        ElectronicsImpl.class, electronics.getPrimaryKey()) == null) {
                cacheResult(electronics);
            } else {
                electronics.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all electronicses.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(ElectronicsImpl.class.getName());
        }

        EntityCacheUtil.clearCache(ElectronicsImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the electronics.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Electronics electronics) {
        EntityCacheUtil.removeResult(ElectronicsModelImpl.ENTITY_CACHE_ENABLED,
            ElectronicsImpl.class, electronics.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Electronics> electronicses) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Electronics electronics : electronicses) {
            EntityCacheUtil.removeResult(ElectronicsModelImpl.ENTITY_CACHE_ENABLED,
                ElectronicsImpl.class, electronics.getPrimaryKey());
        }
    }

    /**
     * Creates a new electronics with the primary key. Does not add the electronics to the database.
     *
     * @param electronics_id the primary key for the new electronics
     * @return the new electronics
     */
    @Override
    public Electronics create(long electronics_id) {
        Electronics electronics = new ElectronicsImpl();

        electronics.setNew(true);
        electronics.setPrimaryKey(electronics_id);

        String uuid = PortalUUIDUtil.generate();

        electronics.setUuid(uuid);

        return electronics;
    }

    /**
     * Removes the electronics with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param electronics_id the primary key of the electronics
     * @return the electronics that was removed
     * @throws ru.hmel.NoSuchElectronicsException if a electronics with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Electronics remove(long electronics_id)
        throws NoSuchElectronicsException, SystemException {
        return remove((Serializable) electronics_id);
    }

    /**
     * Removes the electronics with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the electronics
     * @return the electronics that was removed
     * @throws ru.hmel.NoSuchElectronicsException if a electronics with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Electronics remove(Serializable primaryKey)
        throws NoSuchElectronicsException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Electronics electronics = (Electronics) session.get(ElectronicsImpl.class,
                    primaryKey);

            if (electronics == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchElectronicsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(electronics);
        } catch (NoSuchElectronicsException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Electronics removeImpl(Electronics electronics)
        throws SystemException {
        electronics = toUnwrappedModel(electronics);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(electronics)) {
                electronics = (Electronics) session.get(ElectronicsImpl.class,
                        electronics.getPrimaryKeyObj());
            }

            if (electronics != null) {
                session.delete(electronics);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (electronics != null) {
            clearCache(electronics);
        }

        return electronics;
    }

    @Override
    public Electronics updateImpl(ru.hmel.model.Electronics electronics)
        throws SystemException {
        electronics = toUnwrappedModel(electronics);

        boolean isNew = electronics.isNew();

        ElectronicsModelImpl electronicsModelImpl = (ElectronicsModelImpl) electronics;

        if (Validator.isNull(electronics.getUuid())) {
            String uuid = PortalUUIDUtil.generate();

            electronics.setUuid(uuid);
        }

        Session session = null;

        try {
            session = openSession();

            if (electronics.isNew()) {
                session.save(electronics);

                electronics.setNew(false);
            } else {
                session.merge(electronics);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !ElectronicsModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((electronicsModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        electronicsModelImpl.getOriginalUuid()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);

                args = new Object[] { electronicsModelImpl.getUuid() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);
            }

            if ((electronicsModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ELECTRO_TYPE_ID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        electronicsModelImpl.getOriginalEtype()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ELECTRO_TYPE_ID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ELECTRO_TYPE_ID,
                    args);

                args = new Object[] { electronicsModelImpl.getEtype() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ELECTRO_TYPE_ID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ELECTRO_TYPE_ID,
                    args);
            }
        }

        EntityCacheUtil.putResult(ElectronicsModelImpl.ENTITY_CACHE_ENABLED,
            ElectronicsImpl.class, electronics.getPrimaryKey(), electronics);

        return electronics;
    }

    protected Electronics toUnwrappedModel(Electronics electronics) {
        if (electronics instanceof ElectronicsImpl) {
            return electronics;
        }

        ElectronicsImpl electronicsImpl = new ElectronicsImpl();

        electronicsImpl.setNew(electronics.isNew());
        electronicsImpl.setPrimaryKey(electronics.getPrimaryKey());

        electronicsImpl.setUuid(electronics.getUuid());
        electronicsImpl.setElectronics_id(electronics.getElectronics_id());
        electronicsImpl.setName(electronics.getName());
        electronicsImpl.setEtype(electronics.getEtype());
        electronicsImpl.setPrice(electronics.getPrice());
        electronicsImpl.setCount(electronics.getCount());
        electronicsImpl.setInStock(electronics.isInStock());
        electronicsImpl.setArchive(electronics.isArchive());
        electronicsImpl.setDescription(electronics.getDescription());

        return electronicsImpl;
    }

    /**
     * Returns the electronics with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the electronics
     * @return the electronics
     * @throws ru.hmel.NoSuchElectronicsException if a electronics with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Electronics findByPrimaryKey(Serializable primaryKey)
        throws NoSuchElectronicsException, SystemException {
        Electronics electronics = fetchByPrimaryKey(primaryKey);

        if (electronics == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchElectronicsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return electronics;
    }

    /**
     * Returns the electronics with the primary key or throws a {@link ru.hmel.NoSuchElectronicsException} if it could not be found.
     *
     * @param electronics_id the primary key of the electronics
     * @return the electronics
     * @throws ru.hmel.NoSuchElectronicsException if a electronics with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Electronics findByPrimaryKey(long electronics_id)
        throws NoSuchElectronicsException, SystemException {
        return findByPrimaryKey((Serializable) electronics_id);
    }

    /**
     * Returns the electronics with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the electronics
     * @return the electronics, or <code>null</code> if a electronics with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Electronics fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Electronics electronics = (Electronics) EntityCacheUtil.getResult(ElectronicsModelImpl.ENTITY_CACHE_ENABLED,
                ElectronicsImpl.class, primaryKey);

        if (electronics == _nullElectronics) {
            return null;
        }

        if (electronics == null) {
            Session session = null;

            try {
                session = openSession();

                electronics = (Electronics) session.get(ElectronicsImpl.class,
                        primaryKey);

                if (electronics != null) {
                    cacheResult(electronics);
                } else {
                    EntityCacheUtil.putResult(ElectronicsModelImpl.ENTITY_CACHE_ENABLED,
                        ElectronicsImpl.class, primaryKey, _nullElectronics);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(ElectronicsModelImpl.ENTITY_CACHE_ENABLED,
                    ElectronicsImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return electronics;
    }

    /**
     * Returns the electronics with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param electronics_id the primary key of the electronics
     * @return the electronics, or <code>null</code> if a electronics with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Electronics fetchByPrimaryKey(long electronics_id)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) electronics_id);
    }

    /**
     * Returns all the electronicses.
     *
     * @return the electronicses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Electronics> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the electronicses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.ElectronicsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of electronicses
     * @param end the upper bound of the range of electronicses (not inclusive)
     * @return the range of electronicses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Electronics> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the electronicses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.ElectronicsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of electronicses
     * @param end the upper bound of the range of electronicses (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of electronicses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Electronics> findAll(int start, int end,
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

        List<Electronics> list = (List<Electronics>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ELECTRONICS);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ELECTRONICS;

                if (pagination) {
                    sql = sql.concat(ElectronicsModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Electronics>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Electronics>(list);
                } else {
                    list = (List<Electronics>) QueryUtil.list(q, getDialect(),
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
     * Removes all the electronicses from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Electronics electronics : findAll()) {
            remove(electronics);
        }
    }

    /**
     * Returns the number of electronicses.
     *
     * @return the number of electronicses
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

                Query q = session.createQuery(_SQL_COUNT_ELECTRONICS);

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
     * Initializes the electronics persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.ru.hmel.model.Electronics")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Electronics>> listenersList = new ArrayList<ModelListener<Electronics>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Electronics>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(ElectronicsImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
