package com.eq7.videoPlayer.db;

import java.util.ArrayList;

/**
 * Cette classe sert a regrouper tous les acces a la db dans une meme classe. Un utilisateur de cette classe 
 * n'a pas besoins de connaitre les proprietes de la db
 */

public class DBFacade {
	
	/**
	 * @param username
	 * @return True si le username existe
	 */
	public boolean checkUsername(String username){
		return false;
	}
	
	/**
	 * 
	 * @param username
	 * @param password
	 * @return True si le password et le username match
	 */
	public boolean checkPassword(String username, String password){
		return false;
	}
	
	/**
	 * @param qty : quantite de video demandees
	 * @return Liste des qty videos les plus recentes
	 */
	public ArrayList<Video> getRecentVideo(int qty){
		return null;
	}
	
	/**
	 * @param qty : quantite de videos demandees
	 * @return Liste des qty videos les plus populaires
	 */
	public ArrayList<Video> getMostPop(int qty){
		return null;
	}
	
	/**
	 * 
	 * @param userId
	 * @return Liste de toutes les videos du User
	 */
	public ArrayList<Video> getUserVideoAll(int userId){
		return null;
	}
	
	/**
	 * 
	 * @param userId
	 * @return Liste de toutes les playlists du User
	 */
	public ArrayList<List> getUserListsAll(int userId){
		return null;
	}

	public User getUser(int id){
		return null;
	}

	public Video getVideo(int id){
		return null;
	}

	public List getList(int id){
		return null;
	}
	
	public Comment getComment(int id){
		return null;
	}
	
	/**
	 * 
	 * @param videoId	
	 * @return Liste de tous les comments du videos
	 */
	public ArrayList<Comment> getVideoCommentsAll(int videoId){
		return null;
	}
	
	/**
	 * 
	 * @param videoId
	 * @return Liste de tous les commetns du user
	 */
	public ArrayList<Comment> getUserCommetnsAll(int videoId){
		return null;
	}
	

	public void addVideo(Video newVideo){
		
	}
	
	public void addUser(User newUser){
		
	}

	public void addList(List newList){
		
	}
	
	public void addComment(Comment newComment){
		
	}
	
	public void removeVideo(int videoId){
		
	}
	
	public void removeUser(int userId){
		
	}

	public void removeList(int listId){
		
	}
	
	public void removeComment(int commentId){
		
	}
	
	public void updateVideo(Video newVideo){
		
	}
	
	public void updateUser(User newUser){
		
	}

	public void updateList(List newList){
		
	}
	
	public void updateComment(Comment newComment){
		
	}
	
	
}
