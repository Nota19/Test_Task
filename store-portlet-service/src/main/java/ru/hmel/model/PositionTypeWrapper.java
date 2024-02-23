package ru.hmel.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PositionType}.
 * </p>
 *
 * @author Hmel Max
 * @see PositionType
 * @generated
 */
public class PositionTypeWrapper implements PositionType,
    ModelWrapper<PositionType> {
    private PositionType _positionType;

    public PositionTypeWrapper(PositionType positionType) {
        _positionType = positionType;
    }

    @Override
    public Class<?> getModelClass() {
        return PositionType.class;
    }

    @Override
    public String getModelClassName() {
        return PositionType.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("position_id", getPosition_id());
        attributes.put("name", getName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long position_id = (Long) attributes.get("position_id");

        if (position_id != null) {
            setPosition_id(position_id);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }
    }

    /**
    * Returns the primary key of this position type.
    *
    * @return the primary key of this position type
    */
    @Override
    public long getPrimaryKey() {
        return _positionType.getPrimaryKey();
    }

    /**
    * Sets the primary key of this position type.
    *
    * @param primaryKey the primary key of this position type
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _positionType.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the position_id of this position type.
    *
    * @return the position_id of this position type
    */
    @Override
    public long getPosition_id() {
        return _positionType.getPosition_id();
    }

    /**
    * Sets the position_id of this position type.
    *
    * @param position_id the position_id of this position type
    */
    @Override
    public void setPosition_id(long position_id) {
        _positionType.setPosition_id(position_id);
    }

    /**
    * Returns the name of this position type.
    *
    * @return the name of this position type
    */
    @Override
    public java.lang.String getName() {
        return _positionType.getName();
    }

    /**
    * Sets the name of this position type.
    *
    * @param name the name of this position type
    */
    @Override
    public void setName(java.lang.String name) {
        _positionType.setName(name);
    }

    @Override
    public boolean isNew() {
        return _positionType.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _positionType.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _positionType.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _positionType.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _positionType.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _positionType.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _positionType.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _positionType.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _positionType.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _positionType.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _positionType.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new PositionTypeWrapper((PositionType) _positionType.clone());
    }

    @Override
    public int compareTo(ru.hmel.model.PositionType positionType) {
        return _positionType.compareTo(positionType);
    }

    @Override
    public int hashCode() {
        return _positionType.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<ru.hmel.model.PositionType> toCacheModel() {
        return _positionType.toCacheModel();
    }

    @Override
    public ru.hmel.model.PositionType toEscapedModel() {
        return new PositionTypeWrapper(_positionType.toEscapedModel());
    }

    @Override
    public ru.hmel.model.PositionType toUnescapedModel() {
        return new PositionTypeWrapper(_positionType.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _positionType.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _positionType.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _positionType.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PositionTypeWrapper)) {
            return false;
        }

        PositionTypeWrapper positionTypeWrapper = (PositionTypeWrapper) obj;

        if (Validator.equals(_positionType, positionTypeWrapper._positionType)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public PositionType getWrappedPositionType() {
        return _positionType;
    }

    @Override
    public PositionType getWrappedModel() {
        return _positionType;
    }

    @Override
    public void resetOriginalValues() {
        _positionType.resetOriginalValues();
    }
}
