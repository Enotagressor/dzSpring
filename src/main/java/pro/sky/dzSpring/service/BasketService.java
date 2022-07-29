package pro.sky.dzSpring.service;


import java.util.Collection;
import java.util.List;

public interface BasketService {

    Collection<Integer> getProduct();

    void addProduct(List<Integer> id);
}
