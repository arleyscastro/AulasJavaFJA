package fja.edu.br.aula5.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fja.edu.br.aula5.model.Produto;

@Repository
public interface IProdutoRepositorio extends JpaRepository<Produto, Long> {

}
