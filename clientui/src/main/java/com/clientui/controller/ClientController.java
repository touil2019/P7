package com.clientui.controller;

import com.clientui.beans.EmpruntBean;
import com.clientui.beans.LivreBean;
import com.clientui.beans.UtilisateurBean;
import com.clientui.proxies.MicroserviceLivreProxy;
import feign.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ClientController {
    @Autowired
    private MicroserviceLivreProxy livreProxy;

    @GetMapping("/")
    public String accueil(Model model,@RequestParam(name = "mc",defaultValue = "")String mc){

        List<LivreBean>livres = livreProxy.listeLivreRecherche(mc);
        model.addAttribute("livres", livres);
        model.addAttribute("mc",mc);


        return "accueil";
    }

   @RequestMapping("/details-livre/{id}")
    public String ficheLivre(@PathVariable int id, Model model){


        LivreBean livres = livreProxy.recupererUnLivre(id);

        model.addAttribute("Livres", livres);

       return "fiche-livre";
    }

    @GetMapping("/details-livre/{id}/Livre")
    public String supprimerUnLivre(Model model, @PathVariable(value = "id") int id){

       List <LivreBean> livres = livreProxy.supprimerUnlivre(id);

       return "redirect:/accueil";
    }

    @RequestMapping(value = "/MonProfile", method = RequestMethod.GET)
    public String profil(Model model) {

        UtilisateurBean utilisateur = (UtilisateurBean) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("utilisateur", utilisateur);

        List<EmpruntBean> listEmprunt= livreProxy.listeDEmpruntParUtilisateur("pseudoEmprunteur");
        model.addAttribute("ListEmprunt",listEmprunt);

        return "/MonProfile";

    }
}
