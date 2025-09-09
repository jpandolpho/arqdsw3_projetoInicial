package br.edu.ifsp.arqdsw3.firstProject.component;

import org.springframework.stereotype.Component;

@Component
public class CalculadoraPreco {
    public double aplicarDesconto(double preco, double percentual) {
        return preco - (preco * percentual / 100);
    }
}