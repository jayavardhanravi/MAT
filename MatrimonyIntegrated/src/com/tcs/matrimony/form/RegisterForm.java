package com.tcs.matrimony.form;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import org.apache.struts.validator.ValidatorForm;

public class RegisterForm extends ValidatorForm{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 private String bean_userId="meher";
		private String bean_userLike="saranya";
	 private  String bean_searchFor;
	 private  String bean_emailId;
	 private  String bean_fname;
	 private  String bean_lname;
	 private  long bean_cmobile=0000000000;
		private String bean_category;
	 
	 
	 
	 public String getBean_category() {
			return bean_category;
		}
		public void setBean_category(String beanCategory) {
			bean_category = beanCategory;
		}
	public long getBean_cmobile() {
		return bean_cmobile;
	}
	public void setBean_cmobile(long beanCmobile) {
		bean_cmobile = beanCmobile;
	}
	public String getBean_fname() {
		return bean_fname;
	}
	public void setBean_fname(String beanFname) {
		bean_fname = beanFname;
	}
	public String getBean_lname() {
		return bean_lname;
	}
	public void setBean_lname(String beanLname) {
		bean_lname = beanLname;
	}


	private  String bean_gender;
	 private int  bean_age;
	 private  Date bean_dob;
	 private  int  bean_height;
	 private  String bean_mStatus;
	 private  String bean_mTongue;
	 private  String bean_caste;
	 private  String bean_manglik;
	 private  String bean_religion;
	 private  String bean_education;
	 private  String bean_occupation;
	 private  long bean_phoneNo;
	 private  long bean_mobileNo;
	 private  String bean_houseno;
	 private ArrayList<RegisterForm> bean_al;
	 private  String bean_message;
	 
	 public String getBean_houseno() {
		return bean_houseno;
	}
	public void setBean_houseno(String beanHouseno) {
		bean_houseno = beanHouseno;
	}


	private  String bean_place;
	 private  String bean_state;
	 private  String bean_country;
	 private  Timestamp  bean_date;
	 private  int bean_Amount;
	 private  String bean_type_pay;
	  private String   bean_type;
	 private  String  bean_hobbies;
	 private  String bean_interests;
	  private  String bean_aboutMe;
	 private  String bean_aboutPartner;
	 private  String bean_complexion;

	 private  String  bean_password;
	 private  String bean_changePwd;
	 private  String  bean_confirmPwd;
	 private  String bean_security_Q;
	 private  String bean_security_A;
	 private String action;
	private String choice;
     private ArrayList<RegisterForm> bean_religional;
     private ArrayList<RegisterForm> bean_mTongueal;
     private ArrayList<RegisterForm> bean_casteal;
     private ArrayList<RegisterForm> bean_countryal;
     private ArrayList<RegisterForm> bean_profileList;
     private ArrayList<RegisterForm> bean_partnerProfileList;
	 
     private String bean_star;
     private String bean_gothram;
     private String bean_ftype;
     private String bean_fstatus;
     private String bean_fvalue;
     private String bean_focc;
     private String bean_forphan;
     private String bean_emp_in;
     private String bean_mocc;
     private int bean_fbro;
     private int bean_fsis;
     private long bean_annual;
    
	 
     private String update;
	
         
	
	public String getBean_message() {
		return bean_message;
	}
	public void setBean_message(String beanMessage) {
		bean_message = beanMessage;
	}
	public String getBean_userLike() {
		return bean_userLike;
	}
	public void setBean_userLike(String beanUserLike) {
		bean_userLike = beanUserLike;
	}
	public ArrayList<RegisterForm> getBean_al() {
		return bean_al;
	}
	public void setBean_al(ArrayList<RegisterForm> beanAl) {
		bean_al = beanAl;
	}
	
	public String getUpdate() {
		return update;
	}
	public void setUpdate(String update) {
		this.update = update;
	}
	public String getBean_star() {
		return bean_star;
	}
	public void setBean_star(String beanStar) {
		bean_star = beanStar;
	}
	public String getBean_gothram() {
		return bean_gothram;
	}
	public void setBean_gothram(String beanGothram) {
		bean_gothram = beanGothram;
	}
	public String getBean_ftype() {
		return bean_ftype;
	}
	public void setBean_ftype(String beanFtype) {
		bean_ftype = beanFtype;
	}
	public String getBean_fstatus() {
		return bean_fstatus;
	}
	public void setBean_fstatus(String beanFstatus) {
		bean_fstatus = beanFstatus;
	}
	public String getBean_fvalue() {
		return bean_fvalue;
	}
	public void setBean_fvalue(String beanFvalue) {
		bean_fvalue = beanFvalue;
	}
	public String getBean_focc() {
		return bean_focc;
	}
	public void setBean_focc(String beanFocc) {
		bean_focc = beanFocc;
	}
	public String getBean_forphan() {
		return bean_forphan;
	}
	public void setBean_forphan(String beanForphan) {
		bean_forphan = beanForphan;
	}
	public String getBean_emp_in() {
		return bean_emp_in;
	}
	public void setBean_emp_in(String beanEmpIn) {
		bean_emp_in = beanEmpIn;
	}
	public String getBean_mocc() {
		return bean_mocc;
	}
	public void setBean_mocc(String beanMocc) {
		bean_mocc = beanMocc;
	}
	public int getBean_fbro() {
		return bean_fbro;
	}
	public void setBean_fbro(int beanFbro) {
		bean_fbro = beanFbro;
	}
	public int getBean_fsis() {
		return bean_fsis;
	}
	public void setBean_fsis(int beanFsis) {
		bean_fsis = beanFsis;
	}
	public long getBean_annual() {
		return bean_annual;
	}
	public void setBean_annual(long beanAnnual) {
		bean_annual = beanAnnual;
	}
	public ArrayList<RegisterForm> getBean_profileList() {
		return bean_profileList;
	}
	public void setBean_profileList(ArrayList<RegisterForm> beanProfileList) {
		bean_profileList = beanProfileList;
	}
	public ArrayList<RegisterForm> getBean_partnerProfileList() {
		return bean_partnerProfileList;
	}
	public void setBean_partnerProfileList(
			ArrayList<RegisterForm> beanPartnerProfileList) {
		bean_partnerProfileList = beanPartnerProfileList;
	}
	public ArrayList<RegisterForm> getBean_religional() {
		return bean_religional;
	}
	public void setBean_religional(ArrayList<RegisterForm> beanReligional) {
		bean_religional = beanReligional;
	}
	public ArrayList<RegisterForm> getBean_mTongueal() {
		return bean_mTongueal;
	}
	public void setBean_mTongueal(ArrayList<RegisterForm> beanMTongueal) {
		bean_mTongueal = beanMTongueal;
	}
	public ArrayList<RegisterForm> getBean_casteal() {
		return bean_casteal;
	}
	public void setBean_casteal(ArrayList<RegisterForm> beanCasteal) {
		bean_casteal = beanCasteal;
	}
	public ArrayList<RegisterForm> getBean_countryal() {
		return bean_countryal;
	}
	public void setBean_countryal(ArrayList<RegisterForm> beanCountryal) {
		bean_countryal = beanCountryal;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getChoice() {
		return choice;
	}
	public void setChoice(String choice) {
		this.choice = choice;
	}
	public String getBean_complexion() {
		return bean_complexion;
	}
	public void setBean_complexion(String beanComplexion) {
		bean_complexion = beanComplexion;
	}
	public String getBean_password() {
		return bean_password;
	}
	public void setBean_password(String beanPassword) {
		bean_password = beanPassword;
	}
	public String getBean_changePwd() {
		return bean_changePwd;
	}
	public void setBean_changePwd(String beanChangePwd) {
		bean_changePwd = beanChangePwd;
	}
	public String getBean_confirmPwd() {
		return bean_confirmPwd;
	}
	public void setBean_confirmPwd(String beanConfirmPwd) {
		bean_confirmPwd = beanConfirmPwd;
	}
	public String getBean_security_Q() {
		return bean_security_Q;
	}
	public void setBean_security_Q(String beanSecurityQ) {
		bean_security_Q = beanSecurityQ;
	}
	public String getBean_security_A() {
		return bean_security_A;
	}
	public void setBean_security_A(String beanSecurityA) {
		bean_security_A = beanSecurityA;
	}
	public String getBean_mTongue() {
		return bean_mTongue;
	}
	public void setBean_mTongue(String beanMTongue) {
		bean_mTongue = beanMTongue;
	}
	public String getBean_caste() {
		return bean_caste;
	}
	public void setBean_caste(String beanCaste) {
		bean_caste = beanCaste;
	}
	public String getBean_manglik() {
		return bean_manglik;
	}
	public void setBean_manglik(String beanManglik) {
		bean_manglik = beanManglik;
	}
	public String getBean_religion() {
		return bean_religion;
	}
	public void setBean_religion(String beanReligion) {
		bean_religion = beanReligion;
	}
	public String getBean_education() {
		return bean_education;
	}
	public void setBean_education(String beanEducation) {
		bean_education = beanEducation;
	}
	public String getBean_occupation() {
		return bean_occupation;
	}
	public void setBean_occupation(String beanOccupation) {
		bean_occupation = beanOccupation;
	}
	public long getBean_phoneNo() {
		return bean_phoneNo;
	}
	public void setBean_phoneNo(long beanPhoneNo) {
		bean_phoneNo = beanPhoneNo;
	}
	public long getBean_mobileNo() {
		return bean_mobileNo;
	}
	public void setBean_mobileNo(long beanMobileNo) {
		bean_mobileNo = beanMobileNo;
	}
	public String getBean_place() {
		return bean_place;
	}
	public void setBean_place(String beanPlace) {
		bean_place = beanPlace;
	}
	public String getBean_state() {
		return bean_state;
	}
	public void setBean_state(String beanState) {
		bean_state = beanState;
	}
	public String getBean_country() {
		return bean_country;
	}
	public void setBean_country(String beanCountry) {
		bean_country = beanCountry;
	}
	public Timestamp getBean_date() {
		return bean_date;
	}
	public void setBean_date(Timestamp beanDate) {
		bean_date = beanDate;
	}
	public int getBean_Amount() {
		return bean_Amount;
	}
	public void setBean_Amount(int beanAmount) {
		bean_Amount = beanAmount;
	}
	public String getBean_type_pay() {
		return bean_type_pay;
	}
	public void setBean_type_pay(String beanType_pay) {
		bean_type_pay = beanType_pay;
	}
	public String getBean_type() {
		return bean_type;
	}
	public void setBean_type(String beanType) {
		bean_type = beanType;
	}
	public String getBean_hobbies() {
		return bean_hobbies;
	}
	public void setBean_hobbies(String beanHobbies) {
		bean_hobbies = beanHobbies;
	}
	public String getBean_interests() {
		return bean_interests;
	}
	public void setBean_interests(String beanInterests) {
		bean_interests = beanInterests;
	}
	public String getBean_aboutMe() {
		return bean_aboutMe;
	}
	public void setBean_aboutMe(String beanAboutMe) {
		bean_aboutMe = beanAboutMe;
	}
	public String getBean_aboutPartner() {
		return bean_aboutPartner;
	}
	public void setBean_aboutPartner(String beanAboutPartner) {
		bean_aboutPartner = beanAboutPartner;
	}
	public String getBean_userId() {
		return bean_userId;
	}
	public void setBean_userId(String beanUserId) {
		bean_userId = beanUserId;
	}
	public String getBean_searchFor() {
		return bean_searchFor;
	}
	public void setBean_searchFor(String beanSearchFor) {
		bean_searchFor = beanSearchFor;
	}
	public String getBean_emailId() {
		return bean_emailId;
	}
	public void setBean_emailId(String beanEmailId) {
		bean_emailId = beanEmailId;
	}
	
	public String getBean_gender() {
		return bean_gender;
	}
	public void setBean_gender(String beanGender) {
		bean_gender = beanGender;
	}
	public int getBean_age() {
		return bean_age;
	}
	public void setBean_age(int beanAge) {
		bean_age = beanAge;
	}
	public Date getBean_dob() {
		return bean_dob;
	}
	public void setBean_dob(Date beanDob) {
		bean_dob = beanDob;
	}
	public int getBean_height() {
		return bean_height;
	}
	public void setBean_height(int beanHeight) {
		bean_height = beanHeight;
	}
	public String getBean_mStatus() {
		return bean_mStatus;
	}
	public void setBean_mStatus(String beanMStatus) {
		bean_mStatus = beanMStatus;
	}
	
	
	public RegisterForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private String bean_pcomplexion;
	public String getBean_pcomplexion() {
		return bean_pcomplexion;
	}
	public void setBean_pcomplexion(String beanPcomplexion) {
		bean_pcomplexion = beanPcomplexion;
	}


	private String bean_pmStatus;
	private String bean_pmTongue;
	private String bean_e_habbits;
	private String bean_pforphan;
	private String bean_preligion;
	private String bean_pcaste;
	private String bean_peducation;
	private String bean_pocc;
	private int bean_pannualsal;
	public String getBean_pmStatus() {
		return bean_pmStatus;
	}
	public void setBean_pmStatus(String beanPmStatus) {
		bean_pmStatus = beanPmStatus;
	}
	public String getBean_pmTongue() {
		return bean_pmTongue;
	}
	public void setBean_pmTongue(String beanPmTongue) {
		bean_pmTongue = beanPmTongue;
	}
	public String getBean_e_habbits() {
		return bean_e_habbits;
	}
	public void setBean_e_habbits(String beanEHabbits) {
		bean_e_habbits = beanEHabbits;
	}
	public String getBean_pforphan() {
		return bean_pforphan;
	}
	public void setBean_pforphan(String beanPforphan) {
		bean_pforphan = beanPforphan;
	}
	public String getBean_preligion() {
		return bean_preligion;
	}
	public void setBean_preligion(String beanPreligion) {
		bean_preligion = beanPreligion;
	}
	public String getBean_pcaste() {
		return bean_pcaste;
	}
	public void setBean_pcaste(String beanPcaste) {
		bean_pcaste = beanPcaste;
	}
	public String getBean_peducation() {
		return bean_peducation;
	}
	public void setBean_peducation(String beanPeducation) {
		bean_peducation = beanPeducation;
	}
	public String getBean_pocc() {
		return bean_pocc;
	}
	public void setBean_pocc(String beanPocc) {
		bean_pocc = beanPocc;
	}
	public int getBean_pannualsal() {
		return bean_pannualsal;
	}
	public void setBean_pannualsal(int beanPannualsal) {
		bean_pannualsal = beanPannualsal;
	}
	public String getBean_pcountry() {
		return bean_pcountry;
	}
	public void setBean_pcountry(String beanPcountry) {
		bean_pcountry = beanPcountry;
	}
	public String getBean_pstate() {
		return bean_pstate;
	}
	public void setBean_pstate(String beanPstate) {
		bean_pstate = beanPstate;
	}
	public String getBean_pcity() {
		return bean_pcity;
	}
	public void setBean_pcity(String beanPcity) {
		bean_pcity = beanPcity;
	}
	public String getBean_pmanglik() {
		return bean_pmanglik;
	}
	public void setBean_pmanglik(String beanPmanglik) {
		bean_pmanglik = beanPmanglik;
	}
	public int getBean_pstage() {
		return bean_pstage;
	}
	public void setBean_pstage(int beanPstage) {
		bean_pstage = beanPstage;
	}
	public int getBean_page() {
		return bean_page;
	}
	public void setBean_page(int beanPage) {
		bean_page = beanPage;
	}
	public int getBean_pheight() {
		return bean_pheight;
	}
	public void setBean_pheight(int beanPheight) {
		bean_pheight = beanPheight;
	}

	
	private String bean_pcountry;
	private String bean_pstate;
	private String bean_pcity;
	private String bean_pmanglik;
	private int bean_pstage;
	private int bean_page;
	private int bean_pheight;
	private String profPhoto;
	private String bean_pstar;
	
	
	
	
	public String getBean_pstar() {
		return bean_pstar;
	}
	public void setBean_pstar(String beanPstar) {
		bean_pstar = beanPstar;
	}
	public String getProfPhoto() {
		return profPhoto;
	}
	public void setProfPhoto(String profPhoto) {
		this.profPhoto = profPhoto;
	}
	
	
	
	 
	 
	 
	

}
