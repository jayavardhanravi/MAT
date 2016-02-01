package com.tcs.matrimony.action;


import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.tcs.matrimony.dao.Service;
import com.tcs.matrimony.form.EventForm;


public class EventAction extends DispatchAction{
	public ActionForward signUp(ActionMapping mapping, ActionForm form, 
		HttpServletRequest request, HttpServletResponse response) throws Exception {
	EventForm rForm=(EventForm) form;
	System.out.println(rForm.getBn_action());
	
	return mapping.findForward("REGISTER");

}

	public ActionForward Register(ActionMapping mapping, ActionForm form, 
		HttpServletRequest request, HttpServletResponse response) throws Exception {
	EventForm rForm=(EventForm) form;
	Service dao=new Service();
	System.out.println(rForm.getBn_action());
	String userId=dao.generateEId(rForm);
	rForm.setBn_userId(userId);
	boolean b=dao.eventRegister(rForm);
	if(b){
		return mapping.findForward("SUCCESS");
	}
	else{
		return mapping.findForward("FAILURE");
	}
}


public ActionForward searchPackage(ActionMapping mapping, ActionForm form, 
		HttpServletRequest request, HttpServletResponse response) throws Exception {
	
	
	return mapping.findForward("SEARCH");

}


public ActionForward purchasePackage(ActionMapping mapping, ActionForm form, 
		HttpServletRequest request, HttpServletResponse response) throws Exception {
	EventForm rForm=(EventForm) form;
	Service dao=new Service();
	ArrayList<EventForm> list=dao.getCodes();
	rForm.setAl(list);
	return mapping.findForward("PURCHASE");

}
public ActionForward contact(ActionMapping mapping, ActionForm form, 
		HttpServletRequest request, HttpServletResponse response) throws Exception {
	
	return mapping.findForward("POPUP");

}

public ActionForward Proceed(ActionMapping mapping, ActionForm form, 
		HttpServletRequest request, HttpServletResponse response) throws Exception {
	ArrayList<EventForm> list=new ArrayList<EventForm>();
	EventForm rForm=(EventForm) form;
	Service dao=new Service();
	System.out.println(rForm.getBn_action());
	list=dao.searchPackage(rForm);
	rForm.setAl(list);
	if(list!=null){
		return mapping.findForward("SEARCHRESULT");
	}
	else{
		return mapping.findForward("FAILURE");
	}
}

public ActionForward Next(ActionMapping mapping, ActionForm form, 
		HttpServletRequest request, HttpServletResponse response) throws Exception {

	EventForm rForm=(EventForm) form;
	ArrayList<EventForm> list=new ArrayList<EventForm>();
	list.add(rForm);
	rForm.setAl(list);
	
		return mapping.findForward("PAYMENT");

	
}


public ActionForward click(ActionMapping mapping, ActionForm form, 
		HttpServletRequest request, HttpServletResponse response) throws Exception {
	EventForm rForm=(EventForm) form;
	Service dao=new Service();
	rForm=dao.getPackageInfo(rForm);
	if(rForm!=null){
		rForm.seteForm(rForm);
		return mapping.findForward("SUCCESS");
	}
	else
		return mapping.findForward("FAILURE");
}
public ActionForward Pay(ActionMapping mapping, ActionForm form, 
		HttpServletRequest request, HttpServletResponse response) throws Exception {
	
	EventForm rForm=(EventForm) form;
	ArrayList<EventForm> list=new ArrayList<EventForm>();
	list.add(rForm);
	rForm.setAl(list);
		return mapping.findForward("SUCCESS");
	
}
public ActionForward Submit(ActionMapping mapping, ActionForm form, 
		HttpServletRequest request, HttpServletResponse response) throws Exception {
	EventForm rForm=(EventForm) form;
	ArrayList<EventForm> list=new ArrayList<EventForm>();
	list.add(rForm);
	rForm.setAl(list);
	
		return mapping.findForward("SUCCESS");
	
}
public ActionForward Continue(ActionMapping mapping, ActionForm form, 
		HttpServletRequest request, HttpServletResponse response) throws Exception {
	EventForm rForm=(EventForm) form;
	Service dao=new Service();
	System.out.println("hi"+rForm.getBn_code());
	 
	boolean b=dao.insertPaymentDetails(rForm);
	
	
		return mapping.findForward("SUCCESS");
	
}

}
