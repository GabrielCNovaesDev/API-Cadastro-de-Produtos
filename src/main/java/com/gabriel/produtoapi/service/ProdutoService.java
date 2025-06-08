package com.gabriel.produtoapi.service;

import com.gabriel.produtoapi.model.Produto;
import com.gabriel.produtoapi.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository repository;

    public ProdutoService (ProdutoRepository repository){
        this.repository = repository;
    }

    public List<Produto> listarTodos(){
        return repository.findAll();
    }

    public Produto salvar(Produto produto){
        return repository.save(produto);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }

}
