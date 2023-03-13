package com.app.repository;

import java.util.Optional;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.entities.ProductListEntity;


public interface IProductListRepository extends JpaRepository<ProductListEntity,Integer>{
 
	@Query("select c from ProductListEntity c where id=:id")
	public ProductListEntity ListById(int id);

}
