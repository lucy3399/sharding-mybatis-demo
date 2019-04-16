package com.sharding.demo.controller;

import java.util.List;
import java.util.Random;

import javax.annotation.Resource;

import io.shardingsphere.core.keygen.DefaultKeyGenerator;
import io.shardingsphere.core.routing.strategy.standard.StandardShardingStrategy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sharding.demo.bean.Order;
import com.sharding.demo.bean.OrderItem;
import com.sharding.demo.service.OrderItemService;
import com.sharding.demo.service.OrderService;

@RestController
@RequestMapping(value = "/demo")
public class ShardingDemoController {
//
//	private static Logger logger = LogManager.getLogger();

	@Resource(name = "orderService")
	private OrderService orderService;

	@Resource(name = "orderItemService")
	private OrderItemService orderItemService;

	//注意这块没有事务控制，如果有报错，是没控制事务的
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public void demo() {
		List<OrderItem> orderList= orderItemService.selectOrder();
		for (OrderItem orderItem : orderList) {
			System.out.println("查询到的orderItem" + orderItem.toString());
		}




		/*DefaultKeyGenerator key = new DefaultKeyGenerator();
		int userId = 46;
		Number orderIdKey = key.generateKey();
		Long orderId = orderIdKey.longValue();
	//	Long orderId = Long.parseLong("123");
		System.out.println("分布式主键orderId:" + orderId);

		
		Order order = new Order();
		order.setUserId(userId);
		order.setStatus("1");
		order.setOrderId(orderId);

		Long returnOrderId = orderService.insert(order);
		System.out.println("插入成功后的returnOrderId:" + returnOrderId);


		
		OrderItem item = new OrderItem();
		item.setOrderId(orderId);
		item.setUserId(userId);
		item.setStatus("1");
		Long returnOrderItemId = orderItemService.insert(item);
		System.out.println("插入成功后的returnOrderItemId:" + returnOrderItemId);
*/
		
	}


	@RequestMapping(value = "/selectData", method = RequestMethod.GET)
	public void selectData() {
/*
		Order order = new Order();
		order.setUserId(userId);
		order.setStatus("1");
		order.setOrderId(orderId);*/
/*
		List<OrderItem> orderList= orderService.selectOrder();
		System.out.println("查询到的orderList" + orderList.toString());*/



	}
}
