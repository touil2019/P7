package com.ocr.livre.service;

import com.ocr.livre.LivreApplication;
import com.ocr.livre.beans.UtilisateurBean;
import com.ocr.livre.dao.EmailDao;
import com.ocr.livre.model.Email;
import com.ocr.livre.model.Emprunt;
import com.ocr.livre.proxies.MicroserviceUtilisateurProxy;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

public interface EmpruntService {

    List<Emprunt> findAll();

    Optional<Emprunt> findById(Long idEmprunt);

    List<Emprunt> findAllByPseudoEmprunteur(String pseudoEmprunteur);

    Emprunt ouvrirEmprunt(Long idLivre, String pseudoEmprunteur);

    Emprunt cloturerEmprunt(Long idEmprunt);

    Date ajouter4Semaines(Date date);

    Emprunt prolongerEmprunt(Long idEmprunt);

    List<Emprunt> listeLivreNonRendueApresDateFin();
}
