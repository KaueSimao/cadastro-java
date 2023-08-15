package br.gov.sp.fatec.productbackend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.productbackend.entites.Product;
import br.gov.sp.fatec.productbackend.repositories.ProductRepository;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository repository; 

    public List<Product> getProducts(){
        return this.repository.findAll();
    }
}
