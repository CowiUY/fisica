package logica;

public class campoElectrico{
    unidades datos;
    double distq1q2;
    double distq1x;
    double distq2x;
    
    double q1;
    double q2;

    public campoElectrico(unidades datos) {
        this.datos = datos;
    }
    
    public double CampoElectrico1Carga(){
        double campoElecCarga1 = ((datos.K*datos.Q1)/Math.pow(datos.DistanciaPtoQ1, 2));
        return campoElecCarga1;
    }
    
    public double CampoElectrico1CargaQ2(){
        double campoElecCarga1 = ((datos.K*datos.Q2)/Math.pow(datos.DistanciaPtoQ2, 2));
        return campoElecCarga1;
    }
    
    public double CampoElectrico2Cargas(){

            
            double campoElecCarga1 = ((datos.K*datos.Q1)/Math.pow(datos.DistanciaPtoQ1, 2));
    
            
            double campoElecCarga2 = ((datos.K*datos.Q2)/Math.pow(datos.DistanciaPtoQ2, 2));
            
            campoElecCarga1 = (Math.round(campoElecCarga1 *1000.0) / 1000.0);
            campoElecCarga2 = (Math.round(campoElecCarga2 *1000.0) / 1000.0);
            double suma = suma2vectores(campoElecCarga1, campoElecCarga2);
            
        return suma;
    }
    
 
    public double suma2vectores(double Vector1, double Vector2){
        double Angulo = calculos.TeoremaCosenoAngulos(datos.DistanciaQ1Q2, datos.DistanciaPtoQ1, datos.DistanciaPtoQ2);
        double Suma;
        if ((Vector1 < 0 && Vector2 < 0) || (Vector1 > 0 && Vector2 > 0)){
            Vector1 = Math.abs(Vector1);
            Vector2 = Math.abs(Vector2);
            Suma = calculos.TeoremaCoseno(Vector1, Vector2, Angulo);
        }else{
            Angulo = (360 - (Angulo * 2)) / 2;
            Vector1 = Math.abs(Vector1);
            Vector2 = Math.abs(Vector2);
            Suma = calculos.TeoremaCoseno(Vector1, Vector2, Angulo);   
        }
        return Suma;
    }
    
    
    
    //Y HASTA LAS PIEDRAS SABEEEN
    //A DONDE VAAA
}