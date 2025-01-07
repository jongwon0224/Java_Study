package study.db.sample.test;

public class ApisInfo {

	String baseDate, resultCode, resultMsg, fcstDate, fcstTime, fcstValue;
	int ApisNo;

	
	
	public ApisInfo() {
		
	}

	public ApisInfo(String baseDate, String resultCode, String resultMsg, String fcstDate, String fcstTime, String fcstValue) {
		this.baseDate = baseDate;
		this.resultCode = resultCode;
		this.resultMsg = resultMsg;
		this.fcstDate = fcstDate;
		this.fcstTime = fcstTime;
		this.fcstValue = fcstValue;
	}
	
	public String getBaseDate() {
		return baseDate;
	}
	public void setBaseDate(String baseDate) {
		this.baseDate = baseDate;
	}
	
	public String getResultCode() {
		return resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultMsg() {
		return resultMsg;
	}
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getFcstDate() {
		return fcstDate;
	}
	public void setFcstDate(String fcstDate) {
		this.fcstDate = fcstDate;
	}
	public String getFcstTime() {
		return fcstTime;
	}
	public void setFcstTime(String fcstTime) {
		this.fcstTime = fcstTime;
	}
	public String getFcstValue() {
		return fcstValue;
	}
	public void setFcstValue(String fcstValue) {
		this.fcstValue = fcstValue;
	}
	public int getApisNo() {
		return ApisNo;
	}
	public void setApisNo(int apisNo) {
		ApisNo = apisNo;
	}

	@Override
	public String toString() {
		return "ApisInfo [baseDate=" + baseDate + ", resultCode=" + resultCode + ", resultMsg=" + resultMsg + ", fcstDate=" + fcstDate
				+ ", fcstTime=" + fcstTime + ", fcstValue=" + fcstValue + ", ApisNo=" + ApisNo + "]";
	}
	
	
	
}
