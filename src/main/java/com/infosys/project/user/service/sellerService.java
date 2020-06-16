package com.infosys.project.user.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.project.user.dto.loginDTO;
import com.infosys.project.user.dto.sellerDTO;

import com.infosys.project.user.entity.sellerEntity;

import com.infosys.project.user.repository.SellerRepository;
import com.infosys.project.user.validator.SellerValidator;
import com.infosys.project.user.validator.validator;

@Service
public class sellerService {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	SellerRepository sellerRepository;
	public String registerSeller(sellerDTO sellerDTO) throws Exception {
		try {
			SellerValidator.sellerValidate(sellerDTO);
			logger.info("Registration request for user {}", sellerDTO);
			sellerEntity be=sellerDTO.createEntity();
			sellerRepository.save(be);
			return ("new user new created");
		}
		catch(Exception e) {
		throw new Exception ("Exception occured");
		}
	}
	
	public boolean Sellerlogin(loginDTO loginDTO) {
		
		logger.info("Login request for customer {} with password {}", loginDTO.getEmail(), loginDTO.getPassword());
		validator.emailid(loginDTO.getEmail());
		sellerEntity optBuyer = sellerRepository.findByEmail(loginDTO.getEmail());
		if (optBuyer.getPassword().equals(loginDTO.getPassword())) {
				return true;
			}
		return false;
	}
	
	public void removeseller(Integer sellerid) {
		sellerRepository.deleteById(sellerid);
	}
}





