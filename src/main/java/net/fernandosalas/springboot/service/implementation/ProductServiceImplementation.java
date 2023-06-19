package net.fernandosalas.springboot.service.implementation;
import lombok.AllArgsConstructor;
import net.fernandosalas.springboot.entity.Product;
import net.fernandosalas.springboot.repository.ProductRepository;
import net.fernandosalas.springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImplementation implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> searchProducts(String query) {
       List<Product> productList = productRepository.searchProducts(query);
       return productList;
    }
}
