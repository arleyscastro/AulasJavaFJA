package fja.edu.br.jdbc;

import fja.edu.br.modelo.Produto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;


public class AcessoBanco {
    private Connection cx = null;
    
    public void ConectaBanco() throws ClassNotFoundException, SQLException{
        String url = "jdbc:mysql://localhost:3306/quarentena?zeroDateTimeBehavior=convertToNull";
        String psw = "123456";
        String usr = "root";
        String drive = "com.mysql.jdbc.Driver";
        
        Class.forName(drive);
        
        cx = DriverManager.getConnection(url, usr, psw);
        
    }
    
    public void DeconectaBanco() throws SQLException{
        if(cx!=null){
            cx.close();
            cx=null;
        }
    }
    
    public List<Produto> ObtemTodosOsProdutos() throws SQLException{
        List<Produto> prods = new LinkedList<Produto>();
        
        String sql = "SELECT idProduto, nome, preco, validade, descricao FROM produto";
        PreparedStatement ps = cx.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        while ( rs.next() ) {            
            prods.add( new Produto(
                    rs.getInt("idProduto"), 
                    rs.getString("nome"), 
                    rs.getFloat("preco"), 
                    rs.getDate("validade"), 
                    rs.getString("descricao"))
            );
        }
        rs.close();
        ps.close();
        return prods;
    }
    
}
