package vo;

public class AccountVO {
	private String account_number, user_id, bank_name;
	private int now_money;
	
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public int getNow_money() {
		return now_money;
	}
	public void setNow_money(int now_money) {
		this.now_money = now_money;
	}
}
