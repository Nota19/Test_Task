package ru.hmel.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ElectronicsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ElectronicsLocalService
 * @generated
 */
public class ElectronicsLocalServiceWrapper implements ElectronicsLocalService,
    ServiceWrapper<ElectronicsLocalService> {
    private ElectronicsLocalService _electronicsLocalService;

    public ElectronicsLocalServiceWrapper(
        ElectronicsLocalService electronicsLocalService) {
        _electronicsLocalService = electronicsLocalService;
    }

    /**
    * Adds the electronics to the database. Also notifies the appropriate model listeners.
    *
    * @param electronics the electronics
    * @return the electronics that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.hmel.model.Electronics addElectronics(
        ru.hmel.model.Electronics electronics)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _electronicsLocalService.addElectronics(electronics);
    }

    /**
    * Creates a new electronics with the primary key. Does not add the electronics to the database.
    *
    * @param electronics_id the primary key for the new electronics
    * @return the new electronics
    */
    @Override
    public ru.hmel.model.Electronics createElectronics(long electronics_id) {
        return _electronicsLocalService.createElectronics(electronics_id);
    }

    /**
    * Deletes the electronics with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param electronics_id the primary key of the electronics
    * @return the electronics that was removed
    * @throws PortalException if a electronics with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.hmel.model.Electronics deleteElectronics(long electronics_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _electronicsLocalService.deleteElectronics(electronics_id);
    }

    /**
    * Deletes the electronics from the database. Also notifies the appropriate model listeners.
    *
    * @param electronics the electronics
    * @return the electronics that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.hmel.model.Electronics deleteElectronics(
        ru.hmel.model.Electronics electronics)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _electronicsLocalService.deleteElectronics(electronics);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _electronicsLocalService.dynamicQuery();
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
        return _electronicsLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.ElectronicsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _electronicsLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.ElectronicsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _electronicsLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
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
        return _electronicsLocalService.dynamicQueryCount(dynamicQuery);
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
        return _electronicsLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public ru.hmel.model.Electronics fetchElectronics(long electronics_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _electronicsLocalService.fetchElectronics(electronics_id);
    }

    /**
    * Returns the electronics with the primary key.
    *
    * @param electronics_id the primary key of the electronics
    * @return the electronics
    * @throws PortalException if a electronics with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.hmel.model.Electronics getElectronics(long electronics_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _electronicsLocalService.getElectronics(electronics_id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _electronicsLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the electronicses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.ElectronicsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of electronicses
    * @param end the upper bound of the range of electronicses (not inclusive)
    * @return the range of electronicses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<ru.hmel.model.Electronics> getElectronicses(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _electronicsLocalService.getElectronicses(start, end);
    }

    /**
    * Returns the number of electronicses.
    *
    * @return the number of electronicses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getElectronicsesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _electronicsLocalService.getElectronicsesCount();
    }

    /**
    * Updates the electronics in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param electronics the electronics
    * @return the electronics that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.hmel.model.Electronics updateElectronics(
        ru.hmel.model.Electronics electronics)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _electronicsLocalService.updateElectronics(electronics);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _electronicsLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _electronicsLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _electronicsLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public ElectronicsLocalService getWrappedElectronicsLocalService() {
        return _electronicsLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedElectronicsLocalService(
        ElectronicsLocalService electronicsLocalService) {
        _electronicsLocalService = electronicsLocalService;
    }

    @Override
    public ElectronicsLocalService getWrappedService() {
        return _electronicsLocalService;
    }

    @Override
    public void setWrappedService(
        ElectronicsLocalService electronicsLocalService) {
        _electronicsLocalService = electronicsLocalService;
    }
}
