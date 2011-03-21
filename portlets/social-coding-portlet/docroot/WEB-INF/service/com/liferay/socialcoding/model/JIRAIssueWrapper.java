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

package com.liferay.socialcoding.model;

/**
 * <p>
 * This class is a wrapper for {@link JIRAIssue}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       JIRAIssue
 * @generated
 */
public class JIRAIssueWrapper implements JIRAIssue {
	public JIRAIssueWrapper(JIRAIssue jiraIssue) {
		_jiraIssue = jiraIssue;
	}

	public Class<?> getModelClass() {
		return JIRAIssue.class;
	}

	public String getModelClassName() {
		return JIRAIssue.class.getName();
	}

	/**
	* Gets the primary key of this j i r a issue.
	*
	* @return the primary key of this j i r a issue
	*/
	public long getPrimaryKey() {
		return _jiraIssue.getPrimaryKey();
	}

	/**
	* Sets the primary key of this j i r a issue
	*
	* @param pk the primary key of this j i r a issue
	*/
	public void setPrimaryKey(long pk) {
		_jiraIssue.setPrimaryKey(pk);
	}

	/**
	* Gets the jira issue ID of this j i r a issue.
	*
	* @return the jira issue ID of this j i r a issue
	*/
	public long getJiraIssueId() {
		return _jiraIssue.getJiraIssueId();
	}

	/**
	* Sets the jira issue ID of this j i r a issue.
	*
	* @param jiraIssueId the jira issue ID of this j i r a issue
	*/
	public void setJiraIssueId(long jiraIssueId) {
		_jiraIssue.setJiraIssueId(jiraIssueId);
	}

	/**
	* Gets the create date of this j i r a issue.
	*
	* @return the create date of this j i r a issue
	*/
	public java.util.Date getCreateDate() {
		return _jiraIssue.getCreateDate();
	}

	/**
	* Sets the create date of this j i r a issue.
	*
	* @param createDate the create date of this j i r a issue
	*/
	public void setCreateDate(java.util.Date createDate) {
		_jiraIssue.setCreateDate(createDate);
	}

	/**
	* Gets the modified date of this j i r a issue.
	*
	* @return the modified date of this j i r a issue
	*/
	public java.util.Date getModifiedDate() {
		return _jiraIssue.getModifiedDate();
	}

	/**
	* Sets the modified date of this j i r a issue.
	*
	* @param modifiedDate the modified date of this j i r a issue
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_jiraIssue.setModifiedDate(modifiedDate);
	}

	/**
	* Gets the project ID of this j i r a issue.
	*
	* @return the project ID of this j i r a issue
	*/
	public long getProjectId() {
		return _jiraIssue.getProjectId();
	}

	/**
	* Sets the project ID of this j i r a issue.
	*
	* @param projectId the project ID of this j i r a issue
	*/
	public void setProjectId(long projectId) {
		_jiraIssue.setProjectId(projectId);
	}

	/**
	* Gets the key of this j i r a issue.
	*
	* @return the key of this j i r a issue
	*/
	public java.lang.String getKey() {
		return _jiraIssue.getKey();
	}

	/**
	* Sets the key of this j i r a issue.
	*
	* @param key the key of this j i r a issue
	*/
	public void setKey(java.lang.String key) {
		_jiraIssue.setKey(key);
	}

	/**
	* Gets the summary of this j i r a issue.
	*
	* @return the summary of this j i r a issue
	*/
	public java.lang.String getSummary() {
		return _jiraIssue.getSummary();
	}

	/**
	* Sets the summary of this j i r a issue.
	*
	* @param summary the summary of this j i r a issue
	*/
	public void setSummary(java.lang.String summary) {
		_jiraIssue.setSummary(summary);
	}

	/**
	* Gets the description of this j i r a issue.
	*
	* @return the description of this j i r a issue
	*/
	public java.lang.String getDescription() {
		return _jiraIssue.getDescription();
	}

	/**
	* Sets the description of this j i r a issue.
	*
	* @param description the description of this j i r a issue
	*/
	public void setDescription(java.lang.String description) {
		_jiraIssue.setDescription(description);
	}

	/**
	* Gets the reporter jira user ID of this j i r a issue.
	*
	* @return the reporter jira user ID of this j i r a issue
	*/
	public java.lang.String getReporterJiraUserId() {
		return _jiraIssue.getReporterJiraUserId();
	}

	/**
	* Sets the reporter jira user ID of this j i r a issue.
	*
	* @param reporterJiraUserId the reporter jira user ID of this j i r a issue
	*/
	public void setReporterJiraUserId(java.lang.String reporterJiraUserId) {
		_jiraIssue.setReporterJiraUserId(reporterJiraUserId);
	}

	/**
	* Gets the assignee jira user ID of this j i r a issue.
	*
	* @return the assignee jira user ID of this j i r a issue
	*/
	public java.lang.String getAssigneeJiraUserId() {
		return _jiraIssue.getAssigneeJiraUserId();
	}

	/**
	* Sets the assignee jira user ID of this j i r a issue.
	*
	* @param assigneeJiraUserId the assignee jira user ID of this j i r a issue
	*/
	public void setAssigneeJiraUserId(java.lang.String assigneeJiraUserId) {
		_jiraIssue.setAssigneeJiraUserId(assigneeJiraUserId);
	}

	/**
	* Gets the resolution of this j i r a issue.
	*
	* @return the resolution of this j i r a issue
	*/
	public java.lang.String getResolution() {
		return _jiraIssue.getResolution();
	}

	/**
	* Sets the resolution of this j i r a issue.
	*
	* @param resolution the resolution of this j i r a issue
	*/
	public void setResolution(java.lang.String resolution) {
		_jiraIssue.setResolution(resolution);
	}

	/**
	* Gets the status of this j i r a issue.
	*
	* @return the status of this j i r a issue
	*/
	public java.lang.String getStatus() {
		return _jiraIssue.getStatus();
	}

	/**
	* Sets the status of this j i r a issue.
	*
	* @param status the status of this j i r a issue
	*/
	public void setStatus(java.lang.String status) {
		_jiraIssue.setStatus(status);
	}

	public boolean isNew() {
		return _jiraIssue.isNew();
	}

	public void setNew(boolean n) {
		_jiraIssue.setNew(n);
	}

	public boolean isCachedModel() {
		return _jiraIssue.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_jiraIssue.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _jiraIssue.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_jiraIssue.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _jiraIssue.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _jiraIssue.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_jiraIssue.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return new JIRAIssueWrapper((JIRAIssue)_jiraIssue.clone());
	}

	public int compareTo(com.liferay.socialcoding.model.JIRAIssue jiraIssue) {
		return _jiraIssue.compareTo(jiraIssue);
	}

	public int hashCode() {
		return _jiraIssue.hashCode();
	}

	public com.liferay.socialcoding.model.JIRAIssue toEscapedModel() {
		return new JIRAIssueWrapper(_jiraIssue.toEscapedModel());
	}

	public java.lang.String toString() {
		return _jiraIssue.toString();
	}

	public java.lang.String toXmlString() {
		return _jiraIssue.toXmlString();
	}

	public JIRAIssue getWrappedJIRAIssue() {
		return _jiraIssue;
	}

	private JIRAIssue _jiraIssue;
}