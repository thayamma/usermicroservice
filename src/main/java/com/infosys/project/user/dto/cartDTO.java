package com.infosys.project.user.dto;

import com.infosys.project.user.entity.cartEntity;

public class cartDTO {
	Integer buyerid;
	Integer prodid;
	Integer quantity;
	public Integer getBuyerid() {
		return buyerid;
	}
	public void setBuyerid(Integer buyerid) {
		this.buyerid = buyerid;
	}
	public Integer getProdid() {
		return prodid;
	}
	public void setProdid(Integer prodid) {
		this.prodid = prodid;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	//Converts Entity into DTO
    public static cartDTO valueOf(cartEntity cart) {
        cartDTO cartDTO=new cartDTO();
        cartDTO.setBuyerid(cart.getBuyerId());
        cartDTO.setProdid(cart.getProdId());
        cartDTO.setQuantity(cart.getQuantity());
        return cartDTO;
}
    //Converts DTO into Entity
        public  cartEntity  createEntity() {
            cartEntity Cart=new cartEntity();
            Cart.setBuyerId(this.getBuyerid());
            Cart.setProdId(this.getProdid());
            Cart.setQuantity(this.getQuantity());
            return Cart;
    }
	
	@Override
	public String toString() {
		return "CartDTO [BuyerId="+ buyerid + "ProdId=" + prodid+ "Quantity="+ quantity +"]";
	}
   
}
