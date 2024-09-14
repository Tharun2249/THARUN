package com.repository;



import com.entity.CartEntity;

import jakarta.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<CartEntity, Long> {

	@Query("SELECT c FROM CartEntity c WHERE c.user_Id = ?1")   
	@Modifying
    @Transactional
    List<CartEntity> findByUserId( Long userId);
}
