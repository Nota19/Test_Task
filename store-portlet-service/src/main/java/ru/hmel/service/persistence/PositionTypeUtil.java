package ru.hmel.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import ru.hmel.model.PositionType;

import java.util.List;

/**
 * The persistence utility for the position type service. This utility wraps {@link PositionTypePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PositionTypePersistence
 * @see PositionTypePersistenceImpl
 * @generated
 */
public class PositionTypeUtil {
    private static PositionTypePersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(PositionType positionType) {
        getPersistence().clearCache(positionType);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<PositionType> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<PositionType> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<PositionType> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static PositionType update(PositionType positionType)
        throws SystemException {
        return getPersistence().update(positionType);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static PositionType update(PositionType positionType,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(positionType, serviceContext);
    }

    /**
    * Returns all the position types where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching position types
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.hmel.model.PositionType> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid);
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
    public static java.util.List<ru.hmel.model.PositionType> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end);
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
    public static java.util.List<ru.hmel.model.PositionType> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end, orderByComparator);
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
    public static ru.hmel.model.PositionType findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPositionTypeException {
        return getPersistence().findByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the first position type in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching position type, or <code>null</code> if a matching position type could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.PositionType fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_First(uuid, orderByComparator);
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
    public static ru.hmel.model.PositionType findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPositionTypeException {
        return getPersistence().findByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the last position type in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching position type, or <code>null</code> if a matching position type could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.PositionType fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
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
    public static ru.hmel.model.PositionType[] findByUuid_PrevAndNext(
        long position_id, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPositionTypeException {
        return getPersistence()
                   .findByUuid_PrevAndNext(position_id, uuid, orderByComparator);
    }

    /**
    * Removes all the position types where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public static void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByUuid(uuid);
    }

    /**
    * Returns the number of position types where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching position types
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid(uuid);
    }

    /**
    * Caches the position type in the entity cache if it is enabled.
    *
    * @param positionType the position type
    */
    public static void cacheResult(ru.hmel.model.PositionType positionType) {
        getPersistence().cacheResult(positionType);
    }

    /**
    * Caches the position types in the entity cache if it is enabled.
    *
    * @param positionTypes the position types
    */
    public static void cacheResult(
        java.util.List<ru.hmel.model.PositionType> positionTypes) {
        getPersistence().cacheResult(positionTypes);
    }

    /**
    * Creates a new position type with the primary key. Does not add the position type to the database.
    *
    * @param position_id the primary key for the new position type
    * @return the new position type
    */
    public static ru.hmel.model.PositionType create(long position_id) {
        return getPersistence().create(position_id);
    }

    /**
    * Removes the position type with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param position_id the primary key of the position type
    * @return the position type that was removed
    * @throws ru.hmel.NoSuchPositionTypeException if a position type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.PositionType remove(long position_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPositionTypeException {
        return getPersistence().remove(position_id);
    }

    public static ru.hmel.model.PositionType updateImpl(
        ru.hmel.model.PositionType positionType)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(positionType);
    }

    /**
    * Returns the position type with the primary key or throws a {@link ru.hmel.NoSuchPositionTypeException} if it could not be found.
    *
    * @param position_id the primary key of the position type
    * @return the position type
    * @throws ru.hmel.NoSuchPositionTypeException if a position type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.PositionType findByPrimaryKey(long position_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPositionTypeException {
        return getPersistence().findByPrimaryKey(position_id);
    }

    /**
    * Returns the position type with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param position_id the primary key of the position type
    * @return the position type, or <code>null</code> if a position type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.PositionType fetchByPrimaryKey(long position_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(position_id);
    }

    /**
    * Returns all the position types.
    *
    * @return the position types
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.hmel.model.PositionType> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<ru.hmel.model.PositionType> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
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
    public static java.util.List<ru.hmel.model.PositionType> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the position types from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of position types.
    *
    * @return the number of position types
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static PositionTypePersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (PositionTypePersistence) PortletBeanLocatorUtil.locate(ru.hmel.service.ClpSerializer.getServletContextName(),
                    PositionTypePersistence.class.getName());

            ReferenceRegistry.registerReference(PositionTypeUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(PositionTypePersistence persistence) {
    }
}
