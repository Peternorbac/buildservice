package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.model.EntityWayToPay;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the entity way to pay service. This utility wraps {@link EntityWayToPayPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityWayToPayPersistence
 * @see EntityWayToPayPersistenceImpl
 * @generated
 */
public class EntityWayToPayUtil {
    private static EntityWayToPayPersistence _persistence;

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
    public static void clearCache(EntityWayToPay entityWayToPay) {
        getPersistence().clearCache(entityWayToPay);
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
    public static List<EntityWayToPay> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<EntityWayToPay> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<EntityWayToPay> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static EntityWayToPay update(EntityWayToPay entityWayToPay)
        throws SystemException {
        return getPersistence().update(entityWayToPay);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static EntityWayToPay update(EntityWayToPay entityWayToPay,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(entityWayToPay, serviceContext);
    }

    /**
    * Caches the entity way to pay in the entity cache if it is enabled.
    *
    * @param entityWayToPay the entity way to pay
    */
    public static void cacheResult(
        com.consistent.ucwrt.model.EntityWayToPay entityWayToPay) {
        getPersistence().cacheResult(entityWayToPay);
    }

    /**
    * Caches the entity way to paies in the entity cache if it is enabled.
    *
    * @param entityWayToPaies the entity way to paies
    */
    public static void cacheResult(
        java.util.List<com.consistent.ucwrt.model.EntityWayToPay> entityWayToPaies) {
        getPersistence().cacheResult(entityWayToPaies);
    }

    /**
    * Creates a new entity way to pay with the primary key. Does not add the entity way to pay to the database.
    *
    * @param wayPayId the primary key for the new entity way to pay
    * @return the new entity way to pay
    */
    public static com.consistent.ucwrt.model.EntityWayToPay create(int wayPayId) {
        return getPersistence().create(wayPayId);
    }

    /**
    * Removes the entity way to pay with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param wayPayId the primary key of the entity way to pay
    * @return the entity way to pay that was removed
    * @throws com.consistent.ucwrt.NoSuchEntityWayToPayException if a entity way to pay with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityWayToPay remove(int wayPayId)
        throws com.consistent.ucwrt.NoSuchEntityWayToPayException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(wayPayId);
    }

    public static com.consistent.ucwrt.model.EntityWayToPay updateImpl(
        com.consistent.ucwrt.model.EntityWayToPay entityWayToPay)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(entityWayToPay);
    }

    /**
    * Returns the entity way to pay with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityWayToPayException} if it could not be found.
    *
    * @param wayPayId the primary key of the entity way to pay
    * @return the entity way to pay
    * @throws com.consistent.ucwrt.NoSuchEntityWayToPayException if a entity way to pay with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityWayToPay findByPrimaryKey(
        int wayPayId)
        throws com.consistent.ucwrt.NoSuchEntityWayToPayException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(wayPayId);
    }

    /**
    * Returns the entity way to pay with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param wayPayId the primary key of the entity way to pay
    * @return the entity way to pay, or <code>null</code> if a entity way to pay with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.consistent.ucwrt.model.EntityWayToPay fetchByPrimaryKey(
        int wayPayId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(wayPayId);
    }

    /**
    * Returns all the entity way to paies.
    *
    * @return the entity way to paies
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityWayToPay> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the entity way to paies.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityWayToPayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity way to paies
    * @param end the upper bound of the range of entity way to paies (not inclusive)
    * @return the range of entity way to paies
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityWayToPay> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the entity way to paies.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityWayToPayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity way to paies
    * @param end the upper bound of the range of entity way to paies (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity way to paies
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.consistent.ucwrt.model.EntityWayToPay> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the entity way to paies from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of entity way to paies.
    *
    * @return the number of entity way to paies
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static EntityWayToPayPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (EntityWayToPayPersistence) PortletBeanLocatorUtil.locate(com.consistent.ucwrt.service.ClpSerializer.getServletContextName(),
                    EntityWayToPayPersistence.class.getName());

            ReferenceRegistry.registerReference(EntityWayToPayUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(EntityWayToPayPersistence persistence) {
    }
}
