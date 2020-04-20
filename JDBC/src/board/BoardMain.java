package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/boarddb?serverTimezone=UTC";
		String user = "root";
		String password = "1234";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("DB���Ἲ��");
		Connection conn = DriverManager.getConnection(url, user, password);
		
		BoardSVC boardSVC = new BoardSVC();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("====�Խ���====");
			System.out.println("a.�� ���");
			System.out.println("b.�� ��Ϻ���");
			System.out.println("c.�� ���뺸��");
			System.out.println("d.�� �����ϱ�");
			System.out.println("e.�� �����ϱ�");
			System.out.println("f.����");
			System.out.print("�޴� �����ϼ��� : ");
			
			String menu = sc.next();
			switch(menu){
			case "a" : 
				boardSVC.writeArticle(sc,conn);
				break;
			case "b" : 
				boardSVC.selectArticle(conn);
				break;
			case "c" : 
				boardSVC.showArticle(sc,conn);
				break;
			case "d" : 
				boardSVC.deleteArticle(sc,conn);
				break;
			}
		}	
	}
	
}
