package org.senai.entra21T2.repositories;

import org.senai.entra21T2.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {	

}
