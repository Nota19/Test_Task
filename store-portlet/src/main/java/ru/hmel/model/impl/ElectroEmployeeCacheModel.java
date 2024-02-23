package ru.hmel.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import ru.hmel.model.ElectroEmployee;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing ElectroEmployee in entity cache.
 *
 * @author Hmel Max
 * @see ElectroEmployee
 * @generated
 */
public class ElectroEmployeeCacheModel implements CacheModel<ElectroEmployee>,
    Externalizable {
    public long electro_employee_id;
    public long etype;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{electro_employee_id=");
        sb.append(electro_employee_id);
        sb.append(", etype=");
        sb.append(etype);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public ElectroEmployee toEntityModel() {
        ElectroEmployeeImpl electroEmployeeImpl = new ElectroEmployeeImpl();

        electroEmployeeImpl.setElectro_employee_id(electro_employee_id);
        electroEmployeeImpl.setEtype(etype);

        electroEmployeeImpl.resetOriginalValues();

        return electroEmployeeImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        electro_employee_id = objectInput.readLong();
        etype = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(electro_employee_id);
        objectOutput.writeLong(etype);
    }
}
