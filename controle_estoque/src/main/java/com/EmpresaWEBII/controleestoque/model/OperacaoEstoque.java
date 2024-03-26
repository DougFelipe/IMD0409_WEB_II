package com.EmpresaWEBII.controleestoque.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class OperacaoEstoque {

    private int id;
    private int produtoId;
    private int lojaId;
    private int quantidade;
    private String tipoOperacao; // "entrada" ou "saída", "VENDA" ou 'COMPRA
    private Date dataOperacao;

    public OperacaoEstoque() {
        // Construtor padrão
    }

    // Construtor completo
    public OperacaoEstoque(int id, int produtoId, int lojaId, int quantidade, String tipoOperacao, Date dataOperacao) {
        this.id = id;
        this.produtoId = produtoId;
        this.lojaId = lojaId;
        this.quantidade = quantidade;
        this.tipoOperacao = tipoOperacao;
        this.dataOperacao = dataOperacao;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(int produtoId) {
        this.produtoId = produtoId;
    }

    public int getLojaId() {
        return lojaId;
    }

    public void setLojaId(int lojaId) {
        this.lojaId = lojaId;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(String tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public Date getDataOperacao() {
        return dataOperacao;
    }

    public void setDataOperacao(Date dataOperacao) {
        this.dataOperacao = dataOperacao;
    }

    // Métodos para manipular a operação de estoque
    public void atualizarEstoque() {
        // TODO: Implementar a lógica de atualização do estoque
    }

    public static List<OperacaoEstoque> consultarHistorico(Date dataInicio, Date dataFim) {
        // TODO: Implementar a lógica para consultar o histórico de operações no período
        return new ArrayList<>();
    }

     // Equals e HashCode baseados no ID da operação de estoque
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OperacaoEstoque that = (OperacaoEstoque) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Método toString
    @Override
    public String toString() {
        return "OperacaoEstoque{" +
                "id=" + id +
                ", produtoId=" + produtoId +
                ", lojaId=" + lojaId +
                ", quantidade=" + quantidade +
                ", tipo='" + tipo + '\'' +
                ", dataOperacao=" + dataOperacao +
                '}';
    }
}
