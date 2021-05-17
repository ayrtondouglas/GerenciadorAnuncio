package com.capgemini.ayrton.anuncio.service;

import java.util.Date;
import java.util.List;

import com.capgemini.ayrton.anuncio.model.Anuncio;

public interface AnuncioServiceInterface {
	List<Anuncio> findAllAnuncios();
	void insert(Anuncio anuncio);
	Anuncio findAnuncioByPeriodo(Date dataInicio, Date dataTermino);
	Anuncio findAnuncioByCliente(String nome);
	Anuncio findAnuncioByClientePeriodo(String nome, Date dataInicio, Date dataTermino);

}
