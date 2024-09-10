package com.example.backend.repository;

import com.example.backend.model.Texto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TextoRepository extends JpaRepository<Texto, Long> {
}
