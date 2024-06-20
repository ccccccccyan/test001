package vo;

public class AccountdetailVO {
	private int account_idx, deal_money, send, now_money;
	private String account_number, depo_user, depo_account, bank_date;
	
	public int getAccount_idx() {
		return account_idx;
	}
	public void setAccount_idx(int account_idx) {
		this.account_idx = account_idx;
	}
	public int getDeal_money() {
		return deal_money;
	}
	public void setDeal_money(int deal_money) {
		this.deal_money = deal_money;
	}
	public int getSend() {
		return send;
	}
	public void setSend(int send) {
		this.send = send;
	}
	public int getNow_money() {
		return now_money;
	}
	public void setNow_money(int now_money) {
		this.now_money = now_money;
	}
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	public String getDepo_user() {
		return depo_user;
	}
	public void setDepo_user(String depo_user) {
		this.depo_user = depo_user;
	}
	public String getDepo_account() {
		return depo_account;
	}
	public void setDepo_account(String depo_account) {
		this.depo_account = depo_account;
	}
	public String getBank_date() {
		return bank_date;
	}
	public void setBank_date(String bank_date) {
		this.bank_date = bank_date;
	}
}
