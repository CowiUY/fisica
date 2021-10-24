package logica;

public class CalculoPotencialElectrico{
    
    unidades datos;
    
    double PotencialElectrico1Cargas(double Distancia1, double Carga1){
        double PotencialElectrico;
        
        PotencialElectrico = ((datos.K * datos.Q1) / datos.DistanciaPtoQ1);
        return PotencialElectrico;
    }
    
    double PotencialElectrico2Cargas(double Distancia1, double Distancia2, double Carga1, double Carga2){
        double PotencialElectrico;
        
        PotencialElectrico = ((datos.K * datos.Q1) / datos.DistanciaPtoQ1) + ((datos.K * datos.Q2) / datos.DistanciaPtoQ2);
        return PotencialElectrico;
    }
    
    double PotencialElectrico3Cargas(double Distancia1, double Distancia2, double Distancia3, double Carga1, double Carga2, double Carga3){        
        double PotencialElectrico;
        
        PotencialElectrico = ((datos.K * datos.Q1) / datos.DistanciaPtoQ1) + ((datos.K * datos.Q2) / datos.DistanciaPtoQ2) + ((datos.K * datos.Q3) / datos.DistanciaPtoQ3);
        return PotencialElectrico;
    }
    
}
