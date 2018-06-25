package com.consistent.ucwrt.model;

import com.consistent.ucwrt.service.persistence.EntityMonthlySalesGoalPK;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the EntityMonthlySalesGoal service. Represents a row in the &quot;MonthlySalesGoal&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.consistent.ucwrt.model.impl.EntityMonthlySalesGoalModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.consistent.ucwrt.model.impl.EntityMonthlySalesGoalImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityMonthlySalesGoal
 * @see com.consistent.ucwrt.model.impl.EntityMonthlySalesGoalImpl
 * @see com.consistent.ucwrt.model.impl.EntityMonthlySalesGoalModelImpl
 * @generated
 */
public interface EntityMonthlySalesGoalModel extends BaseModel<EntityMonthlySalesGoal> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a entity monthly sales goal model instance should use the {@link EntityMonthlySalesGoal} interface instead.
     */

    /**
     * Returns the primary key of this entity monthly sales goal.
     *
     * @return the primary key of this entity monthly sales goal
     */
    public EntityMonthlySalesGoalPK getPrimaryKey();

    /**
     * Sets the primary key of this entity monthly sales goal.
     *
     * @param primaryKey the primary key of this entity monthly sales goal
     */
    public void setPrimaryKey(EntityMonthlySalesGoalPK primaryKey);

    /**
     * Returns the year of this entity monthly sales goal.
     *
     * @return the year of this entity monthly sales goal
     */
    public int getYear();

    /**
     * Sets the year of this entity monthly sales goal.
     *
     * @param year the year of this entity monthly sales goal
     */
    public void setYear(int year);

    /**
     * Returns the dealer ID of this entity monthly sales goal.
     *
     * @return the dealer ID of this entity monthly sales goal
     */
    @AutoEscape
    public String getDealerId();

    /**
     * Sets the dealer ID of this entity monthly sales goal.
     *
     * @param dealerId the dealer ID of this entity monthly sales goal
     */
    public void setDealerId(String dealerId);

    /**
     * Returns the business brand name of this entity monthly sales goal.
     *
     * @return the business brand name of this entity monthly sales goal
     */
    @AutoEscape
    public String getBusinessBrandName();

    /**
     * Sets the business brand name of this entity monthly sales goal.
     *
     * @param businessBrandName the business brand name of this entity monthly sales goal
     */
    public void setBusinessBrandName(String businessBrandName);

    /**
     * Returns the description monthly goal of this entity monthly sales goal.
     *
     * @return the description monthly goal of this entity monthly sales goal
     */
    @AutoEscape
    public String getDescriptionMonthlyGoal();

    /**
     * Sets the description monthly goal of this entity monthly sales goal.
     *
     * @param descriptionMonthlyGoal the description monthly goal of this entity monthly sales goal
     */
    public void setDescriptionMonthlyGoal(String descriptionMonthlyGoal);

    /**
     * Returns the objective annual of this entity monthly sales goal.
     *
     * @return the objective annual of this entity monthly sales goal
     */
    public int getObjectiveAnnual();

    /**
     * Sets the objective annual of this entity monthly sales goal.
     *
     * @param objectiveAnnual the objective annual of this entity monthly sales goal
     */
    public void setObjectiveAnnual(int objectiveAnnual);

    /**
     * Returns the january goal of this entity monthly sales goal.
     *
     * @return the january goal of this entity monthly sales goal
     */
    public double getJanuaryGoal();

    /**
     * Sets the january goal of this entity monthly sales goal.
     *
     * @param januaryGoal the january goal of this entity monthly sales goal
     */
    public void setJanuaryGoal(double januaryGoal);

    /**
     * Returns the february goal of this entity monthly sales goal.
     *
     * @return the february goal of this entity monthly sales goal
     */
    public double getFebruaryGoal();

    /**
     * Sets the february goal of this entity monthly sales goal.
     *
     * @param februaryGoal the february goal of this entity monthly sales goal
     */
    public void setFebruaryGoal(double februaryGoal);

    /**
     * Returns the march goal of this entity monthly sales goal.
     *
     * @return the march goal of this entity monthly sales goal
     */
    public double getMarchGoal();

    /**
     * Sets the march goal of this entity monthly sales goal.
     *
     * @param marchGoal the march goal of this entity monthly sales goal
     */
    public void setMarchGoal(double marchGoal);

    /**
     * Returns the april goal of this entity monthly sales goal.
     *
     * @return the april goal of this entity monthly sales goal
     */
    public double getAprilGoal();

    /**
     * Sets the april goal of this entity monthly sales goal.
     *
     * @param aprilGoal the april goal of this entity monthly sales goal
     */
    public void setAprilGoal(double aprilGoal);

    /**
     * Returns the may goal of this entity monthly sales goal.
     *
     * @return the may goal of this entity monthly sales goal
     */
    public double getMayGoal();

    /**
     * Sets the may goal of this entity monthly sales goal.
     *
     * @param mayGoal the may goal of this entity monthly sales goal
     */
    public void setMayGoal(double mayGoal);

    /**
     * Returns the june goal of this entity monthly sales goal.
     *
     * @return the june goal of this entity monthly sales goal
     */
    public double getJuneGoal();

    /**
     * Sets the june goal of this entity monthly sales goal.
     *
     * @param juneGoal the june goal of this entity monthly sales goal
     */
    public void setJuneGoal(double juneGoal);

    /**
     * Returns the july goal of this entity monthly sales goal.
     *
     * @return the july goal of this entity monthly sales goal
     */
    public double getJulyGoal();

    /**
     * Sets the july goal of this entity monthly sales goal.
     *
     * @param julyGoal the july goal of this entity monthly sales goal
     */
    public void setJulyGoal(double julyGoal);

    /**
     * Returns the august goal of this entity monthly sales goal.
     *
     * @return the august goal of this entity monthly sales goal
     */
    public double getAugustGoal();

    /**
     * Sets the august goal of this entity monthly sales goal.
     *
     * @param augustGoal the august goal of this entity monthly sales goal
     */
    public void setAugustGoal(double augustGoal);

    /**
     * Returns the september goal of this entity monthly sales goal.
     *
     * @return the september goal of this entity monthly sales goal
     */
    public double getSeptemberGoal();

    /**
     * Sets the september goal of this entity monthly sales goal.
     *
     * @param septemberGoal the september goal of this entity monthly sales goal
     */
    public void setSeptemberGoal(double septemberGoal);

    /**
     * Returns the october goal of this entity monthly sales goal.
     *
     * @return the october goal of this entity monthly sales goal
     */
    public double getOctoberGoal();

    /**
     * Sets the october goal of this entity monthly sales goal.
     *
     * @param octoberGoal the october goal of this entity monthly sales goal
     */
    public void setOctoberGoal(double octoberGoal);

    /**
     * Returns the november goal of this entity monthly sales goal.
     *
     * @return the november goal of this entity monthly sales goal
     */
    public double getNovemberGoal();

    /**
     * Sets the november goal of this entity monthly sales goal.
     *
     * @param novemberGoal the november goal of this entity monthly sales goal
     */
    public void setNovemberGoal(double novemberGoal);

    /**
     * Returns the december goal of this entity monthly sales goal.
     *
     * @return the december goal of this entity monthly sales goal
     */
    public double getDecemberGoal();

    /**
     * Sets the december goal of this entity monthly sales goal.
     *
     * @param decemberGoal the december goal of this entity monthly sales goal
     */
    public void setDecemberGoal(double decemberGoal);

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
    public int compareTo(EntityMonthlySalesGoal entityMonthlySalesGoal);

    @Override
    public int hashCode();

    @Override
    public CacheModel<EntityMonthlySalesGoal> toCacheModel();

    @Override
    public EntityMonthlySalesGoal toEscapedModel();

    @Override
    public EntityMonthlySalesGoal toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
