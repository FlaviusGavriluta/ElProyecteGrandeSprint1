package com.codecool.onlineshop.service;

import com.codecool.onlineshop.model.Cart;
import com.codecool.onlineshop.model.Item;
import com.codecool.onlineshop.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    private final CartRepository cartRepository;

    @Autowired
    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public void addCart(Cart cart) {
        cartRepository.save(cart);
    }

    public void deleteCartById(Long id) {
        cartRepository.deleteById(id);
    }

    public List<Cart> getAllCarts() {
        return cartRepository.findAll();
    }

    public Cart getCardById(Long id) {
        return cartRepository.findById(id).orElseThrow(() -> new RuntimeException("Cart not found with ID: " + id));
    }

    public void addToCart(Cart cart, Item item) {
        cart.addItem(item);
    }
}
