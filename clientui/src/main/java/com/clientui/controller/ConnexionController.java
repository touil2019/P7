package com.clientui.controller;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**@Controller
public class ConnexionController {
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView loginGet() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        if (!(auth instanceof AnonymousAuthenticationToken)) {

            return new ModelAndView("redirect:/site");
        }

        return new ModelAndView("login");
    }
}*/