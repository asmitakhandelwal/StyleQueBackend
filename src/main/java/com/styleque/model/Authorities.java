package com.styleque.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import java.io.Serializable;
@Entity
@Component
public class Authorities implements Serializable {
	
	  @Id
	  @GeneratedValue
	  private int authorityId;
	  private String username;
	  private String role;
	  
	public int getAuthorityId() {
		return authorityId;
	}
	public void setAuthorityId(int authorityId) {
		this.authorityId = authorityId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	}
	  
	 