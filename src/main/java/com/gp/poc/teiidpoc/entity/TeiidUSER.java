package com.gp.poc.teiidpoc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.teiid.spring.annotations.SelectQuery;

/*
 * age and gender are missing in system which are available in other system
 * hosted at http://<other_system_ip>:9090/findAllUsersfromExternal make getters and
 * setters for them in this class
 */
@Entity
@Table (name="TEIIDLOCALUSER")
@SelectQuery( " select 	thisAppUser.userid," +    
		 	" 			externalUser.age,"    
		 +" 			thisAppUser.firstname,"    
		 +" 			externalUser.gender "     
		 +" 			thisAppUser.username,"     
		 +" 	from 	teiiduserganesh.TEIIDLOCALUSER as thisAppUser,"    
		 +" 			external_system_user as externalUser "    
		 +" 	WHERE 	thisAppUser.username=externalUser.username ")   
public class TeiidUSER implements Serializable {

	@Id
	@Column(name="userid")
	private long userid;

	@Column(name="firstname")
	private String firstname;

	@Column(name="username")
	private String username;

	private int age;

	private String gender;

	public TeiidUSER() {
		// TODO Auto-generated constructor stub
	}

	public long getUserid() {
		return userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

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
