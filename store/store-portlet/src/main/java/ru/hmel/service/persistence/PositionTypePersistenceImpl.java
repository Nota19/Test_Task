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

import ru.hmel.NoSuchPositionTypeException;

import ru.hmel.model.PositionType;
import ru.hmel.model.impl.PositionTypeImpl;
import ru.hmel.model.impl.PositionTypeModelImpl;

import ru.hmel.service.persistence.PositionTypePersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the position type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PositionTypePersistence
 * @see PositionTypeUtil
 * @generated
 */
public class PositionTypePersistenceImpl extends BasePersistenceImpl<PositionType>
    implements PositionTypePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link PositionTypeUtil} to access the position type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = PositionTypeImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PositionTypeModelImpl.ENTITY_CACHE_ENABLED,
            PositionTypeModelImpl.FINDER_CACHE_ENABLED, PositionTypeImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PositionTypeModelImpl.ENTITY_CACHE_ENABLED,
            PositionTypeModelImpl.FINDER_CACHE_ENABLED, PositionTypeImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PositionTypeModelImpl.ENTITY_CACHE_ENABLED,
            PositionTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(PositionTypeModelImpl.ENTITY_CACHE_ENABLED,
            PositionTypeModelImpl.FINDER_CACHE_ENABLED, PositionTypeImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(PositionTypeModelImpl.ENTITY_CACHE_ENABLED,
            PositionTypeModelImpl.FINDER_CACHE_ENABLED, PositionTypeImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
            new String[] { String.class.getName() },
            PositionTypeModelImpl.UUID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(PositionTypeModelImpl.ENTITY_CACHE_ENABLED,
            PositionTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_UUID_UUID_1 = "positionType.uuid IS NULL";
    private static final String _FINDER_COLUMN_UUID_UUID_2 = "positionType.uuid = ?";
    private static final String _FINDER_COLUMN_UUID_UUID_3 = "(positionType.uuid IS NULL OR positionType.uuid = '')";
    private static final String _SQL_SELECT_POSITIONTYPE = "SELECT positionType FROM PositionType positionType";
    private static final String _SQL_SELECT_POSITIONTYPE_WHERE = "SELECT positionType FROM PositionType positionType WHERE ";
    private static final String _SQL_COUNT_POSITIONTYPE = "SELECT COUNT(positionType) FROM PositionType positionType";
    private static final String _SQL_COUNT_POSITIONTYPE_WHERE = "SELECT COUNT(positionType) FROM PositionType positionType WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "positionType.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PositionType exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No PositionType exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(PositionTypePersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "uuid"
            });
    private static PositionType _nullPositionType = new PositionTypeImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<PositionType> toCacheModel() {
                return _nullPositionTypeCacheModel;
            }
        };

    private static CacheModel<PositionType> _nullPositionTypeCacheModel = new CacheModel<PositionType>() {
            @Override
            public PositionType toEntityModel() {
                return _nullPositionType;
            }
        };

    public PositionTypePersistenceImpl() {
        setModelClass(PositionType.class);
    }

    /**
     * Returns all the position types where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the matching position types
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PositionType> findByUuid(String uuid) throws SystemException {
        return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the position types where uuid = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.PositionTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid the uuid
     * @param start the lower bound of the range of position types
     * @param end the upper bound of the range of position types (not inclusive)
     * @return the range of matching position types
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PositionType> findByUuid(String uuid, int start, int end)
        throws SystemException {
        return findByUuid(uuid, start, end, null);
    }

    /**
     * Returns an ordered range of all the position types where uuid = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.PositionTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid the uuid
     * @param start the lower bound of the range of position types
     * @param end the upper bound of the range of position types (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching position types
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PositionType> findByUuid(String uuid, int start, int end,
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

        List<PositionType> list = (List<PositionType>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (PositionType positionType : list) {
                if (!Validator.equals(uuid, positionType.getUuid())) {
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

            query.append(_SQL_SELECT_POSITIONTYPE_WHERE);

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
                query.append(PositionTypeModelImpl.ORDER_BY_JPQL);
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
                    list = (List<PositionType>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<PositionType>(list);
                } else {
                    list = (List<PositionType>) QueryUtil.list(q, getDialect(),
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
     * Returns the first position type in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching position type
     * @throws ru.hmel.NoSuchPositionTypeException if a matching position type could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PositionType findByUuid_First(String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchPositionTypeException, SystemException {
        PositionType positionType = fetchByUuid_First(uuid, orderByComparator);

        if (positionType != null) {
            return positionType;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPositionTypeException(msg.toString());
    }

    /**
     * Returns the first position type in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching position type, or <code>null</code> if a matching position type could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PositionType fetchByUuid_First(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        List<PositionType> list = findByUuid(uuid, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last position type in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching position type
     * @throws ru.hmel.NoSuchPositionTypeException if a matching position type could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PositionType findByUuid_Last(String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchPositionTypeException, SystemException {
        PositionType positionType = fetchByUuid_Last(uuid, orderByComparator);

        if (positionType != null) {
            return positionType;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPositionTypeException(msg.toString());
    }

    /**
     * Returns the last position type in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching position type, or <code>null</code> if a matching position type could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PositionType fetchByUuid_Last(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUuid(uuid);

        if (count == 0) {
            return null;
        }

        List<PositionType> list = findByUuid(uuid, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the position types before and after the current position type in the ordered set where uuid = &#63;.
     *
     * @param position_id the primary key of the current position type
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next position type
     * @throws ru.hmel.NoSuchPositionTypeException if a position type with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PositionType[] findByUuid_PrevAndNext(long position_id, String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchPositionTypeException, SystemException {
        PositionType positionType = findByPrimaryKey(position_id);

        Session session = null;

        try {
            session = openSession();

            PositionType[] array = new PositionTypeImpl[3];

            array[0] = getByUuid_PrevAndNext(session, positionType, uuid,
                    orderByComparator, true);

            array[1] = positionType;

            array[2] = getByUuid_PrevAndNext(session, positionType, uuid,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected PositionType getByUuid_PrevAndNext(Session session,
        PositionType positionType, String uuid,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_POSITIONTYPE_WHERE);

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
            query.append(PositionTypeModelImpl.ORDER_BY_JPQL);
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
            Object[] values = orderByComparator.getOrderByConditionValues(positionType);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<PositionType> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the position types where uuid = &#63; from the database.
     *
     * @param uuid the uuid
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUuid(String uuid) throws SystemException {
        for (PositionType positionType : findByUuid(uuid, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(positionType);
        }
    }

    /**
     * Returns the number of position types where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the number of matching position types
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

            query.append(_SQL_COUNT_POSITIONTYPE_WHERE);

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
     * Caches the position type in the entity cache if it is enabled.
     *
     * @param positionType the position type
     */
    @Override
    public void cacheResult(PositionType positionType) {
        EntityCacheUtil.putResult(PositionTypeModelImpl.ENTITY_CACHE_ENABLED,
            PositionTypeImpl.class, positionType.getPrimaryKey(), positionType);

        positionType.resetOriginalValues();
    }

    /**
     * Caches the position types in the entity cache if it is enabled.
     *
     * @param positionTypes the position types
     */
    @Override
    public void cacheResult(List<PositionType> positionTypes) {
        for (PositionType positionType : positionTypes) {
            if (EntityCacheUtil.getResult(
                        PositionTypeModelImpl.ENTITY_CACHE_ENABLED,
                        PositionTypeImpl.class, positionType.getPrimaryKey()) == null) {
                cacheResult(positionType);
            } else {
                positionType.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all position types.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(PositionTypeImpl.class.getName());
        }

        EntityCacheUtil.clearCache(PositionTypeImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the position type.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(PositionType positionType) {
        EntityCacheUtil.removeResult(PositionTypeModelImpl.ENTITY_CACHE_ENABLED,
            PositionTypeImpl.class, positionType.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<PositionType> positionTypes) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (PositionType positionType : positionTypes) {
            EntityCacheUtil.removeResult(PositionTypeModelImpl.ENTITY_CACHE_ENABLED,
                PositionTypeImpl.class, positionType.getPrimaryKey());
        }
    }

    /**
     * Creates a new position type with the primary key. Does not add the position type to the database.
     *
     * @param position_id the primary key for the new position type
     * @return the new position type
     */
    @Override
    public PositionType create(long position_id) {
        PositionType positionType = new PositionTypeImpl();

        positionType.setNew(true);
        positionType.setPrimaryKey(position_id);

        String uuid = PortalUUIDUtil.generate();

        positionType.setUuid(uuid);

        return positionType;
    }

    /**
     * Removes the position type with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param position_id the primary key of the position type
     * @return the position type that was removed
     * @throws ru.hmel.NoSuchPositionTypeException if a position type with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PositionType remove(long position_id)
        throws NoSuchPositionTypeException, SystemException {
        return remove((Serializable) position_id);
    }

    /**
     * Removes the position type with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the position type
     * @return the position type that was removed
     * @throws ru.hmel.NoSuchPositionTypeException if a position type with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PositionType remove(Serializable primaryKey)
        throws NoSuchPositionTypeException, SystemException {
        Session session = null;

        try {
            session = openSession();

            PositionType positionType = (PositionType) session.get(PositionTypeImpl.class,
                    primaryKey);

            if (positionType == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchPositionTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(positionType);
        } catch (NoSuchPositionTypeException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected PositionType removeImpl(PositionType positionType)
        throws SystemException {
        positionType = toUnwrappedModel(positionType);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(positionType)) {
                positionType = (PositionType) session.get(PositionTypeImpl.class,
                        positionType.getPrimaryKeyObj());
            }

            if (positionType != null) {
                session.delete(positionType);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (positionType != null) {
            clearCache(positionType);
        }

        return positionType;
    }

    @Override
    public PositionType updateImpl(ru.hmel.model.PositionType positionType)
        throws SystemException {
        positionType = toUnwrappedModel(positionType);

        boolean isNew = positionType.isNew();

        PositionTypeModelImpl positionTypeModelImpl = (PositionTypeModelImpl) positionType;

        if (Validator.isNull(positionType.getUuid())) {
            String uuid = PortalUUIDUtil.generate();

            positionType.setUuid(uuid);
        }

        Session session = null;

        try {
            session = openSession();

            if (positionType.isNew()) {
                session.save(positionType);

                positionType.setNew(false);
            } else {
                session.merge(positionType);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !PositionTypeModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((positionTypeModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        positionTypeModelImpl.getOriginalUuid()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);

                args = new Object[] { positionTypeModelImpl.getUuid() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);
            }
        }

        EntityCacheUtil.putResult(PositionTypeModelImpl.ENTITY_CACHE_ENABLED,
            PositionTypeImpl.class, positionType.getPrimaryKey(), positionType);

        return positionType;
    }

    protected PositionType toUnwrappedModel(PositionType positionType) {
        if (positionType instanceof PositionTypeImpl) {
            return positionType;
        }

        PositionTypeImpl positionTypeImpl = new PositionTypeImpl();

        positionTypeImpl.setNew(positionType.isNew());
        positionTypeImpl.setPrimaryKey(positionType.getPrimaryKey());

        positionTypeImpl.setUuid(positionType.getUuid());
        positionTypeImpl.setPosition_id(positionType.getPosition_id());
        positionTypeImpl.setName(positionType.getName());

        return positionTypeImpl;
    }

    /**
     * Returns the position type with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the position type
     * @return the position type
     * @throws ru.hmel.NoSuchPositionTypeException if a position type with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PositionType findByPrimaryKey(Serializable primaryKey)
        throws NoSuchPositionTypeException, SystemException {
        PositionType positionType = fetchByPrimaryKey(primaryKey);

        if (positionType == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchPositionTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return positionType;
    }

    /**
     * Returns the position type with the primary key or throws a {@link ru.hmel.NoSuchPositionTypeException} if it could not be found.
     *
     * @param position_id the primary key of the position type
     * @return the position type
     * @throws ru.hmel.NoSuchPositionTypeException if a position type with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PositionType findByPrimaryKey(long position_id)
        throws NoSuchPositionTypeException, SystemException {
        return findByPrimaryKey((Serializable) position_id);
    }

    /**
     * Returns the position type with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the position type
     * @return the position type, or <code>null</code> if a position type with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PositionType fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        PositionType positionType = (PositionType) EntityCacheUtil.getResult(PositionTypeModelImpl.ENTITY_CACHE_ENABLED,
                PositionTypeImpl.class, primaryKey);

        if (positionType == _nullPositionType) {
            return null;
        }

        if (positionType == null) {
            Session session = null;

            try {
                session = openSession();

                positionType = (PositionType) session.get(PositionTypeImpl.class,
                        primaryKey);

                if (positionType != null) {
                    cacheResult(positionType);
                } else {
                    EntityCacheUtil.putResult(PositionTypeModelImpl.ENTITY_CACHE_ENABLED,
                        PositionTypeImpl.class, primaryKey, _nullPositionType);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(PositionTypeModelImpl.ENTITY_CACHE_ENABLED,
                    PositionTypeImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return positionType;
    }

    /**
     * Returns the position type with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param position_id the primary key of the position type
     * @return the position type, or <code>null</code> if a position type with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PositionType fetchByPrimaryKey(long position_id)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) position_id);
    }

    /**
     * Returns all the position types.
     *
     * @return the position types
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PositionType> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the position types.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.PositionTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of position types
     * @param end the upper bound of the range of position types (not inclusive)
     * @return the range of position types
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PositionType> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the position types.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.PositionTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of position types
     * @param end the upper bound of the range of position types (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of position types
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PositionType> findAll(int start, int end,
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

        List<PositionType> list = (List<PositionType>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_POSITIONTYPE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_POSITIONTYPE;

                if (pagination) {
                    sql = sql.concat(PositionTypeModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<PositionType>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<PositionType>(list);
                } else {
                    list = (List<PositionType>) QueryUtil.list(q, getDialect(),
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
     * Removes all the position types from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (PositionType positionType : findAll()) {
            remove(positionType);
        }
    }

    /**
     * Returns the number of position types.
     *
     * @return the number of position types
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

                Query q = session.createQuery(_SQL_COUNT_POSITIONTYPE);

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
     * Initializes the position type persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.ru.hmel.model.PositionType")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<PositionType>> listenersList = new ArrayList<ModelListener<PositionType>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<PositionType>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(PositionTypeImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
