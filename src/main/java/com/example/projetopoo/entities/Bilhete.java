package com.example.projetopoo.entities;

public class Bilhete {
    private Long id;
    private int ano;
    private int mes;
    private int numero;
    private Long nota_fiscal_id;
    private Long usuario_id;

    private NotaFiscal nf;
    private Usuario usuario;

    public Bilhete(Long id, int ano, int mes, int numero) {
        this.id = id;
        this.ano = ano;
        this.mes = mes;
        this.numero = numero;
        nota_fiscal_id = nf.getId();
        usuario_id = usuario.getId();
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

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Long getNota_fiscal_id() {
        return nota_fiscal_id;
    }

    public void setNota_fiscal_id(Long nota_fiscal_id) {
        this.nota_fiscal_id = nota_fiscal_id;
    }

    public Long getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Long usuario_id) {
        this.usuario_id = usuario_id;
    }

    public NotaFiscal getNf() {
        return nf;
    }

    public void setNf(NotaFiscal nf) {
        this.nf = nf;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
