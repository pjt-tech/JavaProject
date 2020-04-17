package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbc_Ex2 {

	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/girlgroupdb?serverTimezone=UTC","root","1234");
			System.out.println("DB ���� ����");
			Statement stmt = conn.createStatement();
			//stmt.executeUpdate("insert into grouptbl values('BLACKPINK',4,'2016-08-08')");
			stmt.executeUpdate("insert into membertbl values(null,'BLACKPINK','����',26,'1995-01-03')");
			//stmt.executeUpdate("update membertbl set age = age+1 where singer='����'");
			//PreparedStatement ppst = conn.prepareStatement("delete from membertbl where singer=?");
			/*
			Scanner in = new Scanner(System.in);
			System.out.print("������ �̸��� �Է��ϼ��� : ");
			String name = in.next();
			ppst.setString(1, name);
			ppst.executeUpdate();
			*/
			printItem(stmt);
			
			conn.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void printItem(Statement stmt) throws SQLException {
		ResultSet rs = stmt.executeQuery("select * from membertbl");
		while(rs.next()) {
			System.out.print(rs.getInt(1));
			System.out.print("\t|\t"+rs.getString(2));
			System.out.print("\t|\t"+rs.getString(3));
			System.out.print("\t|\t"+rs.getInt(4)+"\n");
		}
		
	}
}
