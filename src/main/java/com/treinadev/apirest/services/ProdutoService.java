package com.treinadev.apirest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.treinadev.apirest.models.ProdutoModel;
import com.treinadev.apirest.repositorys.ProdutoRepository;

import lombok.Data;

@Data
@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    // Cadastrar
    public ResponseEntity<?> cadastrar(ProdutoModel model){
        return new ResponseEntity<ProdutoModel>(repository.save(model), HttpStatus.CREATED);
    }

    // Listar
    public Iterable<ProdutoModel> listarProdutos(){
        return repository.findAll();
    }

    // Alterar
    public ResponseEntity<?> alterarProduto(ProdutoModel model){
        return new ResponseEntity<ProdutoModel>(repository.save(model), HttpStatus.OK);
    }

    // Excluir
    public ResponseEntity<ProdutoModel> excluir(Long id){
        repository.deleteById(id);
        return new ResponseEntity<ProdutoModel>(HttpStatus.OK);
    }

}
