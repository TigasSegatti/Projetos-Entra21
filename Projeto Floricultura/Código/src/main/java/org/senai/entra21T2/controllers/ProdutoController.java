package org.senai.entra21T2.controllers;

import java.util.List;

import org.senai.entra21T2.models.Produto;
import org.senai.entra21T2.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProdutoController {
	@Autowired
	ProdutoService produtoService;
	
	@GetMapping("/produtos")
	public List<Produto >listarProdutos(){
		return produtoService.listarProdutos();
}
	@PostMapping("/produtos") 
	public ResponseEntity<Produto> salvarProduto(@RequestBody Produto produto){
		return ResponseEntity.status(HttpStatus.CREATED).body(produtoService.salvarProduto(produto));
	}
	@PutMapping("/produto/{id}") 
	public ResponseEntity<Produto> atualizaProduto(@PathVariable Long id, @RequestBody Produto produto){
		return ResponseEntity.status(HttpStatus.OK).body(produtoService.atualizarProduto(id, produto));
		
	}
	@DeleteMapping ("/produtos/{id}")
	public ResponseEntity<Object> excluirProduto(@PathVariable Long id){
		produtoService.excluirProduto(id);
		return ResponseEntity.status(HttpStatus.OK).body("Produto excluído com sucesso!");
	}
}
