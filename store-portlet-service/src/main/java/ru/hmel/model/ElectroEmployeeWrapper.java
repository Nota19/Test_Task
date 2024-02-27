package ru.hmel.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ElectroEmployee}.
 * </p>
 *
 * @author Hmel Max
 * @see ElectroEmployee
 * @generated
 */
public class ElectroEmployeeWrapper implements ElectroEmployee,
    ModelWrapper<ElectroEmployee> {
    private ElectroEmployee _electroEmployee;

    public ElectroEmployeeWrapper(ElectroEmployee electroEmployee) {
        _electroEmployee = electroEmployee;
    }

    @Override
    public Class<?> getModelClass() {
        return ElectroEmployee.class;
    }

    @Override
    public String getModelClassName() {
        return ElectroEmployee.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("electro_employee_id", getElectro_employee_id());
        attributes.put("etype", getEtype());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long electro_employee_id = (Long) attributes.get("electro_employee_id");

        if (electro_employee_id != null) {
            setElectro_employee_id(electro_employee_id);
        }

        Long etype = (Long) attributes.get("etype");

        if (etype != null) {
            setEtype(etype);
        }
    }

    /**
    * Returns the primary key of this electro employee.
    *
    * @return the primary key of this electro employee
    */
    @Override
    public ru.hmel.service.persistence.ElectroEmployeePK getPrimaryKey() {
        return _electroEmployee.getPrimaryKey();
    }

    /**
    * Sets the primary key of this electro employee.
    *
    * @param primaryKey the primary key of this electro employee
    */
    @Override
    public void setPrimaryKey(
        ru.hmel.service.persistence.ElectroEmployeePK primaryKey) {
        _electroEmployee.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the electro_employee_id of this electro employee.
    *
    * @return the electro_employee_id of this electro employee
    */
    @Override
    public long getElectro_employee_id() {
        return _electroEmployee.getElectro_employee_id();
    }

    /**
    * Sets the electro_employee_id of this electro employee.
    *
    * @param electro_employee_id the electro_employee_id of this electro employee
    */
    @Override
    public void setElectro_employee_id(long electro_employee_id) {
        _electroEmployee.setElectro_employee_id(electro_employee_id);
    }

    /**
    * Returns the etype of this electro employee.
    *
    * @return the etype of this electro employee
    */
    @Override
    public long getEtype() {
        return _electroEmployee.getEtype();
    }

    /**
    * Sets the etype of this electro employee.
    *
    * @param etype the etype of this electro employee
    */
    @Override
    public void setEtype(long etype) {
        _electroEmployee.setEtype(etype);
    }

    @Override
    public boolean isNew() {
        return _electroEmployee.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _electroEmployee.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _electroEmployee.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _electroEmployee.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _electroEmployee.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _electroEmployee.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _electroEmployee.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _electroEmployee.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _electroEmployee.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _electroEmployee.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _electroEmployee.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new ElectroEmployeeWrapper((ElectroEmployee) _electroEmployee.clone());
    }

    @Override
    public int compareTo(ru.hmel.model.ElectroEmployee electroEmployee) {
        return _electroEmployee.compareTo(electroEmployee);
    }

    @Override
    public int hashCode() {
        return _electroEmployee.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<ru.hmel.model.ElectroEmployee> toCacheModel() {
        return _electroEmployee.toCacheModel();
    }

    @Override
    public ru.hmel.model.ElectroEmployee toEscapedModel() {
        return new ElectroEmployeeWrapper(_electroEmployee.toEscapedModel());
    }

    @Override
    public ru.hmel.model.ElectroEmployee toUnescapedModel() {
        return new ElectroEmployeeWrapper(_electroEmployee.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _electroEmployee.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _electroEmployee.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _electroEmployee.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof ElectroEmployeeWrapper)) {
            return false;
        }

        ElectroEmployeeWrapper electroEmployeeWrapper = (ElectroEmployeeWrapper) obj;

        if (Validator.equals(_electroEmployee,
                    electroEmployeeWrapper._electroEmployee)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public ElectroEmployee getWrappedElectroEmployee() {
        return _electroEmployee;
    }

    @Override
    public ElectroEmployee getWrappedModel() {
        return _electroEmployee;
    }

    @Override
    public void resetOriginalValues() {
        _electroEmployee.resetOriginalValues();
    }
}
