
package problema01;

import paquete2.libretaNotas;

public class ejecutor {

    public static void main(String[] args) {
  libretaNotas libreta1 = new libretaNotas("davide",10,5,3);
    libreta1.establecerPromedio();
    libretaNotas libreta2 = new libretaNotas("davide",10,5);
     libreta2.establecerPromedio();
     System.out.printf("%s\n", libreta1);
      System.out.printf("%s\n", libreta2);
    }
    
}
