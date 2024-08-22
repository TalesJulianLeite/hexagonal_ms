package com.leite.tales.default_hexagonal.adapters.out.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
@Table(name = "USUARIO")
public class UserEntity {

	@Id
    @Column(name = "cod_usuario", nullable = false)
    private Long id;

    @Column(name = "nome_usuario", nullable = false)
    private String nome;

    @JsonIgnore
    @Column(name = "password", nullable = false)
    private String senha;

    private String unidade;

    @JsonIgnore
    @Column(name = "fun_ativo", nullable = false)
    private String ativo;

    public UserEntity(Long id, String nome, String senha, String unidade, String ativo) {
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

