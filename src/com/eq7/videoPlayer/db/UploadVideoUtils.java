package com.eq7.videoPlayer.db;

import com.eq7.utilsDB.ConnectionManager;

public class UploadVideoUtils {
	ConnectionManager connection;

	public UploadVideoUtils() {
		connection = new ConnectionManager();
		connection.getConnection();
	}

}
