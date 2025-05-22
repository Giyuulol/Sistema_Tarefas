package com.sistemarefas.model;

import java.time.LocalDateTime;

public class Tarefa {
    private int id;
    private String nome;
    private String descricao;
    private String status;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataConclusao;
    private int categoriaId;
    private int colaboradorId;

    public Tarefa() {
        this.dataCriacao = LocalDateTime.now();
        this.status = "PENDENTE";
    }

    public Tarefa(String nome, String descricao, int categoriaId, int colaboradorId) {
        this();
        this.nome = nome;
        this.descricao = descricao;
        this.categoriaId = categoriaId;
        this.colaboradorId = colaboradorId;
    }

    public Tarefa(int id, String nome, String descricao, String status, LocalDateTime dataCriacao, LocalDateTime dataConclusao, int categoriaId, int colaboradorId) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.status = status;
        this.dataCriacao = dataCriacao;
        this.dataConclusao = dataConclusao;
        this.categoriaId = categoriaId;
        this.colaboradorId = colaboradorId;
    }

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDateTime getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(LocalDateTime dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public int getCategoriaId() {
        return categoriaId();
    }

    public void setCategoriaId(int categoriaId) {
        this.categoriaId = categoriaId;
    }

    public int getColaboradorId() {
        return colaboradorId;
    }

    public void setColaboradorId(int colaboradorId) {
        this.colaboradorId = colaboradorId;
    }

    @Override
    public String toString() {
        return "Tarefa [" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", status='" + status + '\'' +
                ", dataCriacao=" + dataCriacao +
                ", dataConclusao=" + dataConclusao +
                ", categoriaId=" + categoriaId +
                ", colaboradorId=" + colaboradorId +
                ']';
    }
}
