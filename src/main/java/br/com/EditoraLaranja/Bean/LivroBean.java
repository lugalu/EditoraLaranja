package br.com.EditoraLaranja.Bean;


import java.util.Base64;

public class LivroBean {
    private int idLivro;
    private int idAutor;
    private String titulo;
    private String descricao;
    private String categoria;
    private String dataLancamento;
    private byte[] image;

    public LivroBean(String titulo,String descricao,String categoria, byte[] image, int idAutor){
        setTitulo(titulo);
        setDescricao(descricao);
        setCategorias(categoria);
        setImage(image);
        setIdAutor(idAutor);
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

    public String getImage() {
        String base64 = Base64.getEncoder().encodeToString(image);
        return "data:image/jpeg;base64," + base64;
    }

    public byte[] getImageBytes() {
        return this.image;
    }

    public void setImage(byte[] image) {
        if(image.length == 0) {
            throw new IllegalArgumentException("image can't be empty");
        } else {
            this.image = image;
        }
    }
}
