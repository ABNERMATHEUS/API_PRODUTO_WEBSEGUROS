package com.grupofaculdade.tde01produtoresource.contracts;

import com.grupofaculdade.tde01produtoresource.model.Produto;

import java.util.List;

public interface IProdutoService {

    List<Produto> GetAll();

    Produto GetById(String id);

    Produto Save(Produto produto);

    Produto Update(Produto produto);

    void Delete(String uuid);

}
