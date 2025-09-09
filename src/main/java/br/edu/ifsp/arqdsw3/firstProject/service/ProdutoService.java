package br.edu.ifsp.arqdsw3.firstProject.service;

import br.edu.ifsp.arqdsw3.firstProject.component.CalculadoraPreco;
import br.edu.ifsp.arqdsw3.firstProject.model.Produto;
import br.edu.ifsp.arqdsw3.firstProject.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    private final ProdutoRepository repository;
    private final CalculadoraPreco calculadora;
    public ProdutoService(ProdutoRepository repository, CalculadoraPreco calculadora) {
        this.repository = repository;
        this.calculadora = calculadora;
    }
    public void adicionar(String nome, double preco, int estoque) {
        double precoFinal = calculadora.aplicarDesconto(preco, 10.0);
        repository.salvar(new Produto(nome, precoFinal, estoque));
    }
    public List<Produto> listar() {
        return repository.listar();
    }
}