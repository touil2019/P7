package com.clientui.controller;

import com.clientui.beans.LivreBean;
import com.clientui.proxies.MicroserviceLivreProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ClientController {
    @Autowired
    private MicroserviceLivreProxy livreProxy;

    @RequestMapping("/Accueil")
    public String accueil(Model model){

        List<LivreBean> livres =  livreProxy.listelivres();

        model.addAttribute("Livres", livres);

        return "Accueil";
    }
   // @RequestMapping("/details-livre/{id}")
    //public String ficheLivre(@PathVariable int id, Model model){

   //     List<LivreBean> livres = livreProxy.recupererUnLivre(id);

   //     model.addAttribute("Livres", livres);

   //     return "FicheLivre";
   // }
}
