package com.ocr.livre.dao;

import com.ocr.livre.model.Livre;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LivreDaoImpl implements LivreDao {

    public static List<Livre> livres=new ArrayList<>();
    static {
        livres.add(new Livre( 1, "WRIGHT","Richard","Black Boy","GALLIMARD","image 1" ));
        livres.add(new Livre( 2, "WRIGHT","Richard","Black Boy","GALLIMARD","image 1" ));
        livres.add(new Livre( 3, "WRIGHT","Richard","Black Boy","GALLIMARD","image 1" ));
        livres.add(new Livre( 4, "LEE","Harper","Ne Tirez Pas Sur L'Oiseau Moqueur","LE LIVRE DE POCHE","image 2" ));
        livres.add(new Livre( 5, "LEE","Harper","Ne Tirez Pas Sur L'Oiseau Moqueur","LE LIVRE DE POCHE","image 2" ));
        livres.add(new Livre( 6, "LEE","Harper","Ne Tirez Pas Sur L'Oiseau Moqueur","LE LIVRE DE POCHE","image 2" ));
        livres.add(new Livre( 7, "STEINBECK","John","Les Raisins De La Colere","GALLIMARD","image 3" ));
        livres.add(new Livre( 8, "STEINBECK","John","Les Raisins De La Colere","GALLIMARD","image 3" ));
        livres.add(new Livre( 9, "STEINBECK","John","Les Raisins De La Colere","GALLIMARD","image 3" ));
    }

    @Override
    public List<Livre> findAll() {
        return livres;
    }

    @Override
    public Livre findById(int id) {
        for (Livre livre: livres) {

            if (livre.getId()== id){
                return livre;
            }
        }
        return null;
    }

    @Override
    public Livre save(Livre livre) {
        livres.add(livre);
        return livre;
    }
}
