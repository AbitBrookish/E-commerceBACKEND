package com.team6.itemsAPI.controller;


import com.team6.itemsAPI.model.Item;
import com.team6.itemsAPI.repository.ItemRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/item")
public class ItemController {

    final ItemRepository itemRepository;

    public ItemController(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }

    @GetMapping
    public Iterable<Item> getItems(){
        return itemRepository.findAll();
    }
}
