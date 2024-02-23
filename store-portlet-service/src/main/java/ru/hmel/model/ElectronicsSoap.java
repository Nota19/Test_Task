package ru.hmel.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link ru.hmel.service.http.ElectronicsServiceSoap}.
 *
 * @author Hmel Max
 * @see ru.hmel.service.http.ElectronicsServiceSoap
 * @generated
 */
public class ElectronicsSoap implements Serializable {
    private long _electronics_id;
    private String _name;
    private long _etype;
    private long _price;
    private long _count;
    private boolean _inStock;
    private boolean _archive;
    private String _description;

    public ElectronicsSoap() {
    }

    public static ElectronicsSoap toSoapModel(Electronics model) {
        ElectronicsSoap soapModel = new ElectronicsSoap();

        soapModel.setElectronics_id(model.getElectronics_id());
        soapModel.setName(model.getName());
        soapModel.setEtype(model.getEtype());
        soapModel.setPrice(model.getPrice());
        soapModel.setCount(model.getCount());
        soapModel.setInStock(model.getInStock());
        soapModel.setArchive(model.getArchive());
        soapModel.setDescription(model.getDescription());

        return soapModel;
    }

    public static ElectronicsSoap[] toSoapModels(Electronics[] models) {
        ElectronicsSoap[] soapModels = new ElectronicsSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static ElectronicsSoap[][] toSoapModels(Electronics[][] models) {
        ElectronicsSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new ElectronicsSoap[models.length][models[0].length];
        } else {
            soapModels = new ElectronicsSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static ElectronicsSoap[] toSoapModels(List<Electronics> models) {
        List<ElectronicsSoap> soapModels = new ArrayList<ElectronicsSoap>(models.size());

        for (Electronics model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new ElectronicsSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _electronics_id;
    }

    public void setPrimaryKey(long pk) {
        setElectronics_id(pk);
    }

    public long getElectronics_id() {
        return _electronics_id;
    }

    public void setElectronics_id(long electronics_id) {
        _electronics_id = electronics_id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public long getEtype() {
        return _etype;
    }

    public void setEtype(long etype) {
        _etype = etype;
    }

    public long getPrice() {
        return _price;
    }

    public void setPrice(long price) {
        _price = price;
    }

    public long getCount() {
        return _count;
    }

    public void setCount(long count) {
        _count = count;
    }

    public boolean getInStock() {
        return _inStock;
    }

    public boolean isInStock() {
        return _inStock;
    }

    public void setInStock(boolean inStock) {
        _inStock = inStock;
    }

    public boolean getArchive() {
        return _archive;
    }

    public boolean isArchive() {
        return _archive;
    }

    public void setArchive(boolean archive) {
        _archive = archive;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }
}
