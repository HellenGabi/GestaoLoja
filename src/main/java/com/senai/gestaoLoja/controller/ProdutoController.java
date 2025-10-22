package com.senai.gestaoLoja.controller;

import com.senai.gestaoLoja.dto.requisicao.ProdutoRequisicao;
import com.senai.gestaoLoja.dto.resposta.ProdutoResposta;
import com.senai.gestaoLoja.model.Produto;
import com.senai.gestaoLoja.service.ProdutoService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
@AllArgsConstructor
public class ProdutoController {

    private final ProdutoService service;


    @PostMapping
    public ResponseEntity<ProdutoResposta> postProduto(
            @RequestBody ProdutoRequisicao produtoRequisicao
            ){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(service.salvarProduto(produtoRequisicao));
    }

    @GetMapping
    public ResponseEntity<List<ProdutoResposta>> buscarTodos(
    ){
        return ResponseEntity.status(HttpStatus.OK)
                .body(service.buscarProduto());
    }


    @GetMapping("/{id}")
    public ResponseEntity<ProdutoResposta> buscarPorID(
        @PathVariable Long id
    ){
        return ResponseEntity.status(HttpStatus.OK)
                .body(service.buscarPorId(id));
    }


    @PutMapping
    public ResponseEntity<ProdutoResposta> atualizarProduto(
            @PathVariable Long id,
            @RequestBody ProdutoRequisicao produtoRequisicao
    ){
        return ResponseEntity.status(HttpStatus.OK)
                .body(service.atualizarProduto(id, produtoRequisicao));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarProduto(
            @PathVariable Long id
    ){
        service.deletarProduto(id);
        return ResponseEntity.status(HttpStatus.OK)
                .build();
    }

}
