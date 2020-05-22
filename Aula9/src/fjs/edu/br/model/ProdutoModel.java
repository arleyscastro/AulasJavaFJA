package fjs.edu.br.model;

import fjs.edu.br.cotratos.IProdutoService;
import fjs.edu.br.entidades.ProdutoDto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProdutoModel extends DaoUtil implements IProdutoService{

    public ProdutoModel() {
        super();
    }
    
    private String MontaSql(ProdutoDto prod){
        String sql = "SELECT idProduto, nome, preco, validade, descricao FROM produto ";
        sql += " WHERE 1=1 ";
        
        if(prod.getIdproduto() > 0){
            sql += " AND idProduto = " + prod.getIdproduto();
        }
        if(prod.getNome() != null){
            sql += " AND nome like '%" + prod.getNome() + "%' ";
        }
        if(prod.getPreco() > 0.0F ){
            sql += " AND preco = " + prod.getPreco();
        }
        if(prod.getDescricao() != null){
            sql += " AND descricao like '%" + prod.getDescricao() + "%' ";
        }
        
        sql += " order by nome";
        return sql;
    }

    @Override
    public boolean Adicionar(ProdutoDto produto) {
        String sql = "INSERT INTO produto ";
        sql += "(nome, preco, validade, descricao)";
        sql += " VALUES ";
        sql += "(?, ?, ?, ?)";
        int ret = 0;
        try {
            PreparedStatement ps = super.getPreparedStatement(sql);
            ps.setString(1, produto.getNome() );
            ps.setFloat(2, produto.getPreco() );
            ps.setDate(3, new java.sql.Date( produto.getValidade().getTime() ) );
            ps.setString(4, produto.getDescricao());
            ret = ps.executeUpdate();
            ps.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoModel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ret > 0;
    }

    @Override
    public boolean Alterar(ProdutoDto produto) {
        String sql = "UPDATE produto SET ";
        sql += "nome=?, preco=?, validade=?, descricao=? ";
        sql += " WHERE idProduto=?";

        int ret = 0;
        try {
            PreparedStatement ps = super.getPreparedStatement(sql);
            ps.setString(1, produto.getNome() );
            ps.setFloat(2, produto.getPreco() );
            ps.setDate(3, new java.sql.Date( produto.getValidade().getTime() ) );
            ps.setString(4, produto.getDescricao());
            ps.setInt(5, produto.getIdproduto());
            ret = ps.executeUpdate();
            ps.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoModel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ret > 0;
    }

    @Override
    public boolean Deletar(ProdutoDto produto) {
        String sql = "DELETE FROM produto ";
        sql += " WHERE idProduto=?";

        int ret = 0;
        try {
            PreparedStatement ps = super.getPreparedStatement(sql);
            ps.setInt(1, produto.getIdproduto());
            ret = ps.executeUpdate();
            ps.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoModel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ret > 0;
    }

    private ArrayList ListaProdutos(ProdutoDto prod){
        ArrayList lstRet = new ArrayList();
        String sql = this.MontaSql( prod );
        try {
            PreparedStatement ps = super.getPreparedStatement(sql);
            ResultSet rs = ps.executeQuery();
            while ( rs.next() ) {                
                lstRet.add(
                        new Object[]{
                            rs.getInt("idProduto"),
                            rs.getString("nome"),
                            rs.getFloat("preco"),
                            rs.getDate("validade"),
                            rs.getString("descricao")
                        }
                );
            }
            rs.close();
            ps.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoModel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoModel.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return lstRet;
    }
    
    @Override
    public ArrayList ListaTodos() {
        return this.ListaProdutos( new ProdutoDto() );
    }

    @Override
    public ArrayList ListaTodosFiltrado(ProdutoDto produto) {
        return this.ListaProdutos(produto);
    }

    @Override
    public ProdutoDto ObtemProdutoPorId(int id) {
        ProdutoDto prodRet = new ProdutoDto();
        String sql = this.MontaSql( new ProdutoDto(id) );
        try {
            PreparedStatement ps = super.getPreparedStatement(sql);
            ResultSet rs = ps.executeQuery();
            while ( rs.next() ) {                
                prodRet.setIdproduto(rs.getInt("idProduto"));
                prodRet.setNome(rs.getString("nome"));
                prodRet.setPreco( rs.getFloat("preco"));
                prodRet.setValidade(rs.getDate("validade"));
                prodRet.setDescricao(rs.getString("descricao"));
            }
            rs.close();
            ps.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoModel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoModel.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return prodRet;
    }
        
    
}
