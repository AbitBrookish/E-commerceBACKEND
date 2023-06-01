package com.team6.itemsAPI.repository;

import com.team6.itemsAPI.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
