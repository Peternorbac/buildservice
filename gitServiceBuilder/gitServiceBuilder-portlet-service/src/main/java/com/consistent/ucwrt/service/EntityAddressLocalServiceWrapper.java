package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityAddressLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityAddressLocalService
 * @generated
 */
public class EntityAddressLocalServiceWrapper
    implements EntityAddressLocalService,
        ServiceWrapper<EntityAddressLocalService> {
    private EntityAddressLocalService _entityAddressLocalService;

    public EntityAddressLocalServiceWrapper(
        EntityAddressLocalService entityAddressLocalService) {
        _entityAddressLocalService = entityAddressLocalService;
    }

    /**
    * Adds the entity address to the database. Also notifies the appropriate model listeners.
    *
    * @param entityAddress the entity address
    * @return the entity address that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityAddress addEntityAddress(
        com.consistent.ucwrt.model.EntityAddress entityAddress)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityAddressLocalService.addEntityAddress(entityAddress);
    }

    /**
    * Creates a new entity address with the primary key. Does not add the entity address to the database.
    *
    * @param addressId the primary key for the new entity address
    * @return the new entity address
    */
    @Override
    public com.consistent.ucwrt.model.EntityAddress createEntityAddress(
        int addressId) {
        return _entityAddressLocalService.createEntityAddress(addressId);
    }

    /**
    * Deletes the entity address with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param addressId the primary key of the entity address
    * @return the entity address that was removed
    * @throws PortalException if a entity address with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityAddress deleteEntityAddress(
        int addressId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityAddressLocalService.deleteEntityAddress(addressId);
    }

    /**
    * Deletes the entity address from the database. Also notifies the appropriate model listeners.
    *
    * @param entityAddress the entity address
    * @return the entity address that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityAddress deleteEntityAddress(
        com.consistent.ucwrt.model.EntityAddress entityAddress)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityAddressLocalService.deleteEntityAddress(entityAddress);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _entityAddressLocalService.dynamicQuery();
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
        return _entityAddressLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _entityAddressLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _entityAddressLocalService.dynamicQuery(dynamicQuery, start,
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
        return _entityAddressLocalService.dynamicQueryCount(dynamicQuery);
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
        return _entityAddressLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.consistent.ucwrt.model.EntityAddress fetchEntityAddress(
        int addressId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityAddressLocalService.fetchEntityAddress(addressId);
    }

    /**
    * Returns the entity address with the primary key.
    *
    * @param addressId the primary key of the entity address
    * @return the entity address
    * @throws PortalException if a entity address with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityAddress getEntityAddress(
        int addressId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityAddressLocalService.getEntityAddress(addressId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityAddressLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the entity addresses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity addresses
    * @param end the upper bound of the range of entity addresses (not inclusive)
    * @return the range of entity addresses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.consistent.ucwrt.model.EntityAddress> getEntityAddresses(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityAddressLocalService.getEntityAddresses(start, end);
    }

    /**
    * Returns the number of entity addresses.
    *
    * @return the number of entity addresses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getEntityAddressesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityAddressLocalService.getEntityAddressesCount();
    }

    /**
    * Updates the entity address in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param entityAddress the entity address
    * @return the entity address that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityAddress updateEntityAddress(
        com.consistent.ucwrt.model.EntityAddress entityAddress)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityAddressLocalService.updateEntityAddress(entityAddress);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityAddressLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityAddressLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityAddressLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityAddressLocalService getWrappedEntityAddressLocalService() {
        return _entityAddressLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityAddressLocalService(
        EntityAddressLocalService entityAddressLocalService) {
        _entityAddressLocalService = entityAddressLocalService;
    }

    @Override
    public EntityAddressLocalService getWrappedService() {
        return _entityAddressLocalService;
    }

    @Override
    public void setWrappedService(
        EntityAddressLocalService entityAddressLocalService) {
        _entityAddressLocalService = entityAddressLocalService;
    }
}
