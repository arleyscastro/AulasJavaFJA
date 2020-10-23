package fja.edu.br.infra.repositorio;

import fja.edu.br.dominio.contratos.IVendedor;
import fja.edu.br.dominio.entidades.Vendedor;
import fja.edu.br.infra.data.DaoUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class VendedorRepositorio extends DaoUtil implements IVendedor{

    public VendedorRepositorio() {
    }

    @Override
    public boolean incluir(Vendedor vendedor) {
        String sql = "INSERT INTO vendedor (nome, comissao)" +
                     " VALUES (?, ?)";
        PreparedStatement ps;
        int ret=-1;
        try {
            ps = getPreparedStatement(sql);
            ps.setString(1, vendedor.getNome());
            ps.setDouble(2, vendedor.getComissao());
            ret = ps.executeUpdate();
            ps.close();
                       
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret > 0;
    }

    @Override
    public boolean alterar(Vendedor vendedor) {
        String sql = "UPDATE vendedor SET nome=?, comissao=? " +
                     " WHERE idVendedor=?";
        PreparedStatement ps;
        int ret=-1;
        try {
            ps = getPreparedStatement(sql);
            ps.setString(1, vendedor.getNome());
            ps.setDouble(2, vendedor.getComissao());
            ps.setInt(3, vendedor.getIdvendedor());
            ret = ps.executeUpdate();
            ps.close();
                       
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret > 0;
    }

    @Override
    public boolean deletar(int id) {
        String sql = "DELETE FROM vendedor WHERE idVendedor=?";
        PreparedStatement ps;
        int ret=-1;
        try {
            ps = getPreparedStatement(sql);
            ps.setInt(1, id);
            ret = ps.executeUpdate();
            ps.close();
                       
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret > 0;
    }

    @Override
    public Vendedor getRegistroPorId(int id) {
        Vendedor vend = new Vendedor();
        String sql = "SELECT idVendedor, nome, comissao FROM vendedor ";
        sql += " WHERE idVendedor = ?";
        try {
            PreparedStatement ps = super.getPreparedStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                vend = new Vendedor(rs.getInt("idVendedor"),
                                      rs.getString("nome"), 
                                      rs.getFloat("comissao"));
            }
            rs.close();
            ps.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        return vend;
    }

    @Override
    public List<Vendedor> getListaTodos() {
        List<Vendedor> vend = new LinkedList<Vendedor>();
        String sql = "SELECT idVendedor, nome, comissao FROM vendedor ";
        try {
            PreparedStatement ps = super.getPreparedStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                vend.add( new Vendedor(rs.getInt("idVendedor"),
                                      rs.getString("nome"), 
                                      rs.getFloat("comissao"))
                );
            }
            rs.close();
            ps.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        return vend;
    }
    
   
    
}
