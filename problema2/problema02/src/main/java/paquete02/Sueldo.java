package paquete02;

public class Sueldo {

    private String nom;
    private String ape;
    private double sueldoBasico;
    private double sueldoTotal;
    private long cedula;

    public Sueldo(String nom2, String ape2, double Sb, long cedu) {
        nom = nom2;
        ape = ape2;
        sueldoBasico = Sb;
        cedula = cedu;
    }

    public Sueldo(String nom2, String ape2, double Sb) {
        nom = nom2;
        ape = ape2;
        sueldoBasico = Sb;
        cedula = 1111111;
    }

    public void establecerNom(String n) {
        nom = n;
    }

    public void establecerApe(String n) {
        ape = n;
    }

    public void establecerSueldoBasico(double n) {
        sueldoBasico = n;

    }

    public void establecerSueldoTotal() {
        sueldoTotal = sueldoBasico + (0.20 * sueldoBasico);
    }

    public void establecerCedula(long n) {
        cedula = n;
    }

    public String obtenerNom() {
        return nom;
    }

    public String obtenerApe() {
        return ape;
    }

    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }

    public double cedula() {
        return cedula;
    }

    @Override

    public String toString() {
        String cadena = String.format("Sueldo de profesores:\n"
                + "Nombre Prf: %s\n"
                + "Apellido Prf: %s\n"
                + "Sueldo Basico: %.2f\n"
                + "Sueldo Total: %.2f\n"
                + "Cedula: %07d\n", nom, ape, sueldoBasico, sueldoTotal, cedula);
        return cadena;
    }

}
