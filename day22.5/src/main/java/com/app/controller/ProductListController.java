package com.app.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.UserDTO;
import com.app.entities.ProductListEntity;
import com.app.entities.UserEntity;
import com.app.repository.IProductListRepository;
import com.app.repository.UserRepository;
import com.app.service.IProductListService;
import com.app.service.ProductListServiceImpl;

import lombok.extern.slf4j.Slf4j;
@RestController
@RequestMapping("/Lists")
@Slf4j
public class ProductListController {

	@Autowired
	IProductListRepository repo;
	
	@Autowired
	ProductListServiceImpl repoImpl;
	
	@Autowired
	IProductListService ser;
	
	@Autowired
	public ModelMapper mapper;
	
	@PostMapping({"/add"}) 
	public ProductListEntity addlist(@RequestBody ProductListEntity lists) {
		ProductListEntity list = mapper.map(lists, ProductListEntity.class);
		return ser.addList(list);
	}
	
	@PutMapping("/update/{id}")  
	public void updateList(@RequestBody ProductListEntity updatelists, @PathVariable int id ) {
		repoImpl.updateList(updatelists, id);
	
	}
	
	@GetMapping("/getList") 
	public List<ProductListEntity> list(){
		return repoImpl.getAllList();
	}
	
	@DeleteMapping("/delete/{id}")  
	public ProductListEntity deleteList(@PathVariable int id) {
		return repoImpl.deleteList(id);
	}

	
}
