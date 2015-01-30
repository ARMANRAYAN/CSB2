package com.arman.csb.modules.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.StagedGroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Invoice service. Represents a row in the &quot;CSBModules_Invoice&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.arman.csb.modules.model.impl.InvoiceModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.arman.csb.modules.model.impl.InvoiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Invoice
 * @see com.arman.csb.modules.model.impl.InvoiceImpl
 * @see com.arman.csb.modules.model.impl.InvoiceModelImpl
 * @generated
 */
public interface InvoiceModel extends BaseModel<Invoice>, StagedGroupedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a invoice model instance should use the {@link Invoice} interface instead.
     */

    /**
     * Returns the primary key of this invoice.
     *
     * @return the primary key of this invoice
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this invoice.
     *
     * @param primaryKey the primary key of this invoice
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the uuid of this invoice.
     *
     * @return the uuid of this invoice
     */
    @AutoEscape
    @Override
    public String getUuid();

    /**
     * Sets the uuid of this invoice.
     *
     * @param uuid the uuid of this invoice
     */
    @Override
    public void setUuid(String uuid);

    /**
     * Returns the ID of this invoice.
     *
     * @return the ID of this invoice
     */
    public long getId();

    /**
     * Sets the ID of this invoice.
     *
     * @param id the ID of this invoice
     */
    public void setId(long id);

    /**
     * Returns the group ID of this invoice.
     *
     * @return the group ID of this invoice
     */
    @Override
    public long getGroupId();

    /**
     * Sets the group ID of this invoice.
     *
     * @param groupId the group ID of this invoice
     */
    @Override
    public void setGroupId(long groupId);

    /**
     * Returns the company ID of this invoice.
     *
     * @return the company ID of this invoice
     */
    @Override
    public long getCompanyId();

    /**
     * Sets the company ID of this invoice.
     *
     * @param companyId the company ID of this invoice
     */
    @Override
    public void setCompanyId(long companyId);

    /**
     * Returns the user ID of this invoice.
     *
     * @return the user ID of this invoice
     */
    @Override
    public long getUserId();

    /**
     * Sets the user ID of this invoice.
     *
     * @param userId the user ID of this invoice
     */
    @Override
    public void setUserId(long userId);

    /**
     * Returns the user uuid of this invoice.
     *
     * @return the user uuid of this invoice
     * @throws SystemException if a system exception occurred
     */
    @Override
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this invoice.
     *
     * @param userUuid the user uuid of this invoice
     */
    @Override
    public void setUserUuid(String userUuid);

    /**
     * Returns the user name of this invoice.
     *
     * @return the user name of this invoice
     */
    @AutoEscape
    @Override
    public String getUserName();

    /**
     * Sets the user name of this invoice.
     *
     * @param userName the user name of this invoice
     */
    @Override
    public void setUserName(String userName);

    /**
     * Returns the create date of this invoice.
     *
     * @return the create date of this invoice
     */
    @Override
    public Date getCreateDate();

    /**
     * Sets the create date of this invoice.
     *
     * @param createDate the create date of this invoice
     */
    @Override
    public void setCreateDate(Date createDate);

    /**
     * Returns the modified date of this invoice.
     *
     * @return the modified date of this invoice
     */
    @Override
    public Date getModifiedDate();

    /**
     * Sets the modified date of this invoice.
     *
     * @param modifiedDate the modified date of this invoice
     */
    @Override
    public void setModifiedDate(Date modifiedDate);

    /**
     * Returns the customer ID of this invoice.
     *
     * @return the customer ID of this invoice
     */
    public long getCustomerId();

    /**
     * Sets the customer ID of this invoice.
     *
     * @param customerId the customer ID of this invoice
     */
    public void setCustomerId(long customerId);

    /**
     * Returns the address of this invoice.
     *
     * @return the address of this invoice
     */
    @AutoEscape
    public String getAddress();

    /**
     * Sets the address of this invoice.
     *
     * @param address the address of this invoice
     */
    public void setAddress(String address);

    /**
     * Returns the telephone of this invoice.
     *
     * @return the telephone of this invoice
     */
    @AutoEscape
    public String getTelephone();

    /**
     * Sets the telephone of this invoice.
     *
     * @param telephone the telephone of this invoice
     */
    public void setTelephone(String telephone);

    /**
     * Returns the mobile of this invoice.
     *
     * @return the mobile of this invoice
     */
    @AutoEscape
    public String getMobile();

    /**
     * Sets the mobile of this invoice.
     *
     * @param mobile the mobile of this invoice
     */
    public void setMobile(String mobile);

    /**
     * Returns the type of delivery of this invoice.
     *
     * @return the type of delivery of this invoice
     */
    public Short getTypeOfDelivery();

    /**
     * Sets the type of delivery of this invoice.
     *
     * @param typeOfDelivery the type of delivery of this invoice
     */
    public void setTypeOfDelivery(Short typeOfDelivery);

    /**
     * Returns the status of this invoice.
     *
     * @return the status of this invoice
     */
    public int getStatus();

    /**
     * Sets the status of this invoice.
     *
     * @param status the status of this invoice
     */
    public void setStatus(int status);

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
    public int compareTo(Invoice invoice);

    @Override
    public int hashCode();

    @Override
    public CacheModel<Invoice> toCacheModel();

    @Override
    public Invoice toEscapedModel();

    @Override
    public Invoice toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
