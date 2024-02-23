package ru.hmel.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Employee}.
 * </p>
 *
 * @author Hmel Max
 * @see Employee
 * @generated
 */
public class EmployeeWrapper implements Employee, ModelWrapper<Employee> {
    private Employee _employee;

    public EmployeeWrapper(Employee employee) {
        _employee = employee;
    }

    @Override
    public Class<?> getModelClass() {
        return Employee.class;
    }

    @Override
    public String getModelClassName() {
        return Employee.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("employee_id", getEmployee_id());
        attributes.put("lastname", getLastname());
        attributes.put("firstname", getFirstname());
        attributes.put("patronymic", getPatronymic());
        attributes.put("birthdate", getBirthdate());
        attributes.put("position", getPosition());
        attributes.put("gender", getGender());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long employee_id = (Long) attributes.get("employee_id");

        if (employee_id != null) {
            setEmployee_id(employee_id);
        }

        String lastname = (String) attributes.get("lastname");

        if (lastname != null) {
            setLastname(lastname);
        }

        String firstname = (String) attributes.get("firstname");

        if (firstname != null) {
            setFirstname(firstname);
        }

        String patronymic = (String) attributes.get("patronymic");

        if (patronymic != null) {
            setPatronymic(patronymic);
        }

        Date birthdate = (Date) attributes.get("birthdate");

        if (birthdate != null) {
            setBirthdate(birthdate);
        }

        Long position = (Long) attributes.get("position");

        if (position != null) {
            setPosition(position);
        }

        Boolean gender = (Boolean) attributes.get("gender");

        if (gender != null) {
            setGender(gender);
        }
    }

    /**
    * Returns the primary key of this employee.
    *
    * @return the primary key of this employee
    */
    @Override
    public long getPrimaryKey() {
        return _employee.getPrimaryKey();
    }

    /**
    * Sets the primary key of this employee.
    *
    * @param primaryKey the primary key of this employee
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _employee.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the employee_id of this employee.
    *
    * @return the employee_id of this employee
    */
    @Override
    public long getEmployee_id() {
        return _employee.getEmployee_id();
    }

    /**
    * Sets the employee_id of this employee.
    *
    * @param employee_id the employee_id of this employee
    */
    @Override
    public void setEmployee_id(long employee_id) {
        _employee.setEmployee_id(employee_id);
    }

    /**
    * Returns the lastname of this employee.
    *
    * @return the lastname of this employee
    */
    @Override
    public java.lang.String getLastname() {
        return _employee.getLastname();
    }

    /**
    * Sets the lastname of this employee.
    *
    * @param lastname the lastname of this employee
    */
    @Override
    public void setLastname(java.lang.String lastname) {
        _employee.setLastname(lastname);
    }

    /**
    * Returns the firstname of this employee.
    *
    * @return the firstname of this employee
    */
    @Override
    public java.lang.String getFirstname() {
        return _employee.getFirstname();
    }

    /**
    * Sets the firstname of this employee.
    *
    * @param firstname the firstname of this employee
    */
    @Override
    public void setFirstname(java.lang.String firstname) {
        _employee.setFirstname(firstname);
    }

    /**
    * Returns the patronymic of this employee.
    *
    * @return the patronymic of this employee
    */
    @Override
    public java.lang.String getPatronymic() {
        return _employee.getPatronymic();
    }

    /**
    * Sets the patronymic of this employee.
    *
    * @param patronymic the patronymic of this employee
    */
    @Override
    public void setPatronymic(java.lang.String patronymic) {
        _employee.setPatronymic(patronymic);
    }

    /**
    * Returns the birthdate of this employee.
    *
    * @return the birthdate of this employee
    */
    @Override
    public java.util.Date getBirthdate() {
        return _employee.getBirthdate();
    }

    /**
    * Sets the birthdate of this employee.
    *
    * @param birthdate the birthdate of this employee
    */
    @Override
    public void setBirthdate(java.util.Date birthdate) {
        _employee.setBirthdate(birthdate);
    }

    /**
    * Returns the position of this employee.
    *
    * @return the position of this employee
    */
    @Override
    public long getPosition() {
        return _employee.getPosition();
    }

    /**
    * Sets the position of this employee.
    *
    * @param position the position of this employee
    */
    @Override
    public void setPosition(long position) {
        _employee.setPosition(position);
    }

    /**
    * Returns the gender of this employee.
    *
    * @return the gender of this employee
    */
    @Override
    public boolean getGender() {
        return _employee.getGender();
    }

    /**
    * Returns <code>true</code> if this employee is gender.
    *
    * @return <code>true</code> if this employee is gender; <code>false</code> otherwise
    */
    @Override
    public boolean isGender() {
        return _employee.isGender();
    }

    /**
    * Sets whether this employee is gender.
    *
    * @param gender the gender of this employee
    */
    @Override
    public void setGender(boolean gender) {
        _employee.setGender(gender);
    }

    @Override
    public boolean isNew() {
        return _employee.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _employee.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _employee.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _employee.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _employee.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _employee.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _employee.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _employee.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _employee.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _employee.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _employee.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EmployeeWrapper((Employee) _employee.clone());
    }

    @Override
    public int compareTo(ru.hmel.model.Employee employee) {
        return _employee.compareTo(employee);
    }

    @Override
    public int hashCode() {
        return _employee.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<ru.hmel.model.Employee> toCacheModel() {
        return _employee.toCacheModel();
    }

    @Override
    public ru.hmel.model.Employee toEscapedModel() {
        return new EmployeeWrapper(_employee.toEscapedModel());
    }

    @Override
    public ru.hmel.model.Employee toUnescapedModel() {
        return new EmployeeWrapper(_employee.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _employee.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _employee.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _employee.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EmployeeWrapper)) {
            return false;
        }

        EmployeeWrapper employeeWrapper = (EmployeeWrapper) obj;

        if (Validator.equals(_employee, employeeWrapper._employee)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Employee getWrappedEmployee() {
        return _employee;
    }

    @Override
    public Employee getWrappedModel() {
        return _employee;
    }

    @Override
    public void resetOriginalValues() {
        _employee.resetOriginalValues();
    }
}
