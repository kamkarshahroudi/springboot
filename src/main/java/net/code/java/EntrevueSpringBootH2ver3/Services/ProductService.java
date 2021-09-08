package net.code.java.EntrevueSpringBootH2ver3.Services;

import java.util.List;

import net.code.java.EntrevueSpringBootH2ver3.Model.Product;



public interface ProductService {
	Product createProduct(Product product);

	Product updateProduct(Product product);

	List<Product> getAllProduct();

	Product getProductById(long productId);

	void deleteProduct(long id);

}
