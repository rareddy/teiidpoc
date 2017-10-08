package com.gp.poc.teiidpoc.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.teiid.spring.annotations.JsonTable;

@Entity
@Table (name="external_system_user")
@JsonTable(endpoint="http://10.72.166.59:9090/findAllUsersfromExternal" ,rootIsArray=true)
public class ExternalSystemUser implements Serializable{
	
	@Id
	@Column(name="userid")
	private long userid;
	
	@Column(name="adddate")
	private Timestamp adddate;

	@Column(name="firstname")
	private String firstname;

	@Column(name="lastname")
	private String lastname;

//	@Column(name="passwrod")
//	private String passwrod;

	@Column(name="username")
	private String username;
	
	@Column(name="age")
	private int age;
	
	@Column(name="gender")
	private String gender;


	public ExternalSystemUser() {
		// TODO Auto-generated constructor stub
	}

	public long getUserid() {
		return userid;
	}


	public void setUserid(long userid) {
		this.userid = userid;
	}


	public Timestamp getAdddate() {
		return adddate;
	}


	public void setAdddate(Timestamp adddate) {
		this.adddate = adddate;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


//	public String getPasswrod() {
//		return passwrod;
//	}
//
//
//	public void setPasswrod(String passwrod) {
//		this.passwrod = passwrod;
//	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	
	
	

}
