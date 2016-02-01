package com.tcs.matrimony.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.tcs.matrimony.dao.Service;
import com.tcs.matrimony.form.LoginForm;

public class ChangePwdAction extends Action{


	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
			LoginForm cp=(LoginForm) form;
			Service s=new Service();
			cp.setUser_id("ran13233");
			System.out.println("in action"+cp.getUser_id());
			ActionMessages am=new ActionMessages();
			int a=0;
			if(cp.getPassword().equals(s.getPwdVer1(cp))){
			if(!cp.getNewpwd().equals(s.getPwdVer1(cp))){
				if(cp.getNewpwd().equals(s.getPwdVer2(cp))){
					ActionMessage msg=new ActionMessage("changepassword.label.action.error3");
					am.add("error3", msg);
					saveMessages(request,am);
					return mapping.findForward("failed");
				}else{
					a=s.updatePwd(cp);
					if(a!=0){
						ActionMessage msg=new ActionMessage("changepassword.label.action.error1");
						am.add("error1", msg);
						saveMessages(request,am);
						return mapping.findForward("success");
					}else{
						ActionMessage msg=new ActionMessage("changepassword.label.action.error2");
						am.add("error2", msg);
						saveMessages(request,am);
						return mapping.findForward("error");
					}
				}
				
			}else{
				ActionMessage msg=new ActionMessage("changepassword.label.action.error3");
				am.add("error3", msg);
				saveMessages(request,am);
				return mapping.findForward("failed");
			}
			
	}else{
		ActionMessage msg=new ActionMessage("changepassword.label.action.error4");
		am.add("error4", msg);
		saveMessages(request,am);
		return mapping.findForward("failed");
		
		
	}
}
}
