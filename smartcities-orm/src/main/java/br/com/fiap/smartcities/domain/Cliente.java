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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "tbl_cliente")

public class Cliente {
	
	 @Id
	 @SequenceGenerator(name="cliente",sequenceName="sq_tbl_cliente",allocationSize=1)
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="cliente")
	 @Column(name = "id_cliente")
	 private Integer id;
	 
	 @Column(name = "nome_cliente", length = 50, nullable=false)
	 private String nome;
	 
	 @Column(name = "status_cliente")
	 @Enumerated(EnumType.STRING)
	 private StatusCliente statusCliente;
	 
	 @CreationTimestamp
	 @Temporal(TemporalType.TIMESTAMP)
	 @Column(name = "dh_criacao", nullable=false)
	 private Calendar dataCriacao;
	 
	 
	public Cliente() {
		super();
	}

	public Cliente(Integer id, String nome, StatusCliente statusCliente, Calendar dataCriacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.statusCliente = statusCliente;
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

	public StatusCliente getStatusCliente() {
		return statusCliente;
	}

	public void setStatusCliente(StatusCliente statusCliente) {
		this.statusCliente = statusCliente;
	}

	public Calendar getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Calendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	}	 

