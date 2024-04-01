package com.EmpresaWEBII.controleestoque.model;

import java.util.Objects;

public class Usuario {

    private int id;
    private String nome;
    private String email;
    private String senha;
    private Papel papel;

    // Construtor padrão
    public Usuario() {
    }

    // Construtor completo
    public Usuario(int id, String nome, String email, String senha, Papel papel) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.papel = papel;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Papel getPapel() {
        return papel;
    }

    public void setPapel(Papel papel) {
        this.papel = papel;
    }

    // Métodos para a gestão de usuários
    public void cadastrarUsuario() {
        // TODO: Implementar a lógica de cadastro de usuários
    }

    public void atualizarUsuario() {
        // TODO: Implementar a lógica de atualização de usuários
    }

    public void removerUsuario() {
        // TODO: Implementar a lógica de remoção de usuários
    }

    public void login() {
        // TODO: Implementar a lógica de login
    }

    public void logout() {
        // TODO: Implementar a lógica de logout
    }

    // Equals e HashCode baseados no ID do usuário
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return id == usuario.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Método toString
    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                // Nunca inclua a senha em métodos toString por razões de segurança
                ", papel=" + papel +
                '}';
    }
}
