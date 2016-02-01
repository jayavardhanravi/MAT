package com.tcs.matrimony.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;



public class ConnectionFactory {
	final static String drive="com.mysql.jdbc.Driver";
	final static String url="jdbc:mysql://localhost:3306/matrimony";
	final static String user="root";
	final static String password="root";
	public static Connection con=null;
	public static Statement st=null;
	public static PreparedStatement ps=null;
	private static ConnectionFactory cf=null;
	
	
	
	private  ConnectionFactory(){
		try {
			Class.forName(drive);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getConnection() throws SQLException{
		con= DriverManager.getConnection(url,user,password);
		
		return con;
	}
	public static ConnectionFactory getInstance()
	{
		if(cf==null){
			ConnectionFactory cf=new ConnectionFactory();
		return cf;
		}
		else {return cf;}
		
		
			
	}

}
