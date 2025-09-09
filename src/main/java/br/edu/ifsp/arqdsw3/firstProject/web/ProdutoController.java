package br.edu.ifsp.arqdsw3.firstProject.web;

import br.edu.ifsp.arqdsw3.firstProject.model.Produto;
import br.edu.ifsp.arqdsw3.firstProject.service.ProdutoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {
    private final ProdutoService service;
    public ProdutoController(ProdutoService service) { this.service = service; }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("produtos", service.listar());
        return "produtos";
    }

    @PostMapping("/produtos")
    public String adicionar(@RequestParam String nome,
                            @RequestParam double preco,
                            @RequestParam int estoque) {
        service.adicionar(nome, preco, estoque);
        return "redirect:/produtos";
    }
}