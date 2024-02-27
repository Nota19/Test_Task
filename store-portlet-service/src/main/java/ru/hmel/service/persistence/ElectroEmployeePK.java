package ru.hmel.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author Hmel Max
 * @generated
 */
public class ElectroEmployeePK implements Comparable<ElectroEmployeePK>,
    Serializable {
    public long electro_employee_id;
    public long etype;

    public ElectroEmployeePK() {
    }

    public ElectroEmployeePK(long electro_employee_id, long etype) {
        this.electro_employee_id = electro_employee_id;
        this.etype = etype;
    }

    public long getElectro_employee_id() {
        return electro_employee_id;
    }

    public void setElectro_employee_id(long electro_employee_id) {
        this.electro_employee_id = electro_employee_id;
    }

    public long getEtype() {
        return etype;
    }

    public void setEtype(long etype) {
        this.etype = etype;
    }

    @Override
    public int compareTo(ElectroEmployeePK pk) {
        if (pk == null) {
            return -1;
        }

        int value = 0;

        if (electro_employee_id < pk.electro_employee_id) {
            value = -1;
        } else if (electro_employee_id > pk.electro_employee_id) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        if (etype < pk.etype) {
            value = -1;
        } else if (etype > pk.etype) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof ElectroEmployeePK)) {
            return false;
        }

        ElectroEmployeePK pk = (ElectroEmployeePK) obj;

        if ((electro_employee_id == pk.electro_employee_id) &&
                (etype == pk.etype)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(electro_employee_id) + String.valueOf(etype)).hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(10);

        sb.append(StringPool.OPEN_CURLY_BRACE);

        sb.append("electro_employee_id");
        sb.append(StringPool.EQUAL);
        sb.append(electro_employee_id);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("etype");
        sb.append(StringPool.EQUAL);
        sb.append(etype);

        sb.append(StringPool.CLOSE_CURLY_BRACE);

        return sb.toString();
    }
}
