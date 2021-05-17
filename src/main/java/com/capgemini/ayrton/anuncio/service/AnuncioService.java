package com.capgemini.ayrton.anuncio.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.ayrton.anuncio.model.Anuncio;
import com.capgemini.ayrton.anuncio.repository.AnuncioRepository;

public class AnuncioService implements AnuncioServiceInterface {

	@Autowired
	AnuncioRepository anuncioRepository;
	
	@Override
	public List<Anuncio> findAllAnuncios() {
		return anuncioRepository.findAll();
	}

	@Override
	public void insert(Anuncio anuncio) {
		anuncioRepository.save(anuncio);
		
	}

	@Override
	public Anuncio findAnuncioByPeriodo(Date dataInicio, Date dataTermino) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Anuncio findAnuncioByCliente(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Anuncio findAnuncioByClientePeriodo(String nome, Date dataInicio, Date dataTermino) {
		// TODO Auto-generated method stub
		return null;
	}

}
