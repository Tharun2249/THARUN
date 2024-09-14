package com.controller;

import com.entity.CartEntity;
import com.model.CartRequest;
import com.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping("/add/{userId}")
    public CartEntity addItemToCart(@PathVariable Long userId, @RequestBody CartRequest cartRequest) {
        return cartService.addItemToCart(userId, cartRequest);
    }

    @DeleteMapping("/remove/{userId}/{itemId}")
    public void removeItemFromCart(@PathVariable Long userId, @PathVariable Long itemId) {
        cartService.removeItemFromCart(userId, itemId);
    }

    @PutMapping("/update/{userId}/{itemId}/{newQuantity}")
    public CartEntity updateItemQuantity(@PathVariable Long userId, @PathVariable Long itemId, @PathVariable int newQuantity) {
        return cartService.updateItemQuantity(userId, itemId, newQuantity);
    }
}
