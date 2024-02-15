package ru.hmel.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PurchaseService}.
 *
 * @author Brian Wing Shun Chan
 * @see PurchaseService
 * @generated
 */
public class PurchaseServiceWrapper implements PurchaseService,
    ServiceWrapper<PurchaseService> {
    private PurchaseService _purchaseService;

    public PurchaseServiceWrapper(PurchaseService purchaseService) {
        _purchaseService = purchaseService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _purchaseService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _purchaseService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _purchaseService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PurchaseService getWrappedPurchaseService() {
        return _purchaseService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPurchaseService(PurchaseService purchaseService) {
        _purchaseService = purchaseService;
    }

    @Override
    public PurchaseService getWrappedService() {
        return _purchaseService;
    }

    @Override
    public void setWrappedService(PurchaseService purchaseService) {
        _purchaseService = purchaseService;
    }
}
