package br.com.fiap.smartcities.domain;

import java.util.Calendar;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "tbl_fornecedor")

public class Fornecedor {
	
	 @Id
	 @SequenceGenerator(name="fornecedor",sequenceName="sq_tbl_fornecedor",allocationSize=1)
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="fornecedor")
	 @Column(name = "id_fornecedor")
	 private Integer id;
	 
	 @Column(name = "nome_fornecedor", length = 50, nullable=false)
	 private String nome;
	 
	 @Column(name = "status_fornecedor")
	 @Enumerated (EnumType.STRING)
	 private StatusFornecedor statusFornecedor;
	 
	 @CreationTimestamp
	 @Temporal(TemporalType.TIMESTAMP)
	 @Column(name = "dh_criacao", nullable=false)
	 private Calendar dataCriacao;

	public Fornecedor() {
		super();
	}

	public Fornecedor(Integer id, String nome, StatusFornecedor statusFornecedor, Calendar dataCriacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.statusFornecedor = statusFornecedor;
		this.dataCriacao = dataCriacao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public StatusFornecedor getStatusFornecedor() {
		return statusFornecedor;
	}

	public void setStatusFornecedor(StatusFornecedor statusFornecedor) {
		this.statusFornecedor = statusFornecedor;
	}

	public Calendar getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Calendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
			 
}
