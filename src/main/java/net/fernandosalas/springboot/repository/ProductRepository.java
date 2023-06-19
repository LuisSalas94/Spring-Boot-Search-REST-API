package net.fernandosalas.springboot.repository;

import net.fernandosalas.springboot.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
