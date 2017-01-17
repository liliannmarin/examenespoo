/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automovil;

/**
 *
 * @author lilianmarin
 */
public class Automovil {
private String color;
private String marca;
private String subMarca;
private int modelo;

  
private double precio;

    public String getColor()
    {
        return color;
       
    }
    public double getPrecio() {
        return precio;
    }


    public String getmarca() {
        return marca;
    }
    
     public int getModelo() {
        return modelo;
    } 
    
     
     void descripcion()
     {
         System.out.println("Vehiculo marca: "+ marca);
         System.out.println("Sub-marca: "+ subMarca);
         System.out.println("modelo:" + modelo);
         System.out.println("color:" + color);
         System.out.println("precio:" + precio);
     }
     
     public static void main(String[] args) {
        //Creacion de una instancia (onjeto) de tipo Automovil
         Automovil miCarrito = new Automovil();
        miCarrito.color= "rojo";
        miCarrito.marca = "vw";
        miCarrito.modelo = 1999;
        miCarrito.precio = 100000;
        miCarrito.subMarca = "bocho";
        
        miCarrito.descripcion();
                 
                 
                 
                 
                 
    }
     
    
   
}
