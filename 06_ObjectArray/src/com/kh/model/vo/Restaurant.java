package com.kh.model.vo;

public class Restaurant {

	// 상호, 주소, 메인메뉴
	
	private String storeName;
	private String address;
	private String mainMenu;
	
	// 기본생성자
	// 모든 필드를 매개변수로 갖는 생성자
	// getter()
	// setter()
	// information()
	// 을 구현해주세요 시~작~
	
	// 기본생성자
	public Restaurant() {}
		
	// 모든 필드를 매개변수로 갖는 생성자
	public Restaurant(String storeName, String address, String mainMenu) {
		this.storeName = storeName;
		this.address = address;
		this.mainMenu = mainMenu;
	}
	
	// getter
	public String getstoreName() {
		return storeName;
	}
	
	public String getaddress() {
		return address;
	}
	
	public String getmainMenu() {
		return mainMenu;
	}
	
	
	// setter
	public void setstoreName(String storeName) {
		this.storeName = storeName;
	}
	
	public void address(String address) {
		this.address = address;
	}

	public void setmainMenu(String mainMenu) {
		this.mainMenu = mainMenu;
	}
	
	//information()
	public String information() { 
		return "식당의 정보입니다 ~~ 상호명 : " + storeName + ", 주소지 : " + address + ", 메인메뉴 : " + mainMenu;
	}





}

