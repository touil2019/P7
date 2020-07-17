package com.clientui.proxies;


import com.clientui.beans.EmpruntBean;
import com.clientui.beans.LivreBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@FeignClient(name = "microServiceLivre", url = "localhost:9090")

public interface MicroserviceLivreProxy {


    @GetMapping(value = "/Livres")
    List<LivreBean> listelivres();

    @GetMapping(value = "/Livre/{id}")
    LivreBean recupererUnLivre(@PathVariable("id") int id);

    @GetMapping(value = "/listeRecherche")
    List<LivreBean> listeLivreRecherche(@RequestParam(name = "mc")String mc);

    @GetMapping(value= "/Livre/{id}/supprimer")
    List<LivreBean> supprimerUnlivre(int id);

    @GetMapping(value="/MonProfile")
    List<EmpruntBean> findAll();

    @GetMapping("/")
    Optional<EmpruntBean> findById(Long idEmprunt);


}
