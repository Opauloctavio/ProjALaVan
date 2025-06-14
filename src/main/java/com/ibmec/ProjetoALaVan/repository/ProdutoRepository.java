package com.ibmec.ProjetoALaVan.repository;

import com.ibmec.ProjetoALaVan.model.Produto;
import org.springframework.data.domain.Limit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ProdutoRepository extends JpaRepository<Produto, UUID> {
    List<Produto> findByCategoria_Id(UUID categoriaId);
}
