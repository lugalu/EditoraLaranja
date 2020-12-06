package br.com.EditoraLaranja.BO;

import br.com.EditoraLaranja.Bean.LivroBean;
import br.com.EditoraLaranja.Data.LivroDAO;

import java.util.ArrayList;

public class LivroBO {

    public LivroBO(){};

    public boolean insert(String titulo,String descricao,String categoria){
        LivroDAO livro = new LivroDAO();
        return livro.insert(new LivroBean(titulo, descricao, categoria));
    }


}
