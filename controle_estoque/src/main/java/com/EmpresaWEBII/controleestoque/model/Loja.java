package com.EmpresaWEBII.controleestoque.model;

import java.util.Objects;

// Anotações do JPA p adicionar aqui
public class Loja {
    
    private int id;
    private String nome;
    private String localizacao;

    public Loja() {
        // Construtor padrão JPA
    }

    // Construtor
    public Loja(int id, String nome, String localizacao) {
        this.id = id;
        this.nome = nome;
        this.localizacao = localizacao;
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

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    // Métodos para manipular dados da loja
    public void cadastrarLoja() {
        // TODO: Implementar a lógica de cadastro da loja
    }

    public void atualizarLoja() {
        // TODO: Implementar a lógica de atualização dos dados da loja
    }

    public void removerLoja() {
        // TODO: Implementar a lógica de remoção da loja
    }

    // Equals e HashCode baseados no ID da loja
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Loja loja = (Loja) o;
        return id == loja.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Método toString
    @Override
    public String toString() {
        return "Loja{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", localizacao='" + localizacao + '\'' +
                ", produtos=" + produtos +
                '}';
    }
}
