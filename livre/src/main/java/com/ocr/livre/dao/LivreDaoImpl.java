package com.ocr.livre.dao;

import com.ocr.livre.model.Livre;
import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    public List<Livre> findAll(Sort sort) {
        return livres;
    }

    @Override
    public Optional<Livre> findById(Integer integer) {
        return Optional.empty();
    }
}
