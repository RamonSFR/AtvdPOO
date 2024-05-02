package com.example.projetopoo.entities;

public class Usuario {
    private Long id;
    private Boolean consentimento;
    private String nome;
    private String cpf;
    private String email;
    private String perfil;
    private String role;
    private String senha;
    private String telefone;
    private String estado;
    private String municipio;
    private String cep;
    private String bairro;
    private String logradouro;
    private String numero;
    private String complemento;

    private NotaFiscal nf;

    // Construtor
    public Usuario(long id, boolean consentimento, String nome, String cpf, String email, String perfil, String role,
                   String senha, String telefone, String estado, String municipio, String cep, String bairro,
                   String logradouro, String numero, String complemento) {
        this.id = id;
        this.consentimento = consentimento;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.perfil = perfil;
        this.role = role;
        this.senha = senha;
        this.telefone = telefone;
        this.estado = estado;
        this.municipio = municipio;
        this.cep = cep;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
    }


}
