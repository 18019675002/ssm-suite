package com.shark.ssm.models.sys.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.shark.ssm.common.DataEntity;

import lombok.Data;

/** 
 * @Description: TODO
 * @author Wangjie
 * @date 创建时间：2017年5月18日 下午10:36:23
 * @version 1.0
 * @since  
 */
@Data
public class User extends DataEntity<User> {
	private static final long serialVersionUID = 1L;
	private Office company;	// 归属公司
	private Office office;	// 归属部门
	private String loginName;// 登录名
	private String password;// 密码
	private String no;		// 工号
	private String name;	// 姓名
	private String email;	// 邮箱
	private String phone;	// 电话
	private String mobile;	// 手机
	private String userType;// 用户类型
	private String loginIp;	// 最后登陆IP
	private Date loginDate;	// 最后登陆日期
	private String loginFlag;	// 是否允许登陆
	private String photo;	// 头像

	private String oldLoginName;// 原登录名
	private String newPassword;	// 新密码
	
	private String oldLoginIp;	// 上次登陆IP
	private Date oldLoginDate;	// 上次登陆日期
	
	private Role role;	// 根据角色查询用户条件
	
	private List<Role> roleList = new ArrayList<Role>(); // 拥有角色列表

	public User() {
		super();
		//this.loginFlag = Global.YES;
	}
	
	/*public User(String id){
		super(id);
	}

	public User(String id, String loginName){
		super(id);
		this.loginName = loginName;
	}*/

	public User(Role role){
		super();
		this.role = role;
	}



}
