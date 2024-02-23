package ru.hmel.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import ru.hmel.service.ClpSerializer;
import ru.hmel.service.ElectroTypeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class ElectroTypeClp extends BaseModelImpl<ElectroType>
    implements ElectroType {
    private long _electro_type_id;
    private String _name;
    private BaseModel<?> _electroTypeRemoteModel;
    private Class<?> _clpSerializerClass = ru.hmel.service.ClpSerializer.class;

    public ElectroTypeClp() {
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
    public long getPrimaryKey() {
        return _electro_type_id;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setElectro_type_id(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _electro_type_id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getElectro_type_id() {
        return _electro_type_id;
    }

    @Override
    public void setElectro_type_id(long electro_type_id) {
        _electro_type_id = electro_type_id;

        if (_electroTypeRemoteModel != null) {
            try {
                Class<?> clazz = _electroTypeRemoteModel.getClass();

                Method method = clazz.getMethod("setElectro_type_id", long.class);

                method.invoke(_electroTypeRemoteModel, electro_type_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public void setName(String name) {
        _name = name;

        if (_electroTypeRemoteModel != null) {
            try {
                Class<?> clazz = _electroTypeRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_electroTypeRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getElectroTypeRemoteModel() {
        return _electroTypeRemoteModel;
    }

    public void setElectroTypeRemoteModel(BaseModel<?> electroTypeRemoteModel) {
        _electroTypeRemoteModel = electroTypeRemoteModel;
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

        Class<?> remoteModelClass = _electroTypeRemoteModel.getClass();

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

        Object returnValue = method.invoke(_electroTypeRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            ElectroTypeLocalServiceUtil.addElectroType(this);
        } else {
            ElectroTypeLocalServiceUtil.updateElectroType(this);
        }
    }

    @Override
    public ElectroType toEscapedModel() {
        return (ElectroType) ProxyUtil.newProxyInstance(ElectroType.class.getClassLoader(),
            new Class[] { ElectroType.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        ElectroTypeClp clone = new ElectroTypeClp();

        clone.setElectro_type_id(getElectro_type_id());
        clone.setName(getName());

        return clone;
    }

    @Override
    public int compareTo(ElectroType electroType) {
        long primaryKey = electroType.getPrimaryKey();

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

        if (!(obj instanceof ElectroTypeClp)) {
            return false;
        }

        ElectroTypeClp electroType = (ElectroTypeClp) obj;

        long primaryKey = electroType.getPrimaryKey();

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

        sb.append("{electro_type_id=");
        sb.append(getElectro_type_id());
        sb.append(", name=");
        sb.append(getName());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append("ru.hmel.model.ElectroType");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>electro_type_id</column-name><column-value><![CDATA[");
        sb.append(getElectro_type_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
