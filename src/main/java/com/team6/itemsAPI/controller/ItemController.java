package com.team6.itemsAPI.controller;


import com.team6.itemsAPI.controller.dto.ItemDto;
import com.team6.itemsAPI.model.Item;
import com.team6.itemsAPI.service.ItemService;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/item")
public class ItemController {

    final ItemService itemService;

    public ItemController(ItemService itemService){
        this.itemService = itemService;
    }

    @GetMapping("/item/all")
    public Iterable<Item> getItems(){
        return itemService.all();
    }

    @PostMapping
    public Item save(@RequestBody ItemDto itemDto) {
        Item item = new Item();
        item.setName(itemDto.getName());
        item.setDescription(itemDto.getDescription());
        item.setImageUrl(itemDto.getImageUrl());
        return itemService.save(item);
    }


    @GetMapping( "/{id}" )
    public Item findItemById( @PathVariable Integer id )
    {
        return itemService.findById( id );
    }

    @PutMapping( "/{id}" )
    public Item update( @RequestBody ItemDto itemDto, @PathVariable Integer id )
    {
        Item item = itemService.findById( id );
        item.setName( item.getName() );
        item.setDescription( item.getDescription() );
        item.setImageUrl( item.getImageUrl() );
        return itemService.save( item );
    }

    @DeleteMapping( "/{id}" )
    public void delete( @PathVariable Integer id )
    {
        itemService.delete( id );
    }
}
