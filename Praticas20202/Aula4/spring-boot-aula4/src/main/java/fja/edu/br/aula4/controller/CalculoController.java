package fja.edu.br.aula4.controller;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fja.edu.br.aula4.calculadora.Calculos;
import fja.edu.br.aula4.calculadora.Pessoa;


@RestController
@RequestMapping("/calculo")
public class CalculoController {
	private Calculos calc = new Calculos();
	
	@GetMapping("/sum/{nr1}/{nr2}")
	public Double sum(@PathVariable("nr1") Double nr1, @PathVariable("nr2") Double nr2) {
		return calc.soma(nr1, nr2);
	}
	
	@GetMapping("/subtai/{nr1}/{nr2}")
	public Double subtraiNumeros(@PathVariable("nr1") Double nr1, @PathVariable("nr2") Double nr2) {
		return calc.subtracao(nr1, nr2);
	}
	
	@GetMapping("/retornaUmaPessoa")
	public Pessoa retornaPessoa() {
		Pessoa uma = new Pessoa(1, "Roberto Carlos", "M");
		
		return uma;
	}
	
	@GetMapping("/listaPessoas")
	public List<Pessoa> variasPessoas() {
		List<Pessoa> pessoas = new LinkedList<Pessoa>();
			
		pessoas.add(new Pessoa(1, "Maria Betânia", "F"));
		pessoas.add(new Pessoa(2, "João Batista", "M"));
		pessoas.add(new Pessoa(3, "Madre Tereza de Calcutar", "F"));
		pessoas.add(new Pessoa(4, "Roberto Carlos", "M"));
			
		return pessoas;
	}
	

}
