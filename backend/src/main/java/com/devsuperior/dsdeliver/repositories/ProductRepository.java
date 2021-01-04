package com.devsuperior.dsdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository; //faz parte do Spring Data que permite buscar, salvar, atualizar e deletar

import com.devsuperior.dsdeliver.entities.Product;

// classe responsável por acessar o banco de dados
public interface ProductRepository extends JpaRepository<Product, Long>  {
	List<Product> findAllByOrderByNameAsc(); //findAllBy é do Spring Data JPA, OrderBy é a função, name é o nome do campo na tabela, e Asc(neste caso, opcional) é para ordenar de forma crescente
}
