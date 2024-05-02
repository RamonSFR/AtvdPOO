package com.example.projetopoo.entities;

import java.util.Date;

public class NotaFiscal {
    private Long id;
    private Long usuario_id;
    private String chave;
    private String sequencial;
    private Date data_processamento;

    private Usuario usuario;

    public NotaFiscal(Long id, String chave, String sequencial, Date data_processamento, Usuario usuario) {
        this.id = id;
        usuario_id = usuario.getId();
        this.chave = chave;
        this.sequencial = sequencial;
        this.data_processamento = data_processamento;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Long usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public String getSequencial() {
        return sequencial;
    }

    public void setSequencial(String sequencial) {
        this.sequencial = sequencial;
    }

    public Date getData_processamento() {
        return data_processamento;
    }

    public void setData_processamento(Date data_processamento) {
        this.data_processamento = data_processamento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
