package ru.hmel.util;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Objects;

public class CsvImporter {
    static final String[] EmployeeHeader = {"id", "lastname", "firstname", "patronymic", "birthdate", "position", "gender"};
    static final String[] ElectronicsHeader = {"id", "name", "etype", "price", "count", "inStock", "archive", "description"};
    static final String[] PurchaseHeader = {"id", "electroId", "employeeId", "purchaseDate", "type"};
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
        int EmployeeValid, ElectronicsValid, PurchaseValid;
        EmployeeValid = ElectronicsValid = PurchaseValid = 0;

        for (int i = 0; i < header.length-1; i++) {
            System.out.printf("%d: %s\n", i, header[i]);
            if (EmployeeHeader.length > i && header[i].equals(EmployeeHeader[i])) {
                EmployeeValid++;
            }
            if (ElectronicsHeader.length > i && header[i].equals(ElectronicsHeader[i])) {
                ElectronicsValid++;
            }
            if (PurchaseHeader.length > i &&  header[i].equals(PurchaseHeader[i])) {
                PurchaseValid++;
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
        return Entity.UNKNOWN;
    }
}
