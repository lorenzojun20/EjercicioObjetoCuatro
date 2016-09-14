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
    public Password(String clave){
        this.clave = clave;
        this.longitud = 8;
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
        String aux;
       
        
        if(this.longitud >= 6){
            aux = "La contraseña es fuerte";
        }else{
            aux = "La contraseña es débil";
        }
        
        return aux;
    }
    public String mostrar(){
        String aux;
        aux = "La Longitud de su contraseña es: "+this.getLongitud()+"\n"
                +" La Contraseña es: "+this.getClave();
        
        return aux;
    }
    public void cambiarContraseña(String nueva){
        String aux;
        aux = nueva;
        this.setClave(aux);
    }
}
