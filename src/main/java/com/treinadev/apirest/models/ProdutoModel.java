package com.treinadev.apirest.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "produtos")
public class ProdutoModel {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;

    @Column( unique = true )
    private String nome;

    private Integer quantidade;

    private Float valor;
    
}
