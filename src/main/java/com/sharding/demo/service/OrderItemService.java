package com.sharding.demo.service;

import com.sharding.demo.bean.OrderItem;

import java.util.List;

public interface OrderItemService {

	public long insert(OrderItem item);

	public List<OrderItem> selectOrder();
	
}
