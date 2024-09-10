package com.example.backend.controller;

import com.example.backend.model.Texto;
import com.example.backend.repository.TextoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/textos")
@CrossOrigin(origins = "http://localhost:3000") // Permitir solicitudes desde el frontend React
public class TextoController {

    @Autowired
    private TextoRepository textoRepository;

    @PostMapping
    public ResponseEntity<Texto> createTexto(@RequestBody Texto texto) {
        Texto savedTexto = textoRepository.save(texto);
        return new ResponseEntity<>(savedTexto, HttpStatus.CREATED);
    }

    @GetMapping
    public Iterable<Texto> getAllTextos() {
        return textoRepository.findAll();
    }
}
