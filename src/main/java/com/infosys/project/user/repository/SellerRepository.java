package com.infosys.project.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infosys.project.user.entity.sellerEntity;


@Repository
public interface SellerRepository extends JpaRepository<sellerEntity, Integer>{

	sellerEntity findByEmail(String email);

	

}

