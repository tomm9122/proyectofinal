package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Auto;
import java.util.List;

public interface AutoRepository extends JpaRepository<Auto, String> {

    List<Auto> findByMarcaNombre(String nombre);

    List<Auto> findByMarcaNombreAndPrecioGreaterThanEqualAndModeloGreaterThanEqual(
        String marca, double precio, int modelo
    );
}
