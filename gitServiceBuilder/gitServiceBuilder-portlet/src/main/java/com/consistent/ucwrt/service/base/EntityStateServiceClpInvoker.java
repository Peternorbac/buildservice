package com.consistent.ucwrt.service.base;

import com.consistent.ucwrt.service.EntityStateServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EntityStateServiceClpInvoker {
    private String _methodName198;
    private String[] _methodParameterTypes198;
    private String _methodName199;
    private String[] _methodParameterTypes199;

    public EntityStateServiceClpInvoker() {
        _methodName198 = "getBeanIdentifier";

        _methodParameterTypes198 = new String[] {  };

        _methodName199 = "setBeanIdentifier";

        _methodParameterTypes199 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName198.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes198, parameterTypes)) {
            return EntityStateServiceUtil.getBeanIdentifier();
        }

        if (_methodName199.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes199, parameterTypes)) {
            EntityStateServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
