package br.com.EditoraLaranja.Data;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory  {
    public Connection getConnection(){
        String url = "";
        String user = "root";
        String password = "123456";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(url,user,password);
        }catch(Exception e) {
            throw new RuntimeException("conexao falhou "+e);
        }
    }
}
