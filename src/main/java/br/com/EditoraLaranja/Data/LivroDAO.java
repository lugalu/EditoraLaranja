package br.com.EditoraLaranja.Data;


import br.com.EditoraLaranja.Bean.LivroBean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LivroDAO {
    final private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    public LivroDAO(){
        conn = new ConnectionFactory().getConnection();
    }

    public boolean insert(LivroBean livro) {
        String sql = "insert into livro(titulo,descricao,categoria) values (?,?,?) ";

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1,livro.getTitulo());
            ps.setString(2, livro.getDescricao());
            ps.setString(3, livro.getCategorias().get(1));
            ps.execute();
            ps.close();
            System.out.println(livro.getTitulo());
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }


    }
}
