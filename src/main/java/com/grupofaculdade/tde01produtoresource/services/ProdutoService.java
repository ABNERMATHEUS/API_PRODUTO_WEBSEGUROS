package com.grupofaculdade.tde01produtoresource.services;

import com.fasterxml.jackson.databind.deser.std.UUIDDeserializer;
import com.grupofaculdade.tde01produtoresource.contracts.IProdutoRepository;
import com.grupofaculdade.tde01produtoresource.contracts.IProdutoService;
import com.grupofaculdade.tde01produtoresource.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProdutoService implements IProdutoService {


    @Autowired
    private IProdutoRepository produtoRepository;


    @Override
    public List<Produto> GetAll() {
        return produtoRepository.findAll();
    }

    @Override
    public Produto GetById(String id) {
        return produtoRepository.getById(UUID.fromString(id));
    }


    @Override
    public Produto Save(Produto produto) {
        return produtoRepository.save(produto);
    }

    @Override
    public Produto Update(Produto produto) {
        return produtoRepository.save(produto);
    }

    @Override
    public void Delete(String produto) {
        Produto prod = produtoRepository.getById(UUID.fromString(produto));
        produtoRepository.delete(prod);
    }
}
