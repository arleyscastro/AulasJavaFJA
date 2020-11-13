package fja.edu.br.aula5.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fja.edu.br.aula5.model.Vendedor;

@Repository
public interface IVendedorRepositorio extends JpaRepository<Vendedor, Long>{

}
