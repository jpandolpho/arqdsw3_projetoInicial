package br.edu.ifsp.arqdsw3.firstProject.web;

import br.edu.ifsp.arqdsw3.firstProject.model.Produto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {
    private List<Produto> produtos = new ArrayList<>(List.of(new Produto("Notebook", 4500.0, 10),
            new Produto("Smartphone", 2200.0, 25),
            new Produto("Tablet", 1500.0, 5)));

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("produtos",produtos);
        return "produtos";//com o thymeleaf, a string de retorno é sempre o nome da página que queremos acessar. neste caso, "produtos.html"
    }
}