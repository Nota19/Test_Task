package ru.hmel.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import ru.hmel.model.ElectroEmployee;

import java.util.List;

/**
 * The persistence utility for the electro employee service. This utility wraps {@link ElectroEmployeePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Hmel Max
 * @see ElectroEmployeePersistence
 * @see ElectroEmployeePersistenceImpl
 * @generated
 */
public class ElectroEmployeeUtil {
    private static ElectroEmployeePersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(ElectroEmployee electroEmployee) {
        getPersistence().clearCache(electroEmployee);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<ElectroEmployee> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<ElectroEmployee> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<ElectroEmployee> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static ElectroEmployee update(ElectroEmployee electroEmployee)
        throws SystemException {
        return getPersistence().update(electroEmployee);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static ElectroEmployee update(ElectroEmployee electroEmployee,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(electroEmployee, serviceContext);
    }

    /**
    * Returns all the electro employees where etype = &#63;.
    *
    * @param etype the etype
    * @return the matching electro employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.hmel.model.ElectroEmployee> findByelectro_type_id(
        long etype) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByelectro_type_id(etype);
    }

    /**
    * Returns a range of all the electro employees where etype = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.ElectroEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param etype the etype
    * @param start the lower bound of the range of electro employees
    * @param end the upper bound of the range of electro employees (not inclusive)
    * @return the range of matching electro employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.hmel.model.ElectroEmployee> findByelectro_type_id(
        long etype, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByelectro_type_id(etype, start, end);
    }

    /**
    * Returns an ordered range of all the electro employees where etype = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.ElectroEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param etype the etype
    * @param start the lower bound of the range of electro employees
    * @param end the upper bound of the range of electro employees (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching electro employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.hmel.model.ElectroEmployee> findByelectro_type_id(
        long etype, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByelectro_type_id(etype, start, end, orderByComparator);
    }

    /**
    * Returns the first electro employee in the ordered set where etype = &#63;.
    *
    * @param etype the etype
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching electro employee
    * @throws ru.hmel.NoSuchElectroEmployeeException if a matching electro employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.ElectroEmployee findByelectro_type_id_First(
        long etype,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchElectroEmployeeException {
        return getPersistence()
                   .findByelectro_type_id_First(etype, orderByComparator);
    }

    /**
    * Returns the first electro employee in the ordered set where etype = &#63;.
    *
    * @param etype the etype
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching electro employee, or <code>null</code> if a matching electro employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.ElectroEmployee fetchByelectro_type_id_First(
        long etype,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByelectro_type_id_First(etype, orderByComparator);
    }

    /**
    * Returns the last electro employee in the ordered set where etype = &#63;.
    *
    * @param etype the etype
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching electro employee
    * @throws ru.hmel.NoSuchElectroEmployeeException if a matching electro employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.ElectroEmployee findByelectro_type_id_Last(
        long etype,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchElectroEmployeeException {
        return getPersistence()
                   .findByelectro_type_id_Last(etype, orderByComparator);
    }

    /**
    * Returns the last electro employee in the ordered set where etype = &#63;.
    *
    * @param etype the etype
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching electro employee, or <code>null</code> if a matching electro employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.ElectroEmployee fetchByelectro_type_id_Last(
        long etype,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByelectro_type_id_Last(etype, orderByComparator);
    }

    /**
    * Returns the electro employees before and after the current electro employee in the ordered set where etype = &#63;.
    *
    * @param electro_employee_id the primary key of the current electro employee
    * @param etype the etype
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next electro employee
    * @throws ru.hmel.NoSuchElectroEmployeeException if a electro employee with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.ElectroEmployee[] findByelectro_type_id_PrevAndNext(
        long electro_employee_id, long etype,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchElectroEmployeeException {
        return getPersistence()
                   .findByelectro_type_id_PrevAndNext(electro_employee_id,
            etype, orderByComparator);
    }

    /**
    * Removes all the electro employees where etype = &#63; from the database.
    *
    * @param etype the etype
    * @throws SystemException if a system exception occurred
    */
    public static void removeByelectro_type_id(long etype)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByelectro_type_id(etype);
    }

    /**
    * Returns the number of electro employees where etype = &#63;.
    *
    * @param etype the etype
    * @return the number of matching electro employees
    * @throws SystemException if a system exception occurred
    */
    public static int countByelectro_type_id(long etype)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByelectro_type_id(etype);
    }

    /**
    * Caches the electro employee in the entity cache if it is enabled.
    *
    * @param electroEmployee the electro employee
    */
    public static void cacheResult(
        ru.hmel.model.ElectroEmployee electroEmployee) {
        getPersistence().cacheResult(electroEmployee);
    }

    /**
    * Caches the electro employees in the entity cache if it is enabled.
    *
    * @param electroEmployees the electro employees
    */
    public static void cacheResult(
        java.util.List<ru.hmel.model.ElectroEmployee> electroEmployees) {
        getPersistence().cacheResult(electroEmployees);
    }

    /**
    * Creates a new electro employee with the primary key. Does not add the electro employee to the database.
    *
    * @param electro_employee_id the primary key for the new electro employee
    * @return the new electro employee
    */
    public static ru.hmel.model.ElectroEmployee create(long electro_employee_id) {
        return getPersistence().create(electro_employee_id);
    }

    /**
    * Removes the electro employee with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param electro_employee_id the primary key of the electro employee
    * @return the electro employee that was removed
    * @throws ru.hmel.NoSuchElectroEmployeeException if a electro employee with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.ElectroEmployee remove(long electro_employee_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchElectroEmployeeException {
        return getPersistence().remove(electro_employee_id);
    }

    public static ru.hmel.model.ElectroEmployee updateImpl(
        ru.hmel.model.ElectroEmployee electroEmployee)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(electroEmployee);
    }

    /**
    * Returns the electro employee with the primary key or throws a {@link ru.hmel.NoSuchElectroEmployeeException} if it could not be found.
    *
    * @param electro_employee_id the primary key of the electro employee
    * @return the electro employee
    * @throws ru.hmel.NoSuchElectroEmployeeException if a electro employee with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.ElectroEmployee findByPrimaryKey(
        long electro_employee_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchElectroEmployeeException {
        return getPersistence().findByPrimaryKey(electro_employee_id);
    }

    /**
    * Returns the electro employee with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param electro_employee_id the primary key of the electro employee
    * @return the electro employee, or <code>null</code> if a electro employee with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.ElectroEmployee fetchByPrimaryKey(
        long electro_employee_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(electro_employee_id);
    }

    /**
    * Returns all the electro employees.
    *
    * @return the electro employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.hmel.model.ElectroEmployee> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the electro employees.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.ElectroEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of electro employees
    * @param end the upper bound of the range of electro employees (not inclusive)
    * @return the range of electro employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.hmel.model.ElectroEmployee> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the electro employees.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.ElectroEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of electro employees
    * @param end the upper bound of the range of electro employees (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of electro employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.hmel.model.ElectroEmployee> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the electro employees from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of electro employees.
    *
    * @return the number of electro employees
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static ElectroEmployeePersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (ElectroEmployeePersistence) PortletBeanLocatorUtil.locate(ru.hmel.service.ClpSerializer.getServletContextName(),
                    ElectroEmployeePersistence.class.getName());

            ReferenceRegistry.registerReference(ElectroEmployeeUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(ElectroEmployeePersistence persistence) {
    }
}
