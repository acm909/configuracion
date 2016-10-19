/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import gestion.GestionDatos;
import java.util.ArrayList;
import javax.inject.Named;
import javax.enterprise.context.Dependent;


/**
 *
 * @author USUARIO
 */
@Named(value = "geters")
@Dependent
public class geters {
    GestionDatos gd=new GestionDatos();
    public ArrayList<Memoria> getMemoria(){
        return gd.obtenerMemoria();
    }
    public ArrayList<Componentes> getComponentes(){
        return gd.obtenerComponentes();
    }
    public ArrayList<FormaPago> getPago(){
        return gd.obtenerPago();
    }
    

    /**
     * Creates a new instance of geters
     */
    public geters() {
    }
    
}
