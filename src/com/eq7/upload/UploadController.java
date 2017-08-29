package com.eq7.upload;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import com.eq7.videoPlayer.db.User;

/**
 * A Java servlet that handles file upload from client.
 * @author www.codejava.net
 */
public class UploadController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final String UPLOAD_DIRECTORY = "videos";
	private static final int THRESHOLD_SIZE 	= 1024 * 1024 * 3; 	// 3MB
	private static final int MAX_FILE_SIZE 		= 1024 * 1024 * 40; // 40MB
	private static final int MAX_REQUEST_SIZE 	= 1024 * 1024 * 50; // 50MB
	
	public UploadController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		// checks if the request actually contains upload file
				if (!ServletFileUpload.isMultipartContent(request)) {
					PrintWriter writer = response.getWriter();
					writer.println("Request does not contain upload data");
					writer.flush();
					return;
				}
				// configures upload settings
				DiskFileItemFactory factory = new DiskFileItemFactory();
				factory.setSizeThreshold(THRESHOLD_SIZE);
				factory.setRepository(new File(System.getProperty("java.io.tmpdir")));
				
				ServletFileUpload upload = new ServletFileUpload(factory);
				upload.setFileSizeMax(MAX_FILE_SIZE);
				upload.setSizeMax(MAX_REQUEST_SIZE);

				// constructs the directory path to store upload file
				String uploadPath = getServletContext().getRealPath("")
					+ File.separator + UPLOAD_DIRECTORY;
				// creates the directory if it does not exist
				File uploadDir = new File(uploadPath);
				if (!uploadDir.exists()) {
					uploadDir.mkdir();
				}
				
				try {
					// parses the request's content to extract file data
					List formItems = upload.parseRequest(request);
					Iterator iter = formItems.iterator();
					
					// iterates over form's fields
					while (iter.hasNext()) {
						FileItem item = (FileItem) iter.next();
						// processes only fields that are not form fields
						if (!item.isFormField()) {
							String fileName = new File(item.getName()).getName();
							String filePath = uploadPath + File.separator + fileName;
							File storeFile = new File(filePath);
							
							// saves the file on disk
							item.write(storeFile);
							System.out.println(filePath);

						}
					}
		            HttpSession session = request.getSession();
					User currentUser = (User) session.getAttribute("currentSessionUser");
		     		System.out.println(currentUser.getUsername());
//		            String video_description = request.getParameter("video_description");
//		            String nv_title = request.getParameter("nv_title");
//		            String nv_category = request.getParameter("nv_category");
//		            String nv_tag = request.getParameter("nv_tag");
//		     		System.out.println(video_description);
//		     		System.out.println(nv_title);
//		     		System.out.println(nv_category);
//		     		System.out.println(nv_tag);

		     		
					 request.setAttribute("message", "Upload has been done successfully!");
				} catch (Exception ex) {
					request.setAttribute("message", "There was an error: " + ex.getMessage());
				}
				getServletContext().getRequestDispatcher("/user_addVideo.jsp").forward(request, response);

	}
	
	/**
	 * handles file upload via HTTP POST method
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	      processRequest(request, response);

	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	      processRequest(request, response);
	}
	
	
}
