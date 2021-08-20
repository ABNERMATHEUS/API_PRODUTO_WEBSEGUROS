package com.grupofaculdade.tde01produtoresource.contracts;

import com.grupofaculdade.tde01produtoresource.model.Produto;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.UUID;

public interface IProdutoRepository {

    List<Produto> GetAll();

    Produto GetById(UUID id);

   Produto Save(Produto produto);

    Produto Update(Produto produto);

    void Delete(UUID uuid);
}
