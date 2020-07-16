package com.clientui.proxies;


import com.clientui.beans.LivreBean;
import com.ocr.livre.model.Livre;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "microServiceLivre", url = "localhost:9090")

public interface MicroserviceLivreProxy {


    @GetMapping(value = "/Livres")
    List<LivreBean> listelivres();

    @GetMapping(value = "/Livre/{id}")
    LivreBean recupererUnLivre(@PathVariable("id") int id);

    @GetMapping(value = "/listeRecherche")
    List<Livre> listeLivreRecherche(@RequestParam(name = "mc")String mc);


}
