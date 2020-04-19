package com.jdbc.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc_ex {
	

	public static void main(String[] args) {
		
		String select = "select * from buytbl";
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("DB연결성공");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cookdb ?serverTimezone=UTC","root","1234");	
			/*
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(select);
			printItem(rs,"num","userId","prodName","groupName","price","amount");
			*/
			PreparedStatement ppst = conn.prepareStatement(select);
			ResultSet rs = ppst.executeQuery();
			printItem(rs,"num","userId","prodName","groupName","price","amount");
			conn.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void printItem(ResultSet rs,String item1,String item2,String item3,String item4,String item5,String item6) throws SQLException {
		while(rs.next()) {
			if(!item1.isEmpty()) System.out.print(rs.getString(item1));
			if(!item2.isEmpty()) System.out.print("\t"+rs.getString(item2));
			if(!item3.isEmpty()) System.out.print("\t"+rs.getString(item3));
			if(!item4.isEmpty()) System.out.print("\t"+rs.getString(item4));
			if(!item5.isEmpty()) System.out.print("\t"+rs.getString(item5));
			if(!item6.isEmpty()) System.out.print("\t"+rs.getString(item6)+"\n");
			else System.out.println();
		}
	}
}
