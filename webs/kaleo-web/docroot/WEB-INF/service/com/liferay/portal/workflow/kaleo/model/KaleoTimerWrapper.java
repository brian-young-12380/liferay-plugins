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

package com.liferay.portal.workflow.kaleo.model;

/**
 * <p>
 * This class is a wrapper for {@link KaleoTimer}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       KaleoTimer
 * @generated
 */
public class KaleoTimerWrapper implements KaleoTimer {
	public KaleoTimerWrapper(KaleoTimer kaleoTimer) {
		_kaleoTimer = kaleoTimer;
	}

	public Class<?> getModelClass() {
		return KaleoTimer.class;
	}

	public String getModelClassName() {
		return KaleoTimer.class.getName();
	}

	/**
	* Gets the primary key of this kaleo timer.
	*
	* @return the primary key of this kaleo timer
	*/
	public long getPrimaryKey() {
		return _kaleoTimer.getPrimaryKey();
	}

	/**
	* Sets the primary key of this kaleo timer
	*
	* @param pk the primary key of this kaleo timer
	*/
	public void setPrimaryKey(long pk) {
		_kaleoTimer.setPrimaryKey(pk);
	}

	/**
	* Gets the kaleo timer ID of this kaleo timer.
	*
	* @return the kaleo timer ID of this kaleo timer
	*/
	public long getKaleoTimerId() {
		return _kaleoTimer.getKaleoTimerId();
	}

	/**
	* Sets the kaleo timer ID of this kaleo timer.
	*
	* @param kaleoTimerId the kaleo timer ID of this kaleo timer
	*/
	public void setKaleoTimerId(long kaleoTimerId) {
		_kaleoTimer.setKaleoTimerId(kaleoTimerId);
	}

	/**
	* Gets the group ID of this kaleo timer.
	*
	* @return the group ID of this kaleo timer
	*/
	public long getGroupId() {
		return _kaleoTimer.getGroupId();
	}

	/**
	* Sets the group ID of this kaleo timer.
	*
	* @param groupId the group ID of this kaleo timer
	*/
	public void setGroupId(long groupId) {
		_kaleoTimer.setGroupId(groupId);
	}

	/**
	* Gets the company ID of this kaleo timer.
	*
	* @return the company ID of this kaleo timer
	*/
	public long getCompanyId() {
		return _kaleoTimer.getCompanyId();
	}

	/**
	* Sets the company ID of this kaleo timer.
	*
	* @param companyId the company ID of this kaleo timer
	*/
	public void setCompanyId(long companyId) {
		_kaleoTimer.setCompanyId(companyId);
	}

	/**
	* Gets the user ID of this kaleo timer.
	*
	* @return the user ID of this kaleo timer
	*/
	public long getUserId() {
		return _kaleoTimer.getUserId();
	}

	/**
	* Sets the user ID of this kaleo timer.
	*
	* @param userId the user ID of this kaleo timer
	*/
	public void setUserId(long userId) {
		_kaleoTimer.setUserId(userId);
	}

	/**
	* Gets the user uuid of this kaleo timer.
	*
	* @return the user uuid of this kaleo timer
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _kaleoTimer.getUserUuid();
	}

	/**
	* Sets the user uuid of this kaleo timer.
	*
	* @param userUuid the user uuid of this kaleo timer
	*/
	public void setUserUuid(java.lang.String userUuid) {
		_kaleoTimer.setUserUuid(userUuid);
	}

	/**
	* Gets the user name of this kaleo timer.
	*
	* @return the user name of this kaleo timer
	*/
	public java.lang.String getUserName() {
		return _kaleoTimer.getUserName();
	}

	/**
	* Sets the user name of this kaleo timer.
	*
	* @param userName the user name of this kaleo timer
	*/
	public void setUserName(java.lang.String userName) {
		_kaleoTimer.setUserName(userName);
	}

	/**
	* Gets the create date of this kaleo timer.
	*
	* @return the create date of this kaleo timer
	*/
	public java.util.Date getCreateDate() {
		return _kaleoTimer.getCreateDate();
	}

	/**
	* Sets the create date of this kaleo timer.
	*
	* @param createDate the create date of this kaleo timer
	*/
	public void setCreateDate(java.util.Date createDate) {
		_kaleoTimer.setCreateDate(createDate);
	}

	/**
	* Gets the modified date of this kaleo timer.
	*
	* @return the modified date of this kaleo timer
	*/
	public java.util.Date getModifiedDate() {
		return _kaleoTimer.getModifiedDate();
	}

	/**
	* Sets the modified date of this kaleo timer.
	*
	* @param modifiedDate the modified date of this kaleo timer
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_kaleoTimer.setModifiedDate(modifiedDate);
	}

	/**
	* Gets the kaleo definition ID of this kaleo timer.
	*
	* @return the kaleo definition ID of this kaleo timer
	*/
	public long getKaleoDefinitionId() {
		return _kaleoTimer.getKaleoDefinitionId();
	}

	/**
	* Sets the kaleo definition ID of this kaleo timer.
	*
	* @param kaleoDefinitionId the kaleo definition ID of this kaleo timer
	*/
	public void setKaleoDefinitionId(long kaleoDefinitionId) {
		_kaleoTimer.setKaleoDefinitionId(kaleoDefinitionId);
	}

	/**
	* Gets the kaleo node ID of this kaleo timer.
	*
	* @return the kaleo node ID of this kaleo timer
	*/
	public long getKaleoNodeId() {
		return _kaleoTimer.getKaleoNodeId();
	}

	/**
	* Sets the kaleo node ID of this kaleo timer.
	*
	* @param kaleoNodeId the kaleo node ID of this kaleo timer
	*/
	public void setKaleoNodeId(long kaleoNodeId) {
		_kaleoTimer.setKaleoNodeId(kaleoNodeId);
	}

	/**
	* Gets the parent kaleo node ID of this kaleo timer.
	*
	* @return the parent kaleo node ID of this kaleo timer
	*/
	public long getParentKaleoNodeId() {
		return _kaleoTimer.getParentKaleoNodeId();
	}

	/**
	* Sets the parent kaleo node ID of this kaleo timer.
	*
	* @param parentKaleoNodeId the parent kaleo node ID of this kaleo timer
	*/
	public void setParentKaleoNodeId(long parentKaleoNodeId) {
		_kaleoTimer.setParentKaleoNodeId(parentKaleoNodeId);
	}

	/**
	* Gets the name of this kaleo timer.
	*
	* @return the name of this kaleo timer
	*/
	public java.lang.String getName() {
		return _kaleoTimer.getName();
	}

	/**
	* Sets the name of this kaleo timer.
	*
	* @param name the name of this kaleo timer
	*/
	public void setName(java.lang.String name) {
		_kaleoTimer.setName(name);
	}

	/**
	* Gets the default timer of this kaleo timer.
	*
	* @return the default timer of this kaleo timer
	*/
	public boolean getDefaultTimer() {
		return _kaleoTimer.getDefaultTimer();
	}

	/**
	* Determines if this kaleo timer is default timer.
	*
	* @return <code>true</code> if this kaleo timer is default timer; <code>false</code> otherwise
	*/
	public boolean isDefaultTimer() {
		return _kaleoTimer.isDefaultTimer();
	}

	/**
	* Sets whether this kaleo timer is default timer.
	*
	* @param defaultTimer the default timer of this kaleo timer
	*/
	public void setDefaultTimer(boolean defaultTimer) {
		_kaleoTimer.setDefaultTimer(defaultTimer);
	}

	/**
	* Gets the description of this kaleo timer.
	*
	* @return the description of this kaleo timer
	*/
	public java.lang.String getDescription() {
		return _kaleoTimer.getDescription();
	}

	/**
	* Sets the description of this kaleo timer.
	*
	* @param description the description of this kaleo timer
	*/
	public void setDescription(java.lang.String description) {
		_kaleoTimer.setDescription(description);
	}

	/**
	* Gets the duration of this kaleo timer.
	*
	* @return the duration of this kaleo timer
	*/
	public double getDuration() {
		return _kaleoTimer.getDuration();
	}

	/**
	* Sets the duration of this kaleo timer.
	*
	* @param duration the duration of this kaleo timer
	*/
	public void setDuration(double duration) {
		_kaleoTimer.setDuration(duration);
	}

	/**
	* Gets the scale of this kaleo timer.
	*
	* @return the scale of this kaleo timer
	*/
	public java.lang.String getScale() {
		return _kaleoTimer.getScale();
	}

	/**
	* Sets the scale of this kaleo timer.
	*
	* @param scale the scale of this kaleo timer
	*/
	public void setScale(java.lang.String scale) {
		_kaleoTimer.setScale(scale);
	}

	public boolean isNew() {
		return _kaleoTimer.isNew();
	}

	public void setNew(boolean n) {
		_kaleoTimer.setNew(n);
	}

	public boolean isCachedModel() {
		return _kaleoTimer.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_kaleoTimer.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _kaleoTimer.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_kaleoTimer.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _kaleoTimer.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _kaleoTimer.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_kaleoTimer.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return new KaleoTimerWrapper((KaleoTimer)_kaleoTimer.clone());
	}

	public int compareTo(
		com.liferay.portal.workflow.kaleo.model.KaleoTimer kaleoTimer) {
		return _kaleoTimer.compareTo(kaleoTimer);
	}

	public int hashCode() {
		return _kaleoTimer.hashCode();
	}

	public com.liferay.portal.workflow.kaleo.model.KaleoTimer toEscapedModel() {
		return new KaleoTimerWrapper(_kaleoTimer.toEscapedModel());
	}

	public java.lang.String toString() {
		return _kaleoTimer.toString();
	}

	public java.lang.String toXmlString() {
		return _kaleoTimer.toXmlString();
	}

	public KaleoTimer getWrappedKaleoTimer() {
		return _kaleoTimer;
	}

	private KaleoTimer _kaleoTimer;
}