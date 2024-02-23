package ru.hmel.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PurchaseType}.
 * </p>
 *
 * @author Hmel Max
 * @see PurchaseType
 * @generated
 */
public class PurchaseTypeWrapper implements PurchaseType,
    ModelWrapper<PurchaseType> {
    private PurchaseType _purchaseType;

    public PurchaseTypeWrapper(PurchaseType purchaseType) {
        _purchaseType = purchaseType;
    }

    @Override
    public Class<?> getModelClass() {
        return PurchaseType.class;
    }

    @Override
    public String getModelClassName() {
        return PurchaseType.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("purchase_type_id", getPurchase_type_id());
        attributes.put("name", getName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long purchase_type_id = (Long) attributes.get("purchase_type_id");

        if (purchase_type_id != null) {
            setPurchase_type_id(purchase_type_id);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }
    }

    /**
    * Returns the primary key of this purchase type.
    *
    * @return the primary key of this purchase type
    */
    @Override
    public long getPrimaryKey() {
        return _purchaseType.getPrimaryKey();
    }

    /**
    * Sets the primary key of this purchase type.
    *
    * @param primaryKey the primary key of this purchase type
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _purchaseType.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the purchase_type_id of this purchase type.
    *
    * @return the purchase_type_id of this purchase type
    */
    @Override
    public long getPurchase_type_id() {
        return _purchaseType.getPurchase_type_id();
    }

    /**
    * Sets the purchase_type_id of this purchase type.
    *
    * @param purchase_type_id the purchase_type_id of this purchase type
    */
    @Override
    public void setPurchase_type_id(long purchase_type_id) {
        _purchaseType.setPurchase_type_id(purchase_type_id);
    }

    /**
    * Returns the name of this purchase type.
    *
    * @return the name of this purchase type
    */
    @Override
    public java.lang.String getName() {
        return _purchaseType.getName();
    }

    /**
    * Sets the name of this purchase type.
    *
    * @param name the name of this purchase type
    */
    @Override
    public void setName(java.lang.String name) {
        _purchaseType.setName(name);
    }

    @Override
    public boolean isNew() {
        return _purchaseType.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _purchaseType.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _purchaseType.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _purchaseType.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _purchaseType.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _purchaseType.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _purchaseType.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _purchaseType.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _purchaseType.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _purchaseType.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _purchaseType.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new PurchaseTypeWrapper((PurchaseType) _purchaseType.clone());
    }

    @Override
    public int compareTo(ru.hmel.model.PurchaseType purchaseType) {
        return _purchaseType.compareTo(purchaseType);
    }

    @Override
    public int hashCode() {
        return _purchaseType.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<ru.hmel.model.PurchaseType> toCacheModel() {
        return _purchaseType.toCacheModel();
    }

    @Override
    public ru.hmel.model.PurchaseType toEscapedModel() {
        return new PurchaseTypeWrapper(_purchaseType.toEscapedModel());
    }

    @Override
    public ru.hmel.model.PurchaseType toUnescapedModel() {
        return new PurchaseTypeWrapper(_purchaseType.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _purchaseType.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _purchaseType.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _purchaseType.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PurchaseTypeWrapper)) {
            return false;
        }

        PurchaseTypeWrapper purchaseTypeWrapper = (PurchaseTypeWrapper) obj;

        if (Validator.equals(_purchaseType, purchaseTypeWrapper._purchaseType)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public PurchaseType getWrappedPurchaseType() {
        return _purchaseType;
    }

    @Override
    public PurchaseType getWrappedModel() {
        return _purchaseType;
    }

    @Override
    public void resetOriginalValues() {
        _purchaseType.resetOriginalValues();
    }
}
