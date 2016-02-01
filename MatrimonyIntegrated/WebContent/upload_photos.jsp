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
            <div class="trigger">Upload your photos here.</div>                       
        </div>
        <br/>
        <div class="toogle_wrap">
            <div>My Pictures<hr color="#FFFFFF"/></div>
			<h4 style="color:#FFFFFF">Upload Photos</h4>
<center>
<html:form action="/upload">
	 <table border="0" width="600px" height="150px"  style="color:#FFFFFF;font-size:14px;">
     	<tr>
        	<td width="120px" align="right">Select Photo : </td>
            <td width="10px"></td>
            <td width="200px"><html:file property="profPhoto"/></td>
            <td></td>
        </tr>      
        <tr>
        	<td align="right">Category : </td>
            <td width="10px"></td>
            <td align="left">
            	<html:select property="bean_category">
                	<html:option value="profilepic">Profile Photo</html:option>
                    <html:option value="album">Album</html:option>
            	</html:select>
            </td>
            <td></td>
        </tr>
        <html:hidden property="action"  value="uploadImage"/>
        <tr>
        	<th colspan="3" width="320px"><html:submit value="Upload Photo"/></th>
            <th></th>
        </tr>        
     </table>  
     </html:form>
			</center>	
        </div>
				
                           
                       
     
     </div>
     </div><!-- end of right content-->
              
    
    
    <div  class="side-content" id="side-content">
    <h2>View Album</h2>
    
        <ul>
            <li><html:link page="/viewimage.do?action=viewImage">Profile Picture</html:link></li>
            <li><html:link page="/viewalbum.do?action=viewAlbum">Album</html:link></li>
       
        </ul>
        
    <h2>Upload Photos</h2>
    	
    	 <ul>
            <li><a href="upload_photos.jsp">Profile Picture</a></li>
            <li><a href="upload_photos.jsp">Album</a></li>
        </ul> 
        
     <h2>Remove Photos</h2>
    
        <ul>
            <li><a href="remove_profile_pic.jsp">Profile Picture</a></li>
            <li><a href="remove_personal_pic.jsp">Album</a></li>
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

