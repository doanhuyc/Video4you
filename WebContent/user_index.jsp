<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  
    %>
   <%@page import="com.eq7.videoPlayer.db.User"%>
    <%@page import="com.eq7.controller.LoginController"%>
    
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
	    	
            <h1>Récemment ajoutés</h1>
            <table width="99%" border="0" cellspacing="10" cellpadding="10">
              <tr>
                <td><a href="user_view_video.html"><img name="Video" src="images/clouds.jpg" width="200" height="100" alt="" style="background-color: #0099FF"></a></td>
                <td><a href="user_view_video.html"><img name="Video" src="images/clouds.jpg" width="200" height="100" alt="" style="background-color: #0099FF"></a></td>
		<td><a href="user_view_video.html"><img name="Video" src="images/clouds.jpg" width="200" height="100" alt="" style="background-color: #0099FF"></a></td>
		<td><a href="user_view_video.html"><img name="Video" src="images/clouds.jpg" width="200" height="100" alt="" style="background-color: #0099FF"></a></td>
              </tr>
              <tr>
                 <td><a href="user_view_video.html"><img name="Video" src="images/clouds.jpg" width="200" height="100" alt="" style="background-color: #0099FF"></a></td>
                <td><a href="user_view_video.html"><img name="Video" src="images/clouds.jpg" width="200" height="100" alt="" style="background-color: #0099FF"></a></td>
		<td><a href="user_view_video.html"><img name="Video" src="images/clouds.jpg" width="200" height="100" alt="" style="background-color: #0099FF"></a></td>
		<td><a href="user_view_video.html"><img name="Video" src="images/clouds.jpg" width="200" height="100" alt="" style="background-color: #0099FF"></a></td>
              </tr>
              <tr>
                 <td><a href="user_view_video.html"><img name="Video" src="images/clouds.jpg" width="200" height="100" alt="" style="background-color: #0099FF"></a></td>
                <td><a href="user_view_video.html"><img name="Video" src="images/clouds.jpg" width="200" height="100" alt="" style="background-color: #0099FF"></a></td>
		<td><a href="user_view_video.html"><img name="Video" src="images/clouds.jpg" width="200" height="100" alt="" style="background-color: #0099FF"></a></td>
		<td><a href="user_view_video.html"><img name="Video" src="images/clouds.jpg" width="200" height="100" alt="" style="background-color: #0099FF"></a></td>
              </tr>
            </table>
            <p>&nbsp;</p>
            <hr />
			<br />
            <h1>Les plus visionnés</h1>
            <table width="99%" border="0" cellspacing="10" cellpadding="10">
              <tr>
                 <td><a href="user_view_video.html"><img name="Video" src="images/clouds.jpg" width="200" height="100" alt="" style="background-color: #0099FF"></a></td>
                <td><a href="user_view_video.html"><img name="Video" src="images/clouds.jpg" width="200" height="100" alt="" style="background-color: #0099FF"></a></td>
		<td><a href="user_view_video.html"><img name="Video" src="images/clouds.jpg" width="200" height="100" alt="" style="background-color: #0099FF"></a></td>
		<td><a href="user_view_video.html"><img name="Video" src="images/clouds.jpg" width="200" height="100" alt="" style="background-color: #0099FF"></a></td>
              </tr>
              <tr>
                 <td><a href="user_view_video.html"><img name="Video" src="images/clouds.jpg" width="200" height="100" alt="" style="background-color: #0099FF"></a></td>
                <td><a href="user_view_video.html"><img name="Video" src="images/clouds.jpg" width="200" height="100" alt="" style="background-color: #0099FF"></a></td>
		<td><a href="user_view_video.html"><img name="Video" src="images/clouds.jpg" width="200" height="100" alt="" style="background-color: #0099FF"></a></td>
		<td><a href="user_view_video.html"><img name="Video" src="images/clouds.jpg" width="200" height="100" alt="" style="background-color: #0099FF"></a></td>
              </tr>
              <tr>
                 <td><a href="user_view_video.html"><img name="Video" src="images/clouds.jpg" width="200" height="100" alt="" style="background-color: #0099FF"></a></td>
                <td><a href="user_view_video.html"><img name="Video" src="images/clouds.jpg" width="200" height="100" alt="" style="background-color: #0099FF"></a></td>
		<td><a href="user_view_video.html"><img name="Video" src="images/clouds.jpg" width="200" height="100" alt="" style="background-color: #0099FF"></a></td>
		<td><a href="user_view_video.html"><img name="Video" src="images/clouds.jpg" width="200" height="100" alt="" style="background-color: #0099FF"></a></td>
              </tr>
            </table>
            <p class="grey">&nbsp;</p>
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
