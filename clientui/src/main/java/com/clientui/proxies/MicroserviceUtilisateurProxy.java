package com.clientui.proxies;

import com.ocr.livre.beans.UtilisateurBean;
import com.ocr.livre.configuration.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "microServiceUtilisateur", url = "localhost:9091")

@RequestMapping("/microservice-utilisateur")
public interface MicroserviceUtilisateurProxy {

    @GetMapping(value = "/utilisateurs")
    List<UtilisateurBean> utilisateurList();

    @GetMapping("/utilisateur/{username}")
    UtilisateurBean utilisateurByUsername(@PathVariable String username);

}