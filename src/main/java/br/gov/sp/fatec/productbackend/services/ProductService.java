package br.gov.sp.fatec.productbackend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.productbackend.entites.Product;
import br.gov.sp.fatec.productbackend.repositories.ProductRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository repository; 

    public List<Product> getProducts(){
        return this.repository.findAll();
    }
    public Product getProduct(Long id){
        return this.repository.findById(id)
                                        .orElseThrow(
                                        () -> new EntityNotFoundException("Product not found")
                                        );
    }
    public Product deleteProductById(long id) {
        return;

    }
}
