package com.consistent.ucwrt.model.impl;

import com.consistent.ucwrt.model.EntityDealer;
import com.consistent.ucwrt.service.EntityDealerLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the EntityDealer service. Represents a row in the &quot;Dealer&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EntityDealerImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityDealerImpl
 * @see com.consistent.ucwrt.model.EntityDealer
 * @generated
 */
public abstract class EntityDealerBaseImpl extends EntityDealerModelImpl
    implements EntityDealer {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a entity dealer model instance should use the {@link EntityDealer} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EntityDealerLocalServiceUtil.addEntityDealer(this);
        } else {
            EntityDealerLocalServiceUtil.updateEntityDealer(this);
        }
    }
}
