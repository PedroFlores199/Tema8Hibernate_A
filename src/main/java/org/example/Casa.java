package org.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Casa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCasa;
    private String ventana;
    private String puerta;
    private String metros;

    public Casa() {

    }

    public Casa(String ventana, String puerta, String metros) {
        this.ventana = ventana;
        this.puerta = puerta;
        this.metros = metros;
    }

    public int getIdCasa() {
        return idCasa;
    }

    public void setIdCasa(int idCasa) {
        this.idCasa = idCasa;
    }

    public String getVentana() {
        return ventana;
    }

    public void setVentana(String ventana) {
        this.ventana = ventana;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }

    public String getMetros() {
        return metros;
    }

    public void setMetros(String metros) {
        this.metros = metros;
    }
}
