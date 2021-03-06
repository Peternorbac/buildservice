package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.NoSuchEntityEmployeesException;
import com.consistent.ucwrt.model.EntityEmployees;
import com.consistent.ucwrt.model.impl.EntityEmployeesImpl;
import com.consistent.ucwrt.model.impl.EntityEmployeesModelImpl;
import com.consistent.ucwrt.service.persistence.EntityEmployeesPersistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the entity employees service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityEmployeesPersistence
 * @see EntityEmployeesUtil
 * @generated
 */
public class EntityEmployeesPersistenceImpl extends BasePersistenceImpl<EntityEmployees>
    implements EntityEmployeesPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link EntityEmployeesUtil} to access the entity employees persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = EntityEmployeesImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EntityEmployeesModelImpl.ENTITY_CACHE_ENABLED,
            EntityEmployeesModelImpl.FINDER_CACHE_ENABLED,
            EntityEmployeesImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EntityEmployeesModelImpl.ENTITY_CACHE_ENABLED,
            EntityEmployeesModelImpl.FINDER_CACHE_ENABLED,
            EntityEmployeesImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EntityEmployeesModelImpl.ENTITY_CACHE_ENABLED,
            EntityEmployeesModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_EMPLOYEES =
        new FinderPath(EntityEmployeesModelImpl.ENTITY_CACHE_ENABLED,
            EntityEmployeesModelImpl.FINDER_CACHE_ENABLED,
            EntityEmployeesImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByEmployees",
            new String[] {
                String.class.getName(), String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPLOYEES =
        new FinderPath(EntityEmployeesModelImpl.ENTITY_CACHE_ENABLED,
            EntityEmployeesModelImpl.FINDER_CACHE_ENABLED,
            EntityEmployeesImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByEmployees",
            new String[] { String.class.getName(), String.class.getName() },
            EntityEmployeesModelImpl.DEALERID_COLUMN_BITMASK |
            EntityEmployeesModelImpl.BUSINESSBRANDNAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_EMPLOYEES = new FinderPath(EntityEmployeesModelImpl.ENTITY_CACHE_ENABLED,
            EntityEmployeesModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByEmployees",
            new String[] { String.class.getName(), String.class.getName() });
    private static final String _FINDER_COLUMN_EMPLOYEES_DEALERID_1 = "entityEmployees.dealerId IS NULL AND ";
    private static final String _FINDER_COLUMN_EMPLOYEES_DEALERID_2 = "entityEmployees.dealerId = ? AND ";
    private static final String _FINDER_COLUMN_EMPLOYEES_DEALERID_3 = "(entityEmployees.dealerId IS NULL OR entityEmployees.dealerId = '') AND ";
    private static final String _FINDER_COLUMN_EMPLOYEES_BUSINESSBRANDNAME_1 = "entityEmployees.businessBrandName IS NULL";
    private static final String _FINDER_COLUMN_EMPLOYEES_BUSINESSBRANDNAME_2 = "entityEmployees.businessBrandName = ?";
    private static final String _FINDER_COLUMN_EMPLOYEES_BUSINESSBRANDNAME_3 = "(entityEmployees.businessBrandName IS NULL OR entityEmployees.businessBrandName = '')";
    private static final String _SQL_SELECT_ENTITYEMPLOYEES = "SELECT entityEmployees FROM EntityEmployees entityEmployees";
    private static final String _SQL_SELECT_ENTITYEMPLOYEES_WHERE = "SELECT entityEmployees FROM EntityEmployees entityEmployees WHERE ";
    private static final String _SQL_COUNT_ENTITYEMPLOYEES = "SELECT COUNT(entityEmployees) FROM EntityEmployees entityEmployees";
    private static final String _SQL_COUNT_ENTITYEMPLOYEES_WHERE = "SELECT COUNT(entityEmployees) FROM EntityEmployees entityEmployees WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "entityEmployees.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EntityEmployees exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No EntityEmployees exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(EntityEmployeesPersistenceImpl.class);
    private static EntityEmployees _nullEntityEmployees = new EntityEmployeesImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<EntityEmployees> toCacheModel() {
                return _nullEntityEmployeesCacheModel;
            }
        };

    private static CacheModel<EntityEmployees> _nullEntityEmployeesCacheModel = new CacheModel<EntityEmployees>() {
            @Override
            public EntityEmployees toEntityModel() {
                return _nullEntityEmployees;
            }
        };

    public EntityEmployeesPersistenceImpl() {
        setModelClass(EntityEmployees.class);
    }

    /**
     * Returns all the entity employeeses where dealerId = &#63; and businessBrandName = &#63;.
     *
     * @param dealerId the dealer ID
     * @param businessBrandName the business brand name
     * @return the matching entity employeeses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityEmployees> findByEmployees(String dealerId,
        String businessBrandName) throws SystemException {
        return findByEmployees(dealerId, businessBrandName, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity employeeses where dealerId = &#63; and businessBrandName = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityEmployeesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dealerId the dealer ID
     * @param businessBrandName the business brand name
     * @param start the lower bound of the range of entity employeeses
     * @param end the upper bound of the range of entity employeeses (not inclusive)
     * @return the range of matching entity employeeses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityEmployees> findByEmployees(String dealerId,
        String businessBrandName, int start, int end) throws SystemException {
        return findByEmployees(dealerId, businessBrandName, start, end, null);
    }

    /**
     * Returns an ordered range of all the entity employeeses where dealerId = &#63; and businessBrandName = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityEmployeesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dealerId the dealer ID
     * @param businessBrandName the business brand name
     * @param start the lower bound of the range of entity employeeses
     * @param end the upper bound of the range of entity employeeses (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching entity employeeses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityEmployees> findByEmployees(String dealerId,
        String businessBrandName, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPLOYEES;
            finderArgs = new Object[] { dealerId, businessBrandName };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_EMPLOYEES;
            finderArgs = new Object[] {
                    dealerId, businessBrandName,
                    
                    start, end, orderByComparator
                };
        }

        List<EntityEmployees> list = (List<EntityEmployees>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (EntityEmployees entityEmployees : list) {
                if (!Validator.equals(dealerId, entityEmployees.getDealerId()) ||
                        !Validator.equals(businessBrandName,
                            entityEmployees.getBusinessBrandName())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_ENTITYEMPLOYEES_WHERE);

            boolean bindDealerId = false;

            if (dealerId == null) {
                query.append(_FINDER_COLUMN_EMPLOYEES_DEALERID_1);
            } else if (dealerId.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_EMPLOYEES_DEALERID_3);
            } else {
                bindDealerId = true;

                query.append(_FINDER_COLUMN_EMPLOYEES_DEALERID_2);
            }

            boolean bindBusinessBrandName = false;

            if (businessBrandName == null) {
                query.append(_FINDER_COLUMN_EMPLOYEES_BUSINESSBRANDNAME_1);
            } else if (businessBrandName.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_EMPLOYEES_BUSINESSBRANDNAME_3);
            } else {
                bindBusinessBrandName = true;

                query.append(_FINDER_COLUMN_EMPLOYEES_BUSINESSBRANDNAME_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(EntityEmployeesModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindDealerId) {
                    qPos.add(dealerId);
                }

                if (bindBusinessBrandName) {
                    qPos.add(businessBrandName);
                }

                if (!pagination) {
                    list = (List<EntityEmployees>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntityEmployees>(list);
                } else {
                    list = (List<EntityEmployees>) QueryUtil.list(q,
                            getDialect(), start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first entity employees in the ordered set where dealerId = &#63; and businessBrandName = &#63;.
     *
     * @param dealerId the dealer ID
     * @param businessBrandName the business brand name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching entity employees
     * @throws com.consistent.ucwrt.NoSuchEntityEmployeesException if a matching entity employees could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityEmployees findByEmployees_First(String dealerId,
        String businessBrandName, OrderByComparator orderByComparator)
        throws NoSuchEntityEmployeesException, SystemException {
        EntityEmployees entityEmployees = fetchByEmployees_First(dealerId,
                businessBrandName, orderByComparator);

        if (entityEmployees != null) {
            return entityEmployees;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("dealerId=");
        msg.append(dealerId);

        msg.append(", businessBrandName=");
        msg.append(businessBrandName);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEntityEmployeesException(msg.toString());
    }

    /**
     * Returns the first entity employees in the ordered set where dealerId = &#63; and businessBrandName = &#63;.
     *
     * @param dealerId the dealer ID
     * @param businessBrandName the business brand name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching entity employees, or <code>null</code> if a matching entity employees could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityEmployees fetchByEmployees_First(String dealerId,
        String businessBrandName, OrderByComparator orderByComparator)
        throws SystemException {
        List<EntityEmployees> list = findByEmployees(dealerId,
                businessBrandName, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last entity employees in the ordered set where dealerId = &#63; and businessBrandName = &#63;.
     *
     * @param dealerId the dealer ID
     * @param businessBrandName the business brand name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching entity employees
     * @throws com.consistent.ucwrt.NoSuchEntityEmployeesException if a matching entity employees could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityEmployees findByEmployees_Last(String dealerId,
        String businessBrandName, OrderByComparator orderByComparator)
        throws NoSuchEntityEmployeesException, SystemException {
        EntityEmployees entityEmployees = fetchByEmployees_Last(dealerId,
                businessBrandName, orderByComparator);

        if (entityEmployees != null) {
            return entityEmployees;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("dealerId=");
        msg.append(dealerId);

        msg.append(", businessBrandName=");
        msg.append(businessBrandName);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEntityEmployeesException(msg.toString());
    }

    /**
     * Returns the last entity employees in the ordered set where dealerId = &#63; and businessBrandName = &#63;.
     *
     * @param dealerId the dealer ID
     * @param businessBrandName the business brand name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching entity employees, or <code>null</code> if a matching entity employees could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityEmployees fetchByEmployees_Last(String dealerId,
        String businessBrandName, OrderByComparator orderByComparator)
        throws SystemException {
        int count = countByEmployees(dealerId, businessBrandName);

        if (count == 0) {
            return null;
        }

        List<EntityEmployees> list = findByEmployees(dealerId,
                businessBrandName, count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the entity employeeses before and after the current entity employees in the ordered set where dealerId = &#63; and businessBrandName = &#63;.
     *
     * @param employeeId the primary key of the current entity employees
     * @param dealerId the dealer ID
     * @param businessBrandName the business brand name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next entity employees
     * @throws com.consistent.ucwrt.NoSuchEntityEmployeesException if a entity employees with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityEmployees[] findByEmployees_PrevAndNext(int employeeId,
        String dealerId, String businessBrandName,
        OrderByComparator orderByComparator)
        throws NoSuchEntityEmployeesException, SystemException {
        EntityEmployees entityEmployees = findByPrimaryKey(employeeId);

        Session session = null;

        try {
            session = openSession();

            EntityEmployees[] array = new EntityEmployeesImpl[3];

            array[0] = getByEmployees_PrevAndNext(session, entityEmployees,
                    dealerId, businessBrandName, orderByComparator, true);

            array[1] = entityEmployees;

            array[2] = getByEmployees_PrevAndNext(session, entityEmployees,
                    dealerId, businessBrandName, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected EntityEmployees getByEmployees_PrevAndNext(Session session,
        EntityEmployees entityEmployees, String dealerId,
        String businessBrandName, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_ENTITYEMPLOYEES_WHERE);

        boolean bindDealerId = false;

        if (dealerId == null) {
            query.append(_FINDER_COLUMN_EMPLOYEES_DEALERID_1);
        } else if (dealerId.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_EMPLOYEES_DEALERID_3);
        } else {
            bindDealerId = true;

            query.append(_FINDER_COLUMN_EMPLOYEES_DEALERID_2);
        }

        boolean bindBusinessBrandName = false;

        if (businessBrandName == null) {
            query.append(_FINDER_COLUMN_EMPLOYEES_BUSINESSBRANDNAME_1);
        } else if (businessBrandName.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_EMPLOYEES_BUSINESSBRANDNAME_3);
        } else {
            bindBusinessBrandName = true;

            query.append(_FINDER_COLUMN_EMPLOYEES_BUSINESSBRANDNAME_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(EntityEmployeesModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindDealerId) {
            qPos.add(dealerId);
        }

        if (bindBusinessBrandName) {
            qPos.add(businessBrandName);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(entityEmployees);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<EntityEmployees> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the entity employeeses where dealerId = &#63; and businessBrandName = &#63; from the database.
     *
     * @param dealerId the dealer ID
     * @param businessBrandName the business brand name
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByEmployees(String dealerId, String businessBrandName)
        throws SystemException {
        for (EntityEmployees entityEmployees : findByEmployees(dealerId,
                businessBrandName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(entityEmployees);
        }
    }

    /**
     * Returns the number of entity employeeses where dealerId = &#63; and businessBrandName = &#63;.
     *
     * @param dealerId the dealer ID
     * @param businessBrandName the business brand name
     * @return the number of matching entity employeeses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByEmployees(String dealerId, String businessBrandName)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_EMPLOYEES;

        Object[] finderArgs = new Object[] { dealerId, businessBrandName };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_ENTITYEMPLOYEES_WHERE);

            boolean bindDealerId = false;

            if (dealerId == null) {
                query.append(_FINDER_COLUMN_EMPLOYEES_DEALERID_1);
            } else if (dealerId.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_EMPLOYEES_DEALERID_3);
            } else {
                bindDealerId = true;

                query.append(_FINDER_COLUMN_EMPLOYEES_DEALERID_2);
            }

            boolean bindBusinessBrandName = false;

            if (businessBrandName == null) {
                query.append(_FINDER_COLUMN_EMPLOYEES_BUSINESSBRANDNAME_1);
            } else if (businessBrandName.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_EMPLOYEES_BUSINESSBRANDNAME_3);
            } else {
                bindBusinessBrandName = true;

                query.append(_FINDER_COLUMN_EMPLOYEES_BUSINESSBRANDNAME_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindDealerId) {
                    qPos.add(dealerId);
                }

                if (bindBusinessBrandName) {
                    qPos.add(businessBrandName);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the entity employees in the entity cache if it is enabled.
     *
     * @param entityEmployees the entity employees
     */
    @Override
    public void cacheResult(EntityEmployees entityEmployees) {
        EntityCacheUtil.putResult(EntityEmployeesModelImpl.ENTITY_CACHE_ENABLED,
            EntityEmployeesImpl.class, entityEmployees.getPrimaryKey(),
            entityEmployees);

        entityEmployees.resetOriginalValues();
    }

    /**
     * Caches the entity employeeses in the entity cache if it is enabled.
     *
     * @param entityEmployeeses the entity employeeses
     */
    @Override
    public void cacheResult(List<EntityEmployees> entityEmployeeses) {
        for (EntityEmployees entityEmployees : entityEmployeeses) {
            if (EntityCacheUtil.getResult(
                        EntityEmployeesModelImpl.ENTITY_CACHE_ENABLED,
                        EntityEmployeesImpl.class,
                        entityEmployees.getPrimaryKey()) == null) {
                cacheResult(entityEmployees);
            } else {
                entityEmployees.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all entity employeeses.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(EntityEmployeesImpl.class.getName());
        }

        EntityCacheUtil.clearCache(EntityEmployeesImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the entity employees.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(EntityEmployees entityEmployees) {
        EntityCacheUtil.removeResult(EntityEmployeesModelImpl.ENTITY_CACHE_ENABLED,
            EntityEmployeesImpl.class, entityEmployees.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<EntityEmployees> entityEmployeeses) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (EntityEmployees entityEmployees : entityEmployeeses) {
            EntityCacheUtil.removeResult(EntityEmployeesModelImpl.ENTITY_CACHE_ENABLED,
                EntityEmployeesImpl.class, entityEmployees.getPrimaryKey());
        }
    }

    /**
     * Creates a new entity employees with the primary key. Does not add the entity employees to the database.
     *
     * @param employeeId the primary key for the new entity employees
     * @return the new entity employees
     */
    @Override
    public EntityEmployees create(int employeeId) {
        EntityEmployees entityEmployees = new EntityEmployeesImpl();

        entityEmployees.setNew(true);
        entityEmployees.setPrimaryKey(employeeId);

        return entityEmployees;
    }

    /**
     * Removes the entity employees with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param employeeId the primary key of the entity employees
     * @return the entity employees that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityEmployeesException if a entity employees with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityEmployees remove(int employeeId)
        throws NoSuchEntityEmployeesException, SystemException {
        return remove((Serializable) employeeId);
    }

    /**
     * Removes the entity employees with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the entity employees
     * @return the entity employees that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityEmployeesException if a entity employees with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityEmployees remove(Serializable primaryKey)
        throws NoSuchEntityEmployeesException, SystemException {
        Session session = null;

        try {
            session = openSession();

            EntityEmployees entityEmployees = (EntityEmployees) session.get(EntityEmployeesImpl.class,
                    primaryKey);

            if (entityEmployees == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEntityEmployeesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(entityEmployees);
        } catch (NoSuchEntityEmployeesException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected EntityEmployees removeImpl(EntityEmployees entityEmployees)
        throws SystemException {
        entityEmployees = toUnwrappedModel(entityEmployees);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(entityEmployees)) {
                entityEmployees = (EntityEmployees) session.get(EntityEmployeesImpl.class,
                        entityEmployees.getPrimaryKeyObj());
            }

            if (entityEmployees != null) {
                session.delete(entityEmployees);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (entityEmployees != null) {
            clearCache(entityEmployees);
        }

        return entityEmployees;
    }

    @Override
    public EntityEmployees updateImpl(
        com.consistent.ucwrt.model.EntityEmployees entityEmployees)
        throws SystemException {
        entityEmployees = toUnwrappedModel(entityEmployees);

        boolean isNew = entityEmployees.isNew();

        EntityEmployeesModelImpl entityEmployeesModelImpl = (EntityEmployeesModelImpl) entityEmployees;

        Session session = null;

        try {
            session = openSession();

            if (entityEmployees.isNew()) {
                session.save(entityEmployees);

                entityEmployees.setNew(false);
            } else {
                session.merge(entityEmployees);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !EntityEmployeesModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((entityEmployeesModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPLOYEES.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        entityEmployeesModelImpl.getOriginalDealerId(),
                        entityEmployeesModelImpl.getOriginalBusinessBrandName()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_EMPLOYEES,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPLOYEES,
                    args);

                args = new Object[] {
                        entityEmployeesModelImpl.getDealerId(),
                        entityEmployeesModelImpl.getBusinessBrandName()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_EMPLOYEES,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPLOYEES,
                    args);
            }
        }

        EntityCacheUtil.putResult(EntityEmployeesModelImpl.ENTITY_CACHE_ENABLED,
            EntityEmployeesImpl.class, entityEmployees.getPrimaryKey(),
            entityEmployees);

        return entityEmployees;
    }

    protected EntityEmployees toUnwrappedModel(EntityEmployees entityEmployees) {
        if (entityEmployees instanceof EntityEmployeesImpl) {
            return entityEmployees;
        }

        EntityEmployeesImpl entityEmployeesImpl = new EntityEmployeesImpl();

        entityEmployeesImpl.setNew(entityEmployees.isNew());
        entityEmployeesImpl.setPrimaryKey(entityEmployees.getPrimaryKey());

        entityEmployeesImpl.setEmployeeId(entityEmployees.getEmployeeId());
        entityEmployeesImpl.setFirstName(entityEmployees.getFirstName());
        entityEmployeesImpl.setLastName(entityEmployees.getLastName());
        entityEmployeesImpl.setSecondLastName(entityEmployees.getSecondLastName());
        entityEmployeesImpl.setMarketStall(entityEmployees.getMarketStall());
        entityEmployeesImpl.setDepartment(entityEmployees.getDepartment());
        entityEmployeesImpl.setCellPhone(entityEmployees.getCellPhone());
        entityEmployeesImpl.setPhone(entityEmployees.getPhone());
        entityEmployeesImpl.setEmail(entityEmployees.getEmail());
        entityEmployeesImpl.setCertified(entityEmployees.getCertified());
        entityEmployeesImpl.setCertifiedDate(entityEmployees.getCertifiedDate());
        entityEmployeesImpl.setCertificationNumber(entityEmployees.getCertificationNumber());
        entityEmployeesImpl.setRegistrationDate(entityEmployees.getRegistrationDate());
        entityEmployeesImpl.setStatus(entityEmployees.getStatus());
        entityEmployeesImpl.setComments(entityEmployees.getComments());
        entityEmployeesImpl.setDepartmentId(entityEmployees.getDepartmentId());
        entityEmployeesImpl.setEmploymentId(entityEmployees.getEmploymentId());
        entityEmployeesImpl.setDealerId(entityEmployees.getDealerId());
        entityEmployeesImpl.setBusinessBrandName(entityEmployees.getBusinessBrandName());

        return entityEmployeesImpl;
    }

    /**
     * Returns the entity employees with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the entity employees
     * @return the entity employees
     * @throws com.consistent.ucwrt.NoSuchEntityEmployeesException if a entity employees with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityEmployees findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEntityEmployeesException, SystemException {
        EntityEmployees entityEmployees = fetchByPrimaryKey(primaryKey);

        if (entityEmployees == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEntityEmployeesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return entityEmployees;
    }

    /**
     * Returns the entity employees with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityEmployeesException} if it could not be found.
     *
     * @param employeeId the primary key of the entity employees
     * @return the entity employees
     * @throws com.consistent.ucwrt.NoSuchEntityEmployeesException if a entity employees with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityEmployees findByPrimaryKey(int employeeId)
        throws NoSuchEntityEmployeesException, SystemException {
        return findByPrimaryKey((Serializable) employeeId);
    }

    /**
     * Returns the entity employees with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the entity employees
     * @return the entity employees, or <code>null</code> if a entity employees with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityEmployees fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        EntityEmployees entityEmployees = (EntityEmployees) EntityCacheUtil.getResult(EntityEmployeesModelImpl.ENTITY_CACHE_ENABLED,
                EntityEmployeesImpl.class, primaryKey);

        if (entityEmployees == _nullEntityEmployees) {
            return null;
        }

        if (entityEmployees == null) {
            Session session = null;

            try {
                session = openSession();

                entityEmployees = (EntityEmployees) session.get(EntityEmployeesImpl.class,
                        primaryKey);

                if (entityEmployees != null) {
                    cacheResult(entityEmployees);
                } else {
                    EntityCacheUtil.putResult(EntityEmployeesModelImpl.ENTITY_CACHE_ENABLED,
                        EntityEmployeesImpl.class, primaryKey,
                        _nullEntityEmployees);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(EntityEmployeesModelImpl.ENTITY_CACHE_ENABLED,
                    EntityEmployeesImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return entityEmployees;
    }

    /**
     * Returns the entity employees with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param employeeId the primary key of the entity employees
     * @return the entity employees, or <code>null</code> if a entity employees with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityEmployees fetchByPrimaryKey(int employeeId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) employeeId);
    }

    /**
     * Returns all the entity employeeses.
     *
     * @return the entity employeeses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityEmployees> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity employeeses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityEmployeesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity employeeses
     * @param end the upper bound of the range of entity employeeses (not inclusive)
     * @return the range of entity employeeses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityEmployees> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the entity employeeses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityEmployeesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity employeeses
     * @param end the upper bound of the range of entity employeeses (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of entity employeeses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityEmployees> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<EntityEmployees> list = (List<EntityEmployees>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ENTITYEMPLOYEES);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ENTITYEMPLOYEES;

                if (pagination) {
                    sql = sql.concat(EntityEmployeesModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<EntityEmployees>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntityEmployees>(list);
                } else {
                    list = (List<EntityEmployees>) QueryUtil.list(q,
                            getDialect(), start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the entity employeeses from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (EntityEmployees entityEmployees : findAll()) {
            remove(entityEmployees);
        }
    }

    /**
     * Returns the number of entity employeeses.
     *
     * @return the number of entity employeeses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_ENTITYEMPLOYEES);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the entity employees persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.consistent.ucwrt.model.EntityEmployees")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<EntityEmployees>> listenersList = new ArrayList<ModelListener<EntityEmployees>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<EntityEmployees>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(EntityEmployeesImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
