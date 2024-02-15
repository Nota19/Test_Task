package ru.hmel.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link ru.hmel.service.http.PurchaseTypeServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see ru.hmel.service.http.PurchaseTypeServiceSoap
 * @generated
 */
public class PurchaseTypeSoap implements Serializable {
    private String _uuid;
    private long _purchase_type_id;
    private String _name;

    public PurchaseTypeSoap() {
    }

    public static PurchaseTypeSoap toSoapModel(PurchaseType model) {
        PurchaseTypeSoap soapModel = new PurchaseTypeSoap();

        soapModel.setUuid(model.getUuid());
        soapModel.setPurchase_type_id(model.getPurchase_type_id());
        soapModel.setName(model.getName());

        return soapModel;
    }

    public static PurchaseTypeSoap[] toSoapModels(PurchaseType[] models) {
        PurchaseTypeSoap[] soapModels = new PurchaseTypeSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static PurchaseTypeSoap[][] toSoapModels(PurchaseType[][] models) {
        PurchaseTypeSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new PurchaseTypeSoap[models.length][models[0].length];
        } else {
            soapModels = new PurchaseTypeSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static PurchaseTypeSoap[] toSoapModels(List<PurchaseType> models) {
        List<PurchaseTypeSoap> soapModels = new ArrayList<PurchaseTypeSoap>(models.size());

        for (PurchaseType model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new PurchaseTypeSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _purchase_type_id;
    }

    public void setPrimaryKey(long pk) {
        setPurchase_type_id(pk);
    }

    public String getUuid() {
        return _uuid;
    }

    public void setUuid(String uuid) {
        _uuid = uuid;
    }

    public long getPurchase_type_id() {
        return _purchase_type_id;
    }

    public void setPurchase_type_id(long purchase_type_id) {
        _purchase_type_id = purchase_type_id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }
}
