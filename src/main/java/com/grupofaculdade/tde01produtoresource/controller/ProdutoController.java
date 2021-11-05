package com.grupofaculdade.tde01produtoresource.controller;


import com.grupofaculdade.tde01produtoresource.model.Produto;
import com.grupofaculdade.tde01produtoresource.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController  {

    @Autowired
    private ProdutoService produtoService;


    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> find(@PathVariable String id) {
        Produto result = produtoService.GetById(id);
        return ResponseEntity.ok().body(result);
    }


    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Produto>> findAll() {
        List<Produto> result = produtoService.GetAll();
        return ResponseEntity.ok().body(result);
    }


    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable String id) {
        produtoService.Delete(id);
        return ResponseEntity.noContent().build();
    }


    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Produto> save(@RequestBody Produto produto) throws URISyntaxException {
        return ResponseEntity.created(new URI("locahost")).body(produtoService.Save(produto));
    }

    @RequestMapping( method = RequestMethod.PUT)
    public ResponseEntity<Produto> put(@RequestBody Produto produto) {
        return ResponseEntity.ok(produtoService.Update(produto));
    }


}
