package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SingleObject {

	private static SingleObject instance;

	private SingleObject() {

	}
	
	public static SingleObject getInstance() {
		if(instance == null) {
			instance = new SingleObject();
		}
		return instance;
	}

	public void getConnection() {
		String QUERY = "SELECT * FROM students";
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(QUERY);
				){
			while(rs.next()) {
				//Display Values
				System.out.println("ID: "+rs.getInt("id"));
				System.out.println(", Age: "+rs.getInt("age"));
				System.out.println(", First: "+rs.getString("first"));
				System.out.println(", Last: "+rs.getString("last"));
			}
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
}
