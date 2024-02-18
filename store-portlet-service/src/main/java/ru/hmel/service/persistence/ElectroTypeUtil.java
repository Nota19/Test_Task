package ru.hmel.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import ru.hmel.model.ElectroType;

import java.util.List;

/**
 * The persistence utility for the electro type service. This utility wraps {@link ElectroTypePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ElectroTypePersistence
 * @see ElectroTypePersistenceImpl
 * @generated
 */
public class ElectroTypeUtil {
    private static ElectroTypePersistence _persistence;

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
    public static void clearCache(ElectroType electroType) {
        getPersistence().clearCache(electroType);
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
    public static List<ElectroType> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<ElectroType> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<ElectroType> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static ElectroType update(ElectroType electroType)
        throws SystemException {
        return getPersistence().update(electroType);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static ElectroType update(ElectroType electroType,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(electroType, serviceContext);
    }

    /**
    * Returns all the electro types where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching electro types
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.hmel.model.ElectroType> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid);
    }

    /**
    * Returns a range of all the electro types where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.ElectroTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of electro types
    * @param end the upper bound of the range of electro types (not inclusive)
    * @return the range of matching electro types
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.hmel.model.ElectroType> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end);
    }

    /**
    * Returns an ordered range of all the electro types where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.ElectroTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of electro types
    * @param end the upper bound of the range of electro types (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching electro types
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.hmel.model.ElectroType> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end, orderByComparator);
    }

    /**
    * Returns the first electro type in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching electro type
    * @throws ru.hmel.NoSuchElectroTypeException if a matching electro type could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.ElectroType findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchElectroTypeException {
        return getPersistence().findByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the first electro type in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching electro type, or <code>null</code> if a matching electro type could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.ElectroType fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the last electro type in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching electro type
    * @throws ru.hmel.NoSuchElectroTypeException if a matching electro type could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.ElectroType findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchElectroTypeException {
        return getPersistence().findByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the last electro type in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching electro type, or <code>null</code> if a matching electro type could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.ElectroType fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the electro types before and after the current electro type in the ordered set where uuid = &#63;.
    *
    * @param electro_type_id the primary key of the current electro type
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next electro type
    * @throws ru.hmel.NoSuchElectroTypeException if a electro type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.ElectroType[] findByUuid_PrevAndNext(
        long electro_type_id, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchElectroTypeException {
        return getPersistence()
                   .findByUuid_PrevAndNext(electro_type_id, uuid,
            orderByComparator);
    }

    /**
    * Removes all the electro types where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public static void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByUuid(uuid);
    }

    /**
    * Returns the number of electro types where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching electro types
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid(uuid);
    }

    /**
    * Caches the electro type in the entity cache if it is enabled.
    *
    * @param electroType the electro type
    */
    public static void cacheResult(ru.hmel.model.ElectroType electroType) {
        getPersistence().cacheResult(electroType);
    }

    /**
    * Caches the electro types in the entity cache if it is enabled.
    *
    * @param electroTypes the electro types
    */
    public static void cacheResult(
        java.util.List<ru.hmel.model.ElectroType> electroTypes) {
        getPersistence().cacheResult(electroTypes);
    }

    /**
    * Creates a new electro type with the primary key. Does not add the electro type to the database.
    *
    * @param electro_type_id the primary key for the new electro type
    * @return the new electro type
    */
    public static ru.hmel.model.ElectroType create(long electro_type_id) {
        return getPersistence().create(electro_type_id);
    }

    /**
    * Removes the electro type with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param electro_type_id the primary key of the electro type
    * @return the electro type that was removed
    * @throws ru.hmel.NoSuchElectroTypeException if a electro type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.ElectroType remove(long electro_type_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchElectroTypeException {
        return getPersistence().remove(electro_type_id);
    }

    public static ru.hmel.model.ElectroType updateImpl(
        ru.hmel.model.ElectroType electroType)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(electroType);
    }

    /**
    * Returns the electro type with the primary key or throws a {@link ru.hmel.NoSuchElectroTypeException} if it could not be found.
    *
    * @param electro_type_id the primary key of the electro type
    * @return the electro type
    * @throws ru.hmel.NoSuchElectroTypeException if a electro type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.ElectroType findByPrimaryKey(
        long electro_type_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchElectroTypeException {
        return getPersistence().findByPrimaryKey(electro_type_id);
    }

    /**
    * Returns the electro type with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param electro_type_id the primary key of the electro type
    * @return the electro type, or <code>null</code> if a electro type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.ElectroType fetchByPrimaryKey(
        long electro_type_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(electro_type_id);
    }

    /**
    * Returns all the electro types.
    *
    * @return the electro types
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.hmel.model.ElectroType> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<ru.hmel.model.ElectroType> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
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
    public static java.util.List<ru.hmel.model.ElectroType> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the electro types from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of electro types.
    *
    * @return the number of electro types
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static ElectroTypePersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (ElectroTypePersistence) PortletBeanLocatorUtil.locate(ru.hmel.service.ClpSerializer.getServletContextName(),
                    ElectroTypePersistence.class.getName());

            ReferenceRegistry.registerReference(ElectroTypeUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(ElectroTypePersistence persistence) {
    }
}
