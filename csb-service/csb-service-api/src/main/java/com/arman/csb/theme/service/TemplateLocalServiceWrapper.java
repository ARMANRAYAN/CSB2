package com.arman.csb.theme.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TemplateLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TemplateLocalService
 * @generated
 */
public class TemplateLocalServiceWrapper implements TemplateLocalService,
    ServiceWrapper<TemplateLocalService> {
    private TemplateLocalService _templateLocalService;

    public TemplateLocalServiceWrapper(
        TemplateLocalService templateLocalService) {
        _templateLocalService = templateLocalService;
    }

    /**
    * Adds the template to the database. Also notifies the appropriate model listeners.
    *
    * @param template the template
    * @return the template that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arman.csb.theme.model.Template addTemplate(
        com.arman.csb.theme.model.Template template)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _templateLocalService.addTemplate(template);
    }

    /**
    * Creates a new template with the primary key. Does not add the template to the database.
    *
    * @param id the primary key for the new template
    * @return the new template
    */
    @Override
    public com.arman.csb.theme.model.Template createTemplate(long id) {
        return _templateLocalService.createTemplate(id);
    }

    /**
    * Deletes the template with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the template
    * @return the template that was removed
    * @throws PortalException if a template with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arman.csb.theme.model.Template deleteTemplate(long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _templateLocalService.deleteTemplate(id);
    }

    /**
    * Deletes the template from the database. Also notifies the appropriate model listeners.
    *
    * @param template the template
    * @return the template that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arman.csb.theme.model.Template deleteTemplate(
        com.arman.csb.theme.model.Template template)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _templateLocalService.deleteTemplate(template);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _templateLocalService.dynamicQuery();
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
        return _templateLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arman.csb.theme.model.impl.TemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _templateLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arman.csb.theme.model.impl.TemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _templateLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _templateLocalService.dynamicQueryCount(dynamicQuery);
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
        return _templateLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.arman.csb.theme.model.Template fetchTemplate(long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _templateLocalService.fetchTemplate(id);
    }

    /**
    * Returns the template with the matching UUID and company.
    *
    * @param uuid the template's UUID
    * @param companyId the primary key of the company
    * @return the matching template, or <code>null</code> if a matching template could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arman.csb.theme.model.Template fetchTemplateByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _templateLocalService.fetchTemplateByUuidAndCompanyId(uuid,
            companyId);
    }

    /**
    * Returns the template matching the UUID and group.
    *
    * @param uuid the template's UUID
    * @param groupId the primary key of the group
    * @return the matching template, or <code>null</code> if a matching template could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arman.csb.theme.model.Template fetchTemplateByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _templateLocalService.fetchTemplateByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns the template with the primary key.
    *
    * @param id the primary key of the template
    * @return the template
    * @throws PortalException if a template with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arman.csb.theme.model.Template getTemplate(long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _templateLocalService.getTemplate(id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _templateLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns the template with the matching UUID and company.
    *
    * @param uuid the template's UUID
    * @param companyId the primary key of the company
    * @return the matching template
    * @throws PortalException if a matching template could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arman.csb.theme.model.Template getTemplateByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _templateLocalService.getTemplateByUuidAndCompanyId(uuid,
            companyId);
    }

    /**
    * Returns the template matching the UUID and group.
    *
    * @param uuid the template's UUID
    * @param groupId the primary key of the group
    * @return the matching template
    * @throws PortalException if a matching template could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arman.csb.theme.model.Template getTemplateByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _templateLocalService.getTemplateByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns a range of all the templates.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arman.csb.theme.model.impl.TemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of templates
    * @param end the upper bound of the range of templates (not inclusive)
    * @return the range of templates
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.arman.csb.theme.model.Template> getTemplates(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _templateLocalService.getTemplates(start, end);
    }

    /**
    * Returns the number of templates.
    *
    * @return the number of templates
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getTemplatesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _templateLocalService.getTemplatesCount();
    }

    /**
    * Updates the template in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param template the template
    * @return the template that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arman.csb.theme.model.Template updateTemplate(
        com.arman.csb.theme.model.Template template)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _templateLocalService.updateTemplate(template);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _templateLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _templateLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _templateLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public com.arman.csb.theme.model.Template createNewTemplate()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _templateLocalService.createNewTemplate();
    }

    @Override
    public java.util.List<com.arman.csb.theme.model.Template> getTemplatesByCompany(
        long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _templateLocalService.getTemplatesByCompany(companyId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public TemplateLocalService getWrappedTemplateLocalService() {
        return _templateLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedTemplateLocalService(
        TemplateLocalService templateLocalService) {
        _templateLocalService = templateLocalService;
    }

    @Override
    public TemplateLocalService getWrappedService() {
        return _templateLocalService;
    }

    @Override
    public void setWrappedService(TemplateLocalService templateLocalService) {
        _templateLocalService = templateLocalService;
    }
}
