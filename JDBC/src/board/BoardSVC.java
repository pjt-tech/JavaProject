package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BoardSVC {
	
	Connection conn;
	
	public void writeArticle(Scanner sc,Connection conn) {
			
		System.out.println("===게시물 등록===");
		System.out.print("작성자 : ");
		String writer = sc.next();
		System.out.print("비밀 번호  : ");
		String passwd = sc.next();
		System.out.print("이메일  : ");
		String email = sc.next();
		System.out.print("제목 : ");
		String subject = sc.next()+sc.nextLine();
		
		BoardVO boardVO = new BoardVO(writer,passwd,email,subject);
		try {
			PreparedStatement psmt = conn.prepareStatement("insert into board values(null,?,?,?,?)");
			psmt.setString(1,writer);
			psmt.setString(2,passwd);
			psmt.setString(3,email);
			psmt.setString(4,subject);
			psmt.executeUpdate();
			
			System.out.println("게시물이 등록되었습니다");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public void selectArticle(Connection conn) {
		ResultSet rs = null;
		this.conn = conn;
		try {
			PreparedStatement psmt1 = conn.prepareStatement("use boarddb");
			psmt1.executeQuery();
			PreparedStatement psmt = conn.prepareStatement("select * from board");
			rs = psmt.executeQuery();
			System.out.println("글 내용보기");
			while(rs.next()) {			
			System.out.println("id = "+rs.getInt("id")+", 작성자 = " + rs.getString("writer")+
					",이메일  = " + rs.getString("email")+", 제목 =" + rs.getString("subject"));
			}	
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
	}
	
	public BoardVO getArticle(int id) {
		ResultSet rs = null;
		BoardVO boardVO = null;
		PreparedStatement psmt;
		try {
			psmt = conn.prepareStatement("select * from board where id=?");
			psmt.setInt(1,id);
			rs = psmt.executeQuery();
			if(rs.next()) {
				int dbid = rs.getInt("id");
				String writer = rs.getString("writer");
				String passwd = rs.getString("passwd");
				String email = rs.getString("email");
				String subject = rs.getString("subject");
				if(!(email.isEmpty())) {
					boardVO = new BoardVO(writer,passwd,email,subject);
					return boardVO;
				}else {
					return null;
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return boardVO;
		
	}
	
	public void showArticle(Scanner sc,Connection conn) {
		this.conn = conn;
		System.out.println("검색할 글 번호를 입력하세요.");
		System.out.print("글 번호 : ");
		int id = sc.nextInt();
		BoardVO boardVO = getArticle(id);
		if(boardVO!=null) {
			System.out.println(boardVO);
		}else {
			System.out.println("항목이 존재하지 않습니다.");
		}
	}
	
	public void deleteArticle(Scanner sc, Connection conn) {
		this.conn = conn;
		System.out.println("삭제할 글 번호를 입력하세요.");
		System.out.print("글 번호 : ");
		int id = sc.nextInt();
		int count = delete(id);
		if(count>0) {
			System.out.println(id+"번째 항목이 삭제되었습니다.");
		}else {
			System.out.println("항목이 존재하지 않습니다.");
		}
	}
	
	public int delete(int id) {
		int deleteArticle = 0;
		PreparedStatement psmt;
		try {
			psmt = conn.prepareStatement("delete from board where id=?");
			psmt.setInt(1,id);
			deleteArticle = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return deleteArticle;
		
	}
	
	public void updateArticle(Scanner sc,Connection conn) {
		this.conn = conn;
		System.out.println("수정할 글 번호를 입력하세요.");
		System.out.print("글 번호 : ");
		int id = sc.nextInt();
		BoardVO boardVO = getArticle(id);
		if(boardVO!=null) {
		System.out.println("수정할  데이터를 입력하세요.");
		System.out.println("원래 작성자  : " + boardVO.getWriter());
		System.out.print("수정할 작성자 : " );
		String writer = sc.next();
		System.out.println("원래 비밀번호  : " + boardVO.getPasswd());
		System.out.print("수정할 비밀번호 : " );
		String passwd = sc.next();
		System.out.println("원래 이메일  : " + boardVO.getEmail());
		System.out.print("수정할 이메일 : " );
		String email = sc.next();
		System.out.println("원래 제목  : " + boardVO.getSubject());
		System.out.print("수정할 제목  : " );
		String subject = sc.next()+sc.nextLine();
		
		boardVO.setWriter(writer);
		boardVO.setPasswd(passwd);
		boardVO.setEmail(email);
		boardVO.setSubject(subject);
		
		int count = update(boardVO,id);
		if(count>0) {
			System.out.println(id+"번째 항목이 수정되었습니다.");
		}else {
			System.out.println("항목이 존재하지 않습니다.");
		}
		
		}else{
			System.out.println("항목이 존재하지 않습니다.");
		}
	}	
	
	public int update(BoardVO boardVo, int id) {
		
		int updateArticle  = 0;
		PreparedStatement psmt;
			try {
				psmt = conn.prepareStatement("update board set writer=?,passwd=?,email=?,subject=? where id=?");
				psmt.setString(1, boardVo.getWriter());
				psmt.setString(2, boardVo.getPasswd());
				psmt.setString(3, boardVo.getEmail());
				psmt.setString(4, boardVo.getSubject());
				psmt.setInt(5,id);
				updateArticle = psmt.executeUpdate();
				
			} catch (SQLException e) {
				System.out.println("항목이 존재하지 않습니다.");
			}
			
			return updateArticle;
	}
}
