package com.murk.db;

import java.sql.*;
import java.text.SimpleDateFormat;

public class DBUtils {
	
//	public static PreparedStatement getPreparedStatement(String sql) throws ClassNotFoundException, SQLException{
//		
//		PreparedStatement ps = null;
//		Class.forName ("org.postgresql.Driver");
//		String url = "jbdc:postgresql://localhost:5432/CRUD_News";
//		String dbUser = "postgres";
//		String dbPsw = "murk";
//		
//		
//		Connection conn = DriverManager.getConnection(url, dbUser, dbPsw);
//		ps = conn.prepareStatement(sql);
//				
//		return ps;
//	}
	
	//Check Db Connection
	public static void main(String[] args) throws ClassNotFoundException,SQLException{
//		getPreparedStatement("select * from public.News");
		
		String driverName = "org.postgresql.Driver";
		String url = "jbdc:postgresql://localhost:5432/CRUD_News";
		String dbUser = "postgres";
		String dbPsw = "murk";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		Class.forName(driverName);
		conn = DriverManager.getConnection(url, dbUser, dbPsw);
		conn.setAutoCommit(false);
				
		System.out.println("You made it, take control of your DB now!");
		
		stmt = conn.createStatement();
//		rs = stmt.executeQuery("select * from News");
		rs = stmt.executeQuery("" + "select * from CRUD_News.News" + "");
		
		while(rs.next()){
			
			int id = rs.getInt(1);	
			String title = rs.getString("title");
			
			Date dateTemp = new Date(System.currentTimeMillis());
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
			String date = dateFormat.format(dateTemp.getTime());
			
			String description = rs.getString("description");
			String detail = rs.getString("detail");
			String category = rs.getString("category");
			String image = rs.getString("image");
			
			
			System.out.println("Id: " + id 
								+"Title: " +title 
								+"Date: "+ date 
								+"Description: " + description
								+"Detail: " +detail
								+"Category: " + category
								+"Image: " + image);
		}
		rs.close();
		stmt.close();
		conn.close();
	}

}
