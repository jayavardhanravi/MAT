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
<title>Shaadi Mubaarakh</title>
<link href="css/style.css" media="screen" rel="stylesheet"/>
<!--[if IE 7]>
<link rel="stylesheet" type="text/css" href="style.ie7.css" />		
<![endif]-->
</head>
<body>
	<div id="wrapper">
<!-- banner -->
		<div id="banner">
			<img  alt="" src="pages/images/header-img.jpg"/>
			<div id="logo"><img  alt="" src="pages/images/logo.png"/></div>
		</div>
<!-- content -->
		<div id="content-bg"><div class="inner_copy"></div>
<!-- menu -->
			<div id="menu">
				<ul>
					<li class="menu-btn"><a href="index.jsp">Home</a></li>
					<li class="divider"><img  alt="" src="pages/images/menu-divider.png"/></li>
					<li class="menu-btn"><html:link page="/search.do?action=New User">Register</html:link></li>
					<li class="divider"><img  alt="" src="pages/images/menu-divider.png"/></li>
					<li class="menu-btn"><a href="/pages/adminlogin.jsp">Admin</a></li>
					<li class="divider"><img  alt="" src="pages/images/menu-divider.png"/></li>
					<li class="menu-btn"><a href="/pages/regularsearch.jsp">Search</a></li>
					<li class="divider"><img  alt="" src="pages/images/menu-divider.png"/></li>
					<li class="menu-btn"><a href="/pages/contact.jsp">Contact</a></li>
					<li class="divider"><img  alt="" src="pages/images/menu-divider.png"/></li>
					<li class="menu-btn"><a href="/pages/aboutus.jsp">About us</a></li>
					
				</ul>
				<div style="clear:both"></div>
			</div>
				
				
<!-- left content -->
				 <div id="left-content">
<!-- welcome -->
					<div id="welcome">
						<div id="welcome-top"><img  alt="" src="pages/images/welcome-title.gif"/></div>
						<div id="welcome-middle">
							<div>
								This is a free and fully standards compliant css template designed by <a href="#">MyTemplateBox</a>. You can use it for your personal and commercial projects without any restrictions. The only stipulation to the use of this free template is that the links appearing in the footer remain intact. Beyond that, simply enjoy and have fun with it!
							</div>
							<div id="more-btn1"><a href="#"><img  alt="" src="pages/images/more-btn1.png" border="0"/></a></div>
						</div>
						<div id="welcome-bottom"></div>
					</div>
					
<!-- our wedding -->
					<div id="our-wedding">
						<div id="wedding-title"><img alt="" src="pages/images/wedding-title.png"/></div>
						<div>
							Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Ut feugiat quam at leo. Maecenas pellentesque. Nulla ante purus, ultricies vitae, rhoncus ac, ullamcorper eget, diam. Vivamus est enim, bibendum eu, laoreet a, euismod non, elit. Quisque libero.
						</div>
						<div class="more-btn2"><a href="#"><img  alt="" src="pages/images/more-btn2.png" border="0"/></a></div>
					</div>
				</div>
<!-- right content -->
				<div id="right-content">
<!-- about our family -->
					<div id="family">
						<div><img  alt="" src="pages/images/family-title.gif"/></div>
						<div class="photos"><img  alt="" src="pages/images/photo1.jpg"/></div>
						<div class="family-txt">
							<div class="sub-title">SARA SMITH</div>
							<div style="width:270px">
								Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Ut feugiat quam at leo. Maecenas pellentesque.
							</div>
							<div class="more-btn2"><a href="#"><img  alt="" src="pages/images/more-btn2.png" border="0"/></a></div>
						</div>
						<div style="clear:both"></div>
						<div class="photos"><img  alt="" src="pages/images/photo2.jpg"/></div>
						<div class="family-txt">
							<div class="sub-title">JOHN SMITH</div>
							<div style="width:270px">
								Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Ut feugiat quam at leo. Maecenas pellentesque.
							</div>
							<div class="more-btn2"><a href="#"><img  alt="" src="pages/images/more-btn2.png" border="0"/></a></div>
						</div>
						<div style="clear:both"></div>
					</div>
					<div id="h-divider"></div>
<!-- log in -->
					<div id="login">
						<html:form action="/login">
							<html:errors property="user_id"/><br/>
								<html:errors property="password"/><br/>
							<div class="input-box"><html:text property="user_id" name="LoginForm"></html:text></div>
							<div class="input-box"><html:password property="password" name="LoginForm"></html:password></div>
							<div style="clear:both"></div>
							<div id="login-btn"><html:submit property="action" value="Login"></html:submit></div>
						</html:form>
						<div class="login-links"><html:link page="/forgotpassword.do?action=ForgotPassword">Forgot Password</html:link></div>
						<div class="login-links" style="margin-left:15px;margin-right:10px">|</div>
						<div class="login-links"><html:link page="/search.do?action=New User">New User</html:link></div>
						<div style="clear:both"></div>
					</div>
				</div>
				<div style="clear:both"></div>
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

