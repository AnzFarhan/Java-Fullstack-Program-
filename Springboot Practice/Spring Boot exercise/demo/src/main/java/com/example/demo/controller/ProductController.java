package com.example.demo.controller;

import com.example.demo.model_entity.Products;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping
    public ResponseEntity<Products> createNewProducts(@RequestBody Products products){
        Products createdProducts = productService.createProduct(products);
        return ResponseEntity.ok(createdProducts);
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Products> getProductId(@PathVariable Long id){
        Products products = productService.getProductById(id);
        return ResponseEntity.ok(products);
    }

    @PutMapping("/products/{id}")
    public ResponseEntity<Products> updateProducts(@PathVariable Long id, @RequestBody Products products){
        Products updatedProduct = productService.updateProduct(id, products);
        return ResponseEntity.ok(updatedProduct);
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id){
        productService.deleteProductById(id);
        return ResponseEntity.noContent().build();
    }
}
