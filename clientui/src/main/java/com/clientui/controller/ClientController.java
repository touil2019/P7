package com.clientui.controller;

import com.clientui.beans.LivreBean;
import com.clientui.proxies.MicroserviceLivreProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
