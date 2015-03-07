package com.sjtu.icare.common.persistence;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sjtu.icare.common.persistence.BaseEntity;
//import com.sjtu.icare.common.utils.IdGen;
import com.sjtu.icare.modules.sys.entity.User;
import com.sjtu.icare.modules.sys.utils.UserUtils;

/**
 * 数据Entity类
 * @author jty
 * @version 2015-03-03
 */
public abstract class DataEntity<T> extends BaseEntity<T> {

	private static final long serialVersionUID = 1L;
	
	protected String notes;	// 备注
//	protected User createBy;	// 创建者
	protected Date createDate;	// 创建日期
//	protected User updateBy;	// 更新者
	protected Date updateDate;	// 更新日期
	protected String delFlag; 	// 删除标记（0：正常；1：删除；2：审核）
//	
	public DataEntity() {
		super();
		this.delFlag = DEL_FLAG_NORMAL;
	}
	
	public DataEntity(int id) {
		super(id);
	}
	
	/**
	 * 插入之前执行方法，需要手动调用
	 */
	@Override
	public void preInsert(){
		// 不限制ID为UUID，调用setIsNewRecord()使用自定义ID
//		if (!this.isNewRecord){
//			setId(IdGen.uuid());
//		}
//		User user = UserUtils.getUser();
//		if (StringUtils.isNotBlank(user.getId())){
//			this.updateBy = user;
//			this.createBy = user;
//		}
		this.updateDate = new Date();
		this.createDate = this.updateDate;
	}
	
	/**
	 * 更新之前执行方法，需要手动调用
	 */
	@Override
	public void preUpdate(){
//		User user = UserUtils.getUser();
//		if (StringUtils.isNotBlank(user.getId())){
//			this.updateBy = user;
//		}
		this.updateDate = new Date();
	}
	
	@Length(min=0, max=255)
	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
//	
//	@JsonIgnore
//	public User getCreateBy() {
//		return createBy;
//	}
//
//	public void setCreateBy(User createBy) {
//		this.createBy = createBy;
//	}
//
//	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
//	public Date getCreateDate() {
//		return createDate;
//	}
//
//	public void setCreateDate(Date createDate) {
//		this.createDate = createDate;
//	}
//
//	@JsonIgnore
//	public User getUpdateBy() {
//		return updateBy;
//	}
//
//	public void setUpdateBy(User updateBy) {
//		this.updateBy = updateBy;
//	}
//
//	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
//	public Date getUpdateDate() {
//		return updateDate;
//	}
//
//	public void setUpdateDate(Date updateDate) {
//		this.updateDate = updateDate;
//	}
//
	@JsonIgnore
	@Length(min=1, max=1)
	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}

}