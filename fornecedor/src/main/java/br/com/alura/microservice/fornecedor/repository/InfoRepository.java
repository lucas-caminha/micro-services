package br.com.alura.microservice.fornecedor.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.alura.microservice.fornecedor.model.InfoFornecedor;

public interface InfoRepository extends CrudRepository<InfoFornecedor, Long>{

	InfoFornecedor findByEstado(String estado);
}
