package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.NoSuchEntityModelException;
import com.consistent.ucwrt.model.EntityModel;
import com.consistent.ucwrt.model.impl.EntityModelImpl;
import com.consistent.ucwrt.model.impl.EntityModelModelImpl;
import com.consistent.ucwrt.service.persistence.EntityModelPersistence;

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
 * The persistence implementation for the entity model service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityModelPersistence
 * @see EntityModelUtil
 * @generated
 */
public class EntityModelPersistenceImpl extends BasePersistenceImpl<EntityModel>
    implements EntityModelPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link EntityModelUtil} to access the entity model persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = EntityModelImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EntityModelModelImpl.ENTITY_CACHE_ENABLED,
            EntityModelModelImpl.FINDER_CACHE_ENABLED, EntityModelImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EntityModelModelImpl.ENTITY_CACHE_ENABLED,
            EntityModelModelImpl.FINDER_CACHE_ENABLED, EntityModelImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EntityModelModelImpl.ENTITY_CACHE_ENABLED,
            EntityModelModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_BRANDID = new FinderPath(EntityModelModelImpl.ENTITY_CACHE_ENABLED,
            EntityModelModelImpl.FINDER_CACHE_ENABLED, EntityModelImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByBrandId",
            new String[] {
                Integer.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BRANDID =
        new FinderPath(EntityModelModelImpl.ENTITY_CACHE_ENABLED,
            EntityModelModelImpl.FINDER_CACHE_ENABLED, EntityModelImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByBrandId",
            new String[] { Integer.class.getName() },
            EntityModelModelImpl.BRANDID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_BRANDID = new FinderPath(EntityModelModelImpl.ENTITY_CACHE_ENABLED,
            EntityModelModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByBrandId",
            new String[] { Integer.class.getName() });
    private static final String _FINDER_COLUMN_BRANDID_BRANDID_2 = "entityModel.id.brandId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MODELNAME =
        new FinderPath(EntityModelModelImpl.ENTITY_CACHE_ENABLED,
            EntityModelModelImpl.FINDER_CACHE_ENABLED, EntityModelImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByModelName",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MODELNAME =
        new FinderPath(EntityModelModelImpl.ENTITY_CACHE_ENABLED,
            EntityModelModelImpl.FINDER_CACHE_ENABLED, EntityModelImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByModelName",
            new String[] { String.class.getName() },
            EntityModelModelImpl.MODELNAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_MODELNAME = new FinderPath(EntityModelModelImpl.ENTITY_CACHE_ENABLED,
            EntityModelModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByModelName",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_MODELNAME_MODELNAME_1 = "entityModel.modelName IS NULL";
    private static final String _FINDER_COLUMN_MODELNAME_MODELNAME_2 = "entityModel.modelName = ?";
    private static final String _FINDER_COLUMN_MODELNAME_MODELNAME_3 = "(entityModel.modelName IS NULL OR entityModel.modelName = '')";
    private static final String _SQL_SELECT_ENTITYMODEL = "SELECT entityModel FROM EntityModel entityModel";
    private static final String _SQL_SELECT_ENTITYMODEL_WHERE = "SELECT entityModel FROM EntityModel entityModel WHERE ";
    private static final String _SQL_COUNT_ENTITYMODEL = "SELECT COUNT(entityModel) FROM EntityModel entityModel";
    private static final String _SQL_COUNT_ENTITYMODEL_WHERE = "SELECT COUNT(entityModel) FROM EntityModel entityModel WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "entityModel.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EntityModel exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No EntityModel exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(EntityModelPersistenceImpl.class);
    private static EntityModel _nullEntityModel = new EntityModelImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<EntityModel> toCacheModel() {
                return _nullEntityModelCacheModel;
            }
        };

    private static CacheModel<EntityModel> _nullEntityModelCacheModel = new CacheModel<EntityModel>() {
            @Override
            public EntityModel toEntityModel() {
                return _nullEntityModel;
            }
        };

    public EntityModelPersistenceImpl() {
        setModelClass(EntityModel.class);
    }

    /**
     * Returns all the entity models where brandId = &#63;.
     *
     * @param brandId the brand ID
     * @return the matching entity models
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityModel> findByBrandId(int brandId)
        throws SystemException {
        return findByBrandId(brandId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity models where brandId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityModelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param brandId the brand ID
     * @param start the lower bound of the range of entity models
     * @param end the upper bound of the range of entity models (not inclusive)
     * @return the range of matching entity models
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityModel> findByBrandId(int brandId, int start, int end)
        throws SystemException {
        return findByBrandId(brandId, start, end, null);
    }

    /**
     * Returns an ordered range of all the entity models where brandId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityModelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param brandId the brand ID
     * @param start the lower bound of the range of entity models
     * @param end the upper bound of the range of entity models (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching entity models
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityModel> findByBrandId(int brandId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BRANDID;
            finderArgs = new Object[] { brandId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_BRANDID;
            finderArgs = new Object[] { brandId, start, end, orderByComparator };
        }

        List<EntityModel> list = (List<EntityModel>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (EntityModel entityModel : list) {
                if ((brandId != entityModel.getBrandId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_ENTITYMODEL_WHERE);

            query.append(_FINDER_COLUMN_BRANDID_BRANDID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(EntityModelModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(brandId);

                if (!pagination) {
                    list = (List<EntityModel>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntityModel>(list);
                } else {
                    list = (List<EntityModel>) QueryUtil.list(q, getDialect(),
                            start, end);
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
     * Returns the first entity model in the ordered set where brandId = &#63;.
     *
     * @param brandId the brand ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching entity model
     * @throws com.consistent.ucwrt.NoSuchEntityModelException if a matching entity model could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityModel findByBrandId_First(int brandId,
        OrderByComparator orderByComparator)
        throws NoSuchEntityModelException, SystemException {
        EntityModel entityModel = fetchByBrandId_First(brandId,
                orderByComparator);

        if (entityModel != null) {
            return entityModel;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("brandId=");
        msg.append(brandId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEntityModelException(msg.toString());
    }

    /**
     * Returns the first entity model in the ordered set where brandId = &#63;.
     *
     * @param brandId the brand ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching entity model, or <code>null</code> if a matching entity model could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityModel fetchByBrandId_First(int brandId,
        OrderByComparator orderByComparator) throws SystemException {
        List<EntityModel> list = findByBrandId(brandId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last entity model in the ordered set where brandId = &#63;.
     *
     * @param brandId the brand ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching entity model
     * @throws com.consistent.ucwrt.NoSuchEntityModelException if a matching entity model could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityModel findByBrandId_Last(int brandId,
        OrderByComparator orderByComparator)
        throws NoSuchEntityModelException, SystemException {
        EntityModel entityModel = fetchByBrandId_Last(brandId, orderByComparator);

        if (entityModel != null) {
            return entityModel;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("brandId=");
        msg.append(brandId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEntityModelException(msg.toString());
    }

    /**
     * Returns the last entity model in the ordered set where brandId = &#63;.
     *
     * @param brandId the brand ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching entity model, or <code>null</code> if a matching entity model could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityModel fetchByBrandId_Last(int brandId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByBrandId(brandId);

        if (count == 0) {
            return null;
        }

        List<EntityModel> list = findByBrandId(brandId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the entity models before and after the current entity model in the ordered set where brandId = &#63;.
     *
     * @param entityModelPK the primary key of the current entity model
     * @param brandId the brand ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next entity model
     * @throws com.consistent.ucwrt.NoSuchEntityModelException if a entity model with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityModel[] findByBrandId_PrevAndNext(
        EntityModelPK entityModelPK, int brandId,
        OrderByComparator orderByComparator)
        throws NoSuchEntityModelException, SystemException {
        EntityModel entityModel = findByPrimaryKey(entityModelPK);

        Session session = null;

        try {
            session = openSession();

            EntityModel[] array = new EntityModelImpl[3];

            array[0] = getByBrandId_PrevAndNext(session, entityModel, brandId,
                    orderByComparator, true);

            array[1] = entityModel;

            array[2] = getByBrandId_PrevAndNext(session, entityModel, brandId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected EntityModel getByBrandId_PrevAndNext(Session session,
        EntityModel entityModel, int brandId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_ENTITYMODEL_WHERE);

        query.append(_FINDER_COLUMN_BRANDID_BRANDID_2);

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
            query.append(EntityModelModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(brandId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(entityModel);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<EntityModel> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the entity models where brandId = &#63; from the database.
     *
     * @param brandId the brand ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByBrandId(int brandId) throws SystemException {
        for (EntityModel entityModel : findByBrandId(brandId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(entityModel);
        }
    }

    /**
     * Returns the number of entity models where brandId = &#63;.
     *
     * @param brandId the brand ID
     * @return the number of matching entity models
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByBrandId(int brandId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_BRANDID;

        Object[] finderArgs = new Object[] { brandId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_ENTITYMODEL_WHERE);

            query.append(_FINDER_COLUMN_BRANDID_BRANDID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(brandId);

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
     * Returns all the entity models where modelName = &#63;.
     *
     * @param modelName the model name
     * @return the matching entity models
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityModel> findByModelName(String modelName)
        throws SystemException {
        return findByModelName(modelName, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the entity models where modelName = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityModelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param modelName the model name
     * @param start the lower bound of the range of entity models
     * @param end the upper bound of the range of entity models (not inclusive)
     * @return the range of matching entity models
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityModel> findByModelName(String modelName, int start,
        int end) throws SystemException {
        return findByModelName(modelName, start, end, null);
    }

    /**
     * Returns an ordered range of all the entity models where modelName = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityModelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param modelName the model name
     * @param start the lower bound of the range of entity models
     * @param end the upper bound of the range of entity models (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching entity models
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityModel> findByModelName(String modelName, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MODELNAME;
            finderArgs = new Object[] { modelName };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_MODELNAME;
            finderArgs = new Object[] { modelName, start, end, orderByComparator };
        }

        List<EntityModel> list = (List<EntityModel>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (EntityModel entityModel : list) {
                if (!Validator.equals(modelName, entityModel.getModelName())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_ENTITYMODEL_WHERE);

            boolean bindModelName = false;

            if (modelName == null) {
                query.append(_FINDER_COLUMN_MODELNAME_MODELNAME_1);
            } else if (modelName.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_MODELNAME_MODELNAME_3);
            } else {
                bindModelName = true;

                query.append(_FINDER_COLUMN_MODELNAME_MODELNAME_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(EntityModelModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindModelName) {
                    qPos.add(modelName);
                }

                if (!pagination) {
                    list = (List<EntityModel>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntityModel>(list);
                } else {
                    list = (List<EntityModel>) QueryUtil.list(q, getDialect(),
                            start, end);
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
     * Returns the first entity model in the ordered set where modelName = &#63;.
     *
     * @param modelName the model name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching entity model
     * @throws com.consistent.ucwrt.NoSuchEntityModelException if a matching entity model could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityModel findByModelName_First(String modelName,
        OrderByComparator orderByComparator)
        throws NoSuchEntityModelException, SystemException {
        EntityModel entityModel = fetchByModelName_First(modelName,
                orderByComparator);

        if (entityModel != null) {
            return entityModel;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("modelName=");
        msg.append(modelName);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEntityModelException(msg.toString());
    }

    /**
     * Returns the first entity model in the ordered set where modelName = &#63;.
     *
     * @param modelName the model name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching entity model, or <code>null</code> if a matching entity model could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityModel fetchByModelName_First(String modelName,
        OrderByComparator orderByComparator) throws SystemException {
        List<EntityModel> list = findByModelName(modelName, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last entity model in the ordered set where modelName = &#63;.
     *
     * @param modelName the model name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching entity model
     * @throws com.consistent.ucwrt.NoSuchEntityModelException if a matching entity model could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityModel findByModelName_Last(String modelName,
        OrderByComparator orderByComparator)
        throws NoSuchEntityModelException, SystemException {
        EntityModel entityModel = fetchByModelName_Last(modelName,
                orderByComparator);

        if (entityModel != null) {
            return entityModel;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("modelName=");
        msg.append(modelName);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEntityModelException(msg.toString());
    }

    /**
     * Returns the last entity model in the ordered set where modelName = &#63;.
     *
     * @param modelName the model name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching entity model, or <code>null</code> if a matching entity model could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityModel fetchByModelName_Last(String modelName,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByModelName(modelName);

        if (count == 0) {
            return null;
        }

        List<EntityModel> list = findByModelName(modelName, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the entity models before and after the current entity model in the ordered set where modelName = &#63;.
     *
     * @param entityModelPK the primary key of the current entity model
     * @param modelName the model name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next entity model
     * @throws com.consistent.ucwrt.NoSuchEntityModelException if a entity model with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityModel[] findByModelName_PrevAndNext(
        EntityModelPK entityModelPK, String modelName,
        OrderByComparator orderByComparator)
        throws NoSuchEntityModelException, SystemException {
        EntityModel entityModel = findByPrimaryKey(entityModelPK);

        Session session = null;

        try {
            session = openSession();

            EntityModel[] array = new EntityModelImpl[3];

            array[0] = getByModelName_PrevAndNext(session, entityModel,
                    modelName, orderByComparator, true);

            array[1] = entityModel;

            array[2] = getByModelName_PrevAndNext(session, entityModel,
                    modelName, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected EntityModel getByModelName_PrevAndNext(Session session,
        EntityModel entityModel, String modelName,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_ENTITYMODEL_WHERE);

        boolean bindModelName = false;

        if (modelName == null) {
            query.append(_FINDER_COLUMN_MODELNAME_MODELNAME_1);
        } else if (modelName.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_MODELNAME_MODELNAME_3);
        } else {
            bindModelName = true;

            query.append(_FINDER_COLUMN_MODELNAME_MODELNAME_2);
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
            query.append(EntityModelModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindModelName) {
            qPos.add(modelName);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(entityModel);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<EntityModel> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the entity models where modelName = &#63; from the database.
     *
     * @param modelName the model name
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByModelName(String modelName) throws SystemException {
        for (EntityModel entityModel : findByModelName(modelName,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(entityModel);
        }
    }

    /**
     * Returns the number of entity models where modelName = &#63;.
     *
     * @param modelName the model name
     * @return the number of matching entity models
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByModelName(String modelName) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_MODELNAME;

        Object[] finderArgs = new Object[] { modelName };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_ENTITYMODEL_WHERE);

            boolean bindModelName = false;

            if (modelName == null) {
                query.append(_FINDER_COLUMN_MODELNAME_MODELNAME_1);
            } else if (modelName.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_MODELNAME_MODELNAME_3);
            } else {
                bindModelName = true;

                query.append(_FINDER_COLUMN_MODELNAME_MODELNAME_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindModelName) {
                    qPos.add(modelName);
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
     * Caches the entity model in the entity cache if it is enabled.
     *
     * @param entityModel the entity model
     */
    @Override
    public void cacheResult(EntityModel entityModel) {
        EntityCacheUtil.putResult(EntityModelModelImpl.ENTITY_CACHE_ENABLED,
            EntityModelImpl.class, entityModel.getPrimaryKey(), entityModel);

        entityModel.resetOriginalValues();
    }

    /**
     * Caches the entity models in the entity cache if it is enabled.
     *
     * @param entityModels the entity models
     */
    @Override
    public void cacheResult(List<EntityModel> entityModels) {
        for (EntityModel entityModel : entityModels) {
            if (EntityCacheUtil.getResult(
                        EntityModelModelImpl.ENTITY_CACHE_ENABLED,
                        EntityModelImpl.class, entityModel.getPrimaryKey()) == null) {
                cacheResult(entityModel);
            } else {
                entityModel.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all entity models.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(EntityModelImpl.class.getName());
        }

        EntityCacheUtil.clearCache(EntityModelImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the entity model.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(EntityModel entityModel) {
        EntityCacheUtil.removeResult(EntityModelModelImpl.ENTITY_CACHE_ENABLED,
            EntityModelImpl.class, entityModel.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<EntityModel> entityModels) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (EntityModel entityModel : entityModels) {
            EntityCacheUtil.removeResult(EntityModelModelImpl.ENTITY_CACHE_ENABLED,
                EntityModelImpl.class, entityModel.getPrimaryKey());
        }
    }

    /**
     * Creates a new entity model with the primary key. Does not add the entity model to the database.
     *
     * @param entityModelPK the primary key for the new entity model
     * @return the new entity model
     */
    @Override
    public EntityModel create(EntityModelPK entityModelPK) {
        EntityModel entityModel = new EntityModelImpl();

        entityModel.setNew(true);
        entityModel.setPrimaryKey(entityModelPK);

        return entityModel;
    }

    /**
     * Removes the entity model with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param entityModelPK the primary key of the entity model
     * @return the entity model that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityModelException if a entity model with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityModel remove(EntityModelPK entityModelPK)
        throws NoSuchEntityModelException, SystemException {
        return remove((Serializable) entityModelPK);
    }

    /**
     * Removes the entity model with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the entity model
     * @return the entity model that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityModelException if a entity model with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityModel remove(Serializable primaryKey)
        throws NoSuchEntityModelException, SystemException {
        Session session = null;

        try {
            session = openSession();

            EntityModel entityModel = (EntityModel) session.get(EntityModelImpl.class,
                    primaryKey);

            if (entityModel == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEntityModelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(entityModel);
        } catch (NoSuchEntityModelException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected EntityModel removeImpl(EntityModel entityModel)
        throws SystemException {
        entityModel = toUnwrappedModel(entityModel);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(entityModel)) {
                entityModel = (EntityModel) session.get(EntityModelImpl.class,
                        entityModel.getPrimaryKeyObj());
            }

            if (entityModel != null) {
                session.delete(entityModel);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (entityModel != null) {
            clearCache(entityModel);
        }

        return entityModel;
    }

    @Override
    public EntityModel updateImpl(
        com.consistent.ucwrt.model.EntityModel entityModel)
        throws SystemException {
        entityModel = toUnwrappedModel(entityModel);

        boolean isNew = entityModel.isNew();

        EntityModelModelImpl entityModelModelImpl = (EntityModelModelImpl) entityModel;

        Session session = null;

        try {
            session = openSession();

            if (entityModel.isNew()) {
                session.save(entityModel);

                entityModel.setNew(false);
            } else {
                session.merge(entityModel);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !EntityModelModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((entityModelModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BRANDID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        entityModelModelImpl.getOriginalBrandId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BRANDID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BRANDID,
                    args);

                args = new Object[] { entityModelModelImpl.getBrandId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BRANDID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BRANDID,
                    args);
            }

            if ((entityModelModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MODELNAME.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        entityModelModelImpl.getOriginalModelName()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MODELNAME,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MODELNAME,
                    args);

                args = new Object[] { entityModelModelImpl.getModelName() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MODELNAME,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MODELNAME,
                    args);
            }
        }

        EntityCacheUtil.putResult(EntityModelModelImpl.ENTITY_CACHE_ENABLED,
            EntityModelImpl.class, entityModel.getPrimaryKey(), entityModel);

        return entityModel;
    }

    protected EntityModel toUnwrappedModel(EntityModel entityModel) {
        if (entityModel instanceof EntityModelImpl) {
            return entityModel;
        }

        EntityModelImpl entityModelImpl = new EntityModelImpl();

        entityModelImpl.setNew(entityModel.isNew());
        entityModelImpl.setPrimaryKey(entityModel.getPrimaryKey());

        entityModelImpl.setModelId(entityModel.getModelId());
        entityModelImpl.setBrandId(entityModel.getBrandId());
        entityModelImpl.setYearModel(entityModel.getYearModel());
        entityModelImpl.setModelName(entityModel.getModelName());
        entityModelImpl.setModelDescription(entityModel.getModelDescription());
        entityModelImpl.setModelRegistrationDate(entityModel.getModelRegistrationDate());
        entityModelImpl.setModelRegisterData(entityModel.getModelRegisterData());
        entityModelImpl.setModelResponsibleUser(entityModel.getModelResponsibleUser());

        return entityModelImpl;
    }

    /**
     * Returns the entity model with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the entity model
     * @return the entity model
     * @throws com.consistent.ucwrt.NoSuchEntityModelException if a entity model with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityModel findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEntityModelException, SystemException {
        EntityModel entityModel = fetchByPrimaryKey(primaryKey);

        if (entityModel == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEntityModelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return entityModel;
    }

    /**
     * Returns the entity model with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityModelException} if it could not be found.
     *
     * @param entityModelPK the primary key of the entity model
     * @return the entity model
     * @throws com.consistent.ucwrt.NoSuchEntityModelException if a entity model with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityModel findByPrimaryKey(EntityModelPK entityModelPK)
        throws NoSuchEntityModelException, SystemException {
        return findByPrimaryKey((Serializable) entityModelPK);
    }

    /**
     * Returns the entity model with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the entity model
     * @return the entity model, or <code>null</code> if a entity model with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityModel fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        EntityModel entityModel = (EntityModel) EntityCacheUtil.getResult(EntityModelModelImpl.ENTITY_CACHE_ENABLED,
                EntityModelImpl.class, primaryKey);

        if (entityModel == _nullEntityModel) {
            return null;
        }

        if (entityModel == null) {
            Session session = null;

            try {
                session = openSession();

                entityModel = (EntityModel) session.get(EntityModelImpl.class,
                        primaryKey);

                if (entityModel != null) {
                    cacheResult(entityModel);
                } else {
                    EntityCacheUtil.putResult(EntityModelModelImpl.ENTITY_CACHE_ENABLED,
                        EntityModelImpl.class, primaryKey, _nullEntityModel);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(EntityModelModelImpl.ENTITY_CACHE_ENABLED,
                    EntityModelImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return entityModel;
    }

    /**
     * Returns the entity model with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param entityModelPK the primary key of the entity model
     * @return the entity model, or <code>null</code> if a entity model with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityModel fetchByPrimaryKey(EntityModelPK entityModelPK)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) entityModelPK);
    }

    /**
     * Returns all the entity models.
     *
     * @return the entity models
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityModel> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity models.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityModelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity models
     * @param end the upper bound of the range of entity models (not inclusive)
     * @return the range of entity models
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityModel> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the entity models.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityModelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity models
     * @param end the upper bound of the range of entity models (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of entity models
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityModel> findAll(int start, int end,
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

        List<EntityModel> list = (List<EntityModel>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ENTITYMODEL);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ENTITYMODEL;

                if (pagination) {
                    sql = sql.concat(EntityModelModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<EntityModel>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntityModel>(list);
                } else {
                    list = (List<EntityModel>) QueryUtil.list(q, getDialect(),
                            start, end);
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
     * Removes all the entity models from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (EntityModel entityModel : findAll()) {
            remove(entityModel);
        }
    }

    /**
     * Returns the number of entity models.
     *
     * @return the number of entity models
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

                Query q = session.createQuery(_SQL_COUNT_ENTITYMODEL);

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
     * Initializes the entity model persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.consistent.ucwrt.model.EntityModel")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<EntityModel>> listenersList = new ArrayList<ModelListener<EntityModel>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<EntityModel>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(EntityModelImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
