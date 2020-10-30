package fja.edu.br.controladores;

import fja.edu.br.dominio.contratos.IVendedor;
import fja.edu.br.dominio.entidades.Vendedor;
import fja.edu.br.infra.repositorio.VendedorRepositorio;
import java.util.List;


public class VendedorController {
    private Vendedor vendedor;
    private List<Vendedor> vendedores = null;
    
    private IVendedor vendedorreositorio = new VendedorRepositorio();

    public VendedorController() {
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<Vendedor> getVendedores() {
        if(vendedores == null){
            vendedores = vendedorreositorio.getListaTodos();
        }
        return vendedores;
    }
    
    
    
}
