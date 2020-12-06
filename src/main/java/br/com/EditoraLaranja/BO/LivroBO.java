package br.com.EditoraLaranja.BO;

import br.com.EditoraLaranja.Bean.LivroBean;

import java.util.ArrayList;

public class LivroBO {
    ArrayList<LivroBean> livros;

    public LivroBO(){
        livros= new ArrayList<>();
    }

    public boolean insert(String titulo,String descricao,String categoria){

        return true;
    }


}
