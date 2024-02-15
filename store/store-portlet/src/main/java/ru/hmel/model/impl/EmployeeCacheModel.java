package ru.hmel.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import ru.hmel.model.Employee;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Employee in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Employee
 * @generated
 */
public class EmployeeCacheModel implements CacheModel<Employee>, Externalizable {
    public String uuid;
    public long employee_id;
    public String lastname;
    public String firstname;
    public String patronymic;
    public long birthdate;
    public long position;
    public boolean gender;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(17);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", employee_id=");
        sb.append(employee_id);
        sb.append(", lastname=");
        sb.append(lastname);
        sb.append(", firstname=");
        sb.append(firstname);
        sb.append(", patronymic=");
        sb.append(patronymic);
        sb.append(", birthdate=");
        sb.append(birthdate);
        sb.append(", position=");
        sb.append(position);
        sb.append(", gender=");
        sb.append(gender);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Employee toEntityModel() {
        EmployeeImpl employeeImpl = new EmployeeImpl();

        if (uuid == null) {
            employeeImpl.setUuid(StringPool.BLANK);
        } else {
            employeeImpl.setUuid(uuid);
        }

        employeeImpl.setEmployee_id(employee_id);

        if (lastname == null) {
            employeeImpl.setLastname(StringPool.BLANK);
        } else {
            employeeImpl.setLastname(lastname);
        }

        if (firstname == null) {
            employeeImpl.setFirstname(StringPool.BLANK);
        } else {
            employeeImpl.setFirstname(firstname);
        }

        if (patronymic == null) {
            employeeImpl.setPatronymic(StringPool.BLANK);
        } else {
            employeeImpl.setPatronymic(patronymic);
        }

        if (birthdate == Long.MIN_VALUE) {
            employeeImpl.setBirthdate(null);
        } else {
            employeeImpl.setBirthdate(new Date(birthdate));
        }

        employeeImpl.setPosition(position);
        employeeImpl.setGender(gender);

        employeeImpl.resetOriginalValues();

        return employeeImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();
        employee_id = objectInput.readLong();
        lastname = objectInput.readUTF();
        firstname = objectInput.readUTF();
        patronymic = objectInput.readUTF();
        birthdate = objectInput.readLong();
        position = objectInput.readLong();
        gender = objectInput.readBoolean();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (uuid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(uuid);
        }

        objectOutput.writeLong(employee_id);

        if (lastname == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(lastname);
        }

        if (firstname == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(firstname);
        }

        if (patronymic == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(patronymic);
        }

        objectOutput.writeLong(birthdate);
        objectOutput.writeLong(position);
        objectOutput.writeBoolean(gender);
    }
}
