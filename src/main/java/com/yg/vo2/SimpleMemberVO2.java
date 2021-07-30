package com.yg.vo2;

public class SimpleMemberVO2 {
	private String name;
	private String regNo;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = (int)(Math.random()*10000)+"";
	}
	
	
}
