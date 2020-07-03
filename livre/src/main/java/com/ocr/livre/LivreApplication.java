package com.ocr.livre;

import com.ocr.livre.dao.EmailDao;
import com.ocr.livre.dao.LivreDao;
import com.ocr.livre.dao.EmpruntLivreDao;
import com.ocr.livre.model.Emprunt;
import com.ocr.livre.model.Livre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import javax.annotation.PostConstruct;
import java.util.Date;

@EnableFeignClients("com.ocr.livre")
@SpringBootApplication
@EnableDiscoveryClient
public class LivreApplication {

@Autowired
private LivreDao livreDao;
@Autowired
private EmpruntLivreDao empruntLivreDao;
@Autowired
private EmailDao emailDao;

	public static void main(String[] args) {
		SpringApplication.run(LivreApplication.class, args);
	}

	@PostConstruct
	public void postConstruct(){
		Livre livre1 = new Livre("WRIGHT","Richard","Black Boy","GALLIMARD","https://images-na.ssl-images-amazon.com/images/I/41sH5979BrL._SX302_BO1,204,203,200_.jpg" ,1);
		livreDao.save(livre1);
		Livre livre2 = new Livre("WRIGHT","Richard","Black Boy","GALLIMARD","https://images-na.ssl-images-amazon.com/images/I/41sH5979BrL._SX302_BO1,204,203,200_.jpg",1 );
		livreDao.save(livre2);
		Livre livre3 = new Livre("WRIGHT","Richard","Black Boy","GALLIMARD","https://images-na.ssl-images-amazon.com/images/I/41sH5979BrL._SX302_BO1,204,203,200_.jpg",1 );
		livreDao.save(livre3);
		Livre livre4 = new Livre("STEINBECK","JOHN","Les Raisins De La Colere","GALLIMARD","https://images-na.ssl-images-amazon.com/images/I/418A1zRYhGL._SX302_BO1,204,203,200_.jpg",1 );
		livreDao.save(livre4);
		Livre livre5 = new Livre("STEINBECK","JOHN","Les Raisins De La Colere","GALLIMARD","https://images-na.ssl-images-amazon.com/images/I/418A1zRYhGL._SX302_BO1,204,203,200_.jpg",1);
		livreDao.save(livre5);
		Livre livre6 = new Livre("STEINBECK","JOHN","Les Raisins De La Colere","GALLIMARD","https://images-na.ssl-images-amazon.com/images/I/418A1zRYhGL._SX302_BO1,204,203,200_.jpg",2 );
		livreDao.save(livre6);
		Livre livre7 = new Livre("LEE","Harper","Ne Tirez Pas Sur L'Oiseau Moqueur","LE LIVRE DE POCHE","https://m.media-amazon.com/images/I/41mY4e0kS9L.jpg",1);
		livreDao.save(livre7);
		Livre livre8 = new Livre("LEE","Harper","Ne Tirez Pas Sur L'Oiseau Moqueur","LE LIVRE DE POCHE","https://m.media-amazon.com/images/I/41mY4e0kS9L.jpg",1);
		livreDao.save(livre8);
		Livre livre9 = new Livre("LEE","Harper","Ne Tirez Pas Sur L'Oiseau Moqueur","LE LIVRE DE POCHE","https://m.media-amazon.com/images/I/41mY4e0kS9L.jpg",1);
		livreDao.save(livre9);

		Emprunt emprunt1 = new Emprunt( "USER", new Date(), new Date(),true,true, "Black Boy");
		empruntLivreDao.save(emprunt1);
		Emprunt emprunt2 = new Emprunt("USER",new Date(),new Date(),true,true,"Les Raisins De La Colere");
		empruntLivreDao.save(emprunt2);
		Emprunt emprunt3 = new Emprunt("USER",new Date(),new Date(),true,true,"Ne Tirez Pas Sur L'Oiseau Moqueur");
		empruntLivreDao.save(emprunt3);
		Emprunt emprunt4 = new Emprunt("ADMIN",new Date(),new Date(),true,true,"Black Boy");
		empruntLivreDao.save(emprunt4);
		Emprunt emprunt5 = new Emprunt("ADMIN",new Date(),new Date(),true,true,"Les Raisins De La Colere");
		empruntLivreDao.save(emprunt5);
		Emprunt emprunt6 = new Emprunt("ADMIN",new Date(),new Date(),true,true,"Ne Tirez Pas Sur L'Oiseau Moqueur");
		empruntLivreDao.save(emprunt6);
	}
}
