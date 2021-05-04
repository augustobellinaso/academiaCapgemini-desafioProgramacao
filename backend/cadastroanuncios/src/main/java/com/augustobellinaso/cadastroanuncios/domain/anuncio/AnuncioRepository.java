package com.augustobellinaso.cadastroanuncios.domain.anuncio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AnuncioRepository extends JpaRepository<Anuncio, Integer> {

    public List<Anuncio> findByNomeCliente(String nomeCliente);

   // @Query("SELECT a FROM Anuncio a WHERE a.d BETWEEN ?1 AND ?2")
    //public List<Anuncio> findByDateInterval(LocalDate dataInicial, LocalDate dataFinal);
}
