package com.devsuperior.dsdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository; //faz parte do Spring Data que permite buscar, salvar, atualizar e deletar
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dsdeliver.entities.Order;

// classe responsável por acessar o banco de dados
public interface OrderRepository extends JpaRepository<Order, Long>  {
	// esta consulta não vai estar no SQL, vai estar numa linguagem específica da JPA (JPQL) - products veio da classe order
	@Query("SELECT DISTINCT obj FROM Order obj JOIN FETCH obj.products WHERE obj.status = 0 ORDER BY obj.moment ASC") 
	List<Order> findOrdersWithProducts();
}
