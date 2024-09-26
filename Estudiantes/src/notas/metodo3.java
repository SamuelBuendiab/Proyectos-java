
package notas;
import javax.swing.JOptionPane;
public class metodo3 {
    
double nota,nota2,nota3,promedio,a=4.5,b=4.0,c=3.0,d=0.5;
    String nombre;
    
    public void leerNumeros(){
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del alumno");
        nota = Double.parseDouble(JOptionPane.showInputDialog("Digite La nota 1:"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite La nota 2:"));
        nota3 = Double.parseDouble (JOptionPane.showInputDialog("Digite la nota 3:"));
        
          promedio = (nota*nota2*nota3)/3;
    }
    

   public void notas(){
       
       System.out.println(nombre);
       if(promedio>a){
           System.out.println("Felicitaciones");
       }
       else if (promedio<a && promedio>b){
           
           System.out.println("Su nota es Excelente");
       }
       if (promedio<b && promedio>c){
           System.out.println("Su nota es aceptable");
       }
       else if (promedio<c && promedio>d){
           System.out.println("Perdiste la asignatura");
           
       }
       
       System.out.println(promedio);
       
   }
    
}
