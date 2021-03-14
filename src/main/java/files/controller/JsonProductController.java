package files.controller;

import files.product.Product;
import files.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonProductController {

        @Autowired
        ProductRepository productRepository;


        @GetMapping(value = "/json/get", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
        public Product returnProductJson(){
            Product product = productRepository.getProductListById(1);
            return product;
        }
}
