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
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="js/jquery.validate.min.js"></script>
<script type="text/javascript" src="js/localization/messages_vi.js"></script>
<script type="text/javascript">
		$(document).ready(function(){
			$("#uploadID").validate({
				errorElement: "span", 
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
					<li><a href="LoginController?action=LOGOUT"><b>Logout</b></a></li>
					<%
						//code java day ban
						User currentUser = (User) session.getAttribute("currentSessionUser");
					%>
					<li><p>
							Welcome<font color="#0000FF"> <%=currentUser.getPrenom()%></font>
						</p></li>
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
							onClick="window.location='user_search_res.html'"
							class="search_button" id="search_button" value="Rechercher">
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
				<%
					if (request.getAttribute("message") != null) {
						String thongBao = (String) request.getAttribute("message");
				%>
				<center>
					<font color="#FF0000"><%=thongBao%></font>
				</center>

				<%
					}
				%>
				<div id="content-padding">
					<h1 class="page_title">Ajouter une vidéo</h1>
					<form id="uploadID" name="form1" method="post"
						action="UploadController" enctype="multipart/form-data">
						<table width="65%" border="0" cellspacing="10" cellpadding="10">
							<tr>
								<th class="form_labels" scope="row">Description</th>
								<td><label for="video_description"></label> <textarea
										name="video_description" class="inputstyle"
										id="video_description"></textarea></td>
							</tr>
							<tr>
								<th class="form_labels" scope="row">Fichier</th>
								<td>
									<div>
										<input type="file" name="uploadFile" accept="webm|mp4|avi|flv"
											size="25" />
									</div>
								</td>
							</tr>
							<tr>
								<th class="form_labels" scope="row">Titre</th>
								<td><label for="nv_title"></label> <input name="nv_title"
									class="inputstyle" id="nv_title"></td>
							</tr>
							<tr>
								<th class="form_labels" scope="row">Catégorie</th>
								<td><label for="nv_category"></label> <input
									name="nv_category" class="inputstyle" id="nv_category"></td>
							</tr>
							<tr>
								<th class="form_labels" scope="row">&Eacute;tiquettes</th>
								<td><label for="nv_tag"></label> <input name="nv_tag"
									class="inputstyle" id="nv_tag"></td>
							</tr>
							<tr>
								<th scope="row">&nbsp;</th>
								<td>
									<!-- 								<input name="connexion_button" type="button" --> <!-- 									onClick="window.location='user_myvideo.html'" -->
									<!-- 									class="connexion_button" id="connexion_button" value="Ajouter"></td> -->

									<br /> <input type="submit" value="Ajouter" />
									</tr>
						</table>
					</form>
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