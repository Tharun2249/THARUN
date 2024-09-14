package com.service;

import com.entity.CartEntity;
import com.model.CartRequest;
import com.model.Menu;
import com.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    
    public Menu getItemDetails(Long itemId) {
   
        return new Menu(itemId, "Mocked Item Name", 150, 1);  
    }

    // Add item to cart
    public CartEntity addItemToCart(Long userId, CartRequest cartRequest) {
        Menu item = getItemDetails(cartRequest.getItem_Id());  // Use mocked item data

        
        Optional<CartEntity> existingCartItem = cartRepository.findById(userId)
                .stream()
                .filter(cartItem -> cartItem.getItem_Id().equals(cartRequest.getItem_Id()))
                .findFirst();

        CartEntity cart ;
        if (existingCartItem.isPresent()) {
             cart = existingCartItem.get();
            // Update quantity and total amount
            cart.setQuantity(cart.getQuantity() + cartRequest.getQuantity());
            cart.setTotal_Amount(cart.getTotal_Amount() + item.getItem_Cost() * cartRequest.getQuantity());
            return cartRepository.save(cart);
        } else {
            // Add a new item to the cart
           cart = new CartEntity();
            cart.setUser_Id(userId);
            cart.setItem_Id(item.getItem_Id());
            cart.setQuantity(cartRequest.getQuantity());
            cart.setRestaurant_Id(1);  // Assuming restaurant Id is fixed for now
            cart.setTotal_Amount((double) (item.getItem_Cost() * cartRequest.getQuantity()));
            cart.setItems(item.getItem_Name());
            return cartRepository.save(cart);
        }
    }

    // Remove item from cart
    public void removeItemFromCart(Long userId, Long itemId) {
        Optional<CartEntity> existingCartItem = cartRepository.findById(userId)
                .stream()
                .filter(cartItem -> cartItem.getItem_Id().equals(itemId))
                .findFirst();

        existingCartItem.ifPresent(cartRepository::delete);
    }

    // Update quantity of item in the cart
    public CartEntity updateItemQuantity(Long userId, Long itemId, int newQuantity) {
        Optional<CartEntity> existingCartItem = cartRepository.findById(userId)
                .stream()
                .filter(cartItem -> cartItem.getItem_Id().equals(itemId))
                .findFirst();

        if (existingCartItem.isPresent()) {
            CartEntity cart = existingCartItem.get();
            Menu item = getItemDetails(itemId);  // Use mocked item data

            // Update the quantity and total amount
            cart.setQuantity(newQuantity);
            cart.setTotal_Amount((double) (item.getItem_Cost() * newQuantity));
            return cartRepository.save(cart);
        }

        throw new RuntimeException("Item not found in the cart");
    }
}
