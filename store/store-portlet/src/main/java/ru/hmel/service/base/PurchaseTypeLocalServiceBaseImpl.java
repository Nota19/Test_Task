package ru.hmel.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import ru.hmel.model.PurchaseType;

import ru.hmel.service.PurchaseTypeLocalService;
import ru.hmel.service.persistence.ElectroEmployeePersistence;
import ru.hmel.service.persistence.ElectroTypePersistence;
import ru.hmel.service.persistence.ElectronicsPersistence;
import ru.hmel.service.persistence.EmployeePersistence;
import ru.hmel.service.persistence.PositionTypePersistence;
import ru.hmel.service.persistence.PurchasePersistence;
import ru.hmel.service.persistence.PurchaseTypePersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the purchase type local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link ru.hmel.service.impl.PurchaseTypeLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ru.hmel.service.impl.PurchaseTypeLocalServiceImpl
 * @see ru.hmel.service.PurchaseTypeLocalServiceUtil
 * @generated
 */
public abstract class PurchaseTypeLocalServiceBaseImpl
    extends BaseLocalServiceImpl implements PurchaseTypeLocalService,
        IdentifiableBean {
    @BeanReference(type = ru.hmel.service.ElectroEmployeeLocalService.class)
    protected ru.hmel.service.ElectroEmployeeLocalService electroEmployeeLocalService;
    @BeanReference(type = ru.hmel.service.ElectroEmployeeService.class)
    protected ru.hmel.service.ElectroEmployeeService electroEmployeeService;
    @BeanReference(type = ElectroEmployeePersistence.class)
    protected ElectroEmployeePersistence electroEmployeePersistence;
    @BeanReference(type = ru.hmel.service.ElectronicsLocalService.class)
    protected ru.hmel.service.ElectronicsLocalService electronicsLocalService;
    @BeanReference(type = ru.hmel.service.ElectronicsService.class)
    protected ru.hmel.service.ElectronicsService electronicsService;
    @BeanReference(type = ElectronicsPersistence.class)
    protected ElectronicsPersistence electronicsPersistence;
    @BeanReference(type = ru.hmel.service.ElectroTypeLocalService.class)
    protected ru.hmel.service.ElectroTypeLocalService electroTypeLocalService;
    @BeanReference(type = ru.hmel.service.ElectroTypeService.class)
    protected ru.hmel.service.ElectroTypeService electroTypeService;
    @BeanReference(type = ElectroTypePersistence.class)
    protected ElectroTypePersistence electroTypePersistence;
    @BeanReference(type = ru.hmel.service.EmployeeLocalService.class)
    protected ru.hmel.service.EmployeeLocalService employeeLocalService;
    @BeanReference(type = ru.hmel.service.EmployeeService.class)
    protected ru.hmel.service.EmployeeService employeeService;
    @BeanReference(type = EmployeePersistence.class)
    protected EmployeePersistence employeePersistence;
    @BeanReference(type = ru.hmel.service.PositionTypeLocalService.class)
    protected ru.hmel.service.PositionTypeLocalService positionTypeLocalService;
    @BeanReference(type = ru.hmel.service.PositionTypeService.class)
    protected ru.hmel.service.PositionTypeService positionTypeService;
    @BeanReference(type = PositionTypePersistence.class)
    protected PositionTypePersistence positionTypePersistence;
    @BeanReference(type = ru.hmel.service.PurchaseLocalService.class)
    protected ru.hmel.service.PurchaseLocalService purchaseLocalService;
    @BeanReference(type = ru.hmel.service.PurchaseService.class)
    protected ru.hmel.service.PurchaseService purchaseService;
    @BeanReference(type = PurchasePersistence.class)
    protected PurchasePersistence purchasePersistence;
    @BeanReference(type = ru.hmel.service.PurchaseTypeLocalService.class)
    protected ru.hmel.service.PurchaseTypeLocalService purchaseTypeLocalService;
    @BeanReference(type = ru.hmel.service.PurchaseTypeService.class)
    protected ru.hmel.service.PurchaseTypeService purchaseTypeService;
    @BeanReference(type = PurchaseTypePersistence.class)
    protected PurchaseTypePersistence purchaseTypePersistence;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private PurchaseTypeLocalServiceClpInvoker _clpInvoker = new PurchaseTypeLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link ru.hmel.service.PurchaseTypeLocalServiceUtil} to access the purchase type local service.
     */

    /**
     * Adds the purchase type to the database. Also notifies the appropriate model listeners.
     *
     * @param purchaseType the purchase type
     * @return the purchase type that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public PurchaseType addPurchaseType(PurchaseType purchaseType)
        throws SystemException {
        purchaseType.setNew(true);

        return purchaseTypePersistence.update(purchaseType);
    }

    /**
     * Creates a new purchase type with the primary key. Does not add the purchase type to the database.
     *
     * @param purchase_type_id the primary key for the new purchase type
     * @return the new purchase type
     */
    @Override
    public PurchaseType createPurchaseType(long purchase_type_id) {
        return purchaseTypePersistence.create(purchase_type_id);
    }

    /**
     * Deletes the purchase type with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param purchase_type_id the primary key of the purchase type
     * @return the purchase type that was removed
     * @throws PortalException if a purchase type with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public PurchaseType deletePurchaseType(long purchase_type_id)
        throws PortalException, SystemException {
        return purchaseTypePersistence.remove(purchase_type_id);
    }

    /**
     * Deletes the purchase type from the database. Also notifies the appropriate model listeners.
     *
     * @param purchaseType the purchase type
     * @return the purchase type that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public PurchaseType deletePurchaseType(PurchaseType purchaseType)
        throws SystemException {
        return purchaseTypePersistence.remove(purchaseType);
    }

    @Override
    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(PurchaseType.class,
            clazz.getClassLoader());
    }

    /**
     * Performs a dynamic query on the database and returns the matching rows.
     *
     * @param dynamicQuery the dynamic query
     * @return the matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return purchaseTypePersistence.findWithDynamicQuery(dynamicQuery);
    }

    /**
     * Performs a dynamic query on the database and returns a range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.PurchaseTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dynamicQuery the dynamic query
     * @param start the lower bound of the range of model instances
     * @param end the upper bound of the range of model instances (not inclusive)
     * @return the range of matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return purchaseTypePersistence.findWithDynamicQuery(dynamicQuery,
            start, end);
    }

    /**
     * Performs a dynamic query on the database and returns an ordered range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.PurchaseTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dynamicQuery the dynamic query
     * @param start the lower bound of the range of model instances
     * @param end the upper bound of the range of model instances (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return purchaseTypePersistence.findWithDynamicQuery(dynamicQuery,
            start, end, orderByComparator);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery)
        throws SystemException {
        return purchaseTypePersistence.countWithDynamicQuery(dynamicQuery);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @param projection the projection to apply to the query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery,
        Projection projection) throws SystemException {
        return purchaseTypePersistence.countWithDynamicQuery(dynamicQuery,
            projection);
    }

    @Override
    public PurchaseType fetchPurchaseType(long purchase_type_id)
        throws SystemException {
        return purchaseTypePersistence.fetchByPrimaryKey(purchase_type_id);
    }

    /**
     * Returns the purchase type with the primary key.
     *
     * @param purchase_type_id the primary key of the purchase type
     * @return the purchase type
     * @throws PortalException if a purchase type with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PurchaseType getPurchaseType(long purchase_type_id)
        throws PortalException, SystemException {
        return purchaseTypePersistence.findByPrimaryKey(purchase_type_id);
    }

    @Override
    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return purchaseTypePersistence.findByPrimaryKey(primaryKeyObj);
    }

    /**
     * Returns a range of all the purchase types.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.hmel.model.impl.PurchaseTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of purchase types
     * @param end the upper bound of the range of purchase types (not inclusive)
     * @return the range of purchase types
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PurchaseType> getPurchaseTypes(int start, int end)
        throws SystemException {
        return purchaseTypePersistence.findAll(start, end);
    }

    /**
     * Returns the number of purchase types.
     *
     * @return the number of purchase types
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getPurchaseTypesCount() throws SystemException {
        return purchaseTypePersistence.countAll();
    }

    /**
     * Updates the purchase type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param purchaseType the purchase type
     * @return the purchase type that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public PurchaseType updatePurchaseType(PurchaseType purchaseType)
        throws SystemException {
        return purchaseTypePersistence.update(purchaseType);
    }

    /**
     * Returns the electro employee local service.
     *
     * @return the electro employee local service
     */
    public ru.hmel.service.ElectroEmployeeLocalService getElectroEmployeeLocalService() {
        return electroEmployeeLocalService;
    }

    /**
     * Sets the electro employee local service.
     *
     * @param electroEmployeeLocalService the electro employee local service
     */
    public void setElectroEmployeeLocalService(
        ru.hmel.service.ElectroEmployeeLocalService electroEmployeeLocalService) {
        this.electroEmployeeLocalService = electroEmployeeLocalService;
    }

    /**
     * Returns the electro employee remote service.
     *
     * @return the electro employee remote service
     */
    public ru.hmel.service.ElectroEmployeeService getElectroEmployeeService() {
        return electroEmployeeService;
    }

    /**
     * Sets the electro employee remote service.
     *
     * @param electroEmployeeService the electro employee remote service
     */
    public void setElectroEmployeeService(
        ru.hmel.service.ElectroEmployeeService electroEmployeeService) {
        this.electroEmployeeService = electroEmployeeService;
    }

    /**
     * Returns the electro employee persistence.
     *
     * @return the electro employee persistence
     */
    public ElectroEmployeePersistence getElectroEmployeePersistence() {
        return electroEmployeePersistence;
    }

    /**
     * Sets the electro employee persistence.
     *
     * @param electroEmployeePersistence the electro employee persistence
     */
    public void setElectroEmployeePersistence(
        ElectroEmployeePersistence electroEmployeePersistence) {
        this.electroEmployeePersistence = electroEmployeePersistence;
    }

    /**
     * Returns the electronics local service.
     *
     * @return the electronics local service
     */
    public ru.hmel.service.ElectronicsLocalService getElectronicsLocalService() {
        return electronicsLocalService;
    }

    /**
     * Sets the electronics local service.
     *
     * @param electronicsLocalService the electronics local service
     */
    public void setElectronicsLocalService(
        ru.hmel.service.ElectronicsLocalService electronicsLocalService) {
        this.electronicsLocalService = electronicsLocalService;
    }

    /**
     * Returns the electronics remote service.
     *
     * @return the electronics remote service
     */
    public ru.hmel.service.ElectronicsService getElectronicsService() {
        return electronicsService;
    }

    /**
     * Sets the electronics remote service.
     *
     * @param electronicsService the electronics remote service
     */
    public void setElectronicsService(
        ru.hmel.service.ElectronicsService electronicsService) {
        this.electronicsService = electronicsService;
    }

    /**
     * Returns the electronics persistence.
     *
     * @return the electronics persistence
     */
    public ElectronicsPersistence getElectronicsPersistence() {
        return electronicsPersistence;
    }

    /**
     * Sets the electronics persistence.
     *
     * @param electronicsPersistence the electronics persistence
     */
    public void setElectronicsPersistence(
        ElectronicsPersistence electronicsPersistence) {
        this.electronicsPersistence = electronicsPersistence;
    }

    /**
     * Returns the electro type local service.
     *
     * @return the electro type local service
     */
    public ru.hmel.service.ElectroTypeLocalService getElectroTypeLocalService() {
        return electroTypeLocalService;
    }

    /**
     * Sets the electro type local service.
     *
     * @param electroTypeLocalService the electro type local service
     */
    public void setElectroTypeLocalService(
        ru.hmel.service.ElectroTypeLocalService electroTypeLocalService) {
        this.electroTypeLocalService = electroTypeLocalService;
    }

    /**
     * Returns the electro type remote service.
     *
     * @return the electro type remote service
     */
    public ru.hmel.service.ElectroTypeService getElectroTypeService() {
        return electroTypeService;
    }

    /**
     * Sets the electro type remote service.
     *
     * @param electroTypeService the electro type remote service
     */
    public void setElectroTypeService(
        ru.hmel.service.ElectroTypeService electroTypeService) {
        this.electroTypeService = electroTypeService;
    }

    /**
     * Returns the electro type persistence.
     *
     * @return the electro type persistence
     */
    public ElectroTypePersistence getElectroTypePersistence() {
        return electroTypePersistence;
    }

    /**
     * Sets the electro type persistence.
     *
     * @param electroTypePersistence the electro type persistence
     */
    public void setElectroTypePersistence(
        ElectroTypePersistence electroTypePersistence) {
        this.electroTypePersistence = electroTypePersistence;
    }

    /**
     * Returns the employee local service.
     *
     * @return the employee local service
     */
    public ru.hmel.service.EmployeeLocalService getEmployeeLocalService() {
        return employeeLocalService;
    }

    /**
     * Sets the employee local service.
     *
     * @param employeeLocalService the employee local service
     */
    public void setEmployeeLocalService(
        ru.hmel.service.EmployeeLocalService employeeLocalService) {
        this.employeeLocalService = employeeLocalService;
    }

    /**
     * Returns the employee remote service.
     *
     * @return the employee remote service
     */
    public ru.hmel.service.EmployeeService getEmployeeService() {
        return employeeService;
    }

    /**
     * Sets the employee remote service.
     *
     * @param employeeService the employee remote service
     */
    public void setEmployeeService(
        ru.hmel.service.EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    /**
     * Returns the employee persistence.
     *
     * @return the employee persistence
     */
    public EmployeePersistence getEmployeePersistence() {
        return employeePersistence;
    }

    /**
     * Sets the employee persistence.
     *
     * @param employeePersistence the employee persistence
     */
    public void setEmployeePersistence(EmployeePersistence employeePersistence) {
        this.employeePersistence = employeePersistence;
    }

    /**
     * Returns the position type local service.
     *
     * @return the position type local service
     */
    public ru.hmel.service.PositionTypeLocalService getPositionTypeLocalService() {
        return positionTypeLocalService;
    }

    /**
     * Sets the position type local service.
     *
     * @param positionTypeLocalService the position type local service
     */
    public void setPositionTypeLocalService(
        ru.hmel.service.PositionTypeLocalService positionTypeLocalService) {
        this.positionTypeLocalService = positionTypeLocalService;
    }

    /**
     * Returns the position type remote service.
     *
     * @return the position type remote service
     */
    public ru.hmel.service.PositionTypeService getPositionTypeService() {
        return positionTypeService;
    }

    /**
     * Sets the position type remote service.
     *
     * @param positionTypeService the position type remote service
     */
    public void setPositionTypeService(
        ru.hmel.service.PositionTypeService positionTypeService) {
        this.positionTypeService = positionTypeService;
    }

    /**
     * Returns the position type persistence.
     *
     * @return the position type persistence
     */
    public PositionTypePersistence getPositionTypePersistence() {
        return positionTypePersistence;
    }

    /**
     * Sets the position type persistence.
     *
     * @param positionTypePersistence the position type persistence
     */
    public void setPositionTypePersistence(
        PositionTypePersistence positionTypePersistence) {
        this.positionTypePersistence = positionTypePersistence;
    }

    /**
     * Returns the purchase local service.
     *
     * @return the purchase local service
     */
    public ru.hmel.service.PurchaseLocalService getPurchaseLocalService() {
        return purchaseLocalService;
    }

    /**
     * Sets the purchase local service.
     *
     * @param purchaseLocalService the purchase local service
     */
    public void setPurchaseLocalService(
        ru.hmel.service.PurchaseLocalService purchaseLocalService) {
        this.purchaseLocalService = purchaseLocalService;
    }

    /**
     * Returns the purchase remote service.
     *
     * @return the purchase remote service
     */
    public ru.hmel.service.PurchaseService getPurchaseService() {
        return purchaseService;
    }

    /**
     * Sets the purchase remote service.
     *
     * @param purchaseService the purchase remote service
     */
    public void setPurchaseService(
        ru.hmel.service.PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    /**
     * Returns the purchase persistence.
     *
     * @return the purchase persistence
     */
    public PurchasePersistence getPurchasePersistence() {
        return purchasePersistence;
    }

    /**
     * Sets the purchase persistence.
     *
     * @param purchasePersistence the purchase persistence
     */
    public void setPurchasePersistence(PurchasePersistence purchasePersistence) {
        this.purchasePersistence = purchasePersistence;
    }

    /**
     * Returns the purchase type local service.
     *
     * @return the purchase type local service
     */
    public ru.hmel.service.PurchaseTypeLocalService getPurchaseTypeLocalService() {
        return purchaseTypeLocalService;
    }

    /**
     * Sets the purchase type local service.
     *
     * @param purchaseTypeLocalService the purchase type local service
     */
    public void setPurchaseTypeLocalService(
        ru.hmel.service.PurchaseTypeLocalService purchaseTypeLocalService) {
        this.purchaseTypeLocalService = purchaseTypeLocalService;
    }

    /**
     * Returns the purchase type remote service.
     *
     * @return the purchase type remote service
     */
    public ru.hmel.service.PurchaseTypeService getPurchaseTypeService() {
        return purchaseTypeService;
    }

    /**
     * Sets the purchase type remote service.
     *
     * @param purchaseTypeService the purchase type remote service
     */
    public void setPurchaseTypeService(
        ru.hmel.service.PurchaseTypeService purchaseTypeService) {
        this.purchaseTypeService = purchaseTypeService;
    }

    /**
     * Returns the purchase type persistence.
     *
     * @return the purchase type persistence
     */
    public PurchaseTypePersistence getPurchaseTypePersistence() {
        return purchaseTypePersistence;
    }

    /**
     * Sets the purchase type persistence.
     *
     * @param purchaseTypePersistence the purchase type persistence
     */
    public void setPurchaseTypePersistence(
        PurchaseTypePersistence purchaseTypePersistence) {
        this.purchaseTypePersistence = purchaseTypePersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();

        PersistedModelLocalServiceRegistryUtil.register("ru.hmel.model.PurchaseType",
            purchaseTypeLocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "ru.hmel.model.PurchaseType");
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    protected Class<?> getModelClass() {
        return PurchaseType.class;
    }

    protected String getModelClassName() {
        return PurchaseType.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = purchaseTypePersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}