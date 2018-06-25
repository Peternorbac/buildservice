package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntityDepartment;
import com.consistent.ucwrt.model.EntityDepartmentModel;
import com.consistent.ucwrt.model.EntityDepartmentSoap;
import com.consistent.ucwrt.service.persistence.EntityDepartmentPK;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the EntityDepartment service. Represents a row in the &quot;Department&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.consistent.ucwrt.model.EntityDepartmentModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EntityDepartmentImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityDepartmentImpl
 * @see com.consistent.ucwrt.model.EntityDepartment
 * @see com.consistent.ucwrt.model.EntityDepartmentModel
 * @generated
 */
@JSON(strict = true)
public class EntityDepartmentModelImpl extends BaseModelImpl<EntityDepartment>
    implements EntityDepartmentModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a entity department model instance should use the {@link com.consistent.ucwrt.model.EntityDepartment} interface instead.
     */
    public static final String TABLE_NAME = "Department";
    public static final Object[][] TABLE_COLUMNS = {
            { "departmentId", Types.VARCHAR },
            { "departmentName", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table Department (departmentId VARCHAR(75) not null,departmentName VARCHAR(75) not null,primary key (departmentId, departmentName))";
    public static final String TABLE_SQL_DROP = "drop table Department";
    public static final String ORDER_BY_JPQL = " ORDER BY entityDepartment.id.departmentId ASC, entityDepartment.id.departmentName ASC";
    public static final String ORDER_BY_SQL = " ORDER BY Department.departmentId ASC, Department.departmentName ASC";
    public static final String DATA_SOURCE = "ucwrtDataSource";
    public static final String SESSION_FACTORY = "ucwrtSessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.consistent.ucwrt.model.EntityDepartment"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.consistent.ucwrt.model.EntityDepartment"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.consistent.ucwrt.model.EntityDepartment"));
    private static ClassLoader _classLoader = EntityDepartment.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            EntityDepartment.class
        };
    private String _departmentId;
    private String _departmentName;
    private EntityDepartment _escapedModel;

    public EntityDepartmentModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static EntityDepartment toModel(EntityDepartmentSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        EntityDepartment model = new EntityDepartmentImpl();

        model.setDepartmentId(soapModel.getDepartmentId());
        model.setDepartmentName(soapModel.getDepartmentName());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<EntityDepartment> toModels(
        EntityDepartmentSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<EntityDepartment> models = new ArrayList<EntityDepartment>(soapModels.length);

        for (EntityDepartmentSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public EntityDepartmentPK getPrimaryKey() {
        return new EntityDepartmentPK(_departmentId, _departmentName);
    }

    @Override
    public void setPrimaryKey(EntityDepartmentPK primaryKey) {
        setDepartmentId(primaryKey.departmentId);
        setDepartmentName(primaryKey.departmentName);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new EntityDepartmentPK(_departmentId, _departmentName);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((EntityDepartmentPK) primaryKeyObj);
    }

    @Override
    public Class<?> getModelClass() {
        return EntityDepartment.class;
    }

    @Override
    public String getModelClassName() {
        return EntityDepartment.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("departmentId", getDepartmentId());
        attributes.put("departmentName", getDepartmentName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String departmentId = (String) attributes.get("departmentId");

        if (departmentId != null) {
            setDepartmentId(departmentId);
        }

        String departmentName = (String) attributes.get("departmentName");

        if (departmentName != null) {
            setDepartmentName(departmentName);
        }
    }

    @JSON
    @Override
    public String getDepartmentId() {
        if (_departmentId == null) {
            return StringPool.BLANK;
        } else {
            return _departmentId;
        }
    }

    @Override
    public void setDepartmentId(String departmentId) {
        _departmentId = departmentId;
    }

    @JSON
    @Override
    public String getDepartmentName() {
        if (_departmentName == null) {
            return StringPool.BLANK;
        } else {
            return _departmentName;
        }
    }

    @Override
    public void setDepartmentName(String departmentName) {
        _departmentName = departmentName;
    }

    @Override
    public EntityDepartment toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (EntityDepartment) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        EntityDepartmentImpl entityDepartmentImpl = new EntityDepartmentImpl();

        entityDepartmentImpl.setDepartmentId(getDepartmentId());
        entityDepartmentImpl.setDepartmentName(getDepartmentName());

        entityDepartmentImpl.resetOriginalValues();

        return entityDepartmentImpl;
    }

    @Override
    public int compareTo(EntityDepartment entityDepartment) {
        EntityDepartmentPK primaryKey = entityDepartment.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityDepartment)) {
            return false;
        }

        EntityDepartment entityDepartment = (EntityDepartment) obj;

        EntityDepartmentPK primaryKey = entityDepartment.getPrimaryKey();

        if (getPrimaryKey().equals(primaryKey)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return getPrimaryKey().hashCode();
    }

    @Override
    public void resetOriginalValues() {
    }

    @Override
    public CacheModel<EntityDepartment> toCacheModel() {
        EntityDepartmentCacheModel entityDepartmentCacheModel = new EntityDepartmentCacheModel();

        entityDepartmentCacheModel.departmentId = getDepartmentId();

        String departmentId = entityDepartmentCacheModel.departmentId;

        if ((departmentId != null) && (departmentId.length() == 0)) {
            entityDepartmentCacheModel.departmentId = null;
        }

        entityDepartmentCacheModel.departmentName = getDepartmentName();

        String departmentName = entityDepartmentCacheModel.departmentName;

        if ((departmentName != null) && (departmentName.length() == 0)) {
            entityDepartmentCacheModel.departmentName = null;
        }

        return entityDepartmentCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{departmentId=");
        sb.append(getDepartmentId());
        sb.append(", departmentName=");
        sb.append(getDepartmentName());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append("com.consistent.ucwrt.model.EntityDepartment");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>departmentId</column-name><column-value><![CDATA[");
        sb.append(getDepartmentId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>departmentName</column-name><column-value><![CDATA[");
        sb.append(getDepartmentName());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}