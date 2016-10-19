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
 * @author Antonio1
 */
@Named(value = "compra")
@Dependent
public class Compra {
    private int memoria;
    private int pago;
    private boolean componentes[]=new boolean[3];

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getPago() {
        return pago;
    }

    public void setPago(int pago) {
        this.pago = pago;
    }

    public boolean[] getComponentes() {
        return componentes;
    }

    public void setComponentes(boolean[] componentes) {
        this.componentes = componentes;
    }

    /**
     * Creates a new instance of Compra
     */
    public Compra() {
    }
    public String comprar(){
        return "carrito";
    }
    
}
