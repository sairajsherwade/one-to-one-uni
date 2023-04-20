package com.jsp.person.pan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Chasis {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String  chasisno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getChasisno() {
		return chasisno;
	}
	public void setChasisno(String chasisno) {
		this.chasisno = chasisno;
	}
	
	

}
