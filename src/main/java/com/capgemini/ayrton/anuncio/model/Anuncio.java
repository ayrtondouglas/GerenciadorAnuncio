package com.capgemini.ayrton.anuncio.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

/**
 * 
 * @author ayrtondouglas
 *
 */
@Entity (name = "anuncio")
public class Anuncio {
	
	@Id
	@SequenceGenerator(name = "anuncio_seq", sequenceName= "anuncio_seq", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "anuncio_seq")
	private Long id;
	
	@NotNull
	@Column
	private String nome;

	
	@NotNull
	@Column
	private String cliente;
	
	@NotNull
	@Column
	private Date dataInicio;

	@NotNull
	@Column
	private Date dataTermino;

	@NotNull
	@Column
	private Double investimentoDia;
	
	public Anuncio() {
		
	}
	
	public Anuncio(String nome, String cliente, Date dataInicio, Date dataTermino, Double investimentoDia) {
		this.nome = nome;
		this.cliente = cliente;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.investimentoDia = investimentoDia;
			
	}

}
