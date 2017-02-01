/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

/**
 *
 * @author lilianmarin
 */
public class FabricaDona {
    
       private Dona a;
       
      public void prepararFabricacion()
            {
                System.out.println("amasar");
                System.out.println("Combinar Ingredientes");
                System.out.println("Empacar Dona");
                System.out.println("Empacar 2 docenas");
                System.out.println("Entregar Dona");
            }
       
       public Dona crearDona()
            {
               a= new Dona ();
               a.getCircular();
               a.getColor();
               a.getGrosor();
               a.getSabor();
               a.getTamaño();
              
                               
               return a;
       
               
       
        
    }
    public static void main(String[] args) {
        FabricaDona b = new FabricaDona();
        b.crearDona();
    }
}
