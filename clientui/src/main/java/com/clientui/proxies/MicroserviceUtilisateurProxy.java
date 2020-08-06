package com.clientui.proxies;


import com.clientui.beans.UtilisateurBean;
import com.clientui.configuration.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "zuul-server",contextId ="microServiceUtilisateurProxy",configuration= FeignConfig.class)

@Component
public interface MicroserviceUtilisateurProxy {

    @GetMapping(value = "/microserviceutilisateur/utilisateurs")
    List<UtilisateurBean> utilisateurList();

    @GetMapping("/microserviceutilisateur/utilisateur/{username}")
    UtilisateurBean utilisateurByUsername(@PathVariable String username);

}