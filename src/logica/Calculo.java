package logica;

public class Calculo {
    double K = 9 * (10^9);
    
    int Q1;
    int Q2;
    int Q3;
    
    double DistanciaQ1Q2;
    double DistanciaQ1Q3 = 0;
    double DistanciaQ2Q3 = 0;
    
    double DistanciaPtoQ1;
    double DistanciaPtoQ2;
    double DistanciaPtoQ3 = 0;

    public Calculo(int Q1, int Q2, int Q3, double DistanciaQ1Q2, double DistanciaPtoQ1, double DistanciaPtoQ2) {
        this.Q1 = Q1;
        this.Q2 = Q2;
        this.Q3 = Q3;
        this.DistanciaQ1Q2 = DistanciaQ1Q2;
        this.DistanciaPtoQ1 = DistanciaPtoQ1;
        this.DistanciaPtoQ2 = DistanciaPtoQ2;
    }

    
    
}
