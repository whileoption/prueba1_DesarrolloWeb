
package com.prueba1.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 * @author Karina Madrigal
 */

@Entity
@Table(name = "artistas")
public class Artista implements Serializable {
    
    @Id //Autoincremental
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //Valores en columnas
    private String artista;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
    
    

}
