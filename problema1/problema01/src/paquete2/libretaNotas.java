/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author utpl
 */
public class libretaNotas {

    private String nom;
    private double calificacion;
    private double calificacion2;
    private double calificacion3;
    private double promedio;

    public libretaNotas(String n, double c1, double c2, double c3) {
        nom = n;
        calificacion = c1;
        calificacion2 = c2;
        calificacion3 = c3;

    }

    public libretaNotas(String n, double c1, double c2) {
        nom = n;
        calificacion = c1;
        calificacion2 = c2;
        calificacion3 = 10;

    }

    public void establecerNom(String x) {
        nom = x;
    }

    public void establecerCalificacion(double x) {
        calificacion = x;
    }

    public void establecerCalificacion2(double x) {
        calificacion2 = x;
    }

    public void establecerCalificacion3(double x) {
        calificacion3 = x;
    }

    public void establecerPromedio() {
        promedio = (calificacion + calificacion2 + calificacion3) / 3;
    }

    public String obtenerNom() {
        return nom;
    }

    public double obtenerCalificacion() {
        return calificacion;
    }

    public double obtenerCalificacion2() {
        return calificacion2;
    }

    public double obtenerCalificacion3() {
        return calificacion3;
    }
    public double obtenerPromedio(){
        return promedio;
    }
    @Override
    public String toString(){
        String cadena = String.format("Libreta de Calificacion\n"
                + ""+"Nombre del estudiante: %s\n"+"Calificacion : "
                + "%.3f\n"+"Calificacion2: %.3f"+"Calificacion3: "
                + "%3.f"+"Promedio: %2.f\n",nom,calificacion,calificacion2,calificacion3,promedio);
        return cadena;
    }

}
