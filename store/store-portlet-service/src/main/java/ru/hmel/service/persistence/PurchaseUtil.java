package ru.hmel.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import ru.hmel.model.Purchase;

import java.util.List;

/**
 * The persistence utility for the purchase service. This utility wraps {@link PurchasePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PurchasePersistence
 * @see PurchasePersistenceImpl
 * @generated
 */
public class PurchaseUtil {
    private static PurchasePersistence _persistence;

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
    public static void clearCache(Purchase purchase) {
        getPersistence().clearCache(purchase);
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
    public static List<Purchase> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Purchase> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Purchase> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Purchase update(Purchase purchase) throws SystemException {
        return getPersistence().update(purchase);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Purchase update(Purchase purchase,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(purchase, serviceContext);
    }

    /**
    * Returns all the purchases where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching purchases
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.hmel.model.Purchase> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid);
    }

    /**
    * Returns a range of all the purchases where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.PurchaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of purchases
    * @param end the upper bound of the range of purchases (not inclusive)
    * @return the range of matching purchases
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.hmel.model.Purchase> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end);
    }

    /**
    * Returns an ordered range of all the purchases where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.PurchaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of purchases
    * @param end the upper bound of the range of purchases (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching purchases
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.hmel.model.Purchase> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end, orderByComparator);
    }

    /**
    * Returns the first purchase in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching purchase
    * @throws ru.hmel.NoSuchPurchaseException if a matching purchase could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.Purchase findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPurchaseException {
        return getPersistence().findByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the first purchase in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching purchase, or <code>null</code> if a matching purchase could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.Purchase fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the last purchase in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching purchase
    * @throws ru.hmel.NoSuchPurchaseException if a matching purchase could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.Purchase findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPurchaseException {
        return getPersistence().findByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the last purchase in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching purchase, or <code>null</code> if a matching purchase could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.Purchase fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the purchases before and after the current purchase in the ordered set where uuid = &#63;.
    *
    * @param purchase_id the primary key of the current purchase
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next purchase
    * @throws ru.hmel.NoSuchPurchaseException if a purchase with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.Purchase[] findByUuid_PrevAndNext(
        long purchase_id, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPurchaseException {
        return getPersistence()
                   .findByUuid_PrevAndNext(purchase_id, uuid, orderByComparator);
    }

    /**
    * Removes all the purchases where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public static void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByUuid(uuid);
    }

    /**
    * Returns the number of purchases where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching purchases
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid(uuid);
    }

    /**
    * Returns all the purchases where electro_id = &#63;.
    *
    * @param electro_id the electro_id
    * @return the matching purchases
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.hmel.model.Purchase> findByelectronics_id(
        long electro_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByelectronics_id(electro_id);
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
    public static java.util.List<ru.hmel.model.Purchase> findByelectronics_id(
        long electro_id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByelectronics_id(electro_id, start, end);
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
    public static java.util.List<ru.hmel.model.Purchase> findByelectronics_id(
        long electro_id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByelectronics_id(electro_id, start, end,
            orderByComparator);
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
    public static ru.hmel.model.Purchase findByelectronics_id_First(
        long electro_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPurchaseException {
        return getPersistence()
                   .findByelectronics_id_First(electro_id, orderByComparator);
    }

    /**
    * Returns the first purchase in the ordered set where electro_id = &#63;.
    *
    * @param electro_id the electro_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching purchase, or <code>null</code> if a matching purchase could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.Purchase fetchByelectronics_id_First(
        long electro_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByelectronics_id_First(electro_id, orderByComparator);
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
    public static ru.hmel.model.Purchase findByelectronics_id_Last(
        long electro_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPurchaseException {
        return getPersistence()
                   .findByelectronics_id_Last(electro_id, orderByComparator);
    }

    /**
    * Returns the last purchase in the ordered set where electro_id = &#63;.
    *
    * @param electro_id the electro_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching purchase, or <code>null</code> if a matching purchase could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.Purchase fetchByelectronics_id_Last(
        long electro_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByelectronics_id_Last(electro_id, orderByComparator);
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
    public static ru.hmel.model.Purchase[] findByelectronics_id_PrevAndNext(
        long purchase_id, long electro_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPurchaseException {
        return getPersistence()
                   .findByelectronics_id_PrevAndNext(purchase_id, electro_id,
            orderByComparator);
    }

    /**
    * Removes all the purchases where electro_id = &#63; from the database.
    *
    * @param electro_id the electro_id
    * @throws SystemException if a system exception occurred
    */
    public static void removeByelectronics_id(long electro_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByelectronics_id(electro_id);
    }

    /**
    * Returns the number of purchases where electro_id = &#63;.
    *
    * @param electro_id the electro_id
    * @return the number of matching purchases
    * @throws SystemException if a system exception occurred
    */
    public static int countByelectronics_id(long electro_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByelectronics_id(electro_id);
    }

    /**
    * Returns all the purchases where employee_id = &#63;.
    *
    * @param employee_id the employee_id
    * @return the matching purchases
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.hmel.model.Purchase> findByemployee_id(
        long employee_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByemployee_id(employee_id);
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
    public static java.util.List<ru.hmel.model.Purchase> findByemployee_id(
        long employee_id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByemployee_id(employee_id, start, end);
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
    public static java.util.List<ru.hmel.model.Purchase> findByemployee_id(
        long employee_id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByemployee_id(employee_id, start, end, orderByComparator);
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
    public static ru.hmel.model.Purchase findByemployee_id_First(
        long employee_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPurchaseException {
        return getPersistence()
                   .findByemployee_id_First(employee_id, orderByComparator);
    }

    /**
    * Returns the first purchase in the ordered set where employee_id = &#63;.
    *
    * @param employee_id the employee_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching purchase, or <code>null</code> if a matching purchase could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.Purchase fetchByemployee_id_First(
        long employee_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByemployee_id_First(employee_id, orderByComparator);
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
    public static ru.hmel.model.Purchase findByemployee_id_Last(
        long employee_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPurchaseException {
        return getPersistence()
                   .findByemployee_id_Last(employee_id, orderByComparator);
    }

    /**
    * Returns the last purchase in the ordered set where employee_id = &#63;.
    *
    * @param employee_id the employee_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching purchase, or <code>null</code> if a matching purchase could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.Purchase fetchByemployee_id_Last(
        long employee_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByemployee_id_Last(employee_id, orderByComparator);
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
    public static ru.hmel.model.Purchase[] findByemployee_id_PrevAndNext(
        long purchase_id, long employee_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPurchaseException {
        return getPersistence()
                   .findByemployee_id_PrevAndNext(purchase_id, employee_id,
            orderByComparator);
    }

    /**
    * Removes all the purchases where employee_id = &#63; from the database.
    *
    * @param employee_id the employee_id
    * @throws SystemException if a system exception occurred
    */
    public static void removeByemployee_id(long employee_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByemployee_id(employee_id);
    }

    /**
    * Returns the number of purchases where employee_id = &#63;.
    *
    * @param employee_id the employee_id
    * @return the number of matching purchases
    * @throws SystemException if a system exception occurred
    */
    public static int countByemployee_id(long employee_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByemployee_id(employee_id);
    }

    /**
    * Returns all the purchases where type = &#63;.
    *
    * @param type the type
    * @return the matching purchases
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.hmel.model.Purchase> findBypurchase_type_id(
        long type) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBypurchase_type_id(type);
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
    public static java.util.List<ru.hmel.model.Purchase> findBypurchase_type_id(
        long type, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBypurchase_type_id(type, start, end);
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
    public static java.util.List<ru.hmel.model.Purchase> findBypurchase_type_id(
        long type, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findBypurchase_type_id(type, start, end, orderByComparator);
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
    public static ru.hmel.model.Purchase findBypurchase_type_id_First(
        long type,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPurchaseException {
        return getPersistence()
                   .findBypurchase_type_id_First(type, orderByComparator);
    }

    /**
    * Returns the first purchase in the ordered set where type = &#63;.
    *
    * @param type the type
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching purchase, or <code>null</code> if a matching purchase could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.Purchase fetchBypurchase_type_id_First(
        long type,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchBypurchase_type_id_First(type, orderByComparator);
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
    public static ru.hmel.model.Purchase findBypurchase_type_id_Last(
        long type,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPurchaseException {
        return getPersistence()
                   .findBypurchase_type_id_Last(type, orderByComparator);
    }

    /**
    * Returns the last purchase in the ordered set where type = &#63;.
    *
    * @param type the type
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching purchase, or <code>null</code> if a matching purchase could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.Purchase fetchBypurchase_type_id_Last(
        long type,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchBypurchase_type_id_Last(type, orderByComparator);
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
    public static ru.hmel.model.Purchase[] findBypurchase_type_id_PrevAndNext(
        long purchase_id, long type,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPurchaseException {
        return getPersistence()
                   .findBypurchase_type_id_PrevAndNext(purchase_id, type,
            orderByComparator);
    }

    /**
    * Removes all the purchases where type = &#63; from the database.
    *
    * @param type the type
    * @throws SystemException if a system exception occurred
    */
    public static void removeBypurchase_type_id(long type)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeBypurchase_type_id(type);
    }

    /**
    * Returns the number of purchases where type = &#63;.
    *
    * @param type the type
    * @return the number of matching purchases
    * @throws SystemException if a system exception occurred
    */
    public static int countBypurchase_type_id(long type)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countBypurchase_type_id(type);
    }

    /**
    * Caches the purchase in the entity cache if it is enabled.
    *
    * @param purchase the purchase
    */
    public static void cacheResult(ru.hmel.model.Purchase purchase) {
        getPersistence().cacheResult(purchase);
    }

    /**
    * Caches the purchases in the entity cache if it is enabled.
    *
    * @param purchases the purchases
    */
    public static void cacheResult(
        java.util.List<ru.hmel.model.Purchase> purchases) {
        getPersistence().cacheResult(purchases);
    }

    /**
    * Creates a new purchase with the primary key. Does not add the purchase to the database.
    *
    * @param purchase_id the primary key for the new purchase
    * @return the new purchase
    */
    public static ru.hmel.model.Purchase create(long purchase_id) {
        return getPersistence().create(purchase_id);
    }

    /**
    * Removes the purchase with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param purchase_id the primary key of the purchase
    * @return the purchase that was removed
    * @throws ru.hmel.NoSuchPurchaseException if a purchase with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.Purchase remove(long purchase_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPurchaseException {
        return getPersistence().remove(purchase_id);
    }

    public static ru.hmel.model.Purchase updateImpl(
        ru.hmel.model.Purchase purchase)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(purchase);
    }

    /**
    * Returns the purchase with the primary key or throws a {@link ru.hmel.NoSuchPurchaseException} if it could not be found.
    *
    * @param purchase_id the primary key of the purchase
    * @return the purchase
    * @throws ru.hmel.NoSuchPurchaseException if a purchase with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.Purchase findByPrimaryKey(long purchase_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPurchaseException {
        return getPersistence().findByPrimaryKey(purchase_id);
    }

    /**
    * Returns the purchase with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param purchase_id the primary key of the purchase
    * @return the purchase, or <code>null</code> if a purchase with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.Purchase fetchByPrimaryKey(long purchase_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(purchase_id);
    }

    /**
    * Returns all the purchases.
    *
    * @return the purchases
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.hmel.model.Purchase> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<ru.hmel.model.Purchase> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
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
    public static java.util.List<ru.hmel.model.Purchase> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the purchases from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of purchases.
    *
    * @return the number of purchases
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static PurchasePersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (PurchasePersistence) PortletBeanLocatorUtil.locate(ru.hmel.service.ClpSerializer.getServletContextName(),
                    PurchasePersistence.class.getName());

            ReferenceRegistry.registerReference(PurchaseUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(PurchasePersistence persistence) {
    }
}
