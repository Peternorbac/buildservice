package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntityMonthlySalesGoal;
import com.consistent.ucwrt.model.EntityMonthlySalesGoalModel;
import com.consistent.ucwrt.model.EntityMonthlySalesGoalSoap;
import com.consistent.ucwrt.service.persistence.EntityMonthlySalesGoalPK;

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
 * The base model implementation for the EntityMonthlySalesGoal service. Represents a row in the &quot;MonthlySalesGoal&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.consistent.ucwrt.model.EntityMonthlySalesGoalModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EntityMonthlySalesGoalImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityMonthlySalesGoalImpl
 * @see com.consistent.ucwrt.model.EntityMonthlySalesGoal
 * @see com.consistent.ucwrt.model.EntityMonthlySalesGoalModel
 * @generated
 */
@JSON(strict = true)
public class EntityMonthlySalesGoalModelImpl extends BaseModelImpl<EntityMonthlySalesGoal>
    implements EntityMonthlySalesGoalModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a entity monthly sales goal model instance should use the {@link com.consistent.ucwrt.model.EntityMonthlySalesGoal} interface instead.
     */
    public static final String TABLE_NAME = "MonthlySalesGoal";
    public static final Object[][] TABLE_COLUMNS = {
            { "year", Types.INTEGER },
            { "dealerId", Types.VARCHAR },
            { "businessBrandName", Types.VARCHAR },
            { "descriptionMonthlyGoal", Types.VARCHAR },
            { "objectiveAnnual", Types.INTEGER },
            { "januaryGoal", Types.DOUBLE },
            { "februaryGoal", Types.DOUBLE },
            { "marchGoal", Types.DOUBLE },
            { "aprilGoal", Types.DOUBLE },
            { "mayGoal", Types.DOUBLE },
            { "juneGoal", Types.DOUBLE },
            { "julyGoal", Types.DOUBLE },
            { "augustGoal", Types.DOUBLE },
            { "septemberGoal", Types.DOUBLE },
            { "octoberGoal", Types.DOUBLE },
            { "novemberGoal", Types.DOUBLE },
            { "decemberGoal", Types.DOUBLE }
        };
    public static final String TABLE_SQL_CREATE = "create table MonthlySalesGoal (year INTEGER not null,dealerId VARCHAR(75) not null,businessBrandName VARCHAR(75) not null,descriptionMonthlyGoal VARCHAR(75) null,objectiveAnnual INTEGER,januaryGoal DOUBLE,februaryGoal DOUBLE,marchGoal DOUBLE,aprilGoal DOUBLE,mayGoal DOUBLE,juneGoal DOUBLE,julyGoal DOUBLE,augustGoal DOUBLE,septemberGoal DOUBLE,octoberGoal DOUBLE,novemberGoal DOUBLE,decemberGoal DOUBLE,primary key (year, dealerId, businessBrandName))";
    public static final String TABLE_SQL_DROP = "drop table MonthlySalesGoal";
    public static final String ORDER_BY_JPQL = " ORDER BY entityMonthlySalesGoal.id.year ASC, entityMonthlySalesGoal.id.dealerId ASC, entityMonthlySalesGoal.id.businessBrandName ASC";
    public static final String ORDER_BY_SQL = " ORDER BY MonthlySalesGoal.year ASC, MonthlySalesGoal.dealerId ASC, MonthlySalesGoal.businessBrandName ASC";
    public static final String DATA_SOURCE = "ucwrtDataSource";
    public static final String SESSION_FACTORY = "ucwrtSessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.consistent.ucwrt.model.EntityMonthlySalesGoal"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.consistent.ucwrt.model.EntityMonthlySalesGoal"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.consistent.ucwrt.model.EntityMonthlySalesGoal"));
    private static ClassLoader _classLoader = EntityMonthlySalesGoal.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            EntityMonthlySalesGoal.class
        };
    private int _year;
    private String _dealerId;
    private String _businessBrandName;
    private String _descriptionMonthlyGoal;
    private int _objectiveAnnual;
    private double _januaryGoal;
    private double _februaryGoal;
    private double _marchGoal;
    private double _aprilGoal;
    private double _mayGoal;
    private double _juneGoal;
    private double _julyGoal;
    private double _augustGoal;
    private double _septemberGoal;
    private double _octoberGoal;
    private double _novemberGoal;
    private double _decemberGoal;
    private EntityMonthlySalesGoal _escapedModel;

    public EntityMonthlySalesGoalModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static EntityMonthlySalesGoal toModel(
        EntityMonthlySalesGoalSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        EntityMonthlySalesGoal model = new EntityMonthlySalesGoalImpl();

        model.setYear(soapModel.getYear());
        model.setDealerId(soapModel.getDealerId());
        model.setBusinessBrandName(soapModel.getBusinessBrandName());
        model.setDescriptionMonthlyGoal(soapModel.getDescriptionMonthlyGoal());
        model.setObjectiveAnnual(soapModel.getObjectiveAnnual());
        model.setJanuaryGoal(soapModel.getJanuaryGoal());
        model.setFebruaryGoal(soapModel.getFebruaryGoal());
        model.setMarchGoal(soapModel.getMarchGoal());
        model.setAprilGoal(soapModel.getAprilGoal());
        model.setMayGoal(soapModel.getMayGoal());
        model.setJuneGoal(soapModel.getJuneGoal());
        model.setJulyGoal(soapModel.getJulyGoal());
        model.setAugustGoal(soapModel.getAugustGoal());
        model.setSeptemberGoal(soapModel.getSeptemberGoal());
        model.setOctoberGoal(soapModel.getOctoberGoal());
        model.setNovemberGoal(soapModel.getNovemberGoal());
        model.setDecemberGoal(soapModel.getDecemberGoal());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<EntityMonthlySalesGoal> toModels(
        EntityMonthlySalesGoalSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<EntityMonthlySalesGoal> models = new ArrayList<EntityMonthlySalesGoal>(soapModels.length);

        for (EntityMonthlySalesGoalSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public EntityMonthlySalesGoalPK getPrimaryKey() {
        return new EntityMonthlySalesGoalPK(_year, _dealerId, _businessBrandName);
    }

    @Override
    public void setPrimaryKey(EntityMonthlySalesGoalPK primaryKey) {
        setYear(primaryKey.year);
        setDealerId(primaryKey.dealerId);
        setBusinessBrandName(primaryKey.businessBrandName);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new EntityMonthlySalesGoalPK(_year, _dealerId, _businessBrandName);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((EntityMonthlySalesGoalPK) primaryKeyObj);
    }

    @Override
    public Class<?> getModelClass() {
        return EntityMonthlySalesGoal.class;
    }

    @Override
    public String getModelClassName() {
        return EntityMonthlySalesGoal.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("year", getYear());
        attributes.put("dealerId", getDealerId());
        attributes.put("businessBrandName", getBusinessBrandName());
        attributes.put("descriptionMonthlyGoal", getDescriptionMonthlyGoal());
        attributes.put("objectiveAnnual", getObjectiveAnnual());
        attributes.put("januaryGoal", getJanuaryGoal());
        attributes.put("februaryGoal", getFebruaryGoal());
        attributes.put("marchGoal", getMarchGoal());
        attributes.put("aprilGoal", getAprilGoal());
        attributes.put("mayGoal", getMayGoal());
        attributes.put("juneGoal", getJuneGoal());
        attributes.put("julyGoal", getJulyGoal());
        attributes.put("augustGoal", getAugustGoal());
        attributes.put("septemberGoal", getSeptemberGoal());
        attributes.put("octoberGoal", getOctoberGoal());
        attributes.put("novemberGoal", getNovemberGoal());
        attributes.put("decemberGoal", getDecemberGoal());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer year = (Integer) attributes.get("year");

        if (year != null) {
            setYear(year);
        }

        String dealerId = (String) attributes.get("dealerId");

        if (dealerId != null) {
            setDealerId(dealerId);
        }

        String businessBrandName = (String) attributes.get("businessBrandName");

        if (businessBrandName != null) {
            setBusinessBrandName(businessBrandName);
        }

        String descriptionMonthlyGoal = (String) attributes.get(
                "descriptionMonthlyGoal");

        if (descriptionMonthlyGoal != null) {
            setDescriptionMonthlyGoal(descriptionMonthlyGoal);
        }

        Integer objectiveAnnual = (Integer) attributes.get("objectiveAnnual");

        if (objectiveAnnual != null) {
            setObjectiveAnnual(objectiveAnnual);
        }

        Double januaryGoal = (Double) attributes.get("januaryGoal");

        if (januaryGoal != null) {
            setJanuaryGoal(januaryGoal);
        }

        Double februaryGoal = (Double) attributes.get("februaryGoal");

        if (februaryGoal != null) {
            setFebruaryGoal(februaryGoal);
        }

        Double marchGoal = (Double) attributes.get("marchGoal");

        if (marchGoal != null) {
            setMarchGoal(marchGoal);
        }

        Double aprilGoal = (Double) attributes.get("aprilGoal");

        if (aprilGoal != null) {
            setAprilGoal(aprilGoal);
        }

        Double mayGoal = (Double) attributes.get("mayGoal");

        if (mayGoal != null) {
            setMayGoal(mayGoal);
        }

        Double juneGoal = (Double) attributes.get("juneGoal");

        if (juneGoal != null) {
            setJuneGoal(juneGoal);
        }

        Double julyGoal = (Double) attributes.get("julyGoal");

        if (julyGoal != null) {
            setJulyGoal(julyGoal);
        }

        Double augustGoal = (Double) attributes.get("augustGoal");

        if (augustGoal != null) {
            setAugustGoal(augustGoal);
        }

        Double septemberGoal = (Double) attributes.get("septemberGoal");

        if (septemberGoal != null) {
            setSeptemberGoal(septemberGoal);
        }

        Double octoberGoal = (Double) attributes.get("octoberGoal");

        if (octoberGoal != null) {
            setOctoberGoal(octoberGoal);
        }

        Double novemberGoal = (Double) attributes.get("novemberGoal");

        if (novemberGoal != null) {
            setNovemberGoal(novemberGoal);
        }

        Double decemberGoal = (Double) attributes.get("decemberGoal");

        if (decemberGoal != null) {
            setDecemberGoal(decemberGoal);
        }
    }

    @JSON
    @Override
    public int getYear() {
        return _year;
    }

    @Override
    public void setYear(int year) {
        _year = year;
    }

    @JSON
    @Override
    public String getDealerId() {
        if (_dealerId == null) {
            return StringPool.BLANK;
        } else {
            return _dealerId;
        }
    }

    @Override
    public void setDealerId(String dealerId) {
        _dealerId = dealerId;
    }

    @JSON
    @Override
    public String getBusinessBrandName() {
        if (_businessBrandName == null) {
            return StringPool.BLANK;
        } else {
            return _businessBrandName;
        }
    }

    @Override
    public void setBusinessBrandName(String businessBrandName) {
        _businessBrandName = businessBrandName;
    }

    @JSON
    @Override
    public String getDescriptionMonthlyGoal() {
        if (_descriptionMonthlyGoal == null) {
            return StringPool.BLANK;
        } else {
            return _descriptionMonthlyGoal;
        }
    }

    @Override
    public void setDescriptionMonthlyGoal(String descriptionMonthlyGoal) {
        _descriptionMonthlyGoal = descriptionMonthlyGoal;
    }

    @JSON
    @Override
    public int getObjectiveAnnual() {
        return _objectiveAnnual;
    }

    @Override
    public void setObjectiveAnnual(int objectiveAnnual) {
        _objectiveAnnual = objectiveAnnual;
    }

    @JSON
    @Override
    public double getJanuaryGoal() {
        return _januaryGoal;
    }

    @Override
    public void setJanuaryGoal(double januaryGoal) {
        _januaryGoal = januaryGoal;
    }

    @JSON
    @Override
    public double getFebruaryGoal() {
        return _februaryGoal;
    }

    @Override
    public void setFebruaryGoal(double februaryGoal) {
        _februaryGoal = februaryGoal;
    }

    @JSON
    @Override
    public double getMarchGoal() {
        return _marchGoal;
    }

    @Override
    public void setMarchGoal(double marchGoal) {
        _marchGoal = marchGoal;
    }

    @JSON
    @Override
    public double getAprilGoal() {
        return _aprilGoal;
    }

    @Override
    public void setAprilGoal(double aprilGoal) {
        _aprilGoal = aprilGoal;
    }

    @JSON
    @Override
    public double getMayGoal() {
        return _mayGoal;
    }

    @Override
    public void setMayGoal(double mayGoal) {
        _mayGoal = mayGoal;
    }

    @JSON
    @Override
    public double getJuneGoal() {
        return _juneGoal;
    }

    @Override
    public void setJuneGoal(double juneGoal) {
        _juneGoal = juneGoal;
    }

    @JSON
    @Override
    public double getJulyGoal() {
        return _julyGoal;
    }

    @Override
    public void setJulyGoal(double julyGoal) {
        _julyGoal = julyGoal;
    }

    @JSON
    @Override
    public double getAugustGoal() {
        return _augustGoal;
    }

    @Override
    public void setAugustGoal(double augustGoal) {
        _augustGoal = augustGoal;
    }

    @JSON
    @Override
    public double getSeptemberGoal() {
        return _septemberGoal;
    }

    @Override
    public void setSeptemberGoal(double septemberGoal) {
        _septemberGoal = septemberGoal;
    }

    @JSON
    @Override
    public double getOctoberGoal() {
        return _octoberGoal;
    }

    @Override
    public void setOctoberGoal(double octoberGoal) {
        _octoberGoal = octoberGoal;
    }

    @JSON
    @Override
    public double getNovemberGoal() {
        return _novemberGoal;
    }

    @Override
    public void setNovemberGoal(double novemberGoal) {
        _novemberGoal = novemberGoal;
    }

    @JSON
    @Override
    public double getDecemberGoal() {
        return _decemberGoal;
    }

    @Override
    public void setDecemberGoal(double decemberGoal) {
        _decemberGoal = decemberGoal;
    }

    @Override
    public EntityMonthlySalesGoal toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (EntityMonthlySalesGoal) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        EntityMonthlySalesGoalImpl entityMonthlySalesGoalImpl = new EntityMonthlySalesGoalImpl();

        entityMonthlySalesGoalImpl.setYear(getYear());
        entityMonthlySalesGoalImpl.setDealerId(getDealerId());
        entityMonthlySalesGoalImpl.setBusinessBrandName(getBusinessBrandName());
        entityMonthlySalesGoalImpl.setDescriptionMonthlyGoal(getDescriptionMonthlyGoal());
        entityMonthlySalesGoalImpl.setObjectiveAnnual(getObjectiveAnnual());
        entityMonthlySalesGoalImpl.setJanuaryGoal(getJanuaryGoal());
        entityMonthlySalesGoalImpl.setFebruaryGoal(getFebruaryGoal());
        entityMonthlySalesGoalImpl.setMarchGoal(getMarchGoal());
        entityMonthlySalesGoalImpl.setAprilGoal(getAprilGoal());
        entityMonthlySalesGoalImpl.setMayGoal(getMayGoal());
        entityMonthlySalesGoalImpl.setJuneGoal(getJuneGoal());
        entityMonthlySalesGoalImpl.setJulyGoal(getJulyGoal());
        entityMonthlySalesGoalImpl.setAugustGoal(getAugustGoal());
        entityMonthlySalesGoalImpl.setSeptemberGoal(getSeptemberGoal());
        entityMonthlySalesGoalImpl.setOctoberGoal(getOctoberGoal());
        entityMonthlySalesGoalImpl.setNovemberGoal(getNovemberGoal());
        entityMonthlySalesGoalImpl.setDecemberGoal(getDecemberGoal());

        entityMonthlySalesGoalImpl.resetOriginalValues();

        return entityMonthlySalesGoalImpl;
    }

    @Override
    public int compareTo(EntityMonthlySalesGoal entityMonthlySalesGoal) {
        EntityMonthlySalesGoalPK primaryKey = entityMonthlySalesGoal.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityMonthlySalesGoal)) {
            return false;
        }

        EntityMonthlySalesGoal entityMonthlySalesGoal = (EntityMonthlySalesGoal) obj;

        EntityMonthlySalesGoalPK primaryKey = entityMonthlySalesGoal.getPrimaryKey();

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
    public CacheModel<EntityMonthlySalesGoal> toCacheModel() {
        EntityMonthlySalesGoalCacheModel entityMonthlySalesGoalCacheModel = new EntityMonthlySalesGoalCacheModel();

        entityMonthlySalesGoalCacheModel.year = getYear();

        entityMonthlySalesGoalCacheModel.dealerId = getDealerId();

        String dealerId = entityMonthlySalesGoalCacheModel.dealerId;

        if ((dealerId != null) && (dealerId.length() == 0)) {
            entityMonthlySalesGoalCacheModel.dealerId = null;
        }

        entityMonthlySalesGoalCacheModel.businessBrandName = getBusinessBrandName();

        String businessBrandName = entityMonthlySalesGoalCacheModel.businessBrandName;

        if ((businessBrandName != null) && (businessBrandName.length() == 0)) {
            entityMonthlySalesGoalCacheModel.businessBrandName = null;
        }

        entityMonthlySalesGoalCacheModel.descriptionMonthlyGoal = getDescriptionMonthlyGoal();

        String descriptionMonthlyGoal = entityMonthlySalesGoalCacheModel.descriptionMonthlyGoal;

        if ((descriptionMonthlyGoal != null) &&
                (descriptionMonthlyGoal.length() == 0)) {
            entityMonthlySalesGoalCacheModel.descriptionMonthlyGoal = null;
        }

        entityMonthlySalesGoalCacheModel.objectiveAnnual = getObjectiveAnnual();

        entityMonthlySalesGoalCacheModel.januaryGoal = getJanuaryGoal();

        entityMonthlySalesGoalCacheModel.februaryGoal = getFebruaryGoal();

        entityMonthlySalesGoalCacheModel.marchGoal = getMarchGoal();

        entityMonthlySalesGoalCacheModel.aprilGoal = getAprilGoal();

        entityMonthlySalesGoalCacheModel.mayGoal = getMayGoal();

        entityMonthlySalesGoalCacheModel.juneGoal = getJuneGoal();

        entityMonthlySalesGoalCacheModel.julyGoal = getJulyGoal();

        entityMonthlySalesGoalCacheModel.augustGoal = getAugustGoal();

        entityMonthlySalesGoalCacheModel.septemberGoal = getSeptemberGoal();

        entityMonthlySalesGoalCacheModel.octoberGoal = getOctoberGoal();

        entityMonthlySalesGoalCacheModel.novemberGoal = getNovemberGoal();

        entityMonthlySalesGoalCacheModel.decemberGoal = getDecemberGoal();

        return entityMonthlySalesGoalCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(35);

        sb.append("{year=");
        sb.append(getYear());
        sb.append(", dealerId=");
        sb.append(getDealerId());
        sb.append(", businessBrandName=");
        sb.append(getBusinessBrandName());
        sb.append(", descriptionMonthlyGoal=");
        sb.append(getDescriptionMonthlyGoal());
        sb.append(", objectiveAnnual=");
        sb.append(getObjectiveAnnual());
        sb.append(", januaryGoal=");
        sb.append(getJanuaryGoal());
        sb.append(", februaryGoal=");
        sb.append(getFebruaryGoal());
        sb.append(", marchGoal=");
        sb.append(getMarchGoal());
        sb.append(", aprilGoal=");
        sb.append(getAprilGoal());
        sb.append(", mayGoal=");
        sb.append(getMayGoal());
        sb.append(", juneGoal=");
        sb.append(getJuneGoal());
        sb.append(", julyGoal=");
        sb.append(getJulyGoal());
        sb.append(", augustGoal=");
        sb.append(getAugustGoal());
        sb.append(", septemberGoal=");
        sb.append(getSeptemberGoal());
        sb.append(", octoberGoal=");
        sb.append(getOctoberGoal());
        sb.append(", novemberGoal=");
        sb.append(getNovemberGoal());
        sb.append(", decemberGoal=");
        sb.append(getDecemberGoal());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(55);

        sb.append("<model><model-name>");
        sb.append("com.consistent.ucwrt.model.EntityMonthlySalesGoal");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>year</column-name><column-value><![CDATA[");
        sb.append(getYear());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dealerId</column-name><column-value><![CDATA[");
        sb.append(getDealerId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>businessBrandName</column-name><column-value><![CDATA[");
        sb.append(getBusinessBrandName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>descriptionMonthlyGoal</column-name><column-value><![CDATA[");
        sb.append(getDescriptionMonthlyGoal());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>objectiveAnnual</column-name><column-value><![CDATA[");
        sb.append(getObjectiveAnnual());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>januaryGoal</column-name><column-value><![CDATA[");
        sb.append(getJanuaryGoal());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>februaryGoal</column-name><column-value><![CDATA[");
        sb.append(getFebruaryGoal());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>marchGoal</column-name><column-value><![CDATA[");
        sb.append(getMarchGoal());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>aprilGoal</column-name><column-value><![CDATA[");
        sb.append(getAprilGoal());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>mayGoal</column-name><column-value><![CDATA[");
        sb.append(getMayGoal());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>juneGoal</column-name><column-value><![CDATA[");
        sb.append(getJuneGoal());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>julyGoal</column-name><column-value><![CDATA[");
        sb.append(getJulyGoal());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>augustGoal</column-name><column-value><![CDATA[");
        sb.append(getAugustGoal());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>septemberGoal</column-name><column-value><![CDATA[");
        sb.append(getSeptemberGoal());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>octoberGoal</column-name><column-value><![CDATA[");
        sb.append(getOctoberGoal());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>novemberGoal</column-name><column-value><![CDATA[");
        sb.append(getNovemberGoal());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>decemberGoal</column-name><column-value><![CDATA[");
        sb.append(getDecemberGoal());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
