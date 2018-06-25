package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntityEquipment;
import com.consistent.ucwrt.service.EntityEquipmentLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the EntityEquipment service. Represents a row in the &quot;Equipment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EntityEquipmentImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityEquipmentImpl
 * @see com.consistent.ucwrt.model.EntityEquipment
 * @generated
 */
public abstract class EntityEquipmentBaseImpl extends EntityEquipmentModelImpl
    implements EntityEquipment {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a entity equipment model instance should use the {@link EntityEquipment} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EntityEquipmentLocalServiceUtil.addEntityEquipment(this);
        } else {
            EntityEquipmentLocalServiceUtil.updateEntityEquipment(this);
        }
    }
}