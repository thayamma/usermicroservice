package com.infosys.project.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.infosys.project.user.entity.wishlistEntity;

public interface WishlistRepository extends JpaRepository<wishlistEntity, Integer>{
	

}

