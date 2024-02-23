package ru.hmel.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import ru.hmel.model.Purchase;

/**
 * The persistence interface for the purchase service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Hmel Max
 * @see PurchasePersistenceImpl
 * @see PurchaseUtil
 * @generated
 */
public interface PurchasePersistence extends BasePersistence<Purchase> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link PurchaseUtil} to access the purchase persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the purchases where electro_id = &#63;.
    *
    * @param electro_id the electro_id
    * @return the matching purchases
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ru.hmel.model.Purchase> findByelectronics_id(
        long electro_id)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.hmel.model.Purchase> findByelectronics_id(
        long electro_id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.hmel.model.Purchase> findByelectronics_id(
        long electro_id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first purchase in the ordered set where electro_id = &#63;.
    *
    * @param electro_id the electro_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching purchase
    * @throws ru.hmel.NoSuchPurchaseException if a matching purchase could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.Purchase findByelectronics_id_First(long electro_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPurchaseException;

    /**
    * Returns the first purchase in the ordered set where electro_id = &#63;.
    *
    * @param electro_id the electro_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching purchase, or <code>null</code> if a matching purchase could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.Purchase fetchByelectronics_id_First(long electro_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last purchase in the ordered set where electro_id = &#63;.
    *
    * @param electro_id the electro_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching purchase
    * @throws ru.hmel.NoSuchPurchaseException if a matching purchase could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.Purchase findByelectronics_id_Last(long electro_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPurchaseException;

    /**
    * Returns the last purchase in the ordered set where electro_id = &#63;.
    *
    * @param electro_id the electro_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching purchase, or <code>null</code> if a matching purchase could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.Purchase fetchByelectronics_id_Last(long electro_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public ru.hmel.model.Purchase[] findByelectronics_id_PrevAndNext(
        long purchase_id, long electro_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPurchaseException;

    /**
    * Removes all the purchases where electro_id = &#63; from the database.
    *
    * @param electro_id the electro_id
    * @throws SystemException if a system exception occurred
    */
    public void removeByelectronics_id(long electro_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of purchases where electro_id = &#63;.
    *
    * @param electro_id the electro_id
    * @return the number of matching purchases
    * @throws SystemException if a system exception occurred
    */
    public int countByelectronics_id(long electro_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the purchases where employee_id = &#63;.
    *
    * @param employee_id the employee_id
    * @return the matching purchases
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ru.hmel.model.Purchase> findByemployee_id(
        long employee_id)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.hmel.model.Purchase> findByemployee_id(
        long employee_id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.hmel.model.Purchase> findByemployee_id(
        long employee_id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first purchase in the ordered set where employee_id = &#63;.
    *
    * @param employee_id the employee_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching purchase
    * @throws ru.hmel.NoSuchPurchaseException if a matching purchase could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.Purchase findByemployee_id_First(long employee_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPurchaseException;

    /**
    * Returns the first purchase in the ordered set where employee_id = &#63;.
    *
    * @param employee_id the employee_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching purchase, or <code>null</code> if a matching purchase could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.Purchase fetchByemployee_id_First(long employee_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last purchase in the ordered set where employee_id = &#63;.
    *
    * @param employee_id the employee_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching purchase
    * @throws ru.hmel.NoSuchPurchaseException if a matching purchase could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.Purchase findByemployee_id_Last(long employee_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPurchaseException;

    /**
    * Returns the last purchase in the ordered set where employee_id = &#63;.
    *
    * @param employee_id the employee_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching purchase, or <code>null</code> if a matching purchase could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.Purchase fetchByemployee_id_Last(long employee_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public ru.hmel.model.Purchase[] findByemployee_id_PrevAndNext(
        long purchase_id, long employee_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPurchaseException;

    /**
    * Removes all the purchases where employee_id = &#63; from the database.
    *
    * @param employee_id the employee_id
    * @throws SystemException if a system exception occurred
    */
    public void removeByemployee_id(long employee_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of purchases where employee_id = &#63;.
    *
    * @param employee_id the employee_id
    * @return the number of matching purchases
    * @throws SystemException if a system exception occurred
    */
    public int countByemployee_id(long employee_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the purchases where type = &#63;.
    *
    * @param type the type
    * @return the matching purchases
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ru.hmel.model.Purchase> findBypurchase_type_id(
        long type) throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.hmel.model.Purchase> findBypurchase_type_id(
        long type, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.hmel.model.Purchase> findBypurchase_type_id(
        long type, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first purchase in the ordered set where type = &#63;.
    *
    * @param type the type
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching purchase
    * @throws ru.hmel.NoSuchPurchaseException if a matching purchase could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.Purchase findBypurchase_type_id_First(long type,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPurchaseException;

    /**
    * Returns the first purchase in the ordered set where type = &#63;.
    *
    * @param type the type
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching purchase, or <code>null</code> if a matching purchase could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.Purchase fetchBypurchase_type_id_First(long type,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last purchase in the ordered set where type = &#63;.
    *
    * @param type the type
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching purchase
    * @throws ru.hmel.NoSuchPurchaseException if a matching purchase could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.Purchase findBypurchase_type_id_Last(long type,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPurchaseException;

    /**
    * Returns the last purchase in the ordered set where type = &#63;.
    *
    * @param type the type
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching purchase, or <code>null</code> if a matching purchase could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.Purchase fetchBypurchase_type_id_Last(long type,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public ru.hmel.model.Purchase[] findBypurchase_type_id_PrevAndNext(
        long purchase_id, long type,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPurchaseException;

    /**
    * Removes all the purchases where type = &#63; from the database.
    *
    * @param type the type
    * @throws SystemException if a system exception occurred
    */
    public void removeBypurchase_type_id(long type)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of purchases where type = &#63;.
    *
    * @param type the type
    * @return the number of matching purchases
    * @throws SystemException if a system exception occurred
    */
    public int countBypurchase_type_id(long type)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the purchase in the entity cache if it is enabled.
    *
    * @param purchase the purchase
    */
    public void cacheResult(ru.hmel.model.Purchase purchase);

    /**
    * Caches the purchases in the entity cache if it is enabled.
    *
    * @param purchases the purchases
    */
    public void cacheResult(java.util.List<ru.hmel.model.Purchase> purchases);

    /**
    * Creates a new purchase with the primary key. Does not add the purchase to the database.
    *
    * @param purchase_id the primary key for the new purchase
    * @return the new purchase
    */
    public ru.hmel.model.Purchase create(long purchase_id);

    /**
    * Removes the purchase with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param purchase_id the primary key of the purchase
    * @return the purchase that was removed
    * @throws ru.hmel.NoSuchPurchaseException if a purchase with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.Purchase remove(long purchase_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPurchaseException;

    public ru.hmel.model.Purchase updateImpl(ru.hmel.model.Purchase purchase)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the purchase with the primary key or throws a {@link ru.hmel.NoSuchPurchaseException} if it could not be found.
    *
    * @param purchase_id the primary key of the purchase
    * @return the purchase
    * @throws ru.hmel.NoSuchPurchaseException if a purchase with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.Purchase findByPrimaryKey(long purchase_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPurchaseException;

    /**
    * Returns the purchase with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param purchase_id the primary key of the purchase
    * @return the purchase, or <code>null</code> if a purchase with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.Purchase fetchByPrimaryKey(long purchase_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the purchases.
    *
    * @return the purchases
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ru.hmel.model.Purchase> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.hmel.model.Purchase> findAll(int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.hmel.model.Purchase> findAll(int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the purchases from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of purchases.
    *
    * @return the number of purchases
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
