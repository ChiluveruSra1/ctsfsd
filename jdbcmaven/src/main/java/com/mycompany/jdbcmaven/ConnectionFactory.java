package com.mycompany.jdbcmaven;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionFactory {
	private Connection connection;
	private static ConnectionFactory factory;
	private ConnectionFactory() {
		super();}
	
	public static ConnectionFactory getConnectionFactory() {
		if(factory==null) {
			factory=new ConnectionFactory();
		}
		return factory;
	}
	
	public Connection getConnection() throws Exception {
		InputStream in = new FileInputStream("h2.properties");
		Properties p=new Properties();
		p.load(in);
		String url=p.getProperty("connection.url");
		String user=p.getProperty("connection.user");
		String password=p.getProperty("connection.password");
		connection=DriverManager.getConnection(url,user,password);
		return connection;		
	}
	
}

