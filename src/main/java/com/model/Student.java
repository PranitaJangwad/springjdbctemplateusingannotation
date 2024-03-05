package com.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component(value="s1")
public class Student {
	private int sid;
	private String sname;
	private String scity;
	private double spercentage;

	public Student() {
		System.out.println("my student object is present");
	}
	@Bean
	public void M2() {
		System.out.println("we are in m2");
	}
	@Bean
	public void M() {
		System.out.println("we are in m3");
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", scity=" + scity + ", spercentage=" + spercentage + "]";
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getScity() {
		return scity;
	}

	public void setScity(String scity) {
		this.scity = scity;
	}

	public double getSpercentage() {
		return spercentage;
	}

	public void setSpercentage(double spercentage) {
		this.spercentage = spercentage;
	}

}
