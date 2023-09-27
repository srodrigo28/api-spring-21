package com.treinadev.apirest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.treinadev.apirest.models.CategoriaModel;
import com.treinadev.apirest.repositorys.CategoriaRepository;
import com.treinadev.apirest.services.CategoriaService;

@RestController
public class CategoriaController {

    /** api/categoria */

    @Autowired
    private CategoriaService service;

    @Autowired
    private CategoriaRepository repository;

    @PostMapping("api/categoria")
    public ResponseEntity<?> cadastrar(@RequestBody CategoriaModel model){
        return service.cadastrar(model);
    }

    @GetMapping("api/categoria")
    public Iterable<CategoriaModel> listaCategoria(){
        return service.findAll();
    }

    @PostMapping("api/categoria/alterar")
    public ResponseEntity<?> alterar(@RequestBody CategoriaModel model){
        return service.alterar(model);
    }

    @DeleteMapping("api/categoria/remover/{id}")
    public void excluir(@PathVariable Long id){
        repository.deleteById(id);
    }
}
