package com.devsuperior.dsdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsdeliver.dto.OrderDTO;
import com.devsuperior.dsdeliver.entities.Order;
import com.devsuperior.dsdeliver.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired //injecção de dependência 
	private OrderRepository repository;

	//buscar na base os dados
	@Transactional(readOnly = true) //somente leitura
	public List<OrderDTO> findAll(){
		List<Order> list = repository.findOrdersWithProducts();
		
		//transformar os dados de Order em um DTO
		return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
		
	}
}
