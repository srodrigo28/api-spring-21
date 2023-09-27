package com.treinadev.apirest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.treinadev.apirest.models.CategoriaModel;
import com.treinadev.apirest.repositorys.CategoriaRepository;

import lombok.Data;

@Data
@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    // Cadastrar
    public ResponseEntity<?> cadastrar(CategoriaModel model){
        return new ResponseEntity<CategoriaModel>(repository.save(model), HttpStatus.CREATED);
    }

    // Listar
    public Iterable<CategoriaModel> findAll(){
        return repository.findAll();
    }

    // Alterar
    public ResponseEntity<?> alterar(CategoriaModel model){
        return new ResponseEntity<CategoriaModel>(repository.save(model), HttpStatus.OK);
    }

    // Excluir
    public ResponseEntity<CategoriaModel> excluir(Long id){
        repository.deleteById(id);
        return new ResponseEntity<CategoriaModel>(HttpStatus.OK);
    }
    
}
