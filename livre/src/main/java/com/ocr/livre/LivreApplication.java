package com.ocr.livre;

import com.ocr.livre.dao.LivreDao;
import com.ocr.livre.model.Livre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class LivreApplication {

@Autowired
private LivreDao livreDao;

	public static void main(String[] args) {
		SpringApplication.run(LivreApplication.class, args);
	}

	@PostConstruct
	public void postConstruct(){
		Livre livre1 = new Livre("WRIGHT","Richard","Black Boy","GALLIMARD","image 1" );
		livreDao.save(livre1);
	}
}
