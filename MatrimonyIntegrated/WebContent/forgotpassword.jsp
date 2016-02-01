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
<title><fmt:message key="forgotpassword.label.title"></fmt:message></title>
</head>
<body>
<h3  align="center"><fmt:message key="forgotpassword.label.heading"></fmt:message></h3>
<html:form action="/checkSecurity">
<logic:iterate id="pass" property="ar" name="ForgotPassword">
<c:set var="password" value="${pass.password}"></c:set>
<html:hidden property="password" value="${password}"></html:hidden>
<c:set var="secQ" value="${pass.security_Q}"></c:set>
<c:set var="secA" value="${pass.cSecurity_A}"></c:set>
<html:hidden property="cSecurity_A" value="${secA}"></html:hidden>
<c:set var="user" value="${pass.user_id}"></c:set>
<html:hidden property="user_id" value="${user}"></html:hidden>

<table>
	<tr><td align="center"><fmt:message key="register.label.security_Q"></fmt:message></td><td align="center"><html:text property="security_Q" value="${secQ}" disabled="true"></html:text></td><td></td></tr>
	<tr><td align="center"><fmt:message key="register.label.security_A"></fmt:message></td><td align="center"><html:text property="security_A" value=""></html:text></td><td><html:errors property="security_A"/></td></tr>
	<tr><td align="center"><fmt:message key="register.label.password"></fmt:message></td><td align="center"><html:password property="newpwd" value=""></html:password></td><td><html:errors property="newpwd"/></td></tr>
	<tr><td align="center"><fmt:message key="register.label.cpassword"></fmt:message></td><td align="center"><html:password property="renewpwd" value=""></html:password></td><td><html:errors property="renewpwd"/></td></tr>
<tr><td><html:submit property="action" value="Submit"></html:submit></td></tr>

</table>
</logic:iterate>
</html:form>
</body>
</html>