package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntityProspection;
import com.consistent.ucwrt.model.EntityProspectionModel;
import com.consistent.ucwrt.model.EntityProspectionSoap;

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
 * The base model implementation for the EntityProspection service. Represents a row in the &quot;Prospection&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.consistent.ucwrt.model.EntityProspectionModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EntityProspectionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityProspectionImpl
 * @see com.consistent.ucwrt.model.EntityProspection
 * @see com.consistent.ucwrt.model.EntityProspectionModel
 * @generated
 */
@JSON(strict = true)
public class EntityProspectionModelImpl extends BaseModelImpl<EntityProspection>
    implements EntityProspectionModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a entity prospection model instance should use the {@link com.consistent.ucwrt.model.EntityProspection} interface instead.
     */
    public static final String TABLE_NAME = "Prospection";
    public static final Object[][] TABLE_COLUMNS = {
            { "prospectionId", Types.INTEGER },
            { "prospectionName", Types.VARCHAR },
            { "eventId", Types.INTEGER }
        };
    public static final String TABLE_SQL_CREATE = "create table Prospection (prospectionId INTEGER not null primary key,prospectionName VARCHAR(75) null,eventId INTEGER)";
    public static final String TABLE_SQL_DROP = "drop table Prospection";
    public static final String ORDER_BY_JPQL = " ORDER BY entityProspection.prospectionId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY Prospection.prospectionId ASC";
    public static final String DATA_SOURCE = "ucwrtDataSource";
    public static final String SESSION_FACTORY = "ucwrtSessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.consistent.ucwrt.model.EntityProspection"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.consistent.ucwrt.model.EntityProspection"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.consistent.ucwrt.model.EntityProspection"));
    private static ClassLoader _classLoader = EntityProspection.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            EntityProspection.class
        };
    private int _prospectionId;
    private String _prospectionName;
    private int _eventId;
    private EntityProspection _escapedModel;

    public EntityProspectionModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static EntityProspection toModel(EntityProspectionSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        EntityProspection model = new EntityProspectionImpl();

        model.setProspectionId(soapModel.getProspectionId());
        model.setProspectionName(soapModel.getProspectionName());
        model.setEventId(soapModel.getEventId());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<EntityProspection> toModels(
        EntityProspectionSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<EntityProspection> models = new ArrayList<EntityProspection>(soapModels.length);

        for (EntityProspectionSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public int getPrimaryKey() {
        return _prospectionId;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setProspectionId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _prospectionId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
    }

    @Override
    public Class<?> getModelClass() {
        return EntityProspection.class;
    }

    @Override
    public String getModelClassName() {
        return EntityProspection.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("prospectionId", getProspectionId());
        attributes.put("prospectionName", getProspectionName());
        attributes.put("eventId", getEventId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer prospectionId = (Integer) attributes.get("prospectionId");

        if (prospectionId != null) {
            setProspectionId(prospectionId);
        }

        String prospectionName = (String) attributes.get("prospectionName");

        if (prospectionName != null) {
            setProspectionName(prospectionName);
        }

        Integer eventId = (Integer) attributes.get("eventId");

        if (eventId != null) {
            setEventId(eventId);
        }
    }

    @JSON
    @Override
    public int getProspectionId() {
        return _prospectionId;
    }

    @Override
    public void setProspectionId(int prospectionId) {
        _prospectionId = prospectionId;
    }

    @JSON
    @Override
    public String getProspectionName() {
        if (_prospectionName == null) {
            return StringPool.BLANK;
        } else {
            return _prospectionName;
        }
    }

    @Override
    public void setProspectionName(String prospectionName) {
        _prospectionName = prospectionName;
    }

    @JSON
    @Override
    public int getEventId() {
        return _eventId;
    }

    @Override
    public void setEventId(int eventId) {
        _eventId = eventId;
    }

    @Override
    public EntityProspection toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (EntityProspection) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        EntityProspectionImpl entityProspectionImpl = new EntityProspectionImpl();

        entityProspectionImpl.setProspectionId(getProspectionId());
        entityProspectionImpl.setProspectionName(getProspectionName());
        entityProspectionImpl.setEventId(getEventId());

        entityProspectionImpl.resetOriginalValues();

        return entityProspectionImpl;
    }

    @Override
    public int compareTo(EntityProspection entityProspection) {
        int primaryKey = entityProspection.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityProspection)) {
            return false;
        }

        EntityProspection entityProspection = (EntityProspection) obj;

        int primaryKey = entityProspection.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
    }

    @Override
    public CacheModel<EntityProspection> toCacheModel() {
        EntityProspectionCacheModel entityProspectionCacheModel = new EntityProspectionCacheModel();

        entityProspectionCacheModel.prospectionId = getProspectionId();

        entityProspectionCacheModel.prospectionName = getProspectionName();

        String prospectionName = entityProspectionCacheModel.prospectionName;

        if ((prospectionName != null) && (prospectionName.length() == 0)) {
            entityProspectionCacheModel.prospectionName = null;
        }

        entityProspectionCacheModel.eventId = getEventId();

        return entityProspectionCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{prospectionId=");
        sb.append(getProspectionId());
        sb.append(", prospectionName=");
        sb.append(getProspectionName());
        sb.append(", eventId=");
        sb.append(getEventId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("com.consistent.ucwrt.model.EntityProspection");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>prospectionId</column-name><column-value><![CDATA[");
        sb.append(getProspectionId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>prospectionName</column-name><column-value><![CDATA[");
        sb.append(getProspectionName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>eventId</column-name><column-value><![CDATA[");
        sb.append(getEventId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
