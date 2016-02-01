package com.tcs.matrimony.action;

import java.util.ArrayList;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.tcs.matrimony.dao.Service;
import com.tcs.matrimony.form.LoginForm;

public class LoginAction extends Action{

public ActionForward execute(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response)
		throws Exception {
	LoginForm f=(LoginForm) form;
	Service dao=new Service();
	String action=f.getAction();
	if(action.equalsIgnoreCase("ForgotPassword")){
		ArrayList<LoginForm> list=dao.forgotPassword(f);
		f.setAr(list);
		if(!list.isEmpty()){
		return mapping.findForward("SUCCESS");	
		}
		else{
		return mapping.findForward("FAILURE");
		}
		
	}
	

	if(action.equalsIgnoreCase("Submit")){
		System.out.println("password");
		System.out.println(f.getUser_id());

	boolean b=dao.resetPassword(f);
	if(b){
	return mapping.findForward("SUCCESS");	
	}
	else{
	return mapping.findForward("FAILURE");
	}
	}
	
	
	if(action.equalsIgnoreCase("Reset Answer")){

		boolean b=dao.resetSecurity(f);
		if(b){
		return mapping.findForward("SUCCESS");	
		}
		else{
		return mapping.findForward("FAILURE");
		}
		}
		
	
	if(action.equalsIgnoreCase("Login")){
	System.out.println("in action" +f.getUser_id());
	ArrayList<LoginForm> ar=dao.getLoginDetails(f);
	
	if(!ar.isEmpty()){
		System.out.println("in action" +f.getUser_id());
		if(f.getUser_id().matches(ar.get(0).getUser_id()) && f.getPassword().matches(ar.get(0).getPassword())){
			return mapping.findForward("success");
		}else{
			return mapping.findForward("failed");
		}
	}else{
		return mapping.findForward("error");
	}
	}
	
	return null;
}
	
}
