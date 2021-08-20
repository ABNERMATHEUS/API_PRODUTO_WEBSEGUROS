package com.grupofaculdade.tde01produtoresource.services;

import com.grupofaculdade.tde01produtoresource.contracts.IProdutoService;
import com.grupofaculdade.tde01produtoresource.model.Produto;
import com.grupofaculdade.tde01produtoresource.repository.FakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
public class ProdutoService implements IProdutoService {

    @Autowired
    private FakeRepository fakeRepository;


    @Override
    public List<Produto> GetAll() {
        return fakeRepository.GetAll();
    }

    @Override
    public Produto GetById(String id) {

        return fakeRepository.GetById(UUID.fromString(id));
    }


    @Override
    public Produto Save(Produto produto) {
        produto.setId(UUID.randomUUID());
        return fakeRepository.Save(produto);
    }

    @Override
    public Produto Update(Produto produto) {
        return fakeRepository.Update(produto);
    }

    @Override
    public void Delete(String uuid) {
        fakeRepository.Delete(UUID.fromString(uuid));
    }
}
