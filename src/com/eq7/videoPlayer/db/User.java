package com.eq7.videoPlayer.db;

public class User {
	
	private int id;
	private String username;
	private String password;
	private String nom;
	private String prenom;
	private String email;
	private String adresse;
	private String date_naissance;
	private String photo; //save url of photo
	public boolean valid;

	public int getId() {
		return id;
	}
	
	/**
	 * Ne pas utiliser setId, pour le fonctionnement de xxxDBAdapter uniquement
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getAdresse() {
		return adresse;
	}
	
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public String getDate_naissance() {
		return date_naissance;
	}
	
	public void setDate_naissance(String date_naissance) {
		this.date_naissance = date_naissance;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

}
