/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto1;



public class funcionamiento {
    public double basico,extra,porcen,tohoras,devengados;
    double pension,salud,deducidos,total;
    String nombre1;
    
    public void empleado(double dia, double sueldo){
        
        basico = (sueldo/30)*dia;
        
    }
    
    public void horas (int hora){
        
        extra =(basico/30)/8 ;
        porcen = (extra/100)*25;
        tohoras = porcen+extra;
        devengados = basico + tohoras;
    }
    
    
    
    public void gobierno(){
        
        pension =( basico *4)/100;
        salud = (basico*4)/100;
        deducidos = pension+salud;
    }
    
    public void total2(){
       total =(devengados - deducidos);
        
    }
    
}
