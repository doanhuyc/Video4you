package com.eq7.videoPlayer.db;

import java.util.List;
//

/**
 * Interface pour communiquer avec la base de donnees.
 * Fournit des methodes pour recuperer un objet par son id ou une collection d'objet eventuellement ordonnee.
 * Frournit aussi des methodes pour inserer, mettre a jour ou supprimer des objets de la base.
 * @param <U> le type d'objet sur lesquels agir
 */
public interface DBAdapter<U> {
	
	static final String ORDRE_CROISSANT = "ASC"; 
	static final String ORDRE_DECROISSANT = "DESC";
	
	
	/**
	 * @param id
	 * @return objet dont l'id est donne, null si non trouve
	 */
	U get(int id);
	
	/**
	 * @return une liste eventuellement vide de objet
	 */
	List<U> getAll();

	/**
	 * @param columnName : nom de la colonne
	 * @param order : constante ORDRE_CROISSANT, ORDRE_DECROISSANT
	 * @return une liste eventuellement vide de objet
	 */
	List<U> getAll(String columnName, String order);
	
	/**
	 * @param selection : filtre pour savoir quelles rangees retourner
	 * @param selectionArgs : liste de conditions
	 * @return une liste eventuellement vide de objet
	 */
	public List<U> find(String selection, String[] selectionArgs);
	
	/**
	 * @param selection : filtre pour savoir quelles rangees retourner
	 * @param selectionArgs : liste de conditions
	 * @param columnName : colone selon laquelle on trie
	 * @param order : constante ORDRE_CROISSANT, ORDRE_DECROISSANT
	 * @return une liste eventuellement vide de objet
	 */
	public List<U> find(String selection, String[] selectionArgs, String columnName, String order);
	
	/**
	 * Insere un objet dans la base, l'id est genere automatiqobjetement par la base puis charge dans l'objet (ecrasant ainsi la valeur contenue avant l'insert)
	 * @param objet
	 */
	public void insert(U objet);
	
	/**
	 * Met a jour un objet dans la base
	 * @param objet
	 */
	public void update(U objet);

	/**
	 * Supprime un objet de la base
	 * @param objet
	 */
	public void remove(U objet);

	/**
	 * Supprime un objet de la base
	 * @param id de l'objet
	 */
	public void remove(int id);

}
