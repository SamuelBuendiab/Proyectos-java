public class principal {

        public static void main(String[] args) {
            
            
            datos usuario[] = new datos[2];
            usuario[0] = new datos("Juan Marco","Hernandes Rodrigues","Mecatronica",18);
            usuario[1] = new datos2("Diurno","Tunjuelito","Laura Maria","Benavides Pulido","Cine y television",20);
            
            for(datos op1: usuario){
                System.out.println(op1.mostrardatos());
                System.out.println("");
            }
        }
    
    


}