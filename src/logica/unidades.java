package logica;

public class unidades {
    final double K = 9 * (Math.pow(10, 9));

    public double Q1;
    public double Q2;
    public double Q3;
    
    public double DistanciaQ1Q2;
    public double DistanciaQ1Q3;
    public double DistanciaQ2Q3;
    
    public double DistanciaPtoQ1;
    public double DistanciaPtoQ2;
    public double DistanciaPtoQ3;

    public double getQ1() {
        return Q1;
    }

    public void setQ1(double Q1) {
        this.Q1 = Q1;
    }

    //constructor 2 cargas
    public unidades(double Q1, double Q2, double DistanciaQ1Q2, double DistanciaPtoQ1, double DistanciaPtoQ2) {
        this.Q1 = Q1;
        this.Q2 = Q2;
        this.DistanciaQ1Q2 = DistanciaQ1Q2;
        this.DistanciaPtoQ1 = DistanciaPtoQ1;
        this.DistanciaPtoQ2 = DistanciaPtoQ2;
    }
    
    public unidades(double Q1, double Q2, double Q3, double DistanciaQ1Q2, double DistanciaQ1Q3, double DistanciaQ2Q3, double DistanciaPtoQ1, double DistanciaPtoQ2, double DistanciaPtoQ3) {
        this.Q1 = Q1;
        this.Q2 = Q2;
        this.Q3 = Q3;
        this.DistanciaQ1Q2 = DistanciaQ1Q2;
        this.DistanciaQ1Q3 = DistanciaQ1Q3;
        this.DistanciaQ2Q3 = DistanciaQ2Q3;
        this.DistanciaPtoQ1 = DistanciaPtoQ1;
        this.DistanciaPtoQ2 = DistanciaPtoQ2;
        this.DistanciaPtoQ3 = DistanciaPtoQ3;
    }

    public unidades(double Q1, double DistanciaPtoQ1) {
        this.Q1 = Q1;
        this.DistanciaPtoQ1 = DistanciaPtoQ1;
    }

    public unidades() {
    }
    
    

    
}