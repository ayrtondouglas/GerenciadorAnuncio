package com.capgemini.ayrton.anuncio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.ayrton.anuncio.model.Anuncio;

/**
 * 
 * @author ayrtondouglas
 *
 */


@Repository("anuncioRepository")
public interface AnuncioRepository extends JpaRepository<Anuncio, Long> {

}

