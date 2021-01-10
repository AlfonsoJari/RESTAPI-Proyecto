package com.grokonez.jwtauthentication.model;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NaturalId;




@Entity
@Table(name = "covid", uniqueConstraints = {

})
public class Covid{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int sexo;
    private int nacionalidad;
    private int resultado_lab;
    private int entidad_um;


    public Covid() {}

    public Covid(int sexo, int nacionalidad, int resultado_lab, int entidad_um) {
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
        this.resultado_lab = resultado_lab;
        this.entidad_um = entidad_um;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public int getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(int nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getResultado_lab() {
        return resultado_lab;
    }

    public void setResultado_lab(int resultado_lab) {
        this.resultado_lab = resultado_lab;
    }

    public int getEntidad_um() {
        return entidad_um;
    }

    public void setEntidad_um(int entidad_um) {
        this.entidad_um = entidad_um;
    }

}