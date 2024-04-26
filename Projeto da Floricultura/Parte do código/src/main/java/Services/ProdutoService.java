package Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Models.Produto;
import Repositories.ProdutoRepository;

@Service
public class ProdutoService {
	@Autowired
	ProdutoRepository produtoRepository; 
	
	public List<Produto> listarProdutos(){
	return produtoRepository.findAll();
		
	}
	public Produto salvaProduto (Produto produto) {
	return produtoRepository.save(produto);	
	}
	
	public Produto atualizarProduto(Long id, Produto produto) {
		return produto.setIdProduto(id);
		return produtoRepository.save(produto);
	}
	public void excluirProduto(Long id) {
		produtoRepository.deleteById(id);
		
		
	}
}
