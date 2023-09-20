package com.codecool.onlineshop.service;


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

    public void updateItem(Long itemId, Item item) {
    }
    // public void updateRoom(Long roomId, Room newRoom) {
    //        roomDAO.updateRoomById(roomId, newRoom);
    //    }
}
