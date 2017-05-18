package com.shark.ssm.common;

import java.util.Date;

import com.shark.ssm.models.sys.entity.User;

import lombok.Data;


/** 
 * @Description: TODO
 * @author Wangjie
 * @date 创建时间：2017年5月18日 下午11:07:12
 * @version 1.0
 * @since  
 */
@Data
public abstract class DataEntity<T> {
private static final long serialVersionUID = 1L;
	
	protected String id;

	protected String remarks;	// 备注
	protected User createBy;	// 创建者
	protected Date createDate;	// 创建日期
	protected User updateBy;	// 更新者
	protected Date updateDate;	// 更新日期
	protected String delFlag; 	// 删除标记（0：正常；1：删除；2：审核）
	
	public DataEntity() {
		super();
		//this.delFlag = DEL_FLAG_NORMAL;
	}
	
	public DataEntity(String id) {
		//super(id);
		this.id = id;
	}
	
}
