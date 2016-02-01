package com.tcs.matrimony.action;

import javax.servlet.http.HttpServletRequest; 
import java.util.*;
import javax.servlet.http.HttpServletResponse;


import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.tcs.matrimony.dao.Service;
import com.tcs.matrimony.form.RegisterForm;

public class RegisterAction extends DispatchAction{
	private static String success="SUCCESS";
	private static String failure="FAILURE";
	private static String profile="PROFILE";
	private static String value=null;
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		RegisterForm rForm=(RegisterForm) form;
		Service dao=new Service();
		String action=rForm.getAction();
		System.out.println(action);
		
		if(action.equalsIgnoreCase("uploadImage")){
		
			
			
			boolean b=dao.uploadProPic(rForm);
			
			if(b){
			return mapping.findForward("SUCCESS");
			}
			else
			{
				return mapping.findForward("FAILURE");
			}
		}
		
		if(action.equalsIgnoreCase("viewImage")){
			ArrayList<RegisterForm> list=new ArrayList<RegisterForm>();
			list=dao.retrieveProPic(rForm);
			rForm.setBean_al(list);
			//request.setAttribute("list", list);
			
			return mapping.findForward("DISPLAYIMAGE");	
			
		}
		if(action.equalsIgnoreCase("viewAlbum")){
			ArrayList<RegisterForm> list=new ArrayList<RegisterForm>();
			list=dao.retrieveAlbum(rForm);
			rForm.setBean_al(list);
			//request.setAttribute("list", list);
			if(list.isEmpty()){
				return mapping.findForward("FAILURE");
			}else{
			return mapping.findForward("DISPLAYIMAGE");	
			}
			
		}
		
		if(action.equalsIgnoreCase("register")){
		String userId=dao.generateId(rForm);
		rForm.setBean_userId(userId);
		boolean b=dao.register(rForm);
		if(b){
			return mapping.findForward(success);
		}
		else{
			return mapping.findForward(failure);
	}	
		}
		
		if(action.equalsIgnoreCase("ProfilePage")){
			System.out.println("profile");
			ArrayList<RegisterForm> ral=dao.getProfile(rForm);
		
			ArrayList<RegisterForm> ralp=dao.getProfilePartner(rForm);
			
			rForm.setBean_profileList(ral);
			rForm.setBean_partnerProfileList(ralp);
			if((ral.isEmpty())){

				return mapping.findForward(failure);
			}
			else{
				return mapping.findForward(profile);
			}
			
		
		
		}
		if(action.equalsIgnoreCase("Home")){
			return mapping.findForward(success);
		}
		
		if(action.equalsIgnoreCase("like")){
			
			boolean b=dao.like(rForm);
			if(b){
			return mapping.findForward("SUCCESS");
			}
			else
			{
				return mapping.findForward("FAILURE");
			}
			
		}
		
		if(action.equalsIgnoreCase("My Likes")){
			rForm.setBean_userId("saranya");
			 ArrayList<RegisterForm> list=dao.mylike(rForm);
			 rForm.setBean_al(list);
			if(list!=null){
			return mapping.findForward("MYLIKES");
			}
			else
			{
				return mapping.findForward("FAILURE");
			}
			
		}
		
		
		if(action.equalsIgnoreCase("My Followers")){
			rForm.setBean_userId("saranya");
			 ArrayList<RegisterForm> list=dao.myfollowers(rForm);
			 rForm.setBean_al(list);
			if(list!=null){
			return mapping.findForward("MYFOLLOWERS");
			}
			else
			{
				return mapping.findForward("FAILURE");
			}
			
		}
		
		if(action.equalsIgnoreCase("My Relations")){
			rForm.setBean_userId("saranya");
			 ArrayList<RegisterForm> list=dao.myrelations(rForm);
			 rForm.setBean_al(list);
			if(list!=null){
			return mapping.findForward("MYRELATIONS");
			}
			else
			{
				return mapping.findForward("FAILURE");
			}
			
		}
		
		if(action.equalsIgnoreCase("Chat")){
			
			return mapping.findForward("MESSAGE");
		}
		
		if(action.equalsIgnoreCase("Send")){
			rForm.setBean_userId("saranya");
			boolean b=dao.sendMessage(rForm);
			if(b){
			return mapping.findForward("SUCCESS");
			}
			else
			{
				return mapping.findForward("FAILURE");
			}
		}
		
		if(action.equalsIgnoreCase("Sent Messages")){
			rForm.setBean_userId("saranya");
			ArrayList<RegisterForm> list=dao.sentMessages(rForm);
			rForm.setBean_al(list);
			if(list!=null){
			return mapping.findForward("SENTMESSAGES");
			}
			else
			{
				return mapping.findForward("FAILURE");
			}
		}
		
		if(action.equalsIgnoreCase("Received Messages")){
			rForm.setBean_userId("saranya");
			ArrayList<RegisterForm> list=dao.receivedMessages(rForm);
			rForm.setBean_al(list);
			if(list!=null){
			return mapping.findForward("RMESSAGES");
			}
			else
			{
				return mapping.findForward("FAILURE");
			}
		}
		
		if(action.equalsIgnoreCase("Reply")){
			return mapping.findForward("SEND");
		}
		
		if(action.equalsIgnoreCase("editbasicdetails")){
			return mapping.findForward("BASIC");
		}
		
		if(action.equalsIgnoreCase("editReligiousdetails")){
			return mapping.findForward("RELIGION");
		}
		
		if(action.equalsIgnoreCase("editlocationdetails")){
			return mapping.findForward("LOCATION");
		}
		if(action.equalsIgnoreCase("editcontactdetails")){
			return mapping.findForward("CONTACT");
		}
		if(action.equalsIgnoreCase("editprofessionaldetails")){
			return mapping.findForward("PROF");
		}
		if(action.equalsIgnoreCase("editfamilydetails")){
			return mapping.findForward("FAMILY");
		}
		if(action.equalsIgnoreCase("editaboutme")){
			return mapping.findForward("ABOUTME");
		}
		if(action.equalsIgnoreCase("editinterests")){
			return mapping.findForward("INTERESTS");
		}
		if(action.equalsIgnoreCase("edithobbies")){
			return mapping.findForward("HOBBIES");
		}
		
		if(action.equalsIgnoreCase("editpartnersbasicdetails")){
			return mapping.findForward("PBASIC");
		}
		if(action.equalsIgnoreCase("editpartnersreligiousdetails")){
			return mapping.findForward("PRELIGION");
		}
		
		if(action.equalsIgnoreCase("editpartnerslocationdetails")){
			return mapping.findForward("PLOCATION");
		}
		if(action.equalsIgnoreCase("editpartnersprofessionaldetails")){
			return mapping.findForward("PPROF");
		}
		
		if(action.equalsIgnoreCase("updatebasicdetails")){
			
			boolean b=dao.updateBasic(rForm);
			if(b){
			return mapping.findForward("SUCCESS");
			}
			else
			{
				return mapping.findForward("FAILURE");
			}
		}
		if(action.equalsIgnoreCase("updatereligiousdetails")){
			boolean b=dao.updateReligion(rForm);
			
			if(b){
				return mapping.findForward("SUCCESS");
				}
			else
				{
					return mapping.findForward("FAILURE");
			}

		}
		
		if(action.equalsIgnoreCase("updatelocationdetails")){
			boolean b=dao.updateLocation(rForm);
		
			if(b){
				return mapping.findForward("SUCCESS");
				}
				else
				{
					return mapping.findForward("FAILURE");
				}

			
		}
		
		if(action.equalsIgnoreCase("updatecontactdetails")){
			boolean b=dao.updateContact(rForm);
			
			if(b){
				return mapping.findForward("SUCCESS");
				}
			else
				{
					return mapping.findForward("FAILURE");
			}

		}
		
		if(action.equalsIgnoreCase("updateaboutme")){
			boolean b=dao.updateAboutMe(rForm);
			if(b){
			return mapping.findForward("SUCCESS");
			}
			else
			{
				return mapping.findForward("FAILURE");
			}
		}
		
		if(action.equalsIgnoreCase("updatehobbies")){
			boolean b=dao.updateHobbies(rForm);
		
			if(b){
				return mapping.findForward("SUCCESS");
				}
				else
				{
					return mapping.findForward("FAILURE");
				}
			
		}
		
		if(action.equalsIgnoreCase("updateinterests")){
			boolean b=dao.updateInterests(rForm);
		
			if(b){
				return mapping.findForward("SUCCESS");
				}
				else
				{
					return mapping.findForward("FAILURE");
				}
	
		}
		if(action.equalsIgnoreCase("updateprofessionaldetails")){
			boolean b=dao.updateProfessional(rForm);
			if(b){
			return mapping.findForward("SUCCESS");
			}
			else
			{
				return mapping.findForward("FAILURE");
			}
		}
		if(action.equalsIgnoreCase("updatefamilydetails")){
			boolean b=dao.updateFamily(rForm);
			if(b){
			return mapping.findForward("SUCCESS");
			}
			else
			{
				return mapping.findForward("FAILURE");
			}
		}
		
		
		if(action.equalsIgnoreCase("updatepartnersbasicdetails")){
			System.out.println("basic");
			boolean b=dao.updatePartnerBasic(rForm);
			System.out.println(b);
			if(b){
			return mapping.findForward("SUCCESS");
			}
			else
			{
				return mapping.findForward("FAILURE");
			}
		}
		
		if(action.equalsIgnoreCase("updatepartnerslocationdetails")){
			boolean b=dao.updatePartnerLocation(rForm);
			if(b){
			return mapping.findForward("SUCCESS");
			}
			else
			{
				return mapping.findForward("FAILURE");
			}
			
		}
		if(action.equalsIgnoreCase("updatepartnersreligiousdetails")){
			boolean b=dao.updatePartnerReligion(rForm);
			if(b){
			return mapping.findForward("SUCCESS");
			}
			else
			{
				return mapping.findForward("FAILURE");
			}
		}
		
		if(action.equalsIgnoreCase("updatepartnersprofessionaldetails")){
			boolean b=dao.updatePartnerProfessional(rForm);
			if(b){
			return mapping.findForward("SUCCESS");
			}
			else
			{
				return mapping.findForward("FAILURE");
			}
		}
	
		
		if(action.equalsIgnoreCase("New User")){
	
		System.out.println("in action");
			ArrayList<RegisterForm> relal=(ArrayList<RegisterForm>)dao.religionsRetrieve(rForm);
			ArrayList<RegisterForm> coual=(ArrayList<RegisterForm>)dao.countryRetrieve(rForm);
			ArrayList<RegisterForm> casteal=(ArrayList<RegisterForm>)dao.casteRetrieve(rForm);
			ArrayList<RegisterForm> mtoal=(ArrayList<RegisterForm>)dao.mTongueRetrieve(rForm);
			rForm.setBean_religional(relal);
			rForm.setBean_casteal(casteal);
			rForm.setBean_mTongueal(mtoal);
			rForm.setBean_countryal(coual);
			return mapping.findForward(success);
			
		}      
		return null;
		}
//	public ActionForward editbasicdetails(ActionMapping mapping, ActionForm form, 
//			HttpServletRequest request, HttpServletResponse response) throws Exception {
//		
//		return mapping.findForward("BASIC");
//
//	}
//	public ActionForward editlocaldetails(ActionMapping mapping, ActionForm form, 
//			HttpServletRequest request, HttpServletResponse response) throws Exception {
//		
//		return mapping.findForward("LOCATION");
//
//	}
//	public ActionForward editcontactdetails(ActionMapping mapping, ActionForm form, 
//			HttpServletRequest request, HttpServletResponse response) throws Exception {
//		
//		return mapping.findForward("CONTACT");
//
//	}
//	
//	public ActionForward editaboutme(ActionMapping mapping, ActionForm form, 
//			HttpServletRequest request, HttpServletResponse response) throws Exception {
//		
//		return mapping.findForward("ABOUTME");
//
//	}
//	
//	public ActionForward editinterests(ActionMapping mapping, ActionForm form, 
//			HttpServletRequest request, HttpServletResponse response) throws Exception {
//		
//		return mapping.findForward("INTERESTS");
//
//	}
//	
//	public ActionForward edithobbies(ActionMapping mapping, ActionForm form, 
//			HttpServletRequest request, HttpServletResponse response) throws Exception {
//		
//		return mapping.findForward("HOBBIES");
//
//	}
//	public ActionForward editpartnersbasicdetails(ActionMapping mapping, ActionForm form, 
//			HttpServletRequest request, HttpServletResponse response) throws Exception {
//		
//		return mapping.findForward("PBASIC");
//
//	}
//	public ActionForward editpartnersreligiousdetails(ActionMapping mapping, ActionForm form, 
//			HttpServletRequest request, HttpServletResponse response) throws Exception {
//		
//		return mapping.findForward("PRELIGION");
//
//	}
//	public ActionForward editpartnerslocationdetails(ActionMapping mapping, ActionForm form, 
//			HttpServletRequest request, HttpServletResponse response) throws Exception {
//		
//		return mapping.findForward("PLOCATION");
//
//	}
//	public ActionForward editpartnersprofessionaldetails(ActionMapping mapping, ActionForm form, 
//			HttpServletRequest request, HttpServletResponse response) throws Exception {
//		
//		return mapping.findForward("PPROF");
//
//	}
//	
//	public ActionForward updatebasicdetails(ActionMapping mapping, ActionForm form, 
//			HttpServletRequest request, HttpServletResponse response) throws Exception {
//		RegisterForm rForm=(RegisterForm) form;
//		Service dao=new Service();
//		boolean b=dao.updateBasic(rForm);
//		if(b){
//		return mapping.findForward("SUCCESS");
//		}
//		else
//		{
//			return mapping.findForward("FAILURE");
//		}
//
//	}
//	public ActionForward updatelocationdetails(ActionMapping mapping, ActionForm form, 
//			HttpServletRequest request, HttpServletResponse response) throws Exception {
//		RegisterForm rForm=(RegisterForm) form;
//		Service dao=new Service();
//		boolean b=dao.updateLocation(rForm);
//		
//		if(b){
//			return mapping.findForward("SUCCESS");
//			}
//			else
//			{
//				return mapping.findForward("FAILURE");
//			}
//
//	}
//	
//	public ActionForward updatecontactdetails(ActionMapping mapping, ActionForm form, 
//			HttpServletRequest request, HttpServletResponse response) throws Exception {
//		RegisterForm rForm=(RegisterForm) form;
//		Service dao=new Service();
//		boolean b=dao.updateContact(rForm);
//		
//		if(b){
//			return mapping.findForward("SUCCESS");
//			}
//			else
//			{
//				return mapping.findForward("FAILURE");
//			}
//
//	}
//	
//	public ActionForward updateaboutme(ActionMapping mapping, ActionForm form, 
//			HttpServletRequest request, HttpServletResponse response) throws Exception {
//		RegisterForm rForm=(RegisterForm) form;
//		Service dao=new Service();
//		boolean b=dao.updateBasic(rForm);
//		if(b){
//		return mapping.findForward("SUCCESS");
//		}
//		else
//		{
//			return mapping.findForward("FAILURE");
//		}
//
//	}
//	public ActionForward updatehobbies(ActionMapping mapping, ActionForm form, 
//			HttpServletRequest request, HttpServletResponse response) throws Exception {
//		RegisterForm rForm=(RegisterForm) form;
//		Service dao=new Service();
//		boolean b=dao.updateLocation(rForm);
//		
//		if(b){
//			return mapping.findForward("SUCCESS");
//			}
//			else
//			{
//				return mapping.findForward("FAILURE");
//			}
//
//	}
//	
//	public ActionForward updateinterests(ActionMapping mapping, ActionForm form, 
//			HttpServletRequest request, HttpServletResponse response) throws Exception {
//		RegisterForm rForm=(RegisterForm) form;
//		Service dao=new Service();
//		boolean b=dao.updateLocation(rForm);
//		
//		if(b){
//			return mapping.findForward("SUCCESS");
//			}
//			else
//			{
//				return mapping.findForward("FAILURE");
//			}
//
//	}
//	
//	
//	public ActionForward updatepbasicdetails(ActionMapping mapping, ActionForm form, 
//			HttpServletRequest request, HttpServletResponse response) throws Exception {
//		RegisterForm rForm=(RegisterForm) form;
//		Service dao=new Service();
//		boolean b=dao.updatePartnerBasic(rForm);
//		if(b){
//		return mapping.findForward("SUCCESS");
//		}
//		else
//		{
//			return mapping.findForward("FAILURE");
//		}
//
//	}
//	
//	public ActionForward updateplocationdetails(ActionMapping mapping, ActionForm form, 
//			HttpServletRequest request, HttpServletResponse response) throws Exception {
//		RegisterForm rForm=(RegisterForm) form;
//		Service dao=new Service();
//		boolean b=dao.updatePartnerBasic(rForm);
//		if(b){
//		return mapping.findForward("SUCCESS");
//		}
//		else
//		{
//			return mapping.findForward("FAILURE");
//		}
//
//	}
//	
//	public ActionForward updatepprofessionaldetails(ActionMapping mapping, ActionForm form, 
//			HttpServletRequest request, HttpServletResponse response) throws Exception {
//		RegisterForm rForm=(RegisterForm) form;
//		Service dao=new Service();
//		boolean b=dao.updatePartnerProfessional(rForm);
//		if(b){
//		return mapping.findForward("SUCCESS");
//		}
//		else
//		{
//			return mapping.findForward("FAILURE");
//		}
//
//	}
//	
//	
//	public ActionForward like(ActionMapping mapping, ActionForm form, 
//			HttpServletRequest request, HttpServletResponse response) throws Exception {
//		
//		RegisterForm rForm=(RegisterForm) form;
//		Service dao=new Service();
//		boolean b=dao.like(rForm);
//		if(b){
//		return mapping.findForward("SUCCESS");
//		}
//		else
//		{
//			return mapping.findForward("FAILURE");
//		}
//	}
//	
//	
//	public ActionForward Chat(ActionMapping mapping, ActionForm form, 
//			HttpServletRequest request, HttpServletResponse response) throws Exception {
//		
//		return mapping.findForward("MESSAGE");
//
//	}
//	
//	public ActionForward Send(ActionMapping mapping, ActionForm form, 
//			HttpServletRequest request, HttpServletResponse response) throws Exception {
//		
//		RegisterForm rForm=(RegisterForm) form;
//		rForm.setBean_userId("saranya");
//		Service dao=new Service();
//		boolean b=dao.sendMessage(rForm);
//		if(b){
//		return mapping.findForward("SUCCESS");
//		}
//		else
//		{
//			return mapping.findForward("FAILURE");
//		}
//	}
//	
//	
//	public ActionForward uploadImage(ActionMapping mapping, ActionForm form, 
//			HttpServletRequest request, HttpServletResponse response) throws Exception {
//		
//		RegisterForm rForm=(RegisterForm) form;
//		Service dao=new Service();
//		boolean b=dao.uploadProPic(rForm);
//		
//		if(b){
//		return mapping.findForward("SUCCESS");
//		}
//		else
//		{
//			return mapping.findForward("FAILURE");
//		}
//	}
//	
//	public ActionForward viewImage(ActionMapping mapping, ActionForm form, 
//			HttpServletRequest request, HttpServletResponse response) throws Exception {
//		ArrayList<RegisterForm> list=new ArrayList<RegisterForm>();
//		RegisterForm rForm=(RegisterForm) form;
//		Service dao=new Service();
//		list=dao.retrieveProPic(rForm);
//		rForm.setBean_al(list);
//		request.setAttribute("list", list);
//		
//		return mapping.findForward("DISPLAYIMAGE");	
//		
//	}
//	
	
}
		


