<%@ page language="java" contentType="text/html; charset=windows-31j"
	pageEncoding="UTF-8"%>

<%--
   Kiểm tra user đã nhập chưa
   Nếu đã đăng nhập thì cho quay về trang chủ
--%>
<%
      if (session.getAttribute("currentSessionUser") != null) {
         response.sendRedirect("user_index.jsp");
      }
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" media="screen" type="text/css"
	href="style.css" />
<meta http-equiv="Content-Type" content="text/html; charset=windows-31j">
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="js/jquery.validate.min.js"></script>
<script type="text/javascript" src="js/localization/messages_vi.js"></script>
<script type="text/javascript">
		$(document).ready(function(){
			$("#LoginID").validate({
				errorElement: "span", 
				});
		});
	</script>
<title>Insert title here</title>
<!-- <script type="text/javascript"> -->
<!-- </script> -->
</head>
<body>

	<div id="container">
		<div id="body_space">
			<div id="header">

				<nav id="log_in">
				<ul>
					<li><a href="loginPage.jsp">Connexion</a></li>
				</ul>
				</nav>
				<div id="logo-block">
					<!-- type your logo and small slogan here -->
					<p id="logo">
						Video<span class="logoblue">Player</span>
					</p>
					<p id="slogan">Regarder vos vidéos préférées</p>
					<!-- end logo and small slogan -->
					<form id="search_bar" method="post" action="">
						<input name="search" id="in_search" /> <input
							name="search_button" type="button"
							onClick="window.location='jsp/search_res.html'"
							class="search_button" id="search_button" value="Rechercher">
					</form>

				</div>
				<div class="cls"></div>
				<div id="top-nav-bg">
					<div id="top-nav">
						<!-- start top navigation bar -->
						<ul>
							<li><a href="index.jsp">Accueil</a></li>
						</ul>
						<!-- end top navigation bar -->
					</div>
				</div>
			</div>
		</div>
	</div>
	<div id="page">
		<div id="page-padding">
			<!-- start content -->
			<div id="content">
				<div id="content-padding">
					<h1 class="page_title">
						Connexion | <a href="signin.jsp">Inscription</a>
					</h1>
					<form id="LoginID" name="formLogin" method="post" action="LoginController"
						onsubmit="return valid()">
						<table class="loginClass" width="65%" border="0" cellspacing="10" cellpadding="10">
							<tr>
								<th class="form_labels" scope="row">Nom d'utilisateur</th>

								<td>
									<font color="#FF0000"><div id="error1"></div> </font>
									<input name="user" type="text"
									class="required"  minlength="6" id="user_id" />
								</td>
							</tr>
							<tr>
								<th class="form_labels" scope="row">Mot de passe</th>


								<td><label for="user_password"></label>
									<font color="#FF0000"><div id="error2"></div></font>
									 <input name="pass" type="password"
									class="required" minlength="6" id="user_password" /></td>
							</tr>
							<tr>
								<th scope="row">&nbsp;</th>

								<td><input type="submit" name="btLogin" id="btLogin"
									value="Envoyer"> 
									<input type="hidden" name="action"
									value="LOGIN" /></td>
							</tr>
						</table>
					</form>

					<!--Đăng nhập thất bại-->
					<%
            if (request.getAttribute("LoginFalse") != null) {
               String thongBao = (String) request.getAttribute("LoginFalse");
     			 %>
					<center>
						<font color="#FF0000"><%=thongBao%></font>
					</center>
					Inscription Account ?
                     <a href="signin.jsp">Inscription</a>
					<%}%>
					
					<!--Đăng nhập thất bại-->
					<%
            if (request.getAttribute("signinSuss") != null) {
               String thongBao = (String) request.getAttribute("signinSuss");
     			 %>
					<center>
						<font color="#FF0000"><%=thongBao%></font>
					</center>
					
					<%}%>
					<p>&nbsp;</p>

					<p>&nbsp;</p>
					<p>&nbsp;</p>
					<h1>&nbsp;</h1>
					<p class="grey">&nbsp;</p>
				</div>
			</div>
			<!-- end content -->
		</div>
		<div id="footer">
			<div id="footer-pad">
				<div class="line"></div>
				<!-- footer and copyright notice -->
				<p>
					Design by <a href="http://www.steves-templates.com">Steve's
						free website templates</a>.
				</p>
				<!-- end footer and copyright notice -->
			</div>
		</div>
	</div>
</body>
</html>