package com.arman.csb.modules.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ProductLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ProductLocalService
 * @generated
 */
public class ProductLocalServiceWrapper implements ProductLocalService,
    ServiceWrapper<ProductLocalService> {
    private ProductLocalService _productLocalService;

    public ProductLocalServiceWrapper(ProductLocalService productLocalService) {
        _productLocalService = productLocalService;
    }

    /**
    * Adds the product to the database. Also notifies the appropriate model listeners.
    *
    * @param product the product
    * @return the product that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arman.csb.modules.model.Product addProduct(
        com.arman.csb.modules.model.Product product)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _productLocalService.addProduct(product);
    }

    /**
    * Creates a new product with the primary key. Does not add the product to the database.
    *
    * @param id the primary key for the new product
    * @return the new product
    */
    @Override
    public com.arman.csb.modules.model.Product createProduct(long id) {
        return _productLocalService.createProduct(id);
    }

    /**
    * Deletes the product with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the product
    * @return the product that was removed
    * @throws PortalException if a product with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arman.csb.modules.model.Product deleteProduct(long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _productLocalService.deleteProduct(id);
    }

    /**
    * Deletes the product from the database. Also notifies the appropriate model listeners.
    *
    * @param product the product
    * @return the product that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arman.csb.modules.model.Product deleteProduct(
        com.arman.csb.modules.model.Product product)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _productLocalService.deleteProduct(product);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _productLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _productLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arman.csb.modules.model.impl.ProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _productLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arman.csb.modules.model.impl.ProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _productLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _productLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _productLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.arman.csb.modules.model.Product fetchProduct(long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _productLocalService.fetchProduct(id);
    }

    /**
    * Returns the product with the matching UUID and company.
    *
    * @param uuid the product's UUID
    * @param companyId the primary key of the company
    * @return the matching product, or <code>null</code> if a matching product could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arman.csb.modules.model.Product fetchProductByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _productLocalService.fetchProductByUuidAndCompanyId(uuid,
            companyId);
    }

    /**
    * Returns the product matching the UUID and group.
    *
    * @param uuid the product's UUID
    * @param groupId the primary key of the group
    * @return the matching product, or <code>null</code> if a matching product could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arman.csb.modules.model.Product fetchProductByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _productLocalService.fetchProductByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns the product with the primary key.
    *
    * @param id the primary key of the product
    * @return the product
    * @throws PortalException if a product with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arman.csb.modules.model.Product getProduct(long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _productLocalService.getProduct(id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _productLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns the product with the matching UUID and company.
    *
    * @param uuid the product's UUID
    * @param companyId the primary key of the company
    * @return the matching product
    * @throws PortalException if a matching product could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arman.csb.modules.model.Product getProductByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _productLocalService.getProductByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the product matching the UUID and group.
    *
    * @param uuid the product's UUID
    * @param groupId the primary key of the group
    * @return the matching product
    * @throws PortalException if a matching product could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arman.csb.modules.model.Product getProductByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _productLocalService.getProductByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns a range of all the products.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arman.csb.modules.model.impl.ProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of products
    * @param end the upper bound of the range of products (not inclusive)
    * @return the range of products
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.arman.csb.modules.model.Product> getProducts(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _productLocalService.getProducts(start, end);
    }

    /**
    * Returns the number of products.
    *
    * @return the number of products
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getProductsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _productLocalService.getProductsCount();
    }

    /**
    * Updates the product in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param product the product
    * @return the product that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arman.csb.modules.model.Product updateProduct(
        com.arman.csb.modules.model.Product product)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _productLocalService.updateProduct(product);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _productLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _productLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _productLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public ProductLocalService getWrappedProductLocalService() {
        return _productLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedProductLocalService(
        ProductLocalService productLocalService) {
        _productLocalService = productLocalService;
    }

    @Override
    public ProductLocalService getWrappedService() {
        return _productLocalService;
    }

    @Override
    public void setWrappedService(ProductLocalService productLocalService) {
        _productLocalService = productLocalService;
    }
}
