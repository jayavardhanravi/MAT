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
<title>Insert title here</title>
</head>
<body>
<h3  align="center"><fmt:message key="forgotpassword.label.user"></fmt:message></h3>
<html:form action="/forgotpassword">
<table>
<tr><td align="center"><fmt:message key="register.label.userid"></fmt:message></td><td align="center"><html:text property="user_id"></html:text></td><td><html:errors property="user_id"/></td></tr>
<tr><td><html:submit property="action" value="ForgotPassword"></html:submit></td></tr>
</table>
</html:form>
</body>
</html>