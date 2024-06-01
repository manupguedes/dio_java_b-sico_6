package com.biblioteca.controller;

import com.biblioteca.model.Autor;
import com.biblioteca.model.Livro;
import com.biblioteca.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/autores")
public class AutorController {
    @Autowired
    private AutorService AutorService;

    @GetMapping
    public List<Autor> listarTodos() {
        return AutorService.listarTodos();
    }

    @PostMapping
    public Autor criarAutor(@RequestBody Autor Autor) {
        return AutorService.criarAutor(Autor);
    }

    @DeleteMapping("/{id}")
    public void deletarAutor(@PathVariable Long id) {
    	AutorService.deletarAutor(id);
    }
}
