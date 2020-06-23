package com.ocr.utilisateur;

import com.ocr.utilisateur.dao.UtilisateurDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import javax.annotation.PostConstruct;

@EnableFeignClients("com.ocr.utilisateur")
@SpringBootApplication
@EnableDiscoveryClient
public class UtilisateurApplication {

@Autowired
private UtilisateurDao utilisateurDao;

	public static void main(String[] args) {
		SpringApplication.run(UtilisateurApplication.class, args);
	}

	@PostConstruct
	public void postConstruct(){


	}
}
