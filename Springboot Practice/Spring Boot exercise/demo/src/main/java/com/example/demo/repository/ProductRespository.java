package com.example.demo.repository;

import com.example.demo.model_entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

//public interface ProductService extends CrudRepository<Products, Long> {
//}

//This layer will provide CRUD operations for product entities
public interface ProductRespository extends JpaRepository<Products, Long>{

}