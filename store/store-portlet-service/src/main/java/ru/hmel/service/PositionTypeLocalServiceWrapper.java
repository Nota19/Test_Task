package ru.hmel.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PositionTypeLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PositionTypeLocalService
 * @generated
 */
public class PositionTypeLocalServiceWrapper implements PositionTypeLocalService,
    ServiceWrapper<PositionTypeLocalService> {
    private PositionTypeLocalService _positionTypeLocalService;

    public PositionTypeLocalServiceWrapper(
        PositionTypeLocalService positionTypeLocalService) {
        _positionTypeLocalService = positionTypeLocalService;
    }

    /**
    * Adds the position type to the database. Also notifies the appropriate model listeners.
    *
    * @param positionType the position type
    * @return the position type that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.hmel.model.PositionType addPositionType(
        ru.hmel.model.PositionType positionType)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _positionTypeLocalService.addPositionType(positionType);
    }

    /**
    * Creates a new position type with the primary key. Does not add the position type to the database.
    *
    * @param position_id the primary key for the new position type
    * @return the new position type
    */
    @Override
    public ru.hmel.model.PositionType createPositionType(long position_id) {
        return _positionTypeLocalService.createPositionType(position_id);
    }

    /**
    * Deletes the position type with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param position_id the primary key of the position type
    * @return the position type that was removed
    * @throws PortalException if a position type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.hmel.model.PositionType deletePositionType(long position_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _positionTypeLocalService.deletePositionType(position_id);
    }

    /**
    * Deletes the position type from the database. Also notifies the appropriate model listeners.
    *
    * @param positionType the position type
    * @return the position type that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.hmel.model.PositionType deletePositionType(
        ru.hmel.model.PositionType positionType)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _positionTypeLocalService.deletePositionType(positionType);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _positionTypeLocalService.dynamicQuery();
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
        return _positionTypeLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.PositionTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _positionTypeLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.PositionTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _positionTypeLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _positionTypeLocalService.dynamicQueryCount(dynamicQuery);
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
        return _positionTypeLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public ru.hmel.model.PositionType fetchPositionType(long position_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _positionTypeLocalService.fetchPositionType(position_id);
    }

    /**
    * Returns the position type with the primary key.
    *
    * @param position_id the primary key of the position type
    * @return the position type
    * @throws PortalException if a position type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.hmel.model.PositionType getPositionType(long position_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _positionTypeLocalService.getPositionType(position_id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _positionTypeLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the position types.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.PositionTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of position types
    * @param end the upper bound of the range of position types (not inclusive)
    * @return the range of position types
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<ru.hmel.model.PositionType> getPositionTypes(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _positionTypeLocalService.getPositionTypes(start, end);
    }

    /**
    * Returns the number of position types.
    *
    * @return the number of position types
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getPositionTypesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _positionTypeLocalService.getPositionTypesCount();
    }

    /**
    * Updates the position type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param positionType the position type
    * @return the position type that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.hmel.model.PositionType updatePositionType(
        ru.hmel.model.PositionType positionType)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _positionTypeLocalService.updatePositionType(positionType);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _positionTypeLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _positionTypeLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _positionTypeLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PositionTypeLocalService getWrappedPositionTypeLocalService() {
        return _positionTypeLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPositionTypeLocalService(
        PositionTypeLocalService positionTypeLocalService) {
        _positionTypeLocalService = positionTypeLocalService;
    }

    @Override
    public PositionTypeLocalService getWrappedService() {
        return _positionTypeLocalService;
    }

    @Override
    public void setWrappedService(
        PositionTypeLocalService positionTypeLocalService) {
        _positionTypeLocalService = positionTypeLocalService;
    }
}
