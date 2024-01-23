package be.vdab.producten;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @GetMapping("/")
    List<Product> findAll(){
        logger.info("GET request naar alle producten");
        return List.of(
                new Product(1, "appel"),
                new Product(2, "peer"),
                new Product(3, "noot"));
    }
}
