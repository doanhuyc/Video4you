package com.eq7.controller;
import com.eq7.videoPlayer.db.User;

/**
 * Classe qui s'occupe de faire la gestion de la connection au serveur
 */
public class ConnexionManager
{
	/**
	 * Effectue la connection d'un usager
	 * @param username nom de l'utilisateur
	 * @return objet User contenant les informations d'un usager
	 */
	public User login( String username )
	{
		return null;
	}
	
	/**
	 * Deconnecte un usager de la base de donnees
	 * @param user Objet User qui represente l'usager
	 */
	public void logout( User user )
	{
	}
	
	/**
	 * Effectue l'inscription de l'usager dans la base de donnes
	 * @param user Objet user dont on veut faire l'inscription
	 */
	public void signin( User user )
	{
	}
	
	/**
	 * Verifie le mot de passe d'un utilisateur dans la base de donnees
	 * @param username Nom de l'usager
	 * @param password Mot de passe obtenu par la page de connexion
	 * @return true si le mot de passe est valide, faux sinon
	 */
	public boolean checkPassword( String username, String password )
	{
		return false;
	}
	
	/**
	 * Verifie que le nom d'usager est unique dans la base de donnees
	 * @param username
	 * @return true si unique, faux sinon
	 */
	public boolean checkUsername( String username )
	{
		return false;
	}
	
}
