package com.clientui.proxies;


import com.clientui.beans.UtilisateurBean;
import com.clientui.configuration.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "zuul-server",contextId ="microServiceUtilisateur", url = "localhost:9091",configuration= FeignConfig.class)


public interface MicroserviceUtilisateurProxy {

    @GetMapping(value = "/utilisateurs")
    List<UtilisateurBean> utilisateurList();

    @GetMapping("/utilisateur/{username}")
    UtilisateurBean utilisateurByUsername(@PathVariable String username);

}