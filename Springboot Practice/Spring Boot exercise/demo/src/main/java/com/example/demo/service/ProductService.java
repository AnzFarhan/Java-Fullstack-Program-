package com.example.demo.service;

import com.example.demo.ProductNotFoundException;
import com.example.demo.model_entity.Products;
import com.example.demo.repository.ProductRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ProductService {

    @Autowired
    ProductRespository productRespository;

    public Products createProduct(Products products){
        return productRespository.save(products);
    }

    public Products getProductById(Long id){
        return productRespository.findById(id).orElseThrow(()->
                new ProductNotFoundException("Product not found with id " + id));
    }

//    public Optional<Products> updateProduct(Long id, Products products){
//        return productRespository.findById(id)
//                .map(existingProduct -> {
//                    existingProduct.setName(products.getName());
//                    existingProduct.setPrice(products.getPrice());
//                    existingProduct.setDescription(products.getDescription());
//                    return existingProduct;
//        });
//    }

//    public Products updateProduct(Long id,Products products){
//         (productRespository.findAll((Pageable) products))
//                .map(existingProduct -> {
//                    existingProduct.setName(products.getName());
//                    existingProduct.setPrice(products.getPrice());
//                    existingProduct.setDescription(products.getDescription());
//                    return existingProduct;
//                });
//        return productRespository.findById(id).orElseThrow(() ->
//        new NoSuchCustomerExistsException("Product with ID " + id + " not found."));
//    }

    public Products updateProduct(Long id, Products products) {
        Products product = getProductById(id);  // throw with exception

        product.setName(products.getName());
        product.setPrice(products.getPrice());
        product.setDescription(products.getDescription());

        return productRespository.save(products);
    }

    public void deleteProductById(Long id){
        Products product = getProductById(id);
         productRespository.delete(product);
    }

//    public void deleteProduct(Long id) {
//        Products product = productRespository.findById(id)
//                .orElseThrow(() -> new RuntimeException("Product not found"));
//
//        productRespository.delete(product);
//    }
}
