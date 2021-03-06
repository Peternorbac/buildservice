package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityIntervalos;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the entity intervalos service. This utility wraps {@link EntityIntervalosPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityIntervalosPersistence
 * @see EntityIntervalosPersistenceImpl
 * @generated
 */
public class EntityIntervalosUtil {
    private static EntityIntervalosPersistence _persistence;

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
    public static void clearCache(EntityIntervalos entityIntervalos) {
        getPersistence().clearCache(entityIntervalos);
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
    public static List<EntityIntervalos> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<EntityIntervalos> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<EntityIntervalos> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static EntityIntervalos update(EntityIntervalos entityIntervalos)
        throws SystemException {
        return getPersistence().update(entityIntervalos);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static EntityIntervalos update(EntityIntervalos entityIntervalos,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(entityIntervalos, serviceContext);
    }

    /**
    * Caches the entity intervalos in the entity cache if it is enabled.
    *
    * @param entityIntervalos the entity intervalos
    */
    public static void cacheResult(
        com.consistent.ucwrt.model.EntityIntervalos entityIntervalos) {
        getPersistence().cacheResult(entityIntervalos);
    }

    /**
    * Caches the entity intervaloses in the entity cache if it is enabled.
    *
    * @param entityIntervaloses the entity intervaloses
    */
    public static void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityIntervalos> entityIntervaloses) {
        getPersistence().cacheResult(entityIntervaloses);
    }

    /**
    * Creates a new entity intervalos with the primary key. Does not add the entity intervalos to the database.
    *
    * @param entityIntervalosPK the primary key for the new entity intervalos
    * @return the new entity intervalos
    */
    public static com.consistent.ucwrt.model.EntityIntervalos create(
        EntityIntervalosPK entityIntervalosPK) {
        return getPersistence().create(entityIntervalosPK);
    }

    /**
    * Removes the entity intervalos with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param entityIntervalosPK the primary key of the entity intervalos
    * @return the entity intervalos that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityIntervalosException if a entity intervalos with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityIntervalos remove(
        EntityIntervalosPK entityIntervalosPK)
        throws com.consistent.ucwrt.NoSuchEntityIntervalosException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(entityIntervalosPK);
    }

    public static com.consistent.ucwrt.model.EntityIntervalos updateImpl(
        com.consistent.ucwrt.model.EntityIntervalos entityIntervalos)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(entityIntervalos);
    }

    /**
    * Returns the entity intervalos with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityIntervalosException} if it could not be found.
    *
    * @param entityIntervalosPK the primary key of the entity intervalos
    * @return the entity intervalos
    * @throws com.consistent.ucwrt.NoSuchEntityIntervalosException if a entity intervalos with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityIntervalos findByPrimaryKey(
        EntityIntervalosPK entityIntervalosPK)
        throws com.consistent.ucwrt.NoSuchEntityIntervalosException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(entityIntervalosPK);
    }

    /**
    * Returns the entity intervalos with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param entityIntervalosPK the primary key of the entity intervalos
    * @return the entity intervalos, or <code>null</code> if a entity intervalos with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityIntervalos fetchByPrimaryKey(
        EntityIntervalosPK entityIntervalosPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(entityIntervalosPK);
    }

    /**
    * Returns all the entity intervaloses.
    *
    * @return the entity intervaloses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityIntervalos> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.consistent.ucwrt.model.EntityIntervalos> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the entity intervaloses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityIntervalosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity intervaloses
    * @param end the upper bound of the range of entity intervaloses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity intervaloses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityIntervalos> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the entity intervaloses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of entity intervaloses.
    *
    * @return the number of entity intervaloses
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static EntityIntervalosPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (EntityIntervalosPersistence) PortletBeanLocatorUtil.locate(com.consistent.ucwrt.service.ClpSerializer.getServletContextName(),
                    EntityIntervalosPersistence.class.getName());

            ReferenceRegistry.registerReference(EntityIntervalosUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(EntityIntervalosPersistence persistence) {
    }
}
