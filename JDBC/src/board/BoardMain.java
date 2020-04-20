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
		System.out.println("DB연결성공");
		Connection conn = DriverManager.getConnection(url, user, password);
		
		BoardSVC boardSVC = new BoardSVC();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("====게시판====");
			System.out.println("a.글 등록");
			System.out.println("b.글 목록보기");
			System.out.println("c.글 내용보기");
			System.out.println("d.글 삭제하기");
			System.out.println("e.글 수정하기");
			System.out.println("f.종료");
			System.out.print("메뉴 선택하세요 : ");
			
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
