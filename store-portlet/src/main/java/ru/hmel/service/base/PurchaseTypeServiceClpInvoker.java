package ru.hmel.service.base;

import ru.hmel.service.PurchaseTypeServiceUtil;

import java.util.Arrays;

/**
 * @author Hmel Max
 * @generated
 */
public class PurchaseTypeServiceClpInvoker {
    private String _methodName54;
    private String[] _methodParameterTypes54;
    private String _methodName55;
    private String[] _methodParameterTypes55;

    public PurchaseTypeServiceClpInvoker() {
        _methodName54 = "getBeanIdentifier";

        _methodParameterTypes54 = new String[] {  };

        _methodName55 = "setBeanIdentifier";

        _methodParameterTypes55 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName54.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes54, parameterTypes)) {
            return PurchaseTypeServiceUtil.getBeanIdentifier();
        }

        if (_methodName55.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes55, parameterTypes)) {
            PurchaseTypeServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
