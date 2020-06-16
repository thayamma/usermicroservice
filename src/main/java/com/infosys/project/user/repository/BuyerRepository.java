package com.infosys.project.user.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infosys.project.user.entity.buyerEntity;


@Repository
public interface BuyerRepository extends JpaRepository<buyerEntity, Integer>{







	buyerEntity findByEmail(String email);

	void deleteById(Integer buyerid);



}
