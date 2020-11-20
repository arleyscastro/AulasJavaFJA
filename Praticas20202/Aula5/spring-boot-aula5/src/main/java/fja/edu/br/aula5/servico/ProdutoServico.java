package fja.edu.br.aula5.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fja.edu.br.aula5.model.Produto;
import fja.edu.br.aula5.repositorio.IProdutoRepositorio;

@Service
public class ProdutoServico {

	@Autowired
	IProdutoRepositorio repositorio;
	
	public Produto inserir(Produto produto) {
		return repositorio.save(produto);
	}
	
	public List<Produto> buscaTodos(){
		return repositorio.findAll();
	}
	
	public Produto buscaPorId(long id) {
		return repositorio.findById(id).orElse(null);
	}
	
	public Produto alterar(Produto produto) {
		return repositorio.save(produto);				
	}
	
	public void apagar(long id) {
		repositorio.deleteById(id);
	}
	
}
