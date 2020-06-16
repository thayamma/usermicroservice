package com.infosys.project.user.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.project.user.dto.loginDTO;
import com.infosys.project.user.dto.ProductDTO;
import com.infosys.project.user.dto.buyerDTO;
import com.infosys.project.user.dto.cartDTO;
import com.infosys.project.user.dto.wishlistDTO;
import com.infosys.project.user.entity.buyerEntity;
import com.infosys.project.user.entity.cartEntity;
import com.infosys.project.user.entity.wishlistEntity;
import com.infosys.project.user.repository.BuyerRepository;
import com.infosys.project.user.repository.CartRepository;
import com.infosys.project.user.repository.WishlistRepository;
import com.infosys.project.user.validator.validator;



@Service
public class buyerService {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	BuyerRepository buyerRepository;
	
	@Autowired
	WishlistRepository wishlistRepository;
	
	@Autowired
	CartRepository cartRepository;
	
	
//	public boolean register(BuyerDTO buyerDto) throws Exception {
//		Validator.buyerValidate(buyerDto);
//		try {
//		Buyer buyer=buyerDto.register(buyerDto);
//		buyerRepository.save(buyer);
//		return true;
//		}catch (Exception e){
//			return false;
//		}
//}
	public String registerUser(buyerDTO buyerDTO) throws Exception {
		logger.info("Registration request for user {}", buyerDTO);
		//System.out.println(" not ok");
		buyerEntity be=buyerDTO.createEntity();
		//System.out.println("ok");
		validator.buyerValidate(buyerDTO);
		System.out.println("doctor");
		buyerRepository.save(be);
		return("New User New Created");
		}


public boolean Buyerlogin(loginDTO loginDTO) {
		
		logger.info("Login request for customer {} with password {}", loginDTO.getEmail(), loginDTO.getPassword());
		validator.emailid(loginDTO.getEmail());
		buyerEntity optionalBuyer = buyerRepository.findByEmail(loginDTO.getEmail());
		if (optionalBuyer.getPassword().equals(loginDTO.getPassword())) {
				return true;
			}
		return false;
	}
		
		

		
		public void removebuyer(Integer buyerid) {
			buyerRepository.deleteById(buyerid);
		}
		

		
	
		public void addtowishlist(ProductDTO prodDTO) {
		System.out.println("in service");
		wishlistDTO Wish=new wishlistDTO();
		Wish.setBuyerid(543);
		Wish.setProdid(prodDTO.getProdid());
		
	
			wishlistDTO wishlist= new wishlistDTO();
			wishlistEntity wishentity= Wish.createEntity();
			wishlistRepository.save(wishentity);

		
	}
	public void delete(Integer buyerid) {
		
		wishlistRepository.deleteById(buyerid);
		
	}
	public void addtocart(cartDTO cartDTO) {
		System.out.println("in service");
		cartDTO cart1=new cartDTO();
		cart1.setBuyerid(500);
		cart1.setProdid(cartDTO.getProdid());
		cart1.setQuantity(cartDTO.getQuantity());
		cartEntity cart2= cart1.createEntity();
		cartRepository.save(cart2);

		
	}
	
	

}
