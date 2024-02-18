package ru.hmel.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link ru.hmel.service.http.ElectroTypeServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see ru.hmel.service.http.ElectroTypeServiceSoap
 * @generated
 */
public class ElectroTypeSoap implements Serializable {
    private String _uuid;
    private long _electro_type_id;
    private String _name;

    public ElectroTypeSoap() {
    }

    public static ElectroTypeSoap toSoapModel(ElectroType model) {
        ElectroTypeSoap soapModel = new ElectroTypeSoap();

        soapModel.setUuid(model.getUuid());
        soapModel.setElectro_type_id(model.getElectro_type_id());
        soapModel.setName(model.getName());

        return soapModel;
    }

    public static ElectroTypeSoap[] toSoapModels(ElectroType[] models) {
        ElectroTypeSoap[] soapModels = new ElectroTypeSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static ElectroTypeSoap[][] toSoapModels(ElectroType[][] models) {
        ElectroTypeSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new ElectroTypeSoap[models.length][models[0].length];
        } else {
            soapModels = new ElectroTypeSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static ElectroTypeSoap[] toSoapModels(List<ElectroType> models) {
        List<ElectroTypeSoap> soapModels = new ArrayList<ElectroTypeSoap>(models.size());

        for (ElectroType model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new ElectroTypeSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _electro_type_id;
    }

    public void setPrimaryKey(long pk) {
        setElectro_type_id(pk);
    }

    public String getUuid() {
        return _uuid;
    }

    public void setUuid(String uuid) {
        _uuid = uuid;
    }

    public long getElectro_type_id() {
        return _electro_type_id;
    }

    public void setElectro_type_id(long electro_type_id) {
        _electro_type_id = electro_type_id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }
}
