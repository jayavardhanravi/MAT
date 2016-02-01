package com.tcs.matrimony.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

import com.mysql.jdbc.Blob;
import com.tcs.matrimony.form.EventForm;
import com.tcs.matrimony.form.LoginForm;
import com.tcs.matrimony.form.PartnerForm;
import com.tcs.matrimony.form.RegisterForm;
import com.tcs.matrimony.form.SearchForm;



public class Service {
	Connection con=null;
	PreparedStatement ps=null;
	PreparedStatement ps1=null;
	PreparedStatement ps2=null;
	PreparedStatement ps3=null;
	PreparedStatement ps4=null;
	PreparedStatement ps5=null;
	PreparedStatement ps6=null;
	PreparedStatement ps7=null;
	ResultSet rs=null;
	ResultSet rs1=null;
	ResultSet rs2=null;
	static int j=0;
	
	private Connection getConnection() throws SQLException
	{
		con=ConnectionFactory.getConnection();
		return con;
	}

	public String generateId(RegisterForm rForm) throws SQLException {
		con=getConnection();
		System.out.println("in service");
		Random r=new Random();
		int co=r.nextInt(500);
		String name=rForm.getBean_fname();
		String ph=String.valueOf(rForm.getBean_mobileNo());
		String user_id=name.substring(2,5)+ph.substring(2,5)+co;
		return (user_id);
		
		// TODO Auto-generated method stub
	
	}
	public boolean register(RegisterForm rForm) throws SQLException{
		
			Connection conn=getConnection();
			System.out.println(rForm.getBean_userId());
			int no=0;
			if(conn!=null)
			{
			try{
				/*String query="insert into register_user(userId,searchFor,	emailId	,name,gender	,age ,dob,height,mStatus) values(?,?,?,?,?,?,?,?,?)";
		

			
				ps=conn.prepareStatement(query);
				ps.setString(1,rForm.getBean_userId());
				
				ps.setString(2,rForm.getBean_searchFor());
				ps.setString(3,rForm.getBean_emailId());
				ps.setString(4,rForm.getBean_name());
				ps.setString(5,rForm.getBean_gender());
				ps.setInt(6,rForm.getBean_age());
				ps.setDate(7,rForm.getBean_dob());
				ps.setInt(8,rForm.getBean_height());
				ps.setString(9,rForm.getBean_mStatus());
		
				
				
				boolean b=ps.execute();
				String query1="insert into register_personal(userId,mTongue	,caste,manglik,religion,education,occupation,complexion) values(?,?,?,?,?,?,?,?	)";
				String query2="insert into login_user (userId,password,security_Q,security_A) values(?,?,?,?)";
				String query3="insert into register_contact(userId,phoneNo	,mobileNo,place,state,country) values(?,?,?,?,?,?	)";
				String query4="insert into register_interests(userId,hobbies,interests,aboutMe,aboutPartner) values(?,?,?,?,?)";
				if(!b)
				{
					ps1=conn.prepareStatement(query1);
			
					ps1.setString(1,rForm.getBean_userId());
					System.out.println(rForm.getBean_userId());
					ps1.setString(2,rForm.getBean_mTongue());
					ps1.setString(3,rForm.getBean_caste());
					ps1.setString(4,rForm.getBean_manglik());
					ps1.setString(5,rForm.getBean_religion());
					ps1.setString(6,rForm.getBean_education());
					ps1.setString(7,rForm.getBean_occupation());
					ps1.setString(8,rForm.getBean_complexion());
					boolean c=ps1.execute();
					if(!c){
						ps2=conn.prepareStatement(query2);
					ps2.setString(1,rForm.getBean_userId());
					
					ps2.setString(2,rForm.getBean_password());
					System.out.println(rForm.getBean_security_Q());
					ps2.setString(3,rForm.getBean_security_Q());	
					ps2.setString(4,rForm.getBean_security_A());
			
					
					boolean a=ps2.execute();
					if(!a)
					{
						ps3=conn.prepareStatement(query3);
						
						ps3.setString(1,rForm.getBean_userId());
						ps3.setLong(2,rForm.getBean_phoneNo());
						ps3.setLong(3,rForm.getBean_mobileNo());
						ps3.setString(4,rForm.getBean_place());
						ps3.setString(5,rForm.getBean_state());
						ps3.setString(6,rForm.getBean_country());
						boolean p=ps3.execute();
						if(!p){
							
							ps4=conn.prepareStatement(query4);
							ps4.setString(1,rForm.getBean_userId());
						
						
					
					
						
						ps4.setString(2,rForm.getBean_hobbies());	
						ps4.setString(3,rForm.getBean_interests());	
						ps4.setString(4,rForm.getBean_aboutMe());
						ps4.setString(5,rForm.getBean_aboutPartner());
						
					
				
						
						boolean q=ps4.execute();
						if(!q){
							return true;
						}
					}
					
					
				}*/
				
				
				String query="insert into register_user(userId,sf,emailId,fname,lname,gender,age ,dob,height,mStatus) values(?,?,?,?,?,?,?,?,?,?)";
				

				
				ps=conn.prepareStatement(query);
				ps.setString(1,rForm.getBean_userId());
				
				ps.setString(2,rForm.getBean_searchFor());
				ps.setString(3,rForm.getBean_emailId());
				ps.setString(4,rForm.getBean_fname());
				ps.setString(5,rForm.getBean_lname());
				ps.setString(6,rForm.getBean_gender());
				ps.setInt(7,rForm.getBean_age());
				ps.setDate(8,rForm.getBean_dob());
				ps.setInt(9,rForm.getBean_height());
				ps.setString(10,rForm.getBean_mStatus());
		
				
				
				boolean b=ps.execute();
				String query1="insert into register_personal(userId,mtongue,caste,manglik,religion,education,occupation,complexion) values(?,?,?,?,?,?,?,?	)";
				String query2="insert into login_user (userId,newpwd,security_Q,security_A) values(?,?,?,?)";
				String query3="insert into register_contact(userId,phoneNo	,mobileNo,place,state,country,houseno) values(?,?,?,?,?,?,?	)";
				String query4="insert into register_interest(userId,hobbies,interests,aboutMe,aboutPartner) values(?,?,?,?,?)";
				String query5="insert into register_user_extra(userid) values(?)";
				String query6="insert into register_user_pref1(userid) values(?)";
				String query7="insert into register_user_pref2(userid) values(?)";
				if(!b)
				{
					ps1=conn.prepareStatement(query1);
			
					ps1.setString(1,rForm.getBean_userId());
					System.out.println(rForm.getBean_userId());
					ps1.setString(2,rForm.getBean_mTongue());
					ps1.setString(3,rForm.getBean_caste());
					ps1.setString(4,rForm.getBean_manglik());
					ps1.setString(5,rForm.getBean_religion());
					ps1.setString(6,rForm.getBean_education());
					ps1.setString(7,rForm.getBean_occupation());
					ps1.setString(8,rForm.getBean_complexion());
					boolean c=ps1.execute();
					if(!c){
						ps2=conn.prepareStatement(query2);
					ps2.setString(1,rForm.getBean_userId());
					
					ps2.setString(2,rForm.getBean_password());
					System.out.println(rForm.getBean_security_Q());
					ps2.setString(3,rForm.getBean_security_Q());	
					ps2.setString(4,rForm.getBean_security_A());
			
					
					boolean a=ps2.execute();
					if(!a)
					{
						ps3=conn.prepareStatement(query3);
						
						ps3.setString(1,rForm.getBean_userId());
						ps3.setLong(2,rForm.getBean_phoneNo());
						ps3.setLong(3,rForm.getBean_mobileNo());
						ps3.setString(4,rForm.getBean_place());
						ps3.setString(5,rForm.getBean_state());
						ps3.setString(6,rForm.getBean_country());
						ps3.setString(7,rForm.getBean_houseno());
						boolean p=ps3.execute();
						if(!p){
							
							ps4=conn.prepareStatement(query4);
							ps4.setString(1,rForm.getBean_userId());
						
						
					
					
						
						ps4.setString(2,rForm.getBean_hobbies());	
						ps4.setString(3,rForm.getBean_interests());	
						ps4.setString(4,rForm.getBean_aboutMe());
						ps4.setString(5,rForm.getBean_aboutPartner());
						
					
				
						
						boolean q=ps4.execute();
						if(!q){
							ps5=conn.prepareStatement(query5);
							ps5.setString(1,rForm.getBean_userId());
							boolean p5=ps5.execute();
							
							if(!p5){
								ps6=conn.prepareStatement(query6);
								ps6.setString(1,rForm.getBean_userId());
								boolean p6=ps6.execute();
								
								if(!p6){
									ps7=conn.prepareStatement(query7);
									ps7.setString(1,rForm.getBean_userId());
									boolean p7=ps7.execute();
									if(!p7){
										return true;
									}
								}
							}
						}
					}
					
					
				}
				else
					return false;
			}
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			finally
			{
				if(ps!=null)
				ps.close();
				if(conn!=null)
					conn.close();
			}}
			return false;
			}



	public ArrayList<RegisterForm> religionsRetrieve(RegisterForm r) throws SQLException {
		Connection con=getConnection();
	
		ArrayList<RegisterForm > al=new ArrayList<RegisterForm >();
		if(con!=null)
		{
		try{
			String query="select religion from matrimony_religion";
			ps=con.prepareStatement(query);
			rs=ps.executeQuery();
			while(rs.next()){
		    RegisterForm r1=new RegisterForm();
			r1.setBean_religion(rs.getString(1));
			al.add(r1);
			}
			
		// TODO Auto-generated method stub
		return al;
	}	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	finally
	{
		if(ps!=null)
		ps.close();
		if(con!=null)
			con.close();
	}}
	return null;
	}

	

	public ArrayList<RegisterForm > casteRetrieve(RegisterForm r) throws SQLException {
		Connection conn=getConnection();
		
		ArrayList<RegisterForm > al=new ArrayList<RegisterForm >();
		if(conn!=null)
		{
		try{
			String query="select caste from matrimony_caste";
			ps=conn.prepareStatement(query);
			rs=ps.executeQuery();
			while(rs.next()){
				
			    RegisterForm r1=new RegisterForm();
				r1.setBean_caste(rs.getString(1));
				al.add(r1);
			}
			
		// TODO Auto-generated method stub
		return al;
	}	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	finally
	{
		if(ps!=null)
		ps.close();
		if(conn!=null)
			conn.close();
	}}
	return null;
	}

	public ArrayList<RegisterForm > countryRetrieve(RegisterForm r) throws SQLException {
		Connection conn=getConnection();
		
		ArrayList<RegisterForm> al=new ArrayList<RegisterForm>();
		if(conn!=null)
		{
		try{
			String query="select country from matrimony_place";
			ps=conn.prepareStatement(query);
			rs=ps.executeQuery();
			while(rs.next()){
				
			    RegisterForm r1=new RegisterForm();
				r1.setBean_country(rs.getString(1));
				al.add(r1);
			}
			
		// TODO Auto-generated method stub
		return al;
	}	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	finally
	{
		if(ps!=null)
		ps.close();
		if(conn!=null)
			conn.close();
	}}
	return null;
	}

	

	public ArrayList<RegisterForm > mTongueRetrieve(RegisterForm r) throws SQLException {
		
		Connection conn=getConnection();
		
		ArrayList<RegisterForm > al=new ArrayList<RegisterForm >();
		if(conn!=null)
		{
		try{
			String query="select mtongue from matrimony_mtongue";
			ps=conn.prepareStatement(query);
			rs=ps.executeQuery();
			while(rs.next()){
				
			    RegisterForm r1=new RegisterForm();
				r1.setBean_mTongue(rs.getString(1));
				al.add(r1);
			}
			
		// TODO Auto-generated method stub
		return al;
	}	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	finally
	{
		if(ps!=null)
		ps.close();
		if(conn!=null)
			conn.close();
	}}
	return null;
	}

	public ArrayList<RegisterForm> getProfile(RegisterForm rForm) throws SQLException {
	Connection conn=getConnection();
	System.out.println(rForm.getBean_userId());
	
		
		ArrayList<RegisterForm > al=new ArrayList<RegisterForm >();
		if(conn!=null){
			try{
				/*String s=rForm.getBean_userId();
				String query="select ru.searchfor,ru.name,ru.age,ru.height,ru.mstatus,rp.mtongue,rp.caste,rp.manglik,rp.religion,rp.education,rp.occupation,rp.complexion,rc.state,rc.country,rc.place,rc.mobileno,ri.hobbies,ri.interests,ri.aboutme,re.f_type,re.f_status,re.f_value,re.f_siaters,re.f_brothers,re.f_orphan,re.annual_sal,re.emp_in,re.f_focc,re.f_mocc from register_user as ru,register_personal as rp,register_contact as rc,register_interests as ri,register_user_extra as re where ru.userId=? and rp.userId =? and rc.userId=? and ri.userId=? and re.userId=?";
				ps=conn.prepareStatement(query);
				ps.setString(1, s);
				ps.setString(2, s);
				ps.setString(3, s);
				ps.setString(4, s);
				ps.setString(5, s);
				rs=ps.executeQuery();
				while(rs.next()){
					
				   
					rForm.setBean_searchFor(rs.getString(1));
					rForm.setBean_name(rs.getString(2));
					rForm.setBean_age(rs.getInt(3));
					rForm.setBean_height(rs.getInt(4));
					rForm.setBean_mStatus(rs.getString(5));
					rForm.setBean_mTongue(rs.getString(6));
					rForm.setBean_caste(rs.getString(7));
					rForm.setBean_manglik(rs.getString(8));
					rForm.setBean_religion(rs.getString(9));
					rForm.setBean_education(rs.getString(10));
					rForm.setBean_occupation(rs.getString(11));
					rForm.setBean_complexion(rs.getString(12));
					rForm.setBean_state(rs.getString(13));
					rForm.setBean_country(rs.getString(14));
					rForm.setBean_place(rs.getString(15));
					rForm.setBean_mobileNo(rs.getLong(16));
					rForm.setBean_hobbies(rs.getString(17));
					rForm.setBean_interests(rs.getString(18));
					rForm.setBean_aboutMe(rs.getString(19));
					rForm.setBean_ftype(rs.getString(20));
					rForm.setBean_fstatus(rs.getString(21));
					rForm.setBean_fvalue(rs.getString(22));
					rForm.setBean_fsis(rs.getInt(23));
					rForm.setBean_fbro(rs.getInt(24));
					rForm.setBean_forphan(rs.getString(25));
					rForm.setBean_annual(rs.getLong(26));
					rForm.setBean_emp_in(rs.getString(27));
					rForm.setBean_focc(rs.getString(28));
					rForm.setBean_mocc(rs.getString(29));
					
					al.add(rForm);
				}*/
				
				
				
				
				String s=rForm.getBean_userId();
				String query="select ru.sf,ru.fname,ru.lname,ru.age,ru.height,ru.mstatus,rp.mtongue,rp.caste,rp.manglik,rp.religion,rp.education,rp.occupation,rp.complexion,rp.gotram,rp.star,rc.state,rc.country,rc.place,rc.phoneno,rc.mobileno,rc.houseno,ri.hobbies,ri.interests,ri.aboutme,re.f_type,re.f_status,re.f_value,re.f_sisters,re.f_brothers,re.f_orphan,re.annual_income,re.emp_in,re.f_focc,re.f_mocc,ru.emailid from register_user as ru,register_personal as rp,register_contact as rc,register_interest as ri,register_user_extra as re where ru.userId=? and rp.userId =? and rc.userId=? and ri.userId=? and re.userId=?";
				ps=conn.prepareStatement(query);
				ps.setString(1, s);
				ps.setString(2, s);
				ps.setString(3, s);
				ps.setString(4, s);
				ps.setString(5, s);
				rs=ps.executeQuery();
				while(rs.next()){
					
				   
					rForm.setBean_searchFor(rs.getString(1));
					rForm.setBean_fname(rs.getString(2));
					rForm.setBean_lname(rs.getString(3));
					rForm.setBean_age(rs.getInt(4));
					rForm.setBean_height(rs.getInt(5));
					rForm.setBean_mStatus(rs.getString(6));
					rForm.setBean_mTongue(rs.getString(7));
					rForm.setBean_caste(rs.getString(8));
					rForm.setBean_manglik(rs.getString(9));
					rForm.setBean_religion(rs.getString(10));
					rForm.setBean_education(rs.getString(11));
					rForm.setBean_occupation(rs.getString(12));
					rForm.setBean_complexion(rs.getString(13));
					rForm.setBean_gothram(rs.getString(14));
					rForm.setBean_star(rs.getString(15));
					rForm.setBean_state(rs.getString(16));
					rForm.setBean_country(rs.getString(17));
					rForm.setBean_place(rs.getString(18));
					rForm.setBean_phoneNo(rs.getLong(19));
					rForm.setBean_mobileNo(rs.getLong(20));
					rForm.setBean_houseno(rs.getString(21));
					rForm.setBean_hobbies(rs.getString(22));
					rForm.setBean_interests(rs.getString(23));
					rForm.setBean_aboutMe(rs.getString(24));
					rForm.setBean_ftype(rs.getString(25));
					rForm.setBean_fstatus(rs.getString(26));
					rForm.setBean_fvalue(rs.getString(27));
					rForm.setBean_fsis(rs.getInt(28));
					rForm.setBean_fbro(rs.getInt(29));
					rForm.setBean_forphan(rs.getString(30));
					rForm.setBean_annual(rs.getLong(31));
					rForm.setBean_emp_in(rs.getString(32));
					rForm.setBean_focc(rs.getString(33));
					rForm.setBean_mocc(rs.getString(34));
					rForm.setBean_emailId(rs.getString(35));
					
					al.add(rForm);
				}
			// TODO Auto-generated method stub
			return al;
		}	catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			if(ps!=null)
			ps.close();
			if(conn!=null)
				conn.close();
		}}
	
		// TODO Auto-generated method stub
		return null;
	}
	

	public ArrayList<RegisterForm> getProfilePartner(RegisterForm rForm) throws SQLException {
Connection conn=getConnection();
		
		ArrayList<RegisterForm > al=new ArrayList<RegisterForm >();
		if(conn!=null){
			try{
				String s=rForm.getBean_userId();
				String query="select p1.startage,p1.endage,p1.height,p1.mstatus,p1.mtongue,p1.e_habits,p1.f_orphan,p2.religion,p2.caste,p2.education,p2.occupation,p2.annual_income_range,p2.country,p2.state,p2.city,p2.manglik,p2.star from register_user_pref1 as p1,register_user_pref2 as p2 where p1.userid=? and p2.userid=?";
				ps=conn.prepareStatement(query);
				ps.setString(1, s);
				ps.setString(2, s);
				rs=ps.executeQuery();
				while(rs.next()){
					rForm.setBean_pmStatus(rs.getString(4));
					rForm.setBean_pmTongue(rs.getString(5));
					rForm.setBean_e_habbits(rs.getString(6));
					rForm.setBean_pforphan(rs.getString(7));
					rForm.setBean_preligion(rs.getString(8));
					rForm.setBean_pcaste(rs.getString(9));
					rForm.setBean_peducation(rs.getString(10));
					rForm.setBean_pocc(rs.getString(11));
					rForm.setBean_pcountry(rs.getString(13));
					rForm.setBean_pstate(rs.getString(14));
					rForm.setBean_pcity(rs.getString(15));
					rForm.setBean_pmanglik(rs.getString(16));
					rForm.setBean_pstar(rs.getString(17));
					rForm.setBean_pstage(rs.getInt(1));
					rForm.setBean_page(rs.getInt(2));
					rForm.setBean_pheight(rs.getInt(3));
					rForm.setBean_pannualsal(rs.getInt(12));
					
					al.add(rForm);
				}
				return al;
				
		
		// TODO Auto-generated method stub
		
	}	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	finally
	{
		if(ps!=null)
		ps.close();
		if(conn!=null)
			conn.close();
	}}

	// TODO Auto-generated method stub
	return null;
}

	public boolean updateBasic(RegisterForm rForm) throws SQLException {
		Connection conn=getConnection();
		
	
		if(conn!=null){
			try{
				String query="update register_user ru,register_personal rp set ru.fname=?,ru.lname=?,ru.age=?,ru.height=?,ru.mstatus=?,rp.mtongue=?,rp.complexion=? where ru.userid=? and rp.userid=?";
				ps=conn.prepareStatement(query);
				ps.setString(1, rForm.getBean_fname());
				ps.setString(2, rForm.getBean_lname());
				ps.setInt(3, rForm.getBean_age());
				ps.setInt(4, rForm.getBean_height());
				ps.setString(5, rForm.getBean_mStatus());
				ps.setString(6, rForm.getBean_mTongue());
				ps.setString(7, rForm.getBean_complexion());
				ps.setString(8, rForm.getBean_userId());
				ps.setString(9, rForm.getBean_userId());
				ps.executeUpdate();
				return true;
			}	catch(Exception e)
			{
				e.printStackTrace();
			}
			
			finally
			{
				if(ps!=null)
				ps.close();
				if(conn!=null)
					conn.close();
			}}
		
			// TODO Auto-generated method stub
		
		
		
		
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateReligion(RegisterForm rForm) throws SQLException {
Connection conn=getConnection();
		
		
		if(conn!=null){
			try{
				String query="update register_personal  set religion=?,caste=?,gotram=?,star=?,manglik=? where userid=? ";
				ps=conn.prepareStatement(query);
				ps.setString(1, rForm.getBean_religion());
				ps.setString(2, rForm.getBean_caste());
				ps.setString(3, rForm.getBean_gothram());
				ps.setString(4, rForm.getBean_star());
				ps.setString(5, rForm.getBean_manglik());
				ps.setString(6, rForm.getBean_userId());
				ps.executeUpdate();
				return true;
			}	catch(Exception e)
			{
				e.printStackTrace();
			}
			
			finally
			{
				if(ps!=null)
				ps.close();
				if(conn!=null)
					conn.close();
			}}
		
		return false;
	}

	

	public boolean updateLocation(RegisterForm rForm) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn=getConnection();
		
		
		if(conn!=null){
			try{
				String query="update register_contact set place=?,state=?,country=?,houseno=? where userid=?";
				ps=conn.prepareStatement(query);
				ps.setString(1, rForm.getBean_place());
				ps.setString(2, rForm.getBean_state());
				
				ps.setString(3, rForm.getBean_country());
				ps.setString(4, rForm.getBean_houseno());
				
				ps.setString(5, rForm.getBean_userId());
				ps.executeUpdate();
				return true;
			}	catch(Exception e)
			{
				e.printStackTrace();
			}
			
			finally
			{
				if(ps!=null)
				ps.close();
				if(conn!=null)
					conn.close();
			}}
		
		return false;
	}

	public boolean updateContact(RegisterForm rForm) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn=getConnection();
		
		
		if(conn!=null){
			try{
				String query="update register_user ru,register_contact rc set ru.emailid=?,rc.phoneno=?,rc.mobileno=? where ru.userid=? and rc.userid=?";
				ps=conn.prepareStatement(query);
				ps.setString(1, rForm.getBean_emailId());
				ps.setLong(2, rForm.getBean_phoneNo());
				ps.setLong(3, rForm.getBean_mobileNo());
				ps.setString(4, rForm.getBean_userId());
				ps.setString(5, rForm.getBean_userId());
				ps.executeUpdate();
				return true;
			}	catch(Exception e)
			{
				e.printStackTrace();
			}
			
			finally
			{
				if(ps!=null)
				ps.close();
				if(conn!=null)
					conn.close();
			}}
		
		return false;
	}
	
	
	public boolean updateAboutMe(RegisterForm rForm) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn=getConnection();
		
		
		if(conn!=null){
			try{
				String query="update register_interest set aboutme=? where userid=?";
				ps=conn.prepareStatement(query);
				ps.setString(1, rForm.getBean_aboutMe());
				ps.setString(2, rForm.getBean_userId());
				ps.executeUpdate();
				return true;
			}	catch(Exception e)
			{
				e.printStackTrace();
			}
			
			finally
			{
				if(ps!=null)
				ps.close();
				if(conn!=null)
					conn.close();
			}}
		return false;
	}

	public boolean updateHobbies(RegisterForm rForm) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn=getConnection();
		
		
		if(conn!=null){
			try{
				String query="update register_interest set hobbies=? where userid=?";
				ps=conn.prepareStatement(query);
				ps.setString(1, rForm.getBean_hobbies());
				ps.setString(2, rForm.getBean_userId());
				ps.executeUpdate();
				return true;
			}	catch(Exception e)
			{
				e.printStackTrace();
			}
			
			finally
			{
				if(ps!=null)
				ps.close();
				if(conn!=null)
					conn.close();
			}}
		return false;
	}

	public boolean updateInterests(RegisterForm rForm) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn=getConnection();
		
		
		if(conn!=null){
			try{
				String query="update register_interest set interests=? where userid=?";
				ps=conn.prepareStatement(query);
				ps.setString(1, rForm.getBean_interests());
				ps.setString(2, rForm.getBean_userId());
				ps.executeUpdate();
				return true;
			}	catch(Exception e)
			{
				e.printStackTrace();
			}
			
			finally
			{
				if(ps!=null)
				ps.close();
				if(conn!=null)
					conn.close();
			}}
		return false;
	}
	public boolean updateProfessional(RegisterForm rForm) throws SQLException{
Connection conn=getConnection();
		
		
		if(conn!=null){
			try{
				String query="update register_user_extra re,register_personal rp set re.emp_in=?,re.annual_income=?,rp.education=?,rp.occupation=? where re.userid=? and rp.userid=?";
				ps=conn.prepareStatement(query);
				ps.setString(1, rForm.getBean_emp_in());
				ps.setLong(2, rForm.getBean_annual());
				ps.setString(3, rForm.getBean_education());
				ps.setString(4, rForm.getBean_occupation());
				
				ps.setString(5, rForm.getBean_userId());
				ps.setString(6, rForm.getBean_userId());
				ps.executeUpdate();
				return true;
			}	catch(Exception e)
			{
				e.printStackTrace();
			}
			
			finally
			{
				if(ps!=null)
				ps.close();
				if(conn!=null)
					conn.close();
			}}
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateFamily(RegisterForm rForm) throws SQLException {
Connection conn=getConnection();
		
		
		if(conn!=null){
			try{
				String query="update register_user_extra set f_type=?,f_value=?,f_status=?,f_brothers=?,f_sisters=?,f_focc=?,f_mocc=? where userid=?";
				ps=conn.prepareStatement(query);
				ps.setString(1, rForm.getBean_ftype());
				ps.setString(2, rForm.getBean_fvalue());
				ps.setString(3, rForm.getBean_fstatus());
				ps.setInt(4, rForm.getBean_fbro());
				ps.setInt(5, rForm.getBean_fsis());
				ps.setString(6, rForm.getBean_focc());
				ps.setString(7, rForm.getBean_mocc());
				ps.setString(8, rForm.getBean_userId());
				ps.executeUpdate();
				return true;
			}	catch(Exception e)
			{
				e.printStackTrace();
			}
			
			finally
			{
				if(ps!=null)
				ps.close();
				if(conn!=null)
					conn.close();
			}}
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updatePartnerLocation(RegisterForm rForm) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn=getConnection();
		
		
		if(conn!=null){
			try{
				String query="update register_user_pref2 set country=?,state=?,city=? where userid=?";
				ps=conn.prepareStatement(query);
				ps.setString(1, rForm.getBean_pcountry());
				ps.setString(2, rForm.getBean_pstate());
				ps.setString(3, rForm.getBean_pcity());
				ps.setString(4, rForm.getBean_userId());
				ps.executeUpdate();
				return true;
			}	catch(Exception e)
			{
				e.printStackTrace();
			}
			
			finally
			{
				if(ps!=null)
				ps.close();
				if(conn!=null)
					conn.close();
			}}
		
		return false;
	}


	public boolean updatePartnerBasic(RegisterForm rForm) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn=getConnection();
		
		
		if(conn!=null){
			try{
				String query="update register_user_pref1 set endage=?,height=?,mstatus=?,mtongue=?,e_habits=? where userid=?";
				ps=conn.prepareStatement(query);
				ps.setInt(1, rForm.getBean_page());
				ps.setInt(2, rForm.getBean_pheight());
				ps.setString(3, rForm.getBean_pmStatus());
				ps.setString(4, rForm.getBean_pmTongue());
				ps.setString(5, rForm.getBean_e_habbits());
				ps.setString(6, rForm.getBean_userId());
				ps.executeUpdate();
				return true;
			}	catch(Exception e)
			{
				e.printStackTrace();
			}
			
			finally
			{
				if(ps!=null)
				ps.close();
				if(conn!=null)
					conn.close();
			}}
		
		return false;
	}
	public boolean updatePartnerReligion(RegisterForm rForm) throws SQLException {
Connection conn=getConnection();
		
		
		if(conn!=null){
			try{
				String query="update register_user_pref2 set religion=?,caste=?,manglik=?,star=? where userid=?";
				ps=conn.prepareStatement(query);
				ps.setString(1, rForm.getBean_preligion());
				ps.setString(2, rForm.getBean_pcaste());
				ps.setString(3, rForm.getBean_pmanglik());
				ps.setString(4, rForm.getBean_pstar());
				
				ps.setString(5, rForm.getBean_userId());
				ps.executeUpdate();
				return true;
			}	catch(Exception e)
			{
				e.printStackTrace();
			}
			
			finally
			{
				if(ps!=null)
				ps.close();
				if(conn!=null)
					conn.close();
			}}
		
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updatePartnerProfessional(RegisterForm rForm) throws SQLException {
		// TODO Auto-generated method stub
Connection conn=getConnection();
		
		
		if(conn!=null){
			try{
				String query="update register_user_pref2 set occupation=?,education=?,annual_income_range=? where userid=?";
				ps=conn.prepareStatement(query);
				ps.setString(1, rForm.getBean_pocc());
				ps.setString(2, rForm.getBean_peducation());
				ps.setInt(3, rForm.getBean_pannualsal());
				ps.setString(4, rForm.getBean_userId());
				ps.executeUpdate();
				return true;
			}	catch(Exception e)
			{
				e.printStackTrace();
			}
			
			finally
			{
				if(ps!=null)
				ps.close();
				if(conn!=null)
					conn.close();
			}}
		
		return false;
	}

	public boolean like(RegisterForm rForm) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn=getConnection();
		System.out.println(rForm.getBean_userId());
		if(conn!=null){
		try{
			
			String query="insert into chat_like values(?,?)";
			ps=conn.prepareStatement(query);
			ps.setString(1, rForm.getBean_userLike());
			ps.setString(2, rForm.getBean_userId());
			ps.executeUpdate();
			return true;
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			if(ps!=null)
			ps.close();
			if(conn!=null)
				conn.close();
		}
		
		}
		
		
		return false;
	}

	public ArrayList<RegisterForm> mylike(RegisterForm rForm) throws SQLException {
		ArrayList<RegisterForm> likeList=new ArrayList<RegisterForm>();
		Connection conn=getConnection();
		rForm.setBean_userId("ran13233");
		System.out.println(rForm.getBean_userId());
		if(conn!=null){
		try{
			
			String query="select user_like from chat_like where userid=?";
			ps=conn.prepareStatement(query);
			ps.setString(1, rForm.getBean_userId());
			rs=ps.executeQuery();
			while (rs.next()){
				RegisterForm r1=new RegisterForm();
				r1.setBean_userLike(rs.getString(1));
				Blob b1=null;
				String query1="select image from images_user where userid=?";
				ps1=(PreparedStatement) con.prepareStatement(query1);
				ps1.setString(1,rs.getString(1));
				rs1=ps1.executeQuery();
				 
				
				while(rs1.next())
				{
						
						b1=(Blob) rs1.getBlob(1);
						InputStream x=b1.getBinaryStream();
						int size=x.available();
						String fname="C:\\Documents and Settings\\676536\\Desktop\\Images\\"+rs.getString(1)+".jpeg";
						OutputStream out1=new FileOutputStream(fname);
						byte b[]= new byte[size];
						x.read(b);
						out1.write(b);
						
						r1.setProfPhoto(fname);
						System.out.println(fname);

							
				}
			

			   
			
				System.out.println(rs.getString(1));
				likeList.add(r1);
			}
			return likeList;
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			if(ps!=null)
			ps.close();
			if(conn!=null)
				conn.close();
		}
		
		}
		
		
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<RegisterForm> myfollowers(RegisterForm rForm) throws SQLException {
		// TODO Auto-generated method stub
		ArrayList<RegisterForm> likeList=new ArrayList<RegisterForm>();
		Connection conn=getConnection();
		rForm.setBean_userId("ran13233");
		System.out.println(rForm.getBean_userId());
		if(conn!=null){
		try{
			
			String query="select userId from chat_like where user_like=?";
			ps=conn.prepareStatement(query);
			ps.setString(1, rForm.getBean_userId());
			rs=ps.executeQuery();
			while (rs.next()){
				Blob b1=null;
				String query1="select image from images_user where userid=?";
				ps1=(PreparedStatement) con.prepareStatement(query1);
				ps1.setString(1,rs.getString(1));
				rs1=ps1.executeQuery();
				 RegisterForm r1=new RegisterForm();
					r1.setBean_userLike(rs.getString(1));
				
				while(rs1.next())
				{
						
						b1=(Blob) rs1.getBlob(1);
						InputStream x=b1.getBinaryStream();
						int size=x.available();
						String fname="D:\\676536\\MatrimonyIntegrated\\WebContent\\Images\\"+rs.getString(1)+".jpeg";
						OutputStream out1=new FileOutputStream(fname);
						byte b[]= new byte[size];
						x.read(b);
						out1.write(b);
						
						r1.setProfPhoto(fname);
						System.out.println(fname);

							
				}
			

			   
				likeList.add(r1);
			}
			return likeList;
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			if(ps!=null)
			ps.close();
			if(conn!=null)
				conn.close();
		}
		
		}
		
		
		return null;
	}

	public ArrayList<RegisterForm> myrelations(RegisterForm rForm) throws SQLException {
		// TODO Auto-generated method stub
		ArrayList<RegisterForm> likeList=new ArrayList<RegisterForm>();
		Connection conn=getConnection();
		rForm.setBean_userId("ran13233");
		System.out.println(rForm.getBean_userId());
		if(conn!=null){
		try{
			
			String query1="select user_like from chat_like where userid=?";
			String query="select userId from chat_like where user_like=?";
			ps=conn.prepareStatement(query);
			ps1=conn.prepareStatement(query1);
			ps.setString(1, rForm.getBean_userId());
			rs=ps.executeQuery();
			ps1.setString(1, rForm.getBean_userId());
			rs1=ps1.executeQuery();
			if(rs!=null && rs1!=null){
			while (rs.next()){
				 String s=rs.getString(1);
				 System.out.println(s);
				 
                 while(rs1.next()){
                	 
                	 System.out.println(rs1.getString(1));
                	 if(s.equals(rs1.getString(1)))
                	 {
                		 Blob b1=null;
         				String query2="select image from images_user where userid=?";
         				ps2=(PreparedStatement) con.prepareStatement(query2);
         				ps2.setString(1,rs1.getString(1));
         				rs2=ps2.executeQuery();
         				 RegisterForm r1=new RegisterForm();
         					r1.setBean_userLike(rs.getString(1));
         				
         				while(rs2.next())
         				{
         						
         						b1=(Blob) rs2.getBlob(1);
         						InputStream x=b1.getBinaryStream();
         						int size=x.available();
         						String fname="D:\\676536\\MatrimonyIntegrated\\WebContent\\Images\\"+rs1.getString(1)+".jpeg";
         						OutputStream out1=new FileOutputStream(fname);
         						byte b[]= new byte[size];
         						x.read(b);
         						out1.write(b);
         						
         						r1.setProfPhoto(fname);
         						System.out.println(fname);

         							
         				}
         			

         			   
                		 r1.setBean_userLike(s);
                		 likeList.add(r1);
                	 }
                	
                	
                 }
                 rs1.first();
                 rs1.previous();
				
			}
			}
			return likeList;
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			if(ps!=null)
			ps.close();
			if(conn!=null)
				conn.close();
		}
		
		}
		
		return null;
	}

	public boolean sendMessage(RegisterForm rForm) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection conn=getConnection();
		System.out.println(rForm.getBean_userId());
		if(conn!=null){
		try{
			
			String query="insert into chat_info values(?,?,?)";
			ps=conn.prepareStatement(query);
			ps.setString(1, rForm.getBean_userId());
			ps.setString(2, rForm.getBean_message());
			ps.setString(3, rForm.getBean_userLike());
			ps.executeUpdate();
			return true;
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			if(ps!=null)
			ps.close();
			if(conn!=null)
				conn.close();
		}
		
		}
		
		
		return false;
	}

	public ArrayList<RegisterForm> sentMessages(RegisterForm rForm) throws SQLException {
		// TODO Auto-generated method stub
		ArrayList<RegisterForm> chatList=new ArrayList<RegisterForm>();
		Connection conn=getConnection();
		System.out.println(rForm.getBean_userId());
		if(conn!=null){
		try{
			
			String query="select message,user_send from chat_info where userid=?";
			ps=conn.prepareStatement(query);
			ps.setString(1, rForm.getBean_userId());
			rs=ps.executeQuery();
			while (rs.next()){

			    RegisterForm r1=new RegisterForm();
				r1.setBean_message(rs.getString(1));
				r1.setBean_userLike(rs.getString(2));
				chatList.add(r1);
			}
			return chatList;
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			if(ps!=null)
			ps.close();
			if(conn!=null)
				conn.close();
		}
		
		}
		
		return null;
	}

	public ArrayList<RegisterForm> receivedMessages(RegisterForm rForm) throws SQLException {
		// TODO Auto-generated method stub
		ArrayList<RegisterForm> chatList=new ArrayList<RegisterForm>();
		Connection conn=getConnection();
		System.out.println(rForm.getBean_userId());
		if(conn!=null){
		try{
			
			String query="select message,userid from chat_info where user_send=?";
			ps=conn.prepareStatement(query);
			ps.setString(1, rForm.getBean_userId());
			rs=ps.executeQuery();
			while (rs.next()){

			    RegisterForm r1=new RegisterForm();
				r1.setBean_message(rs.getString(1));
				r1.setBean_userLike(rs.getString(2));
				chatList.add(r1);
			}
			return chatList;
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			if(ps!=null)
			ps.close();
			if(conn!=null)
				conn.close();
		}
		
		}
		
		return null;
	}

	public String generateEId(EventForm rForm) {
		// TODO Auto-generated method stub
		
		
		Random r=new Random();
		int co=r.nextInt(500);
		String name=rForm.getBn_name();
		System.out.println(co);
		String ph=String.valueOf(rForm.getBn_contact());
		System.out.println(ph);
		String user_id="e"+name.substring(0,2)+ph.substring(3,5)+co;
		return (user_id);
		
	}


	public boolean eventRegister(EventForm rForm) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn=getConnection();
	   System.out.println(rForm.getBn_userId());
		if(conn!=null){
		try{
		String query="insert into matrimony_event values(?,?,?,?,?,?)";
			
		ps=conn.prepareStatement(query);
		ps.setString(1,rForm.getBn_userId());
		ps.setString(2,rForm.getBn_name());
		ps.setString(3,rForm.getBn_address());
		ps.setInt(4,rForm.getBn_contact());
		ps.setString(5,rForm.getBn_email());
		ps.setString(6,rForm.getBn_password());
		ps.execute();
		
		return true;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			if(ps!=null)
			ps.close();
			if(conn!=null)
				conn.close();
		}
		}
		
		
		return false;
	}

	public ArrayList<EventForm> searchPackage(EventForm rForm) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn=getConnection();
		ArrayList<EventForm> list=new ArrayList<EventForm>();
		   System.out.println(rForm.getBn_userId());
			if(conn!=null){
			try{
				String query="select * from matrimony_event_package where ppl>? and budget<=?";
				ps=conn.prepareStatement(query);
				ps.setInt(1,rForm.getBn_people());
				ps.setFloat(2,rForm.getBn_budget());
				rs=ps.executeQuery();
				while(rs.next()){
					EventForm eForm=new EventForm();
					eForm.setBn_code(rs.getString(1));
					eForm.setBn_people(rs.getInt(2));
					eForm.setBn_budget(rs.getFloat(3));
					eForm.setBn_vcat(rs.getString(4));
					eForm.setBn_vdeco(rs.getString(5));
					eForm.setBn_vvideo(rs.getString(6));
					eForm.setBn_vvenue(rs.getString(7));
					eForm.setBn_ventertain(rs.getString(8));
					list.add(eForm);
				}
				return list;
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			finally
			{
				if(ps!=null)
				ps.close();
				if(conn!=null)
					conn.close();
			}
			}
		return null;
	}

	public ArrayList<EventForm> purchasePackage(EventForm rForm) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<EventForm> getCodes() throws SQLException {
		// TODO Auto-generated method stub
		Connection conn=getConnection();
		ArrayList<EventForm> list=new ArrayList<EventForm>();
		  
			if(conn!=null){
			try{
				String query="select code from matrimony_event_package ";
				ps=conn.prepareStatement(query);
				rs=ps.executeQuery();
				while(rs.next()){
					EventForm eForm=new EventForm();
					eForm.setBn_code(rs.getString(1));
					list.add(eForm);
				}
				return list;
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
			finally
			{
				if(ps!=null)
				ps.close();
				if(conn!=null)
					conn.close();
			}
			}
		return null;
	}

	public EventForm getPackageInfo(EventForm eForm) throws SQLException {
		Connection conn=getConnection();
		
			if(conn!=null){
			try{
				String query="select * from matrimony_event_package where code=?";
				ps=conn.prepareStatement(query);
				ps.setString(1,eForm.getBn_code());
			
				rs=ps.executeQuery();
				while(rs.next()){
				
					eForm.setBn_code(rs.getString(1));
					eForm.setBn_people(rs.getInt(2));
					eForm.setBn_budget(rs.getFloat(3));
					eForm.setBn_vcat(rs.getString(4));
					eForm.setBn_vdeco(rs.getString(5));
					eForm.setBn_vvideo(rs.getString(6));
					eForm.setBn_vvenue(rs.getString(7));
					eForm.setBn_ventertain(rs.getString(8));
				
				}
				return eForm;
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			finally
			{
				if(ps!=null)
				ps.close();
				if(conn!=null)
					conn.close();
			}
			}
		// TODO Auto-generated method stub
		return null;
	}

	public boolean insertPaymentDetails(EventForm rForm) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection conn=getConnection();
		 
		   rForm.setBn_userId("eff65312");
		   String cardnum=rForm.getBn_card1()+rForm.getBn_card2()+rForm.getBn_card3()+rForm.getBn_card4();
			if(conn!=null){
			try{
			String query="insert into matrimony_event_payment values(?,?,?,?,?,?)";
				
			ps=conn.prepareStatement(query);
			ps.setString(1,rForm.getBn_userId());
			ps.setString(2,rForm.getBn_paymode());
			ps.setFloat(3,rForm.getBn_budget());
			ps.setString(4,cardnum);
			ps.setString(5,rForm.getBn_code());
			ps.setString(6,rForm.getBn_paybank());
			ps.execute();
			
			return true;
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
			finally
			{
				if(ps!=null)
				ps.close();
				if(conn!=null)
					conn.close();
			}
			}
		return false;
	}

	public boolean uploadProPic(RegisterForm rForm) throws SQLException, FileNotFoundException {
		// TODO Auto-generated method stub
		Connection con=getConnection();
		String queryString=null;
		  rForm.setBean_userId("ran13233");
			String category=rForm.getBean_category();
			if(category.equals("profilepic")){
				if(j==0){
				queryString="insert into images_user values(?,?)";
				j++;
				}
				else{
					queryString="update images_user set image=? where userid=?";
					j++;
					String source=rForm.getProfPhoto();
					System.out.println(source);
				File imgFile=new File(source);
				FileInputStream fin = new FileInputStream(imgFile);
				
				ps=(PreparedStatement) con.prepareStatement(queryString);
				
				ps.setString(2,rForm.getBean_userId());
				ps.setBinaryStream(1,fin,(int)imgFile.length());
				
				int i=ps.executeUpdate();
						if(i!=0)
						{
							System.out.println("insertion successfull");
							return true;
						}else
							System.out.println("Your image should not exceed 10 mb");
						return false;
				
				}
			}
			if(category.equals("album")){
				queryString="insert into image_album values(?,?)";
			}
		String source=rForm.getProfPhoto();
		System.out.println(source);
	File imgFile=new File(source);
	FileInputStream fin = new FileInputStream(imgFile);
	
	ps=(PreparedStatement) con.prepareStatement(queryString);
	
	ps.setString(1,rForm.getBean_userId());
	ps.setBinaryStream(2,fin,(int)imgFile.length());
	
	int i=ps.executeUpdate();
			if(i!=0)
			{
				System.out.println("insertion successfull");
				return true;
			}
			else
				System.out.println("Your image should not exceed 10 mb");
		return false;
	}

	public ArrayList<RegisterForm> retrieveProPic(RegisterForm rForm) throws SQLException, IOException {
		// TODO Auto-generated method stub
		ArrayList<RegisterForm> list=new ArrayList<RegisterForm>();
		Connection con=getConnection();
		 rForm.setBean_userId("ran13233");
	
		Blob b1=null;
		String query="select image from images_user where userid=?";
		ps=(PreparedStatement) con.prepareStatement(query);
		ps.setString(1,rForm.getBean_userId());
		rs=ps.executeQuery();
		
		
		while(rs.next())
		{
				
				b1=(Blob) rs.getBlob(1);
				InputStream x=b1.getBinaryStream();
				int size=x.available();
				String fname="D:\\676536\\MatrimonyIntegrated\\WebContent\\ProfileImages\\"+rForm.getBean_userId()+".jpeg";
				OutputStream out1=new FileOutputStream(fname);
				byte b[]= new byte[size];
				x.read(b);
				out1.write(b);
				RegisterForm pf=new RegisterForm();
				pf.setProfPhoto(fname);

					list.add(pf);
				
		}
	
		return list;
		
		
	}
	public ArrayList<PartnerForm> getPartnerDetails(SearchForm sf) throws SQLException{
		ArrayList<PartnerForm> ar =new ArrayList<PartnerForm>();
		// write a query to retrieve the partner userid,religion,state,occupation,mstatus,mtongue
		Connection conn=getConnection();
	String query2="";
		try {
			ps=conn.prepareStatement(query2);
			rs=ps.executeQuery(query2);
			while(rs.next()){
				PartnerForm s1=new PartnerForm();
				s1.setpUserId(rs.getString(1));
				s1.setpMstatus(rs.getString(2));
				s1.setpMtongue(rs.getString(3));
				s1.setpReligion(rs.getString(4));
				s1.setpOccupation(rs.getString(5));
				s1.setpState(rs.getString(6));
				ar.add(s1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			if(ps!=null){
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		}
		return ar;
		
	}
	
	public ArrayList<SearchForm> getSearchDetails(SearchForm sf) throws SQLException, IOException{
		Connection conn=getConnection();
		ArrayList<SearchForm> ar =new ArrayList<SearchForm>();
		Blob b1=null;
		int minage=sf.getBn_age()-5;
		String query1="select ru.userid,ru.fname,ru.gender,ru.age,ru.height,rp.mtongue,rp.education,rp.religion,rp.occupation ,iu.image from register_user as ru,register_personal as rp,images_user as iu where ru.userid=rp.userid and rp.userid=iu.userid ";
		StringBuffer buffer=new StringBuffer();
		buffer.append(query1);
		if(sf.getBn_gender()!=null){
			buffer.append("and gender='"+sf.getBn_gender()+"'");
		}
		if(sf.getBn_age()!=0){
			buffer.append("and age>'"+minage+"' and age<'"+sf.getBn_age()+"'");
		}
		if(sf.getBn_height()!=0){
			buffer.append("and height='"+sf.getBn_height()+"'");
		}
		if(sf.getBn_mstatus()!=null){
			buffer.append("and mstatus='"+sf.getBn_mstatus()+"'");
		}
		if(sf.getBn_religion()!=null && sf.getBn_religion()!=""){
			buffer.append("and religion='"+sf.getBn_religion()+"'");
		}
		if(sf.getBn_education()!=null){
			buffer.append("and education='"+sf.getBn_education()+"'");
		}
		if(sf.getBn_occupation()!=null){
			buffer.append("and occupation='"+sf.getBn_occupation()+"'");
		}
		if(sf.getBn_country()!=null && sf.getBn_country()!=""){
			buffer.append("and country='"+sf.getBn_country()+"'");
		}
		if(sf.getBn_color()!=null){
			buffer.append("and complexion='"+sf.getBn_color()+"'");
		}
		if(sf.getBn_language()!=null && sf.getBn_language()!=""){
			buffer.append("and mtongue='"+sf.getBn_language()+"'");
		}
		/*if(true){
			buffer.append(" limit 50");
		}*/
		
		String query2=buffer.toString();
		System.out.println(query2);
		try {
			ps=conn.prepareStatement(query2);
			rs=ps.executeQuery(query2);
			while(rs.next()){
				SearchForm s1=new SearchForm();
				s1.setBn_userid(rs.getString(1));
				s1.setBn_name(rs.getString(2));
				s1.setBn_gender(rs.getString(3));
				s1.setBn_age(rs.getInt(4));
				s1.setBn_height(rs.getDouble(5));
				s1.setBn_language(rs.getString(6));
				s1.setBn_education(rs.getString(7));
				s1.setBn_religion(rs.getString(8));
				s1.setBn_occupation(rs.getString(9));

				b1=(Blob) rs.getBlob(10);
				InputStream x=b1.getBinaryStream();
				int size=x.available();
				String fname="ProfileImages\\"+s1.getBn_userid()+".jpeg";
				OutputStream out1=new FileOutputStream(fname);
				byte b[]= new byte[size];
				x.read(b);
				out1.write(b);
				s1.setProfPhoto(fname);
				ar.add(s1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			if(ps!=null){
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		}
		return ar;
	}

	public ArrayList<SearchForm> getSearchDetails(SearchForm sf,PartnerForm pf) throws SQLException, IOException{
		Connection conn=getConnection();
		ArrayList<SearchForm> ar =new ArrayList<SearchForm>();
		Blob b1=null;
		int minage=sf.getBn_age()-5;
		String query2="select ru.userid,ru.fname,ru.gender,ru.age,ru.height,rp.mtongue,rp.education,rp.religion,rp.occupation ,iu.image,ru.mstatus from register_user as ru,register_personal as rp,images_user as iu, register_user_pref1 as rup1,register_user_pref2 as rup2 where ru.userid=rp.userid and rp.userid=iu.userid and rup1.userid=? and rup1.mstatus=? and rup1.mtongue=? and rup2.religion=? and rup2.state=? and rup2.occupation=?";
		
		
		try {
			ps=conn.prepareStatement(query2);
			ps.setString(1,pf.getpUserId());
			ps.setString(2,pf.getpMstatus());
			ps.setString(3,pf.getpMtongue());
			ps.setString(4,pf.getpReligion());
			ps.setString(5,pf.getpState());
			ps.setString(6,pf.getpOccupation());
			rs=ps.executeQuery(query2);
			while(rs.next()){
				SearchForm s1=new SearchForm();
				s1.setBn_userid(rs.getString(1));
				s1.setBn_name(rs.getString(2));
				s1.setBn_gender(rs.getString(3));
				s1.setBn_age(rs.getInt(4));
				s1.setBn_height(rs.getDouble(5));
				s1.setBn_language(rs.getString(6));
				s1.setBn_education(rs.getString(7));
				s1.setBn_religion(rs.getString(8));
				s1.setBn_occupation(rs.getString(9));
				s1.setBn_mstatus(rs.getString(11));
				if(s1.getBn_religion().matches(pf.getpReligion())){
					s1.setCount("20");
					if(s1.getBn_occupation().matches(pf.getpOccupation())){
						s1.setCount("40");
						if(s1.getBn_mstatus().matches(pf.getpMstatus())){
							s1.setCount("60");
							if(s1.getBn_language().matches(pf.getpMtongue())){
								s1.setCount("80");
							}
						}
					}
				}
				b1=(Blob) rs.getBlob(10);
				InputStream x=b1.getBinaryStream();
				int size=x.available();
				String fname="ProfileImages\\"+s1.getBn_userid()+".jpeg";
				OutputStream out1=new FileOutputStream(fname);
				byte b[]= new byte[size];
				x.read(b);
				out1.write(b);
				s1.setProfPhoto(fname);
				ar.add(s1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			if(ps!=null){
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		}
		return ar;
	}
public ArrayList<SearchForm > retrieveMtongue() throws SQLException {
		
		Connection conn=getConnection();
		
		ArrayList<SearchForm > al=new ArrayList<SearchForm >();
		if(conn!=null)
		{
		try{
			String query="select mtongue from matrimony_mtongue";
			ps=conn.prepareStatement(query);
			rs=ps.executeQuery();
			while(rs.next()){
				
				SearchForm r1=new SearchForm();
				r1.setBn_language(rs.getString(1));
				al.add(r1);
			}
			
		// TODO Auto-generated method stub
		return al;
	}	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	finally
	{
		if(ps!=null)
		ps.close();
		if(conn!=null)
			conn.close();
	}}
	return null;
	}
	

	public ArrayList<SearchForm> retrieveReligion() throws SQLException {
	Connection con=getConnection();

	ArrayList<SearchForm > al=new ArrayList<SearchForm >();
	if(con!=null)
	{
	try{
		String query="select religion from matrimony_religion";
		ps=con.prepareStatement(query);
		rs=ps.executeQuery();
		while(rs.next()){
			SearchForm r1=new SearchForm();
		r1.setBn_religion(rs.getString(1));
		al.add(r1);
		}
		
	// TODO Auto-generated method stub
	return al;
	}	catch(Exception e)
	{
	e.printStackTrace();
	}

	finally
	{
	if(ps!=null)
	ps.close();
	if(con!=null)
		con.close();
	}
	}
	return null;
	}

	

	/*
	 * Retrive password for verification before change password
	 */
	 
	 public String getPwdVer1(LoginForm f) throws SQLException{
			Connection con=getConnection();
			String s=null;
			System.out.println( f.getUser_id());
			if(con!=null){
			
			System.out.println("in service");
	
		
			try {
				String query1="select newpwd from login_user where userid=?";
				ps=con.prepareStatement(query1);
				ps.setString(1, f.getUser_id());
				rs=ps.executeQuery();
				while(rs.next()){
					LoginForm f1=new LoginForm();
					f1.setNewpwd(rs.getString(1));
					s=f1.getNewpwd();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally
			{
				if(ps!=null){
					try {
						ps.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				if(con!=null){
					
					try {
						con.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			}
			
			return s;
			
		}
	 
	 /*
	  * getting oldpassword
	  */
	 public String getPwdVer2(LoginForm f) throws SQLException{
			
			String query1="select oldpwd from login_user where userid=?";
			Connection conn=getConnection();
			ArrayList<LoginForm> ar=new ArrayList<LoginForm>();
			String s=null;
			try {
				ps=conn.prepareStatement(query1);
				ps.setString(1, f.getUser_id());
				rs=ps.executeQuery();
				while(rs.next()){
					LoginForm f1=new LoginForm();
					f1.setNewpwd(rs.getString(1));
					s=f1.getNewpwd();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally
			{
				if(ps!=null){
					try {
						ps.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				if(conn!=null){
					
					try {
						conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
			return s;
			
		}
	 /*
	  * Updating Password in DataBase
	  */
	 
	 public int updatePwd(LoginForm f) throws SQLException{
			
			String query1="update login_user set oldpwd=?,newpwd=? where userid=?";
			Connection conn=getConnection();
		
			int a=0;
			
			try {
				ps=conn.prepareStatement(query1);
				ps.setString(1, f.getPassword());
				ps.setString(2, f.getNewpwd());
				ps.setString(3, f.getUser_id());
				a=ps.executeUpdate();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally
			{
				if(ps!=null){
					try {
						ps.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				if(conn!=null){
					
					try {
						conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
			return a;
			
		}
	 
	 /*
		 * Getting login details for verification
		 */
		public ArrayList<LoginForm> getLoginDetails(LoginForm f) throws SQLException{
			
			String query1="select userid , newpwd from login_user where userid='"+f.getUser_id()+"'";
			Connection conn=getConnection();
			ArrayList<LoginForm> ar=new ArrayList<LoginForm>();
			try {
				ps=conn.prepareStatement(query1);
				rs=ps.executeQuery(query1);
				while(rs.next()){
					f.setUser_id(rs.getString(1));
					f.setPassword(rs.getString(2));
					ar.add(f);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally
			{
				if(ps!=null){
					try {
						ps.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				if(conn!=null){
					
					try {
						conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
			return ar;
			
		}

	
		public ArrayList<LoginForm> forgotPassword(LoginForm lForm) throws SQLException{

			Connection conn=getConnection();
			ArrayList<LoginForm> ar=new ArrayList<LoginForm>();
			if(conn!=null){
			try{
			String query="select security_Q,security_A,newpwd from login_user where userid=?";
					ps=conn.prepareStatement(query);
						ps.setString(1, lForm.getUser_id());
			rs=ps.executeQuery();
							while(rs.next()){
								lForm.setSecurity_Q(rs.getString(1));
								lForm.setcSecurity_A(rs.getString(2));
								lForm.setPassword(rs.getString(3));
								
								
								ar.add(lForm);
								}
							return ar;
			}catch(Exception e)
					{
						e.printStackTrace();
					}
			finally
					{
						if(ps!=null)
						ps.close();
						if(conn!=null)
							conn.close();
					}
					
			}

			return null;
			}

		
		
		public boolean resetSecurity(LoginForm lForm) throws SQLException {
			// TODO Auto-generated method stub
			Connection conn=getConnection();
			lForm.setUser_id("ran13233");
			if(conn!=null){
			try{
			String query="update login_user set security_q=?,security_A=? where userid=?";
					ps=conn.prepareStatement(query);
						ps.setString(2, lForm.getSecurity_A());
						ps.setString(1, lForm.getSecurity_Q());
						ps.setString(3, lForm.getUser_id());
						ps.executeUpdate();
						return true;	
			}catch(Exception e)
					{
						e.printStackTrace();
					}
			finally
					{
						if(ps!=null)
						ps.close();
						if(conn!=null)
							conn.close();
					}
					
			}

			
			
			return false;
		}

		public boolean resetPassword(LoginForm lForm) throws SQLException {
			Connection conn=getConnection();
			if(conn!=null){
			try{
			String query="update login_user set newpwd=?,oldpwd=? where userid=?";
					ps=conn.prepareStatement(query);
						ps.setString(1, lForm.getNewpwd());
						ps.setString(2, lForm.getPassword());
						ps.setString(3, lForm.getUser_id());
						ps.executeUpdate();
						return true;	
			}catch(Exception e)
					{
						e.printStackTrace();
					}
			finally
					{
						if(ps!=null)
						ps.close();
						if(conn!=null)
							conn.close();
					}
					
			}

			return false;
	
		}

		public ArrayList<RegisterForm> retrieveAlbum(RegisterForm rForm) throws SQLException, IOException {
			// TODO Auto-generated method stub
			ArrayList<RegisterForm> list=new ArrayList<RegisterForm>();
			Connection con=getConnection();
			 rForm.setBean_userId("ran13233");
			 int k=0;
		
			Blob b1=null;
			String query="select album from image_album where userid=?";
			ps=(PreparedStatement) con.prepareStatement(query);
			ps.setString(1,rForm.getBean_userId());
			rs=ps.executeQuery();
			
			
			while(rs.next())
			{
					
					b1=(Blob) rs.getBlob(1);
					InputStream x=b1.getBinaryStream();
					int size=x.available();
					String fname="D:\\676536\\MatrimonyIntegrated\\WebContent\\ProfileImages\\"+rForm.getBean_userId()+k+".jpeg";
					OutputStream out1=new FileOutputStream(fname);
					byte b[]= new byte[size];
					x.read(b);
					out1.write(b);
					RegisterForm pf=new RegisterForm();
					pf.setProfPhoto(fname);

						list.add(pf);
						k++;
					
			}
		
			return list;
			
			
			
		}


	
}
	
	

