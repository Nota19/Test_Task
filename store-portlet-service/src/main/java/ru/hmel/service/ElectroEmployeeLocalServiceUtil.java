package ru.hmel.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for ElectroEmployee. This utility wraps
 * {@link ru.hmel.service.impl.ElectroEmployeeLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Hmel Max
 * @see ElectroEmployeeLocalService
 * @see ru.hmel.service.base.ElectroEmployeeLocalServiceBaseImpl
 * @see ru.hmel.service.impl.ElectroEmployeeLocalServiceImpl
 * @generated
 */
public class ElectroEmployeeLocalServiceUtil {
    private static ElectroEmployeeLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link ru.hmel.service.impl.ElectroEmployeeLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the electro employee to the database. Also notifies the appropriate model listeners.
    *
    * @param electroEmployee the electro employee
    * @return the electro employee that was added
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.ElectroEmployee addElectroEmployee(
        ru.hmel.model.ElectroEmployee electroEmployee)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addElectroEmployee(electroEmployee);
    }

    /**
    * Creates a new electro employee with the primary key. Does not add the electro employee to the database.
    *
    * @param electroEmployeePK the primary key for the new electro employee
    * @return the new electro employee
    */
    public static ru.hmel.model.ElectroEmployee createElectroEmployee(
        ru.hmel.service.persistence.ElectroEmployeePK electroEmployeePK) {
        return getService().createElectroEmployee(electroEmployeePK);
    }

    /**
    * Deletes the electro employee with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param electroEmployeePK the primary key of the electro employee
    * @return the electro employee that was removed
    * @throws PortalException if a electro employee with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.ElectroEmployee deleteElectroEmployee(
        ru.hmel.service.persistence.ElectroEmployeePK electroEmployeePK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteElectroEmployee(electroEmployeePK);
    }

    /**
    * Deletes the electro employee from the database. Also notifies the appropriate model listeners.
    *
    * @param electroEmployee the electro employee
    * @return the electro employee that was removed
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.ElectroEmployee deleteElectroEmployee(
        ru.hmel.model.ElectroEmployee electroEmployee)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteElectroEmployee(electroEmployee);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.ElectroEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.ElectroEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static ru.hmel.model.ElectroEmployee fetchElectroEmployee(
        ru.hmel.service.persistence.ElectroEmployeePK electroEmployeePK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchElectroEmployee(electroEmployeePK);
    }

    /**
    * Returns the electro employee with the primary key.
    *
    * @param electroEmployeePK the primary key of the electro employee
    * @return the electro employee
    * @throws PortalException if a electro employee with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.ElectroEmployee getElectroEmployee(
        ru.hmel.service.persistence.ElectroEmployeePK electroEmployeePK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getElectroEmployee(electroEmployeePK);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the electro employees.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.ElectroEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of electro employees
    * @param end the upper bound of the range of electro employees (not inclusive)
    * @return the range of electro employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.hmel.model.ElectroEmployee> getElectroEmployees(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getElectroEmployees(start, end);
    }

    /**
    * Returns the number of electro employees.
    *
    * @return the number of electro employees
    * @throws SystemException if a system exception occurred
    */
    public static int getElectroEmployeesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getElectroEmployeesCount();
    }

    /**
    * Updates the electro employee in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param electroEmployee the electro employee
    * @return the electro employee that was updated
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.ElectroEmployee updateElectroEmployee(
        ru.hmel.model.ElectroEmployee electroEmployee)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateElectroEmployee(electroEmployee);
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

    public static ElectroEmployeeLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    ElectroEmployeeLocalService.class.getName());

            if (invokableLocalService instanceof ElectroEmployeeLocalService) {
                _service = (ElectroEmployeeLocalService) invokableLocalService;
            } else {
                _service = new ElectroEmployeeLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(ElectroEmployeeLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(ElectroEmployeeLocalService service) {
    }
}
