package ru.hmel.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import ru.hmel.model.PositionType;

/**
 * The persistence interface for the position type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PositionTypePersistenceImpl
 * @see PositionTypeUtil
 * @generated
 */
public interface PositionTypePersistence extends BasePersistence<PositionType> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link PositionTypeUtil} to access the position type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the position types where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching position types
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ru.hmel.model.PositionType> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.hmel.model.PositionType> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.hmel.model.PositionType> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first position type in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching position type
    * @throws ru.hmel.NoSuchPositionTypeException if a matching position type could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.PositionType findByUuid_First(java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPositionTypeException;

    /**
    * Returns the first position type in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching position type, or <code>null</code> if a matching position type could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.PositionType fetchByUuid_First(java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last position type in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching position type
    * @throws ru.hmel.NoSuchPositionTypeException if a matching position type could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.PositionType findByUuid_Last(java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPositionTypeException;

    /**
    * Returns the last position type in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching position type, or <code>null</code> if a matching position type could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.PositionType fetchByUuid_Last(java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public ru.hmel.model.PositionType[] findByUuid_PrevAndNext(
        long position_id, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPositionTypeException;

    /**
    * Removes all the position types where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of position types where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching position types
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the position type in the entity cache if it is enabled.
    *
    * @param positionType the position type
    */
    public void cacheResult(ru.hmel.model.PositionType positionType);

    /**
    * Caches the position types in the entity cache if it is enabled.
    *
    * @param positionTypes the position types
    */
    public void cacheResult(
        java.util.List<ru.hmel.model.PositionType> positionTypes);

    /**
    * Creates a new position type with the primary key. Does not add the position type to the database.
    *
    * @param position_id the primary key for the new position type
    * @return the new position type
    */
    public ru.hmel.model.PositionType create(long position_id);

    /**
    * Removes the position type with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param position_id the primary key of the position type
    * @return the position type that was removed
    * @throws ru.hmel.NoSuchPositionTypeException if a position type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.PositionType remove(long position_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPositionTypeException;

    public ru.hmel.model.PositionType updateImpl(
        ru.hmel.model.PositionType positionType)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the position type with the primary key or throws a {@link ru.hmel.NoSuchPositionTypeException} if it could not be found.
    *
    * @param position_id the primary key of the position type
    * @return the position type
    * @throws ru.hmel.NoSuchPositionTypeException if a position type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.PositionType findByPrimaryKey(long position_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPositionTypeException;

    /**
    * Returns the position type with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param position_id the primary key of the position type
    * @return the position type, or <code>null</code> if a position type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.PositionType fetchByPrimaryKey(long position_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the position types.
    *
    * @return the position types
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ru.hmel.model.PositionType> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.hmel.model.PositionType> findAll(int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.hmel.model.PositionType> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the position types from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of position types.
    *
    * @return the number of position types
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
