package com.login.model.dto;

public class Member {
	
	private String id;
	private String pw;
	private String pw2;
	private String name;
	private int age;
	private String region;
	
	public Member() {
	}

	public Member(String id, String pw, String pw2, String name, int age, String region) {
		super();
		this.id = id;
		this.pw = pw;
		this.pw2 = pw2;
		this.name = name;
		this.age = age;
		this.region = region;
	}
	
	

	public Member(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getPw2() {
		return pw2;
	}

	public void setPw2(String pw2) {
		this.pw2 = pw2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", pw2=" + pw2 + ", name=" + name + ", age=" + age + ", region="
				+ region + "]";
	}
	
	
	
	

}
