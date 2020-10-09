package fja.edu.br.infra.repositorio;

import fja.edu.br.dominio.contratos.IProduto;
import fja.edu.br.dominio.entidades.Produto;
import fja.edu.br.infra.data.DaoUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProdutoRepositorio extends DaoUtil implements IProduto{

    public ProdutoRepositorio() {
        super();
    }

    @Override
    public boolean incluir(Produto produto) {
        String sql = "INSERT INTO produto (nome, preco, validade, descricao) VALUES (?, ?, ?, ?)";
        PreparedStatement ps;
        int ret = 0;
        
        try {
            ps = getPreparedStatement(sql);
            ps.setString(1, produto.getNome());
            ps.setFloat(2, produto.getPreco());
            ps.setDate(3, new java.sql.Date(produto.getValidade().getTime()) );
            ps.setString(4, produto.getDescricao());
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
    public boolean alterar(Produto produto) {
        String sql = "UPDATE produto SET nome = ?, preco = ?, validade = ?, descricao = ? WHERE idProduto = ?";
        PreparedStatement ps;
        int ret = 0;
        try {
            ps = getPreparedStatement(sql);
            ps.setString(1, produto.getNome());
            ps.setFloat(2, produto.getPreco());
            ps.setDate(3, new java.sql.Date(produto.getValidade().getTime()) );
            ps.setString(4, produto.getDescricao());
            ps.setInt(5, produto.getIdproduto());
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
        String sql = "DELETE FROM produto WHERE idProduto = ?";
        PreparedStatement ps;
        int ret = 0;
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
    public Produto getConsultaPorId(int id) {
        Produto prod = new Produto();
        String sql = "SELECT idProduto, nome, preco, validade, descricao FROM produto WHERE idProduto = ?";
        
        PreparedStatement ps;
        try {
            ps = getPreparedStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while( rs.next() ){
                prod = new Produto(rs.getInt("idProduto"),
                                   rs.getString("nome"),
                                   rs.getFloat("preco"),
                                   rs.getDate("validade"),
                                   rs.getString("descricao") ); 
            }
            rs.close();
            ps.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        return prod;
    }

    @Override
    public List<Produto> getListaTodos() {
        List<Produto> prodList = new LinkedList<Produto>();
        String sql = "SELECT idProduto, nome, preco, validade, descricao FROM produto";
        
        PreparedStatement ps;
        try {
            ps = getPreparedStatement(sql);
            ResultSet rs = ps.executeQuery();
            while( rs.next() ){
                prodList.add( new Produto(rs.getInt("idProduto"),
                                   rs.getString("nome"),
                                   rs.getFloat("preco"),
                                   rs.getDate("validade"),
                                   rs.getString("descricao") )
                            ); 
            }
            rs.close();
            ps.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        return prodList;
    }
    
}
