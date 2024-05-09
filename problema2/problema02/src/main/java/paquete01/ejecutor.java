package paquete01;

import paquete02.Sueldo;

public class ejecutor {

    public static void main(String[] args) {
        Sueldo sueldo1 = new Sueldo("Davide", "Tandazo", 230.2, 0706567322);
        sueldo1.establecerSueldoTotal();

        Sueldo sueldo2 = new Sueldo("Davide", "Tandako", 230.22);
        sueldo2.establecerSueldoTotal();

        System.out.printf("%s%n", sueldo1);
        System.out.printf("%s\n", sueldo2);
    }

}
