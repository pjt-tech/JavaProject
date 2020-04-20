package board;

public class BoardVO {
	
	String writer;
	String passwd;
	String email;
	String subject;
	
	public BoardVO(String writer, String passwd, String email, String subject) {
		super();
		this.writer = writer;
		this.passwd = passwd;
		this.email = email;
		this.subject = subject;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String toString() {
		return "累己磊 = " + getWriter() + "  捞皋老 = " + getEmail() + "   力格 = " + getSubject();
	}

}
