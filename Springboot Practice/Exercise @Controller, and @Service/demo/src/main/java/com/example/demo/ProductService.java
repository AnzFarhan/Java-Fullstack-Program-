package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    Product product;

    private final List<Product> products = new ArrayList<>();

    public List<Product> getAllProducts(){

        return new ArrayList<>();
    }

//    public Long getProductById(Long id ){
//        return product.getId();
//    }

    public Optional<Product> getProductById(Long id) {
        return products.stream()
                .filter(product -> product.getId().equals(id)).findFirst();
    }

    public Product createProduct(Product product){
        products.add(product);
        return product;
    }

    public Optional<Product> updateProduct(Long id, Product product){
        return getProductById(id).map(existingProduct ->{
            existingProduct.setName(product.getName());
            existingProduct.setDescription(product.getDescription());
            existingProduct.setPrice(product.getPrice());
            return existingProduct;
        });
    }

    public boolean deleteProduct(Long id){

        return products.removeIf(product -> product.getId().equals(id));
    }



}
