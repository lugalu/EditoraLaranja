package br.com.EditoraLaranja.Controller;

import br.com.EditoraLaranja.BO.AutorBO;
import br.com.EditoraLaranja.BO.LivroBO;
import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.io.InputStream;

@WebServlet("/LivroController")
@MultipartConfig
public class LivroController extends HttpServlet {
    LivroBO livroBO = new LivroBO();
    AutorBO autorBO = new AutorBO();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("buttonSub");

        switch(action){
            case "ADD":
                String titulo = req.getParameter("titulo");
                String descricao = req.getParameter("descricao");
                String categoria = req.getParameter("categoria");
                int idAutor = Integer.parseInt(req.getParameter("idAutor"));

                Part filePart = req.getPart("image");
                InputStream fileContent = filePart.getInputStream();
                byte[] bytes = IOUtils.toByteArray(fileContent);

                try {
                    livroBO.insert(titulo, descricao, categoria,bytes, idAutor);
                    System.out.println("Livro cadastrado!!!");
                    req.getRequestDispatcher("Livros.jsp").forward(req, resp);
                } catch (Exception e) {
                    System.out.println(e.getLocalizedMessage());
                }
                break;
            case "Register":
                req.setAttribute("autores",autorBO.retrieve());
                req.getRequestDispatcher("CadastroLivro.jsp").forward(req,resp);
                break;
            case "Retrieve":
                break;
            default:
                break;
        }


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("livros", this.livroBO.getLivros());
        req.setAttribute("autores", this.autorBO.retrieve());
        req.getRequestDispatcher("Livros.jsp").forward(req,resp);
    }
}
