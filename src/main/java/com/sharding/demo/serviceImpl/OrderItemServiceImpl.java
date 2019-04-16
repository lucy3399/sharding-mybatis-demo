package com.sharding.demo.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sharding.demo.bean.OrderItem;
import com.sharding.demo.dao.OrderItemRepository;
import com.sharding.demo.service.OrderItemService;

import java.util.List;

@Service("orderItemService")
public class OrderItemServiceImpl implements OrderItemService {

	@Resource
	private OrderItemRepository itemRepository;

	@Override
	public long insert(OrderItem orderItem) {
		return itemRepository.insert(orderItem);
	}

	@Override
	public List<OrderItem> selectOrder() {
		return itemRepository.selectAll();
	}

}
