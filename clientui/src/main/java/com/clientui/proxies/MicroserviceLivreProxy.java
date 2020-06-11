package com.clientui.proxies;


import com.clientui.beans.LivreBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "microServiceLivre", url = "localhost:9090")

public interface MicroserviceLivreProxy {


    @GetMapping(value = "/Livres")
    List<LivreBean> listelivres();

    @GetMapping(value = "/Livre/{id}")
    LivreBean recupererUnLivre(@PathVariable("id") int id);

}
