package br.com.EditoraLaranja.BO;

import br.com.EditoraLaranja.Bean.LivroBean;
import br.com.EditoraLaranja.Data.LivroDAO;

import java.util.ArrayList;

public class LivroBO {

    public LivroBO(){}

    public boolean insert(String titulo,String descricao,String categoria,int id){
        LivroDAO livro = new LivroDAO();
        LivroBean temp = new LivroBean(titulo, descricao, categoria);
        temp.setIdAutor(id);
        System.out.println(id);
        return livro.insert(temp);
    }


}
