package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityEmploymentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityEmploymentLocalService
 * @generated
 */
public class EntityEmploymentLocalServiceWrapper
    implements EntityEmploymentLocalService,
        ServiceWrapper<EntityEmploymentLocalService> {
    private EntityEmploymentLocalService _entityEmploymentLocalService;

    public EntityEmploymentLocalServiceWrapper(
        EntityEmploymentLocalService entityEmploymentLocalService) {
        _entityEmploymentLocalService = entityEmploymentLocalService;
    }

    /**
    * Adds the entity employment to the database. Also notifies the appropriate model listeners.
    *
    * @param entityEmployment the entity employment
    * @return the entity employment that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityEmployment addEntityEmployment(
        com.consistent.ucwrt.model.EntityEmployment entityEmployment)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityEmploymentLocalService.addEntityEmployment(entityEmployment);
    }

    /**
    * Creates a new entity employment with the primary key. Does not add the entity employment to the database.
    *
    * @param entityEmploymentPK the primary key for the new entity employment
    * @return the new entity employment
    */
    @Override
    public com.consistent.ucwrt.model.EntityEmployment createEntityEmployment(
        com.consistent.ucwrt.service.persistence.EntityEmploymentPK entityEmploymentPK) {
        return _entityEmploymentLocalService.createEntityEmployment(entityEmploymentPK);
    }

    /**
    * Deletes the entity employment with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param entityEmploymentPK the primary key of the entity employment
    * @return the entity employment that was removed
    * @throws PortalException if a entity employment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityEmployment deleteEntityEmployment(
        com.consistent.ucwrt.service.persistence.EntityEmploymentPK entityEmploymentPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityEmploymentLocalService.deleteEntityEmployment(entityEmploymentPK);
    }

    /**
    * Deletes the entity employment from the database. Also notifies the appropriate model listeners.
    *
    * @param entityEmployment the entity employment
    * @return the entity employment that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityEmployment deleteEntityEmployment(
        com.consistent.ucwrt.model.EntityEmployment entityEmployment)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityEmploymentLocalService.deleteEntityEmployment(entityEmployment);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _entityEmploymentLocalService.dynamicQuery();
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
        return _entityEmploymentLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityEmploymentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _entityEmploymentLocalService.dynamicQuery(dynamicQuery, start,
            end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityEmploymentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _entityEmploymentLocalService.dynamicQuery(dynamicQuery, start,
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
        return _entityEmploymentLocalService.dynamicQueryCount(dynamicQuery);
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
        return _entityEmploymentLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.consistent.ucwrt.model.EntityEmployment fetchEntityEmployment(
        com.consistent.ucwrt.service.persistence.EntityEmploymentPK entityEmploymentPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityEmploymentLocalService.fetchEntityEmployment(entityEmploymentPK);
    }

    /**
    * Returns the entity employment with the primary key.
    *
    * @param entityEmploymentPK the primary key of the entity employment
    * @return the entity employment
    * @throws PortalException if a entity employment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityEmployment getEntityEmployment(
        com.consistent.ucwrt.service.persistence.EntityEmploymentPK entityEmploymentPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityEmploymentLocalService.getEntityEmployment(entityEmploymentPK);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityEmploymentLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the entity employments.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityEmploymentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity employments
    * @param end the upper bound of the range of entity employments (not inclusive)
    * @return the range of entity employments
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.consistent.ucwrt.model.EntityEmployment> getEntityEmployments(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityEmploymentLocalService.getEntityEmployments(start, end);
    }

    /**
    * Returns the number of entity employments.
    *
    * @return the number of entity employments
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getEntityEmploymentsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityEmploymentLocalService.getEntityEmploymentsCount();
    }

    /**
    * Updates the entity employment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param entityEmployment the entity employment
    * @return the entity employment that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityEmployment updateEntityEmployment(
        com.consistent.ucwrt.model.EntityEmployment entityEmployment)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityEmploymentLocalService.updateEntityEmployment(entityEmployment);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityEmploymentLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityEmploymentLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityEmploymentLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityEmploymentLocalService getWrappedEntityEmploymentLocalService() {
        return _entityEmploymentLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityEmploymentLocalService(
        EntityEmploymentLocalService entityEmploymentLocalService) {
        _entityEmploymentLocalService = entityEmploymentLocalService;
    }

    @Override
    public EntityEmploymentLocalService getWrappedService() {
        return _entityEmploymentLocalService;
    }

    @Override
    public void setWrappedService(
        EntityEmploymentLocalService entityEmploymentLocalService) {
        _entityEmploymentLocalService = entityEmploymentLocalService;
    }
}
