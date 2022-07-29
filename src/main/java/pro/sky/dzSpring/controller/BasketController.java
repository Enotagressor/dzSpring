package pro.sky.dzSpring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.dzSpring.service.BasketService;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(path = "/order")
public class BasketController {
    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public String add(@RequestParam("id") List<Integer> id) {
            basketService.addProduct(id);
        return "Products add in Basket";
    }

    @GetMapping("/get")
    public Collection<Integer> get(){
        return basketService.getProduct();
    }
}
