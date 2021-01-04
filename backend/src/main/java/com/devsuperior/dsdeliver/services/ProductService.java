package com.devsuperior.dsdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsdeliver.dto.ProductDTO;
import com.devsuperior.dsdeliver.entities.Product;
import com.devsuperior.dsdeliver.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired //injecção de dependência 
	private ProductRepository repository;

	//buscar na base os dados
	@Transactional(readOnly = true) //somente leitura
	public List<ProductDTO> findAll(){
		List<Product> list = repository.findAllByOrderByNameAsc();
		
		//transformar os dados de Product em um DTO
		return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
		
	}
}
