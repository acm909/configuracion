/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

import beans.Componentes;
import beans.FormaPago;
import beans.Memoria;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class GestionDatos {
     private Connection obtenerConexion(){
        Connection cn=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc_componentes", "root","sisisi123Talentum@");
        }
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return cn;
    }
    
    private void cerrarConexion(Connection cn){
        try {  
                if(cn!=null){
                    cn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
    }
        
    public ArrayList<Componentes> obtenerComponentes(){
        Connection cn=null;
         ArrayList<Componentes> listado=new ArrayList<>();
        try{
           Statement st;
           ResultSet rs;
            String sql;
            cn=obtenerConexion();
            st=cn.createStatement();
            sql="SELECT * FROM componentes";
            rs=st.executeQuery(sql);            
            while(rs.next()){
                
                Componentes com=new Componentes(rs.getInt("idcomponentes"),
                                       rs.getString("denominacion"),
                                       rs.getDouble("precio")
                        );
                listado.add(com);
            }    
        }        
        catch(SQLException ex){
            ex.printStackTrace();            
        }
        finally{
            cerrarConexion(cn);
            
        }
        return listado;
   }
    
    public ArrayList<FormaPago> obtenerPago(){
        Connection cn=null;
         ArrayList<FormaPago> listado=new ArrayList<>();
        try{
           Statement st;
           ResultSet rs;
            String sql;
            cn=obtenerConexion();
            st=cn.createStatement();
            sql="SELECT * FROM forma_pago";
            rs=st.executeQuery(sql);            
            while(rs.next()){
                
                FormaPago fp=new FormaPago(rs.getInt("idpago"),
                                       rs.getString("tipo_pago"),
                                       rs.getInt("porcentaje")
                        );
                listado.add(fp);
            }    
        }        
        catch(SQLException ex){
            ex.printStackTrace();            
        }
        finally{
            cerrarConexion(cn);
            
        }
        return listado;
   }
    
    public ArrayList<Memoria> obtenerMemoria(){
        Connection cn=null;
         ArrayList<Memoria> listado=new ArrayList<>();
        try{
           Statement st;
           ResultSet rs;
            String sql;
            cn=obtenerConexion();
            st=cn.createStatement();
            sql="SELECT * FROM memoria";
            rs=st.executeQuery(sql);            
            while(rs.next()){
                
                Memoria mem=new Memoria(rs.getInt("idmemoria"),
                                       rs.getString("modelo"),
                                       rs.getDouble("precio")
                        );
                listado.add(mem);
            }    
        }        
        catch(SQLException ex){
            ex.printStackTrace();            
        }
        finally{
            cerrarConexion(cn);
            
        }
        return listado;
   }
   
}
