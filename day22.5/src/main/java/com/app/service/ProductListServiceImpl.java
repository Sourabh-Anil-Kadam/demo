package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entities.ProductListEntity;
import com.app.repository.IProductListRepository;

@Service
@Transactional
public class ProductListServiceImpl implements IProductListService {
	@Autowired
	public IProductListRepository repo;

	@Override
	public ProductListEntity addList(ProductListEntity product) {
		// TODO Auto-generated method stub
		return repo.save(product);
	}

	@Override
	public void updateList(ProductListEntity updateLists, int id) {
		// TODO Auto-generated method stub
		ProductListEntity list = repo.ListById(id);	
		list.setListId(id);
		list.setName(updateLists.getName());
		list.setDescription(updateLists.getDescription());
		list.setQuantity(updateLists.getQuantity());
		list.setAddnote(updateLists.getAddnote());
		
		repo.save(list);
	}
	
	

	@Override
	public List<ProductListEntity> getAllList() {
		// TODO Auto-generated method stub
		return repo.findAll();	}

	@Override
	public ProductListEntity deleteList(int id) {
		// TODO Auto-generated method stub
		ProductListEntity deleteList = repo.ListById(id);
		repo.deleteById(deleteList.getListId());
		return deleteList;
	}

}
