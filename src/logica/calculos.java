package logica;
public class calculos {

    //String queda el . de double
    // Decimales a CS
    //public double pasarCS(int number){
      
    //}
    
    //Metodo que devuelve el angulo opuesto al Lado 1
    public double TeoremaCosenoAngulos(double Lado1, double Lado2, double Lado3){
        double Angulo;
        
        Angulo = -1 * (((Lado1 * Lado1) - (Lado2 * Lado2) - (Lado3 * Lado3)) / (2 * Lado2 * Lado3));
        Angulo = Math.toDegrees(Math.acos(Angulo));
        
        return Angulo;
    }
    
    //Metodo que devuelve el lado opuesto al Angulo
    public double TeoremaCosenoUnLado(double Lado1, double Lado2, double Angulo){
        double AnguloRadios = Math.toRadians(Angulo);
        double Lado3 = (Lado1 * Lado1) + (Lado2 * Lado2) - 2 * Lado1 * Lado2 * Math.cos(AnguloRadios);
        Lado3 = Math.sqrt(Lado3);
        
        return Lado3;
    }
    
    // CS a decimales
    public double potencia(double unit,double  potencia){
        for(double i = potencia; i >0; i--){
            unit = unit * 10;
        }
        return unit;
    }
}
