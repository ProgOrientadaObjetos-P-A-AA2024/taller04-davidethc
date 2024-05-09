package paquete1;

import paquete02.Automotor;

public class ejecutor {

    public static void main(String[] args) {
        Automotor automo1 = new Automotor(99879292, "Honda", 2000, 5677);
        automo1.establecerValorMatricula();
        Automotor automo2 = new Automotor(99879292, "cherole", 2.2f);
        automo2.establecerValorMatricula();
        System.out.printf("%s\n", automo1);
        System.out.printf("%s\n", automo2);

    }

}
