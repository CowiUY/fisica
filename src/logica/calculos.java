package logica;

import java.math.BigDecimal;

public class calculos {
    
    //LOS MÉTODOS LOS PONEMOS UpperCamelCase, TODOS LOS INICIOS DE PALABRA CON MAYÚSCULAS :)
    
//public static void main(String[] args) {
    //String queda el . de double
    // Decimales a CS
    //public double pasarCS(int number){
    
    
    
      
    //}
    double intogor;
    
    public calculos(){
        
    }
    
            
            
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

    
    
        
        int bonjour = Everdad(intogor);
        
        
        

        
    /*
    
        if ( bonjour == 0){
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
            
            
        
        
        }  
      */  
        
    //HASTA ACÁ, GRACIAS AIBAN POR LA ATENCIÓN 
    //LEER HASTA ACÁ <==

    
    
    
    
    
    
    
    
    
    //Se fija si hay una E en el double
        public int Everdad(double number){ //static
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

    for (int i = 0; i < lucio.length()-1 ; i++) {
        if (lucio.charAt(i) == 'E'){
            System.out.println(lucio.charAt(i));
            System.out.println("E DETECTED");
            roberto = true;
            verdad = true;
        }else if (!verdad){
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
        
        public int tiene0(double number){
            int vueltas = 0;
            
            
            
            
            //int numerito = (int) Math.round(number);
            int numerito = (int) number;
            System.out.println("numerito = "+numerito);
            String etrin = String.valueOf(numerito);
            
            if (etrin.length() >= 3){
                while (etrin.length() != 2){
                System.out.println("etrin p = " +etrin);
                numerito /= 10;
                etrin = String.valueOf(numerito);
                System.out.println("etrin a = "+etrin);
                System.out.println("");
                System.out.println("");
                vueltas++;
            }
            }else
            
            
                while (etrin.length() != 2){
                System.out.println("etrin p = " +etrin);
                numerito *= 10;
                etrin = String.valueOf(numerito);
                System.out.println("etrin a = "+etrin);
                System.out.println("");
                System.out.println("");
                vueltas++;
            }
                
            
                    System.out.println("TIENE 0 MENOR A 0");
                    
                    while (etrin.length() != 2){
                System.out.println("etrin p = " +etrin);
                numerito /= 10;
                etrin = String.valueOf(numerito);
                System.out.println("etrin a = "+etrin);
                System.out.println("");
                System.out.println("");
                vueltas++;
                    }
            
            
        
            
            
            
            
            
            
            return vueltas;
        }
        
        
        
        public int tiene0Base(double number){
            
            int numerito = (int) number;
            String etrin = String.valueOf(numerito);
            while (etrin.length() != 2){
                System.out.println("etrin p = " +etrin);
                numerito /= 10;
                etrin = String.valueOf(numerito);
                System.out.println("etrin a = "+etrin);
                System.out.println("");
                System.out.println("");
                
            }
                return Integer.parseInt(etrin);
        }
        
        public double dosCS(double number){
            String volver;
            String etrin = String.valueOf(number);
            
            boolean tienePunto = false;
                System.out.println("DOS CS, numero es "+etrin);
            if (etrin.charAt(1) == '.'){
                
                tienePunto = true;
                System.out.println("Tiene punto "+etrin.charAt(1));
            }
            if (tienePunto){
                System.out.println("tienePunto");
                volver = etrin.substring(0, 3);
            }else{
                System.out.println("noTienePunto");
                volver = etrin.substring(0, 2);
            }
            return Double.parseDouble(volver);
        }
        
        
        public int cifras(double number){
            String etrin = String.valueOf(number);
            int numerito = (int) number;
            System.out.println("numerito cifras "+numerito);
            while (etrin.length() != 2){
                System.out.println("etrin p = " +etrin);
                numerito *= 10;
                etrin = String.valueOf(numerito);
                System.out.println("etrin a = "+etrin);
                System.out.println("");
                System.out.println("");
                
            }
                return Integer.parseInt(etrin);
        }
        
        public int cifrasExp(double number){
            String etrin = String.valueOf(number);
            int numerito = (int) Math.round(number);
            int vueltas =0;
            while (etrin.length() != 2){
                System.out.println("etrin p = " +etrin);
                numerito *= 10;
                vueltas++;
                etrin = String.valueOf(numerito);
                System.out.println("etrin a = "+etrin);
                System.out.println("");
                System.out.println("");
                
            }
                return vueltas;
        }

    
    //Si el número es 0.algo...
public static int RobertoGomez(double number){
    String etrin = String.valueOf(number);
    int vueltas = 0;
    System.out.println();
    System.out.println(etrin.charAt(0));
    System.out.println(etrin.charAt(1));
    System.out.println();
    
    System.out.println("number = "+number);
    while(etrin.charAt(0)=='0'){
        
        vueltas++;
        number = number * 10;
        //etrin = ""+BigDecimal.valueOf(number);
        etrin = String.valueOf(number);
        
        System.out.println("etrin = "+etrin);
        System.out.println("Char at 0 "+etrin.charAt(0));
        //System.out.println(number);
        
        System.out.println("vueltas = "+vueltas);
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        //System.out.println(peo);
    }
    //vueltas = -vueltas;
   return -vueltas;
}
    
    
    
    public double hayEBase(double carga, int tieneE){
        
        String etrin = String.valueOf(carga);
            String abajation = "";
            
            //for (int z = tieneE+1; z < etrin.length()-1; z++){
            for (int z = 0; z < tieneE; z++){
                abajation += etrin.charAt(z);
            }
        
        
        
        return Double.parseDouble(abajation);
        
    }
    
    public double hayExponente(double carga, int tieneE){
            String etrin = ""+carga;
            String francisco="";
            
            for (int z = tieneE+1; z <= etrin.length()-1; z++){
                francisco += etrin.charAt(z);
                
            }
            System.out.println("Exponente E "+francisco);
            
            
            return Double.parseDouble(francisco);
    }
    
    
    

    
    // CS a decimales
    public double Potencia(double unit,double  potencia){
        
        if (potencia > 0){
            for(double i = potencia; i >0; i--){
            unit = unit * 10;
        }
        }else{
            for(double i = 0; i >potencia; i--){
            unit = unit / 10;
        }
        }
        
        
        return unit;
    
        
        
        
        
        
}

    public int sacar0(double number){
        String etrin = String.valueOf(number);
        int vueltas = 0;
        
        for (int i = 0; i < etrin.length(); i++){
            if (etrin.charAt(i) != '.'){
                vueltas++;
                System.out.println("No hay coma, caracter: "+etrin.charAt(i));
        }else{
                System.out.println("Hay coma, caracter: "+etrin.charAt(i));
            }
        }
        
        return 5;
    }


}


