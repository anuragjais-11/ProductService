package com.example.productservice.services;

import com.example.productservice.exceptions.ProductNotFoundException;
import com.example.productservice.models.Category;
import com.example.productservice.models.Product;
import com.example.productservice.repos.CategoryRepo;
import com.example.productservice.repos.ProductRepo;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("SelfProductService")
@Primary
public class SelfProductService implements ProductService {
    private final CategoryRepo categoryRepo;
    ProductRepo productRepo;

    public SelfProductService(ProductRepo productRepo, CategoryRepo categoryRepo) {
        this.productRepo = productRepo;
        this.categoryRepo = categoryRepo;
    }

    @Override
    public Product getProductById(Long id) throws ProductNotFoundException {
        Optional<Product> optionalProduct = productRepo.findById(id);
        if (!optionalProduct.isPresent()) {
            throw new ProductNotFoundException(420, "Product does not exist");
        }
        Product product = optionalProduct.get();
        return product;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product replaceProduct(Long id, Product product) {
        return null;
    }

    @Override
    public Product createProduct(Product product) {
//        Category category = product.getCategory();
//        if(category.getId() == null){
//            Category savedCategory = categoryRepo.save(category);
//            product.setCategory(savedCategory);
//        }else{
//            //check if category is valid or not
//        }
        return productRepo.save(product);
    }
}
