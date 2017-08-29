package com.eq7.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.eq7.videoPlayer.db.Session;
import com.eq7.videoPlayer.db.User;
import com.eq7.videoPlayer.db.UserDBAdapter;


/**
  *Classe qui genere le code html pour l'authentification d'un usager
  */
@SuppressWarnings("serial")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Session session =new Session();
	 /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	 response.setContentType("text/html;charset=UTF-8");
         request.setCharacterEncoding("UTF-8");
         String action = request.getParameter("action");
         
         if(action.equals("SIGNIN")){//Neu action la dang ky
             String user_id = request.getParameter("user_id");
             String user_password = request.getParameter("user_password");
             String user_Fullname = request.getParameter("user_name");
             String user_email = request.getParameter("user_email");
             String user_adress = request.getParameter("user_adress");
             String user_file = request.getParameter("user_file");
             String user_bday = request.getParameter("user_bday");
             User user = new User(); 
             user.setUsername(user_id);
             user.setPassword(user_password);
             user.setNom(user_Fullname);
             user.setPrenom(user_Fullname);
             user.setEmail(user_email);
             user.setAdresse(user_adress);
             user.setPhoto(user_file);
             user.setDate_naissance(user_bday);
             UserDBAdapter userDB= new UserDBAdapter();
             boolean userSignin=userDB.signin(user);
             if (userSignin == true) {

                 request.setAttribute("signinSuss", "Registration Successful, Please login again !");
                 request.getRequestDispatcher("loginPage.jsp").forward(request, response);
              } else {
                 request.setAttribute("signinFail", "Username input is exist or wrong format ! ");
                 request.getRequestDispatcher("signin.jsp").forward(request, response);
              }
        	 
         } else if (action.equals("LOGIN")) {//Neu action la danh nhap
            String name = request.getParameter("user");
            String pass = request.getParameter("pass");
            
            User user = new User(); 
			user.setUsername(name); 
			user.setPassword(pass);
            UserDBAdapter userDB= new UserDBAdapter();

			user = userDB.login(user); 

            if (user.isValid()) {//Dang nhap thanh cong
                session.setId(user.getId());
                session.setUser(user);
               HttpSession session = request.getSession();

               session.setAttribute("currentSessionUser",user); 
               response.sendRedirect("user_index.jsp"); 
         } else {//Dang nhap khong thanh cong
               String thongBao = "User name or password not inval ";
               request.setAttribute("LoginFalse", thongBao);
               request.getRequestDispatcher("loginPage.jsp").forward(request, response);
            }
         }  //Neu action la dang xuat
         else if (action.equals("LOGOUT")) {
             HttpSession session = request.getSession();
             session.removeAttribute("currentSessionUser");
             session.invalidate();
             response.sendRedirect("index.jsp");
          }else if(action.equals("modify_InforUser")){
        	  String userNameUpdate= session.getUser().getUsername();
              String user_password = request.getParameter("user_password");
              String user_Fullname = request.getParameter("user_name");
              String user_email = request.getParameter("user_email");
              String user_adress = request.getParameter("user_adress");
              String user_file = request.getParameter("user_file");
              String user_bday = request.getParameter("user_bday");
              User user = new User(); 
              user.setPassword(user_password);
              user.setNom(user_Fullname);
              user.setPrenom(user_Fullname);
              user.setEmail(user_email);
              user.setAdresse(user_adress);
              user.setPhoto(user_file);
              user.setDate_naissance(user_bday);
              
              UserDBAdapter userDB= new UserDBAdapter();
              boolean userSignin=userDB.updateInforUser(userNameUpdate, user);
              if (userSignin == true) {
                  request.setAttribute("modifySuss", "Modify information Successful, Please logout and login again !");
                  request.getRequestDispatcher("user_account.jsp").forward(request, response);
               } else {
                  request.setAttribute("modifyFail", "Modify information Not Successful, Please logout and login again !");
                  request.getRequestDispatcher("user_account_edit.jsp").forward(request, response);
               }
          }
    }
	/**
	 * Manipulation de requetes HTTP du type GET
	 */	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	      processRequest(request, response);

	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	      processRequest(request, response);
	}
	
		
	
}
