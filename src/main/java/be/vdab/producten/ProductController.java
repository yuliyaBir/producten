package be.vdab.producten;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;

@RestController
public class ProductController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @GetMapping("/")
    List<Product> findAll(){
        logger.info("GET request naar alle producten");
        var random = new Random();
        var totaal = BigDecimal.ZERO;
        for (var teller = 0; teller < 7_000_000; teller++) {
            totaal = totaal.add(BigDecimal.valueOf(random.nextDouble()));
        }
        return List.of(
                new Product(1, "appel"),
                new Product(2, "peer"),
                new Product(3, "noot"));
    }
}
