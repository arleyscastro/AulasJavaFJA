package fja.edu.br.controladores;

import fja.edu.br.dominio.contratos.IVendas;
import fja.edu.br.dominio.entidades.Vendas;
import fja.edu.br.infra.repositorio.VendasRepositorio;
import java.util.List;


public class VendasController {
    private IVendas vendasRepositorio = new VendasRepositorio();
    
    private Vendas venda;
    private List<Vendas> vendas = null;

    public VendasController() {
    }

    public Vendas getVenda() {
        return venda;
    }

    public void setVenda(Vendas venda) {
        this.venda = venda;
    }

    public List<Vendas> getVendas() {
        if(vendas==null){
            vendas = vendasRepositorio.getListaTodos();
        }
        return vendas;
    }
    
    public String preparaInclusao(){
        venda = new Vendas();
        return "vaiParaIncluir";
    }
    
    public  String finalizaInclusao(){
        vendasRepositorio.incluir(venda);
        vendas = null;
        return "voltaParaListagem";
    }
    
    public  String finalizaEdicao(){
        vendasRepositorio.alterar(venda);
        vendas = null;
        return "voltaParaListagem";
    }
    
    
    
}
