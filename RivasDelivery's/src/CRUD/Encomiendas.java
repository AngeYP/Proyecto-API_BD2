/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

/**
 *
 * @author Noel Roberto
 */
public class Encomiendas {
    
    private String codEncomienda;
    private String status;
    private String cod_pais;
    private String cod_estado;
    private String cod_ciudad;
    private String precio;
    private String distancia;
    private String volumen;

    public Encomiendas(String codEncomienda, String status, String cod_pais, String cod_estado, String cod_ciudad, String precio, String distancia,String volumen) {
        this.codEncomienda = codEncomienda;
        this.status = status;
        this.cod_pais = cod_pais;
        this.cod_estado = cod_estado;
        this.cod_ciudad = cod_ciudad;
        this.precio = precio;
        this.distancia = distancia;
        this.volumen = volumen;
    }

    public String getVolumen() {
        return volumen;
    }

    public void setVolumen(String volumen) {
        this.volumen = volumen;
    }

    public String getCodEncomienda() {
        return codEncomienda;
    }

    public void setCodEncomienda(String codEncomienda) {
        this.codEncomienda = codEncomienda;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCod_pais() {
        return cod_pais;
    }

    public void setCod_pais(String cod_pais) {
        this.cod_pais = cod_pais;
    }

    public String getCod_estado() {
        return cod_estado;
    }

    public void setCod_estado(String cod_estado) {
        this.cod_estado = cod_estado;
    }

    public String getCod_ciudad() {
        return cod_ciudad;
    }

    public void setCod_ciudad(String cod_ciudad) {
        this.cod_ciudad = cod_ciudad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }
    
    
}
