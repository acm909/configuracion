/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author USUARIO
 */
@Named(value = "componentes")
@Dependent
public class Componentes {

  private int idcomponentes;
  private String denominacion;
  private Double precio;

    public Componentes(int idcomponentes, String denominacion, Double precio) {
        this.idcomponentes = idcomponentes;
        this.denominacion = denominacion;
        this.precio = precio;
    }
  
  
  
    public Componentes() {
        
    }

    public int getIdcomponentes() {
        return idcomponentes;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setIdcomponentes(int idcomponentes) {
        this.idcomponentes = idcomponentes;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    
    
}
