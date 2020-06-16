package com.infosys.project.user.dto;

import com.infosys.project.user.entity.buyerEntity;

public class buyerDTO {
	Integer buyerId;
	String name;
	String email;
	String phoneNumber;
	String password;
	Boolean isPrivileged;
	public Boolean getIsPrivileged() {
		return isPrivileged;
	}
	public void setIsPrivileged(Boolean isPrivileged) {
		this.isPrivileged = isPrivileged;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	Integer rewardPoints;
	Boolean isActive;
	public Integer getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(Integer buyerId) {
		this.buyerId = buyerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getRewardPoints() {
		return rewardPoints;
	}
	public void setRewardPoints(Integer rewardPoints) {
		this.rewardPoints = rewardPoints;
	}

	public buyerDTO() {
		super();
	}
	// Converts Entity into DTO
	public static buyerDTO valueOf(buyerEntity buyer) {
		buyerDTO buyerDTO= new buyerDTO();
//		buyerDTO.setBuyerId(buyer.getBuyerId());
		buyerDTO.setName(buyer.getName());
		buyerDTO.setEmail(buyer.getEmail());
		buyerDTO.setPhoneNumber(buyer.getPhoneNumber());
		buyerDTO.setPassword(buyer.getPassword());
		buyerDTO.setIsPrivileged(buyer.getIsPrivileged());
		buyerDTO.setRewardPoints(buyer.getRewardPoints());
		buyerDTO.setIsActive(buyer.getIsActive());
		return buyerDTO;
	}
		
	@Override
	public String toString() {
		return "BuyerDTO [BuyerId="+ buyerId + "Name=" +name+"Email="+ email +"Phonenumber="+ phoneNumber +"Isprivileged"+ isPrivileged +
				"Rewardpoints="+ rewardPoints + "isactive="+ isActive+"]";
	}
	
	
	public buyerEntity createEntity() {
		buyerEntity buyer=new buyerEntity();
		buyer.setBuyerId(this.getBuyerId());
		buyer.setEmail(this.getEmail());
		buyer.setName(this.getName());
		buyer.setPassword(this.getPassword());
		buyer.setPhoneNumber(this.getPhoneNumber());
		buyer.setIsPrivileged(this.getIsPrivileged());
		buyer.setIsActive(this.getIsActive());
		buyer.setRewardPoints(this.getRewardPoints());
		return buyer;
	}}
