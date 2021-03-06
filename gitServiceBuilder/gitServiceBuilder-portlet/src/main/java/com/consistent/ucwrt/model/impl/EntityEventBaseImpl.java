package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntityEvent;
import com.consistent.ucwrt.service.EntityEventLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the EntityEvent service. Represents a row in the &quot;Event&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EntityEventImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityEventImpl
 * @see com.consistent.ucwrt.model.EntityEvent
 * @generated
 */
public abstract class EntityEventBaseImpl extends EntityEventModelImpl
    implements EntityEvent {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a entity event model instance should use the {@link EntityEvent} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EntityEventLocalServiceUtil.addEntityEvent(this);
        } else {
            EntityEventLocalServiceUtil.updateEntityEvent(this);
        }
    }
}
