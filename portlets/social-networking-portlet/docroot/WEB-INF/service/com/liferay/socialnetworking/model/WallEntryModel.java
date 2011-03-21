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

package com.liferay.socialnetworking.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the WallEntry service. Represents a row in the &quot;SN_WallEntry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.socialnetworking.model.impl.WallEntryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.socialnetworking.model.impl.WallEntryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WallEntry
 * @see com.liferay.socialnetworking.model.impl.WallEntryImpl
 * @see com.liferay.socialnetworking.model.impl.WallEntryModelImpl
 * @generated
 */
public interface WallEntryModel extends BaseModel<WallEntry>, GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a wall entry model instance should use the {@link WallEntry} interface instead.
	 */

	/**
	 * Gets the primary key of this wall entry.
	 *
	 * @return the primary key of this wall entry
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this wall entry
	 *
	 * @param pk the primary key of this wall entry
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the wall entry ID of this wall entry.
	 *
	 * @return the wall entry ID of this wall entry
	 */
	public long getWallEntryId();

	/**
	 * Sets the wall entry ID of this wall entry.
	 *
	 * @param wallEntryId the wall entry ID of this wall entry
	 */
	public void setWallEntryId(long wallEntryId);

	/**
	 * Gets the group ID of this wall entry.
	 *
	 * @return the group ID of this wall entry
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this wall entry.
	 *
	 * @param groupId the group ID of this wall entry
	 */
	public void setGroupId(long groupId);

	/**
	 * Gets the company ID of this wall entry.
	 *
	 * @return the company ID of this wall entry
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this wall entry.
	 *
	 * @param companyId the company ID of this wall entry
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the user ID of this wall entry.
	 *
	 * @return the user ID of this wall entry
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this wall entry.
	 *
	 * @param userId the user ID of this wall entry
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user uuid of this wall entry.
	 *
	 * @return the user uuid of this wall entry
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this wall entry.
	 *
	 * @param userUuid the user uuid of this wall entry
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Gets the user name of this wall entry.
	 *
	 * @return the user name of this wall entry
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this wall entry.
	 *
	 * @param userName the user name of this wall entry
	 */
	public void setUserName(String userName);

	/**
	 * Gets the create date of this wall entry.
	 *
	 * @return the create date of this wall entry
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this wall entry.
	 *
	 * @param createDate the create date of this wall entry
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Gets the modified date of this wall entry.
	 *
	 * @return the modified date of this wall entry
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this wall entry.
	 *
	 * @param modifiedDate the modified date of this wall entry
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the comments of this wall entry.
	 *
	 * @return the comments of this wall entry
	 */
	@AutoEscape
	public String getComments();

	/**
	 * Sets the comments of this wall entry.
	 *
	 * @param comments the comments of this wall entry
	 */
	public void setComments(String comments);

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

	public int compareTo(WallEntry wallEntry);

	public int hashCode();

	public WallEntry toEscapedModel();

	public String toString();

	public String toXmlString();
}