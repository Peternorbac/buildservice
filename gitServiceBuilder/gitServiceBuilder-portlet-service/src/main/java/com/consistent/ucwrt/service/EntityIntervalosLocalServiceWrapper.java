package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityIntervalosLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityIntervalosLocalService
 * @generated
 */
public class EntityIntervalosLocalServiceWrapper
    implements EntityIntervalosLocalService,
        ServiceWrapper<EntityIntervalosLocalService> {
    private EntityIntervalosLocalService _entityIntervalosLocalService;

    public EntityIntervalosLocalServiceWrapper(
        EntityIntervalosLocalService entityIntervalosLocalService) {
        _entityIntervalosLocalService = entityIntervalosLocalService;
    }

    /**
    * Adds the entity intervalos to the database. Also notifies the appropriate model listeners.
    *
    * @param entityIntervalos the entity intervalos
    * @return the entity intervalos that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityIntervalos addEntityIntervalos(
        com.consistent.ucwrt.model.EntityIntervalos entityIntervalos)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityIntervalosLocalService.addEntityIntervalos(entityIntervalos);
    }

    /**
    * Creates a new entity intervalos with the primary key. Does not add the entity intervalos to the database.
    *
    * @param entityIntervalosPK the primary key for the new entity intervalos
    * @return the new entity intervalos
    */
    @Override
    public com.consistent.ucwrt.model.EntityIntervalos createEntityIntervalos(
        com.consistent.ucwrt.service.persistence.EntityIntervalosPK entityIntervalosPK) {
        return _entityIntervalosLocalService.createEntityIntervalos(entityIntervalosPK);
    }

    /**
    * Deletes the entity intervalos with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param entityIntervalosPK the primary key of the entity intervalos
    * @return the entity intervalos that was removed
    * @throws PortalException if a entity intervalos with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityIntervalos deleteEntityIntervalos(
        com.consistent.ucwrt.service.persistence.EntityIntervalosPK entityIntervalosPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityIntervalosLocalService.deleteEntityIntervalos(entityIntervalosPK);
    }

    /**
    * Deletes the entity intervalos from the database. Also notifies the appropriate model listeners.
    *
    * @param entityIntervalos the entity intervalos
    * @return the entity intervalos that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityIntervalos deleteEntityIntervalos(
        com.consistent.ucwrt.model.EntityIntervalos entityIntervalos)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityIntervalosLocalService.deleteEntityIntervalos(entityIntervalos);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _entityIntervalosLocalService.dynamicQuery();
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
        return _entityIntervalosLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityIntervalosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _entityIntervalosLocalService.dynamicQuery(dynamicQuery, start,
            end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityIntervalosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _entityIntervalosLocalService.dynamicQuery(dynamicQuery, start,
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
        return _entityIntervalosLocalService.dynamicQueryCount(dynamicQuery);
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
        return _entityIntervalosLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.consistent.ucwrt.model.EntityIntervalos fetchEntityIntervalos(
        com.consistent.ucwrt.service.persistence.EntityIntervalosPK entityIntervalosPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityIntervalosLocalService.fetchEntityIntervalos(entityIntervalosPK);
    }

    /**
    * Returns the entity intervalos with the primary key.
    *
    * @param entityIntervalosPK the primary key of the entity intervalos
    * @return the entity intervalos
    * @throws PortalException if a entity intervalos with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityIntervalos getEntityIntervalos(
        com.consistent.ucwrt.service.persistence.EntityIntervalosPK entityIntervalosPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityIntervalosLocalService.getEntityIntervalos(entityIntervalosPK);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityIntervalosLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the entity intervaloses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityIntervalosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity intervaloses
    * @param end the upper bound of the range of entity intervaloses (not inclusive)
    * @return the range of entity intervaloses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.consistent.ucwrt.model.EntityIntervalos> getEntityIntervaloses(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityIntervalosLocalService.getEntityIntervaloses(start, end);
    }

    /**
    * Returns the number of entity intervaloses.
    *
    * @return the number of entity intervaloses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getEntityIntervalosesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityIntervalosLocalService.getEntityIntervalosesCount();
    }

    /**
    * Updates the entity intervalos in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param entityIntervalos the entity intervalos
    * @return the entity intervalos that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityIntervalos updateEntityIntervalos(
        com.consistent.ucwrt.model.EntityIntervalos entityIntervalos)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityIntervalosLocalService.updateEntityIntervalos(entityIntervalos);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityIntervalosLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityIntervalosLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityIntervalosLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityIntervalosLocalService getWrappedEntityIntervalosLocalService() {
        return _entityIntervalosLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityIntervalosLocalService(
        EntityIntervalosLocalService entityIntervalosLocalService) {
        _entityIntervalosLocalService = entityIntervalosLocalService;
    }

    @Override
    public EntityIntervalosLocalService getWrappedService() {
        return _entityIntervalosLocalService;
    }

    @Override
    public void setWrappedService(
        EntityIntervalosLocalService entityIntervalosLocalService) {
        _entityIntervalosLocalService = entityIntervalosLocalService;
    }
}