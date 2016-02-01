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
<title><fmt:message key="login.title"></fmt:message></title>
</head>
<body>


<table align="center">
<html:form action="login">

	<tr><td><fmt:message key="login.label.userid"></fmt:message><br/></td>
	<td><html:text property="user_id" name="LoginForm"></html:text></td>
	<td><html:errors property="user_id"/></td></tr>
	<tr><td><fmt:message key="login.label.password"></fmt:message></td>
	<td><html:password property="password" name="LoginForm"></html:password></td>
	<td><html:errors property="password"/></td></tr>
	<tr><td></td><td align="right"><html:submit property="action" value="Login"></html:submit></td></tr>
	</html:form>
	<tr><td></td><td align="right"><html:link page="/search.do?action=New User">New User</html:link></td></tr>
	<tr><td></td><td align="right"><html:link page="/pages/userid.jsp">Forgot Password</html:link></td></tr>
</table>	




</body>
</html>