package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class Jdbc_Ex1 {

	public static void main(String[] args) {
		
	 try {
		 
		 	Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/girlgroupdb?serverTimezone=UTC","root","1234");
			System.out.println("DB ���� ����");
			
			Statement stmt = conn.createStatement();
			//ResultSet rs = stmt.executeQuery("select * from membertbl");
			//ResultSet rs = stmt.executeQuery("select singer,age from membertbl");
			//printItem(rs,"","","singer","age");
			
			PreparedStatement ppst = conn.prepareStatement("select singer,age from membertbl where groupname like ?");
			Scanner in = new Scanner(System.in);
			System.out.print("��ȸ�� �ɱ׷� �̸��� �Է��ϼ��� : ");
			String name = in.next();
			ppst.setString(1, "%"+name+"%");
			ResultSet rs = ppst.executeQuery();
			printItem(rs,"","","singer","age");
			rs.close();
			conn.close();
			
			
	} catch (ClassNotFoundException e) {
		System.out.println("DB ���� ���� , ����̹� ����");
		
	} catch (SQLException e) {
		System.out.println("DB ���� ���� , sql����������");
	}

	}
	
	public static void printItem(ResultSet rs, String item1,String item2,String item3,String item4) throws SQLException {
		
		while(rs.next()) {
			if(!item1.equals("")){
				System.out.print(rs.getInt(item1));
			}if(!item2.equals("")) {
				System.out.print("\t|\t"+rs.getString(item2));
			}if(!item3.equals("")) {
				System.out.print("\t|\t"+rs.getString(item3));
			}if(!item4.equals("")) {
				System.out.print("\t|\t"+rs.getInt(item4)+"\n");
			}else {
				System.out.println();
			}
		}
	
	}
}
