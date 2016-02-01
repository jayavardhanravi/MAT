<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@ page errorPage="error.jsp" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
    <%@ taglib prefix="html" uri="/WEB-INF/struts-html.tld" %>
    <%@ taglib prefix="bean" uri="/WEB-INF/struts-bean.tld" %>
    <%@ taglib prefix="logic" uri="/WEB-INF/struts-logic.tld" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<fmt:setLocale value="en_US"/>
<fmt:setBundle basename="com.tcs.matrimony.resources.ApplicationResources"/>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="cache-control" content="max-age=0" />
<meta http-equiv="cache-control" content="no-cache" />
<meta http-equiv="expires" content="0" />
<meta http-equiv="pragma" content="no-cache" />

<title>Shaadi Mubaarakh</title>
<link href="css/style.css" media="screen" rel="stylesheet"/>
<!--[if IE 7]>
<link rel="stylesheet" type="text/css" href="style.ie7.css" />		
<![endif]-->
</head>
<body>
	<div id="wrapper">
<!-- banner -->
		<div id="banner">
		 <div class="header_right">
		<a href="newprofile.jsp" class="home">Home</a> 
		<a href="/pages/" class="sitemap">Sitemap</a>
		<a href="/pages/contactus.jsp" class="contactus">Contact Us</a>
		<br/><br/>
		Welcome User,
		<a href="#" class="myaccount">My Profile</a> 
		<a href="settings.jsp" class="settings">Settings</a>
		<a href="" class="logout">Logout</a>
		

	</div>
	
				<div id="logo"><img  alt="" src="pages/images/logo.png"/></div>
				<div></div>
     <div class="menu1">
    <ul>
    <li><a href="index.html" class="selected">Home</a></li>
    <li><a href="myalbum.html">My Album</a></li>
    <li><a href="search.html">Find Matches</a></li>
	<li><a href="mynetwork.html">My Network</a></li>
    <li><a href="services.html">Matrimony Services</a></li>
	<li><a href="story.html">Success Stories</a></li>
    <li><a href="upgrade.html">Upgrade</a></li>
    <li><a href="help.html">Help</a></li>
    </ul>
<div style="clear:both"></div>
    </div>
			
			
			
			

		</div>
		
<!-- content -->
<div id="content"><div class="inner_copy"></div>  
                    
    <div class="center_content">      
    <div id="right_wrap">
    <div id="right_content">  
        <div class="toogle_wrap2">
            <div class="trigger">Update your details here.</div>                       
        </div>
          <br/>
        <div class="toogle_wrap">
            <div class="trigger"><a name="profinfo"><fmt:message key="profile.label.e&p"></fmt:message></a></div>

            <div class="toggle_container">
			<hr color="#FFFFFF"/>
        		<table id="aboutme" border="0">
                	<tr>
                        <td  width="25px"></td>
                        <td valign="top">
                        	<table width="100%" border="0" height="200px">
                            	<tr>
                                	<td width="150px"><fmt:message key="profile.label.e&pcategory"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans">
                                    	<html:select property="bean_education" name="RegisterForm4"><html:option value="B.Tech/B.E">B.Tech/B.E</html:option>
			<html:option value="M.Tech/M.E">M.Tech/M.E</html:option>
			<html:option value="B.Sc/B.Com/B.A">B.Sc/B.Com/B.A</html:option>
			<html:option value="MBBS">MBBS</html:option>
			<html:option value="Inter">Inter</html:option>
			<html:option value="SSC">SSC</html:option>
			<html:option value="Others">Others</html:option>
		</html:select>
                                    </td>
                                    <td width="100px"></td>
                                </tr>
                                <tr>
                                	<td><fmt:message key="profile.label.e&pocc"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans">
                                    <html:select property="bean_occupation" name="RegisterForm4"><html:option value="Engineer">Engineer</html:option>
			<html:option value="Doctor">Doctor</html:option>
			<html:option value="Lawyer">Lawyer</html:option>
			<html:option value="Scientist">Scientist</html:option>
			<html:option value="Business">Business</html:option>
			<html:option value="Others">Others</html:option>
		</html:select>
                                    </td>
                                    <td></td>
                                </tr>
                                <tr>
                                	<td><fmt:message key="profile.label.e&pin"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><html:text property="bean_emp_in" name="RegisterForm4"></html:text></td>
                                      <td width="200px"><html:errors property="bean_emp_in"/></td>
                                </tr>
                                <tr>
                                	<td><fmt:message key="profile.label.e&pann"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><html:text property="bean_annual" name="RegisterForm4"></html:text></td>
                                     <td width="200px">(in Lakhs)<html:errors property="bean_annual"/></td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                     <tr>
	<td colspan="3"  align="right">
	<html:submit property="action" value="updateprofessionaldetails"></html:submit>
	</td>
	</tr>
                </table>
			
            </div>
                       
        </div>
       
        
         
     </div>
     </div><!-- end of right content-->
                     
   <div  class="side-content" id="side-content">
    <h2>Update My Details</h2>
    
        <ul>
            <li><a href="basic.jsp" class="selected" >Basic Details</a></li>
            <li><a href="aboutme.jsp">About Me</a></li>
            <li><a href="religion.jsp">Religious Information</a></li>
            <li><a href="location.jsp">Location</a></li>
            <li><a href="prof.jsp">Professional Information</a></li>
            <li><a href="family.jsp">Family Details</a></li>
            <li><a href="hobbies.jsp">My Hobbies</a></li>
            <li><a href="interests.jsp">My Interests</a></li>
            <li><a href="contact.jsp">Contact Details</a></li>
        </ul>
        
    <h2>Update Partner Preference</h2>
    
        <ul>
            <li><a href="pbasic.jsp">Basic Details</a></li>
            <li><a href="preligion.jsp">Religious Information</a></li>
            <li><a href="plocation.jsp">Location</a></li>
            <li><a href="pprof.jsp">Professional Information</a></li>
        </ul> 
    
    </div>             

		
			<div style="clear:both"></div>	
			   </div>		

<!-- footer -->
				<div id="footer">
					<div class="fleft"><p>Copyright statement.</p></div>
					<div class="fright"></div>
					<div class="fcenter">
					<p>&copy;CopyRight@Team-SAP(Simply Amazing Performers)</p>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>

