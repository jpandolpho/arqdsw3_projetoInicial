package br.edu.ifsp.arqdsw3.firstProject.repository;

import br.edu.ifsp.arqdsw3.firstProject.model.Produto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProdutoRepository {
    private final List<Produto> produtos = new ArrayList<>(List.of(
            new Produto("Notebook", 4500.0, 10),
            new Produto("Smartphone", 2200.0, 25),
            new Produto("Tablet", 1500.0, 5)
    ));
    public void salvar(Produto produto) {
        produtos.add(produto);
    }
    public List<Produto> listar() {
        return produtos;
    }
}