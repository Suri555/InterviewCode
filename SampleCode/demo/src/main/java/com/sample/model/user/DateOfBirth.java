package com.sample.model.user;

public class DateOfBirth {

	private String date;
	private int age;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "DateOfBirth [date=" + date + ", age=" + age + "]";
	}
	
	

}
