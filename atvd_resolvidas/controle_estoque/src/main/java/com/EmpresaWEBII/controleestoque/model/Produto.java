package com.EmpresaWEBII.controleestoque.model;

import java.util.List;
import java.util.Objects;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Produto {

    private int id;
    private String nome;
    private String descricao;
    private double precoCusto;
    private double precoVenda;
    private int quantidadeEstoque;

    // Construtor padrão
    public Produto() {
        }

    // Construtor completo
    public Produto(int id, String nome, String descricao, double precoCusto, double precoVenda, int quantidadeEstoque) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.quantidadeEstoque = quantidadeEstoque;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Métodos específicos
    public void cadastrarProduto() {
        // TODO: Implementar a lógica de cadastro de produto
    }

    public Produto consultarProduto(int id) {
        // TODO: Implementar a lógica para consultar um produto pelo ID
        return new Produto(); 
    }

    public List<Produto> consultarProduto(String nome) {
        // TODO: Implementar a lógica para consultar produtos pelo nome
        return new ArrayList<>(); 
    }

    public List<Produto> listarProdutosBaixoEstoque(int limite) {
        // TODO: Implementar a lógica para listar produtos com baixo estoque
        return new ArrayList<>(); 
    }

     // Equals e HashCode baseados no ID do produto
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return id == produto.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Método toString
    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", precoCusto=" + precoCusto +
                ", precoVenda=" + precoVenda +
                ", quantidadeEstoque=" + quantidadeEstoque +
                '}';
    }

}


