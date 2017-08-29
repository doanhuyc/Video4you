package com.eq7.videoPlayer.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class CommentDBAdapter  implements DBAdapter<Comment> {

	Connection connection;
	
	public CommentDBAdapter(){
		try {
			
			Class.forName("org.h2.Driver");
			connection = DriverManager.
					getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public Comment get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> getAll(String columnName, String order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> find(String selection, String[] selectionArgs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> find(String selection, String[] selectionArgs,
			String columnName, String order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Comment objet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Comment objet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Comment objet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub
		
	}

}
