package br.com.EditoraLaranja.Data;

import br.com.EditoraLaranja.Bean.AutorBean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AutorDAO {
    final private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    public AutorDAO(){
        conn = new ConnectionFactory().getConnection();
    }

    public boolean insert(AutorBean autor){
        return true;
    }

    public ArrayList<AutorBean> retrieve(){
        String sql = "select * from autor";
        ArrayList<AutorBean> autores = new ArrayList<>();

        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()){
                AutorBean temp = new AutorBean(
                        rs.getString("nome"),
                        rs.getString("email"),
                        rs.getString("telefone"),
                        rs.getString("cpf")
                        );
                temp.setAutorId(rs.getInt("autorID"));
                autores.add(temp);
            }
            ps.close();
            return autores;

        }catch (Exception e){
            System.out.println("ERROR: "+e);
            return null;
        }
    }


}
