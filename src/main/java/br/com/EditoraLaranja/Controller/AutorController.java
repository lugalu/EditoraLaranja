package br.com.EditoraLaranja.Controller;

import br.com.EditoraLaranja.BO.AutorBO;
import br.com.EditoraLaranja.Bean.AutorBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/AutorController")
public class AutorController extends HttpServlet {
    AutorBO autor = new AutorBO();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("buttonSub");

        switch(action){
            case "ADD":
                String nome = req.getParameter("nome");
                String email = req.getParameter("email");
                String telefone = req.getParameter("telefone");
                String cpf = req.getParameter("cpf");
                boolean resultado = autor.insert(nome,email,telefone,cpf);

                if(resultado){
                    System.out.println("Autor cadastrado!!!");
                    req.getRequestDispatcher("index.jsp").forward(req, resp);
                }else{
                    System.out.println("Erro!!!");
                }

                break;
            case "Retrieve":

                break;
            default:
                break;
        }


    }


}
