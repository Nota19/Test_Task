package ru.hmel.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import ru.hmel.model.PurchaseType;

import java.util.List;

/**
 * The persistence utility for the purchase type service. This utility wraps {@link PurchaseTypePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PurchaseTypePersistence
 * @see PurchaseTypePersistenceImpl
 * @generated
 */
public class PurchaseTypeUtil {
    private static PurchaseTypePersistence _persistence;

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
    public static void clearCache(PurchaseType purchaseType) {
        getPersistence().clearCache(purchaseType);
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
    public static List<PurchaseType> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<PurchaseType> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<PurchaseType> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static PurchaseType update(PurchaseType purchaseType)
        throws SystemException {
        return getPersistence().update(purchaseType);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static PurchaseType update(PurchaseType purchaseType,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(purchaseType, serviceContext);
    }

    /**
    * Returns all the purchase types where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching purchase types
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.hmel.model.PurchaseType> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid);
    }

    /**
    * Returns a range of all the purchase types where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.PurchaseTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of purchase types
    * @param end the upper bound of the range of purchase types (not inclusive)
    * @return the range of matching purchase types
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.hmel.model.PurchaseType> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end);
    }

    /**
    * Returns an ordered range of all the purchase types where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.PurchaseTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of purchase types
    * @param end the upper bound of the range of purchase types (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching purchase types
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.hmel.model.PurchaseType> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end, orderByComparator);
    }

    /**
    * Returns the first purchase type in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching purchase type
    * @throws ru.hmel.NoSuchPurchaseTypeException if a matching purchase type could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.PurchaseType findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPurchaseTypeException {
        return getPersistence().findByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the first purchase type in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching purchase type, or <code>null</code> if a matching purchase type could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.PurchaseType fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the last purchase type in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching purchase type
    * @throws ru.hmel.NoSuchPurchaseTypeException if a matching purchase type could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.PurchaseType findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPurchaseTypeException {
        return getPersistence().findByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the last purchase type in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching purchase type, or <code>null</code> if a matching purchase type could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.PurchaseType fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the purchase types before and after the current purchase type in the ordered set where uuid = &#63;.
    *
    * @param purchase_type_id the primary key of the current purchase type
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next purchase type
    * @throws ru.hmel.NoSuchPurchaseTypeException if a purchase type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.PurchaseType[] findByUuid_PrevAndNext(
        long purchase_type_id, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPurchaseTypeException {
        return getPersistence()
                   .findByUuid_PrevAndNext(purchase_type_id, uuid,
            orderByComparator);
    }

    /**
    * Removes all the purchase types where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public static void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByUuid(uuid);
    }

    /**
    * Returns the number of purchase types where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching purchase types
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid(uuid);
    }

    /**
    * Caches the purchase type in the entity cache if it is enabled.
    *
    * @param purchaseType the purchase type
    */
    public static void cacheResult(ru.hmel.model.PurchaseType purchaseType) {
        getPersistence().cacheResult(purchaseType);
    }

    /**
    * Caches the purchase types in the entity cache if it is enabled.
    *
    * @param purchaseTypes the purchase types
    */
    public static void cacheResult(
        java.util.List<ru.hmel.model.PurchaseType> purchaseTypes) {
        getPersistence().cacheResult(purchaseTypes);
    }

    /**
    * Creates a new purchase type with the primary key. Does not add the purchase type to the database.
    *
    * @param purchase_type_id the primary key for the new purchase type
    * @return the new purchase type
    */
    public static ru.hmel.model.PurchaseType create(long purchase_type_id) {
        return getPersistence().create(purchase_type_id);
    }

    /**
    * Removes the purchase type with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param purchase_type_id the primary key of the purchase type
    * @return the purchase type that was removed
    * @throws ru.hmel.NoSuchPurchaseTypeException if a purchase type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.PurchaseType remove(long purchase_type_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPurchaseTypeException {
        return getPersistence().remove(purchase_type_id);
    }

    public static ru.hmel.model.PurchaseType updateImpl(
        ru.hmel.model.PurchaseType purchaseType)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(purchaseType);
    }

    /**
    * Returns the purchase type with the primary key or throws a {@link ru.hmel.NoSuchPurchaseTypeException} if it could not be found.
    *
    * @param purchase_type_id the primary key of the purchase type
    * @return the purchase type
    * @throws ru.hmel.NoSuchPurchaseTypeException if a purchase type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.PurchaseType findByPrimaryKey(
        long purchase_type_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPurchaseTypeException {
        return getPersistence().findByPrimaryKey(purchase_type_id);
    }

    /**
    * Returns the purchase type with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param purchase_type_id the primary key of the purchase type
    * @return the purchase type, or <code>null</code> if a purchase type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.PurchaseType fetchByPrimaryKey(
        long purchase_type_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(purchase_type_id);
    }

    /**
    * Returns all the purchase types.
    *
    * @return the purchase types
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.hmel.model.PurchaseType> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<ru.hmel.model.PurchaseType> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
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
    public static java.util.List<ru.hmel.model.PurchaseType> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the purchase types from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of purchase types.
    *
    * @return the number of purchase types
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static PurchaseTypePersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (PurchaseTypePersistence) PortletBeanLocatorUtil.locate(ru.hmel.service.ClpSerializer.getServletContextName(),
                    PurchaseTypePersistence.class.getName());

            ReferenceRegistry.registerReference(PurchaseTypeUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(PurchaseTypePersistence persistence) {
    }
}