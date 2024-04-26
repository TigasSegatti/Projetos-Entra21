package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {	

}
