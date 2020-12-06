package br.com.EditoraLaranja.Bean;

public class AutorBean {
    int autorId;
    String nome;
    String email;
    String telefone;
    String cpf;

    public AutorBean(String nome, String email, String telefone, String cpf){
        setNome(nome);
        setEmail(email);
        setTelefone(telefone);
        setCpf(cpf);
    }

    public int getAutorId() {
        return autorId;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setAutorId(int autorId) {
        this.autorId = autorId;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
