package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BoardSVC {
	
	Connection conn;
	
	public void writeArticle(Scanner sc,Connection conn) {
			
		System.out.println("===�Խù� ���===");
		System.out.print("�ۼ��� : ");
		String writer = sc.next();
		System.out.print("��� ��ȣ  : ");
		String passwd = sc.next();
		System.out.print("�̸���  : ");
		String email = sc.next();
		System.out.print("���� : ");
		String subject = sc.next()+sc.nextLine();
		
		BoardVO boardVO = new BoardVO(writer,passwd,email,subject);
		try {
			PreparedStatement psmt = conn.prepareStatement("insert into board values(null,?,?,?,?)");
			psmt.setString(1,writer);
			psmt.setString(2,passwd);
			psmt.setString(3,email);
			psmt.setString(4,subject);
			psmt.executeUpdate();
			
			System.out.println("�Խù��� ��ϵǾ����ϴ�");
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
			System.out.println("�� ���뺸��");
			while(rs.next()) {			
			System.out.println("id = "+rs.getInt("id")+", �ۼ��� = " + rs.getString("writer")+
					",�̸���  = " + rs.getString("email")+", ���� =" + rs.getString("subject"));
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
		System.out.println("�˻��� �� ��ȣ�� �Է��ϼ���.");
		System.out.print("�� ��ȣ : ");
		int id = sc.nextInt();
		BoardVO boardVO = getArticle(id);
		if(boardVO!=null) {
			System.out.println(boardVO);
		}else {
			System.out.println("�׸��� �������� �ʽ��ϴ�.");
		}
	}
	
	public void deleteArticle(Scanner sc, Connection conn) {
		this.conn = conn;
		System.out.println("������ �� ��ȣ�� �Է��ϼ���.");
		System.out.print("�� ��ȣ : ");
		int id = sc.nextInt();
		int count = delete(id);
		if(count>0) {
			System.out.println(id+"��° �׸��� �����Ǿ����ϴ�.");
		}else {
			System.out.println("�׸��� �������� �ʽ��ϴ�.");
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
		System.out.println("������ �� ��ȣ�� �Է��ϼ���.");
		System.out.print("�� ��ȣ : ");
		int id = sc.nextInt();
		BoardVO boardVO = getArticle(id);
		if(boardVO!=null) {
		System.out.println("������  �����͸� �Է��ϼ���.");
		System.out.println("���� �ۼ���  : " + boardVO.getWriter());
		System.out.print("������ �ۼ��� : " );
		String writer = sc.next();
		System.out.println("���� ��й�ȣ  : " + boardVO.getPasswd());
		System.out.print("������ ��й�ȣ : " );
		String passwd = sc.next();
		System.out.println("���� �̸���  : " + boardVO.getEmail());
		System.out.print("������ �̸��� : " );
		String email = sc.next();
		System.out.println("���� ����  : " + boardVO.getSubject());
		System.out.print("������ ����  : " );
		String subject = sc.next()+sc.nextLine();
		
		boardVO.setWriter(writer);
		boardVO.setPasswd(passwd);
		boardVO.setEmail(email);
		boardVO.setSubject(subject);
		
		int count = update(boardVO,id);
		if(count>0) {
			System.out.println(id+"��° �׸��� �����Ǿ����ϴ�.");
		}else {
			System.out.println("�׸��� �������� �ʽ��ϴ�.");
		}
		
		}else{
			System.out.println("�׸��� �������� �ʽ��ϴ�.");
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
				System.out.println("�׸��� �������� �ʽ��ϴ�.");
			}
			
			return updateArticle;
	}
}
