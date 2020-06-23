package com.ocr.utilisateur;

import com.ocr.utilisateur.dao.LivreDao;
import com.ocr.utilisateur.model.Livre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import javax.annotation.PostConstruct;

@EnableFeignClients("com.ocr.livre")
@SpringBootApplication
@EnableDiscoveryClient
public class LivreApplication {

@Autowired
private LivreDao livreDao;

	public static void main(String[] args) {
		SpringApplication.run(LivreApplication.class, args);
	}

	@PostConstruct
	public void postConstruct(){
		Livre livre1 = new Livre("WRIGHT","Richard","Black Boy","GALLIMARD","https://images-na.ssl-images-amazon.com/images/I/41sH5979BrL._SX302_BO1,204,203,200_.jpg" );
		livreDao.save(livre1);
		Livre livre2 = new Livre("WRIGHT","Richard","Black Boy","GALLIMARD","https://images-na.ssl-images-amazon.com/images/I/41sH5979BrL._SX302_BO1,204,203,200_.jpg" );
		livreDao.save(livre2);
		Livre livre3 = new Livre("WRIGHT","Richard","Black Boy","GALLIMARD","https://images-na.ssl-images-amazon.com/images/I/41sH5979BrL._SX302_BO1,204,203,200_.jpg" );
		livreDao.save(livre3);
		Livre livre4 = new Livre("STEINBECK","JOHN","Les Raisins De La Colere","GALLIMARD","https://images-na.ssl-images-amazon.com/images/I/418A1zRYhGL._SX302_BO1,204,203,200_.jpg" );
		livreDao.save(livre4);
		Livre livre5 = new Livre("STEINBECK","JOHN","Les Raisins De La Colere","GALLIMARD","https://images-na.ssl-images-amazon.com/images/I/418A1zRYhGL._SX302_BO1,204,203,200_.jpg" );
		livreDao.save(livre5);
		Livre livre6 = new Livre("STEINBECK","JOHN","Les Raisins De La Colere","GALLIMARD","https://images-na.ssl-images-amazon.com/images/I/418A1zRYhGL._SX302_BO1,204,203,200_.jpg" );
		livreDao.save(livre6);
		Livre livre7 = new Livre("LEE","Harper","Ne Tirez Pas Sur L'Oiseau Moqueur","LE LIVRE DE POCHE","https://m.media-amazon.com/images/I/41mY4e0kS9L.jpg");
		livreDao.save(livre7);
		Livre livre8 = new Livre("LEE","Harper","Ne Tirez Pas Sur L'Oiseau Moqueur","LE LIVRE DE POCHE","https://m.media-amazon.com/images/I/41mY4e0kS9L.jpg");
		livreDao.save(livre8);
		Livre livre9 = new Livre("LEE","Harper","Ne Tirez Pas Sur L'Oiseau Moqueur","LE LIVRE DE POCHE","https://m.media-amazon.com/images/I/41mY4e0kS9L.jpg");
		livreDao.save(livre9);


	}
}
