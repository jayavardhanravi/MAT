<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" buffer="400kb"%>
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
<title></title>
</head>
<body>
<html:form action="/profsearch" target="iframe">
<html:hidden property="bn_action" value="searchPartner"/>
<table width="100%">
	<tr valign="top">
		<td>
			<table width="200px">
				<tr bgcolor="#909090"><td>Search Based on</td></tr>
				<tr bgcolor="teal" style="color: white">
					<td align="center">Age</td>
				</tr>
				<tr><td><html:radio property="bn_age" value="25" onclick="javascript:submit()"/><label>Greater than 20 and Less than 25</label></td></tr>
				<tr><td><html:radio property="bn_age" value="30"  onclick="javascript:submit()"/><label>Greater than 25 and Less than 30</label></td></tr>
				<tr><td><html:radio property="bn_age" value="35" onclick="javascript:submit()"/><label>Greater than 30 and Less than 35</label></td></tr>
				<tr><td><html:radio property="bn_age" value="40"  onclick="javascript:submit()"/><label>Greater than 35 and Less than 40</label></td></tr>
				<tr><td><html:radio property="bn_age" value="45" onclick="javascript:submit()"/><label>Greater than 40 and Less than 45</label></td></tr>
				<tr><td><html:radio property="bn_age" value="50"  onclick="javascript:submit()"/><label>Greater than 45 and Less than 50</label></td></tr>
				<tr><td><html:radio property="bn_age" value="55" onclick="javascript:submit()"/><label>Greater than 50</label></td></tr>
				<tr bgcolor="teal" style="color: white">
					<td align="center">Gender</td>
				</tr>
				<tr><td><html:radio property="bn_gender" value="male"  onclick="javascript:submit()"/><label>Male</label></td></tr>
				<tr><td><html:radio property="bn_gender" value="female"  onclick="javascript:submit()"/><label>Female</label></td></tr>
				<tr bgcolor="teal" style="color: white">
					<td align="center">Occupation</td>
				</tr>
				
				<tr><td><html:radio property="bn_occupation" value="Engineer" onclick="javascript:submit()"/><label>Engineer</label></td></tr>
				<tr><td><html:radio property="bn_occupation" value="Doctor" onclick="javascript:submit()"/><label>Doctor</label></td></tr>
				<tr><td><html:radio property="bn_occupation" value="Scientist" onclick="javascript:submit()"/><label>Scientist</label></td></tr>
				<tr><td><html:radio property="bn_occupation" value="Lawyer" onclick="javascript:submit()"/><label>Lawyer</label></td></tr>
				<tr><td><html:radio property="bn_occupation" value="Business" onclick="javascript:submit()"/><label>Business</label></td></tr>
				<tr><td><html:radio property="bn_occupation" value="Others" onclick="javascript:submit()"/><label>Others</label></td></tr>
				<tr bgcolor="teal" style="color: white">
					<td align="center">Complexion</td>
				</tr>				
				<tr><td><html:radio property="bn_color" value="fair" onclick="javascript:submit()"/><label>Fair</label></td></tr>
				<tr><td><html:radio property="bn_color" value="light brown" onclick="javascript:submit()"/><label>Light Brown</label></td></tr>
				<tr><td><html:radio property="bn_color" value="dark" onclick="javascript:submit()"/><label>Dark</label></td></tr>
				<tr><td><html:radio property="bn_color" value="very dark" onclick="javascript:submit()"/><label>Very Dark</label></td></tr>
				<tr bgcolor="teal" style="color: white">
					<td align="center">Country</td>
				</tr>				
				<tr><td><html:radio property="bn_country" value="india" onclick="javascript:submit()"/><label>India</label></td></tr>
				<tr bgcolor="teal" style="color: white">
					<td align="center">Religion</td>
				</tr>
				<tr>
				<td><html:select property="bn_religion" onchange="javascript:submit()">
				<html:option value="">--Select Religion</html:option>
				<logic:iterate id="obj1" property="ral" name="SearchForm">
				<c:set var="religion" value="${obj1.bn_religion }"></c:set>
 				<html:option value="${religion}">${religion}</html:option>
				</logic:iterate></html:select></td></tr>
				<tr bgcolor="teal" style="color: white">
					<td align="center">Mother Tongue</td>
				</tr>
				<tr>
				<td><html:select property="bn_language" onchange="javascript:submit()">
					<html:option value="">--Select Language</html:option>
				<logic:iterate id="obj1" property="lal" name="SearchForm">
				<c:set var="mt" value="${obj1.bn_language}"></c:set>
 				<html:option value="${mt}">${mt}</html:option>
				</logic:iterate></html:select></td></tr>
				<tr bgcolor="teal" style="color: white">
					<td align="center">Marital Status</td>
				</tr>				
				<tr><td><html:radio property="bn_mstatus" value="single" onclick="javascript:submit()"/><label>Unmarried</label></td></tr>
				<tr><td><html:radio property="bn_mstatus" value="married" onclick="javascript:submit()"/><label>Married</label></td></tr>
			</table>
		</td>
		<td>
			<iframe src="/pages/welcome.jsp" name="iframe" width="800px" height="1200px"></iframe>
		</td>
	</tr>
</table>
</html:form>
</body>
</html>