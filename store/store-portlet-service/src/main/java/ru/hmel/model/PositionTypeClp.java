package ru.hmel.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import ru.hmel.service.ClpSerializer;
import ru.hmel.service.PositionTypeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class PositionTypeClp extends BaseModelImpl<PositionType>
    implements PositionType {
    private String _uuid;
    private long _position_id;
    private String _name;
    private BaseModel<?> _positionTypeRemoteModel;
    private Class<?> _clpSerializerClass = ru.hmel.service.ClpSerializer.class;

    public PositionTypeClp() {
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
    public long getPrimaryKey() {
        return _position_id;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setPosition_id(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _position_id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("position_id", getPosition_id());
        attributes.put("name", getName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long position_id = (Long) attributes.get("position_id");

        if (position_id != null) {
            setPosition_id(position_id);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }
    }

    @Override
    public String getUuid() {
        return _uuid;
    }

    @Override
    public void setUuid(String uuid) {
        _uuid = uuid;

        if (_positionTypeRemoteModel != null) {
            try {
                Class<?> clazz = _positionTypeRemoteModel.getClass();

                Method method = clazz.getMethod("setUuid", String.class);

                method.invoke(_positionTypeRemoteModel, uuid);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getPosition_id() {
        return _position_id;
    }

    @Override
    public void setPosition_id(long position_id) {
        _position_id = position_id;

        if (_positionTypeRemoteModel != null) {
            try {
                Class<?> clazz = _positionTypeRemoteModel.getClass();

                Method method = clazz.getMethod("setPosition_id", long.class);

                method.invoke(_positionTypeRemoteModel, position_id);
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

        if (_positionTypeRemoteModel != null) {
            try {
                Class<?> clazz = _positionTypeRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_positionTypeRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getPositionTypeRemoteModel() {
        return _positionTypeRemoteModel;
    }

    public void setPositionTypeRemoteModel(BaseModel<?> positionTypeRemoteModel) {
        _positionTypeRemoteModel = positionTypeRemoteModel;
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

        Class<?> remoteModelClass = _positionTypeRemoteModel.getClass();

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

        Object returnValue = method.invoke(_positionTypeRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PositionTypeLocalServiceUtil.addPositionType(this);
        } else {
            PositionTypeLocalServiceUtil.updatePositionType(this);
        }
    }

    @Override
    public PositionType toEscapedModel() {
        return (PositionType) ProxyUtil.newProxyInstance(PositionType.class.getClassLoader(),
            new Class[] { PositionType.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        PositionTypeClp clone = new PositionTypeClp();

        clone.setUuid(getUuid());
        clone.setPosition_id(getPosition_id());
        clone.setName(getName());

        return clone;
    }

    @Override
    public int compareTo(PositionType positionType) {
        long primaryKey = positionType.getPrimaryKey();

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

        if (!(obj instanceof PositionTypeClp)) {
            return false;
        }

        PositionTypeClp positionType = (PositionTypeClp) obj;

        long primaryKey = positionType.getPrimaryKey();

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
        StringBundler sb = new StringBundler(7);

        sb.append("{uuid=");
        sb.append(getUuid());
        sb.append(", position_id=");
        sb.append(getPosition_id());
        sb.append(", name=");
        sb.append(getName());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("ru.hmel.model.PositionType");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>uuid</column-name><column-value><![CDATA[");
        sb.append(getUuid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>position_id</column-name><column-value><![CDATA[");
        sb.append(getPosition_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
