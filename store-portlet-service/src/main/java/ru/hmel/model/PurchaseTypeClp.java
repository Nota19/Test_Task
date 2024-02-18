package ru.hmel.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import ru.hmel.service.ClpSerializer;
import ru.hmel.service.PurchaseTypeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class PurchaseTypeClp extends BaseModelImpl<PurchaseType>
    implements PurchaseType {
    private String _uuid;
    private long _purchase_type_id;
    private String _name;
    private BaseModel<?> _purchaseTypeRemoteModel;
    private Class<?> _clpSerializerClass = ru.hmel.service.ClpSerializer.class;

    public PurchaseTypeClp() {
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
    public long getPrimaryKey() {
        return _purchase_type_id;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setPurchase_type_id(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _purchase_type_id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("purchase_type_id", getPurchase_type_id());
        attributes.put("name", getName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long purchase_type_id = (Long) attributes.get("purchase_type_id");

        if (purchase_type_id != null) {
            setPurchase_type_id(purchase_type_id);
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

        if (_purchaseTypeRemoteModel != null) {
            try {
                Class<?> clazz = _purchaseTypeRemoteModel.getClass();

                Method method = clazz.getMethod("setUuid", String.class);

                method.invoke(_purchaseTypeRemoteModel, uuid);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getPurchase_type_id() {
        return _purchase_type_id;
    }

    @Override
    public void setPurchase_type_id(long purchase_type_id) {
        _purchase_type_id = purchase_type_id;

        if (_purchaseTypeRemoteModel != null) {
            try {
                Class<?> clazz = _purchaseTypeRemoteModel.getClass();

                Method method = clazz.getMethod("setPurchase_type_id",
                        long.class);

                method.invoke(_purchaseTypeRemoteModel, purchase_type_id);
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

        if (_purchaseTypeRemoteModel != null) {
            try {
                Class<?> clazz = _purchaseTypeRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_purchaseTypeRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getPurchaseTypeRemoteModel() {
        return _purchaseTypeRemoteModel;
    }

    public void setPurchaseTypeRemoteModel(BaseModel<?> purchaseTypeRemoteModel) {
        _purchaseTypeRemoteModel = purchaseTypeRemoteModel;
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

        Class<?> remoteModelClass = _purchaseTypeRemoteModel.getClass();

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

        Object returnValue = method.invoke(_purchaseTypeRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PurchaseTypeLocalServiceUtil.addPurchaseType(this);
        } else {
            PurchaseTypeLocalServiceUtil.updatePurchaseType(this);
        }
    }

    @Override
    public PurchaseType toEscapedModel() {
        return (PurchaseType) ProxyUtil.newProxyInstance(PurchaseType.class.getClassLoader(),
            new Class[] { PurchaseType.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        PurchaseTypeClp clone = new PurchaseTypeClp();

        clone.setUuid(getUuid());
        clone.setPurchase_type_id(getPurchase_type_id());
        clone.setName(getName());

        return clone;
    }

    @Override
    public int compareTo(PurchaseType purchaseType) {
        long primaryKey = purchaseType.getPrimaryKey();

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

        if (!(obj instanceof PurchaseTypeClp)) {
            return false;
        }

        PurchaseTypeClp purchaseType = (PurchaseTypeClp) obj;

        long primaryKey = purchaseType.getPrimaryKey();

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
        sb.append(", purchase_type_id=");
        sb.append(getPurchase_type_id());
        sb.append(", name=");
        sb.append(getName());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("ru.hmel.model.PurchaseType");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>uuid</column-name><column-value><![CDATA[");
        sb.append(getUuid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>purchase_type_id</column-name><column-value><![CDATA[");
        sb.append(getPurchase_type_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
