package ru.hmel.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import ru.hmel.service.ClpSerializer;
import ru.hmel.service.ElectroEmployeeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class ElectroEmployeeClp extends BaseModelImpl<ElectroEmployee>
    implements ElectroEmployee {
    private long _electro_employee_id;
    private long _etype;
    private BaseModel<?> _electroEmployeeRemoteModel;
    private Class<?> _clpSerializerClass = ru.hmel.service.ClpSerializer.class;

    public ElectroEmployeeClp() {
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
    public long getPrimaryKey() {
        return _electro_employee_id;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setElectro_employee_id(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _electro_employee_id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getElectro_employee_id() {
        return _electro_employee_id;
    }

    @Override
    public void setElectro_employee_id(long electro_employee_id) {
        _electro_employee_id = electro_employee_id;

        if (_electroEmployeeRemoteModel != null) {
            try {
                Class<?> clazz = _electroEmployeeRemoteModel.getClass();

                Method method = clazz.getMethod("setElectro_employee_id",
                        long.class);

                method.invoke(_electroEmployeeRemoteModel, electro_employee_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getEtype() {
        return _etype;
    }

    @Override
    public void setEtype(long etype) {
        _etype = etype;

        if (_electroEmployeeRemoteModel != null) {
            try {
                Class<?> clazz = _electroEmployeeRemoteModel.getClass();

                Method method = clazz.getMethod("setEtype", long.class);

                method.invoke(_electroEmployeeRemoteModel, etype);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getElectroEmployeeRemoteModel() {
        return _electroEmployeeRemoteModel;
    }

    public void setElectroEmployeeRemoteModel(
        BaseModel<?> electroEmployeeRemoteModel) {
        _electroEmployeeRemoteModel = electroEmployeeRemoteModel;
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

        Class<?> remoteModelClass = _electroEmployeeRemoteModel.getClass();

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

        Object returnValue = method.invoke(_electroEmployeeRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            ElectroEmployeeLocalServiceUtil.addElectroEmployee(this);
        } else {
            ElectroEmployeeLocalServiceUtil.updateElectroEmployee(this);
        }
    }

    @Override
    public ElectroEmployee toEscapedModel() {
        return (ElectroEmployee) ProxyUtil.newProxyInstance(ElectroEmployee.class.getClassLoader(),
            new Class[] { ElectroEmployee.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        ElectroEmployeeClp clone = new ElectroEmployeeClp();

        clone.setElectro_employee_id(getElectro_employee_id());
        clone.setEtype(getEtype());

        return clone;
    }

    @Override
    public int compareTo(ElectroEmployee electroEmployee) {
        long primaryKey = electroEmployee.getPrimaryKey();

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

        if (!(obj instanceof ElectroEmployeeClp)) {
            return false;
        }

        ElectroEmployeeClp electroEmployee = (ElectroEmployeeClp) obj;

        long primaryKey = electroEmployee.getPrimaryKey();

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
        StringBundler sb = new StringBundler(5);

        sb.append("{electro_employee_id=");
        sb.append(getElectro_employee_id());
        sb.append(", etype=");
        sb.append(getEtype());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append("ru.hmel.model.ElectroEmployee");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>electro_employee_id</column-name><column-value><![CDATA[");
        sb.append(getElectro_employee_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>etype</column-name><column-value><![CDATA[");
        sb.append(getEtype());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
