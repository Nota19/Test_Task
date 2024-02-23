package ru.hmel.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PositionTypeService}.
 *
 * @author Hmel Max
 * @see PositionTypeService
 * @generated
 */
public class PositionTypeServiceWrapper implements PositionTypeService,
    ServiceWrapper<PositionTypeService> {
    private PositionTypeService _positionTypeService;

    public PositionTypeServiceWrapper(PositionTypeService positionTypeService) {
        _positionTypeService = positionTypeService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _positionTypeService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _positionTypeService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _positionTypeService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PositionTypeService getWrappedPositionTypeService() {
        return _positionTypeService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPositionTypeService(
        PositionTypeService positionTypeService) {
        _positionTypeService = positionTypeService;
    }

    @Override
    public PositionTypeService getWrappedService() {
        return _positionTypeService;
    }

    @Override
    public void setWrappedService(PositionTypeService positionTypeService) {
        _positionTypeService = positionTypeService;
    }
}
