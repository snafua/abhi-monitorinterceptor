package com.abhi.work.monitor.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhi.work.monitor.model.Item;

public interface ItemRepository extends JpaRepository<Item, Serializable> {

}
