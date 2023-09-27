package com.treinadev.apirest.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treinadev.apirest.models.CategoriaModel;

public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long> {
    
}
