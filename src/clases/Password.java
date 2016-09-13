/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Lorenzo
 */
public class Password {
    private int longitud;
    private String clave;
    
    public Password(int longi,String clave){
        this.longitud = longi;
        this.clave = clave;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    public String estabilidad(){
        
        
        String clave;
       
        
        if(this.longitud >= 6){
            clave = "La contraseña es fuerte";
        }else{
            clave = "La contraseña es débil";
        }
        
        return clave;
    }
}
