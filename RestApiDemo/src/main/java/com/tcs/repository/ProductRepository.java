package com.tcs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{ //Integer(Wrapper class) is data type of the primary key

}
