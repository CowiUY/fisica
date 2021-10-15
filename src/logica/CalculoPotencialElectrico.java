package logica;

public class CalculoPotencialElectrico extends unidades{

    public CalculoPotencialElectrico(int Q1, int Q2, double DistanciaQ1Q2, double DistanciaPtoQ1, double DistanciaPtoQ2) {
        super(Q1, Q2, DistanciaQ1Q2, DistanciaPtoQ1, DistanciaPtoQ2);
    }
    
    double PotencialElectrico2Cargas(double Distancia1, double Distancia2, double Carga1, double Carga2){
        double PotencialElectrico;
        
        PotencialElectrico = ((K * Carga1) / Distancia1) + ((K * Carga2) / Distancia2);
        return PotencialElectrico;
    }
    
    double PotencialElectrico3Cargas(double Distancia1, double Distancia2, double Distancia3, double Carga1, double Carga2, double Carga3){        
        double PotencialElectrico;
        
        PotencialElectrico = ((K * Carga1) / Distancia1) + ((K * Carga2) / Distancia2) + ((K * Carga3) / Distancia3);
        return PotencialElectrico;
    }
    
}
