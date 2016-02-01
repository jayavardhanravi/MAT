<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="cache-control" content="max-age=0" />
<meta http-equiv="cache-control" content="no-cache" />
<meta http-equiv="expires" content="0" />
<meta http-equiv="pragma" content="no-cache" />
<title></title>
<fmt:setLocale value=""/>
<fmt:setBundle basename="com.tcs.matrimony.resources.ApplicationResources"/>

</head>
<body>

<div id="top123"><a href="#panelwrap"> &nbsp;&nbsp;Go to Top</a></div>
<div id="panelwrap">
  	
	<div class="header">
    <div class="title"><a href="#">SHAADI MUBHARAK<br/>Amazing Wedlocks...</a></div>
    <div class="header_right">
		<a href="#" class="home">Home</a> 
		<a href="#" class="sitemap">Sitemap</a>
		<a href="#" class="contactus">Contact Us</a>
		<br/><br/>
		Welcome User,
		<a href="#" class="myaccount">My Profile</a> 
		<a href="settings.html" class="settings">Settings</a>
		<a href="#" class="logout">Logout</a>
		

	</div>
    
        <div class="menu">
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
    </div>
     
    <div class="submenu">
    <ul>
    <li></li>
    </ul>
    </div>
    </div>
             
                    
    <div class="center_content">      
    <div id="right_wrap">
    <div id="right_content">  
        <div class="toogle_wrap2">
            <div class="trigger">Welcome User...(Please update all your details for better matches.)</div>                       
        </div>
          <br/>
 
        <div class="toogle_wrap">
            <div class="trigger"><a name="basicdetails"><fmt:message key="profile.label.basic"></fmt:message></a>&nbsp;&nbsp;&nbsp;&nbsp;<span id="edit1"><html:link page="/update.do?action=editBasicDetails">[Edit]</html:link></span></div>

            <div class="toggle_container">
			<hr color="#FFFFFF"/>
        		<table id="aboutme" border="0">
                	<tr>
                    	<td ><img  src="pages/images/facebookprofilepic.jpg" id="prof_img"/></td>
                        <td  width="20px"></td>
                        <td valign="top">
                        	<table width="100%" border="0" height="200px">
                            	<tr>
                                	<td width="150px"><fmt:message key="profile.label.bfor"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_searchFor" name="RegisterForm3"></bean:write></td>
                                    <td width="25px"></td>
                                    <td width="150px"><fmt:message key="profile.label.bheight"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_height" name="RegisterForm3"></bean:write></td>
                                </tr>
                                <tr>
                                	<td width="150px"><fmt:message key="profile.label.bfname"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_fname" name="RegisterForm3"></bean:write></td>
                                    <td width="25px"></td>
                                    <td width="150px"><fmt:message key="profile.label.blname"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_lname" name="RegisterForm3"></bean:write></td>
                                </tr>
                                <tr>
                                	<td width="150px"><fmt:message key="profile.label.bage"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_age" name="RegisterForm3"></bean:write></td>
                                    <td width="25px"></td>
                                    <td width="150px"><fmt:message key="profile.label.bms"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_mStatus" name="RegisterForm3"></bean:write></td>
                                </tr>
                                <tr>
                                	<td width="150px"><fmt:message key="profile.label.bcomp"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_complexion" name="RegisterForm3"></bean:write></td>
                                    <td width="25px"></td>
                                    <td width="150px"><fmt:message key="profile.label.bmt"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_mTongue" name="RegisterForm3"></bean:write></td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                </table>
			
            </div>
                       
        </div>
         <br/>
        <div class="toogle_wrap">
            <div class="trigger"><a name="about"><fmt:message key="profile.label.iam"></fmt:message></a>&nbsp;&nbsp;&nbsp;&nbsp;<span id="edit1"><html:link page="/update.do?action=editaboutme">[Edit]</html:link></span></div>

            <div class="toggle_container">
		<hr color="#FFFFFF"/>
      <table>
       <tr>
       
                                	<td width="150px"><fmt:message key="profile.label.iam"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_aboutMe" name="RegisterForm3"></bean:write></td></tr>
      </table>
		
            </div>
                       
        </div>
        <br/>
        <div class="toogle_wrap">
            <div class="trigger"><a name="interests"><fmt:message key="profile.label.interests"></fmt:message></a>&nbsp;&nbsp;&nbsp;&nbsp;<span id="edit1"><html:link page="/update.do?action=editinterests">[Edit]</html:link></span></div>

            <div class="toggle_container">
		<hr color="#FFFFFF"/>
      <table>
       <tr>
       
                                	<td width="150px"><fmt:message key="profile.label.interests"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_interests" name="RegisterForm3"></bean:write></td></tr>
      </table>
		
            </div>
                       
        </div>
      	<br/>
        <div class="toogle_wrap">
            <div class="trigger"><a name="hobbies"><fmt:message key="profile.label.hobbies"></fmt:message></a>&nbsp;&nbsp;&nbsp;&nbsp;<span id="edit1"><html:link page="/update.do?action=edithobbies">[Edit]</html:link></span></div>

            <div class="toggle_container">
		<hr color="#FFFFFF"/>
      <table>
       <tr>
       
                                	<td width="150px"><fmt:message key="profile.label.hobbies"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_hobbies" name="RegisterForm3"></bean:write></td></tr>
      </table>
		
            </div>
                       
        </div>
        



        <br/>
        <div class="toogle_wrap">
            <div class="trigger"><a name="relinfo"><fmt:message key="profile.label.religion"></fmt:message></a>&nbsp;&nbsp;&nbsp;&nbsp;<span id="edit1"><html:link page="/update.do?action=editReligiousDetails">[Edit]</html:link></span></div>

            <div class="toggle_container">
		<hr color="#FFFFFF"/>
        		<table id="aboutme" border="0">
                	<tr>
                        <td  width="25px"></td>
                        <td valign="top">
                        	<table width="100%" border="0" height="200px">
                            	<tr>
                                	<td width="150px"><fmt:message key="profile.label.religion"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_religion" name="RegisterForm3"></bean:write></td>
                                    <td width="25px"></td>
                                </tr>
                                <tr>
                                	<td><fmt:message key="profile.label.rcaste"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_caste" name="RegisterForm3"></bean:write></td>
                                    <td></td>
                                </tr>
                                <tr>
                                	<td><fmt:message key="profile.label.rgothram"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_gothram" name="RegisterForm3"></bean:write></td>
                                    <td></td>
                                </tr>
                                <tr>
                                	<td><fmt:message key="profile.label.rstar"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_star" name="RegisterForm3"></bean:write></td>
                                    <td></td>
                                </tr>
                                 <tr>
                                	<td><fmt:message key="profile.label.rmanglik"></fmt:message></td>
                                    <td>:</td>
                                    <td id="tab_ans"><bean:write property="bean_manglik" name="RegisterForm3"></bean:write></td>
                                    <td></td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                </table>
		
            </div>
            
                       
        </div>
        <br/>
        <div class="toogle_wrap">
            <div class="trigger"><a name=location"><fmt:message key="profile.label.location"></fmt:message></a>&nbsp;&nbsp;&nbsp;&nbsp;<span id="edit1"><html:link page="/update.do?action=editlocationdetails">[Edit]</html:link></span></div>

            <div class="toggle_container">
			<hr color="#FFFFFF"/>
        		<table id="aboutme" border="0">
                	<tr>
                        <td  width="25px"></td>
                        <td valign="top">
                        	<table width="100%" border="0" height="200px">
                            	<tr>
                                	<td width="150px"><fmt:message key="profile.label.lhouseno"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_houseno" name="RegisterForm3"></bean:write></td>
                                    <td width="25px"></td>
                                </tr>
                                <tr>
                                	<td><fmt:message key="profile.label.lcity"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_city" name="RegisterForm3"></bean:write></td>
                                    <td></td>
                                </tr>
                                <tr>
                                	<td><fmt:message key="profile.label.lstate"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_state" name="RegisterForm3"></bean:write></td>
                                    <td></td>
                                </tr>
                                <tr>
                                	<td><fmt:message key="profile.label.lcountry"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_country" name="RegisterForm3"></bean:write></td>
                                    <td></td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                </table>
		
            </div>
                       
        </div>

        <br/>
        <div class="toogle_wrap">
            <div class="trigger"><a name="profinfo"><fmt:message key="profile.label.e&p"></fmt:message></a>&nbsp;&nbsp;&nbsp;&nbsp;<span id="edit1"><html:link page="/update.do?action=editprofessionaldetails">[Edit]</html:link></span></div>

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
                                    <td id="tab_ans"><bean:write property="bean_education" name="RegisterForm3"></bean:write></td>
                                    <td width="100px"></td>
                                </tr>
                                <tr>
                                	<td><fmt:message key="profile.label.e&pocc"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_occupation" name="RegisterForm3"></bean:write></td>
                                    <td></td>
                                </tr>
                                <tr>
                                	<td><fmt:message key="profile.label.e&pin"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_emp_in" name="RegisterForm3"></bean:write></td>
                                    <td></td>
                                </tr>
                                <tr>
                                	<td><fmt:message key="profile.label.e&pann"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_annual" name="RegisterForm3"></bean:write></td>
                                    <td>(in Lakhs)</td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                </table>
			
            </div>
                       
        </div>

        <br/>
       <div class="toogle_wrap">
            <div class="trigger"><a name="fdetails"><fmt:message key="profile.label.fd"></fmt:message></a>&nbsp;&nbsp;&nbsp;&nbsp;<span id="edit1"><html:link page="/update.do?action=editfamilydetails">[Edit]</html:link></span></div>

            <div class="toggle_container">
			<hr color="#FFFFFF"/>
        		<table id="aboutme" border="0">
                	<tr>
                    	<td ><img  src="images/facebookprofilepic.jpg" id="prof_img"/></td>
                        <td  width="25px"></td>
                        <td valign="top">
                        	<table width="100%" border="0" height="200px">
                            	<tr>
                                	<td width="150px"><fmt:message key="profile.label.fdvalue"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_fvalue" name="RegisterForm3"></bean:write></td>
                                    <td width="25px"></td>
                                    <td width="150px"><fmt:message key="profile.label.fdfocc"></fmt:message>e</td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_focc" name="RegisterForm3"></bean:write></td>
                                </tr>
                                <tr>
                                	<td width="150px"><fmt:message key="profile.label.fdtype"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_type" name="RegisterForm3"></bean:write></td>
                                    <td width="25px"></td>
                                    <td width="150px"><fmt:message key="profile.label.fdmocc"></fmt:message>e</td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_mocc" name="RegisterForm3"></bean:write></td>
                                </tr>
                                <tr>
                                	<td width="150px"><fmt:message key="profile.label.fdstatus"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_fstatus" name="RegisterForm3"></bean:write></td>
                                    <td width="25px"></td>
                                    <td width="150px"><fmt:message key="profile.label.fdbro"></fmt:message>e</td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_fbro" name="RegisterForm3"></bean:write></td>
                                </tr>
                                <tr>
                                	<td width="150px"><fmt:message key="profile.label.fdsis"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_fsis" name="RegisterForm3"></bean:write></td>
                                    <td width="25px"></td>
                                   
                                </tr>
                            </table>
                        </td>
                    </tr>
                </table>
			
            </div>
                       
        </div>
        <div>

</div>
         <br/>
        <div class="toogle_wrap">
            <div class="trigger"><a name="cdetails"><fmt:message key="profile.label.contact"></fmt:message></a>&nbsp;&nbsp;&nbsp;&nbsp;<span id="edit1"><html:link page="/update.do?action=editcontactdetails">[Edit]</html:link></span></div>

            <div class="toggle_container">
			<hr color="#FFFFFF"/>
        		<table id="aboutme" border="0">
                	<tr>
                        <td  width="25px"></td>
                        <td valign="top">
                        	<table width="100%" border="0" height="200px">
                            	<tr>
                                	<td width="150px"><fmt:message key="profile.label.monum"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_mobileNo" name="RegisterForm3"></bean:write></td>
                                    <td width="100px"></td>
                                </tr>
                                <tr>
                                	<td><fmt:message key="profile.label.phnum"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_phoneNo" name="RegisterForm3"></bean:write></td>
                                    <td></td>
                                </tr>
                                <tr>
                                	<td><fmt:message key="profile.label.email"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_emailId" name="RegisterForm3"></bean:write></td>
                                    <td></td>
                                </tr>
                    
                            </table>
                        </td>
                    </tr>
                </table>
			
            </div>
                       
        </div>

        <br/>
 
        <div class="toogle_wrap">
            <div class="trigger"><a name="par_basicdetails"><fmt:message key="profile.label.pprefbasic"></fmt:message><fmt:message key="profile.label.ppref"></fmt:message></a>&nbsp;&nbsp;&nbsp;&nbsp;<span id="edit1"><html:link page="/update.do?action=editpartnersbasicdetails">[Edit]</html:link></span></div>

            <div class="toggle_container">
			<hr color="#FFFFFF"/>
        		<table id="aboutme" border="0">
                	<tr>
                        <td  width="25px"></td>
                        <td valign="top">
                        	<table width="100%" border="0" height="200px">
                            	<tr>
                                	<td width="150px"><fmt:message key="profile.label.page"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_page" name="RegisterForm3"></bean:write></td>
                                    <td width="25px"></td>
                                </tr>
                                <tr>
                                	<td><fmt:message key="profile.label.pheight"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_pheight" name="RegisterForm3"></bean:write></td>
                                    <td></td>
                                </tr>
                                <tr>
                                	<td><fmt:message key="profile.label.pmstatus"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_pmStatus" name="RegisterForm3"></bean:write></td>
                                    <td></td>
                                </tr>
                                <tr>
                                	<td><fmt:message key="profile.label.pehabits"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_e_habbits" name="RegisterForm3"></bean:write></td>
                                    <td></td>
                                </tr>
                                 <tr>
                                	<td><fmt:message key="profile.label.pmt"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_pmTongue" name="RegisterForm3"></bean:write></td>
                                    <td></td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                </table>
		
            </div>
                       
        </div>
        <br/>
   

        <div class="toogle_wrap">
            <div class="trigger"><a name="par_relinfo"><fmt:message key="profile.label.pprefreligion"></fmt:message><fmt:message key="profile.label.ppref"></fmt:message></a>&nbsp;&nbsp;&nbsp;&nbsp;<span id="edit1"><html:link page="/update.do?action=editpartnersreligionsdetails">[Edit]</html:link></span></div>

            <div class="toggle_container">
			<hr color="#FFFFFF"/>
        		<table id="aboutme" border="0">
                	<tr>
                        <td  width="25px"></td>
                        <td valign="top">
                        	<table width="100%" border="0" height="200px">
                            	<tr>
                                	<td width="150px"><fmt:message key="profile.label.preligion"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_preligion" name="RegisterForm3"></bean:write></td>
                                    <td width="25px"></td>
                                </tr>
                                <tr>
                                	<td><fmt:message key="profile.label.pcaste"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_pcaste" name="RegisterForm3"></bean:write></td>
                                    <td></td>
                                </tr>
                                <tr>
                                	<td><fmt:message key="profile.label.rstar"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_pstar" name="RegisterForm3"></bean:write></td>
                                    <td></td>
                                </tr>
                                <tr>
                                	<td><fmt:message key="profile.label.pmanglik"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_pmanglik" name="RegisterForm3"></bean:write></td>
                                    <td></td>
                                </tr>
                                 <tr>
                                	<td><fmt:message key="profile.label.pmt"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_pmTongue" name="RegisterForm3"></bean:write></td>
                                    <td></td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                </table>
		
            </div>
                       
        </div>
        <br/>
  
        <div class="toogle_wrap">
            <div class="trigger"><a name="par_location"><fmt:message key="profile.label.pprefloc"></fmt:message><fmt:message key="profile.label.ppref"></fmt:message></a>&nbsp;&nbsp;&nbsp;&nbsp;<span id="edit1"><html:link page="/update.do?action=editpartnerslocationdetails">[Edit]</html:link></span></div>

            <div class="toggle_container">
			<hr color="#FFFFFF"/>
        		<table id="aboutme" border="0">
                	<tr>
                        <td  width="25px"></td>
                        <td valign="top">
                        	<table width="100%" border="0" height="200px">
                            	<tr>
                                	<td width="150px"><fmt:message key="profile.label.pplace"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_pcity" name="RegisterForm3"></bean:write></td>
                                    <td width="25px"></td>
                                </tr>
                                <tr>
                                	<td><fmt:message key="profile.label.pstate"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_pstate" name="RegisterForm3"></bean:write></td>
                                    <td></td>
                                </tr>
                                <tr>
                                	<td><fmt:message key="profile.label.pcountry"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_pcountry" name="RegisterForm3"></bean:write></td>
                                    <td></td>
                                </tr>
                               
                            </table>
                        </td>
                    </tr>
                </table>
		
            </div>
                       
        </div>
        <br/>
       
        <div class="toogle_wrap">
            <div class="trigger"><a name="par_profinfo"><fmt:message key="profile.label.pprefpro"></fmt:message><fmt:message key="profile.label.ppref"></fmt:message></a>&nbsp;&nbsp;&nbsp;&nbsp;<span id="edit1"><html:link page="/update.do?action=editpartnersprofessionaldetails">[Edit]</html:link></span></div>

            <div class="toggle_container">
			<hr color="#FFFFFF"/>
        		<table id="aboutme" border="0">
                	<tr>
                        <td  width="25px"></td>
                        <td valign="top">
                        	<table width="100%" border="0" height="200px">
                            	<tr>
                                	<td width="150px"><fmt:message key="profile.label.pocc"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_pocc" name="RegisterForm3"></bean:write></td>
                                    <td width="25px"></td>
                                </tr>
                                <tr>
                                	<td><fmt:message key="profile.label.ped"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_peducation" name="RegisterForm3"></bean:write></td>
                                    <td></td>
                                </tr>
                                <tr>
                                	<td><fmt:message key="profile.label.pannual"></fmt:message></td>
                                    <td><fmt:message key="common.label.colon"></fmt:message></td>
                                    <td id="tab_ans"><bean:write property="bean_pannualsal" name="RegisterForm3"></bean:write></td>
                                    <td></td>
                                </tr>
                               
                            </table>
                        </td>
                    </tr>
                </table>
		
            </div>
                       
        </div>
        
     </div>
     </div><!-- end of right content-->
                     
                    
    <div class="sidebar" id="sidebar">
    <h2>My Details</h2>
    
        <ul>
            <li><a href="#basicdetails" class="selected" >Basic Details</a></li>
            <li><a href="#about">About Me</a></li>
            <li><a href="#relinfo">Religious Information</a></li>
            <li><a href="#location">Location</a></li>
            <li><a href="#profinfo">Professional Information</a></li>
            <li><a href="#fdetails">Family Details</a></li>
            <li><a href="#hobbies">My Hobbies</a></li>
            <li><a href="#interests">My Interests</a></li>
            <li><a href="#cdetails">Contact Details</a></li>
        </ul>
        
    <h2>Partner Preference</h2>
    
        <ul>
            <li><a href="#par_basicdetails">Basic Details</a></li>
            <li><a href="#par_relinfo">Religious Information</a></li>
            <li><a href="#par_location">Location</a></li>
            <li><a href="#par_profinfo">Professional Information</a></li>
        </ul> 
        
    
    </div>             
    
    
    <div class="clear"></div>
    </div> <!--end of center_content-->
    
    <div class="footer">
		<center>&copy;CopyRight@Team-SAP(Simply Amazing Performers)</center>
	</div>

</div>

        
</body>
</html>