package ru.hmel.service.impl;

import ru.hmel.service.base.EmployeeServiceBaseImpl;

/**
 * The implementation of the employee remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link ru.hmel.service.EmployeeService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Hmel Max
 * @see ru.hmel.service.base.EmployeeServiceBaseImpl
 * @see ru.hmel.service.EmployeeServiceUtil
 */
public class EmployeeServiceImpl extends EmployeeServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link ru.hmel.service.EmployeeServiceUtil} to access the employee remote service.
     */
}
