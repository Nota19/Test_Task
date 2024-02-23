package ru.hmel.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import ru.hmel.service.ClpSerializer;
import ru.hmel.service.ElectronicsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class ElectronicsClp extends BaseModelImpl<Electronics>
    implements Electronics {
    private long _electronics_id;
    private String _name;
    private long _etype;
    private long _price;
    private long _count;
    private boolean _inStock;
    private boolean _archive;
    private String _description;
    private BaseModel<?> _electronicsRemoteModel;
    private Class<?> _clpSerializerClass = ru.hmel.service.ClpSerializer.class;

    public ElectronicsClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Electronics.class;
    }

    @Override
    public String getModelClassName() {
        return Electronics.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _electronics_id;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setElectronics_id(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _electronics_id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("electronics_id", getElectronics_id());
        attributes.put("name", getName());
        attributes.put("etype", getEtype());
        attributes.put("price", getPrice());
        attributes.put("count", getCount());
        attributes.put("inStock", getInStock());
        attributes.put("archive", getArchive());
        attributes.put("description", getDescription());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long electronics_id = (Long) attributes.get("electronics_id");

        if (electronics_id != null) {
            setElectronics_id(electronics_id);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        Long etype = (Long) attributes.get("etype");

        if (etype != null) {
            setEtype(etype);
        }

        Long price = (Long) attributes.get("price");

        if (price != null) {
            setPrice(price);
        }

        Long count = (Long) attributes.get("count");

        if (count != null) {
            setCount(count);
        }

        Boolean inStock = (Boolean) attributes.get("inStock");

        if (inStock != null) {
            setInStock(inStock);
        }

        Boolean archive = (Boolean) attributes.get("archive");

        if (archive != null) {
            setArchive(archive);
        }

        String description = (String) attributes.get("description");

        if (description != null) {
            setDescription(description);
        }
    }

    @Override
    public long getElectronics_id() {
        return _electronics_id;
    }

    @Override
    public void setElectronics_id(long electronics_id) {
        _electronics_id = electronics_id;

        if (_electronicsRemoteModel != null) {
            try {
                Class<?> clazz = _electronicsRemoteModel.getClass();

                Method method = clazz.getMethod("setElectronics_id", long.class);

                method.invoke(_electronicsRemoteModel, electronics_id);
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

        if (_electronicsRemoteModel != null) {
            try {
                Class<?> clazz = _electronicsRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_electronicsRemoteModel, name);
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

        if (_electronicsRemoteModel != null) {
            try {
                Class<?> clazz = _electronicsRemoteModel.getClass();

                Method method = clazz.getMethod("setEtype", long.class);

                method.invoke(_electronicsRemoteModel, etype);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getPrice() {
        return _price;
    }

    @Override
    public void setPrice(long price) {
        _price = price;

        if (_electronicsRemoteModel != null) {
            try {
                Class<?> clazz = _electronicsRemoteModel.getClass();

                Method method = clazz.getMethod("setPrice", long.class);

                method.invoke(_electronicsRemoteModel, price);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCount() {
        return _count;
    }

    @Override
    public void setCount(long count) {
        _count = count;

        if (_electronicsRemoteModel != null) {
            try {
                Class<?> clazz = _electronicsRemoteModel.getClass();

                Method method = clazz.getMethod("setCount", long.class);

                method.invoke(_electronicsRemoteModel, count);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean getInStock() {
        return _inStock;
    }

    @Override
    public boolean isInStock() {
        return _inStock;
    }

    @Override
    public void setInStock(boolean inStock) {
        _inStock = inStock;

        if (_electronicsRemoteModel != null) {
            try {
                Class<?> clazz = _electronicsRemoteModel.getClass();

                Method method = clazz.getMethod("setInStock", boolean.class);

                method.invoke(_electronicsRemoteModel, inStock);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean getArchive() {
        return _archive;
    }

    @Override
    public boolean isArchive() {
        return _archive;
    }

    @Override
    public void setArchive(boolean archive) {
        _archive = archive;

        if (_electronicsRemoteModel != null) {
            try {
                Class<?> clazz = _electronicsRemoteModel.getClass();

                Method method = clazz.getMethod("setArchive", boolean.class);

                method.invoke(_electronicsRemoteModel, archive);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDescription() {
        return _description;
    }

    @Override
    public void setDescription(String description) {
        _description = description;

        if (_electronicsRemoteModel != null) {
            try {
                Class<?> clazz = _electronicsRemoteModel.getClass();

                Method method = clazz.getMethod("setDescription", String.class);

                method.invoke(_electronicsRemoteModel, description);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getElectronicsRemoteModel() {
        return _electronicsRemoteModel;
    }

    public void setElectronicsRemoteModel(BaseModel<?> electronicsRemoteModel) {
        _electronicsRemoteModel = electronicsRemoteModel;
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

        Class<?> remoteModelClass = _electronicsRemoteModel.getClass();

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

        Object returnValue = method.invoke(_electronicsRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            ElectronicsLocalServiceUtil.addElectronics(this);
        } else {
            ElectronicsLocalServiceUtil.updateElectronics(this);
        }
    }

    @Override
    public Electronics toEscapedModel() {
        return (Electronics) ProxyUtil.newProxyInstance(Electronics.class.getClassLoader(),
            new Class[] { Electronics.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        ElectronicsClp clone = new ElectronicsClp();

        clone.setElectronics_id(getElectronics_id());
        clone.setName(getName());
        clone.setEtype(getEtype());
        clone.setPrice(getPrice());
        clone.setCount(getCount());
        clone.setInStock(getInStock());
        clone.setArchive(getArchive());
        clone.setDescription(getDescription());

        return clone;
    }

    @Override
    public int compareTo(Electronics electronics) {
        long primaryKey = electronics.getPrimaryKey();

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

        if (!(obj instanceof ElectronicsClp)) {
            return false;
        }

        ElectronicsClp electronics = (ElectronicsClp) obj;

        long primaryKey = electronics.getPrimaryKey();

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

        sb.append("{electronics_id=");
        sb.append(getElectronics_id());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", etype=");
        sb.append(getEtype());
        sb.append(", price=");
        sb.append(getPrice());
        sb.append(", count=");
        sb.append(getCount());
        sb.append(", inStock=");
        sb.append(getInStock());
        sb.append(", archive=");
        sb.append(getArchive());
        sb.append(", description=");
        sb.append(getDescription());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(28);

        sb.append("<model><model-name>");
        sb.append("ru.hmel.model.Electronics");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>electronics_id</column-name><column-value><![CDATA[");
        sb.append(getElectronics_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>etype</column-name><column-value><![CDATA[");
        sb.append(getEtype());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>price</column-name><column-value><![CDATA[");
        sb.append(getPrice());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>count</column-name><column-value><![CDATA[");
        sb.append(getCount());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>inStock</column-name><column-value><![CDATA[");
        sb.append(getInStock());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>archive</column-name><column-value><![CDATA[");
        sb.append(getArchive());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>description</column-name><column-value><![CDATA[");
        sb.append(getDescription());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
