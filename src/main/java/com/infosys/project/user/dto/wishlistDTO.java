package com.infosys.project.user.dto;


import com.infosys.project.user.entity.wishlistEntity;

public class wishlistDTO {
	Integer buyerid;
	Integer prodid;
	
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
	//Converts Entity into DTO
    public static wishlistDTO valueOf(wishlistEntity wishlist) {
        wishlistDTO WishListDTO=new wishlistDTO();
        WishListDTO.setBuyerid(wishlist.getBuyerId());
        WishListDTO.setProdid(wishlist.getProdId());
        return WishListDTO;
}
    //Converts DTO into Entity
        public  wishlistEntity createEntity() {
        	wishlistEntity Wish=new wishlistEntity();
            Wish.setBuyerId(this.getBuyerid());
            Wish.setProdId(this.getProdid());
            return Wish;
    }
	
	@Override
	public String toString() {
		return "WishlistDTO [BuyerId="+ buyerid + "ProdId=" +prodid+"]";
	}
	
	

}
