package vo;

public class NoticeVO {
	private int r_notice_idx;
	private String subject, name, content;
	
	public int getR_notice_idx() {
		return r_notice_idx;
	}
	public void setR_notice_idx(int r_notice_idx) {
		this.r_notice_idx = r_notice_idx;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
