package com.consistent.ucwrt.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the EntityAddress service. Represents a row in the &quot;Address&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.consistent.ucwrt.model.impl.EntityAddressModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.consistent.ucwrt.model.impl.EntityAddressImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityAddress
 * @see com.consistent.ucwrt.model.impl.EntityAddressImpl
 * @see com.consistent.ucwrt.model.impl.EntityAddressModelImpl
 * @generated
 */
public interface EntityAddressModel extends BaseModel<EntityAddress> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a entity address model instance should use the {@link EntityAddress} interface instead.
     */

    /**
     * Returns the primary key of this entity address.
     *
     * @return the primary key of this entity address
     */
    public int getPrimaryKey();

    /**
     * Sets the primary key of this entity address.
     *
     * @param primaryKey the primary key of this entity address
     */
    public void setPrimaryKey(int primaryKey);

    /**
     * Returns the address ID of this entity address.
     *
     * @return the address ID of this entity address
     */
    public int getAddressId();

    /**
     * Sets the address ID of this entity address.
     *
     * @param addressId the address ID of this entity address
     */
    public void setAddressId(int addressId);

    /**
     * Returns the street of this entity address.
     *
     * @return the street of this entity address
     */
    @AutoEscape
    public String getStreet();

    /**
     * Sets the street of this entity address.
     *
     * @param street the street of this entity address
     */
    public void setStreet(String street);

    /**
     * Returns the interior number of this entity address.
     *
     * @return the interior number of this entity address
     */
    public int getInteriorNumber();

    /**
     * Sets the interior number of this entity address.
     *
     * @param interiorNumber the interior number of this entity address
     */
    public void setInteriorNumber(int interiorNumber);

    /**
     * Returns the exterior number of this entity address.
     *
     * @return the exterior number of this entity address
     */
    public int getExteriorNumber();

    /**
     * Sets the exterior number of this entity address.
     *
     * @param exteriorNumber the exterior number of this entity address
     */
    public void setExteriorNumber(int exteriorNumber);

    /**
     * Returns the client ID of this entity address.
     *
     * @return the client ID of this entity address
     */
    public int getClientId();

    /**
     * Sets the client ID of this entity address.
     *
     * @param clientId the client ID of this entity address
     */
    public void setClientId(int clientId);

    /**
     * Returns the municipal ID of this entity address.
     *
     * @return the municipal ID of this entity address
     */
    public int getMunicipalId();

    /**
     * Sets the municipal ID of this entity address.
     *
     * @param municipalId the municipal ID of this entity address
     */
    public void setMunicipalId(int municipalId);

    /**
     * Returns the state ID of this entity address.
     *
     * @return the state ID of this entity address
     */
    public int getStateId();

    /**
     * Sets the state ID of this entity address.
     *
     * @param stateId the state ID of this entity address
     */
    public void setStateId(int stateId);

    /**
     * Returns the suburb ID of this entity address.
     *
     * @return the suburb ID of this entity address
     */
    public int getSuburbId();

    /**
     * Sets the suburb ID of this entity address.
     *
     * @param suburbId the suburb ID of this entity address
     */
    public void setSuburbId(int suburbId);

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
    public int compareTo(EntityAddress entityAddress);

    @Override
    public int hashCode();

    @Override
    public CacheModel<EntityAddress> toCacheModel();

    @Override
    public EntityAddress toEscapedModel();

    @Override
    public EntityAddress toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
