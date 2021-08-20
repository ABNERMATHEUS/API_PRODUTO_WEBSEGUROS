package com.grupofaculdade.tde01produtoresource.repository;

import com.grupofaculdade.tde01produtoresource.contracts.IProdutoRepository;
import com.grupofaculdade.tde01produtoresource.model.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Service
public class FakeRepository implements IProdutoRepository {

    private List<Produto> productsList;

    public FakeRepository(List<Produto> productsList) {
        this.productsList = new ArrayList<Produto>();
    }

    @Override
    public List<Produto> GetAll() {
        return productsList;
    }

    @Override
    public Produto GetById(UUID id) {
        return productsList.stream().filter(x-> x.getId()== id).findFirst().get();
    }

    @Override
    public Produto Save(Produto produto) {
        productsList.add(produto);
        return  produto;
    }

    @Override
    public Produto Update(Produto produto) {
        Produto productFound = productsList.stream().filter(x-> x.getId()== produto.getId()).findFirst().get();
        productsList.remove(productFound);
        productsList.add(produto);
        return produto;
    }

    @Override
    public void Delete(UUID uuid) {
        Produto productFound = productsList.stream().filter(x-> x.getId()== uuid).findFirst().get();
        productsList.remove(productFound);
    }
}
