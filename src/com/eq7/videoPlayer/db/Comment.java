package com.eq7.videoPlayer.db;

public class Comment {
	
	private int id;
	private int user_id;
	private int video_id;
	private String text;
	
	
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
	
	public int getVideo_id() {
		return video_id;
	}
	
	public void setVideo_id(int video_id) {
		this.video_id = video_id;
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	

}
