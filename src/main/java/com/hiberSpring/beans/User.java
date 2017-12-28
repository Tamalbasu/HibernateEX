package com.hiberSpring.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="User")
public class User {
   @Id
	private int userId;
	private String name;
	private int phnNo;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhnNo() {
		return phnNo;
	}
	public void setPhnNo(int phnNo) {
		this.phnNo = phnNo;
	}
	
	
	
	
	
	
}
