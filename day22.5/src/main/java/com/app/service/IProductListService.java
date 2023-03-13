package com.app.service;

import java.util.List;

import com.app.entities.ProductListEntity;


public interface IProductListService {

ProductListEntity addList (ProductListEntity product);
	
	public void updateList(ProductListEntity updateLists, int id);
	
	public List<ProductListEntity> getAllList();
	
	public ProductListEntity deleteList(int id);
}
