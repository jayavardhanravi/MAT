package com.tcs.matrimony.form;

import java.util.ArrayList;

import org.apache.struts.validator.ValidatorForm;



public class EventForm extends ValidatorForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String bn_action;
	private String bn_userId;
	private String bn_name;
	private String bn_password;
	private String bn_address;
	private String bn_cpwd;
	private int bn_contact;
	private String bn_email;
	private int bn_people;
	private float bn_budget;
	private String bn_place;
	private String bn_date;
	private String bn_code;
	private String bn_vcat;
	private String bn_vdeco;
	private String bn_vvideo;
	private String bn_vvenue;
	private String bn_ventertain;
	private ArrayList<EventForm> al;
	private EventForm eForm;
	private String bn_paymode;
	private String bn_paybank;
	

	
	private String bn_card1;
	private String bn_card2;
	private String bn_card3;
	private String bn_card4;
	private String bn_cardname;
	private String bn_cardmon;
	private String bn_cardyear;
	private String bn_cvv;
	private String bn_securecode;
	
	
	
	public String getBn_paybank() {
		return bn_paybank;
	}
	public void setBn_paybank(String bnPaybank) {
		bn_paybank = bnPaybank;
	}
	public String getBn_securecode() {
		return bn_securecode;
	}
	public void setBn_securecode(String bnSecurecode) {
		bn_securecode = bnSecurecode;
	}
	public String getBn_card1() {
		return bn_card1;
	}
	public void setBn_card1(String bnCard1) {
		bn_card1 = bnCard1;
	}
	public String getBn_card2() {
		return bn_card2;
	}
	public void setBn_card2(String bnCard2) {
		bn_card2 = bnCard2;
	}
	public String getBn_card3() {
		return bn_card3;
	}
	public void setBn_card3(String bnCard3) {
		bn_card3 = bnCard3;
	}
	public String getBn_card4() {
		return bn_card4;
	}
	public void setBn_card4(String bnCard4) {
		bn_card4 = bnCard4;
	}
	public String getBn_cardname() {
		return bn_cardname;
	}
	public void setBn_cardname(String bnCardname) {
		bn_cardname = bnCardname;
	}
	public String getBn_cardmon() {
		return bn_cardmon;
	}
	public void setBn_cardmon(String bnCardmon) {
		bn_cardmon = bnCardmon;
	}
	public String getBn_cardyear() {
		return bn_cardyear;
	}
	public void setBn_cardyear(String bnCardyear) {
		bn_cardyear = bnCardyear;
	}
	public String getBn_cvv() {
		return bn_cvv;
	}
	public void setBn_cvv(String bnCvv) {
		bn_cvv = bnCvv;
	}
	public String getBn_paymode() {
		return bn_paymode;
	}
	public void setBn_paymode(String bnPaymode) {
		bn_paymode = bnPaymode;
	}
	
	
	public EventForm geteForm() {
		return eForm;
	}
	public void seteForm(EventForm eForm) {
		this.eForm = eForm;
	}
	public ArrayList<EventForm> getAl() {
		return al;
	}
	public void setAl(ArrayList<EventForm> al) {
		this.al = al;
	}
	public String getBn_code() {
		return bn_code;
	}
	public void setBn_code(String bnCode) {
		bn_code = bnCode;
	}
	public String getBn_vcat() {
		return bn_vcat;
	}
	public void setBn_vcat(String bnVcat) {
		bn_vcat = bnVcat;
	}
	public String getBn_vdeco() {
		return bn_vdeco;
	}
	public void setBn_vdeco(String bnVdeco) {
		bn_vdeco = bnVdeco;
	}
	public String getBn_vvideo() {
		return bn_vvideo;
	}
	public void setBn_vvideo(String bnVvideo) {
		bn_vvideo = bnVvideo;
	}
	public String getBn_vvenue() {
		return bn_vvenue;
	}
	public void setBn_vvenue(String bnVvenue) {
		bn_vvenue = bnVvenue;
	}
	public String getBn_ventertain() {
		return bn_ventertain;
	}
	public void setBn_ventertain(String bnVentertain) {
		bn_ventertain = bnVentertain;
	}
	public int getBn_people() {
		return bn_people;
	}
	public void setBn_people(int bnPeople) {
		bn_people = bnPeople;
	}
	public float getBn_budget() {
		return bn_budget;
	}
	public void setBn_budget(float bnBudget) {
		bn_budget = bnBudget;
	}
	public String getBn_place() {
		return bn_place;
	}
	public void setBn_place(String bnPlace) {
		bn_place = bnPlace;
	}
	public String getBn_date() {
		return bn_date;
	}
	public void setBn_date(String bnDate) {
		bn_date = bnDate;
	}
	public String getBn_cpwd() {
		return bn_cpwd;
	}
	public void setBn_cpwd(String bnCpwd) {
		bn_cpwd = bnCpwd;
	}
	public String getBn_action() {
		return bn_action;
	}
	public void setBn_action(String bnAction) {
		bn_action = bnAction;
	}
	public String getBn_userId() {
		return bn_userId;
	}
	public void setBn_userId(String bnUserId) {
		bn_userId = bnUserId;
	}
	public String getBn_name() {
		return bn_name;
	}
	public void setBn_name(String bnName) {
		bn_name = bnName;
	}
	public String getBn_password() {
		return bn_password;
	}
	public void setBn_password(String bnPassword) {
		bn_password = bnPassword;
	}
	public String getBn_address() {
		return bn_address;
	}
	public void setBn_address(String bnAddress) {
		bn_address = bnAddress;
	}
	public int getBn_contact() {
		return bn_contact;
	}
	public void setBn_contact(int bnContact) {
		bn_contact = bnContact;
	}
	public String getBn_email() {
		return bn_email;
	}
	public void setBn_email(String bnEmail) {
		bn_email = bnEmail;
	}
	
	

}
