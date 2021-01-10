package com.grokonez.jwtauthentication.repository;
import java.util.Optional;

import com.grokonez.jwtauthentication.model.Imc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Repository
public interface ImcRepository extends JpaRepository<Imc, Long> {
    Page<Imc> findByIduser(Long iduser, Pageable pageable);
}