package mvc.model.board;

public class BoardDTO {
	private int num;
	private String id;
	private String name;
	private String subject;
	private String content;
	private String regist_day;
	private int hit;
	private String ip;
	
	public BoardDTO() {
		super();
	}
	
	public int getNum() {
		return num;
	}
	
	public void setid(String id) {
		this.id = id;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public void setsubject(String subject) {
		this.subject = subject;
	}
	
	public void setcontent(String content) {
		this.content = content;
	}
	
	public void setregist_day(String regist_day) {
		this.regist_day = regist_day;
	}
	
	public int gethit() {
		return hit;
	}
	
	public void setIp(String ip) {
		this.ip = ip;
	}

}
