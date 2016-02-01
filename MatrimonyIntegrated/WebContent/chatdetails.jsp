<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
       <%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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

<div id="top123"><a href="#wrapper"> &nbsp;&nbsp;Go to Top</a></div>
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
    <li><a href="newprofile.jsp" class="selected">Home</a></li>
    <li><a href="myalbum.jsp">My Album</a></li>
    <li><a href="searchprof.jsp">Find Matches</a></li>
	<li><a href="mynetwork.jsp">My Network</a></li>
    <li><a href="services.jsp">Matrimony Services</a></li>
	<li><a href="story.jsp">Success Stories</a></li>
    <li><a href="upgrade.jsp">Upgrade</a></li>
    <li><a href="help.jsp">Help</a></li>
    </ul>
<div style="clear:both"></div>
    </div>
			
			
			
			

		</div>
		
<!-- content -->
<div id="content">
<div class="inner_copy"></div> 
             
                    
    <div class="center_content">      
    <div id="right_wrap">
    <div id="right_content">  
        <div class="toogle_wrap2">
            <div class="trigger">Get to know your followers and chat with them here.</div>                       
        </div>
        <br/>
        <div class="toogle_wrap3">
            <div><fmt:message key="mynetwork.label.likes"></fmt:message><hr color="#FFFFFF"/></div>
<table>
	<logic:iterate id="chatlist" property="bean_al" name="NetworkForm">
	<html:form action="/reply">
	<tr><td><bean:write name="chatlist" property="bean_userLike"></bean:write></td><td><bean:write name="chatlist" property="bean_message"></bean:write></td>
	<td><logic:equal name="RegisterForm" property="action" value="Received Messages">
	<c:set var="list" value="${chatlist.bean_userLike}"/>
	<html:hidden property="bean_userLike" value="${list}" ></html:hidden>
	<html:submit property="action" value="Reply"></html:submit>
	</logic:equal></td></tr>
	</html:form>
	</logic:iterate>
</table>		
			
        </div>
				
                           
                       
     
     </div>
     </div><!-- end of right content-->
   <div  class="side-content" id="side-content">
     <h2>My Network</h2>
    
        <ul>
            <li><html:link page="/network.do?action=My Likes"><fmt:message key="mynetwork.label.likes"></fmt:message></html:link></li>
            
            <li><html:link page="/network.do?action=My Followers"><fmt:message key="mynetwork.label.followers"></fmt:message></html:link></li>
            <li><html:link page="/network.do?action=My Relations"><fmt:message key="mynetwork.label.relations"></fmt:message></html:link></li>
        </ul>
     <h2>My Messages</h2>
    
        <ul>
            <li><html:link page="/network.do?action=Sent Messages"><fmt:message key="mynetwork.label.smessages"></fmt:message></html:link></li>
            <li><html:link page="/network.do?action=Received Messages"><fmt:message key="mynetwork.label.rmessages"></fmt:message></html:link></li>
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

