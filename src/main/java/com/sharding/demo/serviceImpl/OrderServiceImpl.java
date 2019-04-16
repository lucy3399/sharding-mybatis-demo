package com.sharding.demo.serviceImpl;

import javax.annotation.Resource;

import com.sharding.demo.bean.OrderItem;
import com.sharding.demo.dao.OrderItemRepository;
import org.springframework.stereotype.Service;

import com.sharding.demo.bean.Order;
import com.sharding.demo.dao.OrderRepository;
import com.sharding.demo.service.OrderService;

import java.util.List;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

	@Resource
	private OrderRepository orderRepository;

	@Resource
	private OrderItemRepository orderItemRepository;

	@Override
	public long insert(Order order) {
		// TODO Auto-generated method stub
		return orderRepository.insert(order);
	}



}
