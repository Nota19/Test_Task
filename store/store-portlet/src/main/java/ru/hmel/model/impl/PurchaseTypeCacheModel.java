package ru.hmel.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import ru.hmel.model.PurchaseType;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing PurchaseType in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see PurchaseType
 * @generated
 */
public class PurchaseTypeCacheModel implements CacheModel<PurchaseType>,
    Externalizable {
    public String uuid;
    public long purchase_type_id;
    public String name;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", purchase_type_id=");
        sb.append(purchase_type_id);
        sb.append(", name=");
        sb.append(name);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public PurchaseType toEntityModel() {
        PurchaseTypeImpl purchaseTypeImpl = new PurchaseTypeImpl();

        if (uuid == null) {
            purchaseTypeImpl.setUuid(StringPool.BLANK);
        } else {
            purchaseTypeImpl.setUuid(uuid);
        }

        purchaseTypeImpl.setPurchase_type_id(purchase_type_id);

        if (name == null) {
            purchaseTypeImpl.setName(StringPool.BLANK);
        } else {
            purchaseTypeImpl.setName(name);
        }

        purchaseTypeImpl.resetOriginalValues();

        return purchaseTypeImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();
        purchase_type_id = objectInput.readLong();
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

        objectOutput.writeLong(purchase_type_id);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }
    }
}
