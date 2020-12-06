package br.com.EditoraLaranja.Data;


import br.com.EditoraLaranja.Bean.LivroBean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class LivroDAO {
    final private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    public LivroDAO(){
        conn = new ConnectionFactory().getConnection();
    }

    public boolean insert(LivroBean livro) {
        String sql = "insert into livro(autorID, titulo,descricao,categoria) values (?,?,?,?) ";

        try {
            ps = conn.prepareStatement(sql);

            ps.setInt(1, livro.getIdAutor());
            ps.setString(2,livro.getTitulo());
            ps.setString(3, livro.getDescricao());
            ps.setString(4, livro.getCategorias());
            ps.execute();
            ps.close();
            System.out.println(livro.getTitulo());
            return true;
        } catch (Exception e) {
            System.out.println(e);

            return false;
        }


    }

    public ArrayList<LivroBean> retrieve(){
        String sql = "select * from livro order by titulo asc";
        ArrayList<LivroBean> livros = new ArrayList<>();
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()){
                LivroBean temp = new LivroBean(rs.getString("titulo"),
                        rs.getString("descricao"),
                        rs.getString("categoria"));
                temp.setIdAutor(rs.getInt("autorID"));
                temp.setIdLivro(rs.getInt("livroID"));
                livros.add(temp);
            }
            ps.close();
            return livros;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

}
