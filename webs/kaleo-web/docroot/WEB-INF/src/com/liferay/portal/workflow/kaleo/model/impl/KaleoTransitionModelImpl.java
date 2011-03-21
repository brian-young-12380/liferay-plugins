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

package com.liferay.portal.workflow.kaleo.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portal.workflow.kaleo.model.KaleoTransition;
import com.liferay.portal.workflow.kaleo.model.KaleoTransitionModel;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.Date;

/**
 * The base model implementation for the KaleoTransition service. Represents a row in the &quot;KaleoTransition&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.portal.workflow.kaleo.model.KaleoTransitionModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link KaleoTransitionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KaleoTransitionImpl
 * @see com.liferay.portal.workflow.kaleo.model.KaleoTransition
 * @see com.liferay.portal.workflow.kaleo.model.KaleoTransitionModel
 * @generated
 */
public class KaleoTransitionModelImpl extends BaseModelImpl<KaleoTransition>
	implements KaleoTransitionModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a kaleo transition model instance should use the {@link com.liferay.portal.workflow.kaleo.model.KaleoTransition} interface instead.
	 */
	public static final String TABLE_NAME = "KaleoTransition";
	public static final Object[][] TABLE_COLUMNS = {
			{ "kaleoTransitionId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "kaleoDefinitionId", Types.BIGINT },
			{ "kaleoNodeId", Types.BIGINT },
			{ "name", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "sourceKaleoNodeId", Types.BIGINT },
			{ "sourceKaleoNodeName", Types.VARCHAR },
			{ "targetKaleoNodeId", Types.BIGINT },
			{ "targetKaleoNodeName", Types.VARCHAR },
			{ "defaultTransition", Types.BOOLEAN }
		};
	public static final String TABLE_SQL_CREATE = "create table KaleoTransition (kaleoTransitionId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(200) null,createDate DATE null,modifiedDate DATE null,kaleoDefinitionId LONG,kaleoNodeId LONG,name VARCHAR(200) null,description STRING null,sourceKaleoNodeId LONG,sourceKaleoNodeName VARCHAR(200) null,targetKaleoNodeId LONG,targetKaleoNodeName VARCHAR(200) null,defaultTransition BOOLEAN)";
	public static final String TABLE_SQL_DROP = "drop table KaleoTransition";
	public static final String ORDER_BY_JPQL = " ORDER BY kaleoTransition.kaleoTransitionId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY KaleoTransition.kaleoTransitionId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.portal.workflow.kaleo.model.KaleoTransition"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.portal.workflow.kaleo.model.KaleoTransition"),
			true);

	public Class<?> getModelClass() {
		return KaleoTransition.class;
	}

	public String getModelClassName() {
		return KaleoTransition.class.getName();
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.portal.workflow.kaleo.model.KaleoTransition"));

	public KaleoTransitionModelImpl() {
	}

	public long getPrimaryKey() {
		return _kaleoTransitionId;
	}

	public void setPrimaryKey(long pk) {
		setKaleoTransitionId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_kaleoTransitionId);
	}

	public long getKaleoTransitionId() {
		return _kaleoTransitionId;
	}

	public void setKaleoTransitionId(long kaleoTransitionId) {
		_kaleoTransitionId = kaleoTransitionId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getKaleoDefinitionId() {
		return _kaleoDefinitionId;
	}

	public void setKaleoDefinitionId(long kaleoDefinitionId) {
		_kaleoDefinitionId = kaleoDefinitionId;
	}

	public long getKaleoNodeId() {
		return _kaleoNodeId;
	}

	public void setKaleoNodeId(long kaleoNodeId) {
		if (!_setOriginalKaleoNodeId) {
			_setOriginalKaleoNodeId = true;

			_originalKaleoNodeId = _kaleoNodeId;
		}

		_kaleoNodeId = kaleoNodeId;
	}

	public long getOriginalKaleoNodeId() {
		return _originalKaleoNodeId;
	}

	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	public void setName(String name) {
		if (_originalName == null) {
			_originalName = _name;
		}

		_name = name;
	}

	public String getOriginalName() {
		return GetterUtil.getString(_originalName);
	}

	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	public void setDescription(String description) {
		_description = description;
	}

	public long getSourceKaleoNodeId() {
		return _sourceKaleoNodeId;
	}

	public void setSourceKaleoNodeId(long sourceKaleoNodeId) {
		_sourceKaleoNodeId = sourceKaleoNodeId;
	}

	public String getSourceKaleoNodeName() {
		if (_sourceKaleoNodeName == null) {
			return StringPool.BLANK;
		}
		else {
			return _sourceKaleoNodeName;
		}
	}

	public void setSourceKaleoNodeName(String sourceKaleoNodeName) {
		_sourceKaleoNodeName = sourceKaleoNodeName;
	}

	public long getTargetKaleoNodeId() {
		return _targetKaleoNodeId;
	}

	public void setTargetKaleoNodeId(long targetKaleoNodeId) {
		_targetKaleoNodeId = targetKaleoNodeId;
	}

	public String getTargetKaleoNodeName() {
		if (_targetKaleoNodeName == null) {
			return StringPool.BLANK;
		}
		else {
			return _targetKaleoNodeName;
		}
	}

	public void setTargetKaleoNodeName(String targetKaleoNodeName) {
		_targetKaleoNodeName = targetKaleoNodeName;
	}

	public boolean getDefaultTransition() {
		return _defaultTransition;
	}

	public boolean isDefaultTransition() {
		return _defaultTransition;
	}

	public void setDefaultTransition(boolean defaultTransition) {
		if (!_setOriginalDefaultTransition) {
			_setOriginalDefaultTransition = true;

			_originalDefaultTransition = _defaultTransition;
		}

		_defaultTransition = defaultTransition;
	}

	public boolean getOriginalDefaultTransition() {
		return _originalDefaultTransition;
	}

	public KaleoTransition toEscapedModel() {
		if (isEscapedModel()) {
			return (KaleoTransition)this;
		}
		else {
			return (KaleoTransition)Proxy.newProxyInstance(KaleoTransition.class.getClassLoader(),
				new Class[] { KaleoTransition.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					KaleoTransition.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	public Object clone() {
		KaleoTransitionImpl kaleoTransitionImpl = new KaleoTransitionImpl();

		kaleoTransitionImpl.setKaleoTransitionId(getKaleoTransitionId());

		kaleoTransitionImpl.setGroupId(getGroupId());

		kaleoTransitionImpl.setCompanyId(getCompanyId());

		kaleoTransitionImpl.setUserId(getUserId());

		kaleoTransitionImpl.setUserName(getUserName());

		kaleoTransitionImpl.setCreateDate(getCreateDate());

		kaleoTransitionImpl.setModifiedDate(getModifiedDate());

		kaleoTransitionImpl.setKaleoDefinitionId(getKaleoDefinitionId());

		kaleoTransitionImpl.setKaleoNodeId(getKaleoNodeId());

		KaleoTransitionModelImpl kaleoTransitionModelImpl = kaleoTransitionImpl;

		kaleoTransitionModelImpl._originalKaleoNodeId = kaleoTransitionModelImpl._kaleoNodeId;

		kaleoTransitionModelImpl._setOriginalKaleoNodeId = false;
		kaleoTransitionImpl.setName(getName());

		kaleoTransitionModelImpl._originalName = kaleoTransitionModelImpl._name;

		kaleoTransitionImpl.setDescription(getDescription());

		kaleoTransitionImpl.setSourceKaleoNodeId(getSourceKaleoNodeId());

		kaleoTransitionImpl.setSourceKaleoNodeName(getSourceKaleoNodeName());

		kaleoTransitionImpl.setTargetKaleoNodeId(getTargetKaleoNodeId());

		kaleoTransitionImpl.setTargetKaleoNodeName(getTargetKaleoNodeName());

		kaleoTransitionImpl.setDefaultTransition(getDefaultTransition());

		kaleoTransitionModelImpl._originalDefaultTransition = kaleoTransitionModelImpl._defaultTransition;

		kaleoTransitionModelImpl._setOriginalDefaultTransition = false;

		return kaleoTransitionImpl;
	}

	public int compareTo(KaleoTransition kaleoTransition) {
		int value = 0;

		if (getKaleoTransitionId() < kaleoTransition.getKaleoTransitionId()) {
			value = -1;
		}
		else if (getKaleoTransitionId() > kaleoTransition.getKaleoTransitionId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		KaleoTransition kaleoTransition = null;

		try {
			kaleoTransition = (KaleoTransition)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = kaleoTransition.getPrimaryKey();

		if (getPrimaryKey() == pk) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (int)getPrimaryKey();
	}

	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{kaleoTransitionId=");
		sb.append(getKaleoTransitionId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", kaleoDefinitionId=");
		sb.append(getKaleoDefinitionId());
		sb.append(", kaleoNodeId=");
		sb.append(getKaleoNodeId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", sourceKaleoNodeId=");
		sb.append(getSourceKaleoNodeId());
		sb.append(", sourceKaleoNodeName=");
		sb.append(getSourceKaleoNodeName());
		sb.append(", targetKaleoNodeId=");
		sb.append(getTargetKaleoNodeId());
		sb.append(", targetKaleoNodeName=");
		sb.append(getTargetKaleoNodeName());
		sb.append(", defaultTransition=");
		sb.append(getDefaultTransition());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(52);

		sb.append("<model><model-name>");
		sb.append("com.liferay.portal.workflow.kaleo.model.KaleoTransition");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>kaleoTransitionId</column-name><column-value><![CDATA[");
		sb.append(getKaleoTransitionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kaleoDefinitionId</column-name><column-value><![CDATA[");
		sb.append(getKaleoDefinitionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kaleoNodeId</column-name><column-value><![CDATA[");
		sb.append(getKaleoNodeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sourceKaleoNodeId</column-name><column-value><![CDATA[");
		sb.append(getSourceKaleoNodeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sourceKaleoNodeName</column-name><column-value><![CDATA[");
		sb.append(getSourceKaleoNodeName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>targetKaleoNodeId</column-name><column-value><![CDATA[");
		sb.append(getTargetKaleoNodeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>targetKaleoNodeName</column-name><column-value><![CDATA[");
		sb.append(getTargetKaleoNodeName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>defaultTransition</column-name><column-value><![CDATA[");
		sb.append(getDefaultTransition());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _kaleoTransitionId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _kaleoDefinitionId;
	private long _kaleoNodeId;
	private long _originalKaleoNodeId;
	private boolean _setOriginalKaleoNodeId;
	private String _name;
	private String _originalName;
	private String _description;
	private long _sourceKaleoNodeId;
	private String _sourceKaleoNodeName;
	private long _targetKaleoNodeId;
	private String _targetKaleoNodeName;
	private boolean _defaultTransition;
	private boolean _originalDefaultTransition;
	private boolean _setOriginalDefaultTransition;
	private transient ExpandoBridge _expandoBridge;
}