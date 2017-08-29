package com.eq7.videoPlayer.db;

import java.util.ArrayList;

public class List {
	
	private int id;
	private int user_id;
	private ArrayList<Video> videos;
	private String nom;
	
	public int getId() {
		return id;
	}
	
	/**
	 * Ne pas utiliser setId, pour le fonctionnement de xxxDBAdapter uniquement
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Code de l'usager
	 */
	public int getUser_id() {
		return user_id;
	}
	
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	public ArrayList<Video> getVideos() {
		return videos;
	}
	
	public void setVideos(ArrayList<Video> videos) {
		this.videos = videos;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
}
