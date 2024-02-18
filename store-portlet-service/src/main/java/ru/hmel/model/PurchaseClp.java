package ru.hmel.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import ru.hmel.service.ClpSerializer;
import ru.hmel.service.PurchaseLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class PurchaseClp extends BaseModelImpl<Purchase> implements Purchase {
    private String _uuid;
    private long _purchase_id;
    private long _electro_id;
    private long _employee_id;
    private Date _purchaseDate;
    private long _type;
    private BaseModel<?> _purchaseRemoteModel;
    private Class<?> _clpSerializerClass = ru.hmel.service.ClpSerializer.class;

    public PurchaseClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Purchase.class;
    }

    @Override
    public String getModelClassName() {
        return Purchase.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _purchase_id;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setPurchase_id(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _purchase_id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("purchase_id", getPurchase_id());
        attributes.put("electro_id", getElectro_id());
        attributes.put("employee_id", getEmployee_id());
        attributes.put("purchaseDate", getPurchaseDate());
        attributes.put("type", getType());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long purchase_id = (Long) attributes.get("purchase_id");

        if (purchase_id != null) {
            setPurchase_id(purchase_id);
        }

        Long electro_id = (Long) attributes.get("electro_id");

        if (electro_id != null) {
            setElectro_id(electro_id);
        }

        Long employee_id = (Long) attributes.get("employee_id");

        if (employee_id != null) {
            setEmployee_id(employee_id);
        }

        Date purchaseDate = (Date) attributes.get("purchaseDate");

        if (purchaseDate != null) {
            setPurchaseDate(purchaseDate);
        }

        Long type = (Long) attributes.get("type");

        if (type != null) {
            setType(type);
        }
    }

    @Override
    public String getUuid() {
        return _uuid;
    }

    @Override
    public void setUuid(String uuid) {
        _uuid = uuid;

        if (_purchaseRemoteModel != null) {
            try {
                Class<?> clazz = _purchaseRemoteModel.getClass();

                Method method = clazz.getMethod("setUuid", String.class);

                method.invoke(_purchaseRemoteModel, uuid);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getPurchase_id() {
        return _purchase_id;
    }

    @Override
    public void setPurchase_id(long purchase_id) {
        _purchase_id = purchase_id;

        if (_purchaseRemoteModel != null) {
            try {
                Class<?> clazz = _purchaseRemoteModel.getClass();

                Method method = clazz.getMethod("setPurchase_id", long.class);

                method.invoke(_purchaseRemoteModel, purchase_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getElectro_id() {
        return _electro_id;
    }

    @Override
    public void setElectro_id(long electro_id) {
        _electro_id = electro_id;

        if (_purchaseRemoteModel != null) {
            try {
                Class<?> clazz = _purchaseRemoteModel.getClass();

                Method method = clazz.getMethod("setElectro_id", long.class);

                method.invoke(_purchaseRemoteModel, electro_id);
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

        if (_purchaseRemoteModel != null) {
            try {
                Class<?> clazz = _purchaseRemoteModel.getClass();

                Method method = clazz.getMethod("setEmployee_id", long.class);

                method.invoke(_purchaseRemoteModel, employee_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getPurchaseDate() {
        return _purchaseDate;
    }

    @Override
    public void setPurchaseDate(Date purchaseDate) {
        _purchaseDate = purchaseDate;

        if (_purchaseRemoteModel != null) {
            try {
                Class<?> clazz = _purchaseRemoteModel.getClass();

                Method method = clazz.getMethod("setPurchaseDate", Date.class);

                method.invoke(_purchaseRemoteModel, purchaseDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getType() {
        return _type;
    }

    @Override
    public void setType(long type) {
        _type = type;

        if (_purchaseRemoteModel != null) {
            try {
                Class<?> clazz = _purchaseRemoteModel.getClass();

                Method method = clazz.getMethod("setType", long.class);

                method.invoke(_purchaseRemoteModel, type);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getPurchaseRemoteModel() {
        return _purchaseRemoteModel;
    }

    public void setPurchaseRemoteModel(BaseModel<?> purchaseRemoteModel) {
        _purchaseRemoteModel = purchaseRemoteModel;
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

        Class<?> remoteModelClass = _purchaseRemoteModel.getClass();

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

        Object returnValue = method.invoke(_purchaseRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PurchaseLocalServiceUtil.addPurchase(this);
        } else {
            PurchaseLocalServiceUtil.updatePurchase(this);
        }
    }

    @Override
    public Purchase toEscapedModel() {
        return (Purchase) ProxyUtil.newProxyInstance(Purchase.class.getClassLoader(),
            new Class[] { Purchase.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        PurchaseClp clone = new PurchaseClp();

        clone.setUuid(getUuid());
        clone.setPurchase_id(getPurchase_id());
        clone.setElectro_id(getElectro_id());
        clone.setEmployee_id(getEmployee_id());
        clone.setPurchaseDate(getPurchaseDate());
        clone.setType(getType());

        return clone;
    }

    @Override
    public int compareTo(Purchase purchase) {
        long primaryKey = purchase.getPrimaryKey();

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

        if (!(obj instanceof PurchaseClp)) {
            return false;
        }

        PurchaseClp purchase = (PurchaseClp) obj;

        long primaryKey = purchase.getPrimaryKey();

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
        StringBundler sb = new StringBundler(13);

        sb.append("{uuid=");
        sb.append(getUuid());
        sb.append(", purchase_id=");
        sb.append(getPurchase_id());
        sb.append(", electro_id=");
        sb.append(getElectro_id());
        sb.append(", employee_id=");
        sb.append(getEmployee_id());
        sb.append(", purchaseDate=");
        sb.append(getPurchaseDate());
        sb.append(", type=");
        sb.append(getType());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(22);

        sb.append("<model><model-name>");
        sb.append("ru.hmel.model.Purchase");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>uuid</column-name><column-value><![CDATA[");
        sb.append(getUuid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>purchase_id</column-name><column-value><![CDATA[");
        sb.append(getPurchase_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>electro_id</column-name><column-value><![CDATA[");
        sb.append(getElectro_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>employee_id</column-name><column-value><![CDATA[");
        sb.append(getEmployee_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>purchaseDate</column-name><column-value><![CDATA[");
        sb.append(getPurchaseDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>type</column-name><column-value><![CDATA[");
        sb.append(getType());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
