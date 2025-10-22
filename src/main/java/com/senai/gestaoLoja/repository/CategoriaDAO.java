package com.senai.gestaoLoja.repository;

import com.senai.gestaoLoja.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDAO extends JpaRepository<Categoria, Long> {
}
