<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.eq7.videoPlayer.db.User"%>
    <%@page import="com.eq7.controller.LoginController"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
	<title>VideoPlayer</title>
	<meta http-equiv="Content-type" content="text/html;charset=UTF-8" />
	<link rel="stylesheet" media="screen" type="text/css" href="style.css" />
	
	<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
	<script type="text/javascript" src="js/jquery.validate.min.js"></script>
	<script type="text/javascript" src="js/localization/messages_vi.js"></script>
	<script type="text/javascript">
		$(document).ready(function(){
			$("#signinID").validate({
				errorElement: "span", 
				rules: {
					cpassword_confirm: {
						equalTo: "#user_password" 
					}
				}
			});
		});
	</script>
	
	
	
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
            <p id="logo">Video<span class="logoblue">Player</span></p>
		    <p id="slogan">Regarder vos vidéos préférées</p>
			<!-- end logo and small slogan -->
			<form id="search_bar" method="post" action="">
			<input name="search" id="in_search"/>
		
			<input name="search_button" type="button" onClick="window.location='search_res.html'" class="search_button" id="search_button" value="Rechercher">
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
            <h1 class="page_title"><a href="loginPage.jsp">Connexion</a> | Inscription</h1>
          <%if (request.getAttribute("signinFail") != null) {
               String thongBao = (String) request.getAttribute("signinFail");
     			 %>
					<center>
						<font color="#FF0000"><%=thongBao%></font>
					</center>
					
					<%}%>
            <form  id="signinID" action="LoginController" method="post" name="formSignin" >
              <table class="signinClass" width="75%" border="0" cellspacing="10" cellpadding="10">
                <tr>
                  <th class="form_labels" scope="row">Nom d'utilisateur</th>
                  <td>
                  <input name="user_id" id="user_id" class="required"  minlength="6" type="text" /></td>
                </tr>
                <tr>
                  <th class="form_labels" scope="row">Mot de passe</th>
                  <td>
                  <input name="user_password" type="password" class="required" minlength="6" id="user_password"/></td>
                </tr>
                <tr>
                  <th class="form_labels" scope="row">Confirmation</th>
                  <td><label for="password_confirm"></label>
                  <input name="cpassword_confirm" type="password" class="required" id="password_confirm"></td>
                </tr>
                <tr>
                  <th class="form_labels" scope="row">Nom</th>
                  <td><label for="user_name"></label>
                  <input name="user_name" type="text" class="required" minlength="3" id="user_name"></td>
                </tr>
                <tr>
                  <th class="form_labels" scope="row">Courriel</th>
                  <td><label for="user_email"></label>
                  <input name="user_email" class="required email" type="text" id="user_email" ></td>
                </tr>
                <tr>
                  <th class="form_labels" scope="row">Addresse</th>
                  <td><label for="user_adress"></label>
                  <input name="user_adress" type="text" class="inputstyle" id="user_adress"></td>
                </tr>
                <tr>
                  <th class="form_labels" scope="row">Photo</th>
                  <td><label for="user_file"></label>
                    <label for="user_file"></label>
                  <input name="user_file" type="text" class="inputstyle" id="user_file"><label for="user_picture"></label></td>
                </tr>
                <tr>
                  <th class="form_labels" scope="row">Date de naissance</th>
                  <td><label for="user_bday"></label>
                  <input name="user_bday" type="text" class="dateISO" id="user_bday"></td>
                </tr>
                <tr>
                  <td>
                  <input type="submit" name="btSignin"
                         id="btSignin" value="Envoyer">
                  <input name="action" type="hidden" id="action"
                         value="SIGNIN" />
               </td>
                </tr>
              </table>
            </form>
              
	      </div>
		</div>
	  <!-- end content --></div>
	  
	  <div id="footer">
	    <div id="footer-pad">
	      <div class="line"></div>
		  <!-- footer and copyright notice -->
	      <p> Design by <a href="http://www.steves-templates.com">Steve's free website templates</a>.</p>
		  <!-- end footer and copyright notice -->
	    </div>
	  </div>
	</div>
  </body>
</html>