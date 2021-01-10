package com.grokonez.jwtauthentication.controller;

//import com.example.ng5api.exception.ResourceNotFoundException;
import com.grokonez.jwtauthentication.model.Imc;
import com.grokonez.jwtauthentication.repository.ImcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.Optional;

//@CrossOrigin(origins = "*", maxAge = 3600)
@CrossOrigin()
@RestController
//@RequestMapping("/api/auth")

public class ImcController {

    @Autowired
    private ImcRepository imcRepository;

    @GetMapping("/imcs")
    public Page<Imc> getImcs(Pageable pageable) {
        return imcRepository.findAll(pageable);
    }

    @PostMapping("/searchimcs/{iduser}")
    public Page<Imc> getImcsUser(@PathVariable Long iduser, Pageable pageable) {
        return imcRepository.findByIduser(iduser, pageable);    
    }

    @PostMapping("/imcs")
    public Imc createImc(@Valid @RequestBody Imc imc) {
        return imcRepository.save(imc);
    }

} 