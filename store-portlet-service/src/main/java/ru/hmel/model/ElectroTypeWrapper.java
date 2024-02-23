package ru.hmel.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ElectroType}.
 * </p>
 *
 * @author Hmel Max
 * @see ElectroType
 * @generated
 */
public class ElectroTypeWrapper implements ElectroType,
    ModelWrapper<ElectroType> {
    private ElectroType _electroType;

    public ElectroTypeWrapper(ElectroType electroType) {
        _electroType = electroType;
    }

    @Override
    public Class<?> getModelClass() {
        return ElectroType.class;
    }

    @Override
    public String getModelClassName() {
        return ElectroType.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("electro_type_id", getElectro_type_id());
        attributes.put("name", getName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long electro_type_id = (Long) attributes.get("electro_type_id");

        if (electro_type_id != null) {
            setElectro_type_id(electro_type_id);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }
    }

    /**
    * Returns the primary key of this electro type.
    *
    * @return the primary key of this electro type
    */
    @Override
    public long getPrimaryKey() {
        return _electroType.getPrimaryKey();
    }

    /**
    * Sets the primary key of this electro type.
    *
    * @param primaryKey the primary key of this electro type
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _electroType.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the electro_type_id of this electro type.
    *
    * @return the electro_type_id of this electro type
    */
    @Override
    public long getElectro_type_id() {
        return _electroType.getElectro_type_id();
    }

    /**
    * Sets the electro_type_id of this electro type.
    *
    * @param electro_type_id the electro_type_id of this electro type
    */
    @Override
    public void setElectro_type_id(long electro_type_id) {
        _electroType.setElectro_type_id(electro_type_id);
    }

    /**
    * Returns the name of this electro type.
    *
    * @return the name of this electro type
    */
    @Override
    public java.lang.String getName() {
        return _electroType.getName();
    }

    /**
    * Sets the name of this electro type.
    *
    * @param name the name of this electro type
    */
    @Override
    public void setName(java.lang.String name) {
        _electroType.setName(name);
    }

    @Override
    public boolean isNew() {
        return _electroType.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _electroType.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _electroType.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _electroType.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _electroType.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _electroType.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _electroType.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _electroType.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _electroType.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _electroType.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _electroType.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new ElectroTypeWrapper((ElectroType) _electroType.clone());
    }

    @Override
    public int compareTo(ru.hmel.model.ElectroType electroType) {
        return _electroType.compareTo(electroType);
    }

    @Override
    public int hashCode() {
        return _electroType.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<ru.hmel.model.ElectroType> toCacheModel() {
        return _electroType.toCacheModel();
    }

    @Override
    public ru.hmel.model.ElectroType toEscapedModel() {
        return new ElectroTypeWrapper(_electroType.toEscapedModel());
    }

    @Override
    public ru.hmel.model.ElectroType toUnescapedModel() {
        return new ElectroTypeWrapper(_electroType.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _electroType.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _electroType.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _electroType.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof ElectroTypeWrapper)) {
            return false;
        }

        ElectroTypeWrapper electroTypeWrapper = (ElectroTypeWrapper) obj;

        if (Validator.equals(_electroType, electroTypeWrapper._electroType)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public ElectroType getWrappedElectroType() {
        return _electroType;
    }

    @Override
    public ElectroType getWrappedModel() {
        return _electroType;
    }

    @Override
    public void resetOriginalValues() {
        _electroType.resetOriginalValues();
    }
}
