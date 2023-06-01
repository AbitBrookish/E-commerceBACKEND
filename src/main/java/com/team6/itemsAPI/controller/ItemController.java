package com.team6.itemsAPI.controller;


import com.team6.itemsAPI.model.Item;
import com.team6.itemsAPI.repository.ItemRepository;
import com.team6.itemsAPI.service.ItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/item")
public class ItemController {

    final ItemService itemService;

    public ItemController(ItemService itemService){
        this.itemService = itemService;
    }

    @GetMapping("/all")
    public Iterable<Item> getItems(){
        return itemService.all();
    }
}
