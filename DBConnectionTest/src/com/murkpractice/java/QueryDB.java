package com.murkpractice.java;

import java.sql.*;

public class QueryDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driverName = "org.postgresql.Driver";
		String url = "jbdc:postgresql://localhost:5432/loginDB";
		String dbUser = "postgres";
		String dbPsw = "murk";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;		
		
		try{
			Class.forName(driverName);
			conn = DriverManager.getConnection(url, dbUser, dbPsw);
			conn.setAutoCommit(false);
			
			System.out.println("opened DB successfully!");
			
			stmt = conn.createStatement(); 
			rs = stmt.executeQuery("select *from userdetails");
			
			while(rs.next()){
				
				String name = rs.getString("name");
				String password = rs.getString("password");
				String usertype = rs.getString("usertype");
				
				System.out.println("Name: " + name
									+"Password: " + password
									+"Role: "+ usertype);
			}
			rs.close();
			stmt.close();
			conn.close();
			
		}catch(Exception e){
			
			System.err.println(e.getClass().getName() + ":" +e.getMessage());
			System.exit(0);
		}
		System.out.println("Operation done successfully!");
	}
}
