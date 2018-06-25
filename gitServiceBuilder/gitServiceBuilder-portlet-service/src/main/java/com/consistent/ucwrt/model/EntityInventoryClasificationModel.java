package com.consistent.ucwrt.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the EntityInventoryClasification service. Represents a row in the &quot;InventoryClasification&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.consistent.ucwrt.model.impl.EntityInventoryClasificationModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.consistent.ucwrt.model.impl.EntityInventoryClasificationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityInventoryClasification
 * @see com.consistent.ucwrt.model.impl.EntityInventoryClasificationImpl
 * @see com.consistent.ucwrt.model.impl.EntityInventoryClasificationModelImpl
 * @generated
 */
public interface EntityInventoryClasificationModel extends BaseModel<EntityInventoryClasification> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a entity inventory clasification model instance should use the {@link EntityInventoryClasification} interface instead.
     */

    /**
     * Returns the primary key of this entity inventory clasification.
     *
     * @return the primary key of this entity inventory clasification
     */
    public int getPrimaryKey();

    /**
     * Sets the primary key of this entity inventory clasification.
     *
     * @param primaryKey the primary key of this entity inventory clasification
     */
    public void setPrimaryKey(int primaryKey);

    /**
     * Returns the inventory clasification ID of this entity inventory clasification.
     *
     * @return the inventory clasification ID of this entity inventory clasification
     */
    public int getInventoryClasificationId();

    /**
     * Sets the inventory clasification ID of this entity inventory clasification.
     *
     * @param inventoryClasificationId the inventory clasification ID of this entity inventory clasification
     */
    public void setInventoryClasificationId(int inventoryClasificationId);

    /**
     * Returns the inventory clasification of this entity inventory clasification.
     *
     * @return the inventory clasification of this entity inventory clasification
     */
    @AutoEscape
    public String getInventoryClasification();

    /**
     * Sets the inventory clasification of this entity inventory clasification.
     *
     * @param inventoryClasification the inventory clasification of this entity inventory clasification
     */
    public void setInventoryClasification(String inventoryClasification);

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
    public int compareTo(
        EntityInventoryClasification entityInventoryClasification);

    @Override
    public int hashCode();

    @Override
    public CacheModel<EntityInventoryClasification> toCacheModel();

    @Override
    public EntityInventoryClasification toEscapedModel();

    @Override
    public EntityInventoryClasification toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
