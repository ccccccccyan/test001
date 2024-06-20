package vo;

public class RateboardcommVO {
	private int c_board_idx, r_board_idx;
	private String name, content, user_id;
	
	public int getC_board_idx() {
		return c_board_idx;
	}
	public void setC_board_idx(int c_board_idx) {
		this.c_board_idx = c_board_idx;
	}
	public int getR_board_idx() {
		return r_board_idx;
	}
	public void setR_board_idx(int r_board_idx) {
		this.r_board_idx = r_board_idx;
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
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
}
