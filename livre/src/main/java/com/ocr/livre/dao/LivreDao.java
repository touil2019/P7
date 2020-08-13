package com.ocr.livre.dao;


import com.ocr.livre.model.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LivreDao extends JpaRepository<Livre, Long> {

   List<Livre> findAll();

   @Query("select l from Livre l  where lower(l.titre) like lower(concat('%', :x,'%'))"
           + " or lower(l.auteurName)  like lower(concat('%', :x,'%')) "
           + "or lower(l.auteurPrenom)  like lower(concat('%', :x,'%'))")
     List<Livre>chercher(@Param("x") String mc);

   List<Livre> findAllByTitre(String titre);

}
