package br.com.EditoraLaranja.BO;

import br.com.EditoraLaranja.Bean.AutorBean;
import br.com.EditoraLaranja.Data.AutorDAO;

import java.util.ArrayList;

public class AutorBO {

    public AutorBO(){}

    public ArrayList<AutorBean> retrieve(){
        AutorDAO autor = new AutorDAO();
        return autor.retrieve();
    }

}
