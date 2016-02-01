package com.tcs.matrimony.form;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;

public class LoginForm extends ValidatorForm{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String user_id=null;
	private String password=null;
	private String newpwd=null;
	private String renewpwd=null;
	private String bn_message=null;
	private ArrayList<LoginForm> ar=null;
	private String action;
	private String security_Q;
	private String security_A;
	private String cSecurity_A;
	
	
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		this.ar=null;
		this.password=null;
		this.newpwd=null;
		this.renewpwd=null;
		this.user_id=null;
		this.bn_message=null;
	}
	
	
	
	
	public String getRenewpwd() {
		return renewpwd;
	}

	public void setRenewpwd(String renewpwd) {
		this.renewpwd = renewpwd;
	}

	public String getNewpwd() {
		return newpwd;
	}

	public void setNewpwd(String newpwd) {
		this.newpwd = newpwd;
	}


	public String getBn_message() {
		return bn_message;
	}


	public void setBn_message(String bn_message) {
		this.bn_message = bn_message;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public ArrayList<LoginForm> getAr() {
		return ar;
	}
	public void setAr(ArrayList<LoginForm> ar) {
		this.ar = ar;
	}




	public String getAction() {
		return action;
	}




	public void setAction(String action) {
		this.action = action;
	}




	public String getSecurity_Q() {
		return security_Q;
	}




	public void setSecurity_Q(String securityQ) {
		security_Q = securityQ;
	}




	public String getSecurity_A() {
		return security_A;
	}




	public void setSecurity_A(String securityA) {
		security_A = securityA;
	}




	public String getcSecurity_A() {
		return cSecurity_A;
	}




	public void setcSecurity_A(String cSecurityA) {
		cSecurity_A = cSecurityA;
	}
	
	
	
	
}
