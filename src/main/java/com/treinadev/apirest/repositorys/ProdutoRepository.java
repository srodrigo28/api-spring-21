package com.treinadev.apirest.repositorys;

import org.springframework.data.repository.CrudRepository;

import com.treinadev.apirest.models.ProdutoModel;

public interface ProdutoRepository extends CrudRepository<ProdutoModel, Long> {
    
}
