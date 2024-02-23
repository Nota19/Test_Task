package ru.hmel.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ElectronicsService}.
 *
 * @author Hmel Max
 * @see ElectronicsService
 * @generated
 */
public class ElectronicsServiceWrapper implements ElectronicsService,
    ServiceWrapper<ElectronicsService> {
    private ElectronicsService _electronicsService;

    public ElectronicsServiceWrapper(ElectronicsService electronicsService) {
        _electronicsService = electronicsService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _electronicsService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _electronicsService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _electronicsService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public ElectronicsService getWrappedElectronicsService() {
        return _electronicsService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedElectronicsService(
        ElectronicsService electronicsService) {
        _electronicsService = electronicsService;
    }

    @Override
    public ElectronicsService getWrappedService() {
        return _electronicsService;
    }

    @Override
    public void setWrappedService(ElectronicsService electronicsService) {
        _electronicsService = electronicsService;
    }
}
