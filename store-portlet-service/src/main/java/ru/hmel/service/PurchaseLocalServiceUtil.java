package ru.hmel.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Purchase. This utility wraps
 * {@link ru.hmel.service.impl.PurchaseLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see PurchaseLocalService
 * @see ru.hmel.service.base.PurchaseLocalServiceBaseImpl
 * @see ru.hmel.service.impl.PurchaseLocalServiceImpl
 * @generated
 */
public class PurchaseLocalServiceUtil {
    private static PurchaseLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link ru.hmel.service.impl.PurchaseLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the purchase to the database. Also notifies the appropriate model listeners.
    *
    * @param purchase the purchase
    * @return the purchase that was added
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.Purchase addPurchase(
        ru.hmel.model.Purchase purchase)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addPurchase(purchase);
    }

    /**
    * Creates a new purchase with the primary key. Does not add the purchase to the database.
    *
    * @param purchase_id the primary key for the new purchase
    * @return the new purchase
    */
    public static ru.hmel.model.Purchase createPurchase(long purchase_id) {
        return getService().createPurchase(purchase_id);
    }

    /**
    * Deletes the purchase with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param purchase_id the primary key of the purchase
    * @return the purchase that was removed
    * @throws PortalException if a purchase with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.Purchase deletePurchase(long purchase_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deletePurchase(purchase_id);
    }

    /**
    * Deletes the purchase from the database. Also notifies the appropriate model listeners.
    *
    * @param purchase the purchase
    * @return the purchase that was removed
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.Purchase deletePurchase(
        ru.hmel.model.Purchase purchase)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deletePurchase(purchase);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.PurchaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.PurchaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static ru.hmel.model.Purchase fetchPurchase(long purchase_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchPurchase(purchase_id);
    }

    /**
    * Returns the purchase with the primary key.
    *
    * @param purchase_id the primary key of the purchase
    * @return the purchase
    * @throws PortalException if a purchase with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.Purchase getPurchase(long purchase_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPurchase(purchase_id);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<ru.hmel.model.Purchase> getPurchases(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getPurchases(start, end);
    }

    /**
    * Returns the number of purchases.
    *
    * @return the number of purchases
    * @throws SystemException if a system exception occurred
    */
    public static int getPurchasesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getPurchasesCount();
    }

    /**
    * Updates the purchase in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param purchase the purchase
    * @return the purchase that was updated
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.Purchase updatePurchase(
        ru.hmel.model.Purchase purchase)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updatePurchase(purchase);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static void clearService() {
        _service = null;
    }

    public static PurchaseLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    PurchaseLocalService.class.getName());

            if (invokableLocalService instanceof PurchaseLocalService) {
                _service = (PurchaseLocalService) invokableLocalService;
            } else {
                _service = new PurchaseLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(PurchaseLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(PurchaseLocalService service) {
    }
}
