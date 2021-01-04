package com.devsuperior.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository; //faz parte do Spring Data que permite buscar, salvar, atualizar e deletar

import com.devsuperior.dsdeliver.entities.Order;

// classe responsável por acessar o banco de dados
public interface OrderRepository extends JpaRepository<Order, Long>  {

}
