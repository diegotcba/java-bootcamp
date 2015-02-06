package com.diegotcba.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {

	private ResultSet rows;
	private Connection conn;
	private Statement stmt;
	
	
	public void openConnection()
	{
		try {
			if (conn==null || conn.isClosed())
			{
				Class.forName("com.mysql.jdbc.Driver");
				
				conn=DriverManager.getConnection("jdbc:mysql://192.168.56.101/high-school", "diegotcba", "diegotcba");
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	public void closeConnection()
	{
		try {
			conn.close();
			conn=null;
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void executeCommand(String command)
	{
		try {
			if (!conn.isClosed() || conn!=null)
			{
				stmt= conn.createStatement();
				stmt.executeUpdate(command);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	public ResultSet getQuery(String query)
	{
		try {
			if (!conn.isClosed() || conn!=null)
			{
				stmt=conn.createStatement();
				rows= stmt.executeQuery(query);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return rows;
	}
}
