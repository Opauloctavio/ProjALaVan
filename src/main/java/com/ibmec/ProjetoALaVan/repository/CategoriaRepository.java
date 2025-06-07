package com.ibmec.ProjetoALaVan.repository;

import com.ibmec.ProjetoALaVan.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface CategoriaRepository extends JpaRepository<Categoria, UUID> {

}
