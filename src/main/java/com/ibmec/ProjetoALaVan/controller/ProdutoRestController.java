package com.ibmec.ProjetoALaVan.controller;


import com.ibmec.ProjetoALaVan.model.Categoria;
import com.ibmec.ProjetoALaVan.model.Produto;
import com.ibmec.ProjetoALaVan.repository.CategoriaRepository;
import com.ibmec.ProjetoALaVan.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoRestController {
    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping
    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }
    @GetMapping("/categoria/{id}")
    public List<Produto> listarCategorias(@PathVariable UUID id) {
        return produtoRepository.findByCategoriaId(id);
    }
    @GetMapping("/categoria/{id}/info")
    public ResponseEntity<Categoria> buscarCategoriaPorId(@PathVariable UUID id) {
        return categoriaRepository.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}
