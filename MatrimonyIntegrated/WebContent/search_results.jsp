<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" buffer="400kb"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="cache-control" content="max-age=0" />
<meta http-equiv="cache-control" content="no-cache" />
<meta http-equiv="expires" content="0" />
<meta http-equiv="pragma" content="no-cache" />
<fmt:setLocale value="" />
<fmt:setBundle
	basename="com.tcs.matrimony.resources.ApplicationResources" />

<title>Insert title here</title>
</head>
<body>
	<center>In search page.....</center>
	<logic:iterate id="profiles" property="ar" name="SearchForm">
		<table>
			<tr>
				<td><c:set var="image" value="${profiles.profPhoto}"></c:set> <img
					src="<%=request.getContextPath()%>${image}" width="150"
					height="150" /><br /></td>
			</tr>
			<tr>
				<td><c:set var="link" value="${profiles.bn_userid}"></c:set> <html:link
						page="/searchDetails.do?bn_action=profileDetails">${link}</html:link></td>
			</tr>
		</table>
		<table width="150px" height="30px">
			<tr>
				<td style="background-color: green;width:60%"></td>
				<td style="background-color: gray"></td>
			</tr>
		</table>
	</logic:iterate>

</body>
</html>