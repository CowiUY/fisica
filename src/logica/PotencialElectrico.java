package logica;

public class PotencialElectrico{
    
    unidades datos;

    public PotencialElectrico(unidades datos) {
        this.datos = datos;
    }
    
    public double PotencialElectrico1Carga(){
        double PotencialElectrico;
        PotencialElectrico = ((datos.K * datos.Q1) / Math.pow(datos.DistanciaPtoQ1, 2));
        
        return PotencialElectrico;
    }
    
    public double PotencialElectrico2Cargas(){
        double PotencialElectrico;
        PotencialElectrico = ((datos.K * datos.Q1) / Math.pow(datos.DistanciaPtoQ1, 2)) + 
                             ((datos.K * datos.Q2) / Math.pow(datos.DistanciaPtoQ1, 2));
        
        return PotencialElectrico;
    }
    
    public double PotencialElectrico3Cargas(){        
        double PotencialElectrico;
        PotencialElectrico = ((datos.K * datos.Q1) / Math.pow(datos.DistanciaPtoQ1, 2)) + 
                             ((datos.K * datos.Q2) / Math.pow(datos.DistanciaPtoQ1, 2)) + 
                             ((datos.K * datos.Q3) / Math.pow(datos.DistanciaPtoQ1, 2));
        
        return PotencialElectrico;
    }
    
}