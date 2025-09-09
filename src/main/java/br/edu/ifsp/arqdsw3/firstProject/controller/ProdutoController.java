package br.edu.ifsp.arqdsw3.firstProject.controller;

import br.edu.ifsp.arqdsw3.firstProject.model.Produto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class ProdutoController {
    @GetMapping("/produtos")
    public String listar(Model model) {
        List<Produto> produtos = List.of(
                new Produto("Notebook", 4500.0, 10),
                new Produto("Smartphone", 2200.0, 25),
                new Produto("Tablet", 1500.0, 5)
        );
        model.addAttribute("produtos", produtos);
        return "produtos";
    }
}