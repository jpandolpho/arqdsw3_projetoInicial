package br.edu.ifsp.arqdsw3.firstProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProdutoController {
    private List<String> produtos = new ArrayList<>(List.of("Notebook", "Smartphone",
            "Tablet"));

    @GetMapping("/produtos")
    public String listar(Model model) {
        model.addAttribute("produtos", produtos);
        return "produtos";
    }

    @PostMapping("/produtos")
    public String adicionar(@RequestParam String nome, Model model) {
        produtos.add(nome);
        model.addAttribute("produtos", produtos);
        return "produtos";
    }

    @GetMapping("/api/produtos")
    @ResponseBody
    public List<String> listarApi() {
        return produtos;
    }
}