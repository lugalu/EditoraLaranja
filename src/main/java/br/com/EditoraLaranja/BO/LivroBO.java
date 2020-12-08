package br.com.EditoraLaranja.BO;

import br.com.EditoraLaranja.Bean.LivroBean;
import br.com.EditoraLaranja.Data.LivroDAO;

import java.util.ArrayList;

public class LivroBO {

    LivroDAO livroDAO = new LivroDAO();

    public LivroBO(){}

    public boolean insert(String titulo,String descricao,String categoria, byte[] image,int idAutor) throws IllegalArgumentException{
        LivroBean livro = new LivroBean(titulo, descricao, categoria, image, idAutor);
        return livroDAO.insert(livro);
    }

    public ArrayList<LivroBean> getLivros() {
        return livroDAO.retrieve();
    }


}
