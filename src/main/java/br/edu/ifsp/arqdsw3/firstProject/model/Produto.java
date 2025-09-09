package br.edu.ifsp.arqdsw3.firstProject.model;

public class Produto {
    private String nome;
    private Double preco;
    private Integer estoque;

    public Produto() {}

    public Produto(String nome, Double preco, Integer estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome() { return nome; }
    public Double getPreco() { return preco; }
    public Integer getEstoque() { return estoque; }
}