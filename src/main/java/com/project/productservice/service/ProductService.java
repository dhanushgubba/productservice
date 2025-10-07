package com.project.productservice.service;

import java.util.List;
import java.util.Optional;

import com.project.productservice.model.Product;

public interface ProductService {
	
	Product addProduct(Product product);
	List<Product> viewAllProducts();
	Optional<Product> getProductById(Long id);
	List<Product> getProductByCategory(String category);
	List<Product> searchProducts(String keyword);
	Product updateProduct(Long id,Product updatedProduct);
	void deleteProduct(Long id);
}
