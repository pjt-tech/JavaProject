package com.jdbc.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;;




public class Jdbc_Ex01 {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/cookdb ?serverTimezone=UTC";
		String user = "root";
		String password = "1234";
		int count = 0;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("DB���Ἲ��");
			Connection conn = DriverManager.getConnection(url, user, password);
			Statement stmt = conn.createStatement();
			PreparedStatement pst = conn.prepareStatement("insert into eventtbl values(?,?)");
			
			String db = "create database eventdb";
			//stmt.executeUpdate(db);
			String use = "use eventdb";
			stmt.executeUpdate(use);
			String table;
			table ="create table eventtbl(uname varchar(30)," + "email varchar(30))";
			//stmt.executeUpdate(table);
			System.out.println("DB,Table ���� �Ϸ�");
			
			Scanner sc = new Scanner(System.in);
			String name = "";
			String email = "";
			boolean set = true;
			
			while(set) {
			System.out.println("1.�����Է� 2.��ü��� 3.����");	
			System.out.print("��ȣ�Է� : ");
			count = sc.nextInt();
			
			if(count == 1) {
				System.out.print("�̸� : ");
				name = sc.next();
				System.out.print("�̸��� : ");
				email = sc.next();
				pst.setString(1, name);
				pst.setString(2, email);
				pst.executeUpdate();
			}else if(count == 2) {
				rs = stmt.executeQuery("select * from eventtbl");
				while(rs.next()) {
					name = rs.getString(1);
					System.out.print(name+"\t");
					email = rs.getString(2);
					System.out.println(email);
					
				}
			}else if(count == 3) {
				set = false;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
}
