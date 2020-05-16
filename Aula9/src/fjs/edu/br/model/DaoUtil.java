package fjs.edu.br.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public abstract class DaoUtil {
    
    private Connection cx = null;
      
    public Connection getConnection() throws ClassNotFoundException, SQLException{
        if(this.cx == null){
            String url = "jdbc:mysql://localhost:3306/quarentena?zeroDateTimeBehavior=convertToNull";
            String psw = "123456";
            String usr = "root";
            String drive = "com.mysql.jdbc.Driver";
            Class.forName(drive);
            this.cx = DriverManager.getConnection(url, usr, psw);
        }
        return this.cx;
    }
    
    public PreparedStatement getPreparedStatement(String sql) throws ClassNotFoundException, 
                                                                     SQLException{
        return this.getConnection().prepareStatement(sql);
    }
    
    public Statement getStatement() throws ClassNotFoundException, SQLException{
        return this.getConnection().createStatement();
    }
    
}
