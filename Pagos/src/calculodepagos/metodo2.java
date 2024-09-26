
package calculodepagos;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class metodo2 {
    
    
    int cantidad;
    double iva,precio,def,i,v,a,b=0.15,c=0.10,k=0.05,n;
    String ar;
    
    public void leerNumeros(){
        ar = JOptionPane.showInputDialog("Ingrese el nombre del articulo");
        precio = Double.parseDouble(JOptionPane.showInputDialog("Digite El valor del producto"));
        iva = Double.parseDouble(JOptionPane.showInputDialog("Digite el IVA a ingresar (en forma decimal 0.xxx)"));
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de productos"));
        
        
         def = cantidad*precio;
         i = def * iva;
         v = def + i;
    }

    public void opciones(){
        
        int r;
        System.out.println("Metodos de pago");
        System.out.println("(1)pago en efectivo");
        System.out.println("(2)pago Con tarjeta debito");
        System.out.println("(3)pago con tarjeata credito");
        Scanner entrada=new Scanner(System.in);
        r = entrada.nextInt();
        
        switch(r){
            case 1:
                a = v*b;
                n = v-a;
                System.out.println("El valor a pagar de "+ar+" es: "+n);
                
            break;
            
            case 2:
                a = v*c;
                n = v-a;
               System.out.println("El valor a pagar de "+ar+" es : "+n);
            break;
              case 3:
                a = v*k;
                n = v-a;
               System.out.println("El valor a pagar de "+ar+" es : "+n);
            break;
            
              default:
                  System.out.println("ingrese un numero de 1 a 3");
        }
        
        
    }
}