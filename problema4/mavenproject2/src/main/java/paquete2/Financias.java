
package paquete2;


public class Financias {
    private String nom ;
    private String banco;
    private double valorCheque;
    private double comision;

   
    
    
  

    public void establecerNom(String x) {
        nom = x;
    }

    public void establecerBanco(String x) {
        banco = x;
    }

    public void establecerValorCheque(double x) {
        valorCheque = x;
    }

    public void establecerComision() {
        comision =valorCheque*0.003f;
    }

    public String obtenerNom() {
        return nom;
    }

    public String obtenerBanco() {
        return banco;
    }

    public double obtenerValorCheque() {
        return valorCheque;
    }

    public double obtenerComision() {
        return comision;
    }
      
    public Financias(String x, String x1, double x2) {
        nom = x;
        banco = x1;
        valorCheque = x2;
             
    }

       public Financias( String x1, double x2) {
        nom = "Carlos Riofrio";
        banco = x1;
        valorCheque = x2;
        
    }
    @Override
    public String toString() {
    String cadena = String.format("Detalles de la transacción:\n" +
            "Nombre: %s\n" +
            "Banco: %s\n" +
            "Valor del cheque: %.2f\n" +
            "Comisión: %.2f\n", nom, banco, valorCheque, comision);
    return cadena;
}

}
    

