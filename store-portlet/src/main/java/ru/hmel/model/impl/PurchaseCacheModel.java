package ru.hmel.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import ru.hmel.model.Purchase;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Purchase in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Purchase
 * @generated
 */
public class PurchaseCacheModel implements CacheModel<Purchase>, Externalizable {
    public String uuid;
    public long purchase_id;
    public long electro_id;
    public long employee_id;
    public long purchaseDate;
    public long type;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(13);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", purchase_id=");
        sb.append(purchase_id);
        sb.append(", electro_id=");
        sb.append(electro_id);
        sb.append(", employee_id=");
        sb.append(employee_id);
        sb.append(", purchaseDate=");
        sb.append(purchaseDate);
        sb.append(", type=");
        sb.append(type);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Purchase toEntityModel() {
        PurchaseImpl purchaseImpl = new PurchaseImpl();

        if (uuid == null) {
            purchaseImpl.setUuid(StringPool.BLANK);
        } else {
            purchaseImpl.setUuid(uuid);
        }

        purchaseImpl.setPurchase_id(purchase_id);
        purchaseImpl.setElectro_id(electro_id);
        purchaseImpl.setEmployee_id(employee_id);

        if (purchaseDate == Long.MIN_VALUE) {
            purchaseImpl.setPurchaseDate(null);
        } else {
            purchaseImpl.setPurchaseDate(new Date(purchaseDate));
        }

        purchaseImpl.setType(type);

        purchaseImpl.resetOriginalValues();

        return purchaseImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();
        purchase_id = objectInput.readLong();
        electro_id = objectInput.readLong();
        employee_id = objectInput.readLong();
        purchaseDate = objectInput.readLong();
        type = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (uuid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(uuid);
        }

        objectOutput.writeLong(purchase_id);
        objectOutput.writeLong(electro_id);
        objectOutput.writeLong(employee_id);
        objectOutput.writeLong(purchaseDate);
        objectOutput.writeLong(type);
    }
}