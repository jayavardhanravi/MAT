package com.tcs.matrimony.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.tcs.matrimony.dao.Service;

import com.tcs.matrimony.form.*;

public class SearchAction extends Action{

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
			
		SearchForm sf=(SearchForm) form;
		Service s=new Service();
		
		String action=sf.getBn_action();
		if(action.equals("searchProfile")){
			ArrayList<SearchForm> lal=s.retrieveMtongue();
			ArrayList<SearchForm> ral=s.retrieveReligion();
			sf.setRal(ral);
			sf.setLal(lal);
			if(ral!=null&&lal!=null){
				return mapping.findForward("SUCCESS");
			}
			else{
				return mapping.findForward("FAILURE");
			}
			
		}
		
		if(action.equals("searchPartner")){
		
			ArrayList<SearchForm> ar= s.getSearchDetails(sf);
			if(!ar.isEmpty()){
				sf.setAr(ar);
				return mapping.findForward("success");
			}else{
				 sf.setBn_message("No records found.");
				return mapping.findForward("failed");
			}
		
		}
		
		if(action.equals("searchDetails")){
			PartnerForm pbean=new PartnerForm();
			ArrayList<PartnerForm> par1=s.getPartnerDetails(sf);
			pbean.setpUserId(par1.get(0).getpUserId());
			pbean.setpMstatus(par1.get(0).getpMstatus());
			pbean.setpMtongue(par1.get(0).getpMtongue());
			pbean.setpOccupation(par1.get(0).getpOccupation());
			pbean.setpReligion(par1.get(0).getpReligion());
			pbean.setpState(par1.get(0).getpState());
			ArrayList<SearchForm> psearch=s.getSearchDetails(sf,pbean);
			return mapping.findForward("success");
		}
		return mapping.findForward("failed");
	}

}
