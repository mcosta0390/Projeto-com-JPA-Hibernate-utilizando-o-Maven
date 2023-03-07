package br.com.fiap.smartcities.domain;

import java.util.Calendar;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@Entity
@Table(name = "tbl_estabelecimento")

public class Estabelecimento {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="estabelecimento")
    @SequenceGenerator(name="estabelecimento",sequenceName="sq_tbl_estabelecimento",allocationSize=1)
    @Column(name = "id_estabelecimento")
    private Integer id;

    @Column(name = "nome_estabelecimento", length = 50, nullable=false)
    private String nome;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dh_criacao", nullable=false)
    private Calendar dataCriacao;
    
    @OneToMany
    private List <Cliente> clientes;
    
    @OneToMany
    private List <Fornecedor> fornecedores;
    
    
    public List<Cliente> getClientes() {
		return clientes;
	}

	public Estabelecimento() {
		super();
	}

	public Estabelecimento(Integer id, String nome, Calendar dataCriacao, List<Cliente> clientes,
			List<Fornecedor> fornecedores) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataCriacao = dataCriacao;
		this.clientes = clientes;
		this.fornecedores = fornecedores;
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

 
    public Calendar getDataCriacao() {
         return dataCriacao;
    }

 
    public void setDataCriacao(Calendar dataCriacao) {
         this.dataCriacao = dataCriacao;
    }

	public List<Fornecedor> getFornecedores() {
		return fornecedores;
	}

	public void setFornecedores(List<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
    
       
}


