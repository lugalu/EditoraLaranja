package br.com.EditoraLaranja.Bean;

import java.util.ArrayList;

public class LivroBean {
    private int idLivro;
    private int idAutor;
    private String titulo;
    private String descricao;
    private ArrayList<String> categorias;


    public LivroBean(String titulo,String descricao,ArrayList<String> categorias){
        setTitulo(titulo);
        setDescricao(descricao);
        setCategorias(categorias);
    }

    public int getIdLivro() {
        return idLivro;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public ArrayList<String> getCategorias() {
        return categorias;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    private void setCategorias(ArrayList<String> categorias) {
        this.categorias = categorias;
    }
}
