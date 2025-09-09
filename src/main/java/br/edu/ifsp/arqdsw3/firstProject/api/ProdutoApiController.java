package br.edu.ifsp.arqdsw3.firstProject.api;

import br.edu.ifsp.arqdsw3.firstProject.model.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoApiController {
    private final List<Produto> produtos = new ArrayList<>();
    public ProdutoApiController() {
        produtos.add(new Produto("Notebook", 4500.0, 10));
        produtos.add(new Produto("Smartphone", 2200.0, 25));
        produtos.add(new Produto("Tablet", 1500.0, 5));
    }
    @GetMapping
    public List<Produto> listar() {
        return produtos;
    }
    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        produtos.add(produto);
        return produto;
    }
}