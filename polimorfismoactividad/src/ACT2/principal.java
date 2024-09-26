
package ACT2;

public class principal {
    public static void main(String[] args){
        
        figurageometrica figura[] = new figurageometrica[5];
        
        figura[0] = new figurageometrica("es la distancia alrededor de una figura","Mide el espacio de una figura","Espacio ocupado por un cuerpo");
        figura[1] = new circulo(90f,282,"es la distancia alrededor de una figura","Mide el espacio de una figura","Espacio ocupado por un cuerpo");
        figura[2] = new cuadrado(4,18,"es la distancia alrededor de una figura","Mide el espacio de una figura","Espacio ocupado por un cuerpo");
        figura[3] = new rectangulo(4,15,"es la distancia alrededor de una figura","Mide el espacio de una figura","Espacio ocupado por un cuerpo");
        figura[4] = new triangulo("Equilatero,isoseles,rectangulo",3,"es la distancia alrededor de una figura","Mide el espacio de una figura","Espacio ocupado por un cuerpo");
        
        for(figurageometrica opl: figura){
            System.out.println(opl.datos());
            System.out.println(" ");
            
        }
        
    }
}
