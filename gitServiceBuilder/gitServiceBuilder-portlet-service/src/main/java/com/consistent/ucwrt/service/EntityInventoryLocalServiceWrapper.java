package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityInventoryLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityInventoryLocalService
 * @generated
 */
public class EntityInventoryLocalServiceWrapper
    implements EntityInventoryLocalService,
        ServiceWrapper<EntityInventoryLocalService> {
    private EntityInventoryLocalService _entityInventoryLocalService;

    public EntityInventoryLocalServiceWrapper(
        EntityInventoryLocalService entityInventoryLocalService) {
        _entityInventoryLocalService = entityInventoryLocalService;
    }

    /**
    * Adds the entity inventory to the database. Also notifies the appropriate model listeners.
    *
    * @param entityInventory the entity inventory
    * @return the entity inventory that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityInventory addEntityInventory(
        com.consistent.ucwrt.model.EntityInventory entityInventory)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityInventoryLocalService.addEntityInventory(entityInventory);
    }

    /**
    * Creates a new entity inventory with the primary key. Does not add the entity inventory to the database.
    *
    * @param entityInventoryPK the primary key for the new entity inventory
    * @return the new entity inventory
    */
    @Override
    public com.consistent.ucwrt.model.EntityInventory createEntityInventory(
        com.consistent.ucwrt.service.persistence.EntityInventoryPK entityInventoryPK) {
        return _entityInventoryLocalService.createEntityInventory(entityInventoryPK);
    }

    /**
    * Deletes the entity inventory with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param entityInventoryPK the primary key of the entity inventory
    * @return the entity inventory that was removed
    * @throws PortalException if a entity inventory with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityInventory deleteEntityInventory(
        com.consistent.ucwrt.service.persistence.EntityInventoryPK entityInventoryPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityInventoryLocalService.deleteEntityInventory(entityInventoryPK);
    }

    /**
    * Deletes the entity inventory from the database. Also notifies the appropriate model listeners.
    *
    * @param entityInventory the entity inventory
    * @return the entity inventory that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityInventory deleteEntityInventory(
        com.consistent.ucwrt.model.EntityInventory entityInventory)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityInventoryLocalService.deleteEntityInventory(entityInventory);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _entityInventoryLocalService.dynamicQuery();
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
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityInventoryLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _entityInventoryLocalService.dynamicQuery(dynamicQuery, start,
            end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityInventoryLocalService.dynamicQuery(dynamicQuery, start,
            end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityInventoryLocalService.dynamicQueryCount(dynamicQuery);
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
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityInventoryLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.consistent.ucwrt.model.EntityInventory fetchEntityInventory(
        com.consistent.ucwrt.service.persistence.EntityInventoryPK entityInventoryPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityInventoryLocalService.fetchEntityInventory(entityInventoryPK);
    }

    /**
    * Returns the entity inventory with the primary key.
    *
    * @param entityInventoryPK the primary key of the entity inventory
    * @return the entity inventory
    * @throws PortalException if a entity inventory with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityInventory getEntityInventory(
        com.consistent.ucwrt.service.persistence.EntityInventoryPK entityInventoryPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityInventoryLocalService.getEntityInventory(entityInventoryPK);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityInventoryLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the entity inventories.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity inventories
    * @param end the upper bound of the range of entity inventories (not inclusive)
    * @return the range of entity inventories
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.consistent.ucwrt.model.EntityInventory> getEntityInventories(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityInventoryLocalService.getEntityInventories(start, end);
    }

    /**
    * Returns the number of entity inventories.
    *
    * @return the number of entity inventories
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getEntityInventoriesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityInventoryLocalService.getEntityInventoriesCount();
    }

    /**
    * Updates the entity inventory in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param entityInventory the entity inventory
    * @return the entity inventory that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityInventory updateEntityInventory(
        com.consistent.ucwrt.model.EntityInventory entityInventory)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityInventoryLocalService.updateEntityInventory(entityInventory);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityInventoryLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityInventoryLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityInventoryLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityInventoryLocalService getWrappedEntityInventoryLocalService() {
        return _entityInventoryLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityInventoryLocalService(
        EntityInventoryLocalService entityInventoryLocalService) {
        _entityInventoryLocalService = entityInventoryLocalService;
    }

    @Override
    public EntityInventoryLocalService getWrappedService() {
        return _entityInventoryLocalService;
    }

    @Override
    public void setWrappedService(
        EntityInventoryLocalService entityInventoryLocalService) {
        _entityInventoryLocalService = entityInventoryLocalService;
    }
}