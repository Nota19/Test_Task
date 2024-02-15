package ru.hmel.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Purchase}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Purchase
 * @generated
 */
public class PurchaseWrapper implements Purchase, ModelWrapper<Purchase> {
    private Purchase _purchase;

    public PurchaseWrapper(Purchase purchase) {
        _purchase = purchase;
    }

    @Override
    public Class<?> getModelClass() {
        return Purchase.class;
    }

    @Override
    public String getModelClassName() {
        return Purchase.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("purchase_id", getPurchase_id());
        attributes.put("electro_id", getElectro_id());
        attributes.put("employee_id", getEmployee_id());
        attributes.put("purchaseDate", getPurchaseDate());
        attributes.put("type", getType());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long purchase_id = (Long) attributes.get("purchase_id");

        if (purchase_id != null) {
            setPurchase_id(purchase_id);
        }

        Long electro_id = (Long) attributes.get("electro_id");

        if (electro_id != null) {
            setElectro_id(electro_id);
        }

        Long employee_id = (Long) attributes.get("employee_id");

        if (employee_id != null) {
            setEmployee_id(employee_id);
        }

        Date purchaseDate = (Date) attributes.get("purchaseDate");

        if (purchaseDate != null) {
            setPurchaseDate(purchaseDate);
        }

        Long type = (Long) attributes.get("type");

        if (type != null) {
            setType(type);
        }
    }

    /**
    * Returns the primary key of this purchase.
    *
    * @return the primary key of this purchase
    */
    @Override
    public long getPrimaryKey() {
        return _purchase.getPrimaryKey();
    }

    /**
    * Sets the primary key of this purchase.
    *
    * @param primaryKey the primary key of this purchase
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _purchase.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the uuid of this purchase.
    *
    * @return the uuid of this purchase
    */
    @Override
    public java.lang.String getUuid() {
        return _purchase.getUuid();
    }

    /**
    * Sets the uuid of this purchase.
    *
    * @param uuid the uuid of this purchase
    */
    @Override
    public void setUuid(java.lang.String uuid) {
        _purchase.setUuid(uuid);
    }

    /**
    * Returns the purchase_id of this purchase.
    *
    * @return the purchase_id of this purchase
    */
    @Override
    public long getPurchase_id() {
        return _purchase.getPurchase_id();
    }

    /**
    * Sets the purchase_id of this purchase.
    *
    * @param purchase_id the purchase_id of this purchase
    */
    @Override
    public void setPurchase_id(long purchase_id) {
        _purchase.setPurchase_id(purchase_id);
    }

    /**
    * Returns the electro_id of this purchase.
    *
    * @return the electro_id of this purchase
    */
    @Override
    public long getElectro_id() {
        return _purchase.getElectro_id();
    }

    /**
    * Sets the electro_id of this purchase.
    *
    * @param electro_id the electro_id of this purchase
    */
    @Override
    public void setElectro_id(long electro_id) {
        _purchase.setElectro_id(electro_id);
    }

    /**
    * Returns the employee_id of this purchase.
    *
    * @return the employee_id of this purchase
    */
    @Override
    public long getEmployee_id() {
        return _purchase.getEmployee_id();
    }

    /**
    * Sets the employee_id of this purchase.
    *
    * @param employee_id the employee_id of this purchase
    */
    @Override
    public void setEmployee_id(long employee_id) {
        _purchase.setEmployee_id(employee_id);
    }

    /**
    * Returns the purchase date of this purchase.
    *
    * @return the purchase date of this purchase
    */
    @Override
    public java.util.Date getPurchaseDate() {
        return _purchase.getPurchaseDate();
    }

    /**
    * Sets the purchase date of this purchase.
    *
    * @param purchaseDate the purchase date of this purchase
    */
    @Override
    public void setPurchaseDate(java.util.Date purchaseDate) {
        _purchase.setPurchaseDate(purchaseDate);
    }

    /**
    * Returns the type of this purchase.
    *
    * @return the type of this purchase
    */
    @Override
    public long getType() {
        return _purchase.getType();
    }

    /**
    * Sets the type of this purchase.
    *
    * @param type the type of this purchase
    */
    @Override
    public void setType(long type) {
        _purchase.setType(type);
    }

    @Override
    public boolean isNew() {
        return _purchase.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _purchase.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _purchase.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _purchase.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _purchase.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _purchase.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _purchase.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _purchase.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _purchase.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _purchase.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _purchase.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new PurchaseWrapper((Purchase) _purchase.clone());
    }

    @Override
    public int compareTo(ru.hmel.model.Purchase purchase) {
        return _purchase.compareTo(purchase);
    }

    @Override
    public int hashCode() {
        return _purchase.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<ru.hmel.model.Purchase> toCacheModel() {
        return _purchase.toCacheModel();
    }

    @Override
    public ru.hmel.model.Purchase toEscapedModel() {
        return new PurchaseWrapper(_purchase.toEscapedModel());
    }

    @Override
    public ru.hmel.model.Purchase toUnescapedModel() {
        return new PurchaseWrapper(_purchase.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _purchase.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _purchase.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _purchase.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PurchaseWrapper)) {
            return false;
        }

        PurchaseWrapper purchaseWrapper = (PurchaseWrapper) obj;

        if (Validator.equals(_purchase, purchaseWrapper._purchase)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Purchase getWrappedPurchase() {
        return _purchase;
    }

    @Override
    public Purchase getWrappedModel() {
        return _purchase;
    }

    @Override
    public void resetOriginalValues() {
        _purchase.resetOriginalValues();
    }
}
