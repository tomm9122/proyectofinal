package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.example.demo.model.Marca;
import com.example.demo.repository.MarcaRepository;

@RestController
@RequestMapping("/api/marcas")
public class MarcaController {

    @Autowired
    private MarcaRepository marcaRepository;

    // GET: listar todas las marcas
    @GetMapping
    public List<Marca> listarMarcas() {
        return marcaRepository.findAll();
    }
}