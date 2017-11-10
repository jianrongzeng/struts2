package com.wgh;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -287087073025401584L;
	private String userName;
	
	public String execute() throws Exception{
		// 判断用户名是否有效
	if(userName == null || "".equals(userName)){
			// 返回到错误页面
			return ERROR;
		}else{
			// 返回到成功页面
			return SUCCESS;
		}
	}

	// 添加用户信息的方法
	public String add() throws Exception {
		setUserName("添加用户信息");
		return "add";
	}

	// 修改用户信息的方法
	public String update() throws Exception {
		setUserName("修改用户信息");
		return "update";
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
