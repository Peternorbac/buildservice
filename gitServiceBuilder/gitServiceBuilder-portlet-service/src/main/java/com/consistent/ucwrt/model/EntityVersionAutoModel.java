package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.persistence.EntityVersionAutoPK;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the EntityVersionAuto service. Represents a row in the &quot;Version&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.consistent.ucwrt.model.impl.EntityVersionAutoModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.consistent.ucwrt.model.impl.EntityVersionAutoImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityVersionAuto
 * @see com.consistent.ucwrt.model.impl.EntityVersionAutoImpl
 * @see com.consistent.ucwrt.model.impl.EntityVersionAutoModelImpl
 * @generated
 */
public interface EntityVersionAutoModel extends BaseModel<EntityVersionAuto> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a entity version auto model instance should use the {@link EntityVersionAuto} interface instead.
     */

    /**
     * Returns the primary key of this entity version auto.
     *
     * @return the primary key of this entity version auto
     */
    public EntityVersionAutoPK getPrimaryKey();

    /**
     * Sets the primary key of this entity version auto.
     *
     * @param primaryKey the primary key of this entity version auto
     */
    public void setPrimaryKey(EntityVersionAutoPK primaryKey);

    /**
     * Returns the version ID of this entity version auto.
     *
     * @return the version ID of this entity version auto
     */
    public int getVersionId();

    /**
     * Sets the version ID of this entity version auto.
     *
     * @param versionId the version ID of this entity version auto
     */
    public void setVersionId(int versionId);

    /**
     * Returns the version name of this entity version auto.
     *
     * @return the version name of this entity version auto
     */
    @AutoEscape
    public String getVersionName();

    /**
     * Sets the version name of this entity version auto.
     *
     * @param versionName the version name of this entity version auto
     */
    public void setVersionName(String versionName);

    /**
     * Returns the version registration date of this entity version auto.
     *
     * @return the version registration date of this entity version auto
     */
    public Date getVersionRegistrationDate();

    /**
     * Sets the version registration date of this entity version auto.
     *
     * @param versionRegistrationDate the version registration date of this entity version auto
     */
    public void setVersionRegistrationDate(Date versionRegistrationDate);

    /**
     * Returns the version responsible user of this entity version auto.
     *
     * @return the version responsible user of this entity version auto
     */
    @AutoEscape
    public String getVersionResponsibleUser();

    /**
     * Sets the version responsible user of this entity version auto.
     *
     * @param versionResponsibleUser the version responsible user of this entity version auto
     */
    public void setVersionResponsibleUser(String versionResponsibleUser);

    /**
     * Returns the version register data of this entity version auto.
     *
     * @return the version register data of this entity version auto
     */
    @AutoEscape
    public String getVersionRegisterData();

    /**
     * Sets the version register data of this entity version auto.
     *
     * @param versionRegisterData the version register data of this entity version auto
     */
    public void setVersionRegisterData(String versionRegisterData);

    /**
     * Returns the purchase price of this entity version auto.
     *
     * @return the purchase price of this entity version auto
     */
    public double getPurchasePrice();

    /**
     * Sets the purchase price of this entity version auto.
     *
     * @param purchasePrice the purchase price of this entity version auto
     */
    public void setPurchasePrice(double purchasePrice);

    /**
     * Returns the sale price of this entity version auto.
     *
     * @return the sale price of this entity version auto
     */
    public double getSalePrice();

    /**
     * Sets the sale price of this entity version auto.
     *
     * @param salePrice the sale price of this entity version auto
     */
    public void setSalePrice(double salePrice);

    /**
     * Returns the purchase price dll of this entity version auto.
     *
     * @return the purchase price dll of this entity version auto
     */
    public double getPurchasePriceDll();

    /**
     * Sets the purchase price dll of this entity version auto.
     *
     * @param purchasePriceDll the purchase price dll of this entity version auto
     */
    public void setPurchasePriceDll(double purchasePriceDll);

    /**
     * Returns the typeload of this entity version auto.
     *
     * @return the typeload of this entity version auto
     */
    @AutoEscape
    public String getTypeload();

    /**
     * Sets the typeload of this entity version auto.
     *
     * @param typeload the typeload of this entity version auto
     */
    public void setTypeload(String typeload);

    /**
     * Returns the color name of this entity version auto.
     *
     * @return the color name of this entity version auto
     */
    @AutoEscape
    public String getColorName();

    /**
     * Sets the color name of this entity version auto.
     *
     * @param colorName the color name of this entity version auto
     */
    public void setColorName(String colorName);

    /**
     * Returns the model ID of this entity version auto.
     *
     * @return the model ID of this entity version auto
     */
    public int getModelId();

    /**
     * Sets the model ID of this entity version auto.
     *
     * @param modelId the model ID of this entity version auto
     */
    public void setModelId(int modelId);

    /**
     * Returns the brand ID of this entity version auto.
     *
     * @return the brand ID of this entity version auto
     */
    public int getBrandId();

    /**
     * Sets the brand ID of this entity version auto.
     *
     * @param brandId the brand ID of this entity version auto
     */
    public void setBrandId(int brandId);

    /**
     * Returns the year model of this entity version auto.
     *
     * @return the year model of this entity version auto
     */
    public int getYearModel();

    /**
     * Sets the year model of this entity version auto.
     *
     * @param yearModel the year model of this entity version auto
     */
    public void setYearModel(int yearModel);

    /**
     * Returns the class ID of this entity version auto.
     *
     * @return the class ID of this entity version auto
     */
    public int getClassId();

    /**
     * Sets the class ID of this entity version auto.
     *
     * @param classId the class ID of this entity version auto
     */
    public void setClassId(int classId);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(EntityVersionAuto entityVersionAuto);

    @Override
    public int hashCode();

    @Override
    public CacheModel<EntityVersionAuto> toCacheModel();

    @Override
    public EntityVersionAuto toEscapedModel();

    @Override
    public EntityVersionAuto toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}