package ru.hmel.util;

import java.util.Objects;

public class CsvImporter {
    static final String[] EmployeeHeader = {"id", "lastname", "firstname", "patronymic", "birthdate", "position", "gender"};
    static final String[] ElectronicsHeader = {"id", "name", "etype", "price", "count", "inStock", "archive", "description"};
    static final String[] PurchaseHeader = {"id", "electroid", "employeeId", "purchaseDate", "type"};
    static final String[] ElectroTypeHeader = {"id", "name"};
    static final String[] PurchaseTypeHeader = {"id", "name"};
    static final String[] PositionTypeHeader = {"id", "name"};
    static final String[] ElectroEmployeeHeader = {"employeeId", "etype"};

    public enum Entity {
        EMPLOYEE,
        ELECTRONICS,
        PURCHASE,
        ELECTRO_TYPE,
        PURCHASE_TYPE,
        POSITION_TYPE,
        ELECTRO_EMPLOYEE,
        UNKNOWN,
    }


    public static Entity checkDataHeaders(String[] header) {
        int EmployeeValid, ElectronicsValid, PurchaseValid, ElectroTypeValid, PurchaseTypeValid, PositionTypeValid, ElectroEmployeeValid;
        EmployeeValid = ElectronicsValid = PurchaseValid = ElectroTypeValid = PurchaseTypeValid = PositionTypeValid = ElectroEmployeeValid = 0;
        for (int i = 0; i < header.length; i++) {
            if (Objects.equals(header[i], EmployeeHeader[i])) {
                EmployeeValid++;
            }
            if (Objects.equals(header[i], ElectronicsHeader[i])) {
                ElectronicsValid++;
            }
            if (Objects.equals(header[i], PurchaseHeader[i])) {
                PurchaseValid++;
            }
            if (Objects.equals(header[i], ElectroTypeHeader[i])) {
                ElectroTypeValid++;
            }
            if (Objects.equals(header[i], PurchaseTypeHeader[i])) {
                PurchaseTypeValid++;
            }
            if (Objects.equals(header[i], PositionTypeHeader[i])) {
                PositionTypeValid++;
            }
            if (Objects.equals(header[i], ElectroEmployeeHeader[i])) {
                ElectroEmployeeValid++;
            }
        }
        if (EmployeeValid == EmployeeHeader.length) {
            return Entity.EMPLOYEE;
        }
        if (ElectronicsValid == ElectronicsHeader.length) {
            return Entity.ELECTRONICS;
        }
        if (PurchaseValid == PurchaseHeader.length) {
            return Entity.PURCHASE;
        }
        if (ElectroTypeValid == ElectroTypeHeader.length) {
            return Entity.ELECTRO_TYPE;
        }
        if (PurchaseTypeValid == PurchaseTypeHeader.length) {
            return Entity.PURCHASE_TYPE;
        }
        if (PositionTypeValid == PositionTypeHeader.length) {
            return Entity.POSITION_TYPE;
        }
        if (ElectroEmployeeValid == ElectroEmployeeHeader.length) {
            return Entity.ELECTRO_EMPLOYEE;
        }
        return Entity.UNKNOWN;
    }
}
