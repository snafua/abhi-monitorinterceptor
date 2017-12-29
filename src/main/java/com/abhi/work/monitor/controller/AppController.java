package com.abhi.work.monitor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.work.monitor.model.Item;
import com.abhi.work.monitor.service.AppService;

@RestController
@RequestMapping(value="/store")
public class AppController {
	
	@Autowired
	AppService appService;
	
	@RequestMapping(value="/item" , method = RequestMethod.POST)
	public Item createItem(@RequestBody Item item) {
		return new Item();
	}
	
	@RequestMapping(value="/item/{id}" , method = RequestMethod.GET)
	public Item getItem(@PathVariable String id) {
		return new Item();
	}
	
	@RequestMapping(value="/item/{id}" , method = RequestMethod.PUT)
	public Item updateItem(@PathVariable String id , @RequestBody Item item) {
		return new Item();
	}
	
	@RequestMapping(value="/item/{id}" , method = RequestMethod.DELETE)
	public Item deleteItem(@PathVariable String id , @RequestBody Item item) {
		return new Item();
	}

}
