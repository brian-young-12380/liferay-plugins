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

package com.liferay.microblogs.model;

/**
 * <p>
 * This class is a wrapper for {@link MicroblogsEntry}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       MicroblogsEntry
 * @generated
 */
public class MicroblogsEntryWrapper implements MicroblogsEntry {
	public MicroblogsEntryWrapper(MicroblogsEntry microblogsEntry) {
		_microblogsEntry = microblogsEntry;
	}

	public Class<?> getModelClass() {
		return MicroblogsEntry.class;
	}

	public String getModelClassName() {
		return MicroblogsEntry.class.getName();
	}

	/**
	* Gets the primary key of this microblogs entry.
	*
	* @return the primary key of this microblogs entry
	*/
	public long getPrimaryKey() {
		return _microblogsEntry.getPrimaryKey();
	}

	/**
	* Sets the primary key of this microblogs entry
	*
	* @param pk the primary key of this microblogs entry
	*/
	public void setPrimaryKey(long pk) {
		_microblogsEntry.setPrimaryKey(pk);
	}

	/**
	* Gets the microblogs entry ID of this microblogs entry.
	*
	* @return the microblogs entry ID of this microblogs entry
	*/
	public long getMicroblogsEntryId() {
		return _microblogsEntry.getMicroblogsEntryId();
	}

	/**
	* Sets the microblogs entry ID of this microblogs entry.
	*
	* @param microblogsEntryId the microblogs entry ID of this microblogs entry
	*/
	public void setMicroblogsEntryId(long microblogsEntryId) {
		_microblogsEntry.setMicroblogsEntryId(microblogsEntryId);
	}

	/**
	* Gets the company ID of this microblogs entry.
	*
	* @return the company ID of this microblogs entry
	*/
	public long getCompanyId() {
		return _microblogsEntry.getCompanyId();
	}

	/**
	* Sets the company ID of this microblogs entry.
	*
	* @param companyId the company ID of this microblogs entry
	*/
	public void setCompanyId(long companyId) {
		_microblogsEntry.setCompanyId(companyId);
	}

	/**
	* Gets the user ID of this microblogs entry.
	*
	* @return the user ID of this microblogs entry
	*/
	public long getUserId() {
		return _microblogsEntry.getUserId();
	}

	/**
	* Sets the user ID of this microblogs entry.
	*
	* @param userId the user ID of this microblogs entry
	*/
	public void setUserId(long userId) {
		_microblogsEntry.setUserId(userId);
	}

	/**
	* Gets the user uuid of this microblogs entry.
	*
	* @return the user uuid of this microblogs entry
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _microblogsEntry.getUserUuid();
	}

	/**
	* Sets the user uuid of this microblogs entry.
	*
	* @param userUuid the user uuid of this microblogs entry
	*/
	public void setUserUuid(java.lang.String userUuid) {
		_microblogsEntry.setUserUuid(userUuid);
	}

	/**
	* Gets the user name of this microblogs entry.
	*
	* @return the user name of this microblogs entry
	*/
	public java.lang.String getUserName() {
		return _microblogsEntry.getUserName();
	}

	/**
	* Sets the user name of this microblogs entry.
	*
	* @param userName the user name of this microblogs entry
	*/
	public void setUserName(java.lang.String userName) {
		_microblogsEntry.setUserName(userName);
	}

	/**
	* Gets the create date of this microblogs entry.
	*
	* @return the create date of this microblogs entry
	*/
	public java.util.Date getCreateDate() {
		return _microblogsEntry.getCreateDate();
	}

	/**
	* Sets the create date of this microblogs entry.
	*
	* @param createDate the create date of this microblogs entry
	*/
	public void setCreateDate(java.util.Date createDate) {
		_microblogsEntry.setCreateDate(createDate);
	}

	/**
	* Gets the modified date of this microblogs entry.
	*
	* @return the modified date of this microblogs entry
	*/
	public java.util.Date getModifiedDate() {
		return _microblogsEntry.getModifiedDate();
	}

	/**
	* Sets the modified date of this microblogs entry.
	*
	* @param modifiedDate the modified date of this microblogs entry
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_microblogsEntry.setModifiedDate(modifiedDate);
	}

	/**
	* Gets the content of this microblogs entry.
	*
	* @return the content of this microblogs entry
	*/
	public java.lang.String getContent() {
		return _microblogsEntry.getContent();
	}

	/**
	* Sets the content of this microblogs entry.
	*
	* @param content the content of this microblogs entry
	*/
	public void setContent(java.lang.String content) {
		_microblogsEntry.setContent(content);
	}

	/**
	* Gets the type of this microblogs entry.
	*
	* @return the type of this microblogs entry
	*/
	public int getType() {
		return _microblogsEntry.getType();
	}

	/**
	* Sets the type of this microblogs entry.
	*
	* @param type the type of this microblogs entry
	*/
	public void setType(int type) {
		_microblogsEntry.setType(type);
	}

	/**
	* Gets the receiver user ID of this microblogs entry.
	*
	* @return the receiver user ID of this microblogs entry
	*/
	public long getReceiverUserId() {
		return _microblogsEntry.getReceiverUserId();
	}

	/**
	* Sets the receiver user ID of this microblogs entry.
	*
	* @param receiverUserId the receiver user ID of this microblogs entry
	*/
	public void setReceiverUserId(long receiverUserId) {
		_microblogsEntry.setReceiverUserId(receiverUserId);
	}

	/**
	* Gets the receiver user uuid of this microblogs entry.
	*
	* @return the receiver user uuid of this microblogs entry
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getReceiverUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _microblogsEntry.getReceiverUserUuid();
	}

	/**
	* Sets the receiver user uuid of this microblogs entry.
	*
	* @param receiverUserUuid the receiver user uuid of this microblogs entry
	*/
	public void setReceiverUserUuid(java.lang.String receiverUserUuid) {
		_microblogsEntry.setReceiverUserUuid(receiverUserUuid);
	}

	/**
	* Gets the receiver microblogs entry ID of this microblogs entry.
	*
	* @return the receiver microblogs entry ID of this microblogs entry
	*/
	public long getReceiverMicroblogsEntryId() {
		return _microblogsEntry.getReceiverMicroblogsEntryId();
	}

	/**
	* Sets the receiver microblogs entry ID of this microblogs entry.
	*
	* @param receiverMicroblogsEntryId the receiver microblogs entry ID of this microblogs entry
	*/
	public void setReceiverMicroblogsEntryId(long receiverMicroblogsEntryId) {
		_microblogsEntry.setReceiverMicroblogsEntryId(receiverMicroblogsEntryId);
	}

	/**
	* Gets the social relation type of this microblogs entry.
	*
	* @return the social relation type of this microblogs entry
	*/
	public int getSocialRelationType() {
		return _microblogsEntry.getSocialRelationType();
	}

	/**
	* Sets the social relation type of this microblogs entry.
	*
	* @param socialRelationType the social relation type of this microblogs entry
	*/
	public void setSocialRelationType(int socialRelationType) {
		_microblogsEntry.setSocialRelationType(socialRelationType);
	}

	public boolean isNew() {
		return _microblogsEntry.isNew();
	}

	public void setNew(boolean n) {
		_microblogsEntry.setNew(n);
	}

	public boolean isCachedModel() {
		return _microblogsEntry.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_microblogsEntry.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _microblogsEntry.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_microblogsEntry.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _microblogsEntry.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _microblogsEntry.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_microblogsEntry.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return new MicroblogsEntryWrapper((MicroblogsEntry)_microblogsEntry.clone());
	}

	public int compareTo(
		com.liferay.microblogs.model.MicroblogsEntry microblogsEntry) {
		return _microblogsEntry.compareTo(microblogsEntry);
	}

	public int hashCode() {
		return _microblogsEntry.hashCode();
	}

	public com.liferay.microblogs.model.MicroblogsEntry toEscapedModel() {
		return new MicroblogsEntryWrapper(_microblogsEntry.toEscapedModel());
	}

	public java.lang.String toString() {
		return _microblogsEntry.toString();
	}

	public java.lang.String toXmlString() {
		return _microblogsEntry.toXmlString();
	}

	public MicroblogsEntry getWrappedMicroblogsEntry() {
		return _microblogsEntry;
	}

	private MicroblogsEntry _microblogsEntry;
}