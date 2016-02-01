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
<title>Insert title here</title>
</head>
<body>
<html:form action="login">

	<fmt:message key="login.label.userid"></fmt:message><br/>
	<html:text property="user_id" name="LoginForm"></html:text>
	<html:errors property="user_id"/><br/>
	<fmt:message key="login.label.password"></fmt:message>
	<html:password property="password" name="LoginForm"></html:password>
	<html:errors property="password"/><br/>
	<html:submit><fmt:message key="login.label.submit"></fmt:message></html:submit><br/>
</html:form>
</body>
</html>