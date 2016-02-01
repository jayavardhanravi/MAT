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
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="cache-control" content="max-age=0" />
<meta http-equiv="cache-control" content="no-cache" />
<meta http-equiv="expires" content="0" />
<meta http-equiv="pragma" content="no-cache" />

<fmt:setLocale value=""/>
<fmt:setBundle basename="com.tcs.matrimony.resources.ApplicationResources"/>
<title>    <fmt:message key="register.title"></fmt:message></title>
</head>
<body>
<center>
<h1><fmt:message key="register.label.matrimonyreg"></fmt:message></h1>
<html:form action="/register">
<html:hidden property="action" value="Register"></html:hidden>
<table  id="step1">
<tr><td align="left"><fmt:message key="register.label.searchFor"></fmt:message></td>
<td><html:select property="bean_searchFor">
  <html:option value="Myself"><fmt:message key="register.label.myself"></fmt:message></html:option>
                <html:option value="Son"><fmt:message key="register.label.son"></fmt:message></html:option>
                <html:option value="Daugther"><fmt:message key="register.label.daughter"></fmt:message></html:option>
                <html:option value="Relative"><fmt:message key="register.label.relative"></fmt:message></html:option>
                <html:option value="Friend"><fmt:message key="register.label.friend"></fmt:message></html:option>
                <html:option value="Brother"><fmt:message key="register.label.brother"></fmt:message></html:option>
                <html:option value="Sister"><fmt:message key="register.label.sister"></fmt:message></html:option>
                <html:option value="Others"><fmt:message key="register.label.others"></fmt:message></html:option>
            
                </html:select></td></tr>
                <tr><td align="left"><fmt:message key="register.label.security_Q"></fmt:message></td>
<td><html:select property="bean_security_Q">
  <html:option value="What is your School Name?"><fmt:message key="register.label.q1"></fmt:message></html:option>
                <html:option value="What is your PetName?"><fmt:message key="register.label.q2"></fmt:message></html:option>
                <html:option value="What is your mothers maiden  Name?"><fmt:message key="register.label.q3"></fmt:message></html:option>
                <html:option value="What is your favorite cricketer's Name?"><fmt:message key="register.label.q4"></fmt:message></html:option>
                <html:option value="What is your favorite color?"><fmt:message key="register.label.q5"></fmt:message></html:option>
               
            
                </html:select></td></tr>
                <tr><td align="left"><fmt:message key="register.label.security_A"></fmt:message></td>
<td><html:text property="bean_security_A"></html:text></td><td><html:errors property="bean_security_A"></html:errors></td></tr>

<tr><td align="left"><fmt:message key="register.label.fname"></fmt:message></td>
<td><html:text property="bean_fname"></html:text></td><td><html:errors property="bean_fname"></html:errors></td></tr>

<tr><td align="left"><fmt:message key="register.label.lname"></fmt:message></td>
<td><html:text property="bean_lname"></html:text></td><td><html:errors property="bean_lname"></html:errors></td></tr>

<tr><td align="left"><fmt:message key="register.label.age"></fmt:message></td>
<td><html:text property="bean_age" value=""></html:text></td><td><html:errors property="bean_age"></html:errors></td></tr>

<tr><td align="left"><fmt:message key="register.label.dob"></fmt:message></td>
<td><html:text property="bean_dob" styleId="dob"></html:text></td></tr>

<tr><td align="left"><fmt:message key="register.label.gender"></fmt:message></td>
<td><html:radio value="male " property="bean_gender"></html:radio><fmt:message key="register.label.male"></fmt:message>
<html:radio value="Female " property="bean_gender"></html:radio><fmt:message key="register.label.Female"></fmt:message></td></tr>
                



<tr><td align="left"><fmt:message key="register.label.religion"></fmt:message></td>
<td><html:select property="bean_religion">
<logic:iterate id="obj1" property="bean_religional" name="RegisterForm1">
<c:set var="religion" value="${obj1.bean_religion }"></c:set>
 <html:option value="${religion}">${religion}</html:option>
</logic:iterate></html:select></td></tr>

<tr><td align="left"><fmt:message key="register.label.mtongue"></fmt:message></td>
<td><html:select property="bean_mTongue">
<logic:iterate id="obj1" property="bean_mTongueal" name="RegisterForm1">
<c:set var="mt" value="${obj1.bean_mTongue}"></c:set>
 <html:option value="${mt}">${mt}</html:option>
</logic:iterate></html:select></td></tr>

<tr><td align="left"><fmt:message key="profile.label.lhouseno"></fmt:message></td>
<td><html:text property="bean_houseno"></html:text></td><td><html:errors property="bean_houseno"></html:errors></td></tr>

<tr><td align="left"><fmt:message key="register.label.country"></fmt:message></td>
<td><html:select property="bean_country">
<logic:iterate id="obj1" property="bean_countryal" name="RegisterForm1">
<c:set var="country" value="${obj1.bean_country }"></c:set>
 <html:option value="${country}">${country}</html:option>
</logic:iterate></html:select></td></tr>

<tr><td align="left"><fmt:message key="register.label.caste"></fmt:message></td>
<td><html:select property="bean_caste">
<logic:iterate id="obj1" property="bean_casteal" name="RegisterForm1">
<c:set var="caste" value="${obj1.bean_caste }"></c:set>
 <html:option value="${caste}">${caste}</html:option>
</logic:iterate></html:select></td></tr>


<tr><td align="left"><fmt:message key="register.label.mobile"></fmt:message></td>
<td><html:text property="bean_mobileNo" value=""></html:text></td><td><html:errors property="bean_mobileNo"></html:errors></td></tr>

<tr><td align="left"><fmt:message key="profile.label.phnum"></fmt:message></td>
<td><html:text property="bean_phoneNo" value=""></html:text></td><td><html:errors property="bean_phoneNo"></html:errors></td></tr>

<tr><td align="left"><fmt:message key="register.label.email"></fmt:message></td>
<td><html:text property="bean_emailId"></html:text></td><td><html:errors property="bean_emailId"></html:errors></td></tr>

<tr><td align="left"><fmt:message key="register.label.lpassword"></fmt:message></td>
<td><html:password property="bean_password"></html:password></td><td><html:errors property="bean_password"></html:errors></td></tr>

<tr><td align="left"><fmt:message key="register.label.cpassword"></fmt:message></td>
<td><html:password property="bean_confirmPwd"></html:password></td><td><html:errors property="bean_confirmPwd"></html:errors></td></tr>


                </table>
                <table id="step2">
                <tr><td align="left"><fmt:message key="register.label.manglik"></fmt:message></td>
<td><html:text property="bean_manglik"></html:text></td></tr>

<tr><td align="left"><fmt:message key="register.label.education"></fmt:message></td>
<td><html:select property="bean_education"><html:option value="B.Tech/B.E">B.Tech/B.E</html:option>
	<html:option value="M.Tech/M.E">M.Tech/M.E</html:option>
	<html:option value="B.Sc/B.Com/B.A">B.Sc/B.Com/B.A</html:option>
	<html:option value="MBBS">MBBS</html:option>
	<html:option value="Inter">Inter</html:option>
	<html:option value="SSC">SSC</html:option>
	<html:option value="Others">Others</html:option>
</html:select></td></tr>

<tr><td align="left"><fmt:message key="register.label.Occupation"></fmt:message></td>
<td><html:select property="bean_occupation"><html:option value="Engineer">Engineer</html:option>
	<html:option value="Doctor">Doctor</html:option>
	<html:option value="Lawyer">Lawyer</html:option>
	<html:option value="Scientist">Scientist</html:option>
	<html:option value="Business">Business</html:option>
	<html:option value="Others">Others</html:option>
</html:select></td></tr>

<tr><td align="left"><fmt:message key="register.label.complexion"></fmt:message></td>
<td><html:text property="bean_complexion"></html:text></td></tr>

<tr><td align="left"><fmt:message key="register.label.height"></fmt:message></td>
<td><html:text property="bean_height" value=""></html:text></td><td><html:errors property="bean_height"></html:errors></td></tr>

<tr><td align="left"><fmt:message key="register.label.mstatus"></fmt:message></td>
<td><html:select property="bean_mStatus">
  <html:option value="single"><fmt:message key="register.label.single"></fmt:message></html:option>
                <html:option value="widow"><fmt:message key="register.label.widow"></fmt:message></html:option>

                <html:option value="widower"><fmt:message key="register.label.widower"></fmt:message></html:option>
                </html:select>
                
                </td></tr>
        
                


</table>
<table id="step3">
<tr><td align="left"><fmt:message key="register.label.interests"></fmt:message></td>
<td><html:textarea property="bean_interests"></html:textarea></td><td><html:errors property="bean_interests"></html:errors></td></tr>
<tr><td align="left"><fmt:message key="register.label.aboutme"></fmt:message></td>
<td><html:textarea property="bean_aboutMe"></html:textarea></td><td><html:errors property="bean_aboutMe"></html:errors></td></tr>

<tr><td align="left"><fmt:message key="register.label.aboutpartner"></fmt:message></td>
<td><html:textarea property="bean_aboutPartner"></html:textarea></td><td><html:errors property="bean_aboutPartner"></html:errors></td></tr>
<tr><td align="left"><fmt:message key="register.label.employmentreq"></fmt:message></td>
<td><html:radio  property="bean_type" value="yes"><fmt:message key="register.label.yes"></fmt:message></html:radio><html:radio  property="bean_type" value="no"><fmt:message key="register.label.no"></fmt:message></html:radio></td></tr>


<tr><td align="left"><fmt:message key="register.label.hobbies"></fmt:message></td>
<td><html:textarea property="bean_hobbies"></html:textarea></td></tr>
<tr><td><html:reset value="${register.label.button.reset}" /></td><td><html:submit value="${register.label.button.submit}" ></html:submit></td></tr>
</table>
</html:form>
</center>
	
</body>
</html>