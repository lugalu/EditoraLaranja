package br.com.EditoraLaranja.Bean;

import java.util.ArrayList;

public class LivroBean {
    private int idLivro;
    private int idAutor;
    private String titulo;
    private String descricao;
    private String categoria;
    private String dataLancamento;

    public LivroBean(String titulo,String descricao,String categoria){
        setTitulo(titulo);
        setDescricao(descricao);
        setCategorias(categoria);
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

    public String getCategorias() {
        return categoria;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public void setDataLancamento(String data){
        this.dataLancamento = data;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    private void setCategorias(String categorias) {
        this.categoria = categorias;
    }
}
