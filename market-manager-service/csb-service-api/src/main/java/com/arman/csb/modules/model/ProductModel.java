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
 * The base model interface for the Product service. Represents a row in the &quot;CSBModules_Product&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.arman.csb.modules.model.impl.ProductModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.arman.csb.modules.model.impl.ProductImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Product
 * @see com.arman.csb.modules.model.impl.ProductImpl
 * @see com.arman.csb.modules.model.impl.ProductModelImpl
 * @generated
 */
public interface ProductModel extends BaseModel<Product>, StagedGroupedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a product model instance should use the {@link Product} interface instead.
     */

    /**
     * Returns the primary key of this product.
     *
     * @return the primary key of this product
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this product.
     *
     * @param primaryKey the primary key of this product
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the uuid of this product.
     *
     * @return the uuid of this product
     */
    @AutoEscape
    @Override
    public String getUuid();

    /**
     * Sets the uuid of this product.
     *
     * @param uuid the uuid of this product
     */
    @Override
    public void setUuid(String uuid);

    /**
     * Returns the ID of this product.
     *
     * @return the ID of this product
     */
    public long getId();

    /**
     * Sets the ID of this product.
     *
     * @param id the ID of this product
     */
    public void setId(long id);

    /**
     * Returns the group ID of this product.
     *
     * @return the group ID of this product
     */
    @Override
    public long getGroupId();

    /**
     * Sets the group ID of this product.
     *
     * @param groupId the group ID of this product
     */
    @Override
    public void setGroupId(long groupId);

    /**
     * Returns the company ID of this product.
     *
     * @return the company ID of this product
     */
    @Override
    public long getCompanyId();

    /**
     * Sets the company ID of this product.
     *
     * @param companyId the company ID of this product
     */
    @Override
    public void setCompanyId(long companyId);

    /**
     * Returns the user ID of this product.
     *
     * @return the user ID of this product
     */
    @Override
    public long getUserId();

    /**
     * Sets the user ID of this product.
     *
     * @param userId the user ID of this product
     */
    @Override
    public void setUserId(long userId);

    /**
     * Returns the user uuid of this product.
     *
     * @return the user uuid of this product
     * @throws SystemException if a system exception occurred
     */
    @Override
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this product.
     *
     * @param userUuid the user uuid of this product
     */
    @Override
    public void setUserUuid(String userUuid);

    /**
     * Returns the user name of this product.
     *
     * @return the user name of this product
     */
    @AutoEscape
    @Override
    public String getUserName();

    /**
     * Sets the user name of this product.
     *
     * @param userName the user name of this product
     */
    @Override
    public void setUserName(String userName);

    /**
     * Returns the create date of this product.
     *
     * @return the create date of this product
     */
    @Override
    public Date getCreateDate();

    /**
     * Sets the create date of this product.
     *
     * @param createDate the create date of this product
     */
    @Override
    public void setCreateDate(Date createDate);

    /**
     * Returns the modified date of this product.
     *
     * @return the modified date of this product
     */
    @Override
    public Date getModifiedDate();

    /**
     * Sets the modified date of this product.
     *
     * @param modifiedDate the modified date of this product
     */
    @Override
    public void setModifiedDate(Date modifiedDate);

    /**
     * Returns the name of this product.
     *
     * @return the name of this product
     */
    @AutoEscape
    public String getName();

    /**
     * Sets the name of this product.
     *
     * @param name the name of this product
     */
    public void setName(String name);

    /**
     * Returns the code of this product.
     *
     * @return the code of this product
     */
    @AutoEscape
    public String getCode();

    /**
     * Sets the code of this product.
     *
     * @param code the code of this product
     */
    public void setCode(String code);

    /**
     * Returns the base price of this product.
     *
     * @return the base price of this product
     */
    public long getBasePrice();

    /**
     * Sets the base price of this product.
     *
     * @param basePrice the base price of this product
     */
    public void setBasePrice(long basePrice);

    /**
     * Returns the score of this product.
     *
     * @return the score of this product
     */
    public long getScore();

    /**
     * Sets the score of this product.
     *
     * @param score the score of this product
     */
    public void setScore(long score);

    /**
     * Returns the status of this product.
     *
     * @return the status of this product
     */
    public int getStatus();

    /**
     * Sets the status of this product.
     *
     * @param status the status of this product
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
    public int compareTo(Product product);

    @Override
    public int hashCode();

    @Override
    public CacheModel<Product> toCacheModel();

    @Override
    public Product toEscapedModel();

    @Override
    public Product toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}