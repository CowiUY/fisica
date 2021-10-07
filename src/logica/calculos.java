package logica;
public class calculos {

    //String queda el . de double
    // Decimales a CS
    //public double pasarCS(int number){
      
    //}
    
    
    
    
    
    
    // CS a decimales
    public double potencia(double unit,double  potencia){
        for(double i = potencia; i >0; i--){
            unit = unit * 10;
        }
        return unit;
    }
}
