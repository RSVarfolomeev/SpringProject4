package files.controller;

import files.product.Product;
import files.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/xml/get")
    public String returnProductXml(Model model){
        Product product = productRepository.getProductListById(1);
        int id = product.getId();
        String name = product.getName();
        float price = product.getPrice();
        model.addAttribute("id", id);
        model.addAttribute("name", name);
        model.addAttribute("price", price);
        return "index";
    }

    @GetMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public String test(){
        return "test";
    }
}
