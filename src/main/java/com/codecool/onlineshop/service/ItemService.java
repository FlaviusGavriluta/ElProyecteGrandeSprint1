package com.codecool.onlineshop.service;


import com.codecool.onlineshop.exceptions.ItemNotFoundException;
import com.codecool.onlineshop.model.Item;
import com.codecool.onlineshop.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {
    private final ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }
    public void addItem(Item item) {
        itemRepository.save(item);
    }
    public void deleteItemById(Long id) {
        itemRepository.deleteById(id);
    }

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public Optional<Item> getItemById(Long itemId) {
        return itemRepository.findById(itemId);
    }

    public Item updateItem(Long itemId, Item updatedItem) {
        Item item = itemRepository.findById(itemId)
                .orElseThrow(() -> new ItemNotFoundException("User not found with ID: " + itemId));

        item.setName(updatedItem.getName());
        item.setPrice(updatedItem.getPrice());
        item.setImagePath(updatedItem.getImagePath());

        return itemRepository.save(item);
    }
}
