package com.arman.csb.modules.service.base;

import com.arman.csb.modules.service.MyDDLRecordLocalService;
import com.arman.csb.modules.service.persistence.CustomerPersistence;
import com.arman.csb.modules.service.persistence.InvoiceItemPersistence;
import com.arman.csb.modules.service.persistence.InvoicePersistence;
import com.arman.csb.modules.service.persistence.PaymentPersistence;
import com.arman.csb.modules.service.persistence.ProductPersistence;
import com.arman.csb.modules.service.persistence.ScorePersistence;
import com.arman.csb.modules.service.persistence.UserActivityPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.InfrastructureUtil;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import com.liferay.portlet.dynamicdatalists.service.persistence.DDLRecordPersistence;
import com.liferay.portlet.dynamicdatalists.service.persistence.DDLRecordSetPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the my d d l record local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.arman.csb.modules.service.impl.MyDDLRecordLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.arman.csb.modules.service.impl.MyDDLRecordLocalServiceImpl
 * @see com.arman.csb.modules.service.MyDDLRecordLocalServiceUtil
 * @generated
 */
public abstract class MyDDLRecordLocalServiceBaseImpl
    extends BaseLocalServiceImpl implements MyDDLRecordLocalService,
        IdentifiableBean {
    @BeanReference(type = com.arman.csb.modules.service.CustomerLocalService.class)
    protected com.arman.csb.modules.service.CustomerLocalService customerLocalService;
    @BeanReference(type = com.arman.csb.modules.service.CustomerService.class)
    protected com.arman.csb.modules.service.CustomerService customerService;
    @BeanReference(type = CustomerPersistence.class)
    protected CustomerPersistence customerPersistence;
    @BeanReference(type = com.arman.csb.modules.service.InvoiceLocalService.class)
    protected com.arman.csb.modules.service.InvoiceLocalService invoiceLocalService;
    @BeanReference(type = com.arman.csb.modules.service.InvoiceService.class)
    protected com.arman.csb.modules.service.InvoiceService invoiceService;
    @BeanReference(type = InvoicePersistence.class)
    protected InvoicePersistence invoicePersistence;
    @BeanReference(type = com.arman.csb.modules.service.InvoiceItemLocalService.class)
    protected com.arman.csb.modules.service.InvoiceItemLocalService invoiceItemLocalService;
    @BeanReference(type = com.arman.csb.modules.service.InvoiceItemService.class)
    protected com.arman.csb.modules.service.InvoiceItemService invoiceItemService;
    @BeanReference(type = InvoiceItemPersistence.class)
    protected InvoiceItemPersistence invoiceItemPersistence;
    @BeanReference(type = com.arman.csb.modules.service.MyBlogLocalService.class)
    protected com.arman.csb.modules.service.MyBlogLocalService myBlogLocalService;
    @BeanReference(type = com.arman.csb.modules.service.MyBlogService.class)
    protected com.arman.csb.modules.service.MyBlogService myBlogService;
    @BeanReference(type = com.arman.csb.modules.service.MyDDLRecordLocalService.class)
    protected com.arman.csb.modules.service.MyDDLRecordLocalService myDDLRecordLocalService;
    @BeanReference(type = com.arman.csb.modules.service.MyDDLRecordService.class)
    protected com.arman.csb.modules.service.MyDDLRecordService myDDLRecordService;
    @BeanReference(type = com.arman.csb.modules.service.MyUserLocalService.class)
    protected com.arman.csb.modules.service.MyUserLocalService myUserLocalService;
    @BeanReference(type = com.arman.csb.modules.service.MyUserService.class)
    protected com.arman.csb.modules.service.MyUserService myUserService;
    @BeanReference(type = com.arman.csb.modules.service.PaymentLocalService.class)
    protected com.arman.csb.modules.service.PaymentLocalService paymentLocalService;
    @BeanReference(type = com.arman.csb.modules.service.PaymentService.class)
    protected com.arman.csb.modules.service.PaymentService paymentService;
    @BeanReference(type = PaymentPersistence.class)
    protected PaymentPersistence paymentPersistence;
    @BeanReference(type = com.arman.csb.modules.service.ProductLocalService.class)
    protected com.arman.csb.modules.service.ProductLocalService productLocalService;
    @BeanReference(type = com.arman.csb.modules.service.ProductService.class)
    protected com.arman.csb.modules.service.ProductService productService;
    @BeanReference(type = ProductPersistence.class)
    protected ProductPersistence productPersistence;
    @BeanReference(type = com.arman.csb.modules.service.ScoreLocalService.class)
    protected com.arman.csb.modules.service.ScoreLocalService scoreLocalService;
    @BeanReference(type = com.arman.csb.modules.service.ScoreService.class)
    protected com.arman.csb.modules.service.ScoreService scoreService;
    @BeanReference(type = ScorePersistence.class)
    protected ScorePersistence scorePersistence;
    @BeanReference(type = com.arman.csb.modules.service.UserActivityLocalService.class)
    protected com.arman.csb.modules.service.UserActivityLocalService userActivityLocalService;
    @BeanReference(type = com.arman.csb.modules.service.UserActivityService.class)
    protected com.arman.csb.modules.service.UserActivityService userActivityService;
    @BeanReference(type = UserActivityPersistence.class)
    protected UserActivityPersistence userActivityPersistence;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    @BeanReference(type = com.liferay.portlet.dynamicdatalists.service.DDLRecordLocalService.class)
    protected com.liferay.portlet.dynamicdatalists.service.DDLRecordLocalService ddlRecordLocalService;
    @BeanReference(type = com.liferay.portlet.dynamicdatalists.service.DDLRecordService.class)
    protected com.liferay.portlet.dynamicdatalists.service.DDLRecordService ddlRecordService;
    @BeanReference(type = DDLRecordPersistence.class)
    protected DDLRecordPersistence ddlRecordPersistence;
    @BeanReference(type = com.liferay.portlet.dynamicdatalists.service.DDLRecordSetLocalService.class)
    protected com.liferay.portlet.dynamicdatalists.service.DDLRecordSetLocalService ddlRecordSetLocalService;
    @BeanReference(type = com.liferay.portlet.dynamicdatalists.service.DDLRecordSetService.class)
    protected com.liferay.portlet.dynamicdatalists.service.DDLRecordSetService ddlRecordSetService;
    @BeanReference(type = DDLRecordSetPersistence.class)
    protected DDLRecordSetPersistence ddlRecordSetPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private MyDDLRecordLocalServiceClpInvoker _clpInvoker = new MyDDLRecordLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link com.arman.csb.modules.service.MyDDLRecordLocalServiceUtil} to access the my d d l record local service.
     */

    /**
     * Returns the customer local service.
     *
     * @return the customer local service
     */
    public com.arman.csb.modules.service.CustomerLocalService getCustomerLocalService() {
        return customerLocalService;
    }

    /**
     * Sets the customer local service.
     *
     * @param customerLocalService the customer local service
     */
    public void setCustomerLocalService(
        com.arman.csb.modules.service.CustomerLocalService customerLocalService) {
        this.customerLocalService = customerLocalService;
    }

    /**
     * Returns the customer remote service.
     *
     * @return the customer remote service
     */
    public com.arman.csb.modules.service.CustomerService getCustomerService() {
        return customerService;
    }

    /**
     * Sets the customer remote service.
     *
     * @param customerService the customer remote service
     */
    public void setCustomerService(
        com.arman.csb.modules.service.CustomerService customerService) {
        this.customerService = customerService;
    }

    /**
     * Returns the customer persistence.
     *
     * @return the customer persistence
     */
    public CustomerPersistence getCustomerPersistence() {
        return customerPersistence;
    }

    /**
     * Sets the customer persistence.
     *
     * @param customerPersistence the customer persistence
     */
    public void setCustomerPersistence(CustomerPersistence customerPersistence) {
        this.customerPersistence = customerPersistence;
    }

    /**
     * Returns the invoice local service.
     *
     * @return the invoice local service
     */
    public com.arman.csb.modules.service.InvoiceLocalService getInvoiceLocalService() {
        return invoiceLocalService;
    }

    /**
     * Sets the invoice local service.
     *
     * @param invoiceLocalService the invoice local service
     */
    public void setInvoiceLocalService(
        com.arman.csb.modules.service.InvoiceLocalService invoiceLocalService) {
        this.invoiceLocalService = invoiceLocalService;
    }

    /**
     * Returns the invoice remote service.
     *
     * @return the invoice remote service
     */
    public com.arman.csb.modules.service.InvoiceService getInvoiceService() {
        return invoiceService;
    }

    /**
     * Sets the invoice remote service.
     *
     * @param invoiceService the invoice remote service
     */
    public void setInvoiceService(
        com.arman.csb.modules.service.InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    /**
     * Returns the invoice persistence.
     *
     * @return the invoice persistence
     */
    public InvoicePersistence getInvoicePersistence() {
        return invoicePersistence;
    }

    /**
     * Sets the invoice persistence.
     *
     * @param invoicePersistence the invoice persistence
     */
    public void setInvoicePersistence(InvoicePersistence invoicePersistence) {
        this.invoicePersistence = invoicePersistence;
    }

    /**
     * Returns the invoice item local service.
     *
     * @return the invoice item local service
     */
    public com.arman.csb.modules.service.InvoiceItemLocalService getInvoiceItemLocalService() {
        return invoiceItemLocalService;
    }

    /**
     * Sets the invoice item local service.
     *
     * @param invoiceItemLocalService the invoice item local service
     */
    public void setInvoiceItemLocalService(
        com.arman.csb.modules.service.InvoiceItemLocalService invoiceItemLocalService) {
        this.invoiceItemLocalService = invoiceItemLocalService;
    }

    /**
     * Returns the invoice item remote service.
     *
     * @return the invoice item remote service
     */
    public com.arman.csb.modules.service.InvoiceItemService getInvoiceItemService() {
        return invoiceItemService;
    }

    /**
     * Sets the invoice item remote service.
     *
     * @param invoiceItemService the invoice item remote service
     */
    public void setInvoiceItemService(
        com.arman.csb.modules.service.InvoiceItemService invoiceItemService) {
        this.invoiceItemService = invoiceItemService;
    }

    /**
     * Returns the invoice item persistence.
     *
     * @return the invoice item persistence
     */
    public InvoiceItemPersistence getInvoiceItemPersistence() {
        return invoiceItemPersistence;
    }

    /**
     * Sets the invoice item persistence.
     *
     * @param invoiceItemPersistence the invoice item persistence
     */
    public void setInvoiceItemPersistence(
        InvoiceItemPersistence invoiceItemPersistence) {
        this.invoiceItemPersistence = invoiceItemPersistence;
    }

    /**
     * Returns the my blog local service.
     *
     * @return the my blog local service
     */
    public com.arman.csb.modules.service.MyBlogLocalService getMyBlogLocalService() {
        return myBlogLocalService;
    }

    /**
     * Sets the my blog local service.
     *
     * @param myBlogLocalService the my blog local service
     */
    public void setMyBlogLocalService(
        com.arman.csb.modules.service.MyBlogLocalService myBlogLocalService) {
        this.myBlogLocalService = myBlogLocalService;
    }

    /**
     * Returns the my blog remote service.
     *
     * @return the my blog remote service
     */
    public com.arman.csb.modules.service.MyBlogService getMyBlogService() {
        return myBlogService;
    }

    /**
     * Sets the my blog remote service.
     *
     * @param myBlogService the my blog remote service
     */
    public void setMyBlogService(
        com.arman.csb.modules.service.MyBlogService myBlogService) {
        this.myBlogService = myBlogService;
    }

    /**
     * Returns the my d d l record local service.
     *
     * @return the my d d l record local service
     */
    public com.arman.csb.modules.service.MyDDLRecordLocalService getMyDDLRecordLocalService() {
        return myDDLRecordLocalService;
    }

    /**
     * Sets the my d d l record local service.
     *
     * @param myDDLRecordLocalService the my d d l record local service
     */
    public void setMyDDLRecordLocalService(
        com.arman.csb.modules.service.MyDDLRecordLocalService myDDLRecordLocalService) {
        this.myDDLRecordLocalService = myDDLRecordLocalService;
    }

    /**
     * Returns the my d d l record remote service.
     *
     * @return the my d d l record remote service
     */
    public com.arman.csb.modules.service.MyDDLRecordService getMyDDLRecordService() {
        return myDDLRecordService;
    }

    /**
     * Sets the my d d l record remote service.
     *
     * @param myDDLRecordService the my d d l record remote service
     */
    public void setMyDDLRecordService(
        com.arman.csb.modules.service.MyDDLRecordService myDDLRecordService) {
        this.myDDLRecordService = myDDLRecordService;
    }

    /**
     * Returns the my user local service.
     *
     * @return the my user local service
     */
    public com.arman.csb.modules.service.MyUserLocalService getMyUserLocalService() {
        return myUserLocalService;
    }

    /**
     * Sets the my user local service.
     *
     * @param myUserLocalService the my user local service
     */
    public void setMyUserLocalService(
        com.arman.csb.modules.service.MyUserLocalService myUserLocalService) {
        this.myUserLocalService = myUserLocalService;
    }

    /**
     * Returns the my user remote service.
     *
     * @return the my user remote service
     */
    public com.arman.csb.modules.service.MyUserService getMyUserService() {
        return myUserService;
    }

    /**
     * Sets the my user remote service.
     *
     * @param myUserService the my user remote service
     */
    public void setMyUserService(
        com.arman.csb.modules.service.MyUserService myUserService) {
        this.myUserService = myUserService;
    }

    /**
     * Returns the payment local service.
     *
     * @return the payment local service
     */
    public com.arman.csb.modules.service.PaymentLocalService getPaymentLocalService() {
        return paymentLocalService;
    }

    /**
     * Sets the payment local service.
     *
     * @param paymentLocalService the payment local service
     */
    public void setPaymentLocalService(
        com.arman.csb.modules.service.PaymentLocalService paymentLocalService) {
        this.paymentLocalService = paymentLocalService;
    }

    /**
     * Returns the payment remote service.
     *
     * @return the payment remote service
     */
    public com.arman.csb.modules.service.PaymentService getPaymentService() {
        return paymentService;
    }

    /**
     * Sets the payment remote service.
     *
     * @param paymentService the payment remote service
     */
    public void setPaymentService(
        com.arman.csb.modules.service.PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    /**
     * Returns the payment persistence.
     *
     * @return the payment persistence
     */
    public PaymentPersistence getPaymentPersistence() {
        return paymentPersistence;
    }

    /**
     * Sets the payment persistence.
     *
     * @param paymentPersistence the payment persistence
     */
    public void setPaymentPersistence(PaymentPersistence paymentPersistence) {
        this.paymentPersistence = paymentPersistence;
    }

    /**
     * Returns the product local service.
     *
     * @return the product local service
     */
    public com.arman.csb.modules.service.ProductLocalService getProductLocalService() {
        return productLocalService;
    }

    /**
     * Sets the product local service.
     *
     * @param productLocalService the product local service
     */
    public void setProductLocalService(
        com.arman.csb.modules.service.ProductLocalService productLocalService) {
        this.productLocalService = productLocalService;
    }

    /**
     * Returns the product remote service.
     *
     * @return the product remote service
     */
    public com.arman.csb.modules.service.ProductService getProductService() {
        return productService;
    }

    /**
     * Sets the product remote service.
     *
     * @param productService the product remote service
     */
    public void setProductService(
        com.arman.csb.modules.service.ProductService productService) {
        this.productService = productService;
    }

    /**
     * Returns the product persistence.
     *
     * @return the product persistence
     */
    public ProductPersistence getProductPersistence() {
        return productPersistence;
    }

    /**
     * Sets the product persistence.
     *
     * @param productPersistence the product persistence
     */
    public void setProductPersistence(ProductPersistence productPersistence) {
        this.productPersistence = productPersistence;
    }

    /**
     * Returns the score local service.
     *
     * @return the score local service
     */
    public com.arman.csb.modules.service.ScoreLocalService getScoreLocalService() {
        return scoreLocalService;
    }

    /**
     * Sets the score local service.
     *
     * @param scoreLocalService the score local service
     */
    public void setScoreLocalService(
        com.arman.csb.modules.service.ScoreLocalService scoreLocalService) {
        this.scoreLocalService = scoreLocalService;
    }

    /**
     * Returns the score remote service.
     *
     * @return the score remote service
     */
    public com.arman.csb.modules.service.ScoreService getScoreService() {
        return scoreService;
    }

    /**
     * Sets the score remote service.
     *
     * @param scoreService the score remote service
     */
    public void setScoreService(
        com.arman.csb.modules.service.ScoreService scoreService) {
        this.scoreService = scoreService;
    }

    /**
     * Returns the score persistence.
     *
     * @return the score persistence
     */
    public ScorePersistence getScorePersistence() {
        return scorePersistence;
    }

    /**
     * Sets the score persistence.
     *
     * @param scorePersistence the score persistence
     */
    public void setScorePersistence(ScorePersistence scorePersistence) {
        this.scorePersistence = scorePersistence;
    }

    /**
     * Returns the user activity local service.
     *
     * @return the user activity local service
     */
    public com.arman.csb.modules.service.UserActivityLocalService getUserActivityLocalService() {
        return userActivityLocalService;
    }

    /**
     * Sets the user activity local service.
     *
     * @param userActivityLocalService the user activity local service
     */
    public void setUserActivityLocalService(
        com.arman.csb.modules.service.UserActivityLocalService userActivityLocalService) {
        this.userActivityLocalService = userActivityLocalService;
    }

    /**
     * Returns the user activity remote service.
     *
     * @return the user activity remote service
     */
    public com.arman.csb.modules.service.UserActivityService getUserActivityService() {
        return userActivityService;
    }

    /**
     * Sets the user activity remote service.
     *
     * @param userActivityService the user activity remote service
     */
    public void setUserActivityService(
        com.arman.csb.modules.service.UserActivityService userActivityService) {
        this.userActivityService = userActivityService;
    }

    /**
     * Returns the user activity persistence.
     *
     * @return the user activity persistence
     */
    public UserActivityPersistence getUserActivityPersistence() {
        return userActivityPersistence;
    }

    /**
     * Sets the user activity persistence.
     *
     * @param userActivityPersistence the user activity persistence
     */
    public void setUserActivityPersistence(
        UserActivityPersistence userActivityPersistence) {
        this.userActivityPersistence = userActivityPersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    /**
     * Returns the d d l record local service.
     *
     * @return the d d l record local service
     */
    public com.liferay.portlet.dynamicdatalists.service.DDLRecordLocalService getDDLRecordLocalService() {
        return ddlRecordLocalService;
    }

    /**
     * Sets the d d l record local service.
     *
     * @param ddlRecordLocalService the d d l record local service
     */
    public void setDDLRecordLocalService(
        com.liferay.portlet.dynamicdatalists.service.DDLRecordLocalService ddlRecordLocalService) {
        this.ddlRecordLocalService = ddlRecordLocalService;
    }

    /**
     * Returns the d d l record remote service.
     *
     * @return the d d l record remote service
     */
    public com.liferay.portlet.dynamicdatalists.service.DDLRecordService getDDLRecordService() {
        return ddlRecordService;
    }

    /**
     * Sets the d d l record remote service.
     *
     * @param ddlRecordService the d d l record remote service
     */
    public void setDDLRecordService(
        com.liferay.portlet.dynamicdatalists.service.DDLRecordService ddlRecordService) {
        this.ddlRecordService = ddlRecordService;
    }

    /**
     * Returns the d d l record persistence.
     *
     * @return the d d l record persistence
     */
    public DDLRecordPersistence getDDLRecordPersistence() {
        return ddlRecordPersistence;
    }

    /**
     * Sets the d d l record persistence.
     *
     * @param ddlRecordPersistence the d d l record persistence
     */
    public void setDDLRecordPersistence(
        DDLRecordPersistence ddlRecordPersistence) {
        this.ddlRecordPersistence = ddlRecordPersistence;
    }

    /**
     * Returns the d d l record set local service.
     *
     * @return the d d l record set local service
     */
    public com.liferay.portlet.dynamicdatalists.service.DDLRecordSetLocalService getDDLRecordSetLocalService() {
        return ddlRecordSetLocalService;
    }

    /**
     * Sets the d d l record set local service.
     *
     * @param ddlRecordSetLocalService the d d l record set local service
     */
    public void setDDLRecordSetLocalService(
        com.liferay.portlet.dynamicdatalists.service.DDLRecordSetLocalService ddlRecordSetLocalService) {
        this.ddlRecordSetLocalService = ddlRecordSetLocalService;
    }

    /**
     * Returns the d d l record set remote service.
     *
     * @return the d d l record set remote service
     */
    public com.liferay.portlet.dynamicdatalists.service.DDLRecordSetService getDDLRecordSetService() {
        return ddlRecordSetService;
    }

    /**
     * Sets the d d l record set remote service.
     *
     * @param ddlRecordSetService the d d l record set remote service
     */
    public void setDDLRecordSetService(
        com.liferay.portlet.dynamicdatalists.service.DDLRecordSetService ddlRecordSetService) {
        this.ddlRecordSetService = ddlRecordSetService;
    }

    /**
     * Returns the d d l record set persistence.
     *
     * @return the d d l record set persistence
     */
    public DDLRecordSetPersistence getDDLRecordSetPersistence() {
        return ddlRecordSetPersistence;
    }

    /**
     * Sets the d d l record set persistence.
     *
     * @param ddlRecordSetPersistence the d d l record set persistence
     */
    public void setDDLRecordSetPersistence(
        DDLRecordSetPersistence ddlRecordSetPersistence) {
        this.ddlRecordSetPersistence = ddlRecordSetPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();
    }

    public void destroy() {
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = InfrastructureUtil.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
