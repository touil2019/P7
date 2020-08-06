package com.clientui.proxies;


import com.clientui.beans.EmpruntBean;
import com.clientui.beans.LivreBean;
import com.clientui.configuration.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@FeignClient(name = "zuul-server",contextId = "microServiceLivreProxy",configuration= FeignConfig.class)

@Component
public interface MicroserviceLivreProxy {


    @GetMapping(value = "/microservicelivre/Livres")
    List<LivreBean> listelivres();

    @GetMapping(value = "/microservicelivre/Livre/{id}")
    LivreBean recupererUnLivre(@PathVariable("id") int id);

    @GetMapping(value = "/microservicelivre/listeRecherche")
    List<LivreBean> listeLivreRecherche(@RequestParam(name = "mc")String mc);

    @GetMapping(value= "/microservicelivre/Livre/{id}/supprimer")
    List<LivreBean> supprimerUnlivre(int id);

    @GetMapping(value="/microservicelivre/emprunt/pseudo/{pseudoEmprunteur}")
    List<EmpruntBean> listeDEmpruntParUtilisateur(@PathVariable("pseudoEmprunteur") String pseudoEmprunteur );

    @GetMapping("/microservicelivre/")
    Optional<EmpruntBean> findById(Long idEmprunt);


}
