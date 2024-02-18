package ru.hmel.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link ru.hmel.service.http.EmployeeServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see ru.hmel.service.http.EmployeeServiceSoap
 * @generated
 */
public class EmployeeSoap implements Serializable {
    private String _uuid;
    private long _employee_id;
    private String _lastname;
    private String _firstname;
    private String _patronymic;
    private Date _birthdate;
    private long _position;
    private boolean _gender;

    public EmployeeSoap() {
    }

    public static EmployeeSoap toSoapModel(Employee model) {
        EmployeeSoap soapModel = new EmployeeSoap();

        soapModel.setUuid(model.getUuid());
        soapModel.setEmployee_id(model.getEmployee_id());
        soapModel.setLastname(model.getLastname());
        soapModel.setFirstname(model.getFirstname());
        soapModel.setPatronymic(model.getPatronymic());
        soapModel.setBirthdate(model.getBirthdate());
        soapModel.setPosition(model.getPosition());
        soapModel.setGender(model.getGender());

        return soapModel;
    }

    public static EmployeeSoap[] toSoapModels(Employee[] models) {
        EmployeeSoap[] soapModels = new EmployeeSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EmployeeSoap[][] toSoapModels(Employee[][] models) {
        EmployeeSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EmployeeSoap[models.length][models[0].length];
        } else {
            soapModels = new EmployeeSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EmployeeSoap[] toSoapModels(List<Employee> models) {
        List<EmployeeSoap> soapModels = new ArrayList<EmployeeSoap>(models.size());

        for (Employee model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EmployeeSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _employee_id;
    }

    public void setPrimaryKey(long pk) {
        setEmployee_id(pk);
    }

    public String getUuid() {
        return _uuid;
    }

    public void setUuid(String uuid) {
        _uuid = uuid;
    }

    public long getEmployee_id() {
        return _employee_id;
    }

    public void setEmployee_id(long employee_id) {
        _employee_id = employee_id;
    }

    public String getLastname() {
        return _lastname;
    }

    public void setLastname(String lastname) {
        _lastname = lastname;
    }

    public String getFirstname() {
        return _firstname;
    }

    public void setFirstname(String firstname) {
        _firstname = firstname;
    }

    public String getPatronymic() {
        return _patronymic;
    }

    public void setPatronymic(String patronymic) {
        _patronymic = patronymic;
    }

    public Date getBirthdate() {
        return _birthdate;
    }

    public void setBirthdate(Date birthdate) {
        _birthdate = birthdate;
    }

    public long getPosition() {
        return _position;
    }

    public void setPosition(long position) {
        _position = position;
    }

    public boolean getGender() {
        return _gender;
    }

    public boolean isGender() {
        return _gender;
    }

    public void setGender(boolean gender) {
        _gender = gender;
    }
}
