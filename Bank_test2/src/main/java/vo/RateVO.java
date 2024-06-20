package vo;

public class RateVO {
	private int rate_idx;
	private String ttb, tts;
	private String cur_nm, rate_date, cur_unit;

	public String getCur_unit() {
		return cur_unit;
	}

	public void setCur_unit(String cur_unit) {
		this.cur_unit = cur_unit;
	}

	public int getRate_idx() {
		return rate_idx;
	}

	public void setRate_idx(int rate_idx) {
		this.rate_idx = rate_idx;
	}

	public String getCur_nm() {
		return cur_nm;
	}

	public void setCur_nm(String cur_nm) {
		this.cur_nm = cur_nm;
	}

	public String getTtb() {
		return ttb;
	}

	public void setTtb(String ttb) {
		this.ttb = ttb;
	}

	public String getTts() {
		return tts;
	}

	public void setTts(String tts) {
		this.tts = tts;
	}

	public String getRate_date() {
		return rate_date;
	}

	public void setRate_date(String rate_date) {
		this.rate_date = rate_date;
	}
}
