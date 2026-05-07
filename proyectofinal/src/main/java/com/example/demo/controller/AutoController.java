package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Auto;
import com.example.demo.repository.AutoRepository;

@RestController
@RequestMapping("/api/autos")
public class AutoController {

    @Autowired
    private AutoRepository autoRepository;

    // 1. REGISTRAR AUTO
    @PostMapping
    public Auto guardarAuto(@RequestBody Auto auto) {
        return autoRepository.save(auto);
    }

    // 2. ELIMINAR AUTO
    @DeleteMapping("/{noSerie}")
    public void eliminarAuto(@PathVariable String noSerie) {
        autoRepository.deleteById(noSerie);
    }

    // 3. BUSCAR POR MARCA
    @GetMapping("/marca/{nombre}")
    public List<Auto> buscarPorMarca(@PathVariable String nombre) {
        return autoRepository.findByMarcaNombre(nombre);
    }

    // 4. FILTROS (marca + precio + modelo)
    @GetMapping
    public List<Auto> buscarConFiltros(
            @RequestParam String marca,
            @RequestParam double precioMin,
            @RequestParam int modelo) {

        return autoRepository
                .findByMarcaNombreAndPrecioGreaterThanEqualAndModeloGreaterThanEqual(
                        marca, precioMin, modelo);
    }
}