package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntityEmployment;
import com.consistent.ucwrt.model.EntityEmploymentModel;
import com.consistent.ucwrt.model.EntityEmploymentSoap;
import com.consistent.ucwrt.service.persistence.EntityEmploymentPK;

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
 * The base model implementation for the EntityEmployment service. Represents a row in the &quot;Employment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.consistent.ucwrt.model.EntityEmploymentModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EntityEmploymentImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityEmploymentImpl
 * @see com.consistent.ucwrt.model.EntityEmployment
 * @see com.consistent.ucwrt.model.EntityEmploymentModel
 * @generated
 */
@JSON(strict = true)
public class EntityEmploymentModelImpl extends BaseModelImpl<EntityEmployment>
    implements EntityEmploymentModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a entity employment model instance should use the {@link com.consistent.ucwrt.model.EntityEmployment} interface instead.
     */
    public static final String TABLE_NAME = "Employment";
    public static final Object[][] TABLE_COLUMNS = {
            { "employmentId", Types.VARCHAR },
            { "employmentName", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table Employment (employmentId VARCHAR(75) not null,employmentName VARCHAR(75) not null,primary key (employmentId, employmentName))";
    public static final String TABLE_SQL_DROP = "drop table Employment";
    public static final String ORDER_BY_JPQL = " ORDER BY entityEmployment.id.employmentId ASC, entityEmployment.id.employmentName ASC";
    public static final String ORDER_BY_SQL = " ORDER BY Employment.employmentId ASC, Employment.employmentName ASC";
    public static final String DATA_SOURCE = "ucwrtDataSource";
    public static final String SESSION_FACTORY = "ucwrtSessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.consistent.ucwrt.model.EntityEmployment"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.consistent.ucwrt.model.EntityEmployment"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.consistent.ucwrt.model.EntityEmployment"));
    private static ClassLoader _classLoader = EntityEmployment.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            EntityEmployment.class
        };
    private String _employmentId;
    private String _employmentName;
    private EntityEmployment _escapedModel;

    public EntityEmploymentModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static EntityEmployment toModel(EntityEmploymentSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        EntityEmployment model = new EntityEmploymentImpl();

        model.setEmploymentId(soapModel.getEmploymentId());
        model.setEmploymentName(soapModel.getEmploymentName());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<EntityEmployment> toModels(
        EntityEmploymentSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<EntityEmployment> models = new ArrayList<EntityEmployment>(soapModels.length);

        for (EntityEmploymentSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public EntityEmploymentPK getPrimaryKey() {
        return new EntityEmploymentPK(_employmentId, _employmentName);
    }

    @Override
    public void setPrimaryKey(EntityEmploymentPK primaryKey) {
        setEmploymentId(primaryKey.employmentId);
        setEmploymentName(primaryKey.employmentName);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new EntityEmploymentPK(_employmentId, _employmentName);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((EntityEmploymentPK) primaryKeyObj);
    }

    @Override
    public Class<?> getModelClass() {
        return EntityEmployment.class;
    }

    @Override
    public String getModelClassName() {
        return EntityEmployment.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("employmentId", getEmploymentId());
        attributes.put("employmentName", getEmploymentName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String employmentId = (String) attributes.get("employmentId");

        if (employmentId != null) {
            setEmploymentId(employmentId);
        }

        String employmentName = (String) attributes.get("employmentName");

        if (employmentName != null) {
            setEmploymentName(employmentName);
        }
    }

    @JSON
    @Override
    public String getEmploymentId() {
        if (_employmentId == null) {
            return StringPool.BLANK;
        } else {
            return _employmentId;
        }
    }

    @Override
    public void setEmploymentId(String employmentId) {
        _employmentId = employmentId;
    }

    @JSON
    @Override
    public String getEmploymentName() {
        if (_employmentName == null) {
            return StringPool.BLANK;
        } else {
            return _employmentName;
        }
    }

    @Override
    public void setEmploymentName(String employmentName) {
        _employmentName = employmentName;
    }

    @Override
    public EntityEmployment toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (EntityEmployment) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        EntityEmploymentImpl entityEmploymentImpl = new EntityEmploymentImpl();

        entityEmploymentImpl.setEmploymentId(getEmploymentId());
        entityEmploymentImpl.setEmploymentName(getEmploymentName());

        entityEmploymentImpl.resetOriginalValues();

        return entityEmploymentImpl;
    }

    @Override
    public int compareTo(EntityEmployment entityEmployment) {
        EntityEmploymentPK primaryKey = entityEmployment.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityEmployment)) {
            return false;
        }

        EntityEmployment entityEmployment = (EntityEmployment) obj;

        EntityEmploymentPK primaryKey = entityEmployment.getPrimaryKey();

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
    public CacheModel<EntityEmployment> toCacheModel() {
        EntityEmploymentCacheModel entityEmploymentCacheModel = new EntityEmploymentCacheModel();

        entityEmploymentCacheModel.employmentId = getEmploymentId();

        String employmentId = entityEmploymentCacheModel.employmentId;

        if ((employmentId != null) && (employmentId.length() == 0)) {
            entityEmploymentCacheModel.employmentId = null;
        }

        entityEmploymentCacheModel.employmentName = getEmploymentName();

        String employmentName = entityEmploymentCacheModel.employmentName;

        if ((employmentName != null) && (employmentName.length() == 0)) {
            entityEmploymentCacheModel.employmentName = null;
        }

        return entityEmploymentCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{employmentId=");
        sb.append(getEmploymentId());
        sb.append(", employmentName=");
        sb.append(getEmploymentName());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append("com.consistent.ucwrt.model.EntityEmployment");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>employmentId</column-name><column-value><![CDATA[");
        sb.append(getEmploymentId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>employmentName</column-name><column-value><![CDATA[");
        sb.append(getEmploymentName());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
