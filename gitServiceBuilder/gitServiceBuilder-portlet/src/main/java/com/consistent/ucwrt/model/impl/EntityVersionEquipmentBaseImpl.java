package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntityVersionEquipment;
import com.consistent.ucwrt.service.EntityVersionEquipmentLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the EntityVersionEquipment service. Represents a row in the &quot;VersionEquipment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EntityVersionEquipmentImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityVersionEquipmentImpl
 * @see com.consistent.ucwrt.model.EntityVersionEquipment
 * @generated
 */
public abstract class EntityVersionEquipmentBaseImpl
    extends EntityVersionEquipmentModelImpl implements EntityVersionEquipment {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a entity version equipment model instance should use the {@link EntityVersionEquipment} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EntityVersionEquipmentLocalServiceUtil.addEntityVersionEquipment(this);
        } else {
            EntityVersionEquipmentLocalServiceUtil.updateEntityVersionEquipment(this);
        }
    }
}
