package com.senai.gestaoLoja.repository;

import com.senai.gestaoLoja.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoDAO extends JpaRepository<Produto, Long> {
    boolean existsByNome(String nome);
}
