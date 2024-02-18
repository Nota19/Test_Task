package ru.hmel.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link ru.hmel.service.http.PositionTypeServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see ru.hmel.service.http.PositionTypeServiceSoap
 * @generated
 */
public class PositionTypeSoap implements Serializable {
    private String _uuid;
    private long _position_id;
    private String _name;

    public PositionTypeSoap() {
    }

    public static PositionTypeSoap toSoapModel(PositionType model) {
        PositionTypeSoap soapModel = new PositionTypeSoap();

        soapModel.setUuid(model.getUuid());
        soapModel.setPosition_id(model.getPosition_id());
        soapModel.setName(model.getName());

        return soapModel;
    }

    public static PositionTypeSoap[] toSoapModels(PositionType[] models) {
        PositionTypeSoap[] soapModels = new PositionTypeSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static PositionTypeSoap[][] toSoapModels(PositionType[][] models) {
        PositionTypeSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new PositionTypeSoap[models.length][models[0].length];
        } else {
            soapModels = new PositionTypeSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static PositionTypeSoap[] toSoapModels(List<PositionType> models) {
        List<PositionTypeSoap> soapModels = new ArrayList<PositionTypeSoap>(models.size());

        for (PositionType model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new PositionTypeSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _position_id;
    }

    public void setPrimaryKey(long pk) {
        setPosition_id(pk);
    }

    public String getUuid() {
        return _uuid;
    }

    public void setUuid(String uuid) {
        _uuid = uuid;
    }

    public long getPosition_id() {
        return _position_id;
    }

    public void setPosition_id(long position_id) {
        _position_id = position_id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }
}
