package com.clientui.controller;

import com.clientui.beans.LivreBean;
import com.clientui.proxies.MicroserviceLivreProxy;
import feign.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ClientController {
    @Autowired
    private MicroserviceLivreProxy livreProxy;

    @RequestMapping("/")
    public String accueil(Model model){

        List<LivreBean> livres =  livreProxy.listelivres();

        model.addAttribute("Livres", livres);

        return "Accueil";
    }

   @RequestMapping("/details-livre/{id}")
    public String ficheLivre(@PathVariable int id, Model model){


        LivreBean livres = livreProxy.recupererUnLivre(id);

        model.addAttribute("Livres", livres);

       return "FicheLivre";
    }

    @GetMapping("/details-livre/{id}/Livre")
    public String supprimerUnLivre(Model model, @PathVariable(value = "id") int id){

       List <LivreBean> livres = livreProxy.supprimerUnlivre(id);

       return "redirect:/Accueil";
    }

    @GetMapping("/Livres/listeRecherche")
    public String listeLivreRecherche(Model model,@RequestParam(name = "mc")String mc)

    {
        List<LivreBean>livres = livreProxy.listeLivreRecherche(mc);
        model.addAttribute("livres", livres);
        model.addAttribute("mc",mc);
        System.out.println("Récupération du livre recherche");


        return "redirect:/";
    }
}
