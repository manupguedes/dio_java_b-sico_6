package com.biblioteca.service;

import com.biblioteca.model.Autor;
import com.biblioteca.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {
    @Autowired
    private AutorRepository autorRepository;

    public List<Autor> listarTodos() {
        return autorRepository.findAll();
    }

    public Autor criarAutor(Autor autor) {
        return autorRepository.save(autor);
    }

    public void deletarAutor(Long id) {
        autorRepository.deleteById(id);
    }
}
