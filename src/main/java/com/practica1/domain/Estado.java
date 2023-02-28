
package com.practica1.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Estado")
public class Estado {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstado; // Transforma en id_estado
    String nombrepais;
    String capital;
    String poblacion;
    String costas;
    int cantidadcostas;

    public Estado() {
    }

    public Estado(Long idEstado, String nombrepais, String capital, String poblacion, String costas, int cantidadcostas) {
        this.idEstado = idEstado;
        this.nombrepais = nombrepais;
        this.capital = capital;
        this.poblacion = poblacion;
        this.costas = costas;
        this.cantidadcostas = cantidadcostas;
    }   
    
}
