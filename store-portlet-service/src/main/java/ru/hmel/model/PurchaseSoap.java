package ru.hmel.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link ru.hmel.service.http.PurchaseServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see ru.hmel.service.http.PurchaseServiceSoap
 * @generated
 */
public class PurchaseSoap implements Serializable {
    private String _uuid;
    private long _purchase_id;
    private long _electro_id;
    private long _employee_id;
    private Date _purchaseDate;
    private long _type;

    public PurchaseSoap() {
    }

    public static PurchaseSoap toSoapModel(Purchase model) {
        PurchaseSoap soapModel = new PurchaseSoap();

        soapModel.setUuid(model.getUuid());
        soapModel.setPurchase_id(model.getPurchase_id());
        soapModel.setElectro_id(model.getElectro_id());
        soapModel.setEmployee_id(model.getEmployee_id());
        soapModel.setPurchaseDate(model.getPurchaseDate());
        soapModel.setType(model.getType());

        return soapModel;
    }

    public static PurchaseSoap[] toSoapModels(Purchase[] models) {
        PurchaseSoap[] soapModels = new PurchaseSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static PurchaseSoap[][] toSoapModels(Purchase[][] models) {
        PurchaseSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new PurchaseSoap[models.length][models[0].length];
        } else {
            soapModels = new PurchaseSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static PurchaseSoap[] toSoapModels(List<Purchase> models) {
        List<PurchaseSoap> soapModels = new ArrayList<PurchaseSoap>(models.size());

        for (Purchase model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new PurchaseSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _purchase_id;
    }

    public void setPrimaryKey(long pk) {
        setPurchase_id(pk);
    }

    public String getUuid() {
        return _uuid;
    }

    public void setUuid(String uuid) {
        _uuid = uuid;
    }

    public long getPurchase_id() {
        return _purchase_id;
    }

    public void setPurchase_id(long purchase_id) {
        _purchase_id = purchase_id;
    }

    public long getElectro_id() {
        return _electro_id;
    }

    public void setElectro_id(long electro_id) {
        _electro_id = electro_id;
    }

    public long getEmployee_id() {
        return _employee_id;
    }

    public void setEmployee_id(long employee_id) {
        _employee_id = employee_id;
    }

    public Date getPurchaseDate() {
        return _purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        _purchaseDate = purchaseDate;
    }

    public long getType() {
        return _type;
    }

    public void setType(long type) {
        _type = type;
    }
}
