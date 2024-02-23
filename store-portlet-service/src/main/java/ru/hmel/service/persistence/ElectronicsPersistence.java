package ru.hmel.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import ru.hmel.model.Electronics;

/**
 * The persistence interface for the electronics service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Hmel Max
 * @see ElectronicsPersistenceImpl
 * @see ElectronicsUtil
 * @generated
 */
public interface ElectronicsPersistence extends BasePersistence<Electronics> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link ElectronicsUtil} to access the electronics persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the electronicses where etype = &#63;.
    *
    * @param etype the etype
    * @return the matching electronicses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ru.hmel.model.Electronics> findByelectro_type_id(
        long etype) throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.hmel.model.Electronics> findByelectro_type_id(
        long etype, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.hmel.model.Electronics> findByelectro_type_id(
        long etype, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first electronics in the ordered set where etype = &#63;.
    *
    * @param etype the etype
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching electronics
    * @throws ru.hmel.NoSuchElectronicsException if a matching electronics could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.Electronics findByelectro_type_id_First(long etype,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchElectronicsException;

    /**
    * Returns the first electronics in the ordered set where etype = &#63;.
    *
    * @param etype the etype
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching electronics, or <code>null</code> if a matching electronics could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.Electronics fetchByelectro_type_id_First(long etype,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last electronics in the ordered set where etype = &#63;.
    *
    * @param etype the etype
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching electronics
    * @throws ru.hmel.NoSuchElectronicsException if a matching electronics could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.Electronics findByelectro_type_id_Last(long etype,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchElectronicsException;

    /**
    * Returns the last electronics in the ordered set where etype = &#63;.
    *
    * @param etype the etype
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching electronics, or <code>null</code> if a matching electronics could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.Electronics fetchByelectro_type_id_Last(long etype,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public ru.hmel.model.Electronics[] findByelectro_type_id_PrevAndNext(
        long electronics_id, long etype,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchElectronicsException;

    /**
    * Removes all the electronicses where etype = &#63; from the database.
    *
    * @param etype the etype
    * @throws SystemException if a system exception occurred
    */
    public void removeByelectro_type_id(long etype)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of electronicses where etype = &#63;.
    *
    * @param etype the etype
    * @return the number of matching electronicses
    * @throws SystemException if a system exception occurred
    */
    public int countByelectro_type_id(long etype)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the electronics in the entity cache if it is enabled.
    *
    * @param electronics the electronics
    */
    public void cacheResult(ru.hmel.model.Electronics electronics);

    /**
    * Caches the electronicses in the entity cache if it is enabled.
    *
    * @param electronicses the electronicses
    */
    public void cacheResult(
        java.util.List<ru.hmel.model.Electronics> electronicses);

    /**
    * Creates a new electronics with the primary key. Does not add the electronics to the database.
    *
    * @param electronics_id the primary key for the new electronics
    * @return the new electronics
    */
    public ru.hmel.model.Electronics create(long electronics_id);

    /**
    * Removes the electronics with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param electronics_id the primary key of the electronics
    * @return the electronics that was removed
    * @throws ru.hmel.NoSuchElectronicsException if a electronics with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.Electronics remove(long electronics_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchElectronicsException;

    public ru.hmel.model.Electronics updateImpl(
        ru.hmel.model.Electronics electronics)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the electronics with the primary key or throws a {@link ru.hmel.NoSuchElectronicsException} if it could not be found.
    *
    * @param electronics_id the primary key of the electronics
    * @return the electronics
    * @throws ru.hmel.NoSuchElectronicsException if a electronics with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.Electronics findByPrimaryKey(long electronics_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchElectronicsException;

    /**
    * Returns the electronics with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param electronics_id the primary key of the electronics
    * @return the electronics, or <code>null</code> if a electronics with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.Electronics fetchByPrimaryKey(long electronics_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the electronicses.
    *
    * @return the electronicses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ru.hmel.model.Electronics> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.hmel.model.Electronics> findAll(int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.hmel.model.Electronics> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the electronicses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of electronicses.
    *
    * @return the number of electronicses
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
