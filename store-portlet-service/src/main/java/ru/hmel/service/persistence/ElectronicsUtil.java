package ru.hmel.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import ru.hmel.model.Electronics;

import java.util.List;

/**
 * The persistence utility for the electronics service. This utility wraps {@link ElectronicsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Hmel Max
 * @see ElectronicsPersistence
 * @see ElectronicsPersistenceImpl
 * @generated
 */
public class ElectronicsUtil {
    private static ElectronicsPersistence _persistence;

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
    public static void clearCache(Electronics electronics) {
        getPersistence().clearCache(electronics);
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
    public static List<Electronics> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Electronics> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Electronics> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Electronics update(Electronics electronics)
        throws SystemException {
        return getPersistence().update(electronics);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Electronics update(Electronics electronics,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(electronics, serviceContext);
    }

    /**
    * Returns all the electronicses where etype = &#63;.
    *
    * @param etype the etype
    * @return the matching electronicses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.hmel.model.Electronics> findByelectro_type_id(
        long etype) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByelectro_type_id(etype);
    }

    /**
    * Returns a range of all the electronicses where etype = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.ElectronicsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param etype the etype
    * @param start the lower bound of the range of electronicses
    * @param end the upper bound of the range of electronicses (not inclusive)
    * @return the range of matching electronicses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.hmel.model.Electronics> findByelectro_type_id(
        long etype, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByelectro_type_id(etype, start, end);
    }

    /**
    * Returns an ordered range of all the electronicses where etype = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.ElectronicsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param etype the etype
    * @param start the lower bound of the range of electronicses
    * @param end the upper bound of the range of electronicses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching electronicses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.hmel.model.Electronics> findByelectro_type_id(
        long etype, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByelectro_type_id(etype, start, end, orderByComparator);
    }

    /**
    * Returns the first electronics in the ordered set where etype = &#63;.
    *
    * @param etype the etype
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching electronics
    * @throws ru.hmel.NoSuchElectronicsException if a matching electronics could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.Electronics findByelectro_type_id_First(
        long etype,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchElectronicsException {
        return getPersistence()
                   .findByelectro_type_id_First(etype, orderByComparator);
    }

    /**
    * Returns the first electronics in the ordered set where etype = &#63;.
    *
    * @param etype the etype
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching electronics, or <code>null</code> if a matching electronics could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.Electronics fetchByelectro_type_id_First(
        long etype,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByelectro_type_id_First(etype, orderByComparator);
    }

    /**
    * Returns the last electronics in the ordered set where etype = &#63;.
    *
    * @param etype the etype
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching electronics
    * @throws ru.hmel.NoSuchElectronicsException if a matching electronics could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.Electronics findByelectro_type_id_Last(
        long etype,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchElectronicsException {
        return getPersistence()
                   .findByelectro_type_id_Last(etype, orderByComparator);
    }

    /**
    * Returns the last electronics in the ordered set where etype = &#63;.
    *
    * @param etype the etype
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching electronics, or <code>null</code> if a matching electronics could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.Electronics fetchByelectro_type_id_Last(
        long etype,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByelectro_type_id_Last(etype, orderByComparator);
    }

    /**
    * Returns the electronicses before and after the current electronics in the ordered set where etype = &#63;.
    *
    * @param electronics_id the primary key of the current electronics
    * @param etype the etype
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next electronics
    * @throws ru.hmel.NoSuchElectronicsException if a electronics with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.Electronics[] findByelectro_type_id_PrevAndNext(
        long electronics_id, long etype,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchElectronicsException {
        return getPersistence()
                   .findByelectro_type_id_PrevAndNext(electronics_id, etype,
            orderByComparator);
    }

    /**
    * Removes all the electronicses where etype = &#63; from the database.
    *
    * @param etype the etype
    * @throws SystemException if a system exception occurred
    */
    public static void removeByelectro_type_id(long etype)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByelectro_type_id(etype);
    }

    /**
    * Returns the number of electronicses where etype = &#63;.
    *
    * @param etype the etype
    * @return the number of matching electronicses
    * @throws SystemException if a system exception occurred
    */
    public static int countByelectro_type_id(long etype)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByelectro_type_id(etype);
    }

    /**
    * Caches the electronics in the entity cache if it is enabled.
    *
    * @param electronics the electronics
    */
    public static void cacheResult(ru.hmel.model.Electronics electronics) {
        getPersistence().cacheResult(electronics);
    }

    /**
    * Caches the electronicses in the entity cache if it is enabled.
    *
    * @param electronicses the electronicses
    */
    public static void cacheResult(
        java.util.List<ru.hmel.model.Electronics> electronicses) {
        getPersistence().cacheResult(electronicses);
    }

    /**
    * Creates a new electronics with the primary key. Does not add the electronics to the database.
    *
    * @param electronics_id the primary key for the new electronics
    * @return the new electronics
    */
    public static ru.hmel.model.Electronics create(long electronics_id) {
        return getPersistence().create(electronics_id);
    }

    /**
    * Removes the electronics with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param electronics_id the primary key of the electronics
    * @return the electronics that was removed
    * @throws ru.hmel.NoSuchElectronicsException if a electronics with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.Electronics remove(long electronics_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchElectronicsException {
        return getPersistence().remove(electronics_id);
    }

    public static ru.hmel.model.Electronics updateImpl(
        ru.hmel.model.Electronics electronics)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(electronics);
    }

    /**
    * Returns the electronics with the primary key or throws a {@link ru.hmel.NoSuchElectronicsException} if it could not be found.
    *
    * @param electronics_id the primary key of the electronics
    * @return the electronics
    * @throws ru.hmel.NoSuchElectronicsException if a electronics with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.Electronics findByPrimaryKey(
        long electronics_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchElectronicsException {
        return getPersistence().findByPrimaryKey(electronics_id);
    }

    /**
    * Returns the electronics with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param electronics_id the primary key of the electronics
    * @return the electronics, or <code>null</code> if a electronics with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.hmel.model.Electronics fetchByPrimaryKey(
        long electronics_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(electronics_id);
    }

    /**
    * Returns all the electronicses.
    *
    * @return the electronicses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.hmel.model.Electronics> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the electronicses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.ElectronicsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of electronicses
    * @param end the upper bound of the range of electronicses (not inclusive)
    * @return the range of electronicses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.hmel.model.Electronics> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the electronicses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.ElectronicsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of electronicses
    * @param end the upper bound of the range of electronicses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of electronicses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.hmel.model.Electronics> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the electronicses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of electronicses.
    *
    * @return the number of electronicses
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static ElectronicsPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (ElectronicsPersistence) PortletBeanLocatorUtil.locate(ru.hmel.service.ClpSerializer.getServletContextName(),
                    ElectronicsPersistence.class.getName());

            ReferenceRegistry.registerReference(ElectronicsUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(ElectronicsPersistence persistence) {
    }
}
