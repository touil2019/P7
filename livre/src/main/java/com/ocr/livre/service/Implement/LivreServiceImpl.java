package com.ocr.livre.service.Implement;

import com.ocr.livre.LivreApplication;
import com.ocr.livre.dao.LivreDao;
import com.ocr.livre.model.Livre;
import com.ocr.livre.service.LivreService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


    @Service
    public class LivreServiceImpl implements LivreService {

        private static final Logger logger = (Logger) LogManager.getLogger(LivreApplication.class);

        @Autowired
        LivreDao livreDao;


        @Override
        public List<Livre> findAll() {

            logger.info("Appel LivreServiceImpl méthode findAll");

            return livreDao.findAll();
        }

        @Override
        public List<Livre> findByTitreContainingIgnoreCase(String mc) {

            logger.info("Appel LivreServiceImpl méthode findByTitreContainingIgnoreCase avec paramètre mc : " +mc );

            return livreDao.findByTitreContainingIgnoreCase(mc);
        }

        @Override
        public Livre findLivreById(Long idLivre) {

            logger.info("Appel LivreServiceImpl méthode findLivreById avec paramètre idLidvre : " +idLivre );

            return livreDao.findById(idLivre).get();
        }

        @Override
        public Livre enregistrerNouveauLivre(Livre livre){

            logger.info("Appel LivreServiceImpl méthode enregistrerNouveauLivre");

            Livre nouveauLivre = new Livre() ;

            nouveauLivre.setAuteurName(livre.getAuteurName());
            nouveauLivre.setAuteurPrenom(livre.getAuteurPrenom());
            nouveauLivre.setEdition(livre.getEdition());
            nouveauLivre.setQuantiteDispo(livre.getQuantiteDispo());
            nouveauLivre.setTitre(livre.getTitre());
            nouveauLivre.setImage(livre.getImage());

            return livreDao.save(nouveauLivre);
        }

        @Override
        public void supprimerLivre(Long idLivre) {

            logger.info("Appel LivreServiceImpl méthode supprimerLivre avec paramètre idLidvre : " + idLivre );

            livreDao.deleteById(idLivre);
        }


    }
