package com.eq7.videoPlayer.db;

import java.util.ArrayList;

public class Video {
	
	private int id;
	private int user_id;
	private String titre;
	private ArrayList<String> tags;
	//private Video video;
	
	public int getId() {
		return id;
	}
	
	/**
	 * Ne pas utiliser setId, pour le fonctionnement de xxxDBAdapter uniquement
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	public int getUser_id() {
		return user_id;
	}
	
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	public String getTitre() {
		return titre;
	}
	
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public ArrayList<String> getTags() {
		return tags;
	}
	
	public void setTags(ArrayList<String> tags) {
		this.tags = tags;
	}
	
	

}
