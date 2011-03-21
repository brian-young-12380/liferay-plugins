/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.knowledgebase.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Template service. Represents a row in the &quot;KB_Template&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.knowledgebase.model.impl.TemplateModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.knowledgebase.model.impl.TemplateImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Template
 * @see com.liferay.knowledgebase.model.impl.TemplateImpl
 * @see com.liferay.knowledgebase.model.impl.TemplateModelImpl
 * @generated
 */
public interface TemplateModel extends BaseModel<Template>, GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a template model instance should use the {@link Template} interface instead.
	 */

	/**
	 * Gets the primary key of this template.
	 *
	 * @return the primary key of this template
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this template
	 *
	 * @param pk the primary key of this template
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the uuid of this template.
	 *
	 * @return the uuid of this template
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this template.
	 *
	 * @param uuid the uuid of this template
	 */
	public void setUuid(String uuid);

	/**
	 * Gets the template ID of this template.
	 *
	 * @return the template ID of this template
	 */
	public long getTemplateId();

	/**
	 * Sets the template ID of this template.
	 *
	 * @param templateId the template ID of this template
	 */
	public void setTemplateId(long templateId);

	/**
	 * Gets the group ID of this template.
	 *
	 * @return the group ID of this template
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this template.
	 *
	 * @param groupId the group ID of this template
	 */
	public void setGroupId(long groupId);

	/**
	 * Gets the company ID of this template.
	 *
	 * @return the company ID of this template
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this template.
	 *
	 * @param companyId the company ID of this template
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the user ID of this template.
	 *
	 * @return the user ID of this template
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this template.
	 *
	 * @param userId the user ID of this template
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user uuid of this template.
	 *
	 * @return the user uuid of this template
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this template.
	 *
	 * @param userUuid the user uuid of this template
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Gets the user name of this template.
	 *
	 * @return the user name of this template
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this template.
	 *
	 * @param userName the user name of this template
	 */
	public void setUserName(String userName);

	/**
	 * Gets the create date of this template.
	 *
	 * @return the create date of this template
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this template.
	 *
	 * @param createDate the create date of this template
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Gets the modified date of this template.
	 *
	 * @return the modified date of this template
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this template.
	 *
	 * @param modifiedDate the modified date of this template
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the title of this template.
	 *
	 * @return the title of this template
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this template.
	 *
	 * @param title the title of this template
	 */
	public void setTitle(String title);

	/**
	 * Gets the content of this template.
	 *
	 * @return the content of this template
	 */
	@AutoEscape
	public String getContent();

	/**
	 * Sets the content of this template.
	 *
	 * @param content the content of this template
	 */
	public void setContent(String content);

	/**
	 * Gets the description of this template.
	 *
	 * @return the description of this template
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this template.
	 *
	 * @param description the description of this template
	 */
	public void setDescription(String description);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(Template template);

	public int hashCode();

	public Template toEscapedModel();

	public String toString();

	public String toXmlString();
}