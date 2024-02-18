package ru.hmel.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import ru.hmel.model.PositionType;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing PositionType in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see PositionType
 * @generated
 */
public class PositionTypeCacheModel implements CacheModel<PositionType>,
    Externalizable {
    public String uuid;
    public long position_id;
    public String name;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", position_id=");
        sb.append(position_id);
        sb.append(", name=");
        sb.append(name);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public PositionType toEntityModel() {
        PositionTypeImpl positionTypeImpl = new PositionTypeImpl();

        if (uuid == null) {
            positionTypeImpl.setUuid(StringPool.BLANK);
        } else {
            positionTypeImpl.setUuid(uuid);
        }

        positionTypeImpl.setPosition_id(position_id);

        if (name == null) {
            positionTypeImpl.setName(StringPool.BLANK);
        } else {
            positionTypeImpl.setName(name);
        }

        positionTypeImpl.resetOriginalValues();

        return positionTypeImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();
        position_id = objectInput.readLong();
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

        objectOutput.writeLong(position_id);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }
    }
}
