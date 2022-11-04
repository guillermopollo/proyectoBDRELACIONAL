/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.Serializable;

/**
 *
 * @author willy
 */
public class Prenda extends Persona   {

    public Prenda(String codigo, String TipoPrenda, String Talla, String dni ) {
       this.dni=dni;
        this.codigo = codigo;
        this.TipoPrenda = TipoPrenda;
        this.Talla = Talla;
      
    }
    public Prenda (String dni , String TipoPrenda){
    this.dni=dni;
    this.TipoPrenda=TipoPrenda;
    
    }

 
String codigo;
          String TipoPrenda;
          String Talla;
     Persona persona1;
     
    public String getTipoPrenda() {
        return TipoPrenda;
    }

    public void setTipoPrenda(String TipoPrenda) {
        this.TipoPrenda = TipoPrenda;
    }

    public String getTalla() {
        return Talla;
    }

    public void setTalla(String Talla) {
        this.Talla = Talla;
    }

    public Persona getPersona1() {
        return persona1;
    }

    public void setPersona1(Persona persona1) {
        this.persona1 = persona1;
    }


    
         
    
  
    
    public String getCodigo(){
        
        return codigo;
    }


    

}
