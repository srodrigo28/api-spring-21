package com.treinadev.apirest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.treinadev.apirest.models.ProdutoModel;
import com.treinadev.apirest.repositorys.ProdutoRepository;
import com.treinadev.apirest.services.ProdutoService;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @Autowired
    private ProdutoRepository repository;

    @PostMapping("api/produto")
    public ResponseEntity<?> cadastrar(@RequestBody ProdutoModel model){
        return service.cadastrar(model);
    }
    
    @GetMapping("api/produto")
    public Iterable<ProdutoModel> listarProdutos(){
        return service.listarProdutos();
    }

    @PostMapping("api/produto/alterar")
    public ResponseEntity<?> alterar(@RequestBody ProdutoModel model){
        return service.alterarProduto(model);
    }

    @DeleteMapping("api/produto/remover/{id}")
    public void remover(@PathVariable Long id){
        repository.deleteById(id);
    }
}
