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
 * @author Brian Wing Shun Chan
 * @see ElectroType
 * @generated
 */
public class ElectroTypeCacheModel implements CacheModel<ElectroType>,
    Externalizable {
    public String uuid;
    public long electro_type_id;
    public String name;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", electro_type_id=");
        sb.append(electro_type_id);
        sb.append(", name=");
        sb.append(name);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public ElectroType toEntityModel() {
        ElectroTypeImpl electroTypeImpl = new ElectroTypeImpl();

        if (uuid == null) {
            electroTypeImpl.setUuid(StringPool.BLANK);
        } else {
            electroTypeImpl.setUuid(uuid);
        }

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
        uuid = objectInput.readUTF();
        electro_type_id = objectInput.readLong();
        name = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (uuid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(uuid);
        }

        objectOutput.writeLong(electro_type_id);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }
    }
}
