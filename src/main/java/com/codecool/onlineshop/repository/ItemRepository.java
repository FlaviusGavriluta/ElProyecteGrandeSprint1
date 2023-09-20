package com.codecool.onlineshop.repository;

import com.codecool.onlineshop.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
    Item save(Item item);


}
