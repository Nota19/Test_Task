package ru.hmel.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Electronics}.
 * </p>
 *
 * @author Hmel Max
 * @see Electronics
 * @generated
 */
public class ElectronicsWrapper implements Electronics,
    ModelWrapper<Electronics> {
    private Electronics _electronics;

    public ElectronicsWrapper(Electronics electronics) {
        _electronics = electronics;
    }

    @Override
    public Class<?> getModelClass() {
        return Electronics.class;
    }

    @Override
    public String getModelClassName() {
        return Electronics.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("electronics_id", getElectronics_id());
        attributes.put("name", getName());
        attributes.put("etype", getEtype());
        attributes.put("price", getPrice());
        attributes.put("count", getCount());
        attributes.put("inStock", getInStock());
        attributes.put("archive", getArchive());
        attributes.put("description", getDescription());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long electronics_id = (Long) attributes.get("electronics_id");

        if (electronics_id != null) {
            setElectronics_id(electronics_id);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        Long etype = (Long) attributes.get("etype");

        if (etype != null) {
            setEtype(etype);
        }

        Long price = (Long) attributes.get("price");

        if (price != null) {
            setPrice(price);
        }

        Long count = (Long) attributes.get("count");

        if (count != null) {
            setCount(count);
        }

        Boolean inStock = (Boolean) attributes.get("inStock");

        if (inStock != null) {
            setInStock(inStock);
        }

        Boolean archive = (Boolean) attributes.get("archive");

        if (archive != null) {
            setArchive(archive);
        }

        String description = (String) attributes.get("description");

        if (description != null) {
            setDescription(description);
        }
    }

    /**
    * Returns the primary key of this electronics.
    *
    * @return the primary key of this electronics
    */
    @Override
    public long getPrimaryKey() {
        return _electronics.getPrimaryKey();
    }

    /**
    * Sets the primary key of this electronics.
    *
    * @param primaryKey the primary key of this electronics
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _electronics.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the electronics_id of this electronics.
    *
    * @return the electronics_id of this electronics
    */
    @Override
    public long getElectronics_id() {
        return _electronics.getElectronics_id();
    }

    /**
    * Sets the electronics_id of this electronics.
    *
    * @param electronics_id the electronics_id of this electronics
    */
    @Override
    public void setElectronics_id(long electronics_id) {
        _electronics.setElectronics_id(electronics_id);
    }

    /**
    * Returns the name of this electronics.
    *
    * @return the name of this electronics
    */
    @Override
    public java.lang.String getName() {
        return _electronics.getName();
    }

    /**
    * Sets the name of this electronics.
    *
    * @param name the name of this electronics
    */
    @Override
    public void setName(java.lang.String name) {
        _electronics.setName(name);
    }

    /**
    * Returns the etype of this electronics.
    *
    * @return the etype of this electronics
    */
    @Override
    public long getEtype() {
        return _electronics.getEtype();
    }

    /**
    * Sets the etype of this electronics.
    *
    * @param etype the etype of this electronics
    */
    @Override
    public void setEtype(long etype) {
        _electronics.setEtype(etype);
    }

    /**
    * Returns the price of this electronics.
    *
    * @return the price of this electronics
    */
    @Override
    public long getPrice() {
        return _electronics.getPrice();
    }

    /**
    * Sets the price of this electronics.
    *
    * @param price the price of this electronics
    */
    @Override
    public void setPrice(long price) {
        _electronics.setPrice(price);
    }

    /**
    * Returns the count of this electronics.
    *
    * @return the count of this electronics
    */
    @Override
    public long getCount() {
        return _electronics.getCount();
    }

    /**
    * Sets the count of this electronics.
    *
    * @param count the count of this electronics
    */
    @Override
    public void setCount(long count) {
        _electronics.setCount(count);
    }

    /**
    * Returns the in stock of this electronics.
    *
    * @return the in stock of this electronics
    */
    @Override
    public boolean getInStock() {
        return _electronics.getInStock();
    }

    /**
    * Returns <code>true</code> if this electronics is in stock.
    *
    * @return <code>true</code> if this electronics is in stock; <code>false</code> otherwise
    */
    @Override
    public boolean isInStock() {
        return _electronics.isInStock();
    }

    /**
    * Sets whether this electronics is in stock.
    *
    * @param inStock the in stock of this electronics
    */
    @Override
    public void setInStock(boolean inStock) {
        _electronics.setInStock(inStock);
    }

    /**
    * Returns the archive of this electronics.
    *
    * @return the archive of this electronics
    */
    @Override
    public boolean getArchive() {
        return _electronics.getArchive();
    }

    /**
    * Returns <code>true</code> if this electronics is archive.
    *
    * @return <code>true</code> if this electronics is archive; <code>false</code> otherwise
    */
    @Override
    public boolean isArchive() {
        return _electronics.isArchive();
    }

    /**
    * Sets whether this electronics is archive.
    *
    * @param archive the archive of this electronics
    */
    @Override
    public void setArchive(boolean archive) {
        _electronics.setArchive(archive);
    }

    /**
    * Returns the description of this electronics.
    *
    * @return the description of this electronics
    */
    @Override
    public java.lang.String getDescription() {
        return _electronics.getDescription();
    }

    /**
    * Sets the description of this electronics.
    *
    * @param description the description of this electronics
    */
    @Override
    public void setDescription(java.lang.String description) {
        _electronics.setDescription(description);
    }

    @Override
    public boolean isNew() {
        return _electronics.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _electronics.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _electronics.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _electronics.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _electronics.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _electronics.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _electronics.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _electronics.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _electronics.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _electronics.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _electronics.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new ElectronicsWrapper((Electronics) _electronics.clone());
    }

    @Override
    public int compareTo(ru.hmel.model.Electronics electronics) {
        return _electronics.compareTo(electronics);
    }

    @Override
    public int hashCode() {
        return _electronics.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<ru.hmel.model.Electronics> toCacheModel() {
        return _electronics.toCacheModel();
    }

    @Override
    public ru.hmel.model.Electronics toEscapedModel() {
        return new ElectronicsWrapper(_electronics.toEscapedModel());
    }

    @Override
    public ru.hmel.model.Electronics toUnescapedModel() {
        return new ElectronicsWrapper(_electronics.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _electronics.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _electronics.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _electronics.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof ElectronicsWrapper)) {
            return false;
        }

        ElectronicsWrapper electronicsWrapper = (ElectronicsWrapper) obj;

        if (Validator.equals(_electronics, electronicsWrapper._electronics)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Electronics getWrappedElectronics() {
        return _electronics;
    }

    @Override
    public Electronics getWrappedModel() {
        return _electronics;
    }

    @Override
    public void resetOriginalValues() {
        _electronics.resetOriginalValues();
    }
}
