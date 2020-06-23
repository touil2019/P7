package com.ocr.utilisateur.configuration;

import com.ocr.utilisateur.web.exceptions.LivreNotFoundException;
import feign.Response;
import feign.codec.ErrorDecoder;


public class CustomErrorDecoder implements ErrorDecoder {

    private final ErrorDecoder defaultErrorDecoder = new Default();

    @Override
    public Exception decode(String invoqueur, Response reponse) {

        if(reponse.status() == 400 ) {
            return new LivreNotFoundException(
                    "Livre non trouvé"
            );
        }

        return defaultErrorDecoder.decode(invoqueur, reponse);
    }

}
