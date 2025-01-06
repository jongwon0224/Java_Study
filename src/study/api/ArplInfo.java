package study.api;

public class ArplInfo {

	/*
	 create table ARPLINFO (
    arplno NUMBER primary key,
    informCode varchar2(64),
    actionknack varchar2(1024),
    informCause varchar2(1024),
    informData varchar2(1024),
    informGrade varchar2(1024),
    imageUrl1 varchar2(1024)
);

	create sequence arplinfo_pk_seq
	start with 1
	increment by 1
	nocycle;
	  */
	
	
	String informCode, actionKnack, informCause, informData, informGrade, imageUrl1;
	int ArplNo; //식별을 위한 pk역할 순번
	
	public ArplInfo() {
		
	}	
	
	public ArplInfo(String informCode, String actionKnack, String informCause, String informData, String informGrade,
			String imageUrl1) {
		super();
		this.informCode = informCode;
		this.actionKnack = actionKnack;
		this.informCause = informCause;
		this.informData = informData;
		this.informGrade = informGrade;
		this.imageUrl1 = imageUrl1;
	}

	
	public String getInformCode() {
		return informCode;
	}

	public void setInformCode(String informCode) {
		this.informCode = informCode;
	}

	public String getActionKnack() {
		return actionKnack;
	}

	public void setActionKnack(String actionKnack) {
		this.actionKnack = actionKnack;
	}

	public String getInformCause() {
		return informCause;
	}

	public void setInformCause(String informCause) {
		this.informCause = informCause;
	}

	public String getInformData() {
		return informData;
	}

	public void setInformData(String informData) {
		this.informData = informData;
	}

	public String getInformGrade() {
		return informGrade;
	}

	public void setInformGrade(String informGrade) {
		this.informGrade = informGrade;
	}

	public String getImageUrl1() {
		return imageUrl1;
	}

	public void setImageUrl1(String imageUrl1) {
		this.imageUrl1 = imageUrl1;
	}
	

	@Override
	public String toString() {
		return "ArplInfo [informCode=" + informCode + ", actionKnack=" + actionKnack + ", informCause=" + informCause
				+ ", informData=" + informData + ", informGrade=" + informGrade + ", imageUrl1=" + imageUrl1
				+ "]";
	}
	
	
	
	
}
