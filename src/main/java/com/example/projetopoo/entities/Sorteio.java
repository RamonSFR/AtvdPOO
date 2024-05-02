package com.example.projetopoo.entities;

public class Sorteio {
    private Long id;
    private int ano;
    private int identificador;
    private int valor_premio;
    private int apresentador;
    private int auditor;
    private int premiado;
    private String descricao;

    public Sorteio(Long id, int ano, int identificador, int valor_premio, int apresentador, int auditor, int premiado, String descricao) {
        this.id = id;
        this.ano = ano;
        this.identificador = identificador;
        this.valor_premio = valor_premio;
        this.apresentador = apresentador;
        this.auditor = auditor;
        this.premiado = premiado;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getValor_premio() {
        return valor_premio;
    }

    public void setValor_premio(int valor_premio) {
        this.valor_premio = valor_premio;
    }

    public int getApresentador() {
        return apresentador;
    }

    public void setApresentador(int apresentador) {
        this.apresentador = apresentador;
    }

    public int getAuditor() {
        return auditor;
    }

    public void setAuditor(int auditor) {
        this.auditor = auditor;
    }

    public int getPremiado() {
        return premiado;
    }

    public void setPremiado(int premiado) {
        this.premiado = premiado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
