package ru.hmel.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ElectroEmployeeService}.
 *
 * @author Brian Wing Shun Chan
 * @see ElectroEmployeeService
 * @generated
 */
public class ElectroEmployeeServiceWrapper implements ElectroEmployeeService,
    ServiceWrapper<ElectroEmployeeService> {
    private ElectroEmployeeService _electroEmployeeService;

    public ElectroEmployeeServiceWrapper(
        ElectroEmployeeService electroEmployeeService) {
        _electroEmployeeService = electroEmployeeService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _electroEmployeeService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _electroEmployeeService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _electroEmployeeService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public ElectroEmployeeService getWrappedElectroEmployeeService() {
        return _electroEmployeeService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedElectroEmployeeService(
        ElectroEmployeeService electroEmployeeService) {
        _electroEmployeeService = electroEmployeeService;
    }

    @Override
    public ElectroEmployeeService getWrappedService() {
        return _electroEmployeeService;
    }

    @Override
    public void setWrappedService(ElectroEmployeeService electroEmployeeService) {
        _electroEmployeeService = electroEmployeeService;
    }
}
