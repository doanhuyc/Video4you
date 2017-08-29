package com.eq7.videoPlayer.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import com.eq7.utilsDB.ConnectionManager;

public class UserDBAdapter  implements DBAdapter<User>{
	
	//Connection connection;
	ConnectionManager connection;
	public UserDBAdapter(){
		connection =new ConnectionManager();
		connection.getConnection(); 
		
	}
/********************************************************************************************/	
	/**
	    * @param User bean
	    * @return bean=null: Login fail<br/>
	    *         bean!=null: Login Sussecful
	    */
	public User login(User bean) { 
		 //preparing some objects for connection 
		 String username = bean.getUsername(); 
		 String password = bean.getPassword();
	     String searchQuery = "select * from usercomponent where " +
	     						"user_id='"+ username + "'"+
	    	 					"AND password='" + password + "'";
	     try { 
		    	 ResultSet rs = connection.executeQuery(searchQuery); 
		    	 boolean more = rs.next(); 
		    	 // if user does not exist set the isValid variable to false 
		    	 if (!more) 
		    	 { 
		    		 bean.setValid(false); 
		    	} 
		    	 //if user exists set the isValid variable to true else 
		    	 if (more) 
		    	 {
		    		 bean.setId(rs.getInt("ID"));
			    	 bean.setUsername(rs.getString("USER_ID"));
			    	 bean.setPassword(rs.getString("PASSWORD"));
			    	 bean.setNom(rs.getString("NOM"));
			    	 bean.setPrenom(rs.getString("PRENOM"));
			    	 bean.setEmail(rs.getString("EMAIL"));
			    	 bean.setAdresse(rs.getString("ADRESSE"));
			    	 bean.setDate_naissance(rs.getString("DATE_NAISSANCE"));
			    	 bean.setPhoto(rs.getString("PHOTO"));
			    	 bean.setValid(true); 
			     } 
		    	 connection.Close(rs);
		    	 connection.Close();
	    	 } 
	     catch (SQLException ex) {
	         System.out.println(ex.getMessage());
	      }
		
		return bean;
	}
/********************************************************************************************/	
	 /**
	    * @param User bean
	    * @return true: Sussecful <br/>
	    *         false : false
	    */
	   public boolean signin(User bean){
	      boolean kq=false;
	      String sql=String.format("INSERT INTO usercomponent" +
	      		"(user_id, password,nom,prenom,email,adresse,date_naissance,photo) VALUES('%s','%s','%s','%s','%s','%s','%s','%s')",
	              bean.getUsername(),
	              bean.getPassword(),
	              bean.getNom(),
	              bean.getPrenom(),
	              bean.getEmail(),
	              bean.getAdresse(),
	              bean.getDate_naissance(),
	              bean.getPhoto()
	    		  );
	      
	      //connect to DB 
	      ConnectionManager con=new ConnectionManager();
	      con.getConnection(); 
	      int n=con.executeUpdate(sql);
	      if(n==1){
	         kq=true;
	      }
	      con.Close();
	      return kq;
	   }	
/********************************************************************************************/	
	   
	   /**
	    * @param User bean
	    * @return true: Sussecful <br/>
	    *         false : false
	    */
	   public boolean updateInforUser(String userNameId,User bean){
	      boolean kq=false;
	      String sql=String.format(" UPDATE  usercomponent " +
	      		"SET password='"+bean.getPassword()+
	      		"',nom='"+bean.getNom()+
	      		"',prenom='"+bean.getPrenom()+
	      		"',email='"+bean.getEmail()+
	      		"',adresse='"+bean.getAdresse()+
	      		"',date_naissance='"+bean.getDate_naissance()+
	      		"',photo='"+ bean.getPhoto()+
	      		"' WHERE user_id='"+userNameId+"'");
	      //connect to DB 
	      ConnectionManager con=new ConnectionManager();
	      con.getConnection(); 
	      int n=con.executeUpdate(sql);
	      if(n==1){
	         kq=true;
	      }
	      con.Close();
	      return kq;
	   }		   
	   
				
/********************************************************************************************/	
	
	
	@Override
	public User get(int id) {
		try {
			ResultSet rs = connection.executeQuery("Select * From USER WHERE USERID = "+id);
			User user = new User();
			user.setId(id);
			user.setUsername(rs.getString("USERNAME"));
			user.setPassword(rs.getString("PASSWORD"));
			user.setNom(rs.getString("NOM"));
			user.setPrenom(rs.getString("PRENOM"));
			user.setEmail(rs.getString("EMAIL"));
			user.setAdresse(rs.getString("ADRESSE"));
			user.setDate_naissance(rs.getString("DATENAISSANCE"));
			connection.Close(rs);
	    	connection.Close();
			return user;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll(String columnName, String order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> find(String selection, String[] selectionArgs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> find(String selection, String[] selectionArgs,
			String columnName, String order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(User objet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User objet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(User objet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub
		
	}
	
	public void close(){
		connection.Close();
	}

}
