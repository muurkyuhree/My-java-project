package com.murkpractice.java;

import java.sql.*;

public class TestingClass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		System.out.println("---------- PostgreSQL JDBC Connection Testing--------");
		
		try{
			Class.forName("org.postgresql.Driver");
		}catch(ClassNotFoundException e){
			System.out.println("where is your PostgreSQL JDBC Driver? " 
					+ "Includenin your library path");
			e.printStackTrace();
			return;
		}
		System.out.println("PostgreSQL Driver Registered!");
		
		Connection conn = null;
		
		try{
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/CRUD_News", "postgres", "murk");
		}catch(SQLException sqe){
			System.out.println("Connection Failed! Check output console.");
			sqe.printStackTrace();
			return;
		}
		
		if(conn != null){
			System.out.println("You made it, take control of your DB now!");
		}else{
			System.out.println("Failed to make connecion!");
		}
	}

}
