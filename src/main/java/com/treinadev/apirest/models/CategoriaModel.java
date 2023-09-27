package com.treinadev.apirest.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "categorias")
public class CategoriaModel {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;

    private String nome;
    
}
