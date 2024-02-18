package ru.hmel.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ElectroEmployeeLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ElectroEmployeeLocalService
 * @generated
 */
public class ElectroEmployeeLocalServiceWrapper
    implements ElectroEmployeeLocalService,
        ServiceWrapper<ElectroEmployeeLocalService> {
    private ElectroEmployeeLocalService _electroEmployeeLocalService;

    public ElectroEmployeeLocalServiceWrapper(
        ElectroEmployeeLocalService electroEmployeeLocalService) {
        _electroEmployeeLocalService = electroEmployeeLocalService;
    }

    /**
    * Adds the electro employee to the database. Also notifies the appropriate model listeners.
    *
    * @param electroEmployee the electro employee
    * @return the electro employee that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.hmel.model.ElectroEmployee addElectroEmployee(
        ru.hmel.model.ElectroEmployee electroEmployee)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _electroEmployeeLocalService.addElectroEmployee(electroEmployee);
    }

    /**
    * Creates a new electro employee with the primary key. Does not add the electro employee to the database.
    *
    * @param electro_employee_id the primary key for the new electro employee
    * @return the new electro employee
    */
    @Override
    public ru.hmel.model.ElectroEmployee createElectroEmployee(
        long electro_employee_id) {
        return _electroEmployeeLocalService.createElectroEmployee(electro_employee_id);
    }

    /**
    * Deletes the electro employee with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param electro_employee_id the primary key of the electro employee
    * @return the electro employee that was removed
    * @throws PortalException if a electro employee with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.hmel.model.ElectroEmployee deleteElectroEmployee(
        long electro_employee_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _electroEmployeeLocalService.deleteElectroEmployee(electro_employee_id);
    }

    /**
    * Deletes the electro employee from the database. Also notifies the appropriate model listeners.
    *
    * @param electroEmployee the electro employee
    * @return the electro employee that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.hmel.model.ElectroEmployee deleteElectroEmployee(
        ru.hmel.model.ElectroEmployee electroEmployee)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _electroEmployeeLocalService.deleteElectroEmployee(electroEmployee);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _electroEmployeeLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _electroEmployeeLocalService.dynamicQuery(dynamicQuery);
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
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _electroEmployeeLocalService.dynamicQuery(dynamicQuery, start,
            end);
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
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _electroEmployeeLocalService.dynamicQuery(dynamicQuery, start,
            end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _electroEmployeeLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _electroEmployeeLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public ru.hmel.model.ElectroEmployee fetchElectroEmployee(
        long electro_employee_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _electroEmployeeLocalService.fetchElectroEmployee(electro_employee_id);
    }

    /**
    * Returns the electro employee with the primary key.
    *
    * @param electro_employee_id the primary key of the electro employee
    * @return the electro employee
    * @throws PortalException if a electro employee with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.hmel.model.ElectroEmployee getElectroEmployee(
        long electro_employee_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _electroEmployeeLocalService.getElectroEmployee(electro_employee_id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _electroEmployeeLocalService.getPersistedModel(primaryKeyObj);
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
    @Override
    public java.util.List<ru.hmel.model.ElectroEmployee> getElectroEmployees(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _electroEmployeeLocalService.getElectroEmployees(start, end);
    }

    /**
    * Returns the number of electro employees.
    *
    * @return the number of electro employees
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getElectroEmployeesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _electroEmployeeLocalService.getElectroEmployeesCount();
    }

    /**
    * Updates the electro employee in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param electroEmployee the electro employee
    * @return the electro employee that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.hmel.model.ElectroEmployee updateElectroEmployee(
        ru.hmel.model.ElectroEmployee electroEmployee)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _electroEmployeeLocalService.updateElectroEmployee(electroEmployee);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _electroEmployeeLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _electroEmployeeLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _electroEmployeeLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public ElectroEmployeeLocalService getWrappedElectroEmployeeLocalService() {
        return _electroEmployeeLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedElectroEmployeeLocalService(
        ElectroEmployeeLocalService electroEmployeeLocalService) {
        _electroEmployeeLocalService = electroEmployeeLocalService;
    }

    @Override
    public ElectroEmployeeLocalService getWrappedService() {
        return _electroEmployeeLocalService;
    }

    @Override
    public void setWrappedService(
        ElectroEmployeeLocalService electroEmployeeLocalService) {
        _electroEmployeeLocalService = electroEmployeeLocalService;
    }
}
