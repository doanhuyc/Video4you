package com.eq7.controller;

import java.util.ArrayList;
import com.eq7.videoPlayer.db.Video;

/**
 *Classe permettant de faire une recherche
 */
public class Search
{
	/**
	 * Liste de videos resultant de la recherche
	 */
	private ArrayList<Video> videoList;
	
	/**
	 * Methode qui va faire la requete de recherche
	 * @param query requete a faire
	 * @return liste de videos
	 */
	private ArrayList<Video> doQuery( String query )
	{
		return new ArrayList<Video>();
	}
	
	/**
	 * Constructeur
	 * @param query requete a effectuer
	 */
	public Search( String query )
	{
	}
	
	/**
	 * Va rediriger l'usager vers la page de visionnement du video
	 * @param id identificateur du video desire
	 */
	void viewVideo( int id )
	{
	}

}
