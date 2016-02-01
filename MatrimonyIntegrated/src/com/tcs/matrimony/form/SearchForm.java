package com.tcs.matrimony.form;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class SearchForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String bn_name=null;
	private String bn_userid=null;
	private String bn_gender=null;
	private int bn_age=0;
	private double bn_height=0;
	private String bn_mstatus=null;
	private String bn_language=null;
	private String bn_religion=null;
	private String bn_education=null;
	private String bn_country=null;
	private String bn_color=null;
	private String bn_occupation=null;
	private String bn_message=null;
	private ArrayList<SearchForm> ar=null;
	private Byte bn_image;
	private ArrayList<SearchForm> ral;
	private ArrayList<SearchForm> lal;
	private String bn_action;
	private String profPhoto;
	private String count;

	
	public String getCount() {
		return count;
	}



	public void setCount(String count) {
		this.count = count;
	}



	public void reset(ActionMapping mapping, HttpServletRequest request) {
		this.ar=null;
		this.bn_age=0;
		this.bn_color=null;
		this.bn_country=null;
		this.bn_education=null;
		this.bn_gender=null;
		this.bn_height=0;
		this.bn_image=0;
		this.bn_language=null;
		this.bn_message=null;
		this.bn_mstatus=null;
		this.bn_name=null;
		this.bn_occupation=null;
		this.bn_religion=null;
		this.bn_userid=null;
	}
	
	
	
	public String getProfPhoto() {
		return profPhoto;
	}



	public void setProfPhoto(String profPhoto) {
		this.profPhoto = profPhoto;
	}



	public String getBn_action() {
		return bn_action;
	}



	public void setBn_action(String bnAction) {
		bn_action = bnAction;
	}



	public ArrayList<SearchForm> getRal() {
		return ral;
	}



	public void setRal(ArrayList<SearchForm> ral) {
		this.ral = ral;
	}



	public ArrayList<SearchForm> getLal() {
		return lal;
	}



	public void setLal(ArrayList<SearchForm> lal) {
		this.lal = lal;
	}



	public String getBn_message() {
		return bn_message;
	}
	public void setBn_message(String bn_message) {
		this.bn_message = bn_message;
	}
	public Byte getBn_image() {
		return bn_image;
	}
	public void setBn_image(Byte bn_image) {
		this.bn_image = bn_image;
	}
	public String getBn_name() {
		return bn_name;
	}
	public void setBn_name(String bn_name) {
		this.bn_name = bn_name;
	}
	public String getBn_userid() {
		return bn_userid;
	}
	public void setBn_userid(String bn_userid) {
		this.bn_userid = bn_userid;
	}
	public String getBn_gender() {
		return bn_gender;
	}
	public void setBn_gender(String bn_gender) {
		this.bn_gender = bn_gender;
	}
	public int getBn_age() {
		return bn_age;
	}
	public void setBn_age(int bn_age) {
		this.bn_age = bn_age;
	}
	public double getBn_height() {
		return bn_height;
	}
	public void setBn_height(double bn_height) {
		this.bn_height = bn_height;
	}
	public String getBn_mstatus() {
		return bn_mstatus;
	}
	public void setBn_mstatus(String bn_mstatus) {
		this.bn_mstatus = bn_mstatus;
	}
	public String getBn_language() {
		return bn_language;
	}
	public void setBn_language(String bn_language) {
		this.bn_language = bn_language;
	}
	public String getBn_religion() {
		return bn_religion;
	}
	public void setBn_religion(String bn_religion) {
		this.bn_religion = bn_religion;
	}
	public String getBn_education() {
		return bn_education;
	}
	public void setBn_education(String bn_education) {
		this.bn_education = bn_education;
	}
	public String getBn_country() {
		return bn_country;
	}
	public void setBn_country(String bn_country) {
		this.bn_country = bn_country;
	}
	public String getBn_color() {
		return bn_color;
	}
	public void setBn_color(String bn_color) {
		this.bn_color = bn_color;
	}
	public String getBn_occupation() {
		return bn_occupation;
	}
	public void setBn_occupation(String bn_occupation) {
		this.bn_occupation = bn_occupation;
	}
	public ArrayList<SearchForm> getAr() {
		return ar;
	}
	public void setAr(ArrayList<SearchForm> ar) {
		this.ar = ar;
	}
	
	
	
	
	
}
