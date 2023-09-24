package com.user.entity;

public class Contact {
		
	private Long cId;
	private String email;
	private String contactNmae;
	
	
	private Long userId;


	public Long getcId() {
		return cId;
	}


	public void setcId(Long cId) {
		this.cId = cId;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getContactNmae() {
		return contactNmae;
	}


	public void setContactNmae(String contactNmae) {
		this.contactNmae = contactNmae;
	}


	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}


	public Contact(Long cId, String email, String contactNmae, Long userId) {
		super();
		this.cId = cId;
		this.email = email;
		this.contactNmae = contactNmae;
		this.userId = userId;
	}
	
	
	public Contact() {
	}
	
	
	
	
}
