package ru.hmel.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ElectroTypeService}.
 *
 * @author Brian Wing Shun Chan
 * @see ElectroTypeService
 * @generated
 */
public class ElectroTypeServiceWrapper implements ElectroTypeService,
    ServiceWrapper<ElectroTypeService> {
    private ElectroTypeService _electroTypeService;

    public ElectroTypeServiceWrapper(ElectroTypeService electroTypeService) {
        _electroTypeService = electroTypeService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _electroTypeService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _electroTypeService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _electroTypeService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public ElectroTypeService getWrappedElectroTypeService() {
        return _electroTypeService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedElectroTypeService(
        ElectroTypeService electroTypeService) {
        _electroTypeService = electroTypeService;
    }

    @Override
    public ElectroTypeService getWrappedService() {
        return _electroTypeService;
    }

    @Override
    public void setWrappedService(ElectroTypeService electroTypeService) {
        _electroTypeService = electroTypeService;
    }
}
