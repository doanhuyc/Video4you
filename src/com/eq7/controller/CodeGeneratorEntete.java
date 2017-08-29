package com.eq7.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;


/**
  * Classe qui genere le code html pour l'entete et pied de page du site
  */
@SuppressWarnings("serial")
public class CodeGeneratorEntete extends HttpServlet {


	/**
	 * Manipulation de requetes HTTP du type GET
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

	}	
	
	/**
	 * Manipulation de requetes HTTP du type POST
	 */		
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
	}
	
	
}
