package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntityVersionAuto;
import com.consistent.ucwrt.model.EntityVersionAutoModel;
import com.consistent.ucwrt.model.EntityVersionAutoSoap;
import com.consistent.ucwrt.service.persistence.EntityVersionAutoPK;

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
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the EntityVersionAuto service. Represents a row in the &quot;Version&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.consistent.ucwrt.model.EntityVersionAutoModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EntityVersionAutoImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityVersionAutoImpl
 * @see com.consistent.ucwrt.model.EntityVersionAuto
 * @see com.consistent.ucwrt.model.EntityVersionAutoModel
 * @generated
 */
@JSON(strict = true)
public class EntityVersionAutoModelImpl extends BaseModelImpl<EntityVersionAuto>
    implements EntityVersionAutoModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a entity version auto model instance should use the {@link com.consistent.ucwrt.model.EntityVersionAuto} interface instead.
     */
    public static final String TABLE_NAME = "Version";
    public static final Object[][] TABLE_COLUMNS = {
            { "versionId", Types.INTEGER },
            { "versionName", Types.VARCHAR },
            { "versionRegistrationDate", Types.TIMESTAMP },
            { "versionResponsibleUser", Types.VARCHAR },
            { "versionRegisterData", Types.VARCHAR },
            { "purchasePrice", Types.DOUBLE },
            { "salePrice", Types.DOUBLE },
            { "purchasePriceDll", Types.DOUBLE },
            { "typeload", Types.VARCHAR },
            { "colorName", Types.VARCHAR },
            { "modelId", Types.INTEGER },
            { "brandId", Types.INTEGER },
            { "yearModel", Types.INTEGER },
            { "classId", Types.INTEGER }
        };
    public static final String TABLE_SQL_CREATE = "create table Version (versionId INTEGER not null,versionName VARCHAR(75) null,versionRegistrationDate DATE null,versionResponsibleUser VARCHAR(75) null,versionRegisterData VARCHAR(75) null,purchasePrice DOUBLE,salePrice DOUBLE,purchasePriceDll DOUBLE,typeload VARCHAR(75) null,colorName VARCHAR(75) null,modelId INTEGER not null,brandId INTEGER not null,yearModel INTEGER not null,classId INTEGER,primary key (versionId, modelId, brandId, yearModel))";
    public static final String TABLE_SQL_DROP = "drop table Version";
    public static final String ORDER_BY_JPQL = " ORDER BY entityVersionAuto.id.versionId ASC, entityVersionAuto.id.modelId ASC, entityVersionAuto.id.brandId ASC, entityVersionAuto.id.yearModel ASC";
    public static final String ORDER_BY_SQL = " ORDER BY Version.versionId ASC, Version.modelId ASC, Version.brandId ASC, Version.yearModel ASC";
    public static final String DATA_SOURCE = "ucwrtDataSource";
    public static final String SESSION_FACTORY = "ucwrtSessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.consistent.ucwrt.model.EntityVersionAuto"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.consistent.ucwrt.model.EntityVersionAuto"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.consistent.ucwrt.model.EntityVersionAuto"),
            true);
    public static long BRANDID_COLUMN_BITMASK = 1L;
    public static long CLASSID_COLUMN_BITMASK = 2L;
    public static long MODELID_COLUMN_BITMASK = 4L;
    public static long PURCHASEPRICE_COLUMN_BITMASK = 8L;
    public static long SALEPRICE_COLUMN_BITMASK = 16L;
    public static long VERSIONNAME_COLUMN_BITMASK = 32L;
    public static long YEARMODEL_COLUMN_BITMASK = 64L;
    public static long VERSIONID_COLUMN_BITMASK = 128L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.consistent.ucwrt.model.EntityVersionAuto"));
    private static ClassLoader _classLoader = EntityVersionAuto.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            EntityVersionAuto.class
        };
    private int _versionId;
    private String _versionName;
    private String _originalVersionName;
    private Date _versionRegistrationDate;
    private String _versionResponsibleUser;
    private String _versionRegisterData;
    private double _purchasePrice;
    private double _originalPurchasePrice;
    private boolean _setOriginalPurchasePrice;
    private double _salePrice;
    private double _originalSalePrice;
    private boolean _setOriginalSalePrice;
    private double _purchasePriceDll;
    private String _typeload;
    private String _colorName;
    private int _modelId;
    private int _originalModelId;
    private boolean _setOriginalModelId;
    private int _brandId;
    private int _originalBrandId;
    private boolean _setOriginalBrandId;
    private int _yearModel;
    private int _originalYearModel;
    private boolean _setOriginalYearModel;
    private int _classId;
    private int _originalClassId;
    private boolean _setOriginalClassId;
    private long _columnBitmask;
    private EntityVersionAuto _escapedModel;

    public EntityVersionAutoModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static EntityVersionAuto toModel(EntityVersionAutoSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        EntityVersionAuto model = new EntityVersionAutoImpl();

        model.setVersionId(soapModel.getVersionId());
        model.setVersionName(soapModel.getVersionName());
        model.setVersionRegistrationDate(soapModel.getVersionRegistrationDate());
        model.setVersionResponsibleUser(soapModel.getVersionResponsibleUser());
        model.setVersionRegisterData(soapModel.getVersionRegisterData());
        model.setPurchasePrice(soapModel.getPurchasePrice());
        model.setSalePrice(soapModel.getSalePrice());
        model.setPurchasePriceDll(soapModel.getPurchasePriceDll());
        model.setTypeload(soapModel.getTypeload());
        model.setColorName(soapModel.getColorName());
        model.setModelId(soapModel.getModelId());
        model.setBrandId(soapModel.getBrandId());
        model.setYearModel(soapModel.getYearModel());
        model.setClassId(soapModel.getClassId());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<EntityVersionAuto> toModels(
        EntityVersionAutoSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<EntityVersionAuto> models = new ArrayList<EntityVersionAuto>(soapModels.length);

        for (EntityVersionAutoSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public EntityVersionAutoPK getPrimaryKey() {
        return new EntityVersionAutoPK(_versionId, _modelId, _brandId,
            _yearModel);
    }

    @Override
    public void setPrimaryKey(EntityVersionAutoPK primaryKey) {
        setVersionId(primaryKey.versionId);
        setModelId(primaryKey.modelId);
        setBrandId(primaryKey.brandId);
        setYearModel(primaryKey.yearModel);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new EntityVersionAutoPK(_versionId, _modelId, _brandId,
            _yearModel);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((EntityVersionAutoPK) primaryKeyObj);
    }

    @Override
    public Class<?> getModelClass() {
        return EntityVersionAuto.class;
    }

    @Override
    public String getModelClassName() {
        return EntityVersionAuto.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("versionId", getVersionId());
        attributes.put("versionName", getVersionName());
        attributes.put("versionRegistrationDate", getVersionRegistrationDate());
        attributes.put("versionResponsibleUser", getVersionResponsibleUser());
        attributes.put("versionRegisterData", getVersionRegisterData());
        attributes.put("purchasePrice", getPurchasePrice());
        attributes.put("salePrice", getSalePrice());
        attributes.put("purchasePriceDll", getPurchasePriceDll());
        attributes.put("typeload", getTypeload());
        attributes.put("colorName", getColorName());
        attributes.put("modelId", getModelId());
        attributes.put("brandId", getBrandId());
        attributes.put("yearModel", getYearModel());
        attributes.put("classId", getClassId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer versionId = (Integer) attributes.get("versionId");

        if (versionId != null) {
            setVersionId(versionId);
        }

        String versionName = (String) attributes.get("versionName");

        if (versionName != null) {
            setVersionName(versionName);
        }

        Date versionRegistrationDate = (Date) attributes.get(
                "versionRegistrationDate");

        if (versionRegistrationDate != null) {
            setVersionRegistrationDate(versionRegistrationDate);
        }

        String versionResponsibleUser = (String) attributes.get(
                "versionResponsibleUser");

        if (versionResponsibleUser != null) {
            setVersionResponsibleUser(versionResponsibleUser);
        }

        String versionRegisterData = (String) attributes.get(
                "versionRegisterData");

        if (versionRegisterData != null) {
            setVersionRegisterData(versionRegisterData);
        }

        Double purchasePrice = (Double) attributes.get("purchasePrice");

        if (purchasePrice != null) {
            setPurchasePrice(purchasePrice);
        }

        Double salePrice = (Double) attributes.get("salePrice");

        if (salePrice != null) {
            setSalePrice(salePrice);
        }

        Double purchasePriceDll = (Double) attributes.get("purchasePriceDll");

        if (purchasePriceDll != null) {
            setPurchasePriceDll(purchasePriceDll);
        }

        String typeload = (String) attributes.get("typeload");

        if (typeload != null) {
            setTypeload(typeload);
        }

        String colorName = (String) attributes.get("colorName");

        if (colorName != null) {
            setColorName(colorName);
        }

        Integer modelId = (Integer) attributes.get("modelId");

        if (modelId != null) {
            setModelId(modelId);
        }

        Integer brandId = (Integer) attributes.get("brandId");

        if (brandId != null) {
            setBrandId(brandId);
        }

        Integer yearModel = (Integer) attributes.get("yearModel");

        if (yearModel != null) {
            setYearModel(yearModel);
        }

        Integer classId = (Integer) attributes.get("classId");

        if (classId != null) {
            setClassId(classId);
        }
    }

    @JSON
    @Override
    public int getVersionId() {
        return _versionId;
    }

    @Override
    public void setVersionId(int versionId) {
        _versionId = versionId;
    }

    @JSON
    @Override
    public String getVersionName() {
        if (_versionName == null) {
            return StringPool.BLANK;
        } else {
            return _versionName;
        }
    }

    @Override
    public void setVersionName(String versionName) {
        _columnBitmask |= VERSIONNAME_COLUMN_BITMASK;

        if (_originalVersionName == null) {
            _originalVersionName = _versionName;
        }

        _versionName = versionName;
    }

    public String getOriginalVersionName() {
        return GetterUtil.getString(_originalVersionName);
    }

    @JSON
    @Override
    public Date getVersionRegistrationDate() {
        return _versionRegistrationDate;
    }

    @Override
    public void setVersionRegistrationDate(Date versionRegistrationDate) {
        _versionRegistrationDate = versionRegistrationDate;
    }

    @JSON
    @Override
    public String getVersionResponsibleUser() {
        if (_versionResponsibleUser == null) {
            return StringPool.BLANK;
        } else {
            return _versionResponsibleUser;
        }
    }

    @Override
    public void setVersionResponsibleUser(String versionResponsibleUser) {
        _versionResponsibleUser = versionResponsibleUser;
    }

    @JSON
    @Override
    public String getVersionRegisterData() {
        if (_versionRegisterData == null) {
            return StringPool.BLANK;
        } else {
            return _versionRegisterData;
        }
    }

    @Override
    public void setVersionRegisterData(String versionRegisterData) {
        _versionRegisterData = versionRegisterData;
    }

    @JSON
    @Override
    public double getPurchasePrice() {
        return _purchasePrice;
    }

    @Override
    public void setPurchasePrice(double purchasePrice) {
        _columnBitmask |= PURCHASEPRICE_COLUMN_BITMASK;

        if (!_setOriginalPurchasePrice) {
            _setOriginalPurchasePrice = true;

            _originalPurchasePrice = _purchasePrice;
        }

        _purchasePrice = purchasePrice;
    }

    public double getOriginalPurchasePrice() {
        return _originalPurchasePrice;
    }

    @JSON
    @Override
    public double getSalePrice() {
        return _salePrice;
    }

    @Override
    public void setSalePrice(double salePrice) {
        _columnBitmask |= SALEPRICE_COLUMN_BITMASK;

        if (!_setOriginalSalePrice) {
            _setOriginalSalePrice = true;

            _originalSalePrice = _salePrice;
        }

        _salePrice = salePrice;
    }

    public double getOriginalSalePrice() {
        return _originalSalePrice;
    }

    @JSON
    @Override
    public double getPurchasePriceDll() {
        return _purchasePriceDll;
    }

    @Override
    public void setPurchasePriceDll(double purchasePriceDll) {
        _purchasePriceDll = purchasePriceDll;
    }

    @JSON
    @Override
    public String getTypeload() {
        if (_typeload == null) {
            return StringPool.BLANK;
        } else {
            return _typeload;
        }
    }

    @Override
    public void setTypeload(String typeload) {
        _typeload = typeload;
    }

    @JSON
    @Override
    public String getColorName() {
        if (_colorName == null) {
            return StringPool.BLANK;
        } else {
            return _colorName;
        }
    }

    @Override
    public void setColorName(String colorName) {
        _colorName = colorName;
    }

    @JSON
    @Override
    public int getModelId() {
        return _modelId;
    }

    @Override
    public void setModelId(int modelId) {
        _columnBitmask |= MODELID_COLUMN_BITMASK;

        if (!_setOriginalModelId) {
            _setOriginalModelId = true;

            _originalModelId = _modelId;
        }

        _modelId = modelId;
    }

    public int getOriginalModelId() {
        return _originalModelId;
    }

    @JSON
    @Override
    public int getBrandId() {
        return _brandId;
    }

    @Override
    public void setBrandId(int brandId) {
        _columnBitmask |= BRANDID_COLUMN_BITMASK;

        if (!_setOriginalBrandId) {
            _setOriginalBrandId = true;

            _originalBrandId = _brandId;
        }

        _brandId = brandId;
    }

    public int getOriginalBrandId() {
        return _originalBrandId;
    }

    @JSON
    @Override
    public int getYearModel() {
        return _yearModel;
    }

    @Override
    public void setYearModel(int yearModel) {
        _columnBitmask |= YEARMODEL_COLUMN_BITMASK;

        if (!_setOriginalYearModel) {
            _setOriginalYearModel = true;

            _originalYearModel = _yearModel;
        }

        _yearModel = yearModel;
    }

    public int getOriginalYearModel() {
        return _originalYearModel;
    }

    @JSON
    @Override
    public int getClassId() {
        return _classId;
    }

    @Override
    public void setClassId(int classId) {
        _columnBitmask |= CLASSID_COLUMN_BITMASK;

        if (!_setOriginalClassId) {
            _setOriginalClassId = true;

            _originalClassId = _classId;
        }

        _classId = classId;
    }

    public int getOriginalClassId() {
        return _originalClassId;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public EntityVersionAuto toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (EntityVersionAuto) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        EntityVersionAutoImpl entityVersionAutoImpl = new EntityVersionAutoImpl();

        entityVersionAutoImpl.setVersionId(getVersionId());
        entityVersionAutoImpl.setVersionName(getVersionName());
        entityVersionAutoImpl.setVersionRegistrationDate(getVersionRegistrationDate());
        entityVersionAutoImpl.setVersionResponsibleUser(getVersionResponsibleUser());
        entityVersionAutoImpl.setVersionRegisterData(getVersionRegisterData());
        entityVersionAutoImpl.setPurchasePrice(getPurchasePrice());
        entityVersionAutoImpl.setSalePrice(getSalePrice());
        entityVersionAutoImpl.setPurchasePriceDll(getPurchasePriceDll());
        entityVersionAutoImpl.setTypeload(getTypeload());
        entityVersionAutoImpl.setColorName(getColorName());
        entityVersionAutoImpl.setModelId(getModelId());
        entityVersionAutoImpl.setBrandId(getBrandId());
        entityVersionAutoImpl.setYearModel(getYearModel());
        entityVersionAutoImpl.setClassId(getClassId());

        entityVersionAutoImpl.resetOriginalValues();

        return entityVersionAutoImpl;
    }

    @Override
    public int compareTo(EntityVersionAuto entityVersionAuto) {
        EntityVersionAutoPK primaryKey = entityVersionAuto.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityVersionAuto)) {
            return false;
        }

        EntityVersionAuto entityVersionAuto = (EntityVersionAuto) obj;

        EntityVersionAutoPK primaryKey = entityVersionAuto.getPrimaryKey();

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
        EntityVersionAutoModelImpl entityVersionAutoModelImpl = this;

        entityVersionAutoModelImpl._originalVersionName = entityVersionAutoModelImpl._versionName;

        entityVersionAutoModelImpl._originalPurchasePrice = entityVersionAutoModelImpl._purchasePrice;

        entityVersionAutoModelImpl._setOriginalPurchasePrice = false;

        entityVersionAutoModelImpl._originalSalePrice = entityVersionAutoModelImpl._salePrice;

        entityVersionAutoModelImpl._setOriginalSalePrice = false;

        entityVersionAutoModelImpl._originalModelId = entityVersionAutoModelImpl._modelId;

        entityVersionAutoModelImpl._setOriginalModelId = false;

        entityVersionAutoModelImpl._originalBrandId = entityVersionAutoModelImpl._brandId;

        entityVersionAutoModelImpl._setOriginalBrandId = false;

        entityVersionAutoModelImpl._originalYearModel = entityVersionAutoModelImpl._yearModel;

        entityVersionAutoModelImpl._setOriginalYearModel = false;

        entityVersionAutoModelImpl._originalClassId = entityVersionAutoModelImpl._classId;

        entityVersionAutoModelImpl._setOriginalClassId = false;

        entityVersionAutoModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<EntityVersionAuto> toCacheModel() {
        EntityVersionAutoCacheModel entityVersionAutoCacheModel = new EntityVersionAutoCacheModel();

        entityVersionAutoCacheModel.versionId = getVersionId();

        entityVersionAutoCacheModel.versionName = getVersionName();

        String versionName = entityVersionAutoCacheModel.versionName;

        if ((versionName != null) && (versionName.length() == 0)) {
            entityVersionAutoCacheModel.versionName = null;
        }

        Date versionRegistrationDate = getVersionRegistrationDate();

        if (versionRegistrationDate != null) {
            entityVersionAutoCacheModel.versionRegistrationDate = versionRegistrationDate.getTime();
        } else {
            entityVersionAutoCacheModel.versionRegistrationDate = Long.MIN_VALUE;
        }

        entityVersionAutoCacheModel.versionResponsibleUser = getVersionResponsibleUser();

        String versionResponsibleUser = entityVersionAutoCacheModel.versionResponsibleUser;

        if ((versionResponsibleUser != null) &&
                (versionResponsibleUser.length() == 0)) {
            entityVersionAutoCacheModel.versionResponsibleUser = null;
        }

        entityVersionAutoCacheModel.versionRegisterData = getVersionRegisterData();

        String versionRegisterData = entityVersionAutoCacheModel.versionRegisterData;

        if ((versionRegisterData != null) &&
                (versionRegisterData.length() == 0)) {
            entityVersionAutoCacheModel.versionRegisterData = null;
        }

        entityVersionAutoCacheModel.purchasePrice = getPurchasePrice();

        entityVersionAutoCacheModel.salePrice = getSalePrice();

        entityVersionAutoCacheModel.purchasePriceDll = getPurchasePriceDll();

        entityVersionAutoCacheModel.typeload = getTypeload();

        String typeload = entityVersionAutoCacheModel.typeload;

        if ((typeload != null) && (typeload.length() == 0)) {
            entityVersionAutoCacheModel.typeload = null;
        }

        entityVersionAutoCacheModel.colorName = getColorName();

        String colorName = entityVersionAutoCacheModel.colorName;

        if ((colorName != null) && (colorName.length() == 0)) {
            entityVersionAutoCacheModel.colorName = null;
        }

        entityVersionAutoCacheModel.modelId = getModelId();

        entityVersionAutoCacheModel.brandId = getBrandId();

        entityVersionAutoCacheModel.yearModel = getYearModel();

        entityVersionAutoCacheModel.classId = getClassId();

        return entityVersionAutoCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(29);

        sb.append("{versionId=");
        sb.append(getVersionId());
        sb.append(", versionName=");
        sb.append(getVersionName());
        sb.append(", versionRegistrationDate=");
        sb.append(getVersionRegistrationDate());
        sb.append(", versionResponsibleUser=");
        sb.append(getVersionResponsibleUser());
        sb.append(", versionRegisterData=");
        sb.append(getVersionRegisterData());
        sb.append(", purchasePrice=");
        sb.append(getPurchasePrice());
        sb.append(", salePrice=");
        sb.append(getSalePrice());
        sb.append(", purchasePriceDll=");
        sb.append(getPurchasePriceDll());
        sb.append(", typeload=");
        sb.append(getTypeload());
        sb.append(", colorName=");
        sb.append(getColorName());
        sb.append(", modelId=");
        sb.append(getModelId());
        sb.append(", brandId=");
        sb.append(getBrandId());
        sb.append(", yearModel=");
        sb.append(getYearModel());
        sb.append(", classId=");
        sb.append(getClassId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(46);

        sb.append("<model><model-name>");
        sb.append("com.consistent.ucwrt.model.EntityVersionAuto");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>versionId</column-name><column-value><![CDATA[");
        sb.append(getVersionId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>versionName</column-name><column-value><![CDATA[");
        sb.append(getVersionName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>versionRegistrationDate</column-name><column-value><![CDATA[");
        sb.append(getVersionRegistrationDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>versionResponsibleUser</column-name><column-value><![CDATA[");
        sb.append(getVersionResponsibleUser());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>versionRegisterData</column-name><column-value><![CDATA[");
        sb.append(getVersionRegisterData());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>purchasePrice</column-name><column-value><![CDATA[");
        sb.append(getPurchasePrice());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>salePrice</column-name><column-value><![CDATA[");
        sb.append(getSalePrice());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>purchasePriceDll</column-name><column-value><![CDATA[");
        sb.append(getPurchasePriceDll());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>typeload</column-name><column-value><![CDATA[");
        sb.append(getTypeload());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>colorName</column-name><column-value><![CDATA[");
        sb.append(getColorName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modelId</column-name><column-value><![CDATA[");
        sb.append(getModelId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>brandId</column-name><column-value><![CDATA[");
        sb.append(getBrandId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>yearModel</column-name><column-value><![CDATA[");
        sb.append(getYearModel());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>classId</column-name><column-value><![CDATA[");
        sb.append(getClassId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
