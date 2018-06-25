package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntityStatus;
import com.consistent.ucwrt.service.EntityStatusLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the EntityStatus service. Represents a row in the &quot;Status&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EntityStatusImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityStatusImpl
 * @see com.consistent.ucwrt.model.EntityStatus
 * @generated
 */
public abstract class EntityStatusBaseImpl extends EntityStatusModelImpl
    implements EntityStatus {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a entity status model instance should use the {@link EntityStatus} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EntityStatusLocalServiceUtil.addEntityStatus(this);
        } else {
            EntityStatusLocalServiceUtil.updateEntityStatus(this);
        }
    }
}
