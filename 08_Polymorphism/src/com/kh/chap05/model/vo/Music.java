package com.kh.chap05.model.vo;

public class Music {

	// 클라이언트 요구사항에 따라서 기획 및 설계해야함
	private String code;
	private String title;
	private String lunnigTime;
	
	public Music() {}
	public Music(String code, String title, String lunnigTime) {
		this.code = code;
		this.title = title;
		this.lunnigTime = lunnigTime;
		
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLunningTime() {
		return lunnigTime;
	}

	public void setLunningTime(String lunningTime) {
		this.lunnigTime = lunningTime;
	}
	
	
	

}
