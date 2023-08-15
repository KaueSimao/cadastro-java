package br.gov.sp.fatec.productbackend.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.productbackend.entites.Product;
import br.gov.sp.fatec.productbackend.services.ProductService;

@RestController
@RequestMapping("products")
public class ProductController {

    @Autowired
    private ProductService service;
    
    @GetMapping
    public List<Product> getProducts(){
        return this.service.getProducts();
    }
}
