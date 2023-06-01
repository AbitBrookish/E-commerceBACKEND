package com.team6.itemsAPI.service;


import com.team6.itemsAPI.model.Item;
import com.team6.itemsAPI.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceMySQL implements ItemService {

    private final ItemRepository itemRepository;

    public ItemServiceMySQL(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }

    @Override
    public Item save(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public void delete(int itemId) {
        itemRepository.deleteById(itemId);
    }

    @Override
    public List<Item> all() {
        List<Item> result = new ArrayList<>();
        itemRepository.findAll().forEach(result::add);
        return result;
    }

    @Override
    public Optional<Item> findById(int itemId) {
        return itemRepository.findById(itemId);
    }
}
