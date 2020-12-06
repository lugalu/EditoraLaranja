package br.com.EditoraLaranja.BO;

import br.com.EditoraLaranja.Bean.AutorBean;
import br.com.EditoraLaranja.Data.AutorDAO;

import java.util.ArrayList;

public class AutorBO {

    public AutorBO(){}

    public boolean insert(String nome, String email, String telefone, String cpf){
        AutorDAO autor = new AutorDAO();
        AutorBean temp = new AutorBean(nome,email,telefone,cpf);

        return autor.insert(temp);
    }

    public ArrayList<AutorBean> retrieve(){
        AutorDAO autor = new AutorDAO();
        return autor.retrieve();
    }

}
