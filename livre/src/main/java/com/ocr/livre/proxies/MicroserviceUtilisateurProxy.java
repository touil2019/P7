package com.ocr.livre.proxies;

import com.ocr.livre.beans.UtilisateurBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@FeignClient(name = "utilisateur", url = "localhost:9091")
public interface MicroserviceUtilisateurProxy {

    @GetMapping(value = "/listeUtilisateur")
    List<UtilisateurBean> listeUtilisateur();

    @GetMapping(value = "/utilisateur/{username}")
    UtilisateurBean login(@PathVariable String username);

    @PutMapping(value = "/utilisateur/{username}/{UtiRole}")
    public UtilisateurBean modificationRole(@PathVariable String username, @PathVariable String privilege);

}