package fja.edu.br.aula5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fja.edu.br.aula5.model.Produto;
import fja.edu.br.aula5.servico.ProdutoServico;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
	
	@Autowired
	private ProdutoServico servico;
	
	@GetMapping("/buscaporid/{id}")
	public Produto buscaPorId(@PathVariable("id") long id) {
		return servico.buscaPorId(id);
	}
	
	@GetMapping("/buscatodos")
	public List<Produto> buscaTodos(){
		return servico.buscaTodos();
	}
	
	@PostMapping("/cadastrar")
	public Produto cadastrar(@RequestBody Produto produto) {
		return servico.inserir(produto);
	}
	
	@PutMapping("/alterar")
	public Produto alterar(@RequestBody Produto produto) {
		return servico.alterar(produto);
	}
	
	@DeleteMapping("/apagar/{id}")
	public void apagar(@PathVariable("id") long id) {
		servico.apagar(id);
	}
	
	@DeleteMapping("/apagar")
	public void apagar(@RequestBody Produto produto) {
		servico.apagar(produto.getIdproduto());
	}
	
	
}




