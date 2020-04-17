package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Event_Ex {

	public static void main(String[] args) {
		
		int count = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/?serverTimezone=UTC","root","1234");
			System.out.println("DB연결성공");
			Statement stmt = conn.createStatement();
			//stmt.execute("create database eventdb");
			Scanner sc = new Scanner(System.in);
			System.out.println("1.정보입력 2.전체출력 3.종료");
			count = sc.nextInt();
			if(count == 1) {
				System.out.println("이름 : ");
				String name = sc.nextLine();
				System.out.println("이메일 : ");
				String mail = sc.nextLine();
			}else if(count == 2) {
				
			}
			
			
		} catch (Exception e) {
		
			e.printStackTrace();
			
		}
	}
}
