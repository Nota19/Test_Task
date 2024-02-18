package ru.hmel.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import ru.hmel.service.ClpSerializer;
import ru.hmel.service.EmployeeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class EmployeeClp extends BaseModelImpl<Employee> implements Employee {
    private String _uuid;
    private long _employee_id;
    private String _lastname;
    private String _firstname;
    private String _patronymic;
    private Date _birthdate;
    private long _position;
    private boolean _gender;
    private BaseModel<?> _employeeRemoteModel;
    private Class<?> _clpSerializerClass = ru.hmel.service.ClpSerializer.class;

    public EmployeeClp() {
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
    public long getPrimaryKey() {
        return _employee_id;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setEmployee_id(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _employee_id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
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
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

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

    @Override
    public String getUuid() {
        return _uuid;
    }

    @Override
    public void setUuid(String uuid) {
        _uuid = uuid;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setUuid", String.class);

                method.invoke(_employeeRemoteModel, uuid);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getEmployee_id() {
        return _employee_id;
    }

    @Override
    public void setEmployee_id(long employee_id) {
        _employee_id = employee_id;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setEmployee_id", long.class);

                method.invoke(_employeeRemoteModel, employee_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getLastname() {
        return _lastname;
    }

    @Override
    public void setLastname(String lastname) {
        _lastname = lastname;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setLastname", String.class);

                method.invoke(_employeeRemoteModel, lastname);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getFirstname() {
        return _firstname;
    }

    @Override
    public void setFirstname(String firstname) {
        _firstname = firstname;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setFirstname", String.class);

                method.invoke(_employeeRemoteModel, firstname);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPatronymic() {
        return _patronymic;
    }

    @Override
    public void setPatronymic(String patronymic) {
        _patronymic = patronymic;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setPatronymic", String.class);

                method.invoke(_employeeRemoteModel, patronymic);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getBirthdate() {
        return _birthdate;
    }

    @Override
    public void setBirthdate(Date birthdate) {
        _birthdate = birthdate;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setBirthdate", Date.class);

                method.invoke(_employeeRemoteModel, birthdate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getPosition() {
        return _position;
    }

    @Override
    public void setPosition(long position) {
        _position = position;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setPosition", long.class);

                method.invoke(_employeeRemoteModel, position);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean getGender() {
        return _gender;
    }

    @Override
    public boolean isGender() {
        return _gender;
    }

    @Override
    public void setGender(boolean gender) {
        _gender = gender;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setGender", boolean.class);

                method.invoke(_employeeRemoteModel, gender);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEmployeeRemoteModel() {
        return _employeeRemoteModel;
    }

    public void setEmployeeRemoteModel(BaseModel<?> employeeRemoteModel) {
        _employeeRemoteModel = employeeRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _employeeRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_employeeRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EmployeeLocalServiceUtil.addEmployee(this);
        } else {
            EmployeeLocalServiceUtil.updateEmployee(this);
        }
    }

    @Override
    public Employee toEscapedModel() {
        return (Employee) ProxyUtil.newProxyInstance(Employee.class.getClassLoader(),
            new Class[] { Employee.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EmployeeClp clone = new EmployeeClp();

        clone.setUuid(getUuid());
        clone.setEmployee_id(getEmployee_id());
        clone.setLastname(getLastname());
        clone.setFirstname(getFirstname());
        clone.setPatronymic(getPatronymic());
        clone.setBirthdate(getBirthdate());
        clone.setPosition(getPosition());
        clone.setGender(getGender());

        return clone;
    }

    @Override
    public int compareTo(Employee employee) {
        long primaryKey = employee.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EmployeeClp)) {
            return false;
        }

        EmployeeClp employee = (EmployeeClp) obj;

        long primaryKey = employee.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(17);

        sb.append("{uuid=");
        sb.append(getUuid());
        sb.append(", employee_id=");
        sb.append(getEmployee_id());
        sb.append(", lastname=");
        sb.append(getLastname());
        sb.append(", firstname=");
        sb.append(getFirstname());
        sb.append(", patronymic=");
        sb.append(getPatronymic());
        sb.append(", birthdate=");
        sb.append(getBirthdate());
        sb.append(", position=");
        sb.append(getPosition());
        sb.append(", gender=");
        sb.append(getGender());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(28);

        sb.append("<model><model-name>");
        sb.append("ru.hmel.model.Employee");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>uuid</column-name><column-value><![CDATA[");
        sb.append(getUuid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>employee_id</column-name><column-value><![CDATA[");
        sb.append(getEmployee_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>lastname</column-name><column-value><![CDATA[");
        sb.append(getLastname());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>firstname</column-name><column-value><![CDATA[");
        sb.append(getFirstname());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>patronymic</column-name><column-value><![CDATA[");
        sb.append(getPatronymic());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>birthdate</column-name><column-value><![CDATA[");
        sb.append(getBirthdate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>position</column-name><column-value><![CDATA[");
        sb.append(getPosition());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>gender</column-name><column-value><![CDATA[");
        sb.append(getGender());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
