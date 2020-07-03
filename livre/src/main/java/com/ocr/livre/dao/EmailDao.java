package com.ocr.livre.dao;

import com.ocr.livre.model.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailDao extends JpaRepository<Email, Long> {

    Email findByNom(String relance);
}
