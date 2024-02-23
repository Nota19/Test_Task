package ru.hmel.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import ru.hmel.model.Purchase;

import ru.hmel.service.PurchaseLocalServiceUtil;

/**
 * The extended model base implementation for the Purchase service. Represents a row in the &quot;store_Purchase&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PurchaseImpl}.
 * </p>
 *
 * @author Hmel Max
 * @see PurchaseImpl
 * @see ru.hmel.model.Purchase
 * @generated
 */
public abstract class PurchaseBaseImpl extends PurchaseModelImpl
    implements Purchase {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a purchase model instance should use the {@link Purchase} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PurchaseLocalServiceUtil.addPurchase(this);
        } else {
            PurchaseLocalServiceUtil.updatePurchase(this);
        }
    }
}
