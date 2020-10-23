package fja.edu.br.infra.repositorio;

import fja.edu.br.dominio.contratos.IVendas;
import fja.edu.br.dominio.entidades.Vendas;
import fja.edu.br.infra.data.DaoUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class VendasRepositorio extends DaoUtil implements IVendas{

    public VendasRepositorio() {
        super();
    }
    
    @Override
    public boolean incluir(Vendas venda) {
        String sql = "INSERT INTO vendas (idProduto, idVendedor, vlVenda, quantidade) " +
                     " VALUES (?, ?, ?, ?)";
        PreparedStatement ps;
        int ret = -1;
        
        try {
            ps = getPreparedStatement(sql);
            ps.setInt(1, venda.getProduto().getIdproduto());
            ps.setInt(2, venda.getVendedor().getIdvendedor());
            ps.setDouble(3, venda.getVlvenda());
            ps.setInt(4, venda.getQuantidade());
            ret = ps.executeUpdate();
            ps.close();;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendasRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(VendasRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        return  ret >0;
    }

    @Override
    public boolean alterar(Vendas venda) {
        String sql = "UPDATE vendas SET idProduto=?, idVendedor=?, vlVenda=?, quantidade=? " +
                     " WHERE idVendas=?";
        PreparedStatement ps;
        int ret = -1;
        
        try {
            ps = getPreparedStatement(sql);
            ps.setInt(1, venda.getProduto().getIdproduto());
            ps.setInt(2, venda.getVendedor().getIdvendedor());
            ps.setDouble(3, venda.getVlvenda());
            ps.setInt(4, venda.getQuantidade());
            ps.setInt(5, venda.getIdvendas());
            ret = ps.executeUpdate();
            ps.close();;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendasRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(VendasRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        return  ret >0;
    }

    @Override
    public boolean deletar(int id) {
        String sql = "DELETE FROM vendas " +
                     " WHERE idVendas=?";
        PreparedStatement ps;
        int ret = -1;
        
        try {
            ps = getPreparedStatement(sql);
            ps.setInt(1, id);
            ret = ps.executeUpdate();
            ps.close();;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendasRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(VendasRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        return  ret >0;
    }

    @Override
    public Vendas getRegistroPorId(int id) {
        Vendas venda = new Vendas();
        String sql = "SELECT idVendas, idProduto, idVendedor, vlVenda, quantidade " +
                     "FROM Vendas WHERE idVendas=?";
        
        ProdutoRepositorio produto = new ProdutoRepositorio();
        VendedorRepositorio vendedor = new VendedorRepositorio();
        
        try {
            PreparedStatement ps = getPreparedStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                venda = new Vendas(rs.getInt("idVendas"), 
                                   produto.getConsultaPorId( rs.getInt("idProduto")  ), 
                                   vendedor.getRegistroPorId( rs.getInt("idVendedor")  ), 
                                   rs.getDouble("vlVenda"), 
                                   rs.getInt("quantidade"));
            }
            rs.close();
            ps.close();            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendasRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(VendasRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return venda;
    }

    @Override
    public List<Vendas> getListaTodos() {
        List<Vendas> venda = new LinkedList<Vendas>();
        String sql = "SELECT idVendas, idProduto, idVendedor, vlVenda, quantidade " +
                     "FROM Vendas";
        
        ProdutoRepositorio produto = new ProdutoRepositorio();
        VendedorRepositorio vendedor = new VendedorRepositorio();
        
        try {
            PreparedStatement ps = getPreparedStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                venda.add( new Vendas(rs.getInt("idVendas"), 
                                   produto.getConsultaPorId( rs.getInt("idProduto")  ), 
                                   vendedor.getRegistroPorId( rs.getInt("idVendedor")  ), 
                                   rs.getDouble("vlVenda"), 
                                   rs.getInt("quantidade"))
                );
            }
            rs.close();
            ps.close();            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendasRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(VendasRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return venda;
    }
    
}
