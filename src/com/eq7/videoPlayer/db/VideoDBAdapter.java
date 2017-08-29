package com.eq7.videoPlayer.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class VideoDBAdapter implements DBAdapter<Video> {

	Connection connection;
	
	public VideoDBAdapter(){
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
	public Video get(int id) {
		
		return null;
	}

	@Override
	public List<Video> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Video> getAll(String columnName, String order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Video> find(String selection, String[] selectionArgs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Video> find(String selection, String[] selectionArgs,
			String columnName, String order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Video objet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Video objet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Video objet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub
		
	}

}
