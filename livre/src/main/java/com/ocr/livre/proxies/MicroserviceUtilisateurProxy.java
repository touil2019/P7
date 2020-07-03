package com.ocr.livre.proxies;

import com.ocr.livre.beans.UtilisateurBean;

public interface MicroserviceUtilisateurProxy {

    UtilisateurBean login(Long id_utilisateur);
}
