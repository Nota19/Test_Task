package ru.hmel.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PurchaseTypeService}.
 *
 * @author Hmel Max
 * @see PurchaseTypeService
 * @generated
 */
public class PurchaseTypeServiceWrapper implements PurchaseTypeService,
    ServiceWrapper<PurchaseTypeService> {
    private PurchaseTypeService _purchaseTypeService;

    public PurchaseTypeServiceWrapper(PurchaseTypeService purchaseTypeService) {
        _purchaseTypeService = purchaseTypeService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _purchaseTypeService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _purchaseTypeService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _purchaseTypeService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PurchaseTypeService getWrappedPurchaseTypeService() {
        return _purchaseTypeService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPurchaseTypeService(
        PurchaseTypeService purchaseTypeService) {
        _purchaseTypeService = purchaseTypeService;
    }

    @Override
    public PurchaseTypeService getWrappedService() {
        return _purchaseTypeService;
    }

    @Override
    public void setWrappedService(PurchaseTypeService purchaseTypeService) {
        _purchaseTypeService = purchaseTypeService;
    }
}
