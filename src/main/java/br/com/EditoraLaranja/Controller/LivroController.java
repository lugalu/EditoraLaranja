package br.com.EditoraLaranja.Controller;

import br.com.EditoraLaranja.BO.AutorBO;
import br.com.EditoraLaranja.BO.LivroBO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LivroController")
public class LivroController extends HttpServlet {
    LivroBO livro = new LivroBO();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("buttonSub");

        switch(action){
            case "ADD":
                String titulo = req.getParameter("titulo");
                String descricao = req.getParameter("descricao");
                String categoria = req.getParameter("categoria");
                int id = Integer.parseInt(req.getParameter("idAutor"));
                boolean resultado = livro.insert(titulo, descricao, categoria,id);
                System.out.println(resultado);
                if(resultado){
                    System.out.println("Livro cadastrado!!!");
                    req.getRequestDispatcher("index.jsp").forward(req, resp);
                }else{
                    System.out.println("Erro!!!");
                }
                break;
            case "Register":
                AutorBO autores = new AutorBO();
                req.setAttribute("autores",autores.retrieve());
                req.getRequestDispatcher("CadastroLivro.jsp").forward(req,resp);
                break;
            case "Retrieve":
                break;
            default:
                break;
        }


    }
}
