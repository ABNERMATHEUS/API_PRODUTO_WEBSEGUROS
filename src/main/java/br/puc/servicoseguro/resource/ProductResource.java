package br.puc.servicoseguro.resource;

import br.puc.servicoseguro.domain.Product;
import br.puc.servicoseguro.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/produtos")
public class ProductResource {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getProductList() {
        return productService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Optional<Product> getProduct(@PathVariable String id) {
        return productService.findById(Long.parseLong(id));
    }

    @PostMapping()
    public ResponseEntity<Product> save(@RequestBody Product product) {
        product = productService.save(product).get();
        return ResponseEntity.ok().body(product);
    }

    @PutMapping
    public ResponseEntity<Product> update(@RequestBody Product product) {
        product = productService.save(product).get();
        return ResponseEntity.ok().body(product);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        productService.deleteById(id);
        return ResponseEntity.ok().body("Produto excluído com sucesso");
    }
}
