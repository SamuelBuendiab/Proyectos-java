
package ACT2;

public class rectangulo extends figurageometrica {
    private int vertice,largo;

    public rectangulo(int vertice, int largo, String perimetro, String area, String volumen) {
        super(perimetro, area, volumen);
        this.vertice = vertice;
        this.largo = largo;
    }

    public int getVertice() {
        return vertice;
    }

    public int getLargo() {
        return largo;
    }
    
            @Override
        public String datos(){
        System.out.println("Rectangulo");
        return"Perimetro: "+perimetro+"\nArea: "+area+"\nVolumen"+volumen+"\nVertice: "+vertice+"\nLargo: "+largo;
    }
   
    
}
