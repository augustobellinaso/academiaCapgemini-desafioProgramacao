package com.augustobellinaso.cadastroanuncios.domain.anuncio;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AnuncioRepository extends JpaRepository<Anuncio, Integer> {

    @Query("SELECT a FROM Anuncio a WHERE a.nomeCliente = ?1")
    public List<Anuncio> findByNomeCliente(String nomeCliente);

    @Query("SELECT a FROM Anuncio a WHERE a.dataInicio >= ?1")
   public List<Anuncio> findByDataInicio(LocalDate dataInicial);

    @Query("SELECT a FROM Anuncio a WHERE a.dataFinal <= ?1")
    public List<Anuncio> findByDataFinal(LocalDate dataFinal);
}
