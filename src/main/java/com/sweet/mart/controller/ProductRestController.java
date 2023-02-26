package com.sweet.mart.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sweet.mart.dao.ProductDAO;
import com.sweet.mart.model.Product;


@RestController
@CrossOrigin
@RequestMapping("/product")
public class ProductRestController {

	@Autowired
	ProductDAO productDAO;
		
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<Product> getAllProduct(){
			
		return productDAO.getAllProduct();
			
	}	
}
