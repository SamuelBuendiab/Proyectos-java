
package isosceles;
import javax.swing.JOptionPane;
public class metodo1 {
    
    
    int lado1,lado2,lado3;
    
    public void leerNumeros(){
        
        lado1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño (cm) primer lado"));
        lado2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segudo tamaño(cm) lado"));
        lado3 = Integer.parseInt(JOptionPane.showInputDialog("Digite el tercer tamaño (cm)  lado"));
        
    }
    public void resultado(){
     
        if (lado1==lado2 && lado1==lado3){
            System.out.print("El triangullo es Equilatero");
            
        }
        else if(lado1!=lado3 && lado3!=lado2 && lado1!=lado2 ) {
            System.out.print("El triangulo es escaleno");
        }
        
       if(lado1==lado2 && lado3!=lado2){
           System.out.println("El triangulo es isoceles");
       }
       else if(lado1!=lado2 && lado3==lado1){
           System.out.println("El triangulo es isoceles");
       }
       else if(lado2==lado3 && lado1!=lado2){
           System.out.println("El triangulo es isoceles");
       }
}
    
}
