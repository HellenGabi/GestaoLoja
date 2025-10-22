package com.senai.gestaoLoja.repository;

import com.senai.gestaoLoja.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteDAO extends JpaRepository<Cliente, Long> {
}
