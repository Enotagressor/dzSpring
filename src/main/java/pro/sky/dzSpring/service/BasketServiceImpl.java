package pro.sky.dzSpring.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
@Scope("prototype")
public class BasketServiceImpl implements BasketService{

    private List<Integer> basket;

    public BasketServiceImpl(List<Integer> id, List<Integer> basket) {
        this.basket = new ArrayList<>();
    }

    @Override
    public Collection<Integer> getProduct() {
        return Collections.unmodifiableCollection(basket);
    }

    @Override
    public void addProduct(List<Integer> id) {
        basket = new ArrayList<>(id);
    }
}
