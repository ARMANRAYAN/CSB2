package com.arman.csb.theme.service.persistence;

import com.arman.csb.theme.model.Template;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the template service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TemplatePersistenceImpl
 * @see TemplateUtil
 * @generated
 */
public interface TemplatePersistence extends BasePersistence<Template> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link TemplateUtil} to access the template persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the templates where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching templates
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arman.csb.theme.model.Template> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the templates where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arman.csb.theme.model.impl.TemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of templates
    * @param end the upper bound of the range of templates (not inclusive)
    * @return the range of matching templates
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arman.csb.theme.model.Template> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the templates where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arman.csb.theme.model.impl.TemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of templates
    * @param end the upper bound of the range of templates (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching templates
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arman.csb.theme.model.Template> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first template in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching template
    * @throws com.arman.csb.theme.NoSuchTemplateException if a matching template could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arman.csb.theme.model.Template findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arman.csb.theme.NoSuchTemplateException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first template in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching template, or <code>null</code> if a matching template could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arman.csb.theme.model.Template fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last template in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching template
    * @throws com.arman.csb.theme.NoSuchTemplateException if a matching template could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arman.csb.theme.model.Template findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arman.csb.theme.NoSuchTemplateException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last template in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching template, or <code>null</code> if a matching template could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arman.csb.theme.model.Template fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the templates before and after the current template in the ordered set where uuid = &#63;.
    *
    * @param id the primary key of the current template
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next template
    * @throws com.arman.csb.theme.NoSuchTemplateException if a template with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arman.csb.theme.model.Template[] findByUuid_PrevAndNext(
        long id, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arman.csb.theme.NoSuchTemplateException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the templates where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of templates where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching templates
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the template where uuid = &#63; and groupId = &#63; or throws a {@link com.arman.csb.theme.NoSuchTemplateException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching template
    * @throws com.arman.csb.theme.NoSuchTemplateException if a matching template could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arman.csb.theme.model.Template findByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.arman.csb.theme.NoSuchTemplateException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the template where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching template, or <code>null</code> if a matching template could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arman.csb.theme.model.Template fetchByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the template where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching template, or <code>null</code> if a matching template could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arman.csb.theme.model.Template fetchByUUID_G(
        java.lang.String uuid, long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the template where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the template that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.arman.csb.theme.model.Template removeByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.arman.csb.theme.NoSuchTemplateException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of templates where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching templates
    * @throws SystemException if a system exception occurred
    */
    public int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the templates where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching templates
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arman.csb.theme.model.Template> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the templates where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arman.csb.theme.model.impl.TemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of templates
    * @param end the upper bound of the range of templates (not inclusive)
    * @return the range of matching templates
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arman.csb.theme.model.Template> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the templates where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arman.csb.theme.model.impl.TemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of templates
    * @param end the upper bound of the range of templates (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching templates
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arman.csb.theme.model.Template> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first template in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching template
    * @throws com.arman.csb.theme.NoSuchTemplateException if a matching template could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arman.csb.theme.model.Template findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arman.csb.theme.NoSuchTemplateException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first template in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching template, or <code>null</code> if a matching template could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arman.csb.theme.model.Template fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last template in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching template
    * @throws com.arman.csb.theme.NoSuchTemplateException if a matching template could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arman.csb.theme.model.Template findByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arman.csb.theme.NoSuchTemplateException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last template in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching template, or <code>null</code> if a matching template could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arman.csb.theme.model.Template fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the templates before and after the current template in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param id the primary key of the current template
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next template
    * @throws com.arman.csb.theme.NoSuchTemplateException if a template with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arman.csb.theme.model.Template[] findByUuid_C_PrevAndNext(
        long id, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arman.csb.theme.NoSuchTemplateException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the templates where uuid = &#63; and companyId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of templates where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching templates
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the templates where companyId = &#63;.
    *
    * @param companyId the company ID
    * @return the matching templates
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arman.csb.theme.model.Template> findByCompanyId(
        long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the templates where companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arman.csb.theme.model.impl.TemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param companyId the company ID
    * @param start the lower bound of the range of templates
    * @param end the upper bound of the range of templates (not inclusive)
    * @return the range of matching templates
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arman.csb.theme.model.Template> findByCompanyId(
        long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the templates where companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arman.csb.theme.model.impl.TemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param companyId the company ID
    * @param start the lower bound of the range of templates
    * @param end the upper bound of the range of templates (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching templates
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arman.csb.theme.model.Template> findByCompanyId(
        long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first template in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching template
    * @throws com.arman.csb.theme.NoSuchTemplateException if a matching template could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arman.csb.theme.model.Template findByCompanyId_First(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arman.csb.theme.NoSuchTemplateException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first template in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching template, or <code>null</code> if a matching template could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arman.csb.theme.model.Template fetchByCompanyId_First(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last template in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching template
    * @throws com.arman.csb.theme.NoSuchTemplateException if a matching template could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arman.csb.theme.model.Template findByCompanyId_Last(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arman.csb.theme.NoSuchTemplateException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last template in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching template, or <code>null</code> if a matching template could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arman.csb.theme.model.Template fetchByCompanyId_Last(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the templates before and after the current template in the ordered set where companyId = &#63;.
    *
    * @param id the primary key of the current template
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next template
    * @throws com.arman.csb.theme.NoSuchTemplateException if a template with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arman.csb.theme.model.Template[] findByCompanyId_PrevAndNext(
        long id, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arman.csb.theme.NoSuchTemplateException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the templates where companyId = &#63; from the database.
    *
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByCompanyId(long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of templates where companyId = &#63;.
    *
    * @param companyId the company ID
    * @return the number of matching templates
    * @throws SystemException if a system exception occurred
    */
    public int countByCompanyId(long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the template in the entity cache if it is enabled.
    *
    * @param template the template
    */
    public void cacheResult(com.arman.csb.theme.model.Template template);

    /**
    * Caches the templates in the entity cache if it is enabled.
    *
    * @param templates the templates
    */
    public void cacheResult(
        java.util.List<com.arman.csb.theme.model.Template> templates);

    /**
    * Creates a new template with the primary key. Does not add the template to the database.
    *
    * @param id the primary key for the new template
    * @return the new template
    */
    public com.arman.csb.theme.model.Template create(long id);

    /**
    * Removes the template with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the template
    * @return the template that was removed
    * @throws com.arman.csb.theme.NoSuchTemplateException if a template with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arman.csb.theme.model.Template remove(long id)
        throws com.arman.csb.theme.NoSuchTemplateException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.arman.csb.theme.model.Template updateImpl(
        com.arman.csb.theme.model.Template template)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the template with the primary key or throws a {@link com.arman.csb.theme.NoSuchTemplateException} if it could not be found.
    *
    * @param id the primary key of the template
    * @return the template
    * @throws com.arman.csb.theme.NoSuchTemplateException if a template with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arman.csb.theme.model.Template findByPrimaryKey(long id)
        throws com.arman.csb.theme.NoSuchTemplateException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the template with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the template
    * @return the template, or <code>null</code> if a template with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arman.csb.theme.model.Template fetchByPrimaryKey(long id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the templates.
    *
    * @return the templates
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arman.csb.theme.model.Template> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.arman.csb.theme.model.Template> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the templates.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arman.csb.theme.model.impl.TemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of templates
    * @param end the upper bound of the range of templates (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of templates
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arman.csb.theme.model.Template> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the templates from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of templates.
    *
    * @return the number of templates
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
