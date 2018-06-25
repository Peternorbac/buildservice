package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntitySale;
import com.consistent.ucwrt.model.EntitySaleModel;
import com.consistent.ucwrt.model.EntitySaleSoap;

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
 * The base model implementation for the EntitySale service. Represents a row in the &quot;Sale&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.consistent.ucwrt.model.EntitySaleModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EntitySaleImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntitySaleImpl
 * @see com.consistent.ucwrt.model.EntitySale
 * @see com.consistent.ucwrt.model.EntitySaleModel
 * @generated
 */
@JSON(strict = true)
public class EntitySaleModelImpl extends BaseModelImpl<EntitySale>
    implements EntitySaleModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a entity sale model instance should use the {@link com.consistent.ucwrt.model.EntitySale} interface instead.
     */
    public static final String TABLE_NAME = "Sale";
    public static final Object[][] TABLE_COLUMNS = {
            { "saleId", Types.INTEGER },
            { "confirmBySale", Types.VARCHAR },
            { "deliveryDate", Types.TIMESTAMP },
            { "assurantCertificate", Types.VARCHAR },
            { "extendedWarranty", Types.VARCHAR },
            { "realGrossProfit", Types.DOUBLE },
            { "finalSalePrice", Types.DOUBLE },
            { "clientId", Types.INTEGER },
            { "employeeId", Types.INTEGER },
            { "salesPlaceId", Types.INTEGER },
            { "prospectionId", Types.INTEGER },
            { "wayPayId", Types.INTEGER }
        };
    public static final String TABLE_SQL_CREATE = "create table Sale (saleId INTEGER not null primary key,confirmBySale VARCHAR(75) null,deliveryDate DATE null,assurantCertificate VARCHAR(75) null,extendedWarranty VARCHAR(75) null,realGrossProfit DOUBLE,finalSalePrice DOUBLE,clientId INTEGER,employeeId INTEGER,salesPlaceId INTEGER,prospectionId INTEGER,wayPayId INTEGER)";
    public static final String TABLE_SQL_DROP = "drop table Sale";
    public static final String ORDER_BY_JPQL = " ORDER BY entitySale.saleId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY Sale.saleId ASC";
    public static final String DATA_SOURCE = "ucwrtDataSource";
    public static final String SESSION_FACTORY = "ucwrtSessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.consistent.ucwrt.model.EntitySale"),
            false);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.consistent.ucwrt.model.EntitySale"),
            false);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.consistent.ucwrt.model.EntitySale"));
    private static ClassLoader _classLoader = EntitySale.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            EntitySale.class
        };
    private int _saleId;
    private String _confirmBySale;
    private Date _deliveryDate;
    private String _assurantCertificate;
    private String _extendedWarranty;
    private double _realGrossProfit;
    private double _finalSalePrice;
    private int _clientId;
    private int _employeeId;
    private int _salesPlaceId;
    private int _prospectionId;
    private int _wayPayId;
    private EntitySale _escapedModel;

    public EntitySaleModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static EntitySale toModel(EntitySaleSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        EntitySale model = new EntitySaleImpl();

        model.setSaleId(soapModel.getSaleId());
        model.setConfirmBySale(soapModel.getConfirmBySale());
        model.setDeliveryDate(soapModel.getDeliveryDate());
        model.setAssurantCertificate(soapModel.getAssurantCertificate());
        model.setExtendedWarranty(soapModel.getExtendedWarranty());
        model.setRealGrossProfit(soapModel.getRealGrossProfit());
        model.setFinalSalePrice(soapModel.getFinalSalePrice());
        model.setClientId(soapModel.getClientId());
        model.setEmployeeId(soapModel.getEmployeeId());
        model.setSalesPlaceId(soapModel.getSalesPlaceId());
        model.setProspectionId(soapModel.getProspectionId());
        model.setWayPayId(soapModel.getWayPayId());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<EntitySale> toModels(EntitySaleSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<EntitySale> models = new ArrayList<EntitySale>(soapModels.length);

        for (EntitySaleSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public int getPrimaryKey() {
        return _saleId;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setSaleId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _saleId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
    }

    @Override
    public Class<?> getModelClass() {
        return EntitySale.class;
    }

    @Override
    public String getModelClassName() {
        return EntitySale.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("saleId", getSaleId());
        attributes.put("confirmBySale", getConfirmBySale());
        attributes.put("deliveryDate", getDeliveryDate());
        attributes.put("assurantCertificate", getAssurantCertificate());
        attributes.put("extendedWarranty", getExtendedWarranty());
        attributes.put("realGrossProfit", getRealGrossProfit());
        attributes.put("finalSalePrice", getFinalSalePrice());
        attributes.put("clientId", getClientId());
        attributes.put("employeeId", getEmployeeId());
        attributes.put("salesPlaceId", getSalesPlaceId());
        attributes.put("prospectionId", getProspectionId());
        attributes.put("wayPayId", getWayPayId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer saleId = (Integer) attributes.get("saleId");

        if (saleId != null) {
            setSaleId(saleId);
        }

        String confirmBySale = (String) attributes.get("confirmBySale");

        if (confirmBySale != null) {
            setConfirmBySale(confirmBySale);
        }

        Date deliveryDate = (Date) attributes.get("deliveryDate");

        if (deliveryDate != null) {
            setDeliveryDate(deliveryDate);
        }

        String assurantCertificate = (String) attributes.get(
                "assurantCertificate");

        if (assurantCertificate != null) {
            setAssurantCertificate(assurantCertificate);
        }

        String extendedWarranty = (String) attributes.get("extendedWarranty");

        if (extendedWarranty != null) {
            setExtendedWarranty(extendedWarranty);
        }

        Double realGrossProfit = (Double) attributes.get("realGrossProfit");

        if (realGrossProfit != null) {
            setRealGrossProfit(realGrossProfit);
        }

        Double finalSalePrice = (Double) attributes.get("finalSalePrice");

        if (finalSalePrice != null) {
            setFinalSalePrice(finalSalePrice);
        }

        Integer clientId = (Integer) attributes.get("clientId");

        if (clientId != null) {
            setClientId(clientId);
        }

        Integer employeeId = (Integer) attributes.get("employeeId");

        if (employeeId != null) {
            setEmployeeId(employeeId);
        }

        Integer salesPlaceId = (Integer) attributes.get("salesPlaceId");

        if (salesPlaceId != null) {
            setSalesPlaceId(salesPlaceId);
        }

        Integer prospectionId = (Integer) attributes.get("prospectionId");

        if (prospectionId != null) {
            setProspectionId(prospectionId);
        }

        Integer wayPayId = (Integer) attributes.get("wayPayId");

        if (wayPayId != null) {
            setWayPayId(wayPayId);
        }
    }

    @JSON
    @Override
    public int getSaleId() {
        return _saleId;
    }

    @Override
    public void setSaleId(int saleId) {
        _saleId = saleId;
    }

    @JSON
    @Override
    public String getConfirmBySale() {
        if (_confirmBySale == null) {
            return StringPool.BLANK;
        } else {
            return _confirmBySale;
        }
    }

    @Override
    public void setConfirmBySale(String confirmBySale) {
        _confirmBySale = confirmBySale;
    }

    @JSON
    @Override
    public Date getDeliveryDate() {
        return _deliveryDate;
    }

    @Override
    public void setDeliveryDate(Date deliveryDate) {
        _deliveryDate = deliveryDate;
    }

    @JSON
    @Override
    public String getAssurantCertificate() {
        if (_assurantCertificate == null) {
            return StringPool.BLANK;
        } else {
            return _assurantCertificate;
        }
    }

    @Override
    public void setAssurantCertificate(String assurantCertificate) {
        _assurantCertificate = assurantCertificate;
    }

    @JSON
    @Override
    public String getExtendedWarranty() {
        if (_extendedWarranty == null) {
            return StringPool.BLANK;
        } else {
            return _extendedWarranty;
        }
    }

    @Override
    public void setExtendedWarranty(String extendedWarranty) {
        _extendedWarranty = extendedWarranty;
    }

    @JSON
    @Override
    public double getRealGrossProfit() {
        return _realGrossProfit;
    }

    @Override
    public void setRealGrossProfit(double realGrossProfit) {
        _realGrossProfit = realGrossProfit;
    }

    @JSON
    @Override
    public double getFinalSalePrice() {
        return _finalSalePrice;
    }

    @Override
    public void setFinalSalePrice(double finalSalePrice) {
        _finalSalePrice = finalSalePrice;
    }

    @JSON
    @Override
    public int getClientId() {
        return _clientId;
    }

    @Override
    public void setClientId(int clientId) {
        _clientId = clientId;
    }

    @JSON
    @Override
    public int getEmployeeId() {
        return _employeeId;
    }

    @Override
    public void setEmployeeId(int employeeId) {
        _employeeId = employeeId;
    }

    @JSON
    @Override
    public int getSalesPlaceId() {
        return _salesPlaceId;
    }

    @Override
    public void setSalesPlaceId(int salesPlaceId) {
        _salesPlaceId = salesPlaceId;
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
    public int getWayPayId() {
        return _wayPayId;
    }

    @Override
    public void setWayPayId(int wayPayId) {
        _wayPayId = wayPayId;
    }

    @Override
    public EntitySale toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (EntitySale) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        EntitySaleImpl entitySaleImpl = new EntitySaleImpl();

        entitySaleImpl.setSaleId(getSaleId());
        entitySaleImpl.setConfirmBySale(getConfirmBySale());
        entitySaleImpl.setDeliveryDate(getDeliveryDate());
        entitySaleImpl.setAssurantCertificate(getAssurantCertificate());
        entitySaleImpl.setExtendedWarranty(getExtendedWarranty());
        entitySaleImpl.setRealGrossProfit(getRealGrossProfit());
        entitySaleImpl.setFinalSalePrice(getFinalSalePrice());
        entitySaleImpl.setClientId(getClientId());
        entitySaleImpl.setEmployeeId(getEmployeeId());
        entitySaleImpl.setSalesPlaceId(getSalesPlaceId());
        entitySaleImpl.setProspectionId(getProspectionId());
        entitySaleImpl.setWayPayId(getWayPayId());

        entitySaleImpl.resetOriginalValues();

        return entitySaleImpl;
    }

    @Override
    public int compareTo(EntitySale entitySale) {
        int primaryKey = entitySale.getPrimaryKey();

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

        if (!(obj instanceof EntitySale)) {
            return false;
        }

        EntitySale entitySale = (EntitySale) obj;

        int primaryKey = entitySale.getPrimaryKey();

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
    public CacheModel<EntitySale> toCacheModel() {
        EntitySaleCacheModel entitySaleCacheModel = new EntitySaleCacheModel();

        entitySaleCacheModel.saleId = getSaleId();

        entitySaleCacheModel.confirmBySale = getConfirmBySale();

        String confirmBySale = entitySaleCacheModel.confirmBySale;

        if ((confirmBySale != null) && (confirmBySale.length() == 0)) {
            entitySaleCacheModel.confirmBySale = null;
        }

        Date deliveryDate = getDeliveryDate();

        if (deliveryDate != null) {
            entitySaleCacheModel.deliveryDate = deliveryDate.getTime();
        } else {
            entitySaleCacheModel.deliveryDate = Long.MIN_VALUE;
        }

        entitySaleCacheModel.assurantCertificate = getAssurantCertificate();

        String assurantCertificate = entitySaleCacheModel.assurantCertificate;

        if ((assurantCertificate != null) &&
                (assurantCertificate.length() == 0)) {
            entitySaleCacheModel.assurantCertificate = null;
        }

        entitySaleCacheModel.extendedWarranty = getExtendedWarranty();

        String extendedWarranty = entitySaleCacheModel.extendedWarranty;

        if ((extendedWarranty != null) && (extendedWarranty.length() == 0)) {
            entitySaleCacheModel.extendedWarranty = null;
        }

        entitySaleCacheModel.realGrossProfit = getRealGrossProfit();

        entitySaleCacheModel.finalSalePrice = getFinalSalePrice();

        entitySaleCacheModel.clientId = getClientId();

        entitySaleCacheModel.employeeId = getEmployeeId();

        entitySaleCacheModel.salesPlaceId = getSalesPlaceId();

        entitySaleCacheModel.prospectionId = getProspectionId();

        entitySaleCacheModel.wayPayId = getWayPayId();

        return entitySaleCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(25);

        sb.append("{saleId=");
        sb.append(getSaleId());
        sb.append(", confirmBySale=");
        sb.append(getConfirmBySale());
        sb.append(", deliveryDate=");
        sb.append(getDeliveryDate());
        sb.append(", assurantCertificate=");
        sb.append(getAssurantCertificate());
        sb.append(", extendedWarranty=");
        sb.append(getExtendedWarranty());
        sb.append(", realGrossProfit=");
        sb.append(getRealGrossProfit());
        sb.append(", finalSalePrice=");
        sb.append(getFinalSalePrice());
        sb.append(", clientId=");
        sb.append(getClientId());
        sb.append(", employeeId=");
        sb.append(getEmployeeId());
        sb.append(", salesPlaceId=");
        sb.append(getSalesPlaceId());
        sb.append(", prospectionId=");
        sb.append(getProspectionId());
        sb.append(", wayPayId=");
        sb.append(getWayPayId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(40);

        sb.append("<model><model-name>");
        sb.append("com.consistent.ucwrt.model.EntitySale");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>saleId</column-name><column-value><![CDATA[");
        sb.append(getSaleId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>confirmBySale</column-name><column-value><![CDATA[");
        sb.append(getConfirmBySale());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>deliveryDate</column-name><column-value><![CDATA[");
        sb.append(getDeliveryDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>assurantCertificate</column-name><column-value><![CDATA[");
        sb.append(getAssurantCertificate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>extendedWarranty</column-name><column-value><![CDATA[");
        sb.append(getExtendedWarranty());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>realGrossProfit</column-name><column-value><![CDATA[");
        sb.append(getRealGrossProfit());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>finalSalePrice</column-name><column-value><![CDATA[");
        sb.append(getFinalSalePrice());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>clientId</column-name><column-value><![CDATA[");
        sb.append(getClientId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>employeeId</column-name><column-value><![CDATA[");
        sb.append(getEmployeeId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>salesPlaceId</column-name><column-value><![CDATA[");
        sb.append(getSalesPlaceId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>prospectionId</column-name><column-value><![CDATA[");
        sb.append(getProspectionId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>wayPayId</column-name><column-value><![CDATA[");
        sb.append(getWayPayId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
