package ru.hmel.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import ru.hmel.model.ElectroType;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing ElectroType in entity cache.
 *
 * @author Hmel Max
 * @see ElectroType
 * @generated
 */
public class ElectroTypeCacheModel implements CacheModel<ElectroType>,
    Externalizable {
    public long electro_type_id;
    public String name;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{electro_type_id=");
        sb.append(electro_type_id);
        sb.append(", name=");
        sb.append(name);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public ElectroType toEntityModel() {
        ElectroTypeImpl electroTypeImpl = new ElectroTypeImpl();

        electroTypeImpl.setElectro_type_id(electro_type_id);

        if (name == null) {
            electroTypeImpl.setName(StringPool.BLANK);
        } else {
            electroTypeImpl.setName(name);
        }

        electroTypeImpl.resetOriginalValues();

        return electroTypeImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        electro_type_id = objectInput.readLong();
        name = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(electro_type_id);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }
    }
}
