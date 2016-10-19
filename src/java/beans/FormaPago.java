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
@Named(value = "formaPago")
@Dependent
public class FormaPago {

    private int idpago;
    private String tipo_pago;
    private int porcentaje;

    public FormaPago(int idpago, String tipo_pago, int porcentaje) {
        this.idpago = idpago;
        this.tipo_pago = tipo_pago;
        this.porcentaje = porcentaje;
    }
    
    
            
    public FormaPago() {
    }

    public int getIdpago() {
        return idpago;
    }

    public void setIdpago(int idpago) {
        this.idpago = idpago;
    }

    public String getTipo_pago() {
        return tipo_pago;
    }

    public void setTipo_pago(String tipo_pago) {
        this.tipo_pago = tipo_pago;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
    
}
