package com.consistent.ucwrt.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the EntitySuburb service. Represents a row in the &quot;Suburb&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.consistent.ucwrt.model.impl.EntitySuburbModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.consistent.ucwrt.model.impl.EntitySuburbImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntitySuburb
 * @see com.consistent.ucwrt.model.impl.EntitySuburbImpl
 * @see com.consistent.ucwrt.model.impl.EntitySuburbModelImpl
 * @generated
 */
public interface EntitySuburbModel extends BaseModel<EntitySuburb> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a entity suburb model instance should use the {@link EntitySuburb} interface instead.
     */

    /**
     * Returns the primary key of this entity suburb.
     *
     * @return the primary key of this entity suburb
     */
    public int getPrimaryKey();

    /**
     * Sets the primary key of this entity suburb.
     *
     * @param primaryKey the primary key of this entity suburb
     */
    public void setPrimaryKey(int primaryKey);

    /**
     * Returns the suburb ID of this entity suburb.
     *
     * @return the suburb ID of this entity suburb
     */
    public int getSuburbId();

    /**
     * Sets the suburb ID of this entity suburb.
     *
     * @param suburbId the suburb ID of this entity suburb
     */
    public void setSuburbId(int suburbId);

    /**
     * Returns the suburb name of this entity suburb.
     *
     * @return the suburb name of this entity suburb
     */
    @AutoEscape
    public String getSuburbName();

    /**
     * Sets the suburb name of this entity suburb.
     *
     * @param suburbName the suburb name of this entity suburb
     */
    public void setSuburbName(String suburbName);

    /**
     * Returns the postal code of this entity suburb.
     *
     * @return the postal code of this entity suburb
     */
    @AutoEscape
    public String getPostalCode();

    /**
     * Sets the postal code of this entity suburb.
     *
     * @param postalCode the postal code of this entity suburb
     */
    public void setPostalCode(String postalCode);

    /**
     * Returns the municipal ID of this entity suburb.
     *
     * @return the municipal ID of this entity suburb
     */
    public int getMunicipalId();

    /**
     * Sets the municipal ID of this entity suburb.
     *
     * @param municipalId the municipal ID of this entity suburb
     */
    public void setMunicipalId(int municipalId);

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
    public int compareTo(EntitySuburb entitySuburb);

    @Override
    public int hashCode();

    @Override
    public CacheModel<EntitySuburb> toCacheModel();

    @Override
    public EntitySuburb toEscapedModel();

    @Override
    public EntitySuburb toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}