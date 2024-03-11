package com.EmpresaWEBII.controleestoque.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Papel {

    private int id;
    private String nome;
    private Set<Permissao> permissoes;

    // Construtor vazio
    public Papel() {
        this.permissoes = new HashSet<>();
    }

    // Construtor com todos os atributos
    public Papel(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.permissoes = new HashSet<>();
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

    public Set<Permissao> getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(Set<Permissao> permissoes) {
        this.permissoes = permissoes;
    }

    // Métodos para manipular as permissões
    public void adicionarPermissao(Permissao permissao) {
        this.permissoes.add(permissao);
    }

    public void removerPermissao(Permissao permissao) {
        this.permissoes.remove(permissao);
    }

    // Equals e HashCode baseados no ID do papel
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Papel papel = (Papel) o;
        return id == papel.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Método toString
    @Override
    public String toString() {
        return "Papel{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", permissoes=" + permissoes +
                '}';
    }
}
