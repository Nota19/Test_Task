package ru.hmel.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import ru.hmel.model.ElectroEmployee;

/**
 * The persistence interface for the electro employee service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Hmel Max
 * @see ElectroEmployeePersistenceImpl
 * @see ElectroEmployeeUtil
 * @generated
 */
public interface ElectroEmployeePersistence extends BasePersistence<ElectroEmployee> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link ElectroEmployeeUtil} to access the electro employee persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the electro employees where etype = &#63;.
    *
    * @param etype the etype
    * @return the matching electro employees
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ru.hmel.model.ElectroEmployee> findByelectro_type_id(
        long etype) throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.hmel.model.ElectroEmployee> findByelectro_type_id(
        long etype, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.hmel.model.ElectroEmployee> findByelectro_type_id(
        long etype, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first electro employee in the ordered set where etype = &#63;.
    *
    * @param etype the etype
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching electro employee
    * @throws ru.hmel.NoSuchElectroEmployeeException if a matching electro employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.ElectroEmployee findByelectro_type_id_First(
        long etype,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchElectroEmployeeException;

    /**
    * Returns the first electro employee in the ordered set where etype = &#63;.
    *
    * @param etype the etype
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching electro employee, or <code>null</code> if a matching electro employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.ElectroEmployee fetchByelectro_type_id_First(
        long etype,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last electro employee in the ordered set where etype = &#63;.
    *
    * @param etype the etype
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching electro employee
    * @throws ru.hmel.NoSuchElectroEmployeeException if a matching electro employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.ElectroEmployee findByelectro_type_id_Last(
        long etype,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchElectroEmployeeException;

    /**
    * Returns the last electro employee in the ordered set where etype = &#63;.
    *
    * @param etype the etype
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching electro employee, or <code>null</code> if a matching electro employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.ElectroEmployee fetchByelectro_type_id_Last(
        long etype,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public ru.hmel.model.ElectroEmployee[] findByelectro_type_id_PrevAndNext(
        long electro_employee_id, long etype,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchElectroEmployeeException;

    /**
    * Removes all the electro employees where etype = &#63; from the database.
    *
    * @param etype the etype
    * @throws SystemException if a system exception occurred
    */
    public void removeByelectro_type_id(long etype)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of electro employees where etype = &#63;.
    *
    * @param etype the etype
    * @return the number of matching electro employees
    * @throws SystemException if a system exception occurred
    */
    public int countByelectro_type_id(long etype)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the electro employee in the entity cache if it is enabled.
    *
    * @param electroEmployee the electro employee
    */
    public void cacheResult(ru.hmel.model.ElectroEmployee electroEmployee);

    /**
    * Caches the electro employees in the entity cache if it is enabled.
    *
    * @param electroEmployees the electro employees
    */
    public void cacheResult(
        java.util.List<ru.hmel.model.ElectroEmployee> electroEmployees);

    /**
    * Creates a new electro employee with the primary key. Does not add the electro employee to the database.
    *
    * @param electro_employee_id the primary key for the new electro employee
    * @return the new electro employee
    */
    public ru.hmel.model.ElectroEmployee create(long electro_employee_id);

    /**
    * Removes the electro employee with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param electro_employee_id the primary key of the electro employee
    * @return the electro employee that was removed
    * @throws ru.hmel.NoSuchElectroEmployeeException if a electro employee with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.ElectroEmployee remove(long electro_employee_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchElectroEmployeeException;

    public ru.hmel.model.ElectroEmployee updateImpl(
        ru.hmel.model.ElectroEmployee electroEmployee)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the electro employee with the primary key or throws a {@link ru.hmel.NoSuchElectroEmployeeException} if it could not be found.
    *
    * @param electro_employee_id the primary key of the electro employee
    * @return the electro employee
    * @throws ru.hmel.NoSuchElectroEmployeeException if a electro employee with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.ElectroEmployee findByPrimaryKey(
        long electro_employee_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchElectroEmployeeException;

    /**
    * Returns the electro employee with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param electro_employee_id the primary key of the electro employee
    * @return the electro employee, or <code>null</code> if a electro employee with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.ElectroEmployee fetchByPrimaryKey(
        long electro_employee_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the electro employees.
    *
    * @return the electro employees
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ru.hmel.model.ElectroEmployee> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.hmel.model.ElectroEmployee> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.hmel.model.ElectroEmployee> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the electro employees from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of electro employees.
    *
    * @return the number of electro employees
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
