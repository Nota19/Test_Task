package ru.hmel.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ElectroTypeLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ElectroTypeLocalService
 * @generated
 */
public class ElectroTypeLocalServiceWrapper implements ElectroTypeLocalService,
    ServiceWrapper<ElectroTypeLocalService> {
    private ElectroTypeLocalService _electroTypeLocalService;

    public ElectroTypeLocalServiceWrapper(
        ElectroTypeLocalService electroTypeLocalService) {
        _electroTypeLocalService = electroTypeLocalService;
    }

    /**
    * Adds the electro type to the database. Also notifies the appropriate model listeners.
    *
    * @param electroType the electro type
    * @return the electro type that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.hmel.model.ElectroType addElectroType(
        ru.hmel.model.ElectroType electroType)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _electroTypeLocalService.addElectroType(electroType);
    }

    /**
    * Creates a new electro type with the primary key. Does not add the electro type to the database.
    *
    * @param electro_type_id the primary key for the new electro type
    * @return the new electro type
    */
    @Override
    public ru.hmel.model.ElectroType createElectroType(long electro_type_id) {
        return _electroTypeLocalService.createElectroType(electro_type_id);
    }

    /**
    * Deletes the electro type with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param electro_type_id the primary key of the electro type
    * @return the electro type that was removed
    * @throws PortalException if a electro type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.hmel.model.ElectroType deleteElectroType(long electro_type_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _electroTypeLocalService.deleteElectroType(electro_type_id);
    }

    /**
    * Deletes the electro type from the database. Also notifies the appropriate model listeners.
    *
    * @param electroType the electro type
    * @return the electro type that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.hmel.model.ElectroType deleteElectroType(
        ru.hmel.model.ElectroType electroType)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _electroTypeLocalService.deleteElectroType(electroType);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _electroTypeLocalService.dynamicQuery();
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
        return _electroTypeLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.ElectroTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _electroTypeLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.ElectroTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _electroTypeLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _electroTypeLocalService.dynamicQueryCount(dynamicQuery);
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
        return _electroTypeLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public ru.hmel.model.ElectroType fetchElectroType(long electro_type_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _electroTypeLocalService.fetchElectroType(electro_type_id);
    }

    /**
    * Returns the electro type with the primary key.
    *
    * @param electro_type_id the primary key of the electro type
    * @return the electro type
    * @throws PortalException if a electro type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.hmel.model.ElectroType getElectroType(long electro_type_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _electroTypeLocalService.getElectroType(electro_type_id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _electroTypeLocalService.getPersistedModel(primaryKeyObj);
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
    @Override
    public java.util.List<ru.hmel.model.ElectroType> getElectroTypes(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _electroTypeLocalService.getElectroTypes(start, end);
    }

    /**
    * Returns the number of electro types.
    *
    * @return the number of electro types
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getElectroTypesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _electroTypeLocalService.getElectroTypesCount();
    }

    /**
    * Updates the electro type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param electroType the electro type
    * @return the electro type that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.hmel.model.ElectroType updateElectroType(
        ru.hmel.model.ElectroType electroType)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _electroTypeLocalService.updateElectroType(electroType);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _electroTypeLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _electroTypeLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _electroTypeLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public ElectroTypeLocalService getWrappedElectroTypeLocalService() {
        return _electroTypeLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedElectroTypeLocalService(
        ElectroTypeLocalService electroTypeLocalService) {
        _electroTypeLocalService = electroTypeLocalService;
    }

    @Override
    public ElectroTypeLocalService getWrappedService() {
        return _electroTypeLocalService;
    }

    @Override
    public void setWrappedService(
        ElectroTypeLocalService electroTypeLocalService) {
        _electroTypeLocalService = electroTypeLocalService;
    }
}
