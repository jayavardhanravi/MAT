<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" buffer="400kb"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
    <%@ taglib prefix="html" uri="/WEB-INF/struts-html.tld" %>
    <%@ taglib prefix="bean" uri="/WEB-INF/struts-bean.tld" %>
    <%@ taglib prefix="logic" uri="/WEB-INF/struts-logic.tld" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Change Password</title>
</head>
<body>
<fmt:setLocale value="en_US"/>
<fmt:setBundle basename="com.tcs.matrimony.resources.ApplicationResources"/>
	<html:form action="chg_pwd">
	<html:messages id="msg" message="true">
	<bean:write name="msg"/><br>
	</html:messages><br/>
		<fmt:message key="login.label.oldpwd"></fmt:message>
		<html:password property="password" name="ChangePwdVal"/>
		<html:errors property="password"/>
		<br/>
		<fmt:message key="login.label.newpwd"></fmt:message>
		<html:password property="newpwd" name="ChangePwdVal"/>
		<html:errors property="newpwd"/>
		<br/>
		<fmt:message key="login.label.renewpwd"></fmt:message>
		<html:password property="renewpwd" name="ChangePwdVal"/>
		<html:errors property="renewpwd"/>
		<br/>
		<html:submit><fmt:message key="login.label.button.submit"></fmt:message></html:submit>
	</html:form>
</body>
</html>