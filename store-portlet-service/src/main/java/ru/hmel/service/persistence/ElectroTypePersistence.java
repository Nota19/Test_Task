package ru.hmel.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import ru.hmel.model.ElectroType;

/**
 * The persistence interface for the electro type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Hmel Max
 * @see ElectroTypePersistenceImpl
 * @see ElectroTypeUtil
 * @generated
 */
public interface ElectroTypePersistence extends BasePersistence<ElectroType> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link ElectroTypeUtil} to access the electro type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the electro type in the entity cache if it is enabled.
    *
    * @param electroType the electro type
    */
    public void cacheResult(ru.hmel.model.ElectroType electroType);

    /**
    * Caches the electro types in the entity cache if it is enabled.
    *
    * @param electroTypes the electro types
    */
    public void cacheResult(
        java.util.List<ru.hmel.model.ElectroType> electroTypes);

    /**
    * Creates a new electro type with the primary key. Does not add the electro type to the database.
    *
    * @param electro_type_id the primary key for the new electro type
    * @return the new electro type
    */
    public ru.hmel.model.ElectroType create(long electro_type_id);

    /**
    * Removes the electro type with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param electro_type_id the primary key of the electro type
    * @return the electro type that was removed
    * @throws ru.hmel.NoSuchElectroTypeException if a electro type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.ElectroType remove(long electro_type_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchElectroTypeException;

    public ru.hmel.model.ElectroType updateImpl(
        ru.hmel.model.ElectroType electroType)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the electro type with the primary key or throws a {@link ru.hmel.NoSuchElectroTypeException} if it could not be found.
    *
    * @param electro_type_id the primary key of the electro type
    * @return the electro type
    * @throws ru.hmel.NoSuchElectroTypeException if a electro type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.ElectroType findByPrimaryKey(long electro_type_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.hmel.NoSuchElectroTypeException;

    /**
    * Returns the electro type with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param electro_type_id the primary key of the electro type
    * @return the electro type, or <code>null</code> if a electro type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.hmel.model.ElectroType fetchByPrimaryKey(long electro_type_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the electro types.
    *
    * @return the electro types
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ru.hmel.model.ElectroType> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the electro types.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.ElectroTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of electro types
    * @param end the upper bound of the range of electro types (not inclusive)
    * @return the range of electro types
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ru.hmel.model.ElectroType> findAll(int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the electro types.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.ElectroTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of electro types
    * @param end the upper bound of the range of electro types (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of electro types
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ru.hmel.model.ElectroType> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the electro types from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of electro types.
    *
    * @return the number of electro types
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
