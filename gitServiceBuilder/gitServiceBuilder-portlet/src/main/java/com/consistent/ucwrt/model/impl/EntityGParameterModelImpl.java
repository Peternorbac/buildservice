package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntityGParameter;
import com.consistent.ucwrt.model.EntityGParameterModel;
import com.consistent.ucwrt.model.EntityGParameterSoap;

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
 * The base model implementation for the EntityGParameter service. Represents a row in the &quot;GParameter&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.consistent.ucwrt.model.EntityGParameterModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EntityGParameterImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityGParameterImpl
 * @see com.consistent.ucwrt.model.EntityGParameter
 * @see com.consistent.ucwrt.model.EntityGParameterModel
 * @generated
 */
@JSON(strict = true)
public class EntityGParameterModelImpl extends BaseModelImpl<EntityGParameter>
    implements EntityGParameterModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a entity g parameter model instance should use the {@link com.consistent.ucwrt.model.EntityGParameter} interface instead.
     */
    public static final String TABLE_NAME = "GParameter";
    public static final Object[][] TABLE_COLUMNS = {
            { "parameterName", Types.VARCHAR },
            { "value", Types.VARCHAR },
            { "description", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table GParameter (parameterName VARCHAR(75) not null primary key,value VARCHAR(75) null,description VARCHAR(75) null)";
    public static final String TABLE_SQL_DROP = "drop table GParameter";
    public static final String ORDER_BY_JPQL = " ORDER BY entityGParameter.parameterName ASC";
    public static final String ORDER_BY_SQL = " ORDER BY GParameter.parameterName ASC";
    public static final String DATA_SOURCE = "ucwrtDataSource";
    public static final String SESSION_FACTORY = "ucwrtSessionFactory";
    public static final String TX_MANAGER = "ucwrtTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.consistent.ucwrt.model.EntityGParameter"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.consistent.ucwrt.model.EntityGParameter"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.consistent.ucwrt.model.EntityGParameter"));
    private static ClassLoader _classLoader = EntityGParameter.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            EntityGParameter.class
        };
    private String _parameterName;
    private String _value;
    private String _description;
    private EntityGParameter _escapedModel;

    public EntityGParameterModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static EntityGParameter toModel(EntityGParameterSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        EntityGParameter model = new EntityGParameterImpl();

        model.setParameterName(soapModel.getParameterName());
        model.setValue(soapModel.getValue());
        model.setDescription(soapModel.getDescription());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<EntityGParameter> toModels(
        EntityGParameterSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<EntityGParameter> models = new ArrayList<EntityGParameter>(soapModels.length);

        for (EntityGParameterSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public String getPrimaryKey() {
        return _parameterName;
    }

    @Override
    public void setPrimaryKey(String primaryKey) {
        setParameterName(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _parameterName;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((String) primaryKeyObj);
    }

    @Override
    public Class<?> getModelClass() {
        return EntityGParameter.class;
    }

    @Override
    public String getModelClassName() {
        return EntityGParameter.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("parameterName", getParameterName());
        attributes.put("value", getValue());
        attributes.put("description", getDescription());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String parameterName = (String) attributes.get("parameterName");

        if (parameterName != null) {
            setParameterName(parameterName);
        }

        String value = (String) attributes.get("value");

        if (value != null) {
            setValue(value);
        }

        String description = (String) attributes.get("description");

        if (description != null) {
            setDescription(description);
        }
    }

    @JSON
    @Override
    public String getParameterName() {
        if (_parameterName == null) {
            return StringPool.BLANK;
        } else {
            return _parameterName;
        }
    }

    @Override
    public void setParameterName(String parameterName) {
        _parameterName = parameterName;
    }

    @JSON
    @Override
    public String getValue() {
        if (_value == null) {
            return StringPool.BLANK;
        } else {
            return _value;
        }
    }

    @Override
    public void setValue(String value) {
        _value = value;
    }

    @JSON
    @Override
    public String getDescription() {
        if (_description == null) {
            return StringPool.BLANK;
        } else {
            return _description;
        }
    }

    @Override
    public void setDescription(String description) {
        _description = description;
    }

    @Override
    public EntityGParameter toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (EntityGParameter) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        EntityGParameterImpl entityGParameterImpl = new EntityGParameterImpl();

        entityGParameterImpl.setParameterName(getParameterName());
        entityGParameterImpl.setValue(getValue());
        entityGParameterImpl.setDescription(getDescription());

        entityGParameterImpl.resetOriginalValues();

        return entityGParameterImpl;
    }

    @Override
    public int compareTo(EntityGParameter entityGParameter) {
        String primaryKey = entityGParameter.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityGParameter)) {
            return false;
        }

        EntityGParameter entityGParameter = (EntityGParameter) obj;

        String primaryKey = entityGParameter.getPrimaryKey();

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
    public CacheModel<EntityGParameter> toCacheModel() {
        EntityGParameterCacheModel entityGParameterCacheModel = new EntityGParameterCacheModel();

        entityGParameterCacheModel.parameterName = getParameterName();

        String parameterName = entityGParameterCacheModel.parameterName;

        if ((parameterName != null) && (parameterName.length() == 0)) {
            entityGParameterCacheModel.parameterName = null;
        }

        entityGParameterCacheModel.value = getValue();

        String value = entityGParameterCacheModel.value;

        if ((value != null) && (value.length() == 0)) {
            entityGParameterCacheModel.value = null;
        }

        entityGParameterCacheModel.description = getDescription();

        String description = entityGParameterCacheModel.description;

        if ((description != null) && (description.length() == 0)) {
            entityGParameterCacheModel.description = null;
        }

        return entityGParameterCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{parameterName=");
        sb.append(getParameterName());
        sb.append(", value=");
        sb.append(getValue());
        sb.append(", description=");
        sb.append(getDescription());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("com.consistent.ucwrt.model.EntityGParameter");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>parameterName</column-name><column-value><![CDATA[");
        sb.append(getParameterName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>value</column-name><column-value><![CDATA[");
        sb.append(getValue());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>description</column-name><column-value><![CDATA[");
        sb.append(getDescription());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
