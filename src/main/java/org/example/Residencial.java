
package org.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Residencial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idResidencial;
    private String nombre;
    private int numViviendas;
    private String distrito;

    public Residencial() {

    }

    public Residencial(String nombre, int numViviendas, String distrito) {
        this.nombre = nombre;
        this.numViviendas = numViviendas;
        this.distrito = distrito;
    }

    public int getIdResidencial() {
        return idResidencial;
    }

    public void setIdResidencial(int idResidencial) {
        this.idResidencial = idResidencial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumViviendas() {
        return numViviendas;
    }

    public void setNumViviendas(int numViviendas) {
        this.numViviendas = numViviendas;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }
}
