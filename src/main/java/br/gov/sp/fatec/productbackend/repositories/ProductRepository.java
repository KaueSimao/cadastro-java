package br.gov.sp.fatec.productbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.productbackend.entites.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {
    

}
