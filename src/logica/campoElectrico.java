/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Gabriel
 */
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
    
    
    
    public double CampoElectrico2Cargas(){
            final double K = 9 * (10^9);
            
            
            double campoElecCarga1 = ((K*datos.Q1)/datos.DistanciaPtoQ1);
    
            
            double campoElecCarga2 = ((K*datos.Q2)/datos.DistanciaPtoQ2);
            
            
            double puta = suma2vectores();
            
        return puta;
    }
    
 
    public double suma2vectores(){
        System.out.println("MORA SE LA COMEEEE");
        System.out.println("a su novia");
        
        //MORA ACÁ TENÉS QUE SUMAR 2 VECTORES :)
        
        return 0.4153135418646;
    }
    
    
    
    //Y HASTA LAS PIEDRAS SABEEEN
    //A DONDE VAAA
}