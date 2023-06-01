package com.team6.itemsAPI.service;


import com.team6.itemsAPI.model.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ItemService {

    Item save(Item item);
    void delete(int itemId);
    List<Item> all();
    Item findById(int itemId);
}
