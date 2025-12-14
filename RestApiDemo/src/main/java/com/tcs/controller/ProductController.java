package com.tcs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.entity.Product;
import com.tcs.repository.ProductRepository;

@RestController
public class ProductController {
	
	
	@Autowired
	ProductRepository productrepository;
	
	
	@PostMapping("/addproducts")
	public Product addProduct(@RequestBody Product product) {
		return productrepository.save(product);
	}
	
	
	@GetMapping("/getproduct")
	public List<Product> getProduct(){
		return productrepository.findAll();
	}
	
	@GetMapping("/getproductbyid/{id}")
	public Product getProductById(@PathVariable int id) {
		return productrepository.findById(id).orElseThrow(null);
	}

}
