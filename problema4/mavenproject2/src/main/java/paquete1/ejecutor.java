
package paquete1;

import paquete2.Financias;

public class ejecutor {

   
    public static void main(String[] args) {
      Financias financias1 = new Financias("BancoDeloja","DavideTandazo",1000);
     financias1.establecerComision();
        Financias financias2 = new Financias("BancoPichincha","DavideTandazo",300.9);
     financias2.establecerComision();
       System.out.printf("%s\n", financias1);
        System.out.printf("%s\n", financias2);
    }
    
}
