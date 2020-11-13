package fja.edu.br.aula5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fja.edu.br.aula5.model.Vendedor;
import fja.edu.br.aula5.servico.VendedorServico;

@RestController
@RequestMapping("/vendedor")
public class VendedorController {
	
	@Autowired
	private VendedorServico servico;

	@GetMapping("/buscaporid/{id}")
	public Vendedor buscaPorId(@PathVariable("id") long id) {		
		return servico.buscaPorId(id);
	}
	
	@GetMapping("/buscatodos")
	public List<Vendedor> buscaTodos(){
		return servico.buscaTodos();
	}
	
	@PostMapping("/cadastrar")
	public Vendedor cadastrar(@RequestBody Vendedor vendedor) {
		return servico.inserir(vendedor);
	}

}
