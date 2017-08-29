package com.eq7.videoPlayer.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ListDBAdapter implements DBAdapter<List>{

	Connection connection;
	
	public ListDBAdapter(){
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
	public List get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public java.util.List<List> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public java.util.List<List> getAll(String columnName, String order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public java.util.List<List> find(String selection, String[] selectionArgs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public java.util.List<List> find(String selection, String[] selectionArgs,
			String columnName, String order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(List objet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(List objet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(List objet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub
		
	}

}
