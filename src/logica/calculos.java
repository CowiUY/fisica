package logica;

import java.math.BigDecimal;

public class calculos {
    
    //LOS MÉTODOS LOS PONEMOS UpperCamelCase, TODOS LOS INICIOS DE PALABRA CON MAYÚSCULAS :)
    
//public static void main(String[] args) {
    //String queda el . de double
    // Decimales a CS
    //public double pasarCS(int number){
    
    
    
      
    //}
    
    
    
    
            
            
    //Metodo que devuelve el angulo opuesto al Lado 1
    static public double TeoremaCosenoAngulos(double Lado1, double Lado2, double Lado3){
        double Angulo;
        
        Angulo = -1 * (((Lado1 * Lado1) - (Lado2 * Lado2) - (Lado3 * Lado3)) / (2 * Lado2 * Lado3));
        Angulo = Math.toDegrees(Math.acos(Angulo));
        
        return Angulo;
    }
    

    //Metodo que devuelve el lado opuesto al Angulo
    static public double TeoremaCoseno(double Lado1, double Lado2, double Angulo){
        double AnguloRadios = Math.toRadians(Angulo);
        double Lado3 = (Lado1 * Lado1) + (Lado2 * Lado2) - 2 * Lado1 * Lado2 * Math.cos(AnguloRadios);
        Lado3 = Math.sqrt(Lado3);
        
        return Lado3;
    }

    
    
    //double intogor = 816;
        //System.out.println(intogor);
        
        
        
        //int bonjour = Everdad(intogor);
        
        
        

    //LEER ==>    
        //IVÁN ESTO HAY QUE IMPORTARLO AL CÓDIGO 
    
        
        /*if ( bonjour == 0){
            System.out.println("NO TIENE E, VERIFICAR...");
            System.out.println(intogor);
            
            int exp = robertogomez(intogor);
                System.out.println("exponente = " +exp);
                double down = intogor;
                for(int d = 0; d < exp; d++){
                    down = down *10;
                    System.out.println("");
                    System.out.println(down);
                }
                System.out.println("abajo = "+down);
                System.out.println("El número sería "+down + " exponente "+exp);
        
        }else{
            
            System.out.println("Tiene E en la posición "+bonjour);
            System.out.println(intogor);
            
            //francisco guarda el numerito de abajo
            String etrin = ""+intogor;
            String francisco="";
            for (int z = 0; z < bonjour; z++){
                francisco += etrin.charAt(z);
            }
            System.out.println("fran = "+francisco);
            
            String abajation = "";
            
            for (int z = bonjour+1; z < etrin.length(); z++){
                abajation += etrin.charAt(z);
            }
            System.out.println("abajation = "+abajation);
            
            
        
        
        } */  
        
        
    //HASTA ACÁ, GRACIAS AIBAN POR LA ATENCIÓN 
    //LEER HASTA ACÁ <==
    
    
    
    
    
    
    
    
    //Se fija si hay una E en el double
         int Everdad(double number){ //static
    int denominador = 0;
    String lucio = ""+number;
    System.out.println("LUCIO LENGTH");
    System.out.println(lucio.length());

    System.out.println();
    System.out.println();
    System.out.println("Lucio CONTENT");
    System.out.println(lucio);

    System.out.println();
    System.out.println();
    boolean verdad = false;

    Boolean roberto = false;

    for (int i = 0; i < lucio.length() ; i++) {
        if (lucio.charAt(i) == 'E'){
            System.out.println(lucio.charAt(i));
            System.out.println("E DETECTED");
            roberto = true;
            verdad = true;
        }else{
            System.out.println(lucio.charAt(i));
            System.out.println("NEGATIVO CENTRAL");

            if (roberto == false){
                denominador++;
            }
            
        }



        
    }
    if (verdad){
        return denominador;
    }else{
        return 0;
    }
    
    }

    
    //Si el número es 0.algo...
static int RobertoGomez(double number){
    String etrin = ""+number;
    int vueltas = 0;
    System.out.println();
    System.out.println(etrin.charAt(0));
    System.out.println();
    
    System.out.println("number = "+number);
    while(etrin.charAt(0)=='0'){
        
        vueltas++;
        number = number * 10;
        etrin = ""+BigDecimal.valueOf(number);
        System.out.println("etrin = "+etrin);
        System.out.println("Char at 0 "+etrin.charAt(0));
        //System.out.println(number);
        
        System.out.println("vueltas = "+vueltas);
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        //System.out.println(peo);
    }
   return vueltas;
}
    
    
    
    
    
    

    
    // CS a decimales
    public double Potencia(double unit,double  potencia){
        for(double i = potencia; i >0; i--){
            unit = unit * 10;
        }
        return unit;
    
        
        
        
        
        
}



}



