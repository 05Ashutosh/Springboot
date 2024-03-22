package org.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Add your service methods here
    public Product addProduct(ProductDTO productDTO) {
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setDescription(productDTO.getDescription());
        product.setPrice(productDTO.getPrice());
        product.setStockQty(productDTO.getStockQty());
        product.setProductImg(productDTO.getProductImg());
        product.setLastUpdated(productDTO.getLastUpdated());
        product.setCategoryId(productDTO.getCategoryId());

        return productRepository.save(product);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> getProductsByCategory(Integer categoryId) {
        return productRepository.findByCategoryId(categoryId);
    }

}