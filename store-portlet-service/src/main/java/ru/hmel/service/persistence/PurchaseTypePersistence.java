package ru.hmel.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import ru.hmel.model.PurchaseType;

/**
 * The persistence interface for the purchase type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PurchaseTypePersistenceImpl
 * @see PurchaseTypeUtil
 * @generated
 */
public interface PurchaseTypePersistence extends BasePersistence<PurchaseType> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link PurchaseTypeUtil} to access the purchase type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the purchase types where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching purchase types
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ru.hmel.model.PurchaseType> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.hmel.model.PurchaseType> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.hmel.model.PurchaseType> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first purchase type in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching purchase type
    * @throws ru.hmel.NoSuchPurchaseTypeException if a matching purchase type could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.PurchaseType findByUuid_First(java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPurchaseTypeException;

    /**
    * Returns the first purchase type in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching purchase type, or <code>null</code> if a matching purchase type could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.PurchaseType fetchByUuid_First(java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last purchase type in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching purchase type
    * @throws ru.hmel.NoSuchPurchaseTypeException if a matching purchase type could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.PurchaseType findByUuid_Last(java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPurchaseTypeException;

    /**
    * Returns the last purchase type in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching purchase type, or <code>null</code> if a matching purchase type could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.PurchaseType fetchByUuid_Last(java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public ru.hmel.model.PurchaseType[] findByUuid_PrevAndNext(
        long purchase_type_id, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPurchaseTypeException;

    /**
    * Removes all the purchase types where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of purchase types where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching purchase types
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the purchase type in the entity cache if it is enabled.
    *
    * @param purchaseType the purchase type
    */
    public void cacheResult(ru.hmel.model.PurchaseType purchaseType);

    /**
    * Caches the purchase types in the entity cache if it is enabled.
    *
    * @param purchaseTypes the purchase types
    */
    public void cacheResult(
        java.util.List<ru.hmel.model.PurchaseType> purchaseTypes);

    /**
    * Creates a new purchase type with the primary key. Does not add the purchase type to the database.
    *
    * @param purchase_type_id the primary key for the new purchase type
    * @return the new purchase type
    */
    public ru.hmel.model.PurchaseType create(long purchase_type_id);

    /**
    * Removes the purchase type with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param purchase_type_id the primary key of the purchase type
    * @return the purchase type that was removed
    * @throws ru.hmel.NoSuchPurchaseTypeException if a purchase type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.PurchaseType remove(long purchase_type_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPurchaseTypeException;

    public ru.hmel.model.PurchaseType updateImpl(
        ru.hmel.model.PurchaseType purchaseType)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the purchase type with the primary key or throws a {@link ru.hmel.NoSuchPurchaseTypeException} if it could not be found.
    *
    * @param purchase_type_id the primary key of the purchase type
    * @return the purchase type
    * @throws ru.hmel.NoSuchPurchaseTypeException if a purchase type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.PurchaseType findByPrimaryKey(long purchase_type_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchPurchaseTypeException;

    /**
    * Returns the purchase type with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param purchase_type_id the primary key of the purchase type
    * @return the purchase type, or <code>null</code> if a purchase type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.PurchaseType fetchByPrimaryKey(long purchase_type_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the purchase types.
    *
    * @return the purchase types
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ru.hmel.model.PurchaseType> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.hmel.model.PurchaseType> findAll(int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.hmel.model.PurchaseType> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the purchase types from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of purchase types.
    *
    * @return the number of purchase types
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
