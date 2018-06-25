package com.consistent.ucwrt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityYearModelClassLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityYearModelClassLocalService
 * @generated
 */
public class EntityYearModelClassLocalServiceWrapper
    implements EntityYearModelClassLocalService,
        ServiceWrapper<EntityYearModelClassLocalService> {
    private EntityYearModelClassLocalService _entityYearModelClassLocalService;

    public EntityYearModelClassLocalServiceWrapper(
        EntityYearModelClassLocalService entityYearModelClassLocalService) {
        _entityYearModelClassLocalService = entityYearModelClassLocalService;
    }

    /**
    * Adds the entity year model class to the database. Also notifies the appropriate model listeners.
    *
    * @param entityYearModelClass the entity year model class
    * @return the entity year model class that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityYearModelClass addEntityYearModelClass(
        com.consistent.ucwrt.model.EntityYearModelClass entityYearModelClass)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityYearModelClassLocalService.addEntityYearModelClass(entityYearModelClass);
    }

    /**
    * Creates a new entity year model class with the primary key. Does not add the entity year model class to the database.
    *
    * @param entityYearModelClassPK the primary key for the new entity year model class
    * @return the new entity year model class
    */
    @Override
    public com.consistent.ucwrt.model.EntityYearModelClass createEntityYearModelClass(
        com.consistent.ucwrt.service.persistence.EntityYearModelClassPK entityYearModelClassPK) {
        return _entityYearModelClassLocalService.createEntityYearModelClass(entityYearModelClassPK);
    }

    /**
    * Deletes the entity year model class with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param entityYearModelClassPK the primary key of the entity year model class
    * @return the entity year model class that was removed
    * @throws PortalException if a entity year model class with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityYearModelClass deleteEntityYearModelClass(
        com.consistent.ucwrt.service.persistence.EntityYearModelClassPK entityYearModelClassPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityYearModelClassLocalService.deleteEntityYearModelClass(entityYearModelClassPK);
    }

    /**
    * Deletes the entity year model class from the database. Also notifies the appropriate model listeners.
    *
    * @param entityYearModelClass the entity year model class
    * @return the entity year model class that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityYearModelClass deleteEntityYearModelClass(
        com.consistent.ucwrt.model.EntityYearModelClass entityYearModelClass)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityYearModelClassLocalService.deleteEntityYearModelClass(entityYearModelClass);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _entityYearModelClassLocalService.dynamicQuery();
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
        return _entityYearModelClassLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityYearModelClassModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _entityYearModelClassLocalService.dynamicQuery(dynamicQuery,
            start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityYearModelClassModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _entityYearModelClassLocalService.dynamicQuery(dynamicQuery,
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
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityYearModelClassLocalService.dynamicQueryCount(dynamicQuery);
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
        return _entityYearModelClassLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.consistent.ucwrt.model.EntityYearModelClass fetchEntityYearModelClass(
        com.consistent.ucwrt.service.persistence.EntityYearModelClassPK entityYearModelClassPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityYearModelClassLocalService.fetchEntityYearModelClass(entityYearModelClassPK);
    }

    /**
    * Returns the entity year model class with the primary key.
    *
    * @param entityYearModelClassPK the primary key of the entity year model class
    * @return the entity year model class
    * @throws PortalException if a entity year model class with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityYearModelClass getEntityYearModelClass(
        com.consistent.ucwrt.service.persistence.EntityYearModelClassPK entityYearModelClassPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityYearModelClassLocalService.getEntityYearModelClass(entityYearModelClassPK);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityYearModelClassLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the entity year model classes.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityYearModelClassModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity year model classes
    * @param end the upper bound of the range of entity year model classes (not inclusive)
    * @return the range of entity year model classes
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.consistent.ucwrt.model.EntityYearModelClass> getEntityYearModelClasses(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityYearModelClassLocalService.getEntityYearModelClasses(start,
            end);
    }

    /**
    * Returns the number of entity year model classes.
    *
    * @return the number of entity year model classes
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getEntityYearModelClassesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityYearModelClassLocalService.getEntityYearModelClassesCount();
    }

    /**
    * Updates the entity year model class in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param entityYearModelClass the entity year model class
    * @return the entity year model class that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.consistent.ucwrt.model.EntityYearModelClass updateEntityYearModelClass(
        com.consistent.ucwrt.model.EntityYearModelClass entityYearModelClass)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityYearModelClassLocalService.updateEntityYearModelClass(entityYearModelClass);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityYearModelClassLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityYearModelClassLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityYearModelClassLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityYearModelClassLocalService getWrappedEntityYearModelClassLocalService() {
        return _entityYearModelClassLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityYearModelClassLocalService(
        EntityYearModelClassLocalService entityYearModelClassLocalService) {
        _entityYearModelClassLocalService = entityYearModelClassLocalService;
    }

    @Override
    public EntityYearModelClassLocalService getWrappedService() {
        return _entityYearModelClassLocalService;
    }

    @Override
    public void setWrappedService(
        EntityYearModelClassLocalService entityYearModelClassLocalService) {
        _entityYearModelClassLocalService = entityYearModelClassLocalService;
    }
}
