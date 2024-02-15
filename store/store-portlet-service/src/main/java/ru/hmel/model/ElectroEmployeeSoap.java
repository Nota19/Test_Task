package ru.hmel.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link ru.hmel.service.http.ElectroEmployeeServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see ru.hmel.service.http.ElectroEmployeeServiceSoap
 * @generated
 */
public class ElectroEmployeeSoap implements Serializable {
    private String _uuid;
    private long _electro_employee_id;
    private long _etype;

    public ElectroEmployeeSoap() {
    }

    public static ElectroEmployeeSoap toSoapModel(ElectroEmployee model) {
        ElectroEmployeeSoap soapModel = new ElectroEmployeeSoap();

        soapModel.setUuid(model.getUuid());
        soapModel.setElectro_employee_id(model.getElectro_employee_id());
        soapModel.setEtype(model.getEtype());

        return soapModel;
    }

    public static ElectroEmployeeSoap[] toSoapModels(ElectroEmployee[] models) {
        ElectroEmployeeSoap[] soapModels = new ElectroEmployeeSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static ElectroEmployeeSoap[][] toSoapModels(
        ElectroEmployee[][] models) {
        ElectroEmployeeSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new ElectroEmployeeSoap[models.length][models[0].length];
        } else {
            soapModels = new ElectroEmployeeSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static ElectroEmployeeSoap[] toSoapModels(
        List<ElectroEmployee> models) {
        List<ElectroEmployeeSoap> soapModels = new ArrayList<ElectroEmployeeSoap>(models.size());

        for (ElectroEmployee model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new ElectroEmployeeSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _electro_employee_id;
    }

    public void setPrimaryKey(long pk) {
        setElectro_employee_id(pk);
    }

    public String getUuid() {
        return _uuid;
    }

    public void setUuid(String uuid) {
        _uuid = uuid;
    }

    public long getElectro_employee_id() {
        return _electro_employee_id;
    }

    public void setElectro_employee_id(long electro_employee_id) {
        _electro_employee_id = electro_employee_id;
    }

    public long getEtype() {
        return _etype;
    }

    public void setEtype(long etype) {
        _etype = etype;
    }
}
