package com.leite.tales.default_hexagonal.domain;

public class User {
    private Long id;
    private String nome;
    private String senha;
    private String unidade;
    private String ativo;

    public User() {}
    
    public User(Long id, String nome, String senha, String unidade, String ativo) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.unidade = unidade;
        this.ativo = ativo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }
}
