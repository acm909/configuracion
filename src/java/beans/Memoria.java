/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;


import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.http.HttpSession;

/**
 *
 * @author USUARIO
 */
@Named(value = "memoria")
@Dependent
public class Memoria {

    private int idmemoria;
    private String modelo;
    private Double precio;

    public Memoria(int idmemoria, String modelo, Double precio) {
        this.idmemoria = idmemoria;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    
    
    public Memoria() {
    }

    public int getIdmemoria() {
        return idmemoria;
    }

    public void setIdmemoria(int idmemoria) {
        this.idmemoria = idmemoria;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    
}
