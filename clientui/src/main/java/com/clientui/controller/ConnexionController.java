package com.clientui.controller;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConnexionController {
    @RequestMapping(value = "/connexion", method = RequestMethod.GET)
    public ModelAndView loginGet(Model model,
                                 @RequestParam(value = "error", required = false) String error,
                                 @RequestParam(value = "logout", required = false) String logout) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String errorMessage = null;
        if (error != null) {

            errorMessage = "Pseudo ou mot de passe incorrects !";
        }
        if (logout != null) {
            errorMessage = "Vous avez été déconecté avec succès !";

        }
        model.addAttribute("errorMessge", errorMessage);

        if (!(auth instanceof AnonymousAuthenticationToken)) {
            return new ModelAndView("redirect:/MonProfil");
        }
        return new ModelAndView("Connexion");
    }
}