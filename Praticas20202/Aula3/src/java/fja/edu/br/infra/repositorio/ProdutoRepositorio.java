package fja.edu.br.infra.repositorio;

import fja.edu.br.dominio.contratos.IProduto;
import fja.edu.br.dominio.entidades.Produto;
import fja.edu.br.infra.data.DaoUtil;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deletar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Produto getConsultaPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Produto> getListaTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
