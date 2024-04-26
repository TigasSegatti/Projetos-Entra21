package org.senai.entra21T2.service;

import java.util.List;

import org.senai.entra21T2.models.Produto;
import org.senai.entra21T2.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
	@Autowired
	ProdutoRepository produtoRepository; 
	
	public List<Produto> listarProdutos(){
	return produtoRepository.findAll();
		
	}
	public Produto salvarProduto(Produto produto) {
	return produtoRepository.save(produto);	
	}
	
	public Produto atualizarProduto(Long id, Produto produto) {
		produto.setIdProduto(id);
		return produtoRepository.save(produto);
	}
	public void excluirProduto(Long id) {
		produtoRepository.deleteById(id);
		
		
	}
}
