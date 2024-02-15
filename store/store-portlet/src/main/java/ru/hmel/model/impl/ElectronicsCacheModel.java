package ru.hmel.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import ru.hmel.model.Electronics;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Electronics in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Electronics
 * @generated
 */
public class ElectronicsCacheModel implements CacheModel<Electronics>,
    Externalizable {
    public String uuid;
    public long electronics_id;
    public String name;
    public long etype;
    public long price;
    public long count;
    public boolean inStock;
    public boolean archive;
    public String description;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", electronics_id=");
        sb.append(electronics_id);
        sb.append(", name=");
        sb.append(name);
        sb.append(", etype=");
        sb.append(etype);
        sb.append(", price=");
        sb.append(price);
        sb.append(", count=");
        sb.append(count);
        sb.append(", inStock=");
        sb.append(inStock);
        sb.append(", archive=");
        sb.append(archive);
        sb.append(", description=");
        sb.append(description);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Electronics toEntityModel() {
        ElectronicsImpl electronicsImpl = new ElectronicsImpl();

        if (uuid == null) {
            electronicsImpl.setUuid(StringPool.BLANK);
        } else {
            electronicsImpl.setUuid(uuid);
        }

        electronicsImpl.setElectronics_id(electronics_id);

        if (name == null) {
            electronicsImpl.setName(StringPool.BLANK);
        } else {
            electronicsImpl.setName(name);
        }

        electronicsImpl.setEtype(etype);
        electronicsImpl.setPrice(price);
        electronicsImpl.setCount(count);
        electronicsImpl.setInStock(inStock);
        electronicsImpl.setArchive(archive);

        if (description == null) {
            electronicsImpl.setDescription(StringPool.BLANK);
        } else {
            electronicsImpl.setDescription(description);
        }

        electronicsImpl.resetOriginalValues();

        return electronicsImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();
        electronics_id = objectInput.readLong();
        name = objectInput.readUTF();
        etype = objectInput.readLong();
        price = objectInput.readLong();
        count = objectInput.readLong();
        inStock = objectInput.readBoolean();
        archive = objectInput.readBoolean();
        description = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (uuid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(uuid);
        }

        objectOutput.writeLong(electronics_id);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        objectOutput.writeLong(etype);
        objectOutput.writeLong(price);
        objectOutput.writeLong(count);
        objectOutput.writeBoolean(inStock);
        objectOutput.writeBoolean(archive);

        if (description == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(description);
        }
    }
}
