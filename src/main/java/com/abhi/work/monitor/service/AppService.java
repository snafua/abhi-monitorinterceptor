package com.abhi.work.monitor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhi.work.monitor.model.Item;
import com.abhi.work.monitor.repository.ItemAuditRepository;
import com.abhi.work.monitor.repository.ItemRepository;

@Service
public class AppService {
	@Autowired
	ItemRepository itemRepository;
	
	@Autowired
	ItemAuditRepository itemAuditRepository;
	
	public Item createItem() {
		return null;
	}
	
	public Item getItem() {
		return null;
	}
	
	public Item updateItem() {
		return null;
	}
	
	public Item deleteItem() {
		return null;
	}

}
