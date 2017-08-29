<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="com.eq7.videoPlayer.db.User"%>
    <%@page import="com.eq7.controller.LoginController"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
  <head>
	<title>VideoPlayer</title>
	<link rel="stylesheet" media="screen" type="text/css" href="style.css" />
	<meta http-equiv="Content-type" content="text/html;charset=UTF-8" />
  </head>

  <body>
	
	

	<div id="container">
      <div id="body_space">
        <div id="header">
		  <nav id="log_in">
			<ul>
		<li><a href="LoginController?action=LOGOUT"><b>Logout</b></a></li>
		<% 
		//code java day ban
		User currentUser = (User) session.getAttribute("currentSessionUser");%>
		<li><p>Welcome<font color="#0000FF"> <%= currentUser.getPrenom()%></font></p></li>
		</ul>
		  </nav>
		  <div id="logo-block">
		    <!-- type your logo and small slogan here -->
            <p id="logo">Video<span class="logoblue">Player</span></p>
		    <p id="slogan">Regarder vos vidéos préférées</p>
			<!-- end logo and small slogan -->
			<form id="search_bar" method="post" action="">
			<input name="search" id="in_search"/>
		
			<input name="search_button" type="button" onClick="window.location='user_search_res.html'" class="search_button" id="search_button" value="Rechercher">
		    </form>
		  </div>
		  <div class="cls"></div>
  		  <div id="top-nav-bg">
            <div id="top-nav">
			  <!-- start top navigation bar -->
              <ul>
                  <li><a href="user_index.jsp">Accueil</a></li>
                <li><a href="user_account.jsp">Mon compte</a></li>
                <li><a href="user_myvideo.jsp">Mes vid&eacute;os</a></li>
                <li><a href="user_list.jsp">Mes Listes</a></li>
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
	      <%if (request.getAttribute("modifySuss") != null) {
               String thongBao = (String) request.getAttribute("modifySuss");
     			 %>
					<center>
						<font color="#FF0000"><%=thongBao%></font>
					</center>
					
					<%}%>
            <h1>Mon compte</h1>
              
            <table width="58%" border="0" cellspacing="10" cellpadding="10">
              <tr>
                <th scope="row">Nom d'utilisateur</th>
                <td><%= currentUser.getUsername()%></td>
              </tr>
              <tr>
                <th scope="row">Nom</th>
                <td><%= currentUser.getPrenom()%></td>
              </tr>
              <tr>
                <th scope="row">Courriel</th>
                <td><%= currentUser.getEmail()%></td>
              </tr>
              <tr>
                <th scope="row">Adresse</th>
                <td><%= currentUser.getAdresse()%></td>
              </tr>
              <tr>
                <th scope="row">Photo</th>
                <td><img src=<%="\""+ currentUser.getPhoto()+"\""%> alt="" name="user_picture" width="100" height="100" style="background-color: #0099FF"></td>
              </tr>
              <tr>
                <th scope="row">Date de naissance</th>
                <td><%=currentUser.getDate_naissance()%></td>
              </tr>
              <tr>
                <th scope="row">&nbsp;</th>
                <td><form name="form1" method="post" action="">
                  <input name="modif_account" type="button" onClick="window.location='user_account_edit.jsp'" class="connexion_button" id="modif_account" value="Modifier">
                </form></td>
              </tr>
            </table>
            <p>&nbsp;</p>
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
