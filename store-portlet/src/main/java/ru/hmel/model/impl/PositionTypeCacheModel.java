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
 * @author Hmel Max
 * @see PositionType
 * @generated
 */
public class PositionTypeCacheModel implements CacheModel<PositionType>,
    Externalizable {
    public long position_id;
    public String name;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{position_id=");
        sb.append(position_id);
        sb.append(", name=");
        sb.append(name);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public PositionType toEntityModel() {
        PositionTypeImpl positionTypeImpl = new PositionTypeImpl();

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
        position_id = objectInput.readLong();
        name = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(position_id);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }
    }
}
