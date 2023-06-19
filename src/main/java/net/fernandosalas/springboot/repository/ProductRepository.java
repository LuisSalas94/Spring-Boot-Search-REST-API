package net.fernandosalas.springboot.repository;
import net.fernandosalas.springboot.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Using JPQL (Java Persistence Query Language)
    @Query("SELECT p FROM Product p WHERE " +
            "p.name LIKE CONCAT('%',:query, '%')" +
            "OR p.description LIKE CONCAT('%',:query, '%')")
    List<Product> searchProducts(String query);

    // Native SQL
    @Query(value = "SELECT * FROM Product p WHERE " +
            "p.name LIKE CONCAT('%',:query, '%')" +
            "OR p.description LIKE CONCAT('%',:query, '%')", nativeQuery = true)
    List<Product> searchProductsSQL(String query);
}
